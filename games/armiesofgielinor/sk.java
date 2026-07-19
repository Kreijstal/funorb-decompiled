/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sk implements pa {
    private lf[] field_s;
    static String field_N;
    private v field_B;
    static jp field_G;
    static kl field_M;
    wk field_H;
    private boolean field_d;
    private vb field_k;
    private ha field_x;
    private boolean field_o;
    private int field_a;
    private lf[] field_i;
    wk field_A;
    private int field_I;
    private int field_e;
    private int[] field_l;
    private int field_g;
    private int field_n;
    private int field_J;
    private int field_O;
    private km[] field_D;
    private int field_u;
    private int field_v;
    private boolean field_m;
    private int field_p;
    private boolean field_h;
    static int[][] field_j;
    private boolean field_q;
    private int[] field_b;
    private int field_y;
    private int field_c;
    private int field_C;
    private int field_F;
    private boolean field_P;
    private int field_t;
    private int field_L;
    private int field_w;
    private boolean field_E;
    private int field_r;
    private int field_z;
    private boolean field_f;

    private final void m(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (!this.field_i[0].field_d) {
              L1: {
                var2_int = 0;
                if (param0 == -13146) {
                  break L1;
                } else {
                  this.field_I = 30;
                  break L1;
                }
              }
              L2: while (true) {
                L3: {
                  L4: {
                    if ((-this.field_J + 3 ^ -1) >= (var2_int ^ -1)) {
                      break L4;
                    } else {
                      if (var3 != 0) {
                        break L3;
                      } else {
                        L5: {
                          if (this.field_s[var2_int] == null) {
                            break L5;
                          } else {
                            if (!this.field_s[var2_int].b((byte) 44)) {
                              break L5;
                            } else {
                              this.field_s[var2_int].field_m = ns.a(false, 20, vv.field_b);
                              this.field_s[var2_int].field_f = 1;
                              break L5;
                            }
                          }
                        }
                        var2_int++;
                        if (var3 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  break L3;
                }
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
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) runtimeException), "sk.OA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(lf[] param0, int param1, int param2, lf[] param3, boolean param4) {
        RuntimeException var6 = null;
        int[] var6_array = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_146_0 = null;
        StringBuilder stackIn_146_1 = null;
        RuntimeException stackIn_148_0 = null;
        StringBuilder stackIn_148_1 = null;
        RuntimeException stackIn_149_0 = null;
        StringBuilder stackIn_149_1 = null;
        String stackIn_149_2 = null;
        RuntimeException stackIn_150_0 = null;
        StringBuilder stackIn_150_1 = null;
        RuntimeException stackIn_152_0 = null;
        StringBuilder stackIn_152_1 = null;
        RuntimeException stackIn_153_0 = null;
        StringBuilder stackIn_153_1 = null;
        String stackIn_153_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_145_0 = null;
        StringBuilder stackOut_145_1 = null;
        RuntimeException stackOut_148_0 = null;
        StringBuilder stackOut_148_1 = null;
        String stackOut_148_2 = null;
        RuntimeException stackOut_146_0 = null;
        StringBuilder stackOut_146_1 = null;
        String stackOut_146_2 = null;
        RuntimeException stackOut_149_0 = null;
        StringBuilder stackOut_149_1 = null;
        RuntimeException stackOut_152_0 = null;
        StringBuilder stackOut_152_1 = null;
        String stackOut_152_2 = null;
        RuntimeException stackOut_150_0 = null;
        StringBuilder stackOut_150_1 = null;
        String stackOut_150_2 = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_array = new int[-param1 + 3];
              var7 = 0;
              if ((param1 ^ -1) == -3) {
                break L1;
              } else {
                L2: {
                  L3: {
                    if ((param1 ^ -1) == -2) {
                      break L3;
                    } else {
                      if (-1 != (param1 ^ -1)) {
                        break L2;
                      } else {
                        L4: {
                          if (null == param0[0]) {
                            break L4;
                          } else {
                            if (!param0[0].b(2166)) {
                              break L4;
                            } else {
                              if (param3[0] != null) {
                                break L4;
                              } else {
                                L5: {
                                  if (1 != param2) {
                                    break L5;
                                  } else {
                                    if (param3[1] != null) {
                                      break L4;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                                var6_array[var7] = 0;
                                var7++;
                                break L4;
                              }
                            }
                          }
                        }
                        L6: {
                          if (param0[1] == null) {
                            break L6;
                          } else {
                            if (param0[1].b(2166)) {
                              L7: {
                                if (0 == param2) {
                                  break L7;
                                } else {
                                  if (null != param3[0]) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              L8: {
                                if (-1 != (param2 ^ -1)) {
                                  break L8;
                                } else {
                                  if (null == param3[1]) {
                                    break L8;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              var6_array[var7] = 1;
                              var7++;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                        }
                        if (null == param0[2]) {
                          break L2;
                        } else {
                          if (!param0[2].b(2166)) {
                            break L2;
                          } else {
                            L9: {
                              if (-3 != (param2 ^ -1)) {
                                break L9;
                              } else {
                                if (param3[0] != null) {
                                  break L2;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            L10: {
                              if (1 != param2) {
                                break L10;
                              } else {
                                if (param3[1] != null) {
                                  break L2;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            L11: {
                              if ((param2 ^ -1) != -1) {
                                break L11;
                              } else {
                                if (param3[2] != null) {
                                  break L2;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            var6_array[var7] = 2;
                            var7++;
                            if (var10 == 0) {
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                  }
                  L12: {
                    if (null == param0[0]) {
                      break L12;
                    } else {
                      if (!param0[0].b(2166)) {
                        break L12;
                      } else {
                        if (param3[0] != null) {
                          break L12;
                        } else {
                          L13: {
                            if (-1 != (param2 ^ -1)) {
                              break L13;
                            } else {
                              if (param3[1] != null) {
                                break L12;
                              } else {
                                break L13;
                              }
                            }
                          }
                          var6_array[var7] = 0;
                          var7++;
                          break L12;
                        }
                      }
                    }
                  }
                  if (null == param0[1]) {
                    break L2;
                  } else {
                    if (!param0[1].b(2166)) {
                      break L2;
                    } else {
                      if (null != param3[0]) {
                        break L2;
                      } else {
                        L14: {
                          if (0 != param2) {
                            break L14;
                          } else {
                            if (null == param3[2]) {
                              break L14;
                            } else {
                              break L2;
                            }
                          }
                        }
                        var6_array[var7] = 1;
                        var7++;
                        if (var10 == 0) {
                          break L2;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
                if (var7 != 0) {
                  L15: {
                    var8 = -1;
                    if (param4) {
                      break L15;
                    } else {
                      this.field_C = -127;
                      break L15;
                    }
                  }
                  L16: {
                    L17: {
                      L18: {
                        var9 = var6_array[ns.a(false, var7, vv.field_b)];
                        if (1 != param1) {
                          break L18;
                        } else {
                          if (param0[2] == null) {
                            break L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                      if ((param1 ^ -1) == -1) {
                        L19: {
                          if ((var9 ^ -1) == -3) {
                            break L19;
                          } else {
                            L20: {
                              if (param0[3] != null) {
                                break L20;
                              } else {
                                var8 = 3;
                                if (var10 == 0) {
                                  break L16;
                                } else {
                                  break L20;
                                }
                              }
                            }
                            if (param1 != 0) {
                              break L16;
                            } else {
                              if (param0[4] != null) {
                                break L16;
                              } else {
                                var8 = 4;
                                if (var10 == 0) {
                                  break L16;
                                } else {
                                  break L19;
                                }
                              }
                            }
                          }
                        }
                        L21: {
                          if (null != param0[4]) {
                            break L21;
                          } else {
                            var8 = 4;
                            if (var10 == 0) {
                              break L16;
                            } else {
                              break L21;
                            }
                          }
                        }
                        if (0 != param1) {
                          break L16;
                        } else {
                          if (param0[3] != null) {
                            break L16;
                          } else {
                            var8 = 3;
                            if (var10 == 0) {
                              break L16;
                            } else {
                              break L17;
                            }
                          }
                        }
                      } else {
                        break L16;
                      }
                    }
                    var8 = 2;
                    break L16;
                  }
                  L22: {
                    if (var8 <= -1) {
                      break L22;
                    } else {
                      param0[var8] = param0[var9];
                      param0[var9] = null;
                      param0[var8].field_j = tn.field_W[param1][var8];
                      param0[var8].field_p = kw.field_P[param1][var8];
                      break L22;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var6 = decompiledCaughtException;
            stackOut_145_0 = (RuntimeException) (var6);
            stackOut_145_1 = new StringBuilder().append("sk.B(");
            stackIn_148_0 = stackOut_145_0;
            stackIn_148_1 = stackOut_145_1;
            stackIn_146_0 = stackOut_145_0;
            stackIn_146_1 = stackOut_145_1;
            if (param0 == null) {
              stackOut_148_0 = (RuntimeException) ((Object) stackIn_148_0);
              stackOut_148_1 = (StringBuilder) ((Object) stackIn_148_1);
              stackOut_148_2 = "null";
              stackIn_149_0 = stackOut_148_0;
              stackIn_149_1 = stackOut_148_1;
              stackIn_149_2 = stackOut_148_2;
              break L23;
            } else {
              stackOut_146_0 = (RuntimeException) ((Object) stackIn_146_0);
              stackOut_146_1 = (StringBuilder) ((Object) stackIn_146_1);
              stackOut_146_2 = "{...}";
              stackIn_149_0 = stackOut_146_0;
              stackIn_149_1 = stackOut_146_1;
              stackIn_149_2 = stackOut_146_2;
              break L23;
            }
          }
          L24: {
            stackOut_149_0 = (RuntimeException) ((Object) stackIn_149_0);
            stackOut_149_1 = ((StringBuilder) (Object) stackIn_149_1).append(stackIn_149_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_152_0 = stackOut_149_0;
            stackIn_152_1 = stackOut_149_1;
            stackIn_150_0 = stackOut_149_0;
            stackIn_150_1 = stackOut_149_1;
            if (param3 == null) {
              stackOut_152_0 = (RuntimeException) ((Object) stackIn_152_0);
              stackOut_152_1 = (StringBuilder) ((Object) stackIn_152_1);
              stackOut_152_2 = "null";
              stackIn_153_0 = stackOut_152_0;
              stackIn_153_1 = stackOut_152_1;
              stackIn_153_2 = stackOut_152_2;
              break L24;
            } else {
              stackOut_150_0 = (RuntimeException) ((Object) stackIn_150_0);
              stackOut_150_1 = (StringBuilder) ((Object) stackIn_150_1);
              stackOut_150_2 = "{...}";
              stackIn_153_0 = stackOut_150_0;
              stackIn_153_1 = stackOut_150_1;
              stackIn_153_2 = stackOut_150_2;
              break L24;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_153_0), stackIn_153_2 + ',' + param4 + ')');
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

    private final void a(lf[] param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -4925) {
                break L1;
              } else {
                sk.c(-81);
                break L1;
              }
            }
            var3_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if ((var3_int ^ -1) <= (param0.length ^ -1)) {
                    break L4;
                  } else {
                    if (var4 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (null == param0[var3_int]) {
                          break L5;
                        } else {
                          if (!param0[var3_int].b((byte) 121)) {
                            break L5;
                          } else {
                            param0[var3_int].field_f = 5;
                            param0[var3_int].field_m = ns.a(false, 20, vv.field_b);
                            break L5;
                          }
                        }
                      }
                      var3_int++;
                      if (var4 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var3);
            stackOut_17_1 = new StringBuilder().append("sk.GA(");
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, lf[] param1, byte param2) {
        int incrementValue$1 = 0;
        RuntimeException var4 = null;
        int var4_int = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        lf stackIn_13_0 = null;
        Object stackIn_22_0 = null;
        lf stackIn_22_1 = null;
        Object stackIn_28_0 = null;
        lf stackIn_28_1 = null;
        lf stackIn_43_0 = null;
        Object stackIn_55_0 = null;
        lf stackIn_55_1 = null;
        lf stackIn_58_0 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        lf stackOut_12_0 = null;
        Object stackOut_21_0 = null;
        lf stackOut_21_1 = null;
        Object stackOut_27_0 = null;
        lf stackOut_27_1 = null;
        lf stackOut_56_0 = null;
        Object stackOut_53_0 = null;
        lf stackOut_53_1 = null;
        lf stackOut_42_0 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param2 == 83) {
              param0 = 0;
              var4_int = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if ((var4_int ^ -1) <= (param1.length ^ -1)) {
                      break L3;
                    } else {
                      param0++;
                      var4_int++;
                      if (var9 != 0) {
                        break L2;
                      } else {
                        if (var9 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  var4_int = 0;
                  break L2;
                }
                var5 = new int[param0];
                var6 = 0;
                L4: while (true) {
                  L5: {
                    L6: {
                      L7: {
                        L8: {
                          if (var6 >= param1.length) {
                            break L8;
                          } else {
                            stackOut_12_0 = param1[var6];
                            stackIn_58_0 = stackOut_12_0;
                            stackIn_13_0 = stackOut_12_0;
                            if (var9 != 0) {
                              break L7;
                            } else {
                              L9: {
                                if (stackIn_13_0 != null) {
                                  incrementValue$1 = var4_int;
                                  var4_int++;
                                  var5[incrementValue$1] = var6;
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              var6++;
                              if (var9 == 0) {
                                continue L4;
                              } else {
                                break L8;
                              }
                            }
                          }
                        }
                        param0 = var4_int;
                        var6 = 0;
                        L10: while (true) {
                          L11: {
                            if (param0 <= var6) {
                              break L11;
                            } else {
                              L12: {
                                var7 = var6;
                                stackOut_21_0 = null;
                                stackOut_21_1 = param1[var5[var7]];
                                stackIn_55_0 = stackOut_21_0;
                                stackIn_55_1 = stackOut_21_1;
                                stackIn_22_0 = stackOut_21_0;
                                stackIn_22_1 = stackOut_21_1;
                                if (var9 != 0) {
                                  break L12;
                                } else {
                                  L13: {
                                    if (stackIn_22_0 == stackIn_22_1) {
                                      break L13;
                                    } else {
                                      var8 = var6 + 1;
                                      L14: while (true) {
                                        L15: {
                                          if (var8 >= param0) {
                                            break L15;
                                          } else {
                                            stackOut_27_0 = null;
                                            stackOut_27_1 = param1[var5[var8]];
                                            stackIn_55_0 = stackOut_27_0;
                                            stackIn_55_1 = stackOut_27_1;
                                            stackIn_28_0 = stackOut_27_0;
                                            stackIn_28_1 = stackOut_27_1;
                                            if (var9 != 0) {
                                              break L12;
                                            } else {
                                              L16: {
                                                if (stackIn_28_0 == stackIn_28_1) {
                                                  break L16;
                                                } else {
                                                  if ((param1[var5[var8]].field_s ^ -1) >= (param1[var5[var7]].field_s ^ -1)) {
                                                    break L16;
                                                  } else {
                                                    var7 = var8;
                                                    break L16;
                                                  }
                                                }
                                              }
                                              var8++;
                                              if (var9 == 0) {
                                                continue L14;
                                              } else {
                                                break L15;
                                              }
                                            }
                                          }
                                        }
                                        if (var7 == var6) {
                                          break L13;
                                        } else {
                                          var8 = var5[var7];
                                          var5[var7] = var5[var6];
                                          var5[var6] = var8;
                                          break L13;
                                        }
                                      }
                                    }
                                  }
                                  var6++;
                                  if (var9 == 0) {
                                    continue L10;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              L17: while (true) {
                                L18: {
                                  if (stackIn_55_0 == stackIn_55_1) {
                                    break L18;
                                  } else {
                                    stackOut_56_0 = param1[var5[var6]];
                                    stackIn_58_0 = stackOut_56_0;
                                    ((lf) (Object) stackIn_58_0).a(this.field_C, param2 ^ -56, false);
                                    break L18;
                                  }
                                }
                                var6++;
                                if (var9 == 0) {
                                  if ((param0 ^ -1) >= (var6 ^ -1)) {
                                    break L6;
                                  } else {
                                    if (var9 != 0) {
                                      break L5;
                                    } else {
                                      stackOut_53_0 = null;
                                      stackOut_53_1 = param1[var5[var6]];
                                      stackIn_55_0 = stackOut_53_0;
                                      stackIn_55_1 = stackOut_53_1;
                                      continue L17;
                                    }
                                  }
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          L19: {
                            if (!cu.field_a) {
                              break L19;
                            } else {
                              var6 = 0;
                              L20: while (true) {
                                L21: {
                                  if (var6 >= param0) {
                                    break L21;
                                  } else {
                                    stackOut_42_0 = param1[var5[var6]];
                                    stackIn_58_0 = stackOut_42_0;
                                    stackIn_43_0 = stackOut_42_0;
                                    if (var9 != 0) {
                                      break L7;
                                    } else {
                                      L22: {
                                        if (stackIn_43_0 == null) {
                                          break L22;
                                        } else {
                                          param1[var5[var6]].a(this.field_C, -84, true);
                                          break L22;
                                        }
                                      }
                                      var6++;
                                      if (var9 == 0) {
                                        continue L20;
                                      } else {
                                        break L21;
                                      }
                                    }
                                  }
                                }
                                this.a((byte) 104, 0, 0, 128);
                                break L19;
                              }
                            }
                          }
                          var6 = 0;
                          L23: while (true) {
                            if ((param0 ^ -1) >= (var6 ^ -1)) {
                              break L6;
                            } else {
                              if (var9 != 0) {
                                break L5;
                              } else {
                                stackOut_53_0 = null;
                                stackOut_53_1 = param1[var5[var6]];
                                stackIn_55_0 = stackOut_53_0;
                                stackIn_55_1 = stackOut_53_1;
                                L24: {
                                  if (stackIn_55_0 == stackIn_55_1) {
                                    break L24;
                                  } else {
                                    stackOut_56_0 = param1[var5[var6]];
                                    stackIn_58_0 = stackOut_56_0;
                                    ((lf) (Object) stackIn_58_0).a(this.field_C, param2 ^ -56, false);
                                    break L24;
                                  }
                                }
                                var6++;
                                if (var9 == 0) {
                                  continue L23;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                        }
                      }
                      L25: while (true) {
                        ((lf) (Object) stackIn_58_0).a(this.field_C, param2 ^ -56, false);
                        L26: while (true) {
                          var6++;
                          if (var9 == 0) {
                            if ((param0 ^ -1) >= (var6 ^ -1)) {
                              break L6;
                            } else {
                              if (var9 != 0) {
                                break L5;
                              } else {
                                stackOut_53_0 = null;
                                stackOut_53_1 = param1[var5[var6]];
                                stackIn_55_0 = stackOut_53_0;
                                stackIn_55_1 = stackOut_53_1;
                                if (stackIn_55_0 == stackIn_55_1) {
                                  continue L26;
                                } else {
                                  stackOut_56_0 = param1[var5[var6]];
                                  stackIn_58_0 = stackOut_56_0;
                                  continue L25;
                                }
                              }
                            }
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    break L5;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L27: {
            var4 = decompiledCaughtException;
            stackOut_61_0 = (RuntimeException) (var4);
            stackOut_61_1 = new StringBuilder().append("sk.F(").append(param0).append(',');
            stackIn_64_0 = stackOut_61_0;
            stackIn_64_1 = stackOut_61_1;
            stackIn_62_0 = stackOut_61_0;
            stackIn_62_1 = stackOut_61_1;
            if (param1 == null) {
              stackOut_64_0 = (RuntimeException) ((Object) stackIn_64_0);
              stackOut_64_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackOut_64_2 = "null";
              stackIn_65_0 = stackOut_64_0;
              stackIn_65_1 = stackOut_64_1;
              stackIn_65_2 = stackOut_64_2;
              break L27;
            } else {
              stackOut_62_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackOut_62_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackOut_62_2 = "{...}";
              stackIn_65_0 = stackOut_62_0;
              stackIn_65_1 = stackOut_62_1;
              stackIn_65_2 = stackOut_62_2;
              break L27;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_65_0), stackIn_65_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final boolean b(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_7_0 = false;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (null != u.field_p) {
              if (param0 < -25) {
                stackOut_6_0 = u.field_p.a((byte) -106);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "sk.I(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    public final boolean a(oj param0, byte param1) {
        boolean discarded$1 = false;
        RuntimeException var3 = null;
        ag var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        jd var6_ref = null;
        jd var7 = null;
        String var8_ref_String = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_32_0 = 0;
        Object stackIn_34_0 = null;
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        Object stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        Object stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        Object stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int stackIn_41_2 = 0;
        Object stackIn_51_0 = null;
        Object stackIn_52_0 = null;
        Object stackIn_54_0 = null;
        Object stackIn_56_0 = null;
        Object stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        Object stackIn_64_0 = null;
        Object stackIn_66_0 = null;
        Object stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        Object stackIn_68_0 = null;
        Object stackIn_70_0 = null;
        Object stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        Object stackIn_81_0 = null;
        Object stackIn_82_0 = null;
        Object stackIn_84_0 = null;
        Object stackIn_86_0 = null;
        Object stackIn_87_0 = null;
        int stackIn_87_1 = 0;
        Object stackIn_189_0 = null;
        Object stackIn_191_0 = null;
        Object stackIn_192_0 = null;
        int stackIn_192_1 = 0;
        lf[] stackIn_200_0 = null;
        int stackIn_200_1 = 0;
        lf[] stackIn_201_0 = null;
        int stackIn_201_1 = 0;
        lf stackIn_201_2 = null;
        lf stackIn_201_3 = null;
        int stackIn_201_4 = 0;
        int stackIn_201_5 = 0;
        int stackIn_201_6 = 0;
        int stackIn_201_7 = 0;
        boolean stackIn_201_8 = false;
        lf[] stackIn_203_0 = null;
        int stackIn_203_1 = 0;
        lf stackIn_203_2 = null;
        lf stackIn_203_3 = null;
        int stackIn_203_4 = 0;
        int stackIn_203_5 = 0;
        int stackIn_203_6 = 0;
        int stackIn_203_7 = 0;
        boolean stackIn_203_8 = false;
        lf[] stackIn_204_0 = null;
        int stackIn_204_1 = 0;
        lf stackIn_204_2 = null;
        lf stackIn_204_3 = null;
        int stackIn_204_4 = 0;
        int stackIn_204_5 = 0;
        int stackIn_204_6 = 0;
        int stackIn_204_7 = 0;
        boolean stackIn_204_8 = false;
        lf[] stackIn_205_0 = null;
        int stackIn_205_1 = 0;
        lf stackIn_205_2 = null;
        lf stackIn_205_3 = null;
        int stackIn_205_4 = 0;
        int stackIn_205_5 = 0;
        int stackIn_205_6 = 0;
        int stackIn_205_7 = 0;
        boolean stackIn_205_8 = false;
        int stackIn_205_9 = 0;
        lf[] stackIn_210_0 = null;
        int stackIn_210_1 = 0;
        lf[] stackIn_211_0 = null;
        int stackIn_211_1 = 0;
        lf stackIn_211_2 = null;
        lf stackIn_211_3 = null;
        int stackIn_211_4 = 0;
        int stackIn_211_5 = 0;
        int stackIn_211_6 = 0;
        int stackIn_211_7 = 0;
        boolean stackIn_211_8 = false;
        lf[] stackIn_213_0 = null;
        int stackIn_213_1 = 0;
        lf stackIn_213_2 = null;
        lf stackIn_213_3 = null;
        int stackIn_213_4 = 0;
        int stackIn_213_5 = 0;
        int stackIn_213_6 = 0;
        int stackIn_213_7 = 0;
        boolean stackIn_213_8 = false;
        lf[] stackIn_214_0 = null;
        int stackIn_214_1 = 0;
        lf stackIn_214_2 = null;
        lf stackIn_214_3 = null;
        int stackIn_214_4 = 0;
        int stackIn_214_5 = 0;
        int stackIn_214_6 = 0;
        int stackIn_214_7 = 0;
        boolean stackIn_214_8 = false;
        lf[] stackIn_215_0 = null;
        int stackIn_215_1 = 0;
        lf stackIn_215_2 = null;
        lf stackIn_215_3 = null;
        int stackIn_215_4 = 0;
        int stackIn_215_5 = 0;
        int stackIn_215_6 = 0;
        int stackIn_215_7 = 0;
        boolean stackIn_215_8 = false;
        int stackIn_215_9 = 0;
        lf[] stackIn_227_0 = null;
        int stackIn_227_1 = 0;
        Object stackIn_232_0 = null;
        Object stackIn_234_0 = null;
        Object stackIn_235_0 = null;
        int stackIn_235_1 = 0;
        int stackIn_267_0 = 0;
        RuntimeException stackIn_269_0 = null;
        StringBuilder stackIn_269_1 = null;
        RuntimeException stackIn_271_0 = null;
        StringBuilder stackIn_271_1 = null;
        RuntimeException stackIn_272_0 = null;
        StringBuilder stackIn_272_1 = null;
        String stackIn_272_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_33_0 = null;
        Object stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        Object stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        Object stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        int stackOut_40_2 = 0;
        Object stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        int stackOut_38_2 = 0;
        Object stackOut_50_0 = null;
        Object stackOut_51_0 = null;
        Object stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        Object stackOut_52_0 = null;
        Object stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        Object stackOut_63_0 = null;
        Object stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        Object stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        Object stackOut_67_0 = null;
        Object stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        Object stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        Object stackOut_80_0 = null;
        Object stackOut_81_0 = null;
        Object stackOut_86_0 = null;
        int stackOut_86_1 = 0;
        Object stackOut_82_0 = null;
        Object stackOut_84_0 = null;
        int stackOut_84_1 = 0;
        Object stackOut_188_0 = null;
        Object stackOut_191_0 = null;
        int stackOut_191_1 = 0;
        Object stackOut_189_0 = null;
        int stackOut_189_1 = 0;
        lf[] stackOut_199_0 = null;
        int stackOut_199_1 = 0;
        lf[] stackOut_200_0 = null;
        int stackOut_200_1 = 0;
        lf stackOut_200_2 = null;
        lf stackOut_200_3 = null;
        int stackOut_200_4 = 0;
        int stackOut_200_5 = 0;
        int stackOut_200_6 = 0;
        int stackOut_200_7 = 0;
        boolean stackOut_200_8 = false;
        lf[] stackOut_204_0 = null;
        int stackOut_204_1 = 0;
        lf stackOut_204_2 = null;
        lf stackOut_204_3 = null;
        int stackOut_204_4 = 0;
        int stackOut_204_5 = 0;
        int stackOut_204_6 = 0;
        int stackOut_204_7 = 0;
        boolean stackOut_204_8 = false;
        int stackOut_204_9 = 0;
        lf[] stackOut_201_0 = null;
        int stackOut_201_1 = 0;
        lf stackOut_201_2 = null;
        lf stackOut_201_3 = null;
        int stackOut_201_4 = 0;
        int stackOut_201_5 = 0;
        int stackOut_201_6 = 0;
        int stackOut_201_7 = 0;
        boolean stackOut_201_8 = false;
        lf[] stackOut_203_0 = null;
        int stackOut_203_1 = 0;
        lf stackOut_203_2 = null;
        lf stackOut_203_3 = null;
        int stackOut_203_4 = 0;
        int stackOut_203_5 = 0;
        int stackOut_203_6 = 0;
        int stackOut_203_7 = 0;
        boolean stackOut_203_8 = false;
        int stackOut_203_9 = 0;
        lf[] stackOut_209_0 = null;
        int stackOut_209_1 = 0;
        lf[] stackOut_210_0 = null;
        int stackOut_210_1 = 0;
        lf stackOut_210_2 = null;
        lf stackOut_210_3 = null;
        int stackOut_210_4 = 0;
        int stackOut_210_5 = 0;
        int stackOut_210_6 = 0;
        int stackOut_210_7 = 0;
        boolean stackOut_210_8 = false;
        lf[] stackOut_214_0 = null;
        int stackOut_214_1 = 0;
        lf stackOut_214_2 = null;
        lf stackOut_214_3 = null;
        int stackOut_214_4 = 0;
        int stackOut_214_5 = 0;
        int stackOut_214_6 = 0;
        int stackOut_214_7 = 0;
        boolean stackOut_214_8 = false;
        int stackOut_214_9 = 0;
        lf[] stackOut_211_0 = null;
        int stackOut_211_1 = 0;
        lf stackOut_211_2 = null;
        lf stackOut_211_3 = null;
        int stackOut_211_4 = 0;
        int stackOut_211_5 = 0;
        int stackOut_211_6 = 0;
        int stackOut_211_7 = 0;
        boolean stackOut_211_8 = false;
        lf[] stackOut_213_0 = null;
        int stackOut_213_1 = 0;
        lf stackOut_213_2 = null;
        lf stackOut_213_3 = null;
        int stackOut_213_4 = 0;
        int stackOut_213_5 = 0;
        int stackOut_213_6 = 0;
        int stackOut_213_7 = 0;
        boolean stackOut_213_8 = false;
        int stackOut_213_9 = 0;
        lf[] stackOut_226_0 = null;
        int stackOut_226_1 = 0;
        Object stackOut_231_0 = null;
        Object stackOut_234_0 = null;
        int stackOut_234_1 = 0;
        Object stackOut_232_0 = null;
        int stackOut_232_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_266_0 = 0;
        RuntimeException stackOut_268_0 = null;
        StringBuilder stackOut_268_1 = null;
        RuntimeException stackOut_271_0 = null;
        StringBuilder stackOut_271_1 = null;
        String stackOut_271_2 = null;
        RuntimeException stackOut_269_0 = null;
        StringBuilder stackOut_269_1 = null;
        String stackOut_269_2 = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (1 == param0.field_m) {
                L2: {
                  var3_ref = (ag) ((Object) param0);
                  var4 = this.field_x.field_v * var3_ref.field_G + var3_ref.field_Q;
                  var5 = var3_ref.field_F + (var4 + var3_ref.field_B * this.field_x.field_v);
                  stackOut_4_0 = this;
                  stackIn_7_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (var3_ref.field_B * var3_ref.field_B + var3_ref.field_F * var3_ref.field_F <= 1) {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    break L2;
                  } else {
                    stackOut_5_0 = this;
                    stackOut_5_1 = 1;
                    stackIn_8_0 = stackOut_5_0;
                    stackIn_8_1 = stackOut_5_1;
                    break L2;
                  }
                }
                L3: {
                  ((sk) (this)).field_d = stackIn_8_1 != 0;
                  if (-1 < (var4 ^ -1)) {
                    break L3;
                  } else {
                    if (var4 >= this.field_x.field_Eb.length) {
                      break L3;
                    } else {
                      if (var5 < 0) {
                        break L3;
                      } else {
                        if ((var5 ^ -1) > (this.field_x.field_Eb.length ^ -1)) {
                          L4: {
                            var6_ref = this.field_x.field_Eb[var4].field_c;
                            var7 = this.field_x.field_Eb[var5].field_c;
                            if (var6_ref == null) {
                              break L4;
                            } else {
                              if (var7 == null) {
                                break L4;
                              } else {
                                L5: {
                                  this.field_k.field_x = var4;
                                  this.b((byte) 54, this.field_x.field_hb);
                                  this.field_g = -1;
                                  this.field_e = -1;
                                  var8 = var6_ref.field_A + var6_ref.field_Y;
                                  var9 = var6_ref.field_t - -var6_ref.field_A;
                                  this.field_e = var6_ref.field_O;
                                  this.field_J = bw.field_m[var6_ref.field_N][9];
                                  stackOut_33_0 = this;
                                  stackIn_36_0 = stackOut_33_0;
                                  stackIn_34_0 = stackOut_33_0;
                                  if (0 < vu.field_N[this.field_J] * var8 % var9) {
                                    stackOut_36_0 = this;
                                    stackOut_36_1 = 1;
                                    stackIn_37_0 = stackOut_36_0;
                                    stackIn_37_1 = stackOut_36_1;
                                    break L5;
                                  } else {
                                    stackOut_34_0 = this;
                                    stackOut_34_1 = 0;
                                    stackIn_37_0 = stackOut_34_0;
                                    stackIn_37_1 = stackOut_34_1;
                                    break L5;
                                  }
                                }
                                L6: {
                                  ((sk) (this)).field_y = stackIn_37_1 + var8 * vu.field_N[this.field_J] / var9;
                                  stackOut_37_0 = this;
                                  stackOut_37_1 = this.field_y + -(vu.field_N[this.field_J] * (var8 + -var3_ref.field_R) / var9);
                                  stackIn_40_0 = stackOut_37_0;
                                  stackIn_40_1 = stackOut_37_1;
                                  stackIn_38_0 = stackOut_37_0;
                                  stackIn_38_1 = stackOut_37_1;
                                  if (-1 > ((-var3_ref.field_R + var8) * vu.field_N[this.field_J] % var9 ^ -1)) {
                                    stackOut_40_0 = this;
                                    stackOut_40_1 = stackIn_40_1;
                                    stackOut_40_2 = 1;
                                    stackIn_41_0 = stackOut_40_0;
                                    stackIn_41_1 = stackOut_40_1;
                                    stackIn_41_2 = stackOut_40_2;
                                    break L6;
                                  } else {
                                    stackOut_38_0 = this;
                                    stackOut_38_1 = stackIn_38_1;
                                    stackOut_38_2 = 0;
                                    stackIn_41_0 = stackOut_38_0;
                                    stackIn_41_1 = stackOut_38_1;
                                    stackIn_41_2 = stackOut_38_2;
                                    break L6;
                                  }
                                }
                                L7: {
                                  L8: {
                                    ((sk) (this)).field_v = stackIn_41_1 + -stackIn_41_2;
                                    if (-8 == (var6_ref.field_P ^ -1)) {
                                      break L8;
                                    } else {
                                      if (-9 != (var6_ref.field_P ^ -1)) {
                                        break L7;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                  this.field_v = 0;
                                  break L7;
                                }
                                L9: {
                                  this.field_c = var6_ref.field_N;
                                  if (this.field_v <= this.field_y) {
                                    break L9;
                                  } else {
                                    this.field_v = this.field_y;
                                    break L9;
                                  }
                                }
                                L10: {
                                  L11: {
                                    stackOut_50_0 = this;
                                    stackIn_54_0 = stackOut_50_0;
                                    stackIn_51_0 = stackOut_50_0;
                                    if (var6_ref.g(0) == 3) {
                                      break L11;
                                    } else {
                                      stackOut_51_0 = this;
                                      stackIn_56_0 = stackOut_51_0;
                                      stackIn_52_0 = stackOut_51_0;
                                      if (-8 != (var7.field_N ^ -1)) {
                                        stackOut_56_0 = this;
                                        stackOut_56_1 = 0;
                                        stackIn_57_0 = stackOut_56_0;
                                        stackIn_57_1 = stackOut_56_1;
                                        break L10;
                                      } else {
                                        stackOut_52_0 = this;
                                        stackIn_54_0 = stackOut_52_0;
                                        break L11;
                                      }
                                    }
                                  }
                                  stackOut_54_0 = this;
                                  stackOut_54_1 = 1;
                                  stackIn_57_0 = stackOut_54_0;
                                  stackIn_57_1 = stackOut_54_1;
                                  break L10;
                                }
                                L12: {
                                  ((sk) (this)).field_E = stackIn_57_1 != 0;
                                  var8 = var7.field_Y - -var7.field_A;
                                  var9 = var7.field_A + var7.field_t;
                                  if ((var7.field_N ^ -1) != -35) {
                                    break L12;
                                  } else {
                                    if (!var7.field_W) {
                                      break L12;
                                    } else {
                                      this.field_q = true;
                                      break L12;
                                    }
                                  }
                                }
                                L13: {
                                  this.field_g = var7.field_O;
                                  this.field_u = bw.field_m[var7.field_N][9];
                                  stackOut_63_0 = this;
                                  stackIn_66_0 = stackOut_63_0;
                                  stackIn_64_0 = stackOut_63_0;
                                  if (-1 <= (vu.field_N[this.field_u] * var8 % var9 ^ -1)) {
                                    stackOut_66_0 = this;
                                    stackOut_66_1 = 0;
                                    stackIn_67_0 = stackOut_66_0;
                                    stackIn_67_1 = stackOut_66_1;
                                    break L13;
                                  } else {
                                    stackOut_64_0 = this;
                                    stackOut_64_1 = 1;
                                    stackIn_67_0 = stackOut_64_0;
                                    stackIn_67_1 = stackOut_64_1;
                                    break L13;
                                  }
                                }
                                L14: {
                                  ((sk) (this)).field_w = stackIn_67_1 + var8 * vu.field_N[this.field_u] / var9;
                                  stackOut_67_0 = this;
                                  stackIn_70_0 = stackOut_67_0;
                                  stackIn_68_0 = stackOut_67_0;
                                  if (0 >= (var8 - var3_ref.field_K) * vu.field_N[this.field_u] % var9) {
                                    stackOut_70_0 = this;
                                    stackOut_70_1 = 0;
                                    stackIn_71_0 = stackOut_70_0;
                                    stackIn_71_1 = stackOut_70_1;
                                    break L14;
                                  } else {
                                    stackOut_68_0 = this;
                                    stackOut_68_1 = 1;
                                    stackIn_71_0 = stackOut_68_0;
                                    stackIn_71_1 = stackOut_68_1;
                                    break L14;
                                  }
                                }
                                L15: {
                                  L16: {
                                    ((sk) (this)).field_O = -stackIn_71_1 - ((var8 - var3_ref.field_K) * vu.field_N[this.field_u] / var9 - this.field_w);
                                    if (-8 == (var7.field_P ^ -1)) {
                                      break L16;
                                    } else {
                                      if (var7.field_P != 8) {
                                        break L15;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                  this.field_O = 0;
                                  break L15;
                                }
                                L17: {
                                  if (this.field_w >= this.field_O) {
                                    break L17;
                                  } else {
                                    this.field_O = this.field_w;
                                    break L17;
                                  }
                                }
                                L18: {
                                  L19: {
                                    this.field_a = var7.field_N;
                                    stackOut_80_0 = this;
                                    stackIn_84_0 = stackOut_80_0;
                                    stackIn_81_0 = stackOut_80_0;
                                    if ((var7.g(0) ^ -1) == -4) {
                                      break L19;
                                    } else {
                                      stackOut_81_0 = this;
                                      stackIn_86_0 = stackOut_81_0;
                                      stackIn_82_0 = stackOut_81_0;
                                      if (7 != var7.field_N) {
                                        stackOut_86_0 = this;
                                        stackOut_86_1 = 0;
                                        stackIn_87_0 = stackOut_86_0;
                                        stackIn_87_1 = stackOut_86_1;
                                        break L18;
                                      } else {
                                        stackOut_82_0 = this;
                                        stackIn_84_0 = stackOut_82_0;
                                        break L19;
                                      }
                                    }
                                  }
                                  stackOut_84_0 = this;
                                  stackOut_84_1 = 1;
                                  stackIn_87_0 = stackOut_84_0;
                                  stackIn_87_1 = stackOut_84_1;
                                  break L18;
                                }
                                L20: {
                                  L21: {
                                    ((sk) (this)).field_P = stackIn_87_1 != 0;
                                    if (this.field_d) {
                                      break L21;
                                    } else {
                                      L22: {
                                        L23: {
                                          if (!var3_ref.field_M) {
                                            break L23;
                                          } else {
                                            this.field_L = 2;
                                            if (var10 == 0) {
                                              break L22;
                                            } else {
                                              break L23;
                                            }
                                          }
                                        }
                                        L24: {
                                          if (!var3_ref.field_N) {
                                            break L24;
                                          } else {
                                            this.field_L = 3;
                                            if (var10 == 0) {
                                              break L22;
                                            } else {
                                              break L24;
                                            }
                                          }
                                        }
                                        this.field_L = 4;
                                        break L22;
                                      }
                                      this.field_n = 0;
                                      if (var10 == 0) {
                                        break L20;
                                      } else {
                                        break L21;
                                      }
                                    }
                                  }
                                  L25: {
                                    L26: {
                                      if ((this.field_c ^ -1) != -35) {
                                        break L26;
                                      } else {
                                        this.field_z = 2;
                                        if (var10 == 0) {
                                          break L25;
                                        } else {
                                          break L26;
                                        }
                                      }
                                    }
                                    L27: {
                                      if ((var6_ref.g(param1 ^ 57) ^ -1) != -4) {
                                        break L27;
                                      } else {
                                        this.field_z = 8 - -bw.field_m[var6_ref.field_N][1];
                                        if (var10 == 0) {
                                          break L25;
                                        } else {
                                          break L27;
                                        }
                                      }
                                    }
                                    L28: {
                                      if (this.field_c == 81) {
                                        break L28;
                                      } else {
                                        if (-5 == (this.field_c ^ -1)) {
                                          break L28;
                                        } else {
                                          if ((this.field_c ^ -1) == -75) {
                                            break L28;
                                          } else {
                                            L29: {
                                              if (this.field_c != 67) {
                                                break L29;
                                              } else {
                                                this.field_z = 3;
                                                if (var10 == 0) {
                                                  break L25;
                                                } else {
                                                  break L29;
                                                }
                                              }
                                            }
                                            L30: {
                                              if ((this.field_c ^ -1) != -19) {
                                                break L30;
                                              } else {
                                                this.field_z = 0;
                                                if (var10 == 0) {
                                                  break L25;
                                                } else {
                                                  break L30;
                                                }
                                              }
                                            }
                                            L31: {
                                              if ((this.field_c ^ -1) != -29) {
                                                break L31;
                                              } else {
                                                this.field_z = 5;
                                                if (var10 == 0) {
                                                  break L25;
                                                } else {
                                                  break L31;
                                                }
                                              }
                                            }
                                            if (-4 == (this.field_c ^ -1)) {
                                              this.field_z = 6;
                                              if (var10 == 0) {
                                                break L25;
                                              } else {
                                                break L28;
                                              }
                                            } else {
                                              break L25;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    this.field_z = 7;
                                    break L25;
                                  }
                                  L32: {
                                    this.field_p = this.field_O - (-ns.a(false, this.field_y, vv.field_b) - this.field_y);
                                    this.field_D = new km[this.field_p];
                                    this.field_b = this.a(this.field_w, (byte) -128);
                                    this.field_n = 5;
                                    if (var3_ref.field_M) {
                                      break L32;
                                    } else {
                                      this.field_L = 8;
                                      if (var10 == 0) {
                                        break L20;
                                      } else {
                                        break L32;
                                      }
                                    }
                                  }
                                  this.field_L = 7;
                                  break L20;
                                }
                                L33: {
                                  L34: {
                                    fn.a(this.field_d, this.field_c, param1 + -32653);
                                    fn.a(this.field_d, this.field_a, param1 ^ -32619);
                                    if (-35 != (this.field_c ^ -1)) {
                                      break L34;
                                    } else {
                                      if (!var3_ref.field_J) {
                                        break L34;
                                      } else {
                                        this.field_s = new lf[6];
                                        var8 = 0;
                                        L35: while (true) {
                                          L36: {
                                            if ((this.field_y ^ -1) >= (var8 ^ -1)) {
                                              break L36;
                                            } else {
                                              this.field_s[1 + var8] = new lf(this.field_c, true, id.field_d[var8], kr.field_F[var8], false, 0);
                                              var8++;
                                              if (var10 != 0) {
                                                break L33;
                                              } else {
                                                if (var10 == 0) {
                                                  continue L35;
                                                } else {
                                                  break L36;
                                                }
                                              }
                                            }
                                          }
                                          if (var10 == 0) {
                                            break L33;
                                          } else {
                                            break L34;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  this.field_s = new lf[vu.field_N[this.field_J]];
                                  break L33;
                                }
                                L37: {
                                  L38: {
                                    if (!this.field_q) {
                                      break L38;
                                    } else {
                                      this.field_i = new lf[6];
                                      var8 = 0;
                                      L39: while (true) {
                                        L40: {
                                          if ((this.field_w ^ -1) >= (var8 ^ -1)) {
                                            break L40;
                                          } else {
                                            this.field_i[1 + var8] = new lf(this.field_a, false, id.field_d[var8], kr.field_F[var8], false, 0);
                                            var8++;
                                            if (var10 != 0) {
                                              break L37;
                                            } else {
                                              if (var10 == 0) {
                                                continue L39;
                                              } else {
                                                break L40;
                                              }
                                            }
                                          }
                                        }
                                        if (var10 == 0) {
                                          break L37;
                                        } else {
                                          break L38;
                                        }
                                      }
                                    }
                                  }
                                  this.field_i = new lf[vu.field_N[this.field_u]];
                                  break L37;
                                }
                                L41: {
                                  if ((this.field_c ^ -1) != -35) {
                                    break L41;
                                  } else {
                                    if (!var3_ref.field_J) {
                                      break L41;
                                    } else {
                                      this.field_h = true;
                                      this.field_y = 1;
                                      this.field_c = 75;
                                      this.field_J = 2;
                                      break L41;
                                    }
                                  }
                                }
                                L42: {
                                  if (this.field_q) {
                                    L43: {
                                      this.field_a = 75;
                                      this.field_w = 1;
                                      stackOut_188_0 = this;
                                      stackIn_191_0 = stackOut_188_0;
                                      stackIn_189_0 = stackOut_188_0;
                                      if (var7.field_A + var7.field_Y > var3_ref.field_K) {
                                        stackOut_191_0 = this;
                                        stackOut_191_1 = 0;
                                        stackIn_192_0 = stackOut_191_0;
                                        stackIn_192_1 = stackOut_191_1;
                                        break L43;
                                      } else {
                                        stackOut_189_0 = this;
                                        stackOut_189_1 = 1;
                                        stackIn_192_0 = stackOut_189_0;
                                        stackIn_192_1 = stackOut_189_1;
                                        break L43;
                                      }
                                    }
                                    ((sk) (this)).field_O = stackIn_192_1;
                                    this.field_u = 2;
                                    if (this.field_O == 1) {
                                      this.field_L = 2;
                                      break L42;
                                    } else {
                                      break L42;
                                    }
                                  } else {
                                    break L42;
                                  }
                                }
                                L44: {
                                  L45: {
                                    L46: {
                                      L47: {
                                        L48: {
                                          L49: {
                                            if (!this.field_f) {
                                              break L49;
                                            } else {
                                              var8 = 0;
                                              L50: while (true) {
                                                L51: {
                                                  if (this.field_y <= var8) {
                                                    break L51;
                                                  } else {
                                                    stackOut_199_0 = this.field_s;
                                                    stackOut_199_1 = var8;
                                                    stackIn_227_0 = stackOut_199_0;
                                                    stackIn_227_1 = stackOut_199_1;
                                                    stackIn_200_0 = stackOut_199_0;
                                                    stackIn_200_1 = stackOut_199_1;
                                                    if (var10 != 0) {
                                                      break L48;
                                                    } else {
                                                      L52: {
                                                        stackOut_200_0 = (lf[]) ((Object) stackIn_200_0);
                                                        stackOut_200_1 = stackIn_200_1;
                                                        stackOut_200_2 = null;
                                                        stackOut_200_3 = null;
                                                        stackOut_200_4 = this.field_c;
                                                        stackOut_200_5 = 1;
                                                        stackOut_200_6 = tn.field_W[this.field_J][var8];
                                                        stackOut_200_7 = kw.field_P[this.field_J][var8];
                                                        stackOut_200_8 = this.field_d;
                                                        stackIn_204_0 = stackOut_200_0;
                                                        stackIn_204_1 = stackOut_200_1;
                                                        stackIn_204_2 = stackOut_200_2;
                                                        stackIn_204_3 = stackOut_200_3;
                                                        stackIn_204_4 = stackOut_200_4;
                                                        stackIn_204_5 = stackOut_200_5;
                                                        stackIn_204_6 = stackOut_200_6;
                                                        stackIn_204_7 = stackOut_200_7;
                                                        stackIn_204_8 = stackOut_200_8;
                                                        stackIn_201_0 = stackOut_200_0;
                                                        stackIn_201_1 = stackOut_200_1;
                                                        stackIn_201_2 = stackOut_200_2;
                                                        stackIn_201_3 = stackOut_200_3;
                                                        stackIn_201_4 = stackOut_200_4;
                                                        stackIn_201_5 = stackOut_200_5;
                                                        stackIn_201_6 = stackOut_200_6;
                                                        stackIn_201_7 = stackOut_200_7;
                                                        stackIn_201_8 = stackOut_200_8;
                                                        if (this.field_d) {
                                                          stackOut_204_0 = (lf[]) ((Object) stackIn_204_0);
                                                          stackOut_204_1 = stackIn_204_1;
                                                          stackOut_204_2 = null;
                                                          stackOut_204_3 = null;
                                                          stackOut_204_4 = stackIn_204_4;
                                                          stackOut_204_5 = stackIn_204_5;
                                                          stackOut_204_6 = stackIn_204_6;
                                                          stackOut_204_7 = stackIn_204_7;
                                                          stackOut_204_8 = stackIn_204_8;
                                                          stackOut_204_9 = 0;
                                                          stackIn_205_0 = stackOut_204_0;
                                                          stackIn_205_1 = stackOut_204_1;
                                                          stackIn_205_2 = stackOut_204_2;
                                                          stackIn_205_3 = stackOut_204_3;
                                                          stackIn_205_4 = stackOut_204_4;
                                                          stackIn_205_5 = stackOut_204_5;
                                                          stackIn_205_6 = stackOut_204_6;
                                                          stackIn_205_7 = stackOut_204_7;
                                                          stackIn_205_8 = stackOut_204_8;
                                                          stackIn_205_9 = stackOut_204_9;
                                                          break L52;
                                                        } else {
                                                          stackOut_201_0 = (lf[]) ((Object) stackIn_201_0);
                                                          stackOut_201_1 = stackIn_201_1;
                                                          stackOut_201_2 = null;
                                                          stackOut_201_3 = null;
                                                          stackOut_201_4 = stackIn_201_4;
                                                          stackOut_201_5 = stackIn_201_5;
                                                          stackOut_201_6 = stackIn_201_6;
                                                          stackOut_201_7 = stackIn_201_7;
                                                          stackOut_201_8 = stackIn_201_8;
                                                          stackIn_203_0 = stackOut_201_0;
                                                          stackIn_203_1 = stackOut_201_1;
                                                          stackIn_203_2 = stackOut_201_2;
                                                          stackIn_203_3 = stackOut_201_3;
                                                          stackIn_203_4 = stackOut_201_4;
                                                          stackIn_203_5 = stackOut_201_5;
                                                          stackIn_203_6 = stackOut_201_6;
                                                          stackIn_203_7 = stackOut_201_7;
                                                          stackIn_203_8 = stackOut_201_8;
                                                          stackOut_203_0 = (lf[]) ((Object) stackIn_203_0);
                                                          stackOut_203_1 = stackIn_203_1;
                                                          stackOut_203_2 = null;
                                                          stackOut_203_3 = null;
                                                          stackOut_203_4 = stackIn_203_4;
                                                          stackOut_203_5 = stackIn_203_5;
                                                          stackOut_203_6 = stackIn_203_6;
                                                          stackOut_203_7 = stackIn_203_7;
                                                          stackOut_203_8 = stackIn_203_8;
                                                          stackOut_203_9 = 1300 + ns.a(false, 700, vv.field_b);
                                                          stackIn_205_0 = stackOut_203_0;
                                                          stackIn_205_1 = stackOut_203_1;
                                                          stackIn_205_2 = stackOut_203_2;
                                                          stackIn_205_3 = stackOut_203_3;
                                                          stackIn_205_4 = stackOut_203_4;
                                                          stackIn_205_5 = stackOut_203_5;
                                                          stackIn_205_6 = stackOut_203_6;
                                                          stackIn_205_7 = stackOut_203_7;
                                                          stackIn_205_8 = stackOut_203_8;
                                                          stackIn_205_9 = stackOut_203_9;
                                                          break L52;
                                                        }
                                                      }
                                                      stackIn_205_0[stackIn_205_1] = new lf(stackIn_205_4, stackIn_205_5 != 0, stackIn_205_6, stackIn_205_7, stackIn_205_8, stackIn_205_9);
                                                      var8++;
                                                      if (var10 == 0) {
                                                        continue L50;
                                                      } else {
                                                        break L51;
                                                      }
                                                    }
                                                  }
                                                }
                                                if (var10 == 0) {
                                                  break L47;
                                                } else {
                                                  break L49;
                                                }
                                              }
                                            }
                                          }
                                          var8 = 0;
                                          L53: while (true) {
                                            if ((this.field_y ^ -1) >= (var8 ^ -1)) {
                                              break L47;
                                            } else {
                                              stackOut_209_0 = this.field_s;
                                              stackOut_209_1 = var8;
                                              stackIn_227_0 = stackOut_209_0;
                                              stackIn_227_1 = stackOut_209_1;
                                              stackIn_210_0 = stackOut_209_0;
                                              stackIn_210_1 = stackOut_209_1;
                                              if (var10 != 0) {
                                                break L48;
                                              } else {
                                                L54: {
                                                  stackOut_210_0 = (lf[]) ((Object) stackIn_210_0);
                                                  stackOut_210_1 = stackIn_210_1;
                                                  stackOut_210_2 = null;
                                                  stackOut_210_3 = null;
                                                  stackOut_210_4 = this.field_c;
                                                  stackOut_210_5 = 1;
                                                  stackOut_210_6 = tn.field_W[this.field_J][var8];
                                                  stackOut_210_7 = kw.field_P[this.field_J][var8];
                                                  stackOut_210_8 = this.field_d;
                                                  stackIn_214_0 = stackOut_210_0;
                                                  stackIn_214_1 = stackOut_210_1;
                                                  stackIn_214_2 = stackOut_210_2;
                                                  stackIn_214_3 = stackOut_210_3;
                                                  stackIn_214_4 = stackOut_210_4;
                                                  stackIn_214_5 = stackOut_210_5;
                                                  stackIn_214_6 = stackOut_210_6;
                                                  stackIn_214_7 = stackOut_210_7;
                                                  stackIn_214_8 = stackOut_210_8;
                                                  stackIn_211_0 = stackOut_210_0;
                                                  stackIn_211_1 = stackOut_210_1;
                                                  stackIn_211_2 = stackOut_210_2;
                                                  stackIn_211_3 = stackOut_210_3;
                                                  stackIn_211_4 = stackOut_210_4;
                                                  stackIn_211_5 = stackOut_210_5;
                                                  stackIn_211_6 = stackOut_210_6;
                                                  stackIn_211_7 = stackOut_210_7;
                                                  stackIn_211_8 = stackOut_210_8;
                                                  if (!this.field_d) {
                                                    stackOut_214_0 = (lf[]) ((Object) stackIn_214_0);
                                                    stackOut_214_1 = stackIn_214_1;
                                                    stackOut_214_2 = null;
                                                    stackOut_214_3 = null;
                                                    stackOut_214_4 = stackIn_214_4;
                                                    stackOut_214_5 = stackIn_214_5;
                                                    stackOut_214_6 = stackIn_214_6;
                                                    stackOut_214_7 = stackIn_214_7;
                                                    stackOut_214_8 = stackIn_214_8;
                                                    stackOut_214_9 = 1300 - -ns.a(false, 700, vv.field_b);
                                                    stackIn_215_0 = stackOut_214_0;
                                                    stackIn_215_1 = stackOut_214_1;
                                                    stackIn_215_2 = stackOut_214_2;
                                                    stackIn_215_3 = stackOut_214_3;
                                                    stackIn_215_4 = stackOut_214_4;
                                                    stackIn_215_5 = stackOut_214_5;
                                                    stackIn_215_6 = stackOut_214_6;
                                                    stackIn_215_7 = stackOut_214_7;
                                                    stackIn_215_8 = stackOut_214_8;
                                                    stackIn_215_9 = stackOut_214_9;
                                                    break L54;
                                                  } else {
                                                    stackOut_211_0 = (lf[]) ((Object) stackIn_211_0);
                                                    stackOut_211_1 = stackIn_211_1;
                                                    stackOut_211_2 = null;
                                                    stackOut_211_3 = null;
                                                    stackOut_211_4 = stackIn_211_4;
                                                    stackOut_211_5 = stackIn_211_5;
                                                    stackOut_211_6 = stackIn_211_6;
                                                    stackOut_211_7 = stackIn_211_7;
                                                    stackOut_211_8 = stackIn_211_8;
                                                    stackIn_213_0 = stackOut_211_0;
                                                    stackIn_213_1 = stackOut_211_1;
                                                    stackIn_213_2 = stackOut_211_2;
                                                    stackIn_213_3 = stackOut_211_3;
                                                    stackIn_213_4 = stackOut_211_4;
                                                    stackIn_213_5 = stackOut_211_5;
                                                    stackIn_213_6 = stackOut_211_6;
                                                    stackIn_213_7 = stackOut_211_7;
                                                    stackIn_213_8 = stackOut_211_8;
                                                    stackOut_213_0 = (lf[]) ((Object) stackIn_213_0);
                                                    stackOut_213_1 = stackIn_213_1;
                                                    stackOut_213_2 = null;
                                                    stackOut_213_3 = null;
                                                    stackOut_213_4 = stackIn_213_4;
                                                    stackOut_213_5 = stackIn_213_5;
                                                    stackOut_213_6 = stackIn_213_6;
                                                    stackOut_213_7 = stackIn_213_7;
                                                    stackOut_213_8 = stackIn_213_8;
                                                    stackOut_213_9 = 0;
                                                    stackIn_215_0 = stackOut_213_0;
                                                    stackIn_215_1 = stackOut_213_1;
                                                    stackIn_215_2 = stackOut_213_2;
                                                    stackIn_215_3 = stackOut_213_3;
                                                    stackIn_215_4 = stackOut_213_4;
                                                    stackIn_215_5 = stackOut_213_5;
                                                    stackIn_215_6 = stackOut_213_6;
                                                    stackIn_215_7 = stackOut_213_7;
                                                    stackIn_215_8 = stackOut_213_8;
                                                    stackIn_215_9 = stackOut_213_9;
                                                    break L54;
                                                  }
                                                }
                                                stackIn_215_0[stackIn_215_1] = new lf(stackIn_215_4, stackIn_215_5 != 0, stackIn_215_6, stackIn_215_7, stackIn_215_8, stackIn_215_9);
                                                var8++;
                                                if (var10 == 0) {
                                                  continue L53;
                                                } else {
                                                  break L47;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        L55: while (true) {
                                          stackIn_227_0[stackIn_227_1] = new lf(this.field_a, false, tn.field_W[this.field_u][var8], kw.field_P[this.field_u][var8], this.field_d, 0);
                                          var8++;
                                          if (var10 != 0) {
                                            break L44;
                                          } else {
                                            if (var10 == 0) {
                                              if ((var8 ^ -1) <= (this.field_w ^ -1)) {
                                                break L45;
                                              } else {
                                                stackOut_226_0 = this.field_i;
                                                stackOut_226_1 = var8;
                                                stackIn_227_0 = stackOut_226_0;
                                                stackIn_227_1 = stackOut_226_1;
                                                continue L55;
                                              }
                                            } else {
                                              break L46;
                                            }
                                          }
                                        }
                                      }
                                      L56: {
                                        if (this.field_o) {
                                          break L56;
                                        } else {
                                          var8 = 0;
                                          L57: while (true) {
                                            L58: {
                                              if ((var8 ^ -1) <= (this.field_w ^ -1)) {
                                                break L58;
                                              } else {
                                                this.field_i[var8] = new lf(this.field_a, false, tn.field_W[this.field_u][var8], kw.field_P[this.field_u][var8], this.field_d, 0);
                                                var8++;
                                                if (var10 != 0) {
                                                  break L45;
                                                } else {
                                                  if (var10 == 0) {
                                                    continue L57;
                                                  } else {
                                                    break L58;
                                                  }
                                                }
                                              }
                                            }
                                            if (var10 == 0) {
                                              break L45;
                                            } else {
                                              break L56;
                                            }
                                          }
                                        }
                                      }
                                      var8 = 0;
                                      L59: while (true) {
                                        if ((var8 ^ -1) <= (this.field_w ^ -1)) {
                                          break L45;
                                        } else {
                                          stackOut_226_0 = this.field_i;
                                          stackOut_226_1 = var8;
                                          stackIn_227_0 = stackOut_226_0;
                                          stackIn_227_1 = stackOut_226_1;
                                          stackIn_227_0[stackIn_227_1] = new lf(this.field_a, false, tn.field_W[this.field_u][var8], kw.field_P[this.field_u][var8], this.field_d, 0);
                                          var8++;
                                          if (var10 != 0) {
                                            break L44;
                                          } else {
                                            if (var10 == 0) {
                                              continue L59;
                                            } else {
                                              break L46;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    break L45;
                                  }
                                  L60: {
                                    stackOut_231_0 = this;
                                    stackIn_234_0 = stackOut_231_0;
                                    stackIn_232_0 = stackOut_231_0;
                                    if ((this.field_J ^ -1) < (this.field_u ^ -1)) {
                                      stackOut_234_0 = this;
                                      stackOut_234_1 = this.field_J;
                                      stackIn_235_0 = stackOut_234_0;
                                      stackIn_235_1 = stackOut_234_1;
                                      break L60;
                                    } else {
                                      stackOut_232_0 = this;
                                      stackOut_232_1 = this.field_u;
                                      stackIn_235_0 = stackOut_232_0;
                                      stackIn_235_1 = stackOut_232_1;
                                      break L60;
                                    }
                                  }
                                  ((sk) (this)).field_C = stackIn_235_1;
                                  break L44;
                                }
                                L61: {
                                  if (0 != this.field_v) {
                                    break L61;
                                  } else {
                                    if (0 != this.field_O) {
                                      break L61;
                                    } else {
                                      if (!this.field_d) {
                                        this.field_m = true;
                                        break L61;
                                      } else {
                                        break L61;
                                      }
                                    }
                                  }
                                }
                                L62: {
                                  if (!this.field_d) {
                                    break L62;
                                  } else {
                                    if (this.field_f) {
                                      this.field_n = 6;
                                      this.h(param1 ^ 56);
                                      break L62;
                                    } else {
                                      break L62;
                                    }
                                  }
                                }
                                L63: {
                                  L64: {
                                    L65: {
                                      if (!this.field_d) {
                                        break L65;
                                      } else {
                                        if (this.field_L == 8) {
                                          break L64;
                                        } else {
                                          break L65;
                                        }
                                      }
                                    }
                                    this.field_t = this.field_x.field_v * var3_ref.field_G + var3_ref.field_Q;
                                    if (var10 == 0) {
                                      break L63;
                                    } else {
                                      break L64;
                                    }
                                  }
                                  this.field_t = var3_ref.field_F + var3_ref.field_Q + this.field_x.field_v * (var3_ref.field_B + var3_ref.field_G);
                                  break L63;
                                }
                                u.field_p.b(var3_ref.field_G * this.field_x.field_v + var3_ref.field_Q, param1 ^ 65);
                                break L1;
                              }
                            }
                          }
                          L66: {
                            L67: {
                              if (null == var6_ref) {
                                break L67;
                              } else {
                                if (var7 != null) {
                                  break L66;
                                } else {
                                  break L67;
                                }
                              }
                            }
                            var8_ref_String = db.field_d + ": Can see attacker or defender";
                            this.field_x.a(0, var8_ref_String, var3_ref);
                            break L66;
                          }
                          this.field_n = 8;
                          stackOut_31_0 = 0;
                          stackIn_32_0 = stackOut_31_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                var6 = db.field_d + ": Attacker or defender off map";
                this.field_x.a(0, var6, var3_ref);
                this.field_n = 8;
                stackOut_18_0 = 0;
                stackIn_19_0 = stackOut_18_0;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                break L1;
              }
            }
            L68: {
              if (param1 == 57) {
                break L68;
              } else {
                discarded$1 = this.a((oj) null, (byte) -19);
                break L68;
              }
            }
            this.b(param0, (byte) 32);
            stackOut_266_0 = 1;
            stackIn_267_0 = stackOut_266_0;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L69: {
            var3 = decompiledCaughtException;
            stackOut_268_0 = (RuntimeException) (var3);
            stackOut_268_1 = new StringBuilder().append("sk.E(");
            stackIn_271_0 = stackOut_268_0;
            stackIn_271_1 = stackOut_268_1;
            stackIn_269_0 = stackOut_268_0;
            stackIn_269_1 = stackOut_268_1;
            if (param0 == null) {
              stackOut_271_0 = (RuntimeException) ((Object) stackIn_271_0);
              stackOut_271_1 = (StringBuilder) ((Object) stackIn_271_1);
              stackOut_271_2 = "null";
              stackIn_272_0 = stackOut_271_0;
              stackIn_272_1 = stackOut_271_1;
              stackIn_272_2 = stackOut_271_2;
              break L69;
            } else {
              stackOut_269_0 = (RuntimeException) ((Object) stackIn_269_0);
              stackOut_269_1 = (StringBuilder) ((Object) stackIn_269_1);
              stackOut_269_2 = "{...}";
              stackIn_272_0 = stackOut_269_0;
              stackIn_272_1 = stackOut_269_1;
              stackIn_272_2 = stackOut_269_2;
              break L69;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_272_0), stackIn_272_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_19_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_32_0 != 0;
          } else {
            return stackIn_267_0 != 0;
          }
        }
    }

    public final void a(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_n == 8) {
                break L1;
              } else {
                this.field_F = 0;
                break L1;
              }
            }
            L2: {
              this.field_n = 8;
              if (param0 >= 94) {
                break L2;
              } else {
                this.m(96);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "sk.D(" + param0 + ')');
        }
    }

    public final void b(oj param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              this.e(2);
              if (u.field_p == null) {
                break L1;
              } else {
                u.field_p.c(1959107777);
                break L1;
              }
            }
            L2: {
              L3: {
                this.field_F = this.field_F + 1;
                if ((this.field_n ^ -1) != -1) {
                  break L3;
                } else {
                  this.o(-124);
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (8 != this.field_n) {
                  break L4;
                } else {
                  this.d((byte) 126);
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              if (-2 != (this.field_n ^ -1)) {
                L5: {
                  if (-3 == (this.field_n ^ -1)) {
                    break L5;
                  } else {
                    if ((this.field_n ^ -1) == -4) {
                      break L5;
                    } else {
                      if (this.field_n == 4) {
                        break L5;
                      } else {
                        L6: {
                          if ((this.field_n ^ -1) == -6) {
                            break L6;
                          } else {
                            if (6 != this.field_n) {
                              if (7 != this.field_n) {
                                break L2;
                              } else {
                                this.d(29823);
                                if (var4 == 0) {
                                  break L2;
                                } else {
                                  break L6;
                                }
                              }
                            } else {
                              if (this.a(true)) {
                                decompiledRegionSelector0 = 1;
                                break L0;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                        this.c(false);
                        if (var4 == 0) {
                          break L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                }
                this.j(-8089);
                break L2;
              } else {
                if (this.g(-9)) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            var3_int = -77 % ((param1 - -26) / 48);
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_53_0 = (RuntimeException) (var3);
            stackOut_53_1 = new StringBuilder().append("sk.Q(");
            stackIn_56_0 = stackOut_53_0;
            stackIn_56_1 = stackOut_53_1;
            stackIn_54_0 = stackOut_53_0;
            stackIn_54_1 = stackOut_53_1;
            if (param0 == null) {
              stackOut_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackOut_56_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackOut_56_2 = "null";
              stackIn_57_0 = stackOut_56_0;
              stackIn_57_1 = stackOut_56_1;
              stackIn_57_2 = stackOut_56_2;
              break L7;
            } else {
              stackOut_54_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackOut_54_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackOut_54_2 = "{...}";
              stackIn_57_0 = stackOut_54_0;
              stackIn_57_1 = stackOut_54_1;
              stackIn_57_2 = stackOut_54_2;
              break L7;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_57_0), stackIn_57_2 + ',' + param1 + ')');
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

    private final void h(int param0) {
        boolean discarded$2 = false;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                discarded$2 = this.b(-67);
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var2_int >= this.field_D.length) {
                    break L4;
                  } else {
                    if (var3 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          if (var2_int >= this.field_O) {
                            break L6;
                          } else {
                            this.field_D[var2_int] = new km(this.field_i[this.field_b[var2_int]].field_a, 600 + -pk.field_T[this.field_a][0], this.field_i[this.field_b[var2_int]].field_s, 200 + ns.a(false, 600, vv.field_b), this.field_z);
                            if (var3 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        this.field_D[var2_int] = new km(100 + ns.a(false, 600, vv.field_b), 600, ns.a(false, 850, vv.field_b) + 900, ns.a(false, 600, vv.field_b) + 200, this.field_z);
                        break L5;
                      }
                      var2_int++;
                      if (var3 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "sk.JA(" + param0 + ')');
        }
    }

    public final void a(byte param0) {
        try {
            if (param0 != -52) {
                this.a(61, (jd) null, 33, true, (jd) null);
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "sk.O(" + param0 + ')');
        }
    }

    private final void j(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (-3 != (this.field_n ^ -1)) {
                break L1;
              } else {
                this.a(this.field_s, -4925);
                break L1;
              }
            }
            L2: {
              L3: {
                if (-4 == (this.field_n ^ -1)) {
                  break L3;
                } else {
                  if (4 == this.field_n) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              this.a(this.field_i, -4925);
              break L2;
            }
            L4: {
              this.b(this.field_s, 12579);
              this.b(this.field_i, 12579);
              if ((this.field_F ^ -1) >= -241) {
                break L4;
              } else {
                this.field_F = 0;
                this.field_n = 8;
                break L4;
              }
            }
            L5: {
              if (param0 == -8089) {
                break L5;
              } else {
                this.d(111);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "sk.BA(" + param0 + ')');
        }
    }

    private final boolean g(int param0) {
        boolean discarded$1 = false;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        lf stackIn_4_0 = null;
        int stackIn_63_0 = 0;
        lf stackIn_80_0 = null;
        int stackIn_92_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        lf stackOut_3_0 = null;
        int stackOut_62_0 = 0;
        lf stackOut_79_0 = null;
        int stackOut_91_0 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            this.b(true);
            var2_int = 1;
            var3 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      if (var3 >= this.field_s.length) {
                        break L5;
                      } else {
                        stackOut_3_0 = this.field_s[var3];
                        stackIn_80_0 = stackOut_3_0;
                        stackIn_4_0 = stackOut_3_0;
                        if (var4 != 0) {
                          break L4;
                        } else {
                          L6: {
                            L7: {
                              if (stackIn_4_0 != null) {
                                break L7;
                              } else {
                                if (var4 == 0) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            L8: {
                              this.field_s[var3].d((byte) 113);
                              if (!this.field_E) {
                                break L8;
                              } else {
                                if (!this.field_s[var3].field_e) {
                                  break L8;
                                } else {
                                  this.field_s[var3].a(0, 30, 0, -10, u.field_o[this.field_c][1], pk.field_T[this.field_c][1], (byte) 122);
                                  this.field_s[var3].field_e = false;
                                  break L8;
                                }
                              }
                            }
                            if (!this.field_s[var3].field_d) {
                              break L6;
                            } else {
                              L9: {
                                if (this.field_s[var3].field_H) {
                                  break L9;
                                } else {
                                  var2_int = 0;
                                  if (var4 == 0) {
                                    break L6;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              this.field_s[var3] = null;
                              break L6;
                            }
                          }
                          var3++;
                          if (var4 == 0) {
                            continue L1;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    var3 = 0;
                    L10: while (true) {
                      L11: {
                        L12: {
                          if ((this.field_i.length ^ -1) >= (var3 ^ -1)) {
                            break L12;
                          } else {
                            if (var4 != 0) {
                              break L11;
                            } else {
                              L13: {
                                if (null == this.field_i[var3]) {
                                  break L13;
                                } else {
                                  L14: {
                                    this.field_i[var3].d((byte) 113);
                                    if (!this.field_P) {
                                      break L14;
                                    } else {
                                      if (this.field_i[var3].field_e) {
                                        this.field_i[var3].a(0, 30, 0, 10, u.field_o[this.field_a][1], pk.field_T[this.field_a][1], (byte) 122);
                                        this.field_i[var3].field_e = false;
                                        break L14;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                  if (!this.field_i[var3].field_d) {
                                    break L13;
                                  } else {
                                    L15: {
                                      if (this.field_i[var3].field_H) {
                                        break L15;
                                      } else {
                                        var2_int = 0;
                                        if (var4 == 0) {
                                          break L13;
                                        } else {
                                          break L15;
                                        }
                                      }
                                    }
                                    this.field_i[var3] = null;
                                    break L13;
                                  }
                                }
                              }
                              var3++;
                              if (var4 == 0) {
                                continue L10;
                              } else {
                                break L12;
                              }
                            }
                          }
                        }
                        if (var2_int == 0) {
                          break L11;
                        } else {
                          if ((this.field_v ^ -1) != -1) {
                            break L11;
                          } else {
                            if (-1 != (this.field_O ^ -1)) {
                              break L11;
                            } else {
                              L16: {
                                if (!this.field_m) {
                                  break L16;
                                } else {
                                  if (500 >= this.field_F) {
                                    break L11;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                              this.field_F = 0;
                              this.field_n = this.field_L;
                              stackOut_62_0 = 1;
                              stackIn_63_0 = stackOut_62_0;
                              decompiledRegionSelector0 = 0;
                              break L0;
                            }
                          }
                        }
                      }
                      if (!this.field_q) {
                        break L3;
                      } else {
                        this.m(-13146);
                        this.e((byte) 105);
                        if (0 != this.field_v) {
                          break L2;
                        } else {
                          if ((this.field_O ^ -1) >= -1) {
                            break L2;
                          } else {
                            if (var2_int == 0) {
                              break L2;
                            } else {
                              if (this.field_F > 400) {
                                this.field_O = this.field_O - 1;
                                this.field_i[0].field_d = true;
                                stackOut_79_0 = this.field_i[0];
                                stackIn_80_0 = stackOut_79_0;
                                break L4;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  ((lf) (Object) stackIn_80_0).a(2, (byte) -101);
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                L17: {
                  if (this.field_F % 50 == 0) {
                    this.l(param0 + 58);
                    break L17;
                  } else {
                    break L17;
                  }
                }
                this.k(13047);
                break L2;
              }
              L18: {
                if (param0 == -9) {
                  break L18;
                } else {
                  discarded$1 = this.a((oj) null, (byte) 69);
                  break L18;
                }
              }
              stackOut_91_0 = 0;
              stackIn_92_0 = stackOut_91_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "sk.DA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_63_0 != 0;
        } else {
          return stackIn_92_0 != 0;
        }
    }

    private final void f(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        lf stackIn_10_0 = null;
        lf stackIn_25_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        lf stackOut_9_0 = null;
        lf stackOut_24_0 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if ((this.field_p ^ -1) == -1) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var2_int = 0;
                var3 = new int[this.field_y];
                if (param0 == -24577) {
                  break L1;
                } else {
                  this.field_i = (lf[]) null;
                  break L1;
                }
              }
              var4 = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (var4 >= this.field_y) {
                      break L4;
                    } else {
                      stackOut_9_0 = this.field_s[var4];
                      stackIn_25_0 = stackOut_9_0;
                      stackIn_10_0 = stackOut_9_0;
                      if (var5 != 0) {
                        break L3;
                      } else {
                        L5: {
                          if (stackIn_10_0 == null) {
                            break L5;
                          } else {
                            if (this.field_s[var4].b((byte) 115)) {
                              var3[var2_int] = var4;
                              var2_int++;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var4++;
                        if (var5 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (1 > var2_int) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    this.field_p = this.field_p - 1;
                    var4 = var3[ns.a(false, var2_int, vv.field_b)];
                    stackOut_24_0 = this.field_s[var4];
                    stackIn_25_0 = stackOut_24_0;
                    break L3;
                  }
                }
                ((lf) (Object) stackIn_25_0).c((byte) 102);
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) runtimeException), "sk.P(" + param0 + ')');
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

    private final void d(boolean param0) {
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        RuntimeException var2 = null;
        int[] var2_array = null;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_4_0 = null;
        lf stackIn_4_1 = null;
        lf stackIn_13_0 = null;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        int stackIn_70_0 = 0;
        int stackIn_70_1 = 0;
        lf stackIn_101_0 = null;
        lf stackIn_111_0 = null;
        Object stackIn_124_0 = null;
        lf stackIn_124_1 = null;
        int stackIn_135_0 = 0;
        int stackIn_135_1 = 0;
        int stackIn_140_0 = 0;
        int stackIn_140_1 = 0;
        lf stackIn_171_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        lf stackOut_3_1 = null;
        Object stackOut_122_0 = null;
        lf stackOut_122_1 = null;
        lf stackOut_12_0 = null;
        int stackOut_21_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        boolean stackOut_35_0 = false;
        int stackOut_39_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_42_1 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        boolean stackOut_54_0 = false;
        int stackOut_64_0 = 0;
        int stackOut_64_1 = 0;
        int stackOut_68_0 = 0;
        int stackOut_68_1 = 0;
        lf stackOut_100_0 = null;
        lf stackOut_110_0 = null;
        lf stackOut_169_0 = null;
        int stackOut_134_0 = 0;
        int stackOut_134_1 = 0;
        int stackOut_138_0 = 0;
        int stackOut_138_1 = 0;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var2_array = new int[this.field_s.length];
            var3 = new int[this.field_i.length];
            var4 = 0;
            var5 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      L6: {
                        if (this.field_s.length <= var5) {
                          break L6;
                        } else {
                          stackOut_3_0 = null;
                          stackOut_3_1 = this.field_s[var5];
                          stackIn_124_0 = stackOut_3_0;
                          stackIn_124_1 = stackOut_3_1;
                          stackIn_4_0 = stackOut_3_0;
                          stackIn_4_1 = stackOut_3_1;
                          if (var7 != 0) {
                            L7: while (true) {
                              L8: {
                                if (stackIn_124_0 != stackIn_124_1) {
                                  this.field_i[var3[var5]].a(this.field_C, -92, false);
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                              var5++;
                              if (var7 == 0) {
                                if ((this.field_w ^ -1) >= (var5 ^ -1)) {
                                  break L5;
                                } else {
                                  if (var7 != 0) {
                                    break L3;
                                  } else {
                                    stackOut_122_0 = null;
                                    stackOut_122_1 = this.field_i[var3[var5]];
                                    stackIn_124_0 = stackOut_122_0;
                                    stackIn_124_1 = stackOut_122_1;
                                    continue L7;
                                  }
                                }
                              } else {
                                break L5;
                              }
                            }
                          } else {
                            L9: {
                              if (stackIn_4_0 != stackIn_4_1) {
                                incrementValue$10 = var4;
                                var4++;
                                var2_array[incrementValue$10] = var5;
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            var5++;
                            if (var7 == 0) {
                              continue L1;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      this.field_y = var4;
                      var4 = 0;
                      var5 = 0;
                      L10: while (true) {
                        L11: {
                          L12: {
                            if (this.field_i.length <= var5) {
                              break L12;
                            } else {
                              stackOut_12_0 = this.field_i[var5];
                              stackIn_171_0 = stackOut_12_0;
                              stackIn_13_0 = stackOut_12_0;
                              if (var7 != 0) {
                                break L11;
                              } else {
                                L13: {
                                  if (stackIn_13_0 == null) {
                                    break L13;
                                  } else {
                                    incrementValue$11 = var4;
                                    var4++;
                                    var3[incrementValue$11] = var5;
                                    break L13;
                                  }
                                }
                                var5++;
                                if (var7 == 0) {
                                  continue L10;
                                } else {
                                  break L12;
                                }
                              }
                            }
                          }
                          this.field_w = var4;
                          var5 = 0;
                          L14: while (true) {
                            L15: {
                              L16: {
                                if (this.field_y <= var5) {
                                  break L16;
                                } else {
                                  var4 = var5;
                                  stackOut_21_0 = 1 + var5;
                                  stackIn_36_0 = stackOut_21_0;
                                  stackIn_22_0 = stackOut_21_0;
                                  if (var7 != 0) {
                                    break L15;
                                  } else {
                                    var6 = stackIn_22_0;
                                    L17: while (true) {
                                      L18: {
                                        L19: {
                                          if ((var6 ^ -1) <= (this.field_y ^ -1)) {
                                            break L19;
                                          } else {
                                            stackOut_24_0 = this.field_s[var2_array[var6]].field_s;
                                            stackOut_24_1 = this.field_s[var2_array[var4]].field_s;
                                            stackIn_32_0 = stackOut_24_0;
                                            stackIn_32_1 = stackOut_24_1;
                                            stackIn_25_0 = stackOut_24_0;
                                            stackIn_25_1 = stackOut_24_1;
                                            if (var7 != 0) {
                                              break L18;
                                            } else {
                                              L20: {
                                                if (stackIn_25_0 > stackIn_25_1) {
                                                  var4 = var6;
                                                  break L20;
                                                } else {
                                                  break L20;
                                                }
                                              }
                                              var6++;
                                              if (var7 == 0) {
                                                continue L17;
                                              } else {
                                                break L19;
                                              }
                                            }
                                          }
                                        }
                                        stackOut_31_0 = var4;
                                        stackOut_31_1 = var5;
                                        stackIn_32_0 = stackOut_31_0;
                                        stackIn_32_1 = stackOut_31_1;
                                        break L18;
                                      }
                                      L21: {
                                        if (stackIn_32_0 == stackIn_32_1) {
                                          break L21;
                                        } else {
                                          var6 = var2_array[var4];
                                          var2_array[var4] = var2_array[var5];
                                          var2_array[var5] = var6;
                                          break L21;
                                        }
                                      }
                                      var5++;
                                      if (var7 == 0) {
                                        continue L14;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                }
                              }
                              var5 = 0;
                              stackOut_35_0 = param0;
                              stackIn_36_0 = stackOut_35_0 ? 1 : 0;
                              break L15;
                            }
                            if (stackIn_36_0 == 1) {
                              L22: while (true) {
                                L23: {
                                  L24: {
                                    if ((this.field_w ^ -1) >= (var5 ^ -1)) {
                                      break L24;
                                    } else {
                                      var4 = var5;
                                      stackOut_39_0 = var5 - -1;
                                      stackIn_55_0 = stackOut_39_0;
                                      stackIn_40_0 = stackOut_39_0;
                                      if (var7 != 0) {
                                        break L23;
                                      } else {
                                        var6 = stackIn_40_0;
                                        L25: while (true) {
                                          L26: {
                                            L27: {
                                              if ((this.field_w ^ -1) >= (var6 ^ -1)) {
                                                break L27;
                                              } else {
                                                stackOut_42_0 = this.field_i[var3[var4]].field_s ^ -1;
                                                stackOut_42_1 = this.field_i[var3[var6]].field_s ^ -1;
                                                stackIn_50_0 = stackOut_42_0;
                                                stackIn_50_1 = stackOut_42_1;
                                                stackIn_43_0 = stackOut_42_0;
                                                stackIn_43_1 = stackOut_42_1;
                                                if (var7 != 0) {
                                                  break L26;
                                                } else {
                                                  L28: {
                                                    if (stackIn_43_0 > stackIn_43_1) {
                                                      var4 = var6;
                                                      break L28;
                                                    } else {
                                                      break L28;
                                                    }
                                                  }
                                                  var6++;
                                                  if (var7 == 0) {
                                                    continue L25;
                                                  } else {
                                                    break L27;
                                                  }
                                                }
                                              }
                                            }
                                            stackOut_49_0 = var5;
                                            stackOut_49_1 = var4;
                                            stackIn_50_0 = stackOut_49_0;
                                            stackIn_50_1 = stackOut_49_1;
                                            break L26;
                                          }
                                          L29: {
                                            if (stackIn_50_0 != stackIn_50_1) {
                                              var6 = var3[var4];
                                              var3[var4] = var3[var5];
                                              var3[var5] = var6;
                                              break L29;
                                            } else {
                                              break L29;
                                            }
                                          }
                                          var5++;
                                          if (var7 == 0) {
                                            continue L22;
                                          } else {
                                            break L24;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  stackOut_54_0 = cu.field_a;
                                  stackIn_55_0 = stackOut_54_0 ? 1 : 0;
                                  break L23;
                                }
                                L30: {
                                  if (stackIn_55_0 == 0) {
                                    break L30;
                                  } else {
                                    L31: {
                                      L32: {
                                        if (this.field_f) {
                                          break L32;
                                        } else {
                                          L33: {
                                            if (this.field_o) {
                                              break L33;
                                            } else {
                                              var5 = 0;
                                              var6 = 0;
                                              L34: while (true) {
                                                L35: {
                                                  L36: {
                                                    L37: {
                                                      if ((this.field_y ^ -1) < (var5 ^ -1)) {
                                                        break L37;
                                                      } else {
                                                        stackOut_64_0 = var6;
                                                        stackOut_64_1 = this.field_w;
                                                        stackIn_70_0 = stackOut_64_0;
                                                        stackIn_70_1 = stackOut_64_1;
                                                        stackIn_65_0 = stackOut_64_0;
                                                        stackIn_65_1 = stackOut_64_1;
                                                        if (var7 != 0) {
                                                          break L36;
                                                        } else {
                                                          if (stackIn_65_0 >= stackIn_65_1) {
                                                            break L35;
                                                          } else {
                                                            break L37;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    stackOut_68_0 = var6 ^ -1;
                                                    stackOut_68_1 = this.field_w ^ -1;
                                                    stackIn_70_0 = stackOut_68_0;
                                                    stackIn_70_1 = stackOut_68_1;
                                                    break L36;
                                                  }
                                                  L38: {
                                                    if (stackIn_70_0 <= stackIn_70_1) {
                                                      break L38;
                                                    } else {
                                                      if (this.field_i[var3[var6]] == null) {
                                                        var6++;
                                                        break L38;
                                                      } else {
                                                        break L38;
                                                      }
                                                    }
                                                  }
                                                  L39: {
                                                    if (var5 >= this.field_y) {
                                                      break L39;
                                                    } else {
                                                      if (null == this.field_s[var2_array[var5]]) {
                                                        var5++;
                                                        break L39;
                                                      } else {
                                                        break L39;
                                                      }
                                                    }
                                                  }
                                                  L40: {
                                                    if (this.field_w > var6) {
                                                      break L40;
                                                    } else {
                                                      incrementValue$12 = var5;
                                                      var5++;
                                                      this.field_s[var2_array[incrementValue$12]].a(this.field_C, -91, true);
                                                      if (var7 == 0) {
                                                        continue L34;
                                                      } else {
                                                        break L40;
                                                      }
                                                    }
                                                  }
                                                  L41: {
                                                    if ((this.field_y ^ -1) >= (var5 ^ -1)) {
                                                      break L41;
                                                    } else {
                                                      L42: {
                                                        if ((this.field_s[var2_array[var5]].field_s ^ -1) < (this.field_i[var3[var6]].field_s ^ -1)) {
                                                          break L42;
                                                        } else {
                                                          incrementValue$13 = var6;
                                                          var6++;
                                                          this.field_i[var3[incrementValue$13]].a(this.field_C, -38, true);
                                                          if (var7 == 0) {
                                                            continue L34;
                                                          } else {
                                                            break L42;
                                                          }
                                                        }
                                                      }
                                                      incrementValue$14 = var5;
                                                      var5++;
                                                      this.field_s[var2_array[incrementValue$14]].a(this.field_C, -106, true);
                                                      if (var7 == 0) {
                                                        continue L34;
                                                      } else {
                                                        break L41;
                                                      }
                                                    }
                                                  }
                                                  incrementValue$15 = var6;
                                                  var6++;
                                                  this.field_i[var3[incrementValue$15]].a(this.field_C, -64, true);
                                                  if (var7 == 0) {
                                                    continue L34;
                                                  } else {
                                                    break L35;
                                                  }
                                                }
                                                if (var7 == 0) {
                                                  break L31;
                                                } else {
                                                  break L33;
                                                }
                                              }
                                            }
                                          }
                                          var5 = 0;
                                          L43: while (true) {
                                            L44: {
                                              if ((this.field_y ^ -1) >= (var5 ^ -1)) {
                                                break L44;
                                              } else {
                                                stackOut_100_0 = this.field_s[var2_array[var5]];
                                                stackIn_171_0 = stackOut_100_0;
                                                stackIn_101_0 = stackOut_100_0;
                                                if (var7 != 0) {
                                                  break L11;
                                                } else {
                                                  L45: {
                                                    if (stackIn_101_0 == null) {
                                                      break L45;
                                                    } else {
                                                      this.field_s[var2_array[var5]].a(this.field_C, -86, true);
                                                      break L45;
                                                    }
                                                  }
                                                  var5++;
                                                  if (var7 == 0) {
                                                    continue L43;
                                                  } else {
                                                    break L44;
                                                  }
                                                }
                                              }
                                            }
                                            if (var7 == 0) {
                                              break L31;
                                            } else {
                                              break L32;
                                            }
                                          }
                                        }
                                      }
                                      var5 = 0;
                                      L46: while (true) {
                                        if ((var5 ^ -1) <= (this.field_w ^ -1)) {
                                          break L31;
                                        } else {
                                          stackOut_110_0 = this.field_i[var3[var5]];
                                          stackIn_171_0 = stackOut_110_0;
                                          stackIn_111_0 = stackOut_110_0;
                                          if (var7 != 0) {
                                            break L11;
                                          } else {
                                            L47: {
                                              if (stackIn_111_0 != null) {
                                                this.field_i[var3[var5]].a(this.field_C, -46, true);
                                                break L47;
                                              } else {
                                                break L47;
                                              }
                                            }
                                            var5++;
                                            if (var7 == 0) {
                                              continue L46;
                                            } else {
                                              break L31;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    this.a((byte) 114, 0, 0, 128);
                                    break L30;
                                  }
                                }
                                if (!this.field_f) {
                                  break L4;
                                } else {
                                  var5 = 0;
                                  L48: while (true) {
                                    if ((this.field_w ^ -1) >= (var5 ^ -1)) {
                                      break L5;
                                    } else {
                                      if (var7 != 0) {
                                        break L3;
                                      } else {
                                        stackOut_122_0 = null;
                                        stackOut_122_1 = this.field_i[var3[var5]];
                                        stackIn_124_0 = stackOut_122_0;
                                        stackIn_124_1 = stackOut_122_1;
                                        L49: {
                                          if (stackIn_124_0 != stackIn_124_1) {
                                            this.field_i[var3[var5]].a(this.field_C, -92, false);
                                            break L49;
                                          } else {
                                            break L49;
                                          }
                                        }
                                        var5++;
                                        if (var7 == 0) {
                                          continue L48;
                                        } else {
                                          break L5;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              decompiledRegionSelector0 = 0;
                              break L0;
                            }
                          }
                        }
                        L50: while (true) {
                          L51: {
                            if (stackIn_171_0 != null) {
                              this.field_s[var2_array[var5]].a(this.field_C, -65, false);
                              break L51;
                            } else {
                              break L51;
                            }
                          }
                          var5++;
                          if (var7 == 0) {
                            if ((var5 ^ -1) <= (this.field_y ^ -1)) {
                              break L3;
                            } else {
                              if (var7 != 0) {
                                break L2;
                              } else {
                                stackOut_169_0 = this.field_s[var2_array[var5]];
                                stackIn_171_0 = stackOut_169_0;
                                continue L50;
                              }
                            }
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    if (var7 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                  L52: {
                    if (this.field_o) {
                      break L52;
                    } else {
                      var5 = 0;
                      var6 = 0;
                      L53: while (true) {
                        L54: {
                          L55: {
                            L56: {
                              if ((var5 ^ -1) > (this.field_y ^ -1)) {
                                break L56;
                              } else {
                                stackOut_134_0 = var6;
                                stackOut_134_1 = this.field_w;
                                stackIn_140_0 = stackOut_134_0;
                                stackIn_140_1 = stackOut_134_1;
                                stackIn_135_0 = stackOut_134_0;
                                stackIn_135_1 = stackOut_134_1;
                                if (var7 != 0) {
                                  break L55;
                                } else {
                                  if (stackIn_135_0 >= stackIn_135_1) {
                                    break L54;
                                  } else {
                                    break L56;
                                  }
                                }
                              }
                            }
                            stackOut_138_0 = var5 ^ -1;
                            stackOut_138_1 = this.field_y ^ -1;
                            stackIn_140_0 = stackOut_138_0;
                            stackIn_140_1 = stackOut_138_1;
                            break L55;
                          }
                          L57: {
                            if (stackIn_140_0 <= stackIn_140_1) {
                              break L57;
                            } else {
                              if (this.field_s[var2_array[var5]] != null) {
                                break L57;
                              } else {
                                var5++;
                                break L57;
                              }
                            }
                          }
                          L58: {
                            if (this.field_w <= var6) {
                              break L58;
                            } else {
                              if (this.field_i[var3[var6]] != null) {
                                break L58;
                              } else {
                                var6++;
                                break L58;
                              }
                            }
                          }
                          L59: {
                            if (this.field_w <= var6) {
                              break L59;
                            } else {
                              L60: {
                                if (var5 < this.field_y) {
                                  break L60;
                                } else {
                                  incrementValue$16 = var6;
                                  var6++;
                                  this.field_i[var3[incrementValue$16]].a(this.field_C, -74, false);
                                  if (var7 == 0) {
                                    continue L53;
                                  } else {
                                    break L60;
                                  }
                                }
                              }
                              L61: {
                                if (this.field_s[var2_array[var5]].field_s > this.field_i[var3[var6]].field_s) {
                                  break L61;
                                } else {
                                  incrementValue$17 = var6;
                                  var6++;
                                  this.field_i[var3[incrementValue$17]].a(this.field_C, -120, false);
                                  if (var7 == 0) {
                                    continue L53;
                                  } else {
                                    break L61;
                                  }
                                }
                              }
                              incrementValue$18 = var5;
                              var5++;
                              this.field_s[var2_array[incrementValue$18]].a(this.field_C, -65, false);
                              if (var7 == 0) {
                                continue L53;
                              } else {
                                break L59;
                              }
                            }
                          }
                          incrementValue$19 = var5;
                          var5++;
                          this.field_s[var2_array[incrementValue$19]].a(this.field_C, -52, false);
                          if (var7 == 0) {
                            continue L53;
                          } else {
                            break L54;
                          }
                        }
                        if (var7 == 0) {
                          break L3;
                        } else {
                          break L52;
                        }
                      }
                    }
                  }
                  var5 = 0;
                  L62: while (true) {
                    if ((var5 ^ -1) <= (this.field_y ^ -1)) {
                      break L3;
                    } else {
                      if (var7 != 0) {
                        break L2;
                      } else {
                        stackOut_169_0 = this.field_s[var2_array[var5]];
                        stackIn_171_0 = stackOut_169_0;
                        L63: {
                          if (stackIn_171_0 != null) {
                            this.field_s[var2_array[var5]].a(this.field_C, -65, false);
                            break L63;
                          } else {
                            break L63;
                          }
                        }
                        var5++;
                        if (var7 == 0) {
                          continue L62;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                break L2;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "sk.S(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final boolean a(boolean param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_41_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_40_0 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var2_int = param0 ? 1 : 0;
            var3 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if ((var3 ^ -1) <= (this.field_i.length ^ -1)) {
                    break L3;
                  } else {
                    if (var4 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (null != this.field_i[var3]) {
                          this.field_i[var3].d((byte) 113);
                          if (!this.field_i[var3].field_d) {
                            break L4;
                          } else {
                            L5: {
                              if (!this.field_i[var3].field_H) {
                                break L5;
                              } else {
                                this.field_i[var3] = null;
                                if (var4 == 0) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            var2_int = 0;
                            break L4;
                          }
                        } else {
                          break L4;
                        }
                      }
                      var3++;
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var3 = 0;
                break L2;
              }
              L6: while (true) {
                L7: {
                  L8: {
                    if (this.field_D.length <= var3) {
                      break L8;
                    } else {
                      stackOut_20_0 = this.field_D[var3].field_f ^ -1;
                      stackIn_36_0 = stackOut_20_0;
                      stackIn_21_0 = stackOut_20_0;
                      if (var4 != 0) {
                        break L7;
                      } else {
                        stackOut_21_0 = stackIn_21_0;
                        stackIn_23_0 = stackOut_21_0;
                        L9: {
                          if (stackIn_23_0 >= 0) {
                            break L9;
                          } else {
                            var2_int = 0;
                            break L9;
                          }
                        }
                        L10: {
                          if (!this.field_D[var3].b(-103)) {
                            break L10;
                          } else {
                            if ((this.field_O ^ -1) < (var3 ^ -1)) {
                              this.field_i[this.field_b[var3]].field_d = true;
                              this.field_i[this.field_b[var3]].a(2, (byte) -103);
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                        }
                        var3++;
                        if (var4 == 0) {
                          continue L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  stackOut_35_0 = var2_int;
                  stackIn_36_0 = stackOut_35_0;
                  break L7;
                }
                if (stackIn_36_0 != 0) {
                  this.field_F = 0;
                  this.field_n = this.field_L;
                  stackOut_38_0 = 1;
                  stackIn_39_0 = stackOut_38_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  stackOut_40_0 = 0;
                  stackIn_41_0 = stackOut_40_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "sk.L(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_39_0 != 0;
        } else {
          return stackIn_41_0 != 0;
        }
    }

    private final void f(byte param0) {
        int incrementValue$10 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$9 = 0;
        int incrementValue$11 = 0;
        RuntimeException var2 = null;
        int[] var2_array = null;
        int[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        lf[] stackIn_10_0 = null;
        lf[] stackIn_19_0 = null;
        Object stackIn_21_0 = null;
        Object stackIn_21_1 = null;
        Object stackIn_23_0 = null;
        Object stackIn_23_1 = null;
        Object stackIn_35_0 = null;
        Object stackIn_35_1 = null;
        int stackIn_42_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        int stackIn_68_0 = 0;
        int stackIn_68_1 = 0;
        int stackIn_72_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_78_1 = 0;
        int stackIn_84_0 = 0;
        int stackIn_84_1 = 0;
        int stackIn_89_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_102_1 = 0;
        int stackIn_110_0 = 0;
        int stackIn_110_1 = 0;
        int stackIn_134_0 = 0;
        int stackIn_138_0 = 0;
        int stackIn_142_0 = 0;
        int stackIn_170_0 = 0;
        int stackIn_170_1 = 0;
        int stackIn_178_0 = 0;
        int stackIn_178_1 = 0;
        int stackIn_201_0 = 0;
        int stackIn_205_0 = 0;
        int stackIn_209_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        lf[] stackOut_9_0 = null;
        Object stackOut_20_0 = null;
        Object stackOut_20_1 = null;
        Object stackOut_21_0 = null;
        Object stackOut_21_1 = null;
        lf[] stackOut_18_0 = null;
        Object stackOut_33_0 = null;
        Object stackOut_33_1 = null;
        int stackOut_41_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_44_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        int stackOut_54_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_60_1 = 0;
        int stackOut_67_0 = 0;
        int stackOut_67_1 = 0;
        int stackOut_71_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_77_1 = 0;
        int stackOut_83_0 = 0;
        int stackOut_83_1 = 0;
        int stackOut_88_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_101_1 = 0;
        int stackOut_108_0 = 0;
        int stackOut_108_1 = 0;
        int stackOut_133_0 = 0;
        int stackOut_131_0 = 0;
        int stackOut_137_0 = 0;
        int stackOut_135_0 = 0;
        int stackOut_141_0 = 0;
        int stackOut_139_0 = 0;
        int stackOut_169_0 = 0;
        int stackOut_169_1 = 0;
        int stackOut_176_0 = 0;
        int stackOut_176_1 = 0;
        int stackOut_200_0 = 0;
        int stackOut_198_0 = 0;
        int stackOut_204_0 = 0;
        int stackOut_202_0 = 0;
        int stackOut_208_0 = 0;
        int stackOut_206_0 = 0;
        var12 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (this.field_D == null) {
                break L1;
              } else {
                if (0 != this.field_D.length) {
                  var2_array = new int[this.field_s.length];
                  var3 = new int[this.field_i.length];
                  var4 = new int[this.field_D.length];
                  var5 = 0;
                  var6 = 0;
                  L2: while (true) {
                    L3: {
                      L4: {
                        L5: {
                          L6: {
                            L7: {
                              if (this.field_s.length <= var6) {
                                break L7;
                              } else {
                                stackOut_9_0 = this.field_s;
                                stackIn_19_0 = stackOut_9_0;
                                stackIn_10_0 = stackOut_9_0;
                                if (var12 != 0) {
                                  L8: while (true) {
                                    if (stackIn_19_0.length <= var6) {
                                      break L5;
                                    } else {
                                      stackOut_20_0 = null;
                                      stackOut_20_1 = this;
                                      stackIn_35_0 = stackOut_20_0;
                                      stackIn_35_1 = stackOut_20_1;
                                      stackIn_21_0 = stackOut_20_0;
                                      stackIn_21_1 = stackOut_20_1;
                                      if (var12 != 0) {
                                        break L6;
                                      } else {
                                        stackOut_21_0 = stackIn_21_0;
                                        stackOut_21_1 = this;
                                        stackIn_23_0 = stackOut_21_0;
                                        stackIn_23_1 = stackOut_21_1;
                                        L9: {
                                          if (stackIn_23_0 != ((sk) (this)).field_i[var6]) {
                                            incrementValue$9 = var5;
                                            var5++;
                                            var3[incrementValue$9] = var6;
                                            break L9;
                                          } else {
                                            break L9;
                                          }
                                        }
                                        var6++;
                                        if (var12 == 0) {
                                          stackOut_18_0 = this.field_i;
                                          stackIn_19_0 = stackOut_18_0;
                                          continue L8;
                                        } else {
                                          break L5;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  L10: {
                                    if (stackIn_10_0[var6] != null) {
                                      incrementValue$10 = var5;
                                      var5++;
                                      var2_array[incrementValue$10] = var6;
                                      break L10;
                                    } else {
                                      break L10;
                                    }
                                  }
                                  var6++;
                                  if (var12 == 0) {
                                    continue L2;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                            var5 = 0;
                            var6 = 0;
                            L11: while (true) {
                              stackOut_18_0 = this.field_i;
                              stackIn_19_0 = stackOut_18_0;
                              if (stackIn_19_0.length <= var6) {
                                break L5;
                              } else {
                                stackOut_20_0 = null;
                                stackOut_20_1 = this;
                                stackIn_35_0 = stackOut_20_0;
                                stackIn_35_1 = stackOut_20_1;
                                stackIn_21_0 = stackOut_20_0;
                                stackIn_21_1 = stackOut_20_1;
                                if (var12 != 0) {
                                  break L6;
                                } else {
                                  stackOut_21_0 = stackIn_21_0;
                                  stackOut_21_1 = this;
                                  stackIn_23_0 = stackOut_21_0;
                                  stackIn_23_1 = stackOut_21_1;
                                  L12: {
                                    if (stackIn_23_0 != ((sk) (this)).field_i[var6]) {
                                      incrementValue$9 = var5;
                                      var5++;
                                      var3[incrementValue$9] = var6;
                                      break L12;
                                    } else {
                                      break L12;
                                    }
                                  }
                                  var6++;
                                  if (var12 == 0) {
                                    continue L11;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                          }
                          L13: while (true) {
                            L14: {
                              if (stackIn_35_0 == ((sk) (this)).field_D[var6]) {
                                break L14;
                              } else {
                                incrementValue$11 = var5;
                                var5++;
                                var4[incrementValue$11] = var6;
                                break L14;
                              }
                            }
                            var6++;
                            if (var12 == 0) {
                              if (var6 >= this.field_D.length) {
                                break L4;
                              } else {
                                if (var12 != 0) {
                                  break L3;
                                } else {
                                  stackOut_33_0 = null;
                                  stackOut_33_1 = this;
                                  stackIn_35_0 = stackOut_33_0;
                                  stackIn_35_1 = stackOut_33_1;
                                  continue L13;
                                }
                              }
                            } else {
                              break L4;
                            }
                          }
                        }
                        var5 = 0;
                        var6 = 0;
                        L15: while (true) {
                          if (var6 >= this.field_D.length) {
                            break L4;
                          } else {
                            if (var12 != 0) {
                              break L3;
                            } else {
                              stackOut_33_0 = null;
                              stackOut_33_1 = this;
                              stackIn_35_0 = stackOut_33_0;
                              stackIn_35_1 = stackOut_33_1;
                              L16: {
                                if (stackIn_35_0 == ((sk) (this)).field_D[var6]) {
                                  break L16;
                                } else {
                                  incrementValue$11 = var5;
                                  var5++;
                                  var4[incrementValue$11] = var6;
                                  break L16;
                                }
                              }
                              var6++;
                              if (var12 == 0) {
                                continue L15;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                      }
                      var6 = 0;
                      break L3;
                    }
                    L17: while (true) {
                      L18: {
                        L19: {
                          if (this.field_y <= var6) {
                            break L19;
                          } else {
                            var5 = var6;
                            stackOut_41_0 = 1 + var6;
                            stackIn_55_0 = stackOut_41_0;
                            stackIn_42_0 = stackOut_41_0;
                            if (var12 != 0) {
                              break L18;
                            } else {
                              var7 = stackIn_42_0;
                              L20: while (true) {
                                L21: {
                                  L22: {
                                    if ((var7 ^ -1) <= (this.field_y ^ -1)) {
                                      break L22;
                                    } else {
                                      stackOut_44_0 = this.field_s[var2_array[var7]].field_s ^ -1;
                                      stackOut_44_1 = this.field_s[var2_array[var5]].field_s ^ -1;
                                      stackIn_51_0 = stackOut_44_0;
                                      stackIn_51_1 = stackOut_44_1;
                                      stackIn_45_0 = stackOut_44_0;
                                      stackIn_45_1 = stackOut_44_1;
                                      if (var12 != 0) {
                                        break L21;
                                      } else {
                                        L23: {
                                          if (stackIn_45_0 >= stackIn_45_1) {
                                            break L23;
                                          } else {
                                            var5 = var7;
                                            break L23;
                                          }
                                        }
                                        var7++;
                                        if (var12 == 0) {
                                          continue L20;
                                        } else {
                                          break L22;
                                        }
                                      }
                                    }
                                  }
                                  stackOut_50_0 = var6 ^ -1;
                                  stackOut_50_1 = var5 ^ -1;
                                  stackIn_51_0 = stackOut_50_0;
                                  stackIn_51_1 = stackOut_50_1;
                                  break L21;
                                }
                                L24: {
                                  if (stackIn_51_0 == stackIn_51_1) {
                                    break L24;
                                  } else {
                                    var7 = var2_array[var5];
                                    var2_array[var5] = var2_array[var6];
                                    var2_array[var6] = var7;
                                    break L24;
                                  }
                                }
                                var6++;
                                if (var12 == 0) {
                                  continue L17;
                                } else {
                                  break L19;
                                }
                              }
                            }
                          }
                        }
                        stackOut_54_0 = 0;
                        stackIn_55_0 = stackOut_54_0;
                        break L18;
                      }
                      var6 = stackIn_55_0;
                      L25: while (true) {
                        L26: {
                          L27: {
                            if ((this.field_w ^ -1) >= (var6 ^ -1)) {
                              break L27;
                            } else {
                              var5 = var6;
                              stackOut_57_0 = 1 + var6;
                              stackIn_72_0 = stackOut_57_0;
                              stackIn_58_0 = stackOut_57_0;
                              if (var12 != 0) {
                                break L26;
                              } else {
                                var7 = stackIn_58_0;
                                L28: while (true) {
                                  L29: {
                                    L30: {
                                      if (var7 >= this.field_w) {
                                        break L30;
                                      } else {
                                        stackOut_60_0 = this.field_i[var3[var7]].field_s ^ -1;
                                        stackOut_60_1 = this.field_i[var3[var5]].field_s ^ -1;
                                        stackIn_68_0 = stackOut_60_0;
                                        stackIn_68_1 = stackOut_60_1;
                                        stackIn_61_0 = stackOut_60_0;
                                        stackIn_61_1 = stackOut_60_1;
                                        if (var12 != 0) {
                                          break L29;
                                        } else {
                                          L31: {
                                            if (stackIn_61_0 < stackIn_61_1) {
                                              var5 = var7;
                                              break L31;
                                            } else {
                                              break L31;
                                            }
                                          }
                                          var7++;
                                          if (var12 == 0) {
                                            continue L28;
                                          } else {
                                            break L30;
                                          }
                                        }
                                      }
                                    }
                                    stackOut_67_0 = var6 ^ -1;
                                    stackOut_67_1 = var5 ^ -1;
                                    stackIn_68_0 = stackOut_67_0;
                                    stackIn_68_1 = stackOut_67_1;
                                    break L29;
                                  }
                                  L32: {
                                    if (stackIn_68_0 == stackIn_68_1) {
                                      break L32;
                                    } else {
                                      var7 = var3[var5];
                                      var3[var5] = var3[var6];
                                      var3[var6] = var7;
                                      break L32;
                                    }
                                  }
                                  var6++;
                                  if (var12 == 0) {
                                    continue L25;
                                  } else {
                                    break L27;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_71_0 = 0;
                          stackIn_72_0 = stackOut_71_0;
                          break L26;
                        }
                        var6 = stackIn_72_0;
                        L33: while (true) {
                          L34: {
                            L35: {
                              if (this.field_p <= var6) {
                                break L35;
                              } else {
                                var5 = var6;
                                stackOut_74_0 = 1 + var6;
                                stackIn_89_0 = stackOut_74_0;
                                stackIn_75_0 = stackOut_74_0;
                                if (var12 != 0) {
                                  break L34;
                                } else {
                                  var7 = stackIn_75_0;
                                  L36: while (true) {
                                    L37: {
                                      L38: {
                                        if (var7 >= this.field_p) {
                                          break L38;
                                        } else {
                                          stackOut_77_0 = this.field_D[var4[var5]].field_d;
                                          stackOut_77_1 = this.field_D[var4[var7]].field_d;
                                          stackIn_84_0 = stackOut_77_0;
                                          stackIn_84_1 = stackOut_77_1;
                                          stackIn_78_0 = stackOut_77_0;
                                          stackIn_78_1 = stackOut_77_1;
                                          if (var12 != 0) {
                                            break L37;
                                          } else {
                                            L39: {
                                              if (stackIn_78_0 >= stackIn_78_1) {
                                                break L39;
                                              } else {
                                                var5 = var7;
                                                break L39;
                                              }
                                            }
                                            var7++;
                                            if (var12 == 0) {
                                              continue L36;
                                            } else {
                                              break L38;
                                            }
                                          }
                                        }
                                      }
                                      stackOut_83_0 = var5 ^ -1;
                                      stackOut_83_1 = var6 ^ -1;
                                      stackIn_84_0 = stackOut_83_0;
                                      stackIn_84_1 = stackOut_83_1;
                                      break L37;
                                    }
                                    L40: {
                                      if (stackIn_84_0 != stackIn_84_1) {
                                        var7 = var4[var5];
                                        var4[var5] = var4[var6];
                                        var4[var6] = var7;
                                        break L40;
                                      } else {
                                        break L40;
                                      }
                                    }
                                    var6++;
                                    if (var12 == 0) {
                                      continue L33;
                                    } else {
                                      break L35;
                                    }
                                  }
                                }
                              }
                            }
                            var6 = 0;
                            stackOut_88_0 = 0;
                            stackIn_89_0 = stackOut_88_0;
                            break L34;
                          }
                          L41: {
                            var7 = stackIn_89_0;
                            var8 = 0;
                            if (!cu.field_a) {
                              break L41;
                            } else {
                              L42: {
                                if (this.field_o) {
                                  var7 = this.field_w;
                                  break L42;
                                } else {
                                  break L42;
                                }
                              }
                              L43: {
                                if (this.field_f) {
                                  var6 = this.field_y;
                                  break L43;
                                } else {
                                  break L43;
                                }
                              }
                              L44: while (true) {
                                L45: {
                                  L46: {
                                    L47: {
                                      if ((this.field_y ^ -1) < (var6 ^ -1)) {
                                        break L47;
                                      } else {
                                        stackOut_101_0 = this.field_w ^ -1;
                                        stackOut_101_1 = var7 ^ -1;
                                        stackIn_110_0 = stackOut_101_0;
                                        stackIn_110_1 = stackOut_101_1;
                                        stackIn_102_0 = stackOut_101_0;
                                        stackIn_102_1 = stackOut_101_1;
                                        if (var12 != 0) {
                                          break L46;
                                        } else {
                                          if (stackIn_102_0 < stackIn_102_1) {
                                            break L47;
                                          } else {
                                            if ((var8 ^ -1) <= (this.field_p ^ -1)) {
                                              break L45;
                                            } else {
                                              break L47;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    stackOut_108_0 = var8 ^ -1;
                                    stackOut_108_1 = this.field_p ^ -1;
                                    stackIn_110_0 = stackOut_108_0;
                                    stackIn_110_1 = stackOut_108_1;
                                    break L46;
                                  }
                                  L48: {
                                    if (stackIn_110_0 <= stackIn_110_1) {
                                      break L48;
                                    } else {
                                      if (null == this.field_D[var4[var8]]) {
                                        var8++;
                                        break L48;
                                      } else {
                                        break L48;
                                      }
                                    }
                                  }
                                  L49: {
                                    if (var6 >= this.field_y) {
                                      break L49;
                                    } else {
                                      if (null != this.field_s[var2_array[var6]]) {
                                        break L49;
                                      } else {
                                        var6++;
                                        break L49;
                                      }
                                    }
                                  }
                                  L50: {
                                    if (var7 >= this.field_w) {
                                      break L50;
                                    } else {
                                      if (this.field_i[var3[var7]] == null) {
                                        var7++;
                                        break L50;
                                      } else {
                                        break L50;
                                      }
                                    }
                                  }
                                  L51: {
                                    if (var8 < this.field_p) {
                                      stackOut_133_0 = this.field_D[var4[var8]].field_d;
                                      stackIn_134_0 = stackOut_133_0;
                                      break L51;
                                    } else {
                                      stackOut_131_0 = 100000;
                                      stackIn_134_0 = stackOut_131_0;
                                      break L51;
                                    }
                                  }
                                  L52: {
                                    var9 = stackIn_134_0;
                                    if (this.field_y > var6) {
                                      stackOut_137_0 = this.field_s[var2_array[var6]].field_s;
                                      stackIn_138_0 = stackOut_137_0;
                                      break L52;
                                    } else {
                                      stackOut_135_0 = 100000;
                                      stackIn_138_0 = stackOut_135_0;
                                      break L52;
                                    }
                                  }
                                  L53: {
                                    var10 = stackIn_138_0;
                                    if (this.field_w <= var7) {
                                      stackOut_141_0 = 100000;
                                      stackIn_142_0 = stackOut_141_0;
                                      break L53;
                                    } else {
                                      stackOut_139_0 = this.field_i[var3[var7]].field_s;
                                      stackIn_142_0 = stackOut_139_0;
                                      break L53;
                                    }
                                  }
                                  L54: {
                                    L55: {
                                      var11 = stackIn_142_0;
                                      if ((var11 ^ -1) >= (var9 ^ -1)) {
                                        break L55;
                                      } else {
                                        if (var9 >= var10) {
                                          break L55;
                                        } else {
                                          incrementValue$12 = var8;
                                          var8++;
                                          this.field_D[var4[incrementValue$12]].a(true, -8, true, this.field_C);
                                          if (var12 == 0) {
                                            break L54;
                                          } else {
                                            break L55;
                                          }
                                        }
                                      }
                                    }
                                    L56: {
                                      if ((var11 ^ -1) >= (var10 ^ -1)) {
                                        break L56;
                                      } else {
                                        incrementValue$13 = var6;
                                        var6++;
                                        this.field_s[var2_array[incrementValue$13]].a(this.field_C, param0 ^ 58, true);
                                        if (var12 == 0) {
                                          break L54;
                                        } else {
                                          break L56;
                                        }
                                      }
                                    }
                                    incrementValue$14 = var7;
                                    var7++;
                                    this.field_i[var3[incrementValue$14]].a(this.field_C, param0 + -97, true);
                                    break L54;
                                  }
                                  if (var12 == 0) {
                                    continue L44;
                                  } else {
                                    break L45;
                                  }
                                }
                                this.a((byte) 94, 0, 0, 128);
                                var6 = 0;
                                var8 = 0;
                                var7 = 0;
                                break L41;
                              }
                            }
                          }
                          L57: {
                            if (!this.field_f) {
                              break L57;
                            } else {
                              var6 = this.field_y;
                              break L57;
                            }
                          }
                          L58: {
                            if (param0 == -15) {
                              break L58;
                            } else {
                              this.b((byte) -125, 8);
                              break L58;
                            }
                          }
                          L59: {
                            if (this.field_o) {
                              var7 = this.field_w;
                              break L59;
                            } else {
                              break L59;
                            }
                          }
                          L60: while (true) {
                            L61: {
                              L62: {
                                L63: {
                                  if (var6 < this.field_y) {
                                    break L63;
                                  } else {
                                    stackOut_169_0 = this.field_w ^ -1;
                                    stackOut_169_1 = var7 ^ -1;
                                    stackIn_178_0 = stackOut_169_0;
                                    stackIn_178_1 = stackOut_169_1;
                                    stackIn_170_0 = stackOut_169_0;
                                    stackIn_170_1 = stackOut_169_1;
                                    if (var12 != 0) {
                                      break L62;
                                    } else {
                                      if (stackIn_170_0 < stackIn_170_1) {
                                        break L63;
                                      } else {
                                        if (var8 >= this.field_p) {
                                          break L61;
                                        } else {
                                          break L63;
                                        }
                                      }
                                    }
                                  }
                                }
                                stackOut_176_0 = this.field_p ^ -1;
                                stackOut_176_1 = var8 ^ -1;
                                stackIn_178_0 = stackOut_176_0;
                                stackIn_178_1 = stackOut_176_1;
                                break L62;
                              }
                              L64: {
                                if (stackIn_178_0 >= stackIn_178_1) {
                                  break L64;
                                } else {
                                  if (null != this.field_D[var4[var8]]) {
                                    break L64;
                                  } else {
                                    var8++;
                                    break L64;
                                  }
                                }
                              }
                              L65: {
                                if ((var6 ^ -1) <= (this.field_y ^ -1)) {
                                  break L65;
                                } else {
                                  if (null == this.field_s[var2_array[var6]]) {
                                    var6++;
                                    break L65;
                                  } else {
                                    break L65;
                                  }
                                }
                              }
                              L66: {
                                if ((this.field_w ^ -1) >= (var7 ^ -1)) {
                                  break L66;
                                } else {
                                  if (this.field_i[var3[var7]] != null) {
                                    break L66;
                                  } else {
                                    var7++;
                                    break L66;
                                  }
                                }
                              }
                              L67: {
                                if ((this.field_p ^ -1) >= (var8 ^ -1)) {
                                  stackOut_200_0 = 100000;
                                  stackIn_201_0 = stackOut_200_0;
                                  break L67;
                                } else {
                                  stackOut_198_0 = this.field_D[var4[var8]].field_d;
                                  stackIn_201_0 = stackOut_198_0;
                                  break L67;
                                }
                              }
                              L68: {
                                var9 = stackIn_201_0;
                                if (var6 >= this.field_y) {
                                  stackOut_204_0 = 100000;
                                  stackIn_205_0 = stackOut_204_0;
                                  break L68;
                                } else {
                                  stackOut_202_0 = this.field_s[var2_array[var6]].field_s;
                                  stackIn_205_0 = stackOut_202_0;
                                  break L68;
                                }
                              }
                              L69: {
                                var10 = stackIn_205_0;
                                if (var7 >= this.field_w) {
                                  stackOut_208_0 = 100000;
                                  stackIn_209_0 = stackOut_208_0;
                                  break L69;
                                } else {
                                  stackOut_206_0 = this.field_i[var3[var7]].field_s;
                                  stackIn_209_0 = stackOut_206_0;
                                  break L69;
                                }
                              }
                              L70: {
                                L71: {
                                  L72: {
                                    var11 = stackIn_209_0;
                                    if ((var9 ^ -1) <= (var11 ^ -1)) {
                                      break L72;
                                    } else {
                                      if (var10 > var9) {
                                        break L71;
                                      } else {
                                        break L72;
                                      }
                                    }
                                  }
                                  L73: {
                                    if (var10 >= var11) {
                                      break L73;
                                    } else {
                                      incrementValue$15 = var6;
                                      var6++;
                                      this.field_s[var2_array[incrementValue$15]].a(this.field_C, param0 + -93, false);
                                      if (var12 == 0) {
                                        break L70;
                                      } else {
                                        break L73;
                                      }
                                    }
                                  }
                                  incrementValue$16 = var7;
                                  var7++;
                                  this.field_i[var3[incrementValue$16]].a(this.field_C, param0 + -51, false);
                                  if (var12 == 0) {
                                    break L70;
                                  } else {
                                    break L71;
                                  }
                                }
                                incrementValue$17 = var8;
                                var8++;
                                this.field_D[var4[incrementValue$17]].a(true, -8, false, this.field_C);
                                break L70;
                              }
                              if (var12 == 0) {
                                continue L60;
                              } else {
                                break L61;
                              }
                            }
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            this.d(true);
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "sk.AA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void b(boolean param0) {
        try {
            this.a(this.field_i, 0, this.field_J, this.field_u, this.field_s);
            this.a(this.field_s, 0, this.field_u, this.field_J, this.field_i);
            this.a(this.field_s, this.field_J, this.field_u, this.field_i, param0);
            this.a(this.field_i, this.field_u, this.field_J, this.field_s, param0);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "sk.N(" + param0 + ')');
        }
    }

    private final void k(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        lf stackIn_39_0 = null;
        Object stackIn_52_0 = null;
        lf stackIn_52_1 = null;
        Object stackIn_70_0 = null;
        lf stackIn_70_1 = null;
        Object stackIn_91_0 = null;
        lf stackIn_91_1 = null;
        Object stackIn_114_0 = null;
        lf stackIn_114_1 = null;
        Object stackIn_136_0 = null;
        lf stackIn_136_1 = null;
        lf stackIn_139_0 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        lf stackOut_38_0 = null;
        Object stackOut_134_0 = null;
        lf stackOut_134_1 = null;
        lf stackOut_137_0 = null;
        Object stackOut_51_0 = null;
        lf stackOut_51_1 = null;
        Object stackOut_69_0 = null;
        lf stackOut_69_1 = null;
        Object stackOut_89_0 = null;
        lf stackOut_89_1 = null;
        Object stackOut_113_0 = null;
        lf stackOut_113_1 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 13047) {
                break L1;
              } else {
                this.a((byte) 42, -38, -15, 53);
                break L1;
              }
            }
            L2: {
              L3: {
                if ((this.field_u ^ -1) != (this.field_J ^ -1)) {
                  break L3;
                } else {
                  var2_int = 0;
                  L4: while (true) {
                    L5: {
                      if (var2_int >= 3 + -this.field_J) {
                        break L5;
                      } else {
                        if (var4 != 0) {
                          break L2;
                        } else {
                          L6: {
                            if (null == this.field_s[var2_int]) {
                              break L6;
                            } else {
                              if (null == this.field_i[var2_int]) {
                                break L6;
                              } else {
                                if (!this.field_s[var2_int].b((byte) -74)) {
                                  break L6;
                                } else {
                                  if (!this.field_i[var2_int].b((byte) -110)) {
                                    break L6;
                                  } else {
                                    L7: {
                                      if (ns.a(false, 1000, vv.field_b) < 500) {
                                        break L7;
                                      } else {
                                        this.field_s[var2_int].a(2, (byte) -113);
                                        this.field_s[var2_int].field_m = je.field_K[this.field_a][0];
                                        this.field_i[var2_int].a(1, (byte) -119);
                                        if (var4 == 0) {
                                          break L6;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                    this.field_s[var2_int].a(1, (byte) -116);
                                    this.field_i[var2_int].field_f = 2;
                                    this.field_i[var2_int].field_m = je.field_K[this.field_c][0];
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                          var2_int++;
                          if (var4 == 0) {
                            continue L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    if (var4 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              L8: {
                L9: {
                  if (2 == this.field_J) {
                    break L9;
                  } else {
                    if (-3 != (this.field_u ^ -1)) {
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
                var2_int = 1;
                var3 = 0;
                L10: while (true) {
                  L11: {
                    L12: {
                      if ((-this.field_J + 3 ^ -1) >= (var3 ^ -1)) {
                        break L12;
                      } else {
                        stackOut_38_0 = this.field_s[var3];
                        stackIn_139_0 = stackOut_38_0;
                        stackIn_39_0 = stackOut_38_0;
                        if (var4 != 0) {
                          L13: while (true) {
                            stackIn_139_0.field_m = ns.a(false, 5, vv.field_b);
                            L14: while (true) {
                              var3++;
                              if (var4 == 0) {
                                if ((var3 ^ -1) <= (3 - this.field_u ^ -1)) {
                                  break L11;
                                } else {
                                  if (var4 != 0) {
                                    break L2;
                                  } else {
                                    stackOut_134_0 = null;
                                    stackOut_134_1 = this.field_i[var3];
                                    stackIn_136_0 = stackOut_134_0;
                                    stackIn_136_1 = stackOut_134_1;
                                    if (stackIn_136_0 == stackIn_136_1) {
                                      continue L14;
                                    } else {
                                      this.field_i[var3].field_f = 1;
                                      stackOut_137_0 = this.field_i[var3];
                                      stackIn_139_0 = stackOut_137_0;
                                      continue L13;
                                    }
                                  }
                                }
                              } else {
                                break L11;
                              }
                            }
                          }
                        } else {
                          L15: {
                            if (stackIn_39_0 == null) {
                              break L15;
                            } else {
                              if (!this.field_s[var3].b((byte) -74)) {
                                var2_int = 0;
                                break L15;
                              } else {
                                break L15;
                              }
                            }
                          }
                          var3++;
                          if (var4 == 0) {
                            continue L10;
                          } else {
                            break L12;
                          }
                        }
                      }
                    }
                    var3 = 0;
                    L16: while (true) {
                      L17: {
                        L18: {
                          if ((var3 ^ -1) <= (-this.field_u + 3 ^ -1)) {
                            break L18;
                          } else {
                            stackOut_51_0 = null;
                            stackOut_51_1 = this.field_i[var3];
                            stackIn_136_0 = stackOut_51_0;
                            stackIn_136_1 = stackOut_51_1;
                            stackIn_52_0 = stackOut_51_0;
                            stackIn_52_1 = stackOut_51_1;
                            if (var4 != 0) {
                              break L17;
                            } else {
                              L19: {
                                if (stackIn_52_0 == stackIn_52_1) {
                                  break L19;
                                } else {
                                  if (this.field_i[var3].b((byte) 30)) {
                                    break L19;
                                  } else {
                                    var2_int = 0;
                                    break L19;
                                  }
                                }
                              }
                              var3++;
                              if (var4 == 0) {
                                continue L16;
                              } else {
                                break L18;
                              }
                            }
                          }
                        }
                        if (var2_int == 0) {
                          break L11;
                        } else {
                          L20: {
                            if (-501 >= (ns.a(false, 1000, vv.field_b) ^ -1)) {
                              break L20;
                            } else {
                              L21: {
                                L22: {
                                  L23: {
                                    L24: {
                                      if ((this.field_J ^ -1) == -3) {
                                        break L24;
                                      } else {
                                        var3 = 0;
                                        L25: while (true) {
                                          L26: {
                                            if (var3 >= 3 - this.field_J) {
                                              break L26;
                                            } else {
                                              stackOut_69_0 = null;
                                              stackOut_69_1 = this.field_s[var3];
                                              stackIn_91_0 = stackOut_69_0;
                                              stackIn_91_1 = stackOut_69_1;
                                              stackIn_70_0 = stackOut_69_0;
                                              stackIn_70_1 = stackOut_69_1;
                                              if (var4 != 0) {
                                                L27: while (true) {
                                                  L28: {
                                                    if (stackIn_91_0 == stackIn_91_1) {
                                                      break L28;
                                                    } else {
                                                      this.field_i[var3].field_f = 2;
                                                      this.field_i[var3].field_m = je.field_K[this.field_c][0] + -ns.a(false, 5, vv.field_b);
                                                      break L28;
                                                    }
                                                  }
                                                  var3++;
                                                  if (var4 == 0) {
                                                    if (3 + -this.field_u <= var3) {
                                                      break L22;
                                                    } else {
                                                      if (var4 != 0) {
                                                        break L11;
                                                      } else {
                                                        stackOut_89_0 = null;
                                                        stackOut_89_1 = this.field_i[var3];
                                                        stackIn_91_0 = stackOut_89_0;
                                                        stackIn_91_1 = stackOut_89_1;
                                                        continue L27;
                                                      }
                                                    }
                                                  } else {
                                                    break L22;
                                                  }
                                                }
                                              } else {
                                                L29: {
                                                  if (stackIn_70_0 != stackIn_70_1) {
                                                    this.field_s[var3].field_f = 1;
                                                    break L29;
                                                  } else {
                                                    break L29;
                                                  }
                                                }
                                                L30: {
                                                  if (null == this.field_s[var3]) {
                                                    break L30;
                                                  } else {
                                                    this.field_s[var3].field_m = ns.a(false, 5, vv.field_b);
                                                    break L30;
                                                  }
                                                }
                                                var3++;
                                                if (var4 == 0) {
                                                  continue L25;
                                                } else {
                                                  break L26;
                                                }
                                              }
                                            }
                                          }
                                          if (var4 == 0) {
                                            break L23;
                                          } else {
                                            break L24;
                                          }
                                        }
                                      }
                                    }
                                    if (null == this.field_s[0]) {
                                      break L23;
                                    } else {
                                      this.field_s[0].a(1, (byte) -86);
                                      break L23;
                                    }
                                  }
                                  if (2 == this.field_u) {
                                    break L21;
                                  } else {
                                    var3 = 0;
                                    L31: while (true) {
                                      if (3 + -this.field_u <= var3) {
                                        break L22;
                                      } else {
                                        if (var4 != 0) {
                                          break L11;
                                        } else {
                                          stackOut_89_0 = null;
                                          stackOut_89_1 = this.field_i[var3];
                                          stackIn_91_0 = stackOut_89_0;
                                          stackIn_91_1 = stackOut_89_1;
                                          L32: {
                                            if (stackIn_91_0 == stackIn_91_1) {
                                              break L32;
                                            } else {
                                              this.field_i[var3].field_f = 2;
                                              this.field_i[var3].field_m = je.field_K[this.field_c][0] + -ns.a(false, 5, vv.field_b);
                                              break L32;
                                            }
                                          }
                                          var3++;
                                          if (var4 == 0) {
                                            continue L31;
                                          } else {
                                            break L22;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                if (var4 == 0) {
                                  break L11;
                                } else {
                                  break L21;
                                }
                              }
                              if (this.field_i[0] != null) {
                                this.field_i[0].field_f = 2;
                                this.field_i[0].field_m = je.field_K[this.field_c][0];
                                if (var4 == 0) {
                                  break L11;
                                } else {
                                  break L20;
                                }
                              } else {
                                break L11;
                              }
                            }
                          }
                          L33: {
                            L34: {
                              if ((this.field_J ^ -1) != -3) {
                                break L34;
                              } else {
                                if (null == this.field_s[0]) {
                                  break L33;
                                } else {
                                  this.field_s[0].field_f = 2;
                                  this.field_s[0].field_m = je.field_K[this.field_a][0];
                                  if (var4 == 0) {
                                    break L33;
                                  } else {
                                    break L34;
                                  }
                                }
                              }
                            }
                            var3 = 0;
                            L35: while (true) {
                              if ((var3 ^ -1) <= (-this.field_J + 3 ^ -1)) {
                                break L33;
                              } else {
                                stackOut_113_0 = null;
                                stackOut_113_1 = this.field_s[var3];
                                stackIn_136_0 = stackOut_113_0;
                                stackIn_136_1 = stackOut_113_1;
                                stackIn_114_0 = stackOut_113_0;
                                stackIn_114_1 = stackOut_113_1;
                                if (var4 != 0) {
                                  break L17;
                                } else {
                                  L36: {
                                    if (stackIn_114_0 != stackIn_114_1) {
                                      this.field_s[var3].field_f = 2;
                                      break L36;
                                    } else {
                                      break L36;
                                    }
                                  }
                                  L37: {
                                    if (this.field_s[var3] != null) {
                                      this.field_s[var3].field_m = je.field_K[this.field_a][0] + -ns.a(false, 5, vv.field_b);
                                      break L37;
                                    } else {
                                      break L37;
                                    }
                                  }
                                  var3++;
                                  if (var4 == 0) {
                                    continue L35;
                                  } else {
                                    break L33;
                                  }
                                }
                              }
                            }
                          }
                          L38: {
                            if ((this.field_u ^ -1) != -3) {
                              break L38;
                            } else {
                              if (this.field_i[0] != null) {
                                this.field_i[0].a(1, (byte) -122);
                                if (var4 == 0) {
                                  break L11;
                                } else {
                                  break L38;
                                }
                              } else {
                                break L11;
                              }
                            }
                          }
                          var3 = 0;
                          L39: while (true) {
                            if ((var3 ^ -1) <= (3 - this.field_u ^ -1)) {
                              break L11;
                            } else {
                              if (var4 != 0) {
                                break L2;
                              } else {
                                stackOut_134_0 = null;
                                stackOut_134_1 = this.field_i[var3];
                                stackIn_136_0 = stackOut_134_0;
                                stackIn_136_1 = stackOut_134_1;
                                L40: {
                                  if (stackIn_136_0 == stackIn_136_1) {
                                    break L40;
                                  } else {
                                    this.field_i[var3].field_f = 1;
                                    stackOut_137_0 = this.field_i[var3];
                                    stackIn_139_0 = stackOut_137_0;
                                    stackIn_139_0.field_m = ns.a(false, 5, vv.field_b);
                                    break L40;
                                  }
                                }
                                var3++;
                                if (var4 == 0) {
                                  continue L39;
                                } else {
                                  break L11;
                                }
                              }
                            }
                          }
                        }
                      }
                      L41: while (true) {
                        L42: {
                          if (stackIn_136_0 == stackIn_136_1) {
                            break L42;
                          } else {
                            this.field_i[var3].field_f = 1;
                            stackOut_137_0 = this.field_i[var3];
                            stackIn_139_0 = stackOut_137_0;
                            stackIn_139_0.field_m = ns.a(false, 5, vv.field_b);
                            break L42;
                          }
                        }
                        var3++;
                        if (var4 == 0) {
                          if ((var3 ^ -1) <= (3 - this.field_u ^ -1)) {
                            break L11;
                          } else {
                            if (var4 != 0) {
                              break L2;
                            } else {
                              stackOut_134_0 = null;
                              stackOut_134_1 = this.field_i[var3];
                              stackIn_136_0 = stackOut_134_0;
                              stackIn_136_1 = stackOut_134_1;
                              continue L41;
                            }
                          }
                        } else {
                          break L11;
                        }
                      }
                    }
                  }
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L8;
                  }
                }
              }
              L43: {
                if (-1 == (this.field_J ^ -1)) {
                  break L43;
                } else {
                  L44: {
                    if (null == this.field_s[0]) {
                      break L44;
                    } else {
                      if (!this.field_s[0].b((byte) -61)) {
                        break L44;
                      } else {
                        L45: {
                          L46: {
                            if (null == this.field_i[0]) {
                              break L46;
                            } else {
                              if (!this.field_i[0].b((byte) 104)) {
                                break L46;
                              } else {
                                if (null == this.field_i[1]) {
                                  break L45;
                                } else {
                                  break L46;
                                }
                              }
                            }
                          }
                          if (this.field_i[1] == null) {
                            break L44;
                          } else {
                            if (this.field_i[1].b((byte) 33)) {
                              break L45;
                            } else {
                              break L44;
                            }
                          }
                        }
                        L47: {
                          if (500 <= ns.a(false, 1000, vv.field_b)) {
                            break L47;
                          } else {
                            L48: {
                              if (null != this.field_s[0]) {
                                this.field_s[0].field_m = je.field_K[this.field_a][0] + -ns.a(false, 5, vv.field_b);
                                this.field_s[0].field_f = 2;
                                break L48;
                              } else {
                                break L48;
                              }
                            }
                            L49: {
                              if (this.field_i[1] == null) {
                                break L49;
                              } else {
                                if (!this.field_i[1].b((byte) -80)) {
                                  break L49;
                                } else {
                                  this.field_i[1].field_m = je.field_K[this.field_c][0] + -ns.a(false, 5, vv.field_b);
                                  this.field_i[1].field_f = 1;
                                  if (var4 == 0) {
                                    break L44;
                                  } else {
                                    break L49;
                                  }
                                }
                              }
                            }
                            if (this.field_i[0] == null) {
                              break L44;
                            } else {
                              this.field_i[0].field_m = je.field_K[this.field_c][0] - ns.a(false, 5, vv.field_b);
                              this.field_i[0].field_f = 1;
                              if (var4 == 0) {
                                break L44;
                              } else {
                                break L47;
                              }
                            }
                          }
                        }
                        L50: {
                          if (this.field_s[0] != null) {
                            this.field_s[0].field_m = ns.a(false, 5, vv.field_b);
                            this.field_s[0].field_f = 1;
                            break L50;
                          } else {
                            break L50;
                          }
                        }
                        L51: {
                          L52: {
                            if (this.field_i[1] == null) {
                              break L52;
                            } else {
                              if (this.field_i[1].b((byte) -56)) {
                                break L51;
                              } else {
                                break L52;
                              }
                            }
                          }
                          if (null == this.field_i[0]) {
                            break L44;
                          } else {
                            this.field_i[0].field_m = je.field_K[this.field_c][0] - ns.a(false, 5, vv.field_b);
                            this.field_i[0].field_f = 2;
                            if (var4 == 0) {
                              break L44;
                            } else {
                              break L51;
                            }
                          }
                        }
                        this.field_i[1].field_m = je.field_K[this.field_c][0] - ns.a(false, 5, vv.field_b);
                        this.field_i[1].field_f = 2;
                        break L44;
                      }
                    }
                  }
                  L53: {
                    if (this.field_s[1] == null) {
                      break L53;
                    } else {
                      if (!this.field_s[1].b((byte) -45)) {
                        break L53;
                      } else {
                        L54: {
                          L55: {
                            if (null == this.field_i[0]) {
                              break L55;
                            } else {
                              if (!this.field_i[0].b((byte) -90)) {
                                break L55;
                              } else {
                                if (this.field_i[1] == null) {
                                  break L54;
                                } else {
                                  break L55;
                                }
                              }
                            }
                          }
                          if (null == this.field_i[2]) {
                            break L53;
                          } else {
                            if (this.field_i[2].b((byte) 29)) {
                              break L54;
                            } else {
                              break L53;
                            }
                          }
                        }
                        L56: {
                          if (ns.a(false, 1000, vv.field_b) < 500) {
                            break L56;
                          } else {
                            L57: {
                              if (this.field_s[1] == null) {
                                break L57;
                              } else {
                                this.field_s[1].field_m = ns.a(false, 5, vv.field_b);
                                this.field_s[1].field_f = 1;
                                break L57;
                              }
                            }
                            L58: {
                              L59: {
                                if (this.field_i[2] == null) {
                                  break L59;
                                } else {
                                  if (this.field_i[2].b((byte) -114)) {
                                    break L58;
                                  } else {
                                    break L59;
                                  }
                                }
                              }
                              if (null != this.field_i[0]) {
                                this.field_i[0].field_m = je.field_K[this.field_c][0] + -ns.a(false, 30, vv.field_b);
                                this.field_i[0].field_f = 2;
                                if (var4 == 0) {
                                  break L53;
                                } else {
                                  break L58;
                                }
                              } else {
                                break L53;
                              }
                            }
                            this.field_i[2].field_m = je.field_K[this.field_c][0] - ns.a(false, 5, vv.field_b);
                            this.field_i[2].field_f = 2;
                            if (var4 == 0) {
                              break L53;
                            } else {
                              break L56;
                            }
                          }
                        }
                        L60: {
                          if (null == this.field_s[1]) {
                            break L60;
                          } else {
                            this.field_s[1].field_m = je.field_K[this.field_a][0] - ns.a(false, 5, vv.field_b);
                            this.field_s[1].field_f = 2;
                            break L60;
                          }
                        }
                        L61: {
                          if (null == this.field_i[2]) {
                            break L61;
                          } else {
                            if (!this.field_i[2].b((byte) -112)) {
                              break L61;
                            } else {
                              this.field_i[2].field_m = ns.a(false, 5, vv.field_b);
                              this.field_i[2].field_f = 1;
                              if (var4 == 0) {
                                break L53;
                              } else {
                                break L61;
                              }
                            }
                          }
                        }
                        if (this.field_i[0] != null) {
                          this.field_i[0].field_m = ns.a(false, 5, vv.field_b);
                          this.field_i[0].field_f = 1;
                          break L53;
                        } else {
                          break L53;
                        }
                      }
                    }
                  }
                  if (this.field_i[0] == null) {
                    break L2;
                  } else {
                    if (!this.field_i[0].b((byte) -70)) {
                      break L2;
                    } else {
                      L62: {
                        L63: {
                          if (this.field_i[1] == null) {
                            break L63;
                          } else {
                            if (-1 == this.field_i[1].field_f) {
                              break L63;
                            } else {
                              if (null == this.field_i[2]) {
                                break L63;
                              } else {
                                if (-1 != this.field_i[2].field_f) {
                                  break L62;
                                } else {
                                  break L63;
                                }
                              }
                            }
                          }
                        }
                        L64: {
                          L65: {
                            if (this.field_i[1] == null) {
                              break L65;
                            } else {
                              if (-1 != this.field_i[1].field_f) {
                                break L64;
                              } else {
                                break L65;
                              }
                            }
                          }
                          if (this.field_i[2] == null) {
                            break L2;
                          } else {
                            if (-1 != this.field_i[2].field_f) {
                              if (null == this.field_i[0]) {
                                break L2;
                              } else {
                                this.field_i[0].field_m = this.field_i[2].field_m + ns.a(false, 5, vv.field_b);
                                this.field_i[0].field_f = this.field_i[2].field_f;
                                if (var4 == 0) {
                                  break L2;
                                } else {
                                  break L64;
                                }
                              }
                            } else {
                              break L2;
                            }
                          }
                        }
                        if (null != this.field_i[0]) {
                          this.field_i[0].field_m = this.field_i[1].field_m + ns.a(false, 5, vv.field_b);
                          this.field_i[0].field_f = this.field_i[1].field_f;
                          if (var4 == 0) {
                            break L2;
                          } else {
                            break L62;
                          }
                        } else {
                          break L2;
                        }
                      }
                      L66: {
                        if (-501 < (ns.a(false, 1000, vv.field_b) ^ -1)) {
                          break L66;
                        } else {
                          if (this.field_i[0] != null) {
                            this.field_i[0].field_m = this.field_i[1].field_m + ns.a(false, 5, vv.field_b);
                            this.field_i[0].field_f = this.field_i[1].field_f;
                            if (var4 == 0) {
                              break L2;
                            } else {
                              break L66;
                            }
                          } else {
                            break L2;
                          }
                        }
                      }
                      if (null != this.field_i[0]) {
                        this.field_i[0].field_m = this.field_i[2].field_m - -ns.a(false, 5, vv.field_b);
                        this.field_i[0].field_f = this.field_i[2].field_f;
                        if (var4 == 0) {
                          break L2;
                        } else {
                          break L43;
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              L67: {
                if (this.field_i[0] == null) {
                  break L67;
                } else {
                  if (!this.field_i[0].b((byte) -126)) {
                    break L67;
                  } else {
                    L68: {
                      L69: {
                        if (null == this.field_s[0]) {
                          break L69;
                        } else {
                          if (!this.field_s[0].b((byte) 118)) {
                            break L69;
                          } else {
                            if (this.field_s[1] == null) {
                              break L68;
                            } else {
                              break L69;
                            }
                          }
                        }
                      }
                      if (this.field_s[1] == null) {
                        break L67;
                      } else {
                        if (this.field_s[1].b((byte) 117)) {
                          break L68;
                        } else {
                          break L67;
                        }
                      }
                    }
                    L70: {
                      if ((ns.a(false, 1000, vv.field_b) ^ -1) > -501) {
                        break L70;
                      } else {
                        L71: {
                          if (this.field_i[0] != null) {
                            this.field_i[0].field_m = ns.a(false, 5, vv.field_b);
                            this.field_i[0].field_f = 1;
                            break L71;
                          } else {
                            break L71;
                          }
                        }
                        L72: {
                          L73: {
                            if (null == this.field_s[1]) {
                              break L73;
                            } else {
                              if (this.field_s[1].b((byte) 126)) {
                                break L72;
                              } else {
                                break L73;
                              }
                            }
                          }
                          if (null == this.field_s[0]) {
                            break L67;
                          } else {
                            this.field_s[0].field_m = je.field_K[this.field_a][0] + -ns.a(false, 5, vv.field_b);
                            this.field_s[0].field_f = 2;
                            if (var4 == 0) {
                              break L67;
                            } else {
                              break L72;
                            }
                          }
                        }
                        this.field_s[1].field_m = je.field_K[this.field_a][0] + -ns.a(false, 5, vv.field_b);
                        this.field_s[1].field_f = 2;
                        if (var4 == 0) {
                          break L67;
                        } else {
                          break L70;
                        }
                      }
                    }
                    L74: {
                      L75: {
                        this.field_i[0].field_m = je.field_K[this.field_c][0] + -ns.a(false, 5, vv.field_b);
                        this.field_i[0].field_f = 2;
                        if (null == this.field_s[1]) {
                          break L75;
                        } else {
                          if (this.field_s[1].b((byte) 112)) {
                            break L74;
                          } else {
                            break L75;
                          }
                        }
                      }
                      if (this.field_s[0] != null) {
                        this.field_s[0].field_m = ns.a(false, 5, vv.field_b);
                        this.field_s[0].field_f = 1;
                        if (var4 == 0) {
                          break L67;
                        } else {
                          break L74;
                        }
                      } else {
                        break L67;
                      }
                    }
                    this.field_s[1].field_m = ns.a(false, 5, vv.field_b);
                    this.field_s[1].field_f = 1;
                    break L67;
                  }
                }
              }
              L76: {
                if (this.field_i[1] == null) {
                  break L76;
                } else {
                  if (!this.field_i[1].b((byte) -109)) {
                    break L76;
                  } else {
                    L77: {
                      L78: {
                        if (null == this.field_s[0]) {
                          break L78;
                        } else {
                          if (!this.field_s[0].b((byte) 72)) {
                            break L78;
                          } else {
                            if (null == this.field_s[1]) {
                              break L77;
                            } else {
                              break L78;
                            }
                          }
                        }
                      }
                      if (null == this.field_s[2]) {
                        break L76;
                      } else {
                        if (!this.field_s[2].b((byte) 99)) {
                          break L76;
                        } else {
                          break L77;
                        }
                      }
                    }
                    L79: {
                      if ((ns.a(false, 1000, vv.field_b) ^ -1) <= -501) {
                        break L79;
                      } else {
                        L80: {
                          if (null != this.field_i[1]) {
                            this.field_i[1].field_m = je.field_K[this.field_c][0] - ns.a(false, 5, vv.field_b);
                            this.field_i[1].field_f = 2;
                            break L80;
                          } else {
                            break L80;
                          }
                        }
                        L81: {
                          if (null == this.field_s[2]) {
                            break L81;
                          } else {
                            if (!this.field_s[2].b((byte) -50)) {
                              break L81;
                            } else {
                              this.field_s[2].field_m = ns.a(false, 5, vv.field_b);
                              this.field_s[2].field_f = 1;
                              if (var4 == 0) {
                                break L76;
                              } else {
                                break L81;
                              }
                            }
                          }
                        }
                        if (this.field_s[0] == null) {
                          break L76;
                        } else {
                          this.field_s[0].field_m = ns.a(false, 5, vv.field_b);
                          this.field_s[0].field_f = 1;
                          if (var4 == 0) {
                            break L76;
                          } else {
                            break L79;
                          }
                        }
                      }
                    }
                    L82: {
                      if (null == this.field_i[1]) {
                        break L82;
                      } else {
                        this.field_i[1].field_m = ns.a(false, 5, vv.field_b);
                        this.field_i[1].field_f = 1;
                        break L82;
                      }
                    }
                    L83: {
                      if (this.field_s[2] == null) {
                        break L83;
                      } else {
                        if (!this.field_s[2].b((byte) -122)) {
                          break L83;
                        } else {
                          this.field_s[2].field_m = je.field_K[this.field_a][0] + -ns.a(false, 5, vv.field_b);
                          this.field_s[2].field_f = 2;
                          if (var4 == 0) {
                            break L76;
                          } else {
                            break L83;
                          }
                        }
                      }
                    }
                    if (null == this.field_s[0]) {
                      break L76;
                    } else {
                      this.field_s[0].field_m = je.field_K[this.field_a][0] + -ns.a(false, 5, vv.field_b);
                      this.field_s[0].field_f = 2;
                      break L76;
                    }
                  }
                }
              }
              if (null == this.field_s[0]) {
                break L2;
              } else {
                if (this.field_s[0].b((byte) 120)) {
                  L84: {
                    L85: {
                      if (null == this.field_s[1]) {
                        break L85;
                      } else {
                        if (-1 == this.field_s[1].field_f) {
                          break L85;
                        } else {
                          if (null == this.field_s[2]) {
                            break L85;
                          } else {
                            if (this.field_s[2].field_f != -1) {
                              break L84;
                            } else {
                              break L85;
                            }
                          }
                        }
                      }
                    }
                    L86: {
                      L87: {
                        if (this.field_s[1] == null) {
                          break L87;
                        } else {
                          if ((this.field_s[1].field_f ^ -1) != 0) {
                            break L86;
                          } else {
                            break L87;
                          }
                        }
                      }
                      if (null == this.field_s[2]) {
                        break L2;
                      } else {
                        if ((this.field_s[2].field_f ^ -1) == 0) {
                          break L2;
                        } else {
                          if (null == this.field_s[0]) {
                            break L2;
                          } else {
                            this.field_s[0].field_m = this.field_s[2].field_m - -ns.a(false, 5, vv.field_b);
                            this.field_s[0].field_f = this.field_s[2].field_f;
                            if (var4 == 0) {
                              break L2;
                            } else {
                              break L86;
                            }
                          }
                        }
                      }
                    }
                    if (null != this.field_s[0]) {
                      this.field_s[0].field_m = this.field_s[1].field_m + ns.a(false, 5, vv.field_b);
                      this.field_s[0].field_f = this.field_s[1].field_f;
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L84;
                      }
                    } else {
                      break L2;
                    }
                  }
                  L88: {
                    if (ns.a(false, 1000, vv.field_b) < 500) {
                      break L88;
                    } else {
                      if (null != this.field_s[0]) {
                        this.field_s[0].field_m = this.field_s[1].field_m + ns.a(false, 5, vv.field_b);
                        this.field_s[0].field_f = this.field_s[1].field_f;
                        if (var4 == 0) {
                          break L2;
                        } else {
                          break L88;
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (this.field_s[0] == null) {
                    break L2;
                  } else {
                    this.field_s[0].field_m = this.field_s[1].field_m + ns.a(false, 5, vv.field_b);
                    this.field_s[0].field_f = this.field_s[2].field_f;
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "sk.CA(" + param0 + ')');
        }
    }

    private final void e(int param0) {
        if (!(this.field_l != null)) {
            return;
        }
        this.field_B.field_c[0] = this.field_k.field_x % this.field_r;
        this.field_B.field_c[1] = this.field_k.field_x / this.field_r;
        if (param0 != 2) {
            return;
        }
        try {
            this.field_B.f(-106);
            this.field_B.i(0);
            this.field_l[1] = this.field_B.field_e[1];
            this.field_l[0] = this.field_B.field_e[0];
            this.field_k.field_m = this.field_l[0];
            this.field_k.field_v = this.field_l[1];
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "sk.W(" + param0 + ')');
        }
    }

    private final void o(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.b(this.field_i, 12579);
              if ((this.field_F ^ -1) != -31) {
                break L1;
              } else {
                this.field_n = 1;
                break L1;
              }
            }
            L2: {
              if (param0 <= -116) {
                break L2;
              } else {
                this.a((byte) -35);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "sk.A(" + param0 + ')');
        }
    }

    final static String i(int param0) {
        RuntimeException var1 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        String stackIn_13_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_12_0 = null;
        String stackOut_10_0 = null;
        String stackOut_7_0 = null;
        String stackOut_4_0 = null;
        try {
          L0: {
            L1: {
              if (param0 == -4938) {
                break L1;
              } else {
                field_N = (String) null;
                break L1;
              }
            }
            if (du.field_d != oh.field_L) {
              if (du.field_d != mh.field_b) {
                if (se.field_g.a((byte) -47)) {
                  stackOut_12_0 = ga.field_d;
                  stackIn_13_0 = stackOut_12_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackOut_10_0 = jh.field_j;
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_7_0 = jh.field_j;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_4_0 = ue.field_a;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1), "sk.G(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return stackIn_13_0;
            }
          }
        }
    }

    public final void c(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int[] stackIn_50_0 = null;
        int stackIn_63_0 = 0;
        int stackIn_67_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_49_0 = null;
        int[] stackOut_47_0 = null;
        int stackOut_62_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_64_0 = 0;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                this.field_H.b();
                this.a((byte) 99, 0, 0, -1);
                tm.a();
                tm.c();
                if (!this.field_d) {
                  break L2;
                } else {
                  L3: {
                    if ((this.field_n ^ -1) == -6) {
                      break L3;
                    } else {
                      L4: {
                        if (-7 == (this.field_n ^ -1)) {
                          break L4;
                        } else {
                          L5: {
                            if (-9 != (this.field_n ^ -1)) {
                              break L5;
                            } else {
                              if (-9 == (this.field_L ^ -1)) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          L6: {
                            if (this.field_n == 7) {
                              break L6;
                            } else {
                              if (8 != this.field_n) {
                                break L1;
                              } else {
                                if (-8 == (this.field_L ^ -1)) {
                                  break L6;
                                } else {
                                  break L1;
                                }
                              }
                            }
                          }
                          this.a(this.field_y, this.field_s, (byte) 83);
                          if (var9 == 0) {
                            break L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                      this.a(false, this.field_i, (byte) 109, this.field_w, this.field_D);
                      if (var9 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  this.a(true, this.field_s, (byte) 109, this.field_y, this.field_D);
                  if (var9 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L7: {
                this.f((byte) -15);
                if (!this.field_o) {
                  break L7;
                } else {
                  qn.f(320, 0, 640, 480, 0);
                  if (var9 == 0) {
                    break L1;
                  } else {
                    break L7;
                  }
                }
              }
              if (!this.field_f) {
                break L1;
              } else {
                qn.f(0, 0, 320, 480, 0);
                break L1;
              }
            }
            L8: {
              L9: {
                var2_int = 21;
                var3 = 35;
                var4 = 93;
                var5 = 35;
                var6 = rs.field_k - var2_int - var4;
                var7 = var3 + 0;
                if (!iu.field_n) {
                  break L9;
                } else {
                  if (this.b((byte) -96)) {
                    stackOut_49_0 = ci.field_e;
                    stackIn_50_0 = stackOut_49_0;
                    break L8;
                  } else {
                    break L9;
                  }
                }
              }
              stackOut_47_0 = nd.field_b;
              stackIn_50_0 = stackOut_47_0;
              break L8;
            }
            L10: {
              var8 = stackIn_50_0;
              fe.a(var6, var7, var4, var5, il.field_s, var8, 0, 0, true);
              if (param0 < -119) {
                break L10;
              } else {
                this.field_C = 65;
                break L10;
              }
            }
            L11: {
              var2_int = var4 >> -1365344159;
              var3 = mp.k(-104) + (var5 >> 194242593);
              fe.c(em.field_c, var2_int + var6, var7 - -var3, 2236962, true);
              if (this.field_x == null) {
                break L11;
              } else {
                if (this.field_x.field_T != null) {
                  L12: {
                    var3 = 19;
                    if (ku.field_J != null) {
                      stackOut_62_0 = ku.field_J.field_x >> -3007455;
                      stackIn_63_0 = stackOut_62_0;
                      break L12;
                    } else {
                      stackOut_60_0 = 0;
                      stackIn_63_0 = stackOut_60_0;
                      break L12;
                    }
                  }
                  L13: {
                    var5 = stackIn_63_0;
                    if (ku.field_J == null) {
                      stackOut_66_0 = 0;
                      stackIn_67_0 = stackOut_66_0;
                      break L13;
                    } else {
                      stackOut_64_0 = ku.field_J.field_A >> -541784767;
                      stackIn_67_0 = stackOut_64_0;
                      break L13;
                    }
                  }
                  L14: {
                    var4 = stackIn_67_0;
                    var2_int = 17;
                    var6 = 0 + var2_int;
                    var7 = -var5 + (ag.field_I.field_D - var3);
                    if (this.field_e <= -1) {
                      break L14;
                    } else {
                      this.field_x.field_T[this.field_e].a(var6, this.field_x.field_lb[this.field_e], false, false, var7, false, false, 122);
                      break L14;
                    }
                  }
                  var6 = -var2_int + (so.field_b.field_a + -var4);
                  if ((this.field_g ^ -1) >= 0) {
                    break L11;
                  } else {
                    this.field_x.field_T[this.field_g].a(var6, this.field_x.field_lb[this.field_g], false, false, var7, false, false, 28);
                    break L11;
                  }
                } else {
                  break L11;
                }
              }
            }
            L15: {
              L16: {
                fe.b(0, 0, rs.field_k, se.field_a, dq.field_i, nd.field_b, 0, 0);
                so.field_b.a(5605);
                if (null == u.field_p) {
                  break L16;
                } else {
                  u.field_p.a(-66, this.field_H);
                  if (var9 == 0) {
                    break L15;
                  } else {
                    break L16;
                  }
                }
              }
              this.field_H.f(0, 0);
              break L15;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "sk.H(" + param0 + ')');
        }
    }

    private final void a(lf[] param0, int param1, int param2, int param3, lf[] param4) {
        RuntimeException var6 = null;
        int[] var6_array = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_176_0 = null;
        StringBuilder stackIn_176_1 = null;
        RuntimeException stackIn_178_0 = null;
        StringBuilder stackIn_178_1 = null;
        RuntimeException stackIn_179_0 = null;
        StringBuilder stackIn_179_1 = null;
        String stackIn_179_2 = null;
        RuntimeException stackIn_180_0 = null;
        StringBuilder stackIn_180_1 = null;
        RuntimeException stackIn_182_0 = null;
        StringBuilder stackIn_182_1 = null;
        RuntimeException stackIn_183_0 = null;
        StringBuilder stackIn_183_1 = null;
        String stackIn_183_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_175_0 = null;
        StringBuilder stackOut_175_1 = null;
        RuntimeException stackOut_178_0 = null;
        StringBuilder stackOut_178_1 = null;
        String stackOut_178_2 = null;
        RuntimeException stackOut_176_0 = null;
        StringBuilder stackOut_176_1 = null;
        String stackOut_176_2 = null;
        RuntimeException stackOut_179_0 = null;
        StringBuilder stackOut_179_1 = null;
        RuntimeException stackOut_182_0 = null;
        StringBuilder stackOut_182_1 = null;
        String stackOut_182_2 = null;
        RuntimeException stackOut_180_0 = null;
        StringBuilder stackOut_180_1 = null;
        String stackOut_180_2 = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_array = new int[3 + -param2];
              var7 = param1;
              if (-3 == (param2 ^ -1)) {
                break L1;
              } else {
                L2: {
                  L3: {
                    if (1 == param2) {
                      break L3;
                    } else {
                      if (param2 == 0) {
                        L4: {
                          if (param4[0] == null) {
                            L5: {
                              L6: {
                                if (param0[0] == null) {
                                  break L6;
                                } else {
                                  if (!param0[0].field_d) {
                                    break L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              if (-2 != (param3 ^ -1)) {
                                break L4;
                              } else {
                                if (param0[1] == null) {
                                  break L4;
                                } else {
                                  if (!param0[1].field_d) {
                                    break L5;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                            }
                            var6_array[var7] = 0;
                            var7++;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        L7: {
                          if (null != param4[1]) {
                            break L7;
                          } else {
                            L8: {
                              L9: {
                                if (0 == param3) {
                                  break L9;
                                } else {
                                  if (null == param0[0]) {
                                    break L9;
                                  } else {
                                    if (!param0[0].field_d) {
                                      break L8;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                              }
                              if (-1 != (param3 ^ -1)) {
                                break L7;
                              } else {
                                if (param0[1] == null) {
                                  break L7;
                                } else {
                                  if (!param0[1].field_d) {
                                    break L8;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                            var6_array[var7] = 1;
                            var7++;
                            break L7;
                          }
                        }
                        if (param4[2] != null) {
                          break L2;
                        } else {
                          L10: {
                            L11: {
                              if (-3 != (param3 ^ -1)) {
                                break L11;
                              } else {
                                if (null == param0[0]) {
                                  break L11;
                                } else {
                                  if (!param0[0].field_d) {
                                    break L10;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                            }
                            L12: {
                              if (-2 != (param3 ^ -1)) {
                                break L12;
                              } else {
                                if (null == param0[1]) {
                                  break L12;
                                } else {
                                  if (!param0[1].field_d) {
                                    break L10;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                            }
                            if ((param3 ^ -1) != -1) {
                              break L2;
                            } else {
                              if (null == param0[2]) {
                                break L2;
                              } else {
                                if (!param0[2].field_d) {
                                  break L10;
                                } else {
                                  break L2;
                                }
                              }
                            }
                          }
                          var6_array[var7] = 2;
                          var7++;
                          if (var10 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                  L13: {
                    if (param4[0] == null) {
                      L14: {
                        L15: {
                          if (null == param0[0]) {
                            break L15;
                          } else {
                            if (!param0[0].field_d) {
                              break L14;
                            } else {
                              break L15;
                            }
                          }
                        }
                        if (-1 != (param3 ^ -1)) {
                          break L13;
                        } else {
                          if (null == param0[1]) {
                            break L13;
                          } else {
                            if (!param0[1].field_d) {
                              break L14;
                            } else {
                              break L13;
                            }
                          }
                        }
                      }
                      var6_array[var7] = 0;
                      var7++;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  if (null != param4[1]) {
                    break L2;
                  } else {
                    L16: {
                      L17: {
                        if (null == param0[0]) {
                          break L17;
                        } else {
                          if (!param0[0].field_d) {
                            break L16;
                          } else {
                            break L17;
                          }
                        }
                      }
                      if (-1 != (param3 ^ -1)) {
                        break L2;
                      } else {
                        if (null == param0[2]) {
                          break L2;
                        } else {
                          if (!param0[2].field_d) {
                            break L16;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                    var6_array[var7] = 1;
                    var7++;
                    if (var10 == 0) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                if (-1 != (var7 ^ -1)) {
                  L18: {
                    L19: {
                      var8 = -1;
                      var9 = var6_array[ns.a(false, var7, vv.field_b)];
                      if (1 != param2) {
                        break L19;
                      } else {
                        if (param4[2] == null) {
                          break L19;
                        } else {
                          var8 = 2;
                          if (var10 == 0) {
                            break L18;
                          } else {
                            break L19;
                          }
                        }
                      }
                    }
                    if ((param2 ^ -1) != -1) {
                      break L18;
                    } else {
                      L20: {
                        if (-3 != (var9 ^ -1)) {
                          break L20;
                        } else {
                          L21: {
                            if (null == param4[4]) {
                              break L21;
                            } else {
                              if (!param4[4].b(2166)) {
                                break L21;
                              } else {
                                var8 = 4;
                                if (var10 == 0) {
                                  break L18;
                                } else {
                                  break L21;
                                }
                              }
                            }
                          }
                          if (0 != param2) {
                            break L18;
                          } else {
                            if (null == param4[3]) {
                              break L18;
                            } else {
                              if (!param4[3].b(2166)) {
                                break L18;
                              } else {
                                var8 = 3;
                                if (var10 == 0) {
                                  break L18;
                                } else {
                                  break L20;
                                }
                              }
                            }
                          }
                        }
                      }
                      L22: {
                        if (null == param4[3]) {
                          break L22;
                        } else {
                          if (!param4[3].b(2166)) {
                            break L22;
                          } else {
                            var8 = 3;
                            if (var10 == 0) {
                              break L18;
                            } else {
                              break L22;
                            }
                          }
                        }
                      }
                      if (-1 != (param2 ^ -1)) {
                        break L18;
                      } else {
                        if (param4[4] == null) {
                          break L18;
                        } else {
                          if (!param4[4].b(2166)) {
                            break L18;
                          } else {
                            var8 = 4;
                            break L18;
                          }
                        }
                      }
                    }
                  }
                  L23: {
                    if (0 > (var8 ^ -1)) {
                      param4[var9] = param4[var8];
                      param4[var8] = null;
                      param4[var9].field_j = tn.field_W[param2][var9];
                      param4[var9].field_p = kw.field_P[param2][var9];
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L24: {
            var6 = decompiledCaughtException;
            stackOut_175_0 = (RuntimeException) (var6);
            stackOut_175_1 = new StringBuilder().append("sk.HA(");
            stackIn_178_0 = stackOut_175_0;
            stackIn_178_1 = stackOut_175_1;
            stackIn_176_0 = stackOut_175_0;
            stackIn_176_1 = stackOut_175_1;
            if (param0 == null) {
              stackOut_178_0 = (RuntimeException) ((Object) stackIn_178_0);
              stackOut_178_1 = (StringBuilder) ((Object) stackIn_178_1);
              stackOut_178_2 = "null";
              stackIn_179_0 = stackOut_178_0;
              stackIn_179_1 = stackOut_178_1;
              stackIn_179_2 = stackOut_178_2;
              break L24;
            } else {
              stackOut_176_0 = (RuntimeException) ((Object) stackIn_176_0);
              stackOut_176_1 = (StringBuilder) ((Object) stackIn_176_1);
              stackOut_176_2 = "{...}";
              stackIn_179_0 = stackOut_176_0;
              stackIn_179_1 = stackOut_176_1;
              stackIn_179_2 = stackOut_176_2;
              break L24;
            }
          }
          L25: {
            stackOut_179_0 = (RuntimeException) ((Object) stackIn_179_0);
            stackOut_179_1 = ((StringBuilder) (Object) stackIn_179_1).append(stackIn_179_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_182_0 = stackOut_179_0;
            stackIn_182_1 = stackOut_179_1;
            stackIn_180_0 = stackOut_179_0;
            stackIn_180_1 = stackOut_179_1;
            if (param4 == null) {
              stackOut_182_0 = (RuntimeException) ((Object) stackIn_182_0);
              stackOut_182_1 = (StringBuilder) ((Object) stackIn_182_1);
              stackOut_182_2 = "null";
              stackIn_183_0 = stackOut_182_0;
              stackIn_183_1 = stackOut_182_1;
              stackIn_183_2 = stackOut_182_2;
              break L25;
            } else {
              stackOut_180_0 = (RuntimeException) ((Object) stackIn_180_0);
              stackOut_180_1 = (StringBuilder) ((Object) stackIn_180_1);
              stackOut_180_2 = "{...}";
              stackIn_183_0 = stackOut_180_0;
              stackIn_183_1 = stackOut_180_1;
              stackIn_183_2 = stackOut_180_2;
              break L25;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_183_0), stackIn_183_2 + ')');
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

    private final void c(boolean param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_4_1 = null;
        Object stackIn_19_0 = null;
        Object stackIn_19_1 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_3_1 = null;
        Object stackOut_18_0 = null;
        Object stackOut_18_1 = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (var2_int >= this.field_s.length) {
                      break L4;
                    } else {
                      stackOut_3_0 = null;
                      stackOut_3_1 = this;
                      stackIn_19_0 = stackOut_3_0;
                      stackIn_19_1 = stackOut_3_1;
                      stackIn_4_0 = stackOut_3_0;
                      stackIn_4_1 = stackOut_3_1;
                      if (var3 != 0) {
                        L5: while (true) {
                          if (stackIn_19_0 == ((sk) (this)).field_D[var2_int]) {
                            break L2;
                          } else {
                            this.field_D[var2_int].d(59);
                            var2_int++;
                            if (var3 == 0) {
                              if ((this.field_D.length ^ -1) >= (var2_int ^ -1)) {
                                break L2;
                              } else {
                                stackOut_18_0 = null;
                                stackOut_18_1 = this;
                                stackIn_19_0 = stackOut_18_0;
                                stackIn_19_1 = stackOut_18_1;
                                continue L5;
                              }
                            } else {
                              break L3;
                            }
                          }
                        }
                      } else {
                        L6: {
                          if (stackIn_4_0 == ((sk) (this)).field_s[var2_int]) {
                            break L6;
                          } else {
                            this.field_s[var2_int].d((byte) 113);
                            if (!this.field_s[var2_int].field_l) {
                              break L6;
                            } else {
                              this.field_s[var2_int].field_l = false;
                              this.a((byte) -84, var2_int);
                              if (!this.field_h) {
                                break L6;
                              } else {
                                this.field_s[var2_int].a(0, 30, 1, -10, u.field_o[this.field_c][1], pk.field_T[this.field_c][1], (byte) 122);
                                break L6;
                              }
                            }
                          }
                        }
                        var2_int++;
                        if (var3 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  var2_int = 0;
                  L7: while (true) {
                    if ((this.field_D.length ^ -1) >= (var2_int ^ -1)) {
                      break L2;
                    } else {
                      stackOut_18_0 = null;
                      stackOut_18_1 = this;
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      if (stackIn_19_0 == ((sk) (this)).field_D[var2_int]) {
                        break L2;
                      } else {
                        this.field_D[var2_int].d(59);
                        var2_int++;
                        if (var3 == 0) {
                          continue L7;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                break L2;
              }
              if (!param0) {
                L8: {
                  if (0 != (this.field_F & 15)) {
                    break L8;
                  } else {
                    this.f(-24577);
                    break L8;
                  }
                }
                L9: {
                  if (this.field_D[-1 + this.field_D.length] == null) {
                    break L9;
                  } else {
                    if (-201 <= (this.field_D[-1 + this.field_D.length].field_f ^ -1)) {
                      break L9;
                    } else {
                      this.field_n = 6;
                      this.h(1);
                      break L9;
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
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "sk.KA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(byte param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 >= 86) {
                break L1;
              } else {
                field_j = (int[][]) null;
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  if (jv.field_a) {
                    break L4;
                  } else {
                    if (null != this.field_A) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                qn.b();
                if (var6 == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
              L5: {
                if ((param3 ^ -1) <= -1) {
                  break L5;
                } else {
                  this.field_A.f(param1, param2);
                  if (var6 == 0) {
                    break L2;
                  } else {
                    break L5;
                  }
                }
              }
              this.field_A.e(param1, param2, param3);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var5), "sk.LA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final int[] a(int param0, byte param1) {
        RuntimeException var3 = null;
        int[] var3_array = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] stackIn_3_0 = null;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int[] stackIn_14_0 = null;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int[] stackIn_23_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int[] stackOut_13_0 = null;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int[] stackOut_22_0 = null;
        int[] stackOut_2_0 = null;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param1 <= -126) {
              var3_array = new int[param0];
              var4 = new int[param0];
              var5 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var5 >= param0) {
                      break L3;
                    } else {
                      var3_array[var5] = var5;
                      var4[var5] = ns.a(false, 2147483647, vv.field_b);
                      var5++;
                      if (var9 != 0) {
                        break L2;
                      } else {
                        if (var9 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  var5 = 0;
                  break L2;
                }
                L4: while (true) {
                  stackOut_11_0 = var5 ^ -1;
                  stackOut_11_1 = param0 + -1 ^ -1;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  L5: while (true) {
                    L6: {
                      L7: {
                        if (stackIn_12_0 <= stackIn_12_1) {
                          break L7;
                        } else {
                          var6 = var5;
                          stackOut_13_0 = (int[]) (var4);
                          stackIn_23_0 = stackOut_13_0;
                          stackIn_14_0 = stackOut_13_0;
                          if (var9 != 0) {
                            break L6;
                          } else {
                            var7 = stackIn_14_0[var5];
                            var8 = var5 + 1;
                            L8: while (true) {
                              L9: {
                                if ((param0 ^ -1) >= (var8 ^ -1)) {
                                  break L9;
                                } else {
                                  stackOut_16_0 = var4[var8] ^ -1;
                                  stackOut_16_1 = var7 ^ -1;
                                  stackIn_12_0 = stackOut_16_0;
                                  stackIn_12_1 = stackOut_16_1;
                                  stackIn_17_0 = stackOut_16_0;
                                  stackIn_17_1 = stackOut_16_1;
                                  if (var9 != 0) {
                                    continue L5;
                                  } else {
                                    L10: {
                                      if (stackIn_17_0 < stackIn_17_1) {
                                        var7 = var4[var8];
                                        var6 = var8;
                                        break L10;
                                      } else {
                                        break L10;
                                      }
                                    }
                                    var8++;
                                    if (var9 == 0) {
                                      continue L8;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                              }
                              var8 = var3_array[var6];
                              var4[var6] = var4[var5];
                              var3_array[var6] = var3_array[var5];
                              var4[var5] = var7;
                              var3_array[var5] = var8;
                              var5++;
                              if (var9 == 0) {
                                continue L4;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                      }
                      stackOut_22_0 = (int[]) (var3_array);
                      stackIn_23_0 = stackOut_22_0;
                      break L6;
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            } else {
              stackOut_2_0 = (int[]) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3), "sk.J(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_23_0;
        }
    }

    private final void e(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        lf stackIn_14_0 = null;
        lf stackIn_43_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        lf stackOut_13_0 = null;
        lf stackOut_42_0 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (this.field_v == 0) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 > 47) {
                  break L1;
                } else {
                  this.field_u = -53;
                  break L1;
                }
              }
              L2: {
                L3: {
                  if (0 == this.field_I) {
                    break L3;
                  } else {
                    this.field_I = this.field_I - 1;
                    if (var4 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var2_int = 0;
                var3 = 0;
                var3 = 0;
                L4: while (true) {
                  L5: {
                    L6: {
                      if ((var3 ^ -1) <= (this.field_s.length ^ -1)) {
                        break L6;
                      } else {
                        stackOut_13_0 = this.field_s[var3];
                        stackIn_43_0 = stackOut_13_0;
                        stackIn_14_0 = stackOut_13_0;
                        if (var4 != 0) {
                          break L5;
                        } else {
                          L7: {
                            if (stackIn_14_0 == null) {
                              break L7;
                            } else {
                              if (this.field_s[var3].field_D != 0) {
                                break L7;
                              } else {
                                var2_int++;
                                break L7;
                              }
                            }
                          }
                          var3++;
                          if (var4 == 0) {
                            continue L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    if (var2_int == 0) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var2_int = ns.a(false, var2_int, vv.field_b) + 1;
                      var3 = 0;
                      var3 = 0;
                      L8: while (true) {
                        L9: {
                          if (var3 >= this.field_s.length) {
                            break L9;
                          } else {
                            if (0 >= var2_int) {
                              break L9;
                            } else {
                              L10: {
                                if (null == this.field_s[var3]) {
                                  break L10;
                                } else {
                                  L11: {
                                    if (this.field_s[var3].field_D == 0) {
                                      break L11;
                                    } else {
                                      if (var4 == 0) {
                                        break L10;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  var2_int--;
                                  break L10;
                                }
                              }
                              var3++;
                              if (var4 == 0) {
                                continue L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                        this.field_s[var3 - 1].a(2, (byte) -108);
                        this.field_s[var3 + -1].a(0, 30, 1, 0, u.field_o[this.field_c][0], pk.field_T[this.field_c][0], (byte) 122);
                        this.field_s[var3 + -1].field_d = true;
                        this.field_i[0].a(1, (byte) -109);
                        stackOut_42_0 = this.field_i[0];
                        stackIn_43_0 = stackOut_42_0;
                        break L5;
                      }
                    }
                  }
                  ((lf) (Object) stackIn_43_0).a(0, 30, 1, 20, u.field_o[this.field_a][1], pk.field_T[this.field_a][1], (byte) 122);
                  this.field_v = this.field_v - 1;
                  this.field_I = 20 + ns.a(false, 20, vv.field_b);
                  break L2;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "sk.IA(" + param0 + ')');
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

    final static void n(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 < -30) {
                break L1;
              } else {
                field_G = (jp) null;
                break L1;
              }
            }
            jm.field_g = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1), "sk.M(" + param0 + ')');
        }
    }

    private final boolean a(byte param0, int param1, lf[] param2, int param3, lf[] param4) {
        int[] var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_2_0 = 0;
        int stackIn_181_0 = 0;
        int stackIn_184_0 = 0;
        int stackIn_186_0 = 0;
        RuntimeException stackIn_188_0 = null;
        StringBuilder stackIn_188_1 = null;
        RuntimeException stackIn_190_0 = null;
        StringBuilder stackIn_190_1 = null;
        RuntimeException stackIn_191_0 = null;
        StringBuilder stackIn_191_1 = null;
        String stackIn_191_2 = null;
        RuntimeException stackIn_192_0 = null;
        StringBuilder stackIn_192_1 = null;
        RuntimeException stackIn_194_0 = null;
        StringBuilder stackIn_194_1 = null;
        RuntimeException stackIn_195_0 = null;
        StringBuilder stackIn_195_1 = null;
        String stackIn_195_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_185_0 = 0;
        int stackOut_183_0 = 0;
        int stackOut_180_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_187_0 = null;
        StringBuilder stackOut_187_1 = null;
        RuntimeException stackOut_190_0 = null;
        StringBuilder stackOut_190_1 = null;
        String stackOut_190_2 = null;
        RuntimeException stackOut_188_0 = null;
        StringBuilder stackOut_188_1 = null;
        String stackOut_188_2 = null;
        RuntimeException stackOut_191_0 = null;
        StringBuilder stackOut_191_1 = null;
        RuntimeException stackOut_194_0 = null;
        StringBuilder stackOut_194_1 = null;
        String stackOut_194_2 = null;
        RuntimeException stackOut_192_0 = null;
        StringBuilder stackOut_192_1 = null;
        String stackOut_192_2 = null;
        try {
          L0: {
            var6 = new int[3 - param1];
            var7 = 0;
            if ((param1 ^ -1) != -3) {
              L1: {
                L2: {
                  if (-2 == (param1 ^ -1)) {
                    break L2;
                  } else {
                    if (0 != param1) {
                      break L1;
                    } else {
                      L3: {
                        if (null == param4[0]) {
                          break L3;
                        } else {
                          if (param4[0].field_d) {
                            break L3;
                          } else {
                            if (param4[0].b(2166)) {
                              L4: {
                                L5: {
                                  if (param2[0] == null) {
                                    break L5;
                                  } else {
                                    if (param2[0].field_d) {
                                      break L5;
                                    } else {
                                      if (param2[0].b(2166)) {
                                        break L4;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  }
                                }
                                if (1 != param3) {
                                  break L3;
                                } else {
                                  if (null == param2[1]) {
                                    break L3;
                                  } else {
                                    if (param2[1].field_d) {
                                      break L3;
                                    } else {
                                      if (param2[1].b(2166)) {
                                        break L4;
                                      } else {
                                        break L3;
                                      }
                                    }
                                  }
                                }
                              }
                              var6[var7] = 0;
                              var7++;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      L6: {
                        if (param4[1] == null) {
                          break L6;
                        } else {
                          if (param4[1].field_d) {
                            break L6;
                          } else {
                            if (!param4[1].b(2166)) {
                              break L6;
                            } else {
                              L7: {
                                L8: {
                                  if ((param3 ^ -1) == -1) {
                                    break L8;
                                  } else {
                                    if (param2[0] == null) {
                                      break L8;
                                    } else {
                                      if (param2[0].field_d) {
                                        break L8;
                                      } else {
                                        if (param2[0].b(2166)) {
                                          break L7;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                  }
                                }
                                if (param3 != 0) {
                                  break L6;
                                } else {
                                  if (null == param2[1]) {
                                    break L6;
                                  } else {
                                    if (param2[1].field_d) {
                                      break L6;
                                    } else {
                                      if (!param2[1].b(2166)) {
                                        break L6;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                }
                              }
                              var6[var7] = 1;
                              var7++;
                              break L6;
                            }
                          }
                        }
                      }
                      if (null == param4[2]) {
                        break L1;
                      } else {
                        if (param4[2].field_d) {
                          break L1;
                        } else {
                          if (param4[2].b(2166)) {
                            L9: {
                              L10: {
                                if (param3 != 2) {
                                  break L10;
                                } else {
                                  if (param2[0] == null) {
                                    break L10;
                                  } else {
                                    if (param2[0].field_d) {
                                      break L10;
                                    } else {
                                      if (param2[0].b(2166)) {
                                        break L9;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                }
                              }
                              L11: {
                                if (param3 != 1) {
                                  break L11;
                                } else {
                                  if (param2[1] == null) {
                                    break L11;
                                  } else {
                                    if (param2[1].field_d) {
                                      break L11;
                                    } else {
                                      if (param2[1].b(2166)) {
                                        break L9;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                }
                              }
                              if (param3 != 0) {
                                break L1;
                              } else {
                                if (null == param2[2]) {
                                  break L1;
                                } else {
                                  if (param2[2].field_d) {
                                    break L1;
                                  } else {
                                    if (!param2[2].b(2166)) {
                                      break L1;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                              }
                            }
                            var6[var7] = 2;
                            var7++;
                            if (!ArmiesOfGielinor.field_M) {
                              break L1;
                            } else {
                              break L2;
                            }
                          } else {
                            break L1;
                          }
                        }
                      }
                    }
                  }
                }
                L12: {
                  if (null == param4[0]) {
                    break L12;
                  } else {
                    if (param4[0].field_d) {
                      break L12;
                    } else {
                      if (!param4[0].b(2166)) {
                        break L12;
                      } else {
                        L13: {
                          L14: {
                            if (param2[0] == null) {
                              break L14;
                            } else {
                              if (!param2[0].field_d) {
                                break L13;
                              } else {
                                break L14;
                              }
                            }
                          }
                          if (-1 != (param3 ^ -1)) {
                            break L12;
                          } else {
                            if (null == param2[1]) {
                              break L12;
                            } else {
                              if (param2[1].field_d) {
                                break L12;
                              } else {
                                if (param2[1].b(2166)) {
                                  break L13;
                                } else {
                                  break L12;
                                }
                              }
                            }
                          }
                        }
                        var6[var7] = 0;
                        var7++;
                        break L12;
                      }
                    }
                  }
                }
                if (null == param4[1]) {
                  break L1;
                } else {
                  if (param4[1].field_d) {
                    break L1;
                  } else {
                    if (param4[1].b(2166)) {
                      L15: {
                        L16: {
                          if (param2[0] == null) {
                            break L16;
                          } else {
                            if (param2[0].field_d) {
                              break L16;
                            } else {
                              if (param2[0].b(param0 + 2259)) {
                                break L15;
                              } else {
                                break L16;
                              }
                            }
                          }
                        }
                        if ((param3 ^ -1) != -1) {
                          break L1;
                        } else {
                          if (null == param2[2]) {
                            break L1;
                          } else {
                            if (param2[2].field_d) {
                              break L1;
                            } else {
                              if (!param2[2].b(2166)) {
                                break L1;
                              } else {
                                break L15;
                              }
                            }
                          }
                        }
                      }
                      var6[var7] = 1;
                      var7++;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              if (-1 != (var7 ^ -1)) {
                var8 = var6[ns.a(false, var7, vv.field_b)];
                if (param0 == -93) {
                  param4[var8].field_d = true;
                  stackOut_185_0 = 1;
                  stackIn_186_0 = stackOut_185_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackOut_183_0 = 1;
                  stackIn_184_0 = stackOut_183_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_180_0 = 0;
                stackIn_181_0 = stackOut_180_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              param4[0].field_d = true;
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var6_ref = decompiledCaughtException;
            stackOut_187_0 = (RuntimeException) (var6_ref);
            stackOut_187_1 = new StringBuilder().append("sk.T(").append(param0).append(',').append(param1).append(',');
            stackIn_190_0 = stackOut_187_0;
            stackIn_190_1 = stackOut_187_1;
            stackIn_188_0 = stackOut_187_0;
            stackIn_188_1 = stackOut_187_1;
            if (param2 == null) {
              stackOut_190_0 = (RuntimeException) ((Object) stackIn_190_0);
              stackOut_190_1 = (StringBuilder) ((Object) stackIn_190_1);
              stackOut_190_2 = "null";
              stackIn_191_0 = stackOut_190_0;
              stackIn_191_1 = stackOut_190_1;
              stackIn_191_2 = stackOut_190_2;
              break L17;
            } else {
              stackOut_188_0 = (RuntimeException) ((Object) stackIn_188_0);
              stackOut_188_1 = (StringBuilder) ((Object) stackIn_188_1);
              stackOut_188_2 = "{...}";
              stackIn_191_0 = stackOut_188_0;
              stackIn_191_1 = stackOut_188_1;
              stackIn_191_2 = stackOut_188_2;
              break L17;
            }
          }
          L18: {
            stackOut_191_0 = (RuntimeException) ((Object) stackIn_191_0);
            stackOut_191_1 = ((StringBuilder) (Object) stackIn_191_1).append(stackIn_191_2).append(',').append(param3).append(',');
            stackIn_194_0 = stackOut_191_0;
            stackIn_194_1 = stackOut_191_1;
            stackIn_192_0 = stackOut_191_0;
            stackIn_192_1 = stackOut_191_1;
            if (param4 == null) {
              stackOut_194_0 = (RuntimeException) ((Object) stackIn_194_0);
              stackOut_194_1 = (StringBuilder) ((Object) stackIn_194_1);
              stackOut_194_2 = "null";
              stackIn_195_0 = stackOut_194_0;
              stackIn_195_1 = stackOut_194_1;
              stackIn_195_2 = stackOut_194_2;
              break L18;
            } else {
              stackOut_192_0 = (RuntimeException) ((Object) stackIn_192_0);
              stackOut_192_1 = (StringBuilder) ((Object) stackIn_192_1);
              stackOut_192_2 = "{...}";
              stackIn_195_0 = stackOut_192_0;
              stackIn_195_1 = stackOut_192_1;
              stackIn_195_2 = stackOut_192_2;
              break L18;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_195_0), stackIn_195_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_181_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_184_0 != 0;
            } else {
              return stackIn_186_0 != 0;
            }
          }
        }
    }

    private final void a(boolean param0, lf[] param1, byte param2, int param3, km[] param4) {
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        RuntimeException var6 = null;
        int var6_int = 0;
        int[] var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Object stackIn_37_0 = null;
        lf stackIn_37_1 = null;
        Object stackIn_41_0 = null;
        lf stackIn_41_1 = null;
        int stackIn_53_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_74_1 = 0;
        int stackIn_79_0 = 0;
        int stackIn_79_1 = 0;
        int stackIn_103_0 = 0;
        int stackIn_103_1 = 0;
        int stackIn_108_0 = 0;
        int stackIn_108_1 = 0;
        RuntimeException stackIn_130_0 = null;
        StringBuilder stackIn_130_1 = null;
        RuntimeException stackIn_132_0 = null;
        StringBuilder stackIn_132_1 = null;
        RuntimeException stackIn_133_0 = null;
        StringBuilder stackIn_133_1 = null;
        String stackIn_133_2 = null;
        RuntimeException stackIn_134_0 = null;
        StringBuilder stackIn_134_1 = null;
        RuntimeException stackIn_136_0 = null;
        StringBuilder stackIn_136_1 = null;
        RuntimeException stackIn_137_0 = null;
        StringBuilder stackIn_137_1 = null;
        String stackIn_137_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_35_0 = null;
        lf stackOut_35_1 = null;
        Object stackOut_40_0 = null;
        lf stackOut_40_1 = null;
        int stackOut_52_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        int stackOut_62_0 = 0;
        int stackOut_62_1 = 0;
        byte stackOut_66_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_73_1 = 0;
        int stackOut_77_0 = 0;
        int stackOut_77_1 = 0;
        int stackOut_102_0 = 0;
        int stackOut_102_1 = 0;
        int stackOut_106_0 = 0;
        int stackOut_106_1 = 0;
        RuntimeException stackOut_129_0 = null;
        StringBuilder stackOut_129_1 = null;
        RuntimeException stackOut_132_0 = null;
        StringBuilder stackOut_132_1 = null;
        String stackOut_132_2 = null;
        RuntimeException stackOut_130_0 = null;
        StringBuilder stackOut_130_1 = null;
        String stackOut_130_2 = null;
        RuntimeException stackOut_133_0 = null;
        StringBuilder stackOut_133_1 = null;
        RuntimeException stackOut_136_0 = null;
        StringBuilder stackOut_136_1 = null;
        String stackOut_136_2 = null;
        RuntimeException stackOut_134_0 = null;
        StringBuilder stackOut_134_1 = null;
        String stackOut_134_2 = null;
        var12 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            param3 = 0;
            var6_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if ((param1.length ^ -1) >= (var6_int ^ -1)) {
                    break L3;
                  } else {
                    param3++;
                    var6_int++;
                    if (var12 != 0) {
                      break L2;
                    } else {
                      if (var12 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var6_int = 0;
                break L2;
              }
              var7 = new int[param3];
              L4: while (true) {
                L5: {
                  if (var6_int >= param4.length) {
                    break L5;
                  } else {
                    if (param4[var6_int] == null) {
                      break L5;
                    } else {
                      var6_int++;
                      if (var12 == 0) {
                        continue L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                var8 = new int[var6_int];
                var9 = 0;
                L6: while (true) {
                  L7: {
                    L8: {
                      if ((var9 ^ -1) <= (var6_int ^ -1)) {
                        break L8;
                      } else {
                        var8[var9] = var9;
                        var9++;
                        if (var12 != 0) {
                          break L7;
                        } else {
                          if (var12 == 0) {
                            continue L6;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                    var6_int = 0;
                    break L7;
                  }
                  var9 = 0;
                  L9: while (true) {
                    L10: {
                      L11: {
                        if ((param3 ^ -1) >= (var9 ^ -1)) {
                          break L11;
                        } else {
                          if (var12 != 0) {
                            break L10;
                          } else {
                            L12: {
                              if (null != param1[var9]) {
                                incrementValue$9 = var6_int;
                                var6_int++;
                                var7[incrementValue$9] = var9;
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                            var9++;
                            if (var12 == 0) {
                              continue L9;
                            } else {
                              break L11;
                            }
                          }
                        }
                      }
                      param3 = var6_int;
                      break L10;
                    }
                    var9 = 0;
                    L13: while (true) {
                      L14: {
                        L15: {
                          if (param3 <= var9) {
                            break L15;
                          } else {
                            var10 = var9;
                            if (var12 != 0) {
                              break L14;
                            } else {
                              stackOut_35_0 = null;
                              stackOut_35_1 = param1[var7[var10]];
                              stackIn_37_0 = stackOut_35_0;
                              stackIn_37_1 = stackOut_35_1;
                              L16: while (true) {
                                L17: {
                                  if (stackIn_37_0 == stackIn_37_1) {
                                    break L17;
                                  } else {
                                    var11 = 1 + var9;
                                    L18: while (true) {
                                      L19: {
                                        if (var11 >= param3) {
                                          break L19;
                                        } else {
                                          stackOut_40_0 = null;
                                          stackOut_40_1 = param1[var7[var11]];
                                          stackIn_37_0 = stackOut_40_0;
                                          stackIn_37_1 = stackOut_40_1;
                                          stackIn_41_0 = stackOut_40_0;
                                          stackIn_41_1 = stackOut_40_1;
                                          if (var12 != 0) {
                                            continue L16;
                                          } else {
                                            L20: {
                                              if (stackIn_41_0 == stackIn_41_1) {
                                                break L20;
                                              } else {
                                                if ((param1[var7[var11]].field_s ^ -1) >= (param1[var7[var10]].field_s ^ -1)) {
                                                  break L20;
                                                } else {
                                                  var10 = var11;
                                                  break L20;
                                                }
                                              }
                                            }
                                            var11++;
                                            if (var12 == 0) {
                                              continue L18;
                                            } else {
                                              break L19;
                                            }
                                          }
                                        }
                                      }
                                      if (var10 == var9) {
                                        break L17;
                                      } else {
                                        var11 = var7[var10];
                                        var7[var10] = var7[var9];
                                        var7[var9] = var11;
                                        break L17;
                                      }
                                    }
                                  }
                                }
                                var9++;
                                if (var12 == 0) {
                                  continue L13;
                                } else {
                                  break L15;
                                }
                              }
                            }
                          }
                        }
                        var9 = 0;
                        break L14;
                      }
                      L21: while (true) {
                        L22: {
                          L23: {
                            if ((var8.length ^ -1) >= (var9 ^ -1)) {
                              break L23;
                            } else {
                              var10 = var9;
                              stackOut_52_0 = var9 + 1;
                              stackIn_67_0 = stackOut_52_0;
                              stackIn_53_0 = stackOut_52_0;
                              if (var12 != 0) {
                                break L22;
                              } else {
                                var11 = stackIn_53_0;
                                L24: while (true) {
                                  L25: {
                                    L26: {
                                      if (var11 >= var8.length) {
                                        break L26;
                                      } else {
                                        stackOut_55_0 = param4[var8[var10]].field_d ^ -1;
                                        stackOut_55_1 = param4[var8[var11]].field_d ^ -1;
                                        stackIn_63_0 = stackOut_55_0;
                                        stackIn_63_1 = stackOut_55_1;
                                        stackIn_56_0 = stackOut_55_0;
                                        stackIn_56_1 = stackOut_55_1;
                                        if (var12 != 0) {
                                          break L25;
                                        } else {
                                          L27: {
                                            if (stackIn_56_0 > stackIn_56_1) {
                                              var10 = var11;
                                              break L27;
                                            } else {
                                              break L27;
                                            }
                                          }
                                          var11++;
                                          if (var12 == 0) {
                                            continue L24;
                                          } else {
                                            break L26;
                                          }
                                        }
                                      }
                                    }
                                    stackOut_62_0 = var9;
                                    stackOut_62_1 = var10;
                                    stackIn_63_0 = stackOut_62_0;
                                    stackIn_63_1 = stackOut_62_1;
                                    break L25;
                                  }
                                  L28: {
                                    if (stackIn_63_0 == stackIn_63_1) {
                                      break L28;
                                    } else {
                                      var11 = var8[var10];
                                      var8[var10] = var8[var9];
                                      var8[var9] = var11;
                                      break L28;
                                    }
                                  }
                                  var9++;
                                  if (var12 == 0) {
                                    continue L21;
                                  } else {
                                    break L23;
                                  }
                                }
                              }
                            }
                          }
                          var9 = 0;
                          stackOut_66_0 = param2;
                          stackIn_67_0 = stackOut_66_0;
                          break L22;
                        }
                        if (stackIn_67_0 == 109) {
                          L29: {
                            if (cu.field_a) {
                              L30: while (true) {
                                L31: {
                                  L32: {
                                    L33: {
                                      if (var8.length > var6_int) {
                                        break L33;
                                      } else {
                                        stackOut_73_0 = var9;
                                        stackOut_73_1 = param3;
                                        stackIn_79_0 = stackOut_73_0;
                                        stackIn_79_1 = stackOut_73_1;
                                        stackIn_74_0 = stackOut_73_0;
                                        stackIn_74_1 = stackOut_73_1;
                                        if (var12 != 0) {
                                          break L32;
                                        } else {
                                          if (stackIn_74_0 >= stackIn_74_1) {
                                            break L31;
                                          } else {
                                            break L33;
                                          }
                                        }
                                      }
                                    }
                                    stackOut_77_0 = var9;
                                    stackOut_77_1 = param3;
                                    stackIn_79_0 = stackOut_77_0;
                                    stackIn_79_1 = stackOut_77_1;
                                    break L32;
                                  }
                                  L34: {
                                    if (stackIn_79_0 >= stackIn_79_1) {
                                      break L34;
                                    } else {
                                      if (param1[var7[var9]] == null) {
                                        var9++;
                                        if (var12 == 0) {
                                          continue L30;
                                        } else {
                                          break L34;
                                        }
                                      } else {
                                        break L34;
                                      }
                                    }
                                  }
                                  L35: {
                                    if ((var9 ^ -1) <= (param3 ^ -1)) {
                                      break L35;
                                    } else {
                                      L36: {
                                        if ((var8.length ^ -1) >= (var6_int ^ -1)) {
                                          break L36;
                                        } else {
                                          L37: {
                                            if ((param1[var7[var9]].field_s ^ -1) <= (param4[var8[var6_int]].field_d ^ -1)) {
                                              break L37;
                                            } else {
                                              incrementValue$10 = var6_int;
                                              var6_int++;
                                              param4[var8[incrementValue$10]].a(param0, param2 ^ -107, true, this.field_C);
                                              if (var12 == 0) {
                                                continue L30;
                                              } else {
                                                break L37;
                                              }
                                            }
                                          }
                                          incrementValue$11 = var9;
                                          var9++;
                                          param1[var7[incrementValue$11]].a(this.field_C, -91, true);
                                          if (var12 == 0) {
                                            continue L30;
                                          } else {
                                            break L36;
                                          }
                                        }
                                      }
                                      incrementValue$12 = var9;
                                      var9++;
                                      param1[var7[incrementValue$12]].a(this.field_C, param2 ^ -55, true);
                                      if (var12 == 0) {
                                        continue L30;
                                      } else {
                                        break L35;
                                      }
                                    }
                                  }
                                  incrementValue$13 = var6_int;
                                  var6_int++;
                                  param4[var8[incrementValue$13]].a(param0, -8, true, this.field_C);
                                  if (var12 == 0) {
                                    continue L30;
                                  } else {
                                    break L31;
                                  }
                                }
                                this.a((byte) 98, 0, 0, 128);
                                break L29;
                              }
                            } else {
                              break L29;
                            }
                          }
                          var9 = 0;
                          var6_int = 0;
                          L38: while (true) {
                            L39: {
                              L40: {
                                L41: {
                                  if ((var6_int ^ -1) > (var8.length ^ -1)) {
                                    break L41;
                                  } else {
                                    stackOut_102_0 = param3 ^ -1;
                                    stackOut_102_1 = var9 ^ -1;
                                    stackIn_108_0 = stackOut_102_0;
                                    stackIn_108_1 = stackOut_102_1;
                                    stackIn_103_0 = stackOut_102_0;
                                    stackIn_103_1 = stackOut_102_1;
                                    if (var12 != 0) {
                                      break L40;
                                    } else {
                                      if (stackIn_103_0 >= stackIn_103_1) {
                                        break L39;
                                      } else {
                                        break L41;
                                      }
                                    }
                                  }
                                }
                                stackOut_106_0 = param3;
                                stackOut_106_1 = var9;
                                stackIn_108_0 = stackOut_106_0;
                                stackIn_108_1 = stackOut_106_1;
                                break L40;
                              }
                              L42: {
                                if (stackIn_108_0 <= stackIn_108_1) {
                                  break L42;
                                } else {
                                  if (param1[var7[var9]] != null) {
                                    break L42;
                                  } else {
                                    var9++;
                                    if (var12 == 0) {
                                      continue L38;
                                    } else {
                                      break L42;
                                    }
                                  }
                                }
                              }
                              L43: {
                                if (var9 >= param3) {
                                  break L43;
                                } else {
                                  L44: {
                                    if ((var6_int ^ -1) > (var8.length ^ -1)) {
                                      break L44;
                                    } else {
                                      incrementValue$14 = var9;
                                      var9++;
                                      param1[var7[incrementValue$14]].a(this.field_C, -65, false);
                                      if (var12 == 0) {
                                        continue L38;
                                      } else {
                                        break L44;
                                      }
                                    }
                                  }
                                  L45: {
                                    if (param1[var7[var9]].field_s >= param4[var8[var6_int]].field_d) {
                                      break L45;
                                    } else {
                                      incrementValue$15 = var6_int;
                                      var6_int++;
                                      param4[var8[incrementValue$15]].a(param0, -8, false, this.field_C);
                                      if (var12 == 0) {
                                        continue L38;
                                      } else {
                                        break L45;
                                      }
                                    }
                                  }
                                  incrementValue$16 = var9;
                                  var9++;
                                  param1[var7[incrementValue$16]].a(this.field_C, -70, false);
                                  if (var12 == 0) {
                                    continue L38;
                                  } else {
                                    break L43;
                                  }
                                }
                              }
                              incrementValue$17 = var6_int;
                              var6_int++;
                              param4[var8[incrementValue$17]].a(param0, -8, false, this.field_C);
                              if (var12 == 0) {
                                continue L38;
                              } else {
                                break L39;
                              }
                            }
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        } else {
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L46: {
            var6 = decompiledCaughtException;
            stackOut_129_0 = (RuntimeException) (var6);
            stackOut_129_1 = new StringBuilder().append("sk.FA(").append(param0).append(',');
            stackIn_132_0 = stackOut_129_0;
            stackIn_132_1 = stackOut_129_1;
            stackIn_130_0 = stackOut_129_0;
            stackIn_130_1 = stackOut_129_1;
            if (param1 == null) {
              stackOut_132_0 = (RuntimeException) ((Object) stackIn_132_0);
              stackOut_132_1 = (StringBuilder) ((Object) stackIn_132_1);
              stackOut_132_2 = "null";
              stackIn_133_0 = stackOut_132_0;
              stackIn_133_1 = stackOut_132_1;
              stackIn_133_2 = stackOut_132_2;
              break L46;
            } else {
              stackOut_130_0 = (RuntimeException) ((Object) stackIn_130_0);
              stackOut_130_1 = (StringBuilder) ((Object) stackIn_130_1);
              stackOut_130_2 = "{...}";
              stackIn_133_0 = stackOut_130_0;
              stackIn_133_1 = stackOut_130_1;
              stackIn_133_2 = stackOut_130_2;
              break L46;
            }
          }
          L47: {
            stackOut_133_0 = (RuntimeException) ((Object) stackIn_133_0);
            stackOut_133_1 = ((StringBuilder) (Object) stackIn_133_1).append(stackIn_133_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_136_0 = stackOut_133_0;
            stackIn_136_1 = stackOut_133_1;
            stackIn_134_0 = stackOut_133_0;
            stackIn_134_1 = stackOut_133_1;
            if (param4 == null) {
              stackOut_136_0 = (RuntimeException) ((Object) stackIn_136_0);
              stackOut_136_1 = (StringBuilder) ((Object) stackIn_136_1);
              stackOut_136_2 = "null";
              stackIn_137_0 = stackOut_136_0;
              stackIn_137_1 = stackOut_136_1;
              stackIn_137_2 = stackOut_136_2;
              break L47;
            } else {
              stackOut_134_0 = (RuntimeException) ((Object) stackIn_134_0);
              stackOut_134_1 = (StringBuilder) ((Object) stackIn_134_1);
              stackOut_134_2 = "{...}";
              stackIn_137_0 = stackOut_134_0;
              stackIn_137_1 = stackOut_134_1;
              stackIn_137_2 = stackOut_134_2;
              break L47;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_137_0), stackIn_137_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void d(int param0) {
        this.a(this.field_s, -4925);
        if (param0 != 29823) {
            return;
        }
        try {
            this.b(this.field_s, 12579);
            if ((this.field_F ^ -1) < -201) {
                this.field_F = 0;
                this.field_n = 8;
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "sk.R(" + param0 + ')');
        }
    }

    public static void c(int param0) {
        field_G = null;
        field_M = null;
        field_N = null;
        if (param0 > -126) {
            return;
        }
        try {
            field_j = (int[][]) null;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "sk.V(" + param0 + ')');
        }
    }

    public final boolean b(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_11_0 = 0;
        try {
          L0: {
            L1: {
              L2: {
                if (-9 != (this.field_n ^ -1)) {
                  break L2;
                } else {
                  L3: {
                    if (null == u.field_p) {
                      break L3;
                    } else {
                      if ((u.field_p.field_n ^ -1) != -1) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackOut_7_0 = 1;
                  stackIn_10_0 = stackOut_7_0;
                  break L1;
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L1;
            }
            var2_int = stackIn_10_0;
            if (param0 == 8865) {
              L4: {
                if (var2_int != 0) {
                  eb.a(this.field_d, this.field_c, true);
                  eb.a(this.field_d, this.field_a, true);
                  break L4;
                } else {
                  break L4;
                }
              }
              stackOut_17_0 = var2_int;
              stackIn_18_0 = stackOut_17_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_11_0 = 0;
              stackIn_12_0 = stackOut_11_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "sk.K(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_12_0 != 0;
        } else {
          return stackIn_18_0 != 0;
        }
    }

    private final void a(byte param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var4 = 34 / ((-38 - param0) / 44);
            var3_int = 0;
            L1: while (true) {
              L2: {
                if ((this.field_D.length ^ -1) >= (var3_int ^ -1)) {
                  break L2;
                } else {
                  if (null == this.field_D[var3_int]) {
                    break L2;
                  } else {
                    var3_int++;
                    if (var5 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              if ((var3_int ^ -1) <= (this.field_D.length ^ -1)) {
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                this.field_D[var3_int] = new km(-u.field_o[this.field_c][1] + this.field_s[param1].field_a, 600 + -pk.field_T[this.field_c][1], this.field_s[param1].field_s, 2, this.field_z);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) runtimeException), "sk.MA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void b(lf[] param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (param0.length <= var3_int) {
                    break L3;
                  } else {
                    if (var4 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (param0[var3_int] == null) {
                          break L4;
                        } else {
                          param0[var3_int].d((byte) 113);
                          break L4;
                        }
                      }
                      var3_int++;
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param1 == 12579) {
                  break L2;
                } else {
                  this.field_c = 97;
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (runtimeException);
            stackOut_14_1 = new StringBuilder().append("sk.C(");
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
    }

    private final void l(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 >= 26) {
                break L1;
              } else {
                this.field_w = -32;
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  var2_int = this.field_y + -this.field_v;
                  var3 = this.field_w - this.field_O;
                  if (0 >= this.field_O) {
                    break L4;
                  } else {
                    if (-1 > (this.field_v ^ -1)) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (0 < this.field_v) {
                    break L5;
                  } else {
                    if (-1 > (this.field_O ^ -1)) {
                      if (!this.a((byte) -93, this.field_u, this.field_s, this.field_J, this.field_i)) {
                        break L2;
                      } else {
                        this.field_O = this.field_O - 1;
                        if (var4 == 0) {
                          break L2;
                        } else {
                          break L5;
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                }
                if (this.a((byte) -93, this.field_J, this.field_i, this.field_u, this.field_s)) {
                  this.field_v = this.field_v - 1;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                } else {
                  break L2;
                }
              }
              L6: {
                if ((var2_int ^ -1) >= -1) {
                  break L6;
                } else {
                  if (0 >= var3) {
                    break L6;
                  } else {
                    L7: {
                      if (ns.a(false, this.field_O + this.field_v, vv.field_b) > this.field_v) {
                        break L7;
                      } else {
                        if (!this.a((byte) -93, this.field_J, this.field_i, this.field_u, this.field_s)) {
                          break L2;
                        } else {
                          this.field_v = this.field_v - 1;
                          if (var4 == 0) {
                            break L2;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    if (!this.a((byte) -93, this.field_u, this.field_s, this.field_J, this.field_i)) {
                      break L2;
                    } else {
                      this.field_O = this.field_O - 1;
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
              }
              L8: {
                if (-1 > (var2_int ^ -1)) {
                  break L8;
                } else {
                  if ((var3 ^ -1) < -1) {
                    if (this.a((byte) -93, this.field_u, this.field_s, this.field_J, this.field_i)) {
                      this.field_O = this.field_O - 1;
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L8;
                      }
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              if (!this.a((byte) -93, this.field_J, this.field_i, this.field_u, this.field_s)) {
                break L2;
              } else {
                this.field_v = this.field_v - 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "sk.PA(" + param0 + ')');
        }
    }

    private final void b(byte param0, int param1) {
        RuntimeException var3 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 54) {
              this.field_A = qc.a(param1, 8806);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3), "sk.EA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void d(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.b(this.field_s, param0 + 12453);
              this.b(this.field_i, param0 + 12453);
              if (param0 == 126) {
                break L1;
              } else {
                this.a((byte) -79, 88);
                break L1;
              }
            }
            L2: {
              if ((this.field_F ^ -1) != -2) {
                break L2;
              } else {
                L3: {
                  if (null == u.field_p) {
                    break L3;
                  } else {
                    u.field_p.a(param0 ^ -24, this.field_t);
                    break L3;
                  }
                }
                oo.e(-387);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "sk.NA(" + param0 + ')');
        }
    }

    final void a(int param0, jd param1, int param2, boolean param3, jd param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        Object stackIn_18_0 = null;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        Object stackIn_35_0 = null;
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        Object stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        Object stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        Object stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        Object stackIn_46_0 = null;
        Object stackIn_47_0 = null;
        Object stackIn_49_0 = null;
        Object stackIn_51_0 = null;
        Object stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        Object stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        Object stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        Object stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        int stackIn_63_2 = 0;
        Object stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        Object stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        Object stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        int stackIn_67_2 = 0;
        Object stackIn_71_0 = null;
        Object stackIn_72_0 = null;
        Object stackIn_74_0 = null;
        Object stackIn_76_0 = null;
        Object stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        Object stackIn_185_0 = null;
        Object stackIn_187_0 = null;
        Object stackIn_188_0 = null;
        int stackIn_188_1 = 0;
        lf[] stackIn_203_0 = null;
        int stackIn_203_1 = 0;
        lf[] stackIn_204_0 = null;
        int stackIn_204_1 = 0;
        lf stackIn_204_2 = null;
        lf stackIn_204_3 = null;
        int stackIn_204_4 = 0;
        int stackIn_204_5 = 0;
        int stackIn_204_6 = 0;
        int stackIn_204_7 = 0;
        boolean stackIn_204_8 = false;
        lf[] stackIn_206_0 = null;
        int stackIn_206_1 = 0;
        lf stackIn_206_2 = null;
        lf stackIn_206_3 = null;
        int stackIn_206_4 = 0;
        int stackIn_206_5 = 0;
        int stackIn_206_6 = 0;
        int stackIn_206_7 = 0;
        boolean stackIn_206_8 = false;
        lf[] stackIn_207_0 = null;
        int stackIn_207_1 = 0;
        lf stackIn_207_2 = null;
        lf stackIn_207_3 = null;
        int stackIn_207_4 = 0;
        int stackIn_207_5 = 0;
        int stackIn_207_6 = 0;
        int stackIn_207_7 = 0;
        boolean stackIn_207_8 = false;
        lf[] stackIn_208_0 = null;
        int stackIn_208_1 = 0;
        lf stackIn_208_2 = null;
        lf stackIn_208_3 = null;
        int stackIn_208_4 = 0;
        int stackIn_208_5 = 0;
        int stackIn_208_6 = 0;
        int stackIn_208_7 = 0;
        boolean stackIn_208_8 = false;
        int stackIn_208_9 = 0;
        lf[] stackIn_209_0 = null;
        int stackIn_209_1 = 0;
        lf stackIn_209_2 = null;
        lf stackIn_209_3 = null;
        int stackIn_209_4 = 0;
        int stackIn_209_5 = 0;
        int stackIn_209_6 = 0;
        int stackIn_209_7 = 0;
        boolean stackIn_209_8 = false;
        int stackIn_209_9 = 0;
        lf[] stackIn_210_0 = null;
        int stackIn_210_1 = 0;
        lf stackIn_210_2 = null;
        lf stackIn_210_3 = null;
        int stackIn_210_4 = 0;
        int stackIn_210_5 = 0;
        int stackIn_210_6 = 0;
        int stackIn_210_7 = 0;
        boolean stackIn_210_8 = false;
        int stackIn_210_9 = 0;
        int stackIn_210_10 = 0;
        lf[] stackIn_211_0 = null;
        int stackIn_211_1 = 0;
        lf stackIn_211_2 = null;
        lf stackIn_211_3 = null;
        int stackIn_211_4 = 0;
        int stackIn_211_5 = 0;
        int stackIn_211_6 = 0;
        int stackIn_211_7 = 0;
        boolean stackIn_211_8 = false;
        int stackIn_211_9 = 0;
        lf[] stackIn_216_0 = null;
        int stackIn_216_1 = 0;
        lf[] stackIn_217_0 = null;
        int stackIn_217_1 = 0;
        lf stackIn_217_2 = null;
        lf stackIn_217_3 = null;
        int stackIn_217_4 = 0;
        int stackIn_217_5 = 0;
        int stackIn_217_6 = 0;
        int stackIn_217_7 = 0;
        boolean stackIn_217_8 = false;
        lf[] stackIn_219_0 = null;
        int stackIn_219_1 = 0;
        lf stackIn_219_2 = null;
        lf stackIn_219_3 = null;
        int stackIn_219_4 = 0;
        int stackIn_219_5 = 0;
        int stackIn_219_6 = 0;
        int stackIn_219_7 = 0;
        boolean stackIn_219_8 = false;
        lf[] stackIn_220_0 = null;
        int stackIn_220_1 = 0;
        lf stackIn_220_2 = null;
        lf stackIn_220_3 = null;
        int stackIn_220_4 = 0;
        int stackIn_220_5 = 0;
        int stackIn_220_6 = 0;
        int stackIn_220_7 = 0;
        boolean stackIn_220_8 = false;
        lf[] stackIn_221_0 = null;
        int stackIn_221_1 = 0;
        lf stackIn_221_2 = null;
        lf stackIn_221_3 = null;
        int stackIn_221_4 = 0;
        int stackIn_221_5 = 0;
        int stackIn_221_6 = 0;
        int stackIn_221_7 = 0;
        boolean stackIn_221_8 = false;
        int stackIn_221_9 = 0;
        lf[] stackIn_222_0 = null;
        int stackIn_222_1 = 0;
        lf stackIn_222_2 = null;
        lf stackIn_222_3 = null;
        int stackIn_222_4 = 0;
        int stackIn_222_5 = 0;
        int stackIn_222_6 = 0;
        int stackIn_222_7 = 0;
        boolean stackIn_222_8 = false;
        int stackIn_222_9 = 0;
        lf[] stackIn_223_0 = null;
        int stackIn_223_1 = 0;
        lf stackIn_223_2 = null;
        lf stackIn_223_3 = null;
        int stackIn_223_4 = 0;
        int stackIn_223_5 = 0;
        int stackIn_223_6 = 0;
        int stackIn_223_7 = 0;
        boolean stackIn_223_8 = false;
        int stackIn_223_9 = 0;
        int stackIn_223_10 = 0;
        lf[] stackIn_224_0 = null;
        int stackIn_224_1 = 0;
        lf stackIn_224_2 = null;
        lf stackIn_224_3 = null;
        int stackIn_224_4 = 0;
        int stackIn_224_5 = 0;
        int stackIn_224_6 = 0;
        int stackIn_224_7 = 0;
        boolean stackIn_224_8 = false;
        int stackIn_224_9 = 0;
        lf[] stackIn_236_0 = null;
        int stackIn_236_1 = 0;
        Object stackIn_241_0 = null;
        Object stackIn_243_0 = null;
        Object stackIn_244_0 = null;
        int stackIn_244_1 = 0;
        RuntimeException stackIn_264_0 = null;
        StringBuilder stackIn_264_1 = null;
        RuntimeException stackIn_266_0 = null;
        StringBuilder stackIn_266_1 = null;
        RuntimeException stackIn_267_0 = null;
        StringBuilder stackIn_267_1 = null;
        String stackIn_267_2 = null;
        RuntimeException stackIn_268_0 = null;
        StringBuilder stackIn_268_1 = null;
        RuntimeException stackIn_270_0 = null;
        StringBuilder stackIn_270_1 = null;
        RuntimeException stackIn_271_0 = null;
        StringBuilder stackIn_271_1 = null;
        String stackIn_271_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        Object stackOut_17_0 = null;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_34_0 = null;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        Object stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        Object stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        Object stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int stackOut_41_2 = 0;
        Object stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int stackOut_39_2 = 0;
        Object stackOut_45_0 = null;
        Object stackOut_46_0 = null;
        Object stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        Object stackOut_47_0 = null;
        Object stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        Object stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        Object stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        int stackOut_62_2 = 0;
        Object stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        int stackOut_60_2 = 0;
        Object stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        Object stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        int stackOut_66_2 = 0;
        Object stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        int stackOut_64_2 = 0;
        Object stackOut_70_0 = null;
        Object stackOut_71_0 = null;
        Object stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        Object stackOut_72_0 = null;
        Object stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        Object stackOut_184_0 = null;
        Object stackOut_187_0 = null;
        int stackOut_187_1 = 0;
        Object stackOut_185_0 = null;
        int stackOut_185_1 = 0;
        lf[] stackOut_202_0 = null;
        int stackOut_202_1 = 0;
        lf[] stackOut_203_0 = null;
        int stackOut_203_1 = 0;
        lf stackOut_203_2 = null;
        lf stackOut_203_3 = null;
        int stackOut_203_4 = 0;
        int stackOut_203_5 = 0;
        int stackOut_203_6 = 0;
        int stackOut_203_7 = 0;
        boolean stackOut_203_8 = false;
        lf[] stackOut_207_0 = null;
        int stackOut_207_1 = 0;
        lf stackOut_207_2 = null;
        lf stackOut_207_3 = null;
        int stackOut_207_4 = 0;
        int stackOut_207_5 = 0;
        int stackOut_207_6 = 0;
        int stackOut_207_7 = 0;
        boolean stackOut_207_8 = false;
        int stackOut_207_9 = 0;
        lf[] stackOut_209_0 = null;
        int stackOut_209_1 = 0;
        lf stackOut_209_2 = null;
        lf stackOut_209_3 = null;
        int stackOut_209_4 = 0;
        int stackOut_209_5 = 0;
        int stackOut_209_6 = 0;
        int stackOut_209_7 = 0;
        boolean stackOut_209_8 = false;
        int stackOut_209_9 = 0;
        int stackOut_209_10 = 0;
        lf[] stackOut_208_0 = null;
        int stackOut_208_1 = 0;
        lf stackOut_208_2 = null;
        lf stackOut_208_3 = null;
        int stackOut_208_4 = 0;
        int stackOut_208_5 = 0;
        int stackOut_208_6 = 0;
        int stackOut_208_7 = 0;
        boolean stackOut_208_8 = false;
        int stackOut_208_9 = 0;
        int stackOut_208_10 = 0;
        lf[] stackOut_210_0 = null;
        int stackOut_210_1 = 0;
        lf stackOut_210_2 = null;
        lf stackOut_210_3 = null;
        int stackOut_210_4 = 0;
        int stackOut_210_5 = 0;
        int stackOut_210_6 = 0;
        int stackOut_210_7 = 0;
        boolean stackOut_210_8 = false;
        int stackOut_210_9 = 0;
        lf[] stackOut_204_0 = null;
        int stackOut_204_1 = 0;
        lf stackOut_204_2 = null;
        lf stackOut_204_3 = null;
        int stackOut_204_4 = 0;
        int stackOut_204_5 = 0;
        int stackOut_204_6 = 0;
        int stackOut_204_7 = 0;
        boolean stackOut_204_8 = false;
        lf[] stackOut_206_0 = null;
        int stackOut_206_1 = 0;
        lf stackOut_206_2 = null;
        lf stackOut_206_3 = null;
        int stackOut_206_4 = 0;
        int stackOut_206_5 = 0;
        int stackOut_206_6 = 0;
        int stackOut_206_7 = 0;
        boolean stackOut_206_8 = false;
        int stackOut_206_9 = 0;
        lf[] stackOut_215_0 = null;
        int stackOut_215_1 = 0;
        lf[] stackOut_216_0 = null;
        int stackOut_216_1 = 0;
        lf stackOut_216_2 = null;
        lf stackOut_216_3 = null;
        int stackOut_216_4 = 0;
        int stackOut_216_5 = 0;
        int stackOut_216_6 = 0;
        int stackOut_216_7 = 0;
        boolean stackOut_216_8 = false;
        lf[] stackOut_220_0 = null;
        int stackOut_220_1 = 0;
        lf stackOut_220_2 = null;
        lf stackOut_220_3 = null;
        int stackOut_220_4 = 0;
        int stackOut_220_5 = 0;
        int stackOut_220_6 = 0;
        int stackOut_220_7 = 0;
        boolean stackOut_220_8 = false;
        int stackOut_220_9 = 0;
        lf[] stackOut_222_0 = null;
        int stackOut_222_1 = 0;
        lf stackOut_222_2 = null;
        lf stackOut_222_3 = null;
        int stackOut_222_4 = 0;
        int stackOut_222_5 = 0;
        int stackOut_222_6 = 0;
        int stackOut_222_7 = 0;
        boolean stackOut_222_8 = false;
        int stackOut_222_9 = 0;
        int stackOut_222_10 = 0;
        lf[] stackOut_221_0 = null;
        int stackOut_221_1 = 0;
        lf stackOut_221_2 = null;
        lf stackOut_221_3 = null;
        int stackOut_221_4 = 0;
        int stackOut_221_5 = 0;
        int stackOut_221_6 = 0;
        int stackOut_221_7 = 0;
        boolean stackOut_221_8 = false;
        int stackOut_221_9 = 0;
        int stackOut_221_10 = 0;
        lf[] stackOut_223_0 = null;
        int stackOut_223_1 = 0;
        lf stackOut_223_2 = null;
        lf stackOut_223_3 = null;
        int stackOut_223_4 = 0;
        int stackOut_223_5 = 0;
        int stackOut_223_6 = 0;
        int stackOut_223_7 = 0;
        boolean stackOut_223_8 = false;
        int stackOut_223_9 = 0;
        lf[] stackOut_217_0 = null;
        int stackOut_217_1 = 0;
        lf stackOut_217_2 = null;
        lf stackOut_217_3 = null;
        int stackOut_217_4 = 0;
        int stackOut_217_5 = 0;
        int stackOut_217_6 = 0;
        int stackOut_217_7 = 0;
        boolean stackOut_217_8 = false;
        lf[] stackOut_219_0 = null;
        int stackOut_219_1 = 0;
        lf stackOut_219_2 = null;
        lf stackOut_219_3 = null;
        int stackOut_219_4 = 0;
        int stackOut_219_5 = 0;
        int stackOut_219_6 = 0;
        int stackOut_219_7 = 0;
        boolean stackOut_219_8 = false;
        int stackOut_219_9 = 0;
        lf[] stackOut_235_0 = null;
        int stackOut_235_1 = 0;
        Object stackOut_240_0 = null;
        Object stackOut_243_0 = null;
        int stackOut_243_1 = 0;
        Object stackOut_241_0 = null;
        int stackOut_241_1 = 0;
        RuntimeException stackOut_263_0 = null;
        StringBuilder stackOut_263_1 = null;
        RuntimeException stackOut_266_0 = null;
        StringBuilder stackOut_266_1 = null;
        String stackOut_266_2 = null;
        RuntimeException stackOut_264_0 = null;
        StringBuilder stackOut_264_1 = null;
        String stackOut_264_2 = null;
        RuntimeException stackOut_267_0 = null;
        StringBuilder stackOut_267_1 = null;
        RuntimeException stackOut_270_0 = null;
        StringBuilder stackOut_270_1 = null;
        String stackOut_270_2 = null;
        RuntimeException stackOut_268_0 = null;
        StringBuilder stackOut_268_1 = null;
        String stackOut_268_2 = null;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (null != this.field_x) {
                  break L2;
                } else {
                  this.b((byte) 54, 0);
                  if (var9 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.b((byte) 54, this.field_x.field_hb);
              break L1;
            }
            L3: {
              if ((param1.field_Y ^ -1) < (param0 ^ -1)) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L3;
              } else {
                stackOut_8_0 = 1;
                stackIn_11_0 = stackOut_8_0;
                break L3;
              }
            }
            L4: {
              var6_int = stackIn_11_0;
              if (var6_int == 0) {
                break L4;
              } else {
                param2 = 0;
                break L4;
              }
            }
            L5: {
              if (param4.field_Y > param2) {
                stackOut_16_0 = 0;
                stackIn_17_0 = stackOut_16_0;
                break L5;
              } else {
                stackOut_14_0 = 1;
                stackIn_17_0 = stackOut_14_0;
                break L5;
              }
            }
            L6: {
              var7 = stackIn_17_0;
              stackOut_17_0 = this;
              stackIn_20_0 = stackOut_17_0;
              stackIn_18_0 = stackOut_17_0;
              if (1 >= bw.field_m[param4.field_N][7]) {
                stackOut_20_0 = this;
                stackOut_20_1 = 0;
                stackIn_21_0 = stackOut_20_0;
                stackIn_21_1 = stackOut_20_1;
                break L6;
              } else {
                stackOut_18_0 = this;
                stackOut_18_1 = 1;
                stackIn_21_0 = stackOut_18_0;
                stackIn_21_1 = stackOut_18_1;
                break L6;
              }
            }
            L7: {
              ((sk) (this)).field_d = stackIn_21_1 != 0;
              if ((param4.field_N ^ -1) != -35) {
                break L7;
              } else {
                if (!param4.field_W) {
                  break L7;
                } else {
                  this.field_d = true;
                  break L7;
                }
              }
            }
            L8: {
              if (param3) {
                break L8;
              } else {
                this.field_v = 72;
                break L8;
              }
            }
            L9: {
              if (this.field_d) {
                param2 = 0;
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              this.field_J = bw.field_m[param4.field_N][9];
              stackOut_34_0 = this;
              stackIn_37_0 = stackOut_34_0;
              stackIn_35_0 = stackOut_34_0;
              if ((vu.field_N[this.field_J] * param4.field_Y % param4.field_t ^ -1) >= -1) {
                stackOut_37_0 = this;
                stackOut_37_1 = 0;
                stackIn_38_0 = stackOut_37_0;
                stackIn_38_1 = stackOut_37_1;
                break L10;
              } else {
                stackOut_35_0 = this;
                stackOut_35_1 = 1;
                stackIn_38_0 = stackOut_35_0;
                stackIn_38_1 = stackOut_35_1;
                break L10;
              }
            }
            L11: {
              ((sk) (this)).field_y = stackIn_38_1 + param4.field_Y * vu.field_N[this.field_J] / param4.field_t;
              stackOut_38_0 = this;
              stackOut_38_1 = -((-param2 + param4.field_Y) * vu.field_N[this.field_J] / param4.field_t);
              stackIn_41_0 = stackOut_38_0;
              stackIn_41_1 = stackOut_38_1;
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              if (vu.field_N[this.field_J] * (param4.field_Y + -param2) % param4.field_t > 0) {
                stackOut_41_0 = this;
                stackOut_41_1 = stackIn_41_1;
                stackOut_41_2 = 1;
                stackIn_42_0 = stackOut_41_0;
                stackIn_42_1 = stackOut_41_1;
                stackIn_42_2 = stackOut_41_2;
                break L11;
              } else {
                stackOut_39_0 = this;
                stackOut_39_1 = stackIn_39_1;
                stackOut_39_2 = 0;
                stackIn_42_0 = stackOut_39_0;
                stackIn_42_1 = stackOut_39_1;
                stackIn_42_2 = stackOut_39_2;
                break L11;
              }
            }
            L12: {
              ((sk) (this)).field_v = stackIn_42_1 + (-stackIn_42_2 + this.field_y);
              this.field_c = param4.field_N;
              if ((this.field_v ^ -1) >= (this.field_y ^ -1)) {
                break L12;
              } else {
                this.field_v = this.field_y;
                break L12;
              }
            }
            L13: {
              L14: {
                stackOut_45_0 = this;
                stackIn_49_0 = stackOut_45_0;
                stackIn_46_0 = stackOut_45_0;
                if (3 == param4.g(0)) {
                  break L14;
                } else {
                  stackOut_46_0 = this;
                  stackIn_51_0 = stackOut_46_0;
                  stackIn_47_0 = stackOut_46_0;
                  if (7 != param1.field_N) {
                    stackOut_51_0 = this;
                    stackOut_51_1 = 0;
                    stackIn_52_0 = stackOut_51_0;
                    stackIn_52_1 = stackOut_51_1;
                    break L13;
                  } else {
                    stackOut_47_0 = this;
                    stackIn_49_0 = stackOut_47_0;
                    break L14;
                  }
                }
              }
              stackOut_49_0 = this;
              stackOut_49_1 = 1;
              stackIn_52_0 = stackOut_49_0;
              stackIn_52_1 = stackOut_49_1;
              break L13;
            }
            L15: {
              ((sk) (this)).field_E = stackIn_52_1 != 0;
              if (-35 != (param1.field_N ^ -1)) {
                break L15;
              } else {
                if (param1.field_W) {
                  this.field_q = true;
                  break L15;
                } else {
                  break L15;
                }
              }
            }
            L16: {
              this.field_u = bw.field_m[param1.field_N][9];
              stackOut_59_0 = this;
              stackOut_59_1 = param1.field_Y * vu.field_N[this.field_u] / param1.field_t;
              stackIn_62_0 = stackOut_59_0;
              stackIn_62_1 = stackOut_59_1;
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              if (-1 <= (vu.field_N[this.field_u] * param1.field_Y % param1.field_t ^ -1)) {
                stackOut_62_0 = this;
                stackOut_62_1 = stackIn_62_1;
                stackOut_62_2 = 0;
                stackIn_63_0 = stackOut_62_0;
                stackIn_63_1 = stackOut_62_1;
                stackIn_63_2 = stackOut_62_2;
                break L16;
              } else {
                stackOut_60_0 = this;
                stackOut_60_1 = stackIn_60_1;
                stackOut_60_2 = 1;
                stackIn_63_0 = stackOut_60_0;
                stackIn_63_1 = stackOut_60_1;
                stackIn_63_2 = stackOut_60_2;
                break L16;
              }
            }
            L17: {
              ((sk) (this)).field_w = stackIn_63_1 + stackIn_63_2;
              stackOut_63_0 = this;
              stackOut_63_1 = this.field_w;
              stackIn_66_0 = stackOut_63_0;
              stackIn_66_1 = stackOut_63_1;
              stackIn_64_0 = stackOut_63_0;
              stackIn_64_1 = stackOut_63_1;
              if ((-param0 + param1.field_Y) * vu.field_N[this.field_u] % param1.field_t <= 0) {
                stackOut_66_0 = this;
                stackOut_66_1 = stackIn_66_1;
                stackOut_66_2 = 0;
                stackIn_67_0 = stackOut_66_0;
                stackIn_67_1 = stackOut_66_1;
                stackIn_67_2 = stackOut_66_2;
                break L17;
              } else {
                stackOut_64_0 = this;
                stackOut_64_1 = stackIn_64_1;
                stackOut_64_2 = 1;
                stackIn_67_0 = stackOut_64_0;
                stackIn_67_1 = stackOut_64_1;
                stackIn_67_2 = stackOut_64_2;
                break L17;
              }
            }
            L18: {
              ((sk) (this)).field_O = stackIn_67_1 - stackIn_67_2 - vu.field_N[this.field_u] * (param1.field_Y + -param0) / param1.field_t;
              this.field_a = param1.field_N;
              if ((this.field_w ^ -1) <= (this.field_O ^ -1)) {
                break L18;
              } else {
                this.field_O = this.field_w;
                break L18;
              }
            }
            L19: {
              L20: {
                stackOut_70_0 = this;
                stackIn_74_0 = stackOut_70_0;
                stackIn_71_0 = stackOut_70_0;
                if (-4 == (param1.g(0) ^ -1)) {
                  break L20;
                } else {
                  stackOut_71_0 = this;
                  stackIn_76_0 = stackOut_71_0;
                  stackIn_72_0 = stackOut_71_0;
                  if (param1.field_N != 7) {
                    stackOut_76_0 = this;
                    stackOut_76_1 = 0;
                    stackIn_77_0 = stackOut_76_0;
                    stackIn_77_1 = stackOut_76_1;
                    break L19;
                  } else {
                    stackOut_72_0 = this;
                    stackIn_74_0 = stackOut_72_0;
                    break L20;
                  }
                }
              }
              stackOut_74_0 = this;
              stackOut_74_1 = 1;
              stackIn_77_0 = stackOut_74_0;
              stackIn_77_1 = stackOut_74_1;
              break L19;
            }
            L21: {
              L22: {
                ((sk) (this)).field_P = stackIn_77_1 != 0;
                if (this.field_d) {
                  break L22;
                } else {
                  L23: {
                    this.field_n = 1;
                    if (var6_int == 0) {
                      break L23;
                    } else {
                      this.field_L = 2;
                      if (var9 == 0) {
                        break L21;
                      } else {
                        break L23;
                      }
                    }
                  }
                  L24: {
                    if (var7 != 0) {
                      break L24;
                    } else {
                      this.field_L = 4;
                      if (var9 == 0) {
                        break L21;
                      } else {
                        break L24;
                      }
                    }
                  }
                  this.field_L = 3;
                  if (var9 == 0) {
                    break L21;
                  } else {
                    break L22;
                  }
                }
              }
              L25: {
                L26: {
                  if (34 != this.field_c) {
                    break L26;
                  } else {
                    this.field_z = 2;
                    if (var9 == 0) {
                      break L25;
                    } else {
                      break L26;
                    }
                  }
                }
                L27: {
                  if ((param4.g(0) ^ -1) != -4) {
                    break L27;
                  } else {
                    this.field_z = bw.field_m[param4.field_N][1] + 8;
                    if (var9 == 0) {
                      break L25;
                    } else {
                      break L27;
                    }
                  }
                }
                L28: {
                  if (-82 == (this.field_c ^ -1)) {
                    break L28;
                  } else {
                    if (4 == this.field_c) {
                      break L28;
                    } else {
                      if (this.field_c == 74) {
                        break L28;
                      } else {
                        L29: {
                          if (-68 == (this.field_c ^ -1)) {
                            break L29;
                          } else {
                            L30: {
                              if (this.field_c == 18) {
                                break L30;
                              } else {
                                L31: {
                                  if (this.field_c != 28) {
                                    break L31;
                                  } else {
                                    this.field_z = 5;
                                    if (var9 == 0) {
                                      break L25;
                                    } else {
                                      break L31;
                                    }
                                  }
                                }
                                if (this.field_c == 3) {
                                  this.field_z = 6;
                                  if (var9 == 0) {
                                    break L25;
                                  } else {
                                    break L30;
                                  }
                                } else {
                                  break L25;
                                }
                              }
                            }
                            this.field_z = 0;
                            if (var9 == 0) {
                              break L25;
                            } else {
                              break L29;
                            }
                          }
                        }
                        this.field_z = 3;
                        if (var9 == 0) {
                          break L25;
                        } else {
                          break L28;
                        }
                      }
                    }
                  }
                }
                this.field_z = 7;
                break L25;
              }
              L32: {
                this.field_p = this.field_O - (-ns.a(false, this.field_y, vv.field_b) + -this.field_y);
                this.field_D = new km[this.field_p];
                this.field_b = this.a(this.field_w, (byte) -127);
                this.field_n = 5;
                if (var6_int != 0) {
                  break L32;
                } else {
                  this.field_L = 8;
                  if (var9 == 0) {
                    break L21;
                  } else {
                    break L32;
                  }
                }
              }
              this.field_L = 7;
              break L21;
            }
            L33: {
              L34: {
                L35: {
                  fn.a(this.field_d, this.field_c, -32596);
                  fn.a(this.field_d, this.field_a, -32596);
                  if (param4.field_N == 7) {
                    break L35;
                  } else {
                    if (-35 != (param4.field_N ^ -1)) {
                      break L34;
                    } else {
                      break L35;
                    }
                  }
                }
                if (!param4.field_W) {
                  break L34;
                } else {
                  this.field_s = new lf[6];
                  var8 = 0;
                  L36: while (true) {
                    L37: {
                      if (var8 >= this.field_y) {
                        break L37;
                      } else {
                        this.field_s[1 + var8] = new lf(this.field_c, true, id.field_d[var8], kr.field_F[var8], false, 0);
                        var8++;
                        if (var9 != 0) {
                          break L33;
                        } else {
                          if (var9 == 0) {
                            continue L36;
                          } else {
                            break L37;
                          }
                        }
                      }
                    }
                    if (var9 == 0) {
                      break L33;
                    } else {
                      break L34;
                    }
                  }
                }
              }
              this.field_s = new lf[vu.field_N[this.field_J]];
              break L33;
            }
            L38: {
              L39: {
                L40: {
                  L41: {
                    L42: {
                      if (-8 == (param1.field_N ^ -1)) {
                        break L42;
                      } else {
                        if (-35 != (param1.field_N ^ -1)) {
                          break L41;
                        } else {
                          break L42;
                        }
                      }
                    }
                    if (param1.field_W) {
                      break L40;
                    } else {
                      break L41;
                    }
                  }
                  this.field_i = new lf[vu.field_N[this.field_u]];
                  if (var9 == 0) {
                    break L39;
                  } else {
                    break L40;
                  }
                }
                this.field_i = new lf[6];
                var8 = 0;
                L43: while (true) {
                  if ((var8 ^ -1) <= (this.field_w ^ -1)) {
                    break L39;
                  } else {
                    this.field_i[var8 + 1] = new lf(this.field_a, false, id.field_d[var8], kr.field_F[var8], false, 0);
                    var8++;
                    if (var9 != 0) {
                      break L38;
                    } else {
                      if (var9 == 0) {
                        continue L43;
                      } else {
                        break L39;
                      }
                    }
                  }
                }
              }
              if (param1.field_N != 34) {
                break L38;
              } else {
                if (param1.field_W) {
                  L44: {
                    this.field_w = 1;
                    stackOut_184_0 = this;
                    stackIn_187_0 = stackOut_184_0;
                    stackIn_185_0 = stackOut_184_0;
                    if ((param1.field_Y - -param1.field_A ^ -1) < (param0 ^ -1)) {
                      stackOut_187_0 = this;
                      stackOut_187_1 = 0;
                      stackIn_188_0 = stackOut_187_0;
                      stackIn_188_1 = stackOut_187_1;
                      break L44;
                    } else {
                      stackOut_185_0 = this;
                      stackOut_185_1 = 1;
                      stackIn_188_0 = stackOut_185_0;
                      stackIn_188_1 = stackOut_185_1;
                      break L44;
                    }
                  }
                  L45: {
                    ((sk) (this)).field_O = stackIn_188_1;
                    this.field_u = 2;
                    this.field_a = 75;
                    if ((this.field_O ^ -1) == -2) {
                      this.field_L = 2;
                      break L45;
                    } else {
                      break L45;
                    }
                  }
                  this.field_q = true;
                  break L38;
                } else {
                  break L38;
                }
              }
            }
            L46: {
              if (34 != param4.field_N) {
                break L46;
              } else {
                if (!param4.field_W) {
                  break L46;
                } else {
                  this.field_y = 1;
                  this.field_J = 2;
                  this.field_c = 75;
                  this.field_h = true;
                  break L46;
                }
              }
            }
            L47: {
              L48: {
                L49: {
                  L50: {
                    L51: {
                      L52: {
                        if (this.field_f) {
                          break L52;
                        } else {
                          var8 = 0;
                          L53: while (true) {
                            L54: {
                              if (this.field_y <= var8) {
                                break L54;
                              } else {
                                stackOut_202_0 = this.field_s;
                                stackOut_202_1 = var8;
                                stackIn_236_0 = stackOut_202_0;
                                stackIn_236_1 = stackOut_202_1;
                                stackIn_203_0 = stackOut_202_0;
                                stackIn_203_1 = stackOut_202_1;
                                if (var9 != 0) {
                                  break L51;
                                } else {
                                  L55: {
                                    stackOut_203_0 = (lf[]) ((Object) stackIn_203_0);
                                    stackOut_203_1 = stackIn_203_1;
                                    stackOut_203_2 = null;
                                    stackOut_203_3 = null;
                                    stackOut_203_4 = this.field_c;
                                    stackOut_203_5 = 1;
                                    stackOut_203_6 = tn.field_W[this.field_J][var8];
                                    stackOut_203_7 = kw.field_P[this.field_J][var8];
                                    stackOut_203_8 = this.field_d;
                                    stackIn_207_0 = stackOut_203_0;
                                    stackIn_207_1 = stackOut_203_1;
                                    stackIn_207_2 = stackOut_203_2;
                                    stackIn_207_3 = stackOut_203_3;
                                    stackIn_207_4 = stackOut_203_4;
                                    stackIn_207_5 = stackOut_203_5;
                                    stackIn_207_6 = stackOut_203_6;
                                    stackIn_207_7 = stackOut_203_7;
                                    stackIn_207_8 = stackOut_203_8;
                                    stackIn_204_0 = stackOut_203_0;
                                    stackIn_204_1 = stackOut_203_1;
                                    stackIn_204_2 = stackOut_203_2;
                                    stackIn_204_3 = stackOut_203_3;
                                    stackIn_204_4 = stackOut_203_4;
                                    stackIn_204_5 = stackOut_203_5;
                                    stackIn_204_6 = stackOut_203_6;
                                    stackIn_204_7 = stackOut_203_7;
                                    stackIn_204_8 = stackOut_203_8;
                                    if (!this.field_d) {
                                      L56: {
                                        stackOut_207_0 = (lf[]) ((Object) stackIn_207_0);
                                        stackOut_207_1 = stackIn_207_1;
                                        stackOut_207_2 = null;
                                        stackOut_207_3 = null;
                                        stackOut_207_4 = stackIn_207_4;
                                        stackOut_207_5 = stackIn_207_5;
                                        stackOut_207_6 = stackIn_207_6;
                                        stackOut_207_7 = stackIn_207_7;
                                        stackOut_207_8 = stackIn_207_8;
                                        stackOut_207_9 = 1300;
                                        stackIn_209_0 = stackOut_207_0;
                                        stackIn_209_1 = stackOut_207_1;
                                        stackIn_209_2 = stackOut_207_2;
                                        stackIn_209_3 = stackOut_207_3;
                                        stackIn_209_4 = stackOut_207_4;
                                        stackIn_209_5 = stackOut_207_5;
                                        stackIn_209_6 = stackOut_207_6;
                                        stackIn_209_7 = stackOut_207_7;
                                        stackIn_209_8 = stackOut_207_8;
                                        stackIn_209_9 = stackOut_207_9;
                                        stackIn_208_0 = stackOut_207_0;
                                        stackIn_208_1 = stackOut_207_1;
                                        stackIn_208_2 = stackOut_207_2;
                                        stackIn_208_3 = stackOut_207_3;
                                        stackIn_208_4 = stackOut_207_4;
                                        stackIn_208_5 = stackOut_207_5;
                                        stackIn_208_6 = stackOut_207_6;
                                        stackIn_208_7 = stackOut_207_7;
                                        stackIn_208_8 = stackOut_207_8;
                                        stackIn_208_9 = stackOut_207_9;
                                        if (param3) {
                                          stackOut_209_0 = (lf[]) ((Object) stackIn_209_0);
                                          stackOut_209_1 = stackIn_209_1;
                                          stackOut_209_2 = null;
                                          stackOut_209_3 = null;
                                          stackOut_209_4 = stackIn_209_4;
                                          stackOut_209_5 = stackIn_209_5;
                                          stackOut_209_6 = stackIn_209_6;
                                          stackOut_209_7 = stackIn_209_7;
                                          stackOut_209_8 = stackIn_209_8;
                                          stackOut_209_9 = stackIn_209_9;
                                          stackOut_209_10 = 0;
                                          stackIn_210_0 = stackOut_209_0;
                                          stackIn_210_1 = stackOut_209_1;
                                          stackIn_210_2 = stackOut_209_2;
                                          stackIn_210_3 = stackOut_209_3;
                                          stackIn_210_4 = stackOut_209_4;
                                          stackIn_210_5 = stackOut_209_5;
                                          stackIn_210_6 = stackOut_209_6;
                                          stackIn_210_7 = stackOut_209_7;
                                          stackIn_210_8 = stackOut_209_8;
                                          stackIn_210_9 = stackOut_209_9;
                                          stackIn_210_10 = stackOut_209_10;
                                          break L56;
                                        } else {
                                          stackOut_208_0 = (lf[]) ((Object) stackIn_208_0);
                                          stackOut_208_1 = stackIn_208_1;
                                          stackOut_208_2 = null;
                                          stackOut_208_3 = null;
                                          stackOut_208_4 = stackIn_208_4;
                                          stackOut_208_5 = stackIn_208_5;
                                          stackOut_208_6 = stackIn_208_6;
                                          stackOut_208_7 = stackIn_208_7;
                                          stackOut_208_8 = stackIn_208_8;
                                          stackOut_208_9 = stackIn_208_9;
                                          stackOut_208_10 = 1;
                                          stackIn_210_0 = stackOut_208_0;
                                          stackIn_210_1 = stackOut_208_1;
                                          stackIn_210_2 = stackOut_208_2;
                                          stackIn_210_3 = stackOut_208_3;
                                          stackIn_210_4 = stackOut_208_4;
                                          stackIn_210_5 = stackOut_208_5;
                                          stackIn_210_6 = stackOut_208_6;
                                          stackIn_210_7 = stackOut_208_7;
                                          stackIn_210_8 = stackOut_208_8;
                                          stackIn_210_9 = stackOut_208_9;
                                          stackIn_210_10 = stackOut_208_10;
                                          break L56;
                                        }
                                      }
                                      stackOut_210_0 = (lf[]) ((Object) stackIn_210_0);
                                      stackOut_210_1 = stackIn_210_1;
                                      stackOut_210_2 = null;
                                      stackOut_210_3 = null;
                                      stackOut_210_4 = stackIn_210_4;
                                      stackOut_210_5 = stackIn_210_5;
                                      stackOut_210_6 = stackIn_210_6;
                                      stackOut_210_7 = stackIn_210_7;
                                      stackOut_210_8 = stackIn_210_8;
                                      stackOut_210_9 = stackIn_210_9 + ns.a(stackIn_210_10 != 0, 700, vv.field_b);
                                      stackIn_211_0 = stackOut_210_0;
                                      stackIn_211_1 = stackOut_210_1;
                                      stackIn_211_2 = stackOut_210_2;
                                      stackIn_211_3 = stackOut_210_3;
                                      stackIn_211_4 = stackOut_210_4;
                                      stackIn_211_5 = stackOut_210_5;
                                      stackIn_211_6 = stackOut_210_6;
                                      stackIn_211_7 = stackOut_210_7;
                                      stackIn_211_8 = stackOut_210_8;
                                      stackIn_211_9 = stackOut_210_9;
                                      break L55;
                                    } else {
                                      stackOut_204_0 = (lf[]) ((Object) stackIn_204_0);
                                      stackOut_204_1 = stackIn_204_1;
                                      stackOut_204_2 = null;
                                      stackOut_204_3 = null;
                                      stackOut_204_4 = stackIn_204_4;
                                      stackOut_204_5 = stackIn_204_5;
                                      stackOut_204_6 = stackIn_204_6;
                                      stackOut_204_7 = stackIn_204_7;
                                      stackOut_204_8 = stackIn_204_8;
                                      stackIn_206_0 = stackOut_204_0;
                                      stackIn_206_1 = stackOut_204_1;
                                      stackIn_206_2 = stackOut_204_2;
                                      stackIn_206_3 = stackOut_204_3;
                                      stackIn_206_4 = stackOut_204_4;
                                      stackIn_206_5 = stackOut_204_5;
                                      stackIn_206_6 = stackOut_204_6;
                                      stackIn_206_7 = stackOut_204_7;
                                      stackIn_206_8 = stackOut_204_8;
                                      stackOut_206_0 = (lf[]) ((Object) stackIn_206_0);
                                      stackOut_206_1 = stackIn_206_1;
                                      stackOut_206_2 = null;
                                      stackOut_206_3 = null;
                                      stackOut_206_4 = stackIn_206_4;
                                      stackOut_206_5 = stackIn_206_5;
                                      stackOut_206_6 = stackIn_206_6;
                                      stackOut_206_7 = stackIn_206_7;
                                      stackOut_206_8 = stackIn_206_8;
                                      stackOut_206_9 = 0;
                                      stackIn_211_0 = stackOut_206_0;
                                      stackIn_211_1 = stackOut_206_1;
                                      stackIn_211_2 = stackOut_206_2;
                                      stackIn_211_3 = stackOut_206_3;
                                      stackIn_211_4 = stackOut_206_4;
                                      stackIn_211_5 = stackOut_206_5;
                                      stackIn_211_6 = stackOut_206_6;
                                      stackIn_211_7 = stackOut_206_7;
                                      stackIn_211_8 = stackOut_206_8;
                                      stackIn_211_9 = stackOut_206_9;
                                      break L55;
                                    }
                                  }
                                  stackIn_211_0[stackIn_211_1] = new lf(stackIn_211_4, stackIn_211_5 != 0, stackIn_211_6, stackIn_211_7, stackIn_211_8, stackIn_211_9);
                                  var8++;
                                  if (var9 == 0) {
                                    continue L53;
                                  } else {
                                    break L54;
                                  }
                                }
                              }
                            }
                            if (var9 == 0) {
                              break L50;
                            } else {
                              break L52;
                            }
                          }
                        }
                      }
                      var8 = 0;
                      L57: while (true) {
                        if (var8 >= this.field_y) {
                          break L50;
                        } else {
                          stackOut_215_0 = this.field_s;
                          stackOut_215_1 = var8;
                          stackIn_236_0 = stackOut_215_0;
                          stackIn_236_1 = stackOut_215_1;
                          stackIn_216_0 = stackOut_215_0;
                          stackIn_216_1 = stackOut_215_1;
                          if (var9 != 0) {
                            break L51;
                          } else {
                            L58: {
                              stackOut_216_0 = (lf[]) ((Object) stackIn_216_0);
                              stackOut_216_1 = stackIn_216_1;
                              stackOut_216_2 = null;
                              stackOut_216_3 = null;
                              stackOut_216_4 = this.field_c;
                              stackOut_216_5 = 1;
                              stackOut_216_6 = tn.field_W[this.field_J][var8];
                              stackOut_216_7 = kw.field_P[this.field_J][var8];
                              stackOut_216_8 = this.field_d;
                              stackIn_220_0 = stackOut_216_0;
                              stackIn_220_1 = stackOut_216_1;
                              stackIn_220_2 = stackOut_216_2;
                              stackIn_220_3 = stackOut_216_3;
                              stackIn_220_4 = stackOut_216_4;
                              stackIn_220_5 = stackOut_216_5;
                              stackIn_220_6 = stackOut_216_6;
                              stackIn_220_7 = stackOut_216_7;
                              stackIn_220_8 = stackOut_216_8;
                              stackIn_217_0 = stackOut_216_0;
                              stackIn_217_1 = stackOut_216_1;
                              stackIn_217_2 = stackOut_216_2;
                              stackIn_217_3 = stackOut_216_3;
                              stackIn_217_4 = stackOut_216_4;
                              stackIn_217_5 = stackOut_216_5;
                              stackIn_217_6 = stackOut_216_6;
                              stackIn_217_7 = stackOut_216_7;
                              stackIn_217_8 = stackOut_216_8;
                              if (!this.field_d) {
                                L59: {
                                  stackOut_220_0 = (lf[]) ((Object) stackIn_220_0);
                                  stackOut_220_1 = stackIn_220_1;
                                  stackOut_220_2 = null;
                                  stackOut_220_3 = null;
                                  stackOut_220_4 = stackIn_220_4;
                                  stackOut_220_5 = stackIn_220_5;
                                  stackOut_220_6 = stackIn_220_6;
                                  stackOut_220_7 = stackIn_220_7;
                                  stackOut_220_8 = stackIn_220_8;
                                  stackOut_220_9 = 1300;
                                  stackIn_222_0 = stackOut_220_0;
                                  stackIn_222_1 = stackOut_220_1;
                                  stackIn_222_2 = stackOut_220_2;
                                  stackIn_222_3 = stackOut_220_3;
                                  stackIn_222_4 = stackOut_220_4;
                                  stackIn_222_5 = stackOut_220_5;
                                  stackIn_222_6 = stackOut_220_6;
                                  stackIn_222_7 = stackOut_220_7;
                                  stackIn_222_8 = stackOut_220_8;
                                  stackIn_222_9 = stackOut_220_9;
                                  stackIn_221_0 = stackOut_220_0;
                                  stackIn_221_1 = stackOut_220_1;
                                  stackIn_221_2 = stackOut_220_2;
                                  stackIn_221_3 = stackOut_220_3;
                                  stackIn_221_4 = stackOut_220_4;
                                  stackIn_221_5 = stackOut_220_5;
                                  stackIn_221_6 = stackOut_220_6;
                                  stackIn_221_7 = stackOut_220_7;
                                  stackIn_221_8 = stackOut_220_8;
                                  stackIn_221_9 = stackOut_220_9;
                                  if (param3) {
                                    stackOut_222_0 = (lf[]) ((Object) stackIn_222_0);
                                    stackOut_222_1 = stackIn_222_1;
                                    stackOut_222_2 = null;
                                    stackOut_222_3 = null;
                                    stackOut_222_4 = stackIn_222_4;
                                    stackOut_222_5 = stackIn_222_5;
                                    stackOut_222_6 = stackIn_222_6;
                                    stackOut_222_7 = stackIn_222_7;
                                    stackOut_222_8 = stackIn_222_8;
                                    stackOut_222_9 = stackIn_222_9;
                                    stackOut_222_10 = 0;
                                    stackIn_223_0 = stackOut_222_0;
                                    stackIn_223_1 = stackOut_222_1;
                                    stackIn_223_2 = stackOut_222_2;
                                    stackIn_223_3 = stackOut_222_3;
                                    stackIn_223_4 = stackOut_222_4;
                                    stackIn_223_5 = stackOut_222_5;
                                    stackIn_223_6 = stackOut_222_6;
                                    stackIn_223_7 = stackOut_222_7;
                                    stackIn_223_8 = stackOut_222_8;
                                    stackIn_223_9 = stackOut_222_9;
                                    stackIn_223_10 = stackOut_222_10;
                                    break L59;
                                  } else {
                                    stackOut_221_0 = (lf[]) ((Object) stackIn_221_0);
                                    stackOut_221_1 = stackIn_221_1;
                                    stackOut_221_2 = null;
                                    stackOut_221_3 = null;
                                    stackOut_221_4 = stackIn_221_4;
                                    stackOut_221_5 = stackIn_221_5;
                                    stackOut_221_6 = stackIn_221_6;
                                    stackOut_221_7 = stackIn_221_7;
                                    stackOut_221_8 = stackIn_221_8;
                                    stackOut_221_9 = stackIn_221_9;
                                    stackOut_221_10 = 1;
                                    stackIn_223_0 = stackOut_221_0;
                                    stackIn_223_1 = stackOut_221_1;
                                    stackIn_223_2 = stackOut_221_2;
                                    stackIn_223_3 = stackOut_221_3;
                                    stackIn_223_4 = stackOut_221_4;
                                    stackIn_223_5 = stackOut_221_5;
                                    stackIn_223_6 = stackOut_221_6;
                                    stackIn_223_7 = stackOut_221_7;
                                    stackIn_223_8 = stackOut_221_8;
                                    stackIn_223_9 = stackOut_221_9;
                                    stackIn_223_10 = stackOut_221_10;
                                    break L59;
                                  }
                                }
                                stackOut_223_0 = (lf[]) ((Object) stackIn_223_0);
                                stackOut_223_1 = stackIn_223_1;
                                stackOut_223_2 = null;
                                stackOut_223_3 = null;
                                stackOut_223_4 = stackIn_223_4;
                                stackOut_223_5 = stackIn_223_5;
                                stackOut_223_6 = stackIn_223_6;
                                stackOut_223_7 = stackIn_223_7;
                                stackOut_223_8 = stackIn_223_8;
                                stackOut_223_9 = stackIn_223_9 - -ns.a(stackIn_223_10 != 0, 700, vv.field_b);
                                stackIn_224_0 = stackOut_223_0;
                                stackIn_224_1 = stackOut_223_1;
                                stackIn_224_2 = stackOut_223_2;
                                stackIn_224_3 = stackOut_223_3;
                                stackIn_224_4 = stackOut_223_4;
                                stackIn_224_5 = stackOut_223_5;
                                stackIn_224_6 = stackOut_223_6;
                                stackIn_224_7 = stackOut_223_7;
                                stackIn_224_8 = stackOut_223_8;
                                stackIn_224_9 = stackOut_223_9;
                                break L58;
                              } else {
                                stackOut_217_0 = (lf[]) ((Object) stackIn_217_0);
                                stackOut_217_1 = stackIn_217_1;
                                stackOut_217_2 = null;
                                stackOut_217_3 = null;
                                stackOut_217_4 = stackIn_217_4;
                                stackOut_217_5 = stackIn_217_5;
                                stackOut_217_6 = stackIn_217_6;
                                stackOut_217_7 = stackIn_217_7;
                                stackOut_217_8 = stackIn_217_8;
                                stackIn_219_0 = stackOut_217_0;
                                stackIn_219_1 = stackOut_217_1;
                                stackIn_219_2 = stackOut_217_2;
                                stackIn_219_3 = stackOut_217_3;
                                stackIn_219_4 = stackOut_217_4;
                                stackIn_219_5 = stackOut_217_5;
                                stackIn_219_6 = stackOut_217_6;
                                stackIn_219_7 = stackOut_217_7;
                                stackIn_219_8 = stackOut_217_8;
                                stackOut_219_0 = (lf[]) ((Object) stackIn_219_0);
                                stackOut_219_1 = stackIn_219_1;
                                stackOut_219_2 = null;
                                stackOut_219_3 = null;
                                stackOut_219_4 = stackIn_219_4;
                                stackOut_219_5 = stackIn_219_5;
                                stackOut_219_6 = stackIn_219_6;
                                stackOut_219_7 = stackIn_219_7;
                                stackOut_219_8 = stackIn_219_8;
                                stackOut_219_9 = 0;
                                stackIn_224_0 = stackOut_219_0;
                                stackIn_224_1 = stackOut_219_1;
                                stackIn_224_2 = stackOut_219_2;
                                stackIn_224_3 = stackOut_219_3;
                                stackIn_224_4 = stackOut_219_4;
                                stackIn_224_5 = stackOut_219_5;
                                stackIn_224_6 = stackOut_219_6;
                                stackIn_224_7 = stackOut_219_7;
                                stackIn_224_8 = stackOut_219_8;
                                stackIn_224_9 = stackOut_219_9;
                                break L58;
                              }
                            }
                            stackIn_224_0[stackIn_224_1] = new lf(stackIn_224_4, stackIn_224_5 != 0, stackIn_224_6, stackIn_224_7, stackIn_224_8, stackIn_224_9);
                            var8++;
                            if (var9 == 0) {
                              continue L57;
                            } else {
                              break L50;
                            }
                          }
                        }
                      }
                    }
                    L60: while (true) {
                      stackIn_236_0[stackIn_236_1] = new lf(this.field_a, false, tn.field_W[this.field_u][var8], kw.field_P[this.field_u][var8], this.field_d, 0);
                      var8++;
                      if (var9 != 0) {
                        break L47;
                      } else {
                        if (var9 == 0) {
                          if ((this.field_w ^ -1) >= (var8 ^ -1)) {
                            break L48;
                          } else {
                            stackOut_235_0 = this.field_i;
                            stackOut_235_1 = var8;
                            stackIn_236_0 = stackOut_235_0;
                            stackIn_236_1 = stackOut_235_1;
                            continue L60;
                          }
                        } else {
                          break L49;
                        }
                      }
                    }
                  }
                  L61: {
                    if (this.field_o) {
                      break L61;
                    } else {
                      var8 = 0;
                      L62: while (true) {
                        L63: {
                          if (var8 >= this.field_w) {
                            break L63;
                          } else {
                            this.field_i[var8] = new lf(this.field_a, false, tn.field_W[this.field_u][var8], kw.field_P[this.field_u][var8], this.field_d, 0);
                            var8++;
                            if (var9 != 0) {
                              break L48;
                            } else {
                              if (var9 == 0) {
                                continue L62;
                              } else {
                                break L63;
                              }
                            }
                          }
                        }
                        if (var9 == 0) {
                          break L48;
                        } else {
                          break L61;
                        }
                      }
                    }
                  }
                  var8 = 0;
                  L64: while (true) {
                    if ((this.field_w ^ -1) >= (var8 ^ -1)) {
                      break L48;
                    } else {
                      stackOut_235_0 = this.field_i;
                      stackOut_235_1 = var8;
                      stackIn_236_0 = stackOut_235_0;
                      stackIn_236_1 = stackOut_235_1;
                      stackIn_236_0[stackIn_236_1] = new lf(this.field_a, false, tn.field_W[this.field_u][var8], kw.field_P[this.field_u][var8], this.field_d, 0);
                      var8++;
                      if (var9 != 0) {
                        break L47;
                      } else {
                        if (var9 == 0) {
                          continue L64;
                        } else {
                          break L49;
                        }
                      }
                    }
                  }
                }
                break L48;
              }
              L65: {
                stackOut_240_0 = this;
                stackIn_243_0 = stackOut_240_0;
                stackIn_241_0 = stackOut_240_0;
                if ((this.field_u ^ -1) > (this.field_J ^ -1)) {
                  stackOut_243_0 = this;
                  stackOut_243_1 = this.field_J;
                  stackIn_244_0 = stackOut_243_0;
                  stackIn_244_1 = stackOut_243_1;
                  break L65;
                } else {
                  stackOut_241_0 = this;
                  stackOut_241_1 = this.field_u;
                  stackIn_244_0 = stackOut_241_0;
                  stackIn_244_1 = stackOut_241_1;
                  break L65;
                }
              }
              ((sk) (this)).field_C = stackIn_244_1;
              break L47;
            }
            L66: {
              if (-1 != (this.field_v ^ -1)) {
                break L66;
              } else {
                if (-1 != (this.field_O ^ -1)) {
                  break L66;
                } else {
                  if (!this.field_d) {
                    this.field_m = true;
                    break L66;
                  } else {
                    break L66;
                  }
                }
              }
            }
            L67: {
              if (!this.field_d) {
                break L67;
              } else {
                if (this.field_f) {
                  this.field_n = 6;
                  this.h(1);
                  break L67;
                } else {
                  break L67;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L68: {
            var6 = decompiledCaughtException;
            stackOut_263_0 = (RuntimeException) (var6);
            stackOut_263_1 = new StringBuilder().append("sk.U(").append(param0).append(',');
            stackIn_266_0 = stackOut_263_0;
            stackIn_266_1 = stackOut_263_1;
            stackIn_264_0 = stackOut_263_0;
            stackIn_264_1 = stackOut_263_1;
            if (param1 == null) {
              stackOut_266_0 = (RuntimeException) ((Object) stackIn_266_0);
              stackOut_266_1 = (StringBuilder) ((Object) stackIn_266_1);
              stackOut_266_2 = "null";
              stackIn_267_0 = stackOut_266_0;
              stackIn_267_1 = stackOut_266_1;
              stackIn_267_2 = stackOut_266_2;
              break L68;
            } else {
              stackOut_264_0 = (RuntimeException) ((Object) stackIn_264_0);
              stackOut_264_1 = (StringBuilder) ((Object) stackIn_264_1);
              stackOut_264_2 = "{...}";
              stackIn_267_0 = stackOut_264_0;
              stackIn_267_1 = stackOut_264_1;
              stackIn_267_2 = stackOut_264_2;
              break L68;
            }
          }
          L69: {
            stackOut_267_0 = (RuntimeException) ((Object) stackIn_267_0);
            stackOut_267_1 = ((StringBuilder) (Object) stackIn_267_1).append(stackIn_267_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_270_0 = stackOut_267_0;
            stackIn_270_1 = stackOut_267_1;
            stackIn_268_0 = stackOut_267_0;
            stackIn_268_1 = stackOut_267_1;
            if (param4 == null) {
              stackOut_270_0 = (RuntimeException) ((Object) stackIn_270_0);
              stackOut_270_1 = (StringBuilder) ((Object) stackIn_270_1);
              stackOut_270_2 = "null";
              stackIn_271_0 = stackOut_270_0;
              stackIn_271_1 = stackOut_270_1;
              stackIn_271_2 = stackOut_270_2;
              break L69;
            } else {
              stackOut_268_0 = (RuntimeException) ((Object) stackIn_268_0);
              stackOut_268_1 = (StringBuilder) ((Object) stackIn_268_1);
              stackOut_268_2 = "{...}";
              stackIn_271_0 = stackOut_268_0;
              stackIn_271_1 = stackOut_268_1;
              stackIn_271_2 = stackOut_268_2;
              break L69;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_271_0), stackIn_271_2 + ')');
        }
    }

    sk(ha param0, v param1, vb param2) {
        RuntimeException runtimeException = null;
        um var4 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        this.field_I = 60;
        this.field_F = 0;
        this.field_z = 1;
        try {
          L0: {
            L1: {
              this.field_k = param2;
              this.field_x = param0;
              if (this.field_x == null) {
                break L1;
              } else {
                this.field_r = param0.field_v;
                this.field_l = new int[2];
                this.field_x = param0;
                break L1;
              }
            }
            L2: {
              if (param1 != null) {
                L3: {
                  this.field_B = param1;
                  if (null == u.field_p) {
                    break L3;
                  } else {
                    u.field_p.field_k = this.field_B;
                    if (!ArmiesOfGielinor.field_M) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                u.field_p = new sr(rs.field_k, se.field_a, param1);
                break L2;
              } else {
                break L2;
              }
            }
            this.field_H = new wk(640, 480);
            var4 = cb.field_a[ns.a(false, cb.field_a.length, vv.field_b)];
            hh.a(-16147, 50, var4, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (runtimeException);
            stackOut_14_1 = new StringBuilder().append("sk.<init>(");
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L4;
            }
          }
          L5: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L5;
            }
          }
          L6: {
            stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L6;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
    }

    static {
        field_N = "Yes";
    }
}
