/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

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
        RuntimeException decompiledCaughtException = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (!((sk) this).field_i[0].field_d) {
              L1: {
                var2_int = 0;
                if (param0 == -13146) {
                  break L1;
                } else {
                  ((sk) this).field_I = 30;
                  break L1;
                }
              }
              L2: while (true) {
                if (~(-((sk) this).field_J + 3) >= ~var2_int) {
                  break L0;
                } else {
                  L3: {
                    if (((sk) this).field_s[var2_int] == null) {
                      break L3;
                    } else {
                      if (!((sk) this).field_s[var2_int].b((byte) 44)) {
                        break L3;
                      } else {
                        ((sk) this).field_s[var2_int].field_m = ns.a(false, 20, vv.field_b);
                        ((sk) this).field_s[var2_int].field_f = 1;
                        break L3;
                      }
                    }
                  }
                  var2_int++;
                  continue L2;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) (Object) runtimeException, "sk.OA(" + param0 + ')');
        }
    }

    private final void a(lf[] param0, int param1, int param2, lf[] param3) {
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
            var6_array = new int[-param1 + 3];
            var7 = 0;
            if (param1 == 2) {
              return;
            } else {
              L1: {
                if (param1 == 1) {
                  L2: {
                    if (null == param0[0]) {
                      break L2;
                    } else {
                      if (!param0[0].b(2166)) {
                        break L2;
                      } else {
                        if (param3[0] != null) {
                          break L2;
                        } else {
                          L3: {
                            if (param2 != 0) {
                              break L3;
                            } else {
                              if (param3[1] != null) {
                                break L2;
                              } else {
                                break L3;
                              }
                            }
                          }
                          var6_array[var7] = 0;
                          var7++;
                          break L2;
                        }
                      }
                    }
                  }
                  if (null == param0[1]) {
                    break L1;
                  } else {
                    if (!param0[1].b(2166)) {
                      break L1;
                    } else {
                      if (null != param3[0]) {
                        break L1;
                      } else {
                        L4: {
                          if (0 != param2) {
                            break L4;
                          } else {
                            if (null == param3[2]) {
                              break L4;
                            } else {
                              break L1;
                            }
                          }
                        }
                        var6_array[var7] = 1;
                        var7++;
                        break L1;
                      }
                    }
                  }
                } else {
                  if (param1 != 0) {
                    break L1;
                  } else {
                    L5: {
                      if (null == param0[0]) {
                        break L5;
                      } else {
                        if (!param0[0].b(2166)) {
                          break L5;
                        } else {
                          if (param3[0] != null) {
                            break L5;
                          } else {
                            L6: {
                              if (1 != param2) {
                                break L6;
                              } else {
                                if (param3[1] != null) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            var6_array[var7] = 0;
                            var7++;
                            break L5;
                          }
                        }
                      }
                    }
                    L7: {
                      if (param0[1] == null) {
                        break L7;
                      } else {
                        if (param0[1].b(2166)) {
                          L8: {
                            if (0 == param2) {
                              break L8;
                            } else {
                              if (null != param3[0]) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          L9: {
                            if (param2 != 0) {
                              break L9;
                            } else {
                              if (null == param3[1]) {
                                break L9;
                              } else {
                                break L7;
                              }
                            }
                          }
                          var6_array[var7] = 1;
                          var7++;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                    }
                    if (null == param0[2]) {
                      break L1;
                    } else {
                      if (!param0[2].b(2166)) {
                        break L1;
                      } else {
                        L10: {
                          if (param2 != 2) {
                            break L10;
                          } else {
                            if (param3[0] != null) {
                              break L1;
                            } else {
                              break L10;
                            }
                          }
                        }
                        L11: {
                          if (1 != param2) {
                            break L11;
                          } else {
                            if (param3[1] != null) {
                              break L1;
                            } else {
                              break L11;
                            }
                          }
                        }
                        L12: {
                          if (param2 != 0) {
                            break L12;
                          } else {
                            if (param3[2] != null) {
                              break L1;
                            } else {
                              break L12;
                            }
                          }
                        }
                        var6_array[var7] = 2;
                        var7++;
                        break L1;
                      }
                    }
                  }
                }
              }
              if (var7 != 0) {
                var8 = -1;
                L13: {
                  L14: {
                    var9 = var6_array[ns.a(false, var7, vv.field_b)];
                    if (1 != param1) {
                      break L14;
                    } else {
                      if (param0[2] == null) {
                        var8 = 2;
                        break L13;
                      } else {
                        break L14;
                      }
                    }
                  }
                  if (param1 == 0) {
                    if (var9 == 2) {
                      if (null != param0[4]) {
                        if (0 != param1) {
                          break L13;
                        } else {
                          if (param0[3] != null) {
                            break L13;
                          } else {
                            var8 = 3;
                            break L13;
                          }
                        }
                      } else {
                        var8 = 4;
                        break L13;
                      }
                    } else {
                      if (param0[3] != null) {
                        if (param1 != 0) {
                          break L13;
                        } else {
                          if (param0[4] != null) {
                            break L13;
                          } else {
                            var8 = 4;
                            break L13;
                          }
                        }
                      } else {
                        var8 = 3;
                        break L13;
                      }
                    }
                  } else {
                    break L13;
                  }
                }
                L15: {
                  if (var8 <= -1) {
                    break L15;
                  } else {
                    param0[var8] = param0[var9];
                    param0[var9] = null;
                    param0[var8].field_j = tn.field_W[param1][var8];
                    param0[var8].field_p = kw.field_P[param1][var8];
                    break L15;
                  }
                }
                break L0;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var6 = decompiledCaughtException;
            stackOut_145_0 = (RuntimeException) var6;
            stackOut_145_1 = new StringBuilder().append("sk.B(");
            stackIn_148_0 = stackOut_145_0;
            stackIn_148_1 = stackOut_145_1;
            stackIn_146_0 = stackOut_145_0;
            stackIn_146_1 = stackOut_145_1;
            if (param0 == null) {
              stackOut_148_0 = (RuntimeException) (Object) stackIn_148_0;
              stackOut_148_1 = (StringBuilder) (Object) stackIn_148_1;
              stackOut_148_2 = "null";
              stackIn_149_0 = stackOut_148_0;
              stackIn_149_1 = stackOut_148_1;
              stackIn_149_2 = stackOut_148_2;
              break L16;
            } else {
              stackOut_146_0 = (RuntimeException) (Object) stackIn_146_0;
              stackOut_146_1 = (StringBuilder) (Object) stackIn_146_1;
              stackOut_146_2 = "{...}";
              stackIn_149_0 = stackOut_146_0;
              stackIn_149_1 = stackOut_146_1;
              stackIn_149_2 = stackOut_146_2;
              break L16;
            }
          }
          L17: {
            stackOut_149_0 = (RuntimeException) (Object) stackIn_149_0;
            stackOut_149_1 = ((StringBuilder) (Object) stackIn_149_1).append(stackIn_149_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_152_0 = stackOut_149_0;
            stackIn_152_1 = stackOut_149_1;
            stackIn_150_0 = stackOut_149_0;
            stackIn_150_1 = stackOut_149_1;
            if (param3 == null) {
              stackOut_152_0 = (RuntimeException) (Object) stackIn_152_0;
              stackOut_152_1 = (StringBuilder) (Object) stackIn_152_1;
              stackOut_152_2 = "null";
              stackIn_153_0 = stackOut_152_0;
              stackIn_153_1 = stackOut_152_1;
              stackIn_153_2 = stackOut_152_2;
              break L17;
            } else {
              stackOut_150_0 = (RuntimeException) (Object) stackIn_150_0;
              stackOut_150_1 = (StringBuilder) (Object) stackIn_150_1;
              stackOut_150_2 = "{...}";
              stackIn_153_0 = stackOut_150_0;
              stackIn_153_1 = stackOut_150_1;
              stackIn_153_2 = stackOut_150_2;
              break L17;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_153_0, stackIn_153_2 + ',' + true + ')');
        }
    }

    private final void a(lf[] param0) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (~var3_int <= ~param0.length) {
                break L0;
              } else {
                L2: {
                  if (null == param0[var3_int]) {
                    break L2;
                  } else {
                    if (!param0[var3_int].b((byte) 121)) {
                      break L2;
                    } else {
                      param0[var3_int].field_f = 5;
                      param0[var3_int].field_m = ns.a(false, 20, vv.field_b);
                      break L2;
                    }
                  }
                }
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("sk.GA(");
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + -4925 + ')');
        }
    }

    private final void a(int param0, lf[] param1) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_48_0 = null;
        lf stackIn_48_1 = null;
        lf stackIn_51_0 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_46_0 = null;
        lf stackOut_46_1 = null;
        lf stackOut_49_0 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            param0 = 0;
            var4_int = 0;
            L1: while (true) {
              if (~var4_int <= ~param1.length) {
                var4_int = 0;
                var5 = new int[param0];
                var6 = 0;
                L2: while (true) {
                  if (var6 >= param1.length) {
                    param0 = var4_int;
                    var6 = 0;
                    L3: while (true) {
                      if (param0 <= var6) {
                        L4: {
                          if (!cu.field_a) {
                            break L4;
                          } else {
                            var6 = 0;
                            L5: while (true) {
                              if (var6 >= param0) {
                                this.a((byte) 104, 0, 0, 128);
                                break L4;
                              } else {
                                L6: {
                                  if (param1[var5[var6]] == null) {
                                    break L6;
                                  } else {
                                    param1[var5[var6]].a(((sk) this).field_C, -84, true);
                                    break L6;
                                  }
                                }
                                var6++;
                                continue L5;
                              }
                            }
                          }
                        }
                        var6 = 0;
                        L7: while (true) {
                          if (~param0 >= ~var6) {
                            break L0;
                          } else {
                            stackOut_46_0 = null;
                            stackOut_46_1 = param1[var5[var6]];
                            stackIn_48_0 = stackOut_46_0;
                            stackIn_48_1 = stackOut_46_1;
                            L8: {
                              if (stackIn_48_0 == (Object) (Object) stackIn_48_1) {
                                break L8;
                              } else {
                                stackOut_49_0 = param1[var5[var6]];
                                stackIn_51_0 = stackOut_49_0;
                                ((lf) (Object) stackIn_51_0).a(((sk) this).field_C, -101, false);
                                break L8;
                              }
                            }
                            var6++;
                            continue L7;
                          }
                        }
                      } else {
                        L9: {
                          var7 = var6;
                          if (null == param1[var5[var7]]) {
                            break L9;
                          } else {
                            var8 = var6 + 1;
                            L10: while (true) {
                              if (var8 >= param0) {
                                if (var7 == var6) {
                                  break L9;
                                } else {
                                  var8 = var5[var7];
                                  var5[var7] = var5[var6];
                                  var5[var6] = var8;
                                  break L9;
                                }
                              } else {
                                L11: {
                                  if (null == param1[var5[var8]]) {
                                    break L11;
                                  } else {
                                    if (~param1[var5[var8]].field_s >= ~param1[var5[var7]].field_s) {
                                      break L11;
                                    } else {
                                      var7 = var8;
                                      break L11;
                                    }
                                  }
                                }
                                var8++;
                                continue L10;
                              }
                            }
                          }
                        }
                        var6++;
                        continue L3;
                      }
                    }
                  } else {
                    L12: {
                      if (param1[var6] != null) {
                        int incrementValue$1 = var4_int;
                        var4_int++;
                        var5[incrementValue$1] = var6;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    var6++;
                    continue L2;
                  }
                }
              } else {
                param0++;
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var4 = decompiledCaughtException;
            stackOut_54_0 = (RuntimeException) var4;
            stackOut_54_1 = new StringBuilder().append("sk.F(").append(param0).append(',');
            stackIn_57_0 = stackOut_54_0;
            stackIn_57_1 = stackOut_54_1;
            stackIn_55_0 = stackOut_54_0;
            stackIn_55_1 = stackOut_54_1;
            if (param1 == null) {
              stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
              stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
              stackOut_57_2 = "null";
              stackIn_58_0 = stackOut_57_0;
              stackIn_58_1 = stackOut_57_1;
              stackIn_58_2 = stackOut_57_2;
              break L13;
            } else {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "{...}";
              stackIn_58_0 = stackOut_55_0;
              stackIn_58_1 = stackOut_55_1;
              stackIn_58_2 = stackOut_55_2;
              break L13;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_58_0, stackIn_58_2 + ',' + 83 + ')');
        }
    }

    public final boolean b(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_7_0 = false;
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
                break L0;
              } else {
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "sk.I(" + param0 + ')');
        }
        return stackIn_7_0;
    }

    public final boolean a(oj param0, byte param1) {
        ag var3 = null;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        jd var6_ref = null;
        jd var7 = null;
        String var8_ref_String = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_23_0 = null;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_28_2 = 0;
        Object stackIn_35_0 = null;
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        Object stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        Object stackIn_44_0 = null;
        Object stackIn_45_0 = null;
        Object stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        Object stackIn_47_0 = null;
        Object stackIn_48_0 = null;
        Object stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        Object stackIn_56_0 = null;
        Object stackIn_57_0 = null;
        Object stackIn_58_0 = null;
        Object stackIn_59_0 = null;
        Object stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        Object stackIn_119_0 = null;
        Object stackIn_120_0 = null;
        Object stackIn_121_0 = null;
        int stackIn_121_1 = 0;
        lf[] stackIn_128_0 = null;
        int stackIn_128_1 = 0;
        lf stackIn_128_2 = null;
        lf stackIn_128_3 = null;
        int stackIn_128_4 = 0;
        int stackIn_128_5 = 0;
        int stackIn_128_6 = 0;
        int stackIn_128_7 = 0;
        boolean stackIn_128_8 = false;
        lf[] stackIn_129_0 = null;
        int stackIn_129_1 = 0;
        lf stackIn_129_2 = null;
        lf stackIn_129_3 = null;
        int stackIn_129_4 = 0;
        int stackIn_129_5 = 0;
        int stackIn_129_6 = 0;
        int stackIn_129_7 = 0;
        boolean stackIn_129_8 = false;
        lf[] stackIn_130_0 = null;
        int stackIn_130_1 = 0;
        lf stackIn_130_2 = null;
        lf stackIn_130_3 = null;
        int stackIn_130_4 = 0;
        int stackIn_130_5 = 0;
        int stackIn_130_6 = 0;
        int stackIn_130_7 = 0;
        boolean stackIn_130_8 = false;
        lf[] stackIn_131_0 = null;
        int stackIn_131_1 = 0;
        lf stackIn_131_2 = null;
        lf stackIn_131_3 = null;
        int stackIn_131_4 = 0;
        int stackIn_131_5 = 0;
        int stackIn_131_6 = 0;
        int stackIn_131_7 = 0;
        boolean stackIn_131_8 = false;
        int stackIn_131_9 = 0;
        lf[] stackIn_136_0 = null;
        int stackIn_136_1 = 0;
        lf stackIn_136_2 = null;
        lf stackIn_136_3 = null;
        int stackIn_136_4 = 0;
        int stackIn_136_5 = 0;
        int stackIn_136_6 = 0;
        int stackIn_136_7 = 0;
        boolean stackIn_136_8 = false;
        lf[] stackIn_137_0 = null;
        int stackIn_137_1 = 0;
        lf stackIn_137_2 = null;
        lf stackIn_137_3 = null;
        int stackIn_137_4 = 0;
        int stackIn_137_5 = 0;
        int stackIn_137_6 = 0;
        int stackIn_137_7 = 0;
        boolean stackIn_137_8 = false;
        lf[] stackIn_138_0 = null;
        int stackIn_138_1 = 0;
        lf stackIn_138_2 = null;
        lf stackIn_138_3 = null;
        int stackIn_138_4 = 0;
        int stackIn_138_5 = 0;
        int stackIn_138_6 = 0;
        int stackIn_138_7 = 0;
        boolean stackIn_138_8 = false;
        lf[] stackIn_139_0 = null;
        int stackIn_139_1 = 0;
        lf stackIn_139_2 = null;
        lf stackIn_139_3 = null;
        int stackIn_139_4 = 0;
        int stackIn_139_5 = 0;
        int stackIn_139_6 = 0;
        int stackIn_139_7 = 0;
        boolean stackIn_139_8 = false;
        int stackIn_139_9 = 0;
        Object stackIn_149_0 = null;
        Object stackIn_150_0 = null;
        Object stackIn_151_0 = null;
        int stackIn_151_1 = 0;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_22_0 = null;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        Object stackOut_34_0 = null;
        Object stackOut_35_0 = null;
        Object stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        Object stackOut_36_0 = null;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        Object stackOut_43_0 = null;
        Object stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        Object stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        Object stackOut_46_0 = null;
        Object stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        Object stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        Object stackOut_55_0 = null;
        Object stackOut_56_0 = null;
        Object stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        Object stackOut_57_0 = null;
        Object stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        Object stackOut_118_0 = null;
        Object stackOut_120_0 = null;
        int stackOut_120_1 = 0;
        Object stackOut_119_0 = null;
        int stackOut_119_1 = 0;
        lf[] stackOut_135_0 = null;
        int stackOut_135_1 = 0;
        lf stackOut_135_2 = null;
        lf stackOut_135_3 = null;
        int stackOut_135_4 = 0;
        int stackOut_135_5 = 0;
        int stackOut_135_6 = 0;
        int stackOut_135_7 = 0;
        boolean stackOut_135_8 = false;
        lf[] stackOut_138_0 = null;
        int stackOut_138_1 = 0;
        lf stackOut_138_2 = null;
        lf stackOut_138_3 = null;
        int stackOut_138_4 = 0;
        int stackOut_138_5 = 0;
        int stackOut_138_6 = 0;
        int stackOut_138_7 = 0;
        boolean stackOut_138_8 = false;
        int stackOut_138_9 = 0;
        lf[] stackOut_136_0 = null;
        int stackOut_136_1 = 0;
        lf stackOut_136_2 = null;
        lf stackOut_136_3 = null;
        int stackOut_136_4 = 0;
        int stackOut_136_5 = 0;
        int stackOut_136_6 = 0;
        int stackOut_136_7 = 0;
        boolean stackOut_136_8 = false;
        lf[] stackOut_137_0 = null;
        int stackOut_137_1 = 0;
        lf stackOut_137_2 = null;
        lf stackOut_137_3 = null;
        int stackOut_137_4 = 0;
        int stackOut_137_5 = 0;
        int stackOut_137_6 = 0;
        int stackOut_137_7 = 0;
        boolean stackOut_137_8 = false;
        int stackOut_137_9 = 0;
        lf[] stackOut_127_0 = null;
        int stackOut_127_1 = 0;
        lf stackOut_127_2 = null;
        lf stackOut_127_3 = null;
        int stackOut_127_4 = 0;
        int stackOut_127_5 = 0;
        int stackOut_127_6 = 0;
        int stackOut_127_7 = 0;
        boolean stackOut_127_8 = false;
        lf[] stackOut_130_0 = null;
        int stackOut_130_1 = 0;
        lf stackOut_130_2 = null;
        lf stackOut_130_3 = null;
        int stackOut_130_4 = 0;
        int stackOut_130_5 = 0;
        int stackOut_130_6 = 0;
        int stackOut_130_7 = 0;
        boolean stackOut_130_8 = false;
        int stackOut_130_9 = 0;
        lf[] stackOut_128_0 = null;
        int stackOut_128_1 = 0;
        lf stackOut_128_2 = null;
        lf stackOut_128_3 = null;
        int stackOut_128_4 = 0;
        int stackOut_128_5 = 0;
        int stackOut_128_6 = 0;
        int stackOut_128_7 = 0;
        boolean stackOut_128_8 = false;
        lf[] stackOut_129_0 = null;
        int stackOut_129_1 = 0;
        lf stackOut_129_2 = null;
        lf stackOut_129_3 = null;
        int stackOut_129_4 = 0;
        int stackOut_129_5 = 0;
        int stackOut_129_6 = 0;
        int stackOut_129_7 = 0;
        boolean stackOut_129_8 = false;
        int stackOut_129_9 = 0;
        Object stackOut_148_0 = null;
        Object stackOut_150_0 = null;
        int stackOut_150_1 = 0;
        Object stackOut_149_0 = null;
        int stackOut_149_1 = 0;
        L0: {
          var10 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (1 == param0.field_m) {
            L1: {
              var3 = (ag) (Object) param0;
              var4 = ((sk) this).field_x.field_v * var3.field_G + var3.field_Q;
              var5 = var3.field_F + (var4 + var3.field_B * ((sk) this).field_x.field_v);
              stackOut_2_0 = this;
              stackIn_4_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (var3.field_B * var3.field_B + var3.field_F * var3.field_F <= 1) {
                stackOut_4_0 = this;
                stackOut_4_1 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L1;
              } else {
                stackOut_3_0 = this;
                stackOut_3_1 = 1;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                break L1;
              }
            }
            L2: {
              ((sk) this).field_d = stackIn_5_1 != 0;
              if (var4 < 0) {
                break L2;
              } else {
                if (var4 >= ((sk) this).field_x.field_Eb.length) {
                  break L2;
                } else {
                  if (var5 < 0) {
                    break L2;
                  } else {
                    if (~var5 > ~((sk) this).field_x.field_Eb.length) {
                      L3: {
                        var6_ref = ((sk) this).field_x.field_Eb[var4].field_c;
                        var7 = ((sk) this).field_x.field_Eb[var5].field_c;
                        if (var6_ref == null) {
                          break L3;
                        } else {
                          if (var7 == null) {
                            break L3;
                          } else {
                            L4: {
                              ((sk) this).field_k.field_x = var4;
                              this.b((byte) 54, ((sk) this).field_x.field_hb);
                              ((sk) this).field_g = -1;
                              ((sk) this).field_e = -1;
                              var8 = var6_ref.field_A + var6_ref.field_Y;
                              var9 = var6_ref.field_t - -var6_ref.field_A;
                              ((sk) this).field_e = var6_ref.field_O;
                              ((sk) this).field_J = bw.field_m[var6_ref.field_N][9];
                              stackOut_22_0 = this;
                              stackIn_24_0 = stackOut_22_0;
                              stackIn_23_0 = stackOut_22_0;
                              if (0 < vu.field_N[((sk) this).field_J] * var8 % var9) {
                                stackOut_24_0 = this;
                                stackOut_24_1 = 1;
                                stackIn_25_0 = stackOut_24_0;
                                stackIn_25_1 = stackOut_24_1;
                                break L4;
                              } else {
                                stackOut_23_0 = this;
                                stackOut_23_1 = 0;
                                stackIn_25_0 = stackOut_23_0;
                                stackIn_25_1 = stackOut_23_1;
                                break L4;
                              }
                            }
                            L5: {
                              ((sk) this).field_y = stackIn_25_1 + var8 * vu.field_N[((sk) this).field_J] / var9;
                              stackOut_25_0 = this;
                              stackOut_25_1 = ((sk) this).field_y + -(vu.field_N[((sk) this).field_J] * (var8 + -var3.field_R) / var9);
                              stackIn_27_0 = stackOut_25_0;
                              stackIn_27_1 = stackOut_25_1;
                              stackIn_26_0 = stackOut_25_0;
                              stackIn_26_1 = stackOut_25_1;
                              if ((-var3.field_R + var8) * vu.field_N[((sk) this).field_J] % var9 > 0) {
                                stackOut_27_0 = this;
                                stackOut_27_1 = stackIn_27_1;
                                stackOut_27_2 = 1;
                                stackIn_28_0 = stackOut_27_0;
                                stackIn_28_1 = stackOut_27_1;
                                stackIn_28_2 = stackOut_27_2;
                                break L5;
                              } else {
                                stackOut_26_0 = this;
                                stackOut_26_1 = stackIn_26_1;
                                stackOut_26_2 = 0;
                                stackIn_28_0 = stackOut_26_0;
                                stackIn_28_1 = stackOut_26_1;
                                stackIn_28_2 = stackOut_26_2;
                                break L5;
                              }
                            }
                            L6: {
                              L7: {
                                ((sk) this).field_v = stackIn_28_1 + -stackIn_28_2;
                                if (var6_ref.field_P == 7) {
                                  break L7;
                                } else {
                                  if (var6_ref.field_P != 8) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              ((sk) this).field_v = 0;
                              break L6;
                            }
                            L8: {
                              ((sk) this).field_c = var6_ref.field_N;
                              if (((sk) this).field_v <= ((sk) this).field_y) {
                                break L8;
                              } else {
                                ((sk) this).field_v = ((sk) this).field_y;
                                break L8;
                              }
                            }
                            L9: {
                              L10: {
                                stackOut_34_0 = this;
                                stackIn_37_0 = stackOut_34_0;
                                stackIn_35_0 = stackOut_34_0;
                                if (var6_ref.g(0) == 3) {
                                  break L10;
                                } else {
                                  stackOut_35_0 = this;
                                  stackIn_38_0 = stackOut_35_0;
                                  stackIn_36_0 = stackOut_35_0;
                                  if (var7.field_N != 7) {
                                    stackOut_38_0 = this;
                                    stackOut_38_1 = 0;
                                    stackIn_39_0 = stackOut_38_0;
                                    stackIn_39_1 = stackOut_38_1;
                                    break L9;
                                  } else {
                                    stackOut_36_0 = this;
                                    stackIn_37_0 = stackOut_36_0;
                                    break L10;
                                  }
                                }
                              }
                              stackOut_37_0 = this;
                              stackOut_37_1 = 1;
                              stackIn_39_0 = stackOut_37_0;
                              stackIn_39_1 = stackOut_37_1;
                              break L9;
                            }
                            L11: {
                              ((sk) this).field_E = stackIn_39_1 != 0;
                              var8 = var7.field_Y - -var7.field_A;
                              var9 = var7.field_A + var7.field_t;
                              if (var7.field_N != 34) {
                                break L11;
                              } else {
                                if (!var7.field_W) {
                                  break L11;
                                } else {
                                  ((sk) this).field_q = true;
                                  break L11;
                                }
                              }
                            }
                            L12: {
                              ((sk) this).field_g = var7.field_O;
                              ((sk) this).field_u = bw.field_m[var7.field_N][9];
                              stackOut_43_0 = this;
                              stackIn_45_0 = stackOut_43_0;
                              stackIn_44_0 = stackOut_43_0;
                              if (vu.field_N[((sk) this).field_u] * var8 % var9 <= 0) {
                                stackOut_45_0 = this;
                                stackOut_45_1 = 0;
                                stackIn_46_0 = stackOut_45_0;
                                stackIn_46_1 = stackOut_45_1;
                                break L12;
                              } else {
                                stackOut_44_0 = this;
                                stackOut_44_1 = 1;
                                stackIn_46_0 = stackOut_44_0;
                                stackIn_46_1 = stackOut_44_1;
                                break L12;
                              }
                            }
                            L13: {
                              ((sk) this).field_w = stackIn_46_1 + var8 * vu.field_N[((sk) this).field_u] / var9;
                              stackOut_46_0 = this;
                              stackIn_48_0 = stackOut_46_0;
                              stackIn_47_0 = stackOut_46_0;
                              if (0 >= (var8 - var3.field_K) * vu.field_N[((sk) this).field_u] % var9) {
                                stackOut_48_0 = this;
                                stackOut_48_1 = 0;
                                stackIn_49_0 = stackOut_48_0;
                                stackIn_49_1 = stackOut_48_1;
                                break L13;
                              } else {
                                stackOut_47_0 = this;
                                stackOut_47_1 = 1;
                                stackIn_49_0 = stackOut_47_0;
                                stackIn_49_1 = stackOut_47_1;
                                break L13;
                              }
                            }
                            L14: {
                              L15: {
                                ((sk) this).field_O = -stackIn_49_1 - ((var8 - var3.field_K) * vu.field_N[((sk) this).field_u] / var9 - ((sk) this).field_w);
                                if (var7.field_P == 7) {
                                  break L15;
                                } else {
                                  if (var7.field_P != 8) {
                                    break L14;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                              ((sk) this).field_O = 0;
                              break L14;
                            }
                            L16: {
                              if (((sk) this).field_w >= ((sk) this).field_O) {
                                break L16;
                              } else {
                                ((sk) this).field_O = ((sk) this).field_w;
                                break L16;
                              }
                            }
                            L17: {
                              L18: {
                                ((sk) this).field_a = var7.field_N;
                                stackOut_55_0 = this;
                                stackIn_58_0 = stackOut_55_0;
                                stackIn_56_0 = stackOut_55_0;
                                if (var7.g(0) == 3) {
                                  break L18;
                                } else {
                                  stackOut_56_0 = this;
                                  stackIn_59_0 = stackOut_56_0;
                                  stackIn_57_0 = stackOut_56_0;
                                  if (7 != var7.field_N) {
                                    stackOut_59_0 = this;
                                    stackOut_59_1 = 0;
                                    stackIn_60_0 = stackOut_59_0;
                                    stackIn_60_1 = stackOut_59_1;
                                    break L17;
                                  } else {
                                    stackOut_57_0 = this;
                                    stackIn_58_0 = stackOut_57_0;
                                    break L18;
                                  }
                                }
                              }
                              stackOut_58_0 = this;
                              stackOut_58_1 = 1;
                              stackIn_60_0 = stackOut_58_0;
                              stackIn_60_1 = stackOut_58_1;
                              break L17;
                            }
                            L19: {
                              ((sk) this).field_P = stackIn_60_1 != 0;
                              if (((sk) this).field_d) {
                                L20: {
                                  if (((sk) this).field_c != 34) {
                                    if (var6_ref.g(param1 ^ 57) != 3) {
                                      L21: {
                                        if (((sk) this).field_c == 81) {
                                          break L21;
                                        } else {
                                          if (((sk) this).field_c == 4) {
                                            break L21;
                                          } else {
                                            if (((sk) this).field_c == 74) {
                                              break L21;
                                            } else {
                                              if (((sk) this).field_c != 67) {
                                                if (((sk) this).field_c != 18) {
                                                  if (((sk) this).field_c != 28) {
                                                    if (((sk) this).field_c == 3) {
                                                      ((sk) this).field_z = 6;
                                                      break L20;
                                                    } else {
                                                      break L20;
                                                    }
                                                  } else {
                                                    ((sk) this).field_z = 5;
                                                    break L20;
                                                  }
                                                } else {
                                                  ((sk) this).field_z = 0;
                                                  break L20;
                                                }
                                              } else {
                                                ((sk) this).field_z = 3;
                                                break L20;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      ((sk) this).field_z = 7;
                                      break L20;
                                    } else {
                                      ((sk) this).field_z = 8 - -bw.field_m[var6_ref.field_N][1];
                                      break L20;
                                    }
                                  } else {
                                    ((sk) this).field_z = 2;
                                    break L20;
                                  }
                                }
                                ((sk) this).field_p = ((sk) this).field_O - (-ns.a(false, ((sk) this).field_y, vv.field_b) - ((sk) this).field_y);
                                ((sk) this).field_D = new km[((sk) this).field_p];
                                ((sk) this).field_b = this.a(((sk) this).field_w, (byte) -128);
                                ((sk) this).field_n = 5;
                                if (var3.field_M) {
                                  ((sk) this).field_L = 7;
                                  break L19;
                                } else {
                                  ((sk) this).field_L = 8;
                                  break L19;
                                }
                              } else {
                                L22: {
                                  if (!var3.field_M) {
                                    if (!var3.field_N) {
                                      ((sk) this).field_L = 4;
                                      break L22;
                                    } else {
                                      ((sk) this).field_L = 3;
                                      break L22;
                                    }
                                  } else {
                                    ((sk) this).field_L = 2;
                                    break L22;
                                  }
                                }
                                ((sk) this).field_n = 0;
                                break L19;
                              }
                            }
                            L23: {
                              L24: {
                                fn.a(((sk) this).field_d, ((sk) this).field_c, param1 + -32653);
                                fn.a(((sk) this).field_d, ((sk) this).field_a, param1 ^ -32619);
                                if (((sk) this).field_c != 34) {
                                  break L24;
                                } else {
                                  if (!var3.field_J) {
                                    break L24;
                                  } else {
                                    ((sk) this).field_s = new lf[6];
                                    var8 = 0;
                                    L25: while (true) {
                                      if (~((sk) this).field_y >= ~var8) {
                                        break L23;
                                      } else {
                                        ((sk) this).field_s[1 + var8] = new lf(((sk) this).field_c, true, id.field_d[var8], kr.field_F[var8], false, 0);
                                        var8++;
                                        continue L25;
                                      }
                                    }
                                  }
                                }
                              }
                              ((sk) this).field_s = new lf[vu.field_N[((sk) this).field_J]];
                              break L23;
                            }
                            L26: {
                              if (!((sk) this).field_q) {
                                ((sk) this).field_i = new lf[vu.field_N[((sk) this).field_u]];
                                break L26;
                              } else {
                                ((sk) this).field_i = new lf[6];
                                var8 = 0;
                                L27: while (true) {
                                  if (~((sk) this).field_w >= ~var8) {
                                    break L26;
                                  } else {
                                    ((sk) this).field_i[1 + var8] = new lf(((sk) this).field_a, false, id.field_d[var8], kr.field_F[var8], false, 0);
                                    var8++;
                                    continue L27;
                                  }
                                }
                              }
                            }
                            L28: {
                              if (((sk) this).field_c != 34) {
                                break L28;
                              } else {
                                if (!var3.field_J) {
                                  break L28;
                                } else {
                                  ((sk) this).field_h = true;
                                  ((sk) this).field_y = 1;
                                  ((sk) this).field_c = 75;
                                  ((sk) this).field_J = 2;
                                  break L28;
                                }
                              }
                            }
                            L29: {
                              if (((sk) this).field_q) {
                                L30: {
                                  ((sk) this).field_a = 75;
                                  ((sk) this).field_w = 1;
                                  stackOut_118_0 = this;
                                  stackIn_120_0 = stackOut_118_0;
                                  stackIn_119_0 = stackOut_118_0;
                                  if (var7.field_A + var7.field_Y > var3.field_K) {
                                    stackOut_120_0 = this;
                                    stackOut_120_1 = 0;
                                    stackIn_121_0 = stackOut_120_0;
                                    stackIn_121_1 = stackOut_120_1;
                                    break L30;
                                  } else {
                                    stackOut_119_0 = this;
                                    stackOut_119_1 = 1;
                                    stackIn_121_0 = stackOut_119_0;
                                    stackIn_121_1 = stackOut_119_1;
                                    break L30;
                                  }
                                }
                                ((sk) this).field_O = stackIn_121_1;
                                ((sk) this).field_u = 2;
                                if (((sk) this).field_O == 1) {
                                  ((sk) this).field_L = 2;
                                  break L29;
                                } else {
                                  break L29;
                                }
                              } else {
                                break L29;
                              }
                            }
                            L31: {
                              if (!((sk) this).field_f) {
                                var8 = 0;
                                L32: while (true) {
                                  if (~((sk) this).field_y >= ~var8) {
                                    break L31;
                                  } else {
                                    L33: {
                                      stackOut_135_0 = ((sk) this).field_s;
                                      stackOut_135_1 = var8;
                                      stackOut_135_2 = null;
                                      stackOut_135_3 = null;
                                      stackOut_135_4 = ((sk) this).field_c;
                                      stackOut_135_5 = 1;
                                      stackOut_135_6 = tn.field_W[((sk) this).field_J][var8];
                                      stackOut_135_7 = kw.field_P[((sk) this).field_J][var8];
                                      stackOut_135_8 = ((sk) this).field_d;
                                      stackIn_138_0 = stackOut_135_0;
                                      stackIn_138_1 = stackOut_135_1;
                                      stackIn_138_2 = stackOut_135_2;
                                      stackIn_138_3 = stackOut_135_3;
                                      stackIn_138_4 = stackOut_135_4;
                                      stackIn_138_5 = stackOut_135_5;
                                      stackIn_138_6 = stackOut_135_6;
                                      stackIn_138_7 = stackOut_135_7;
                                      stackIn_138_8 = stackOut_135_8;
                                      stackIn_136_0 = stackOut_135_0;
                                      stackIn_136_1 = stackOut_135_1;
                                      stackIn_136_2 = stackOut_135_2;
                                      stackIn_136_3 = stackOut_135_3;
                                      stackIn_136_4 = stackOut_135_4;
                                      stackIn_136_5 = stackOut_135_5;
                                      stackIn_136_6 = stackOut_135_6;
                                      stackIn_136_7 = stackOut_135_7;
                                      stackIn_136_8 = stackOut_135_8;
                                      if (!((sk) this).field_d) {
                                        stackOut_138_0 = (lf[]) (Object) stackIn_138_0;
                                        stackOut_138_1 = stackIn_138_1;
                                        stackOut_138_2 = null;
                                        stackOut_138_3 = null;
                                        stackOut_138_4 = stackIn_138_4;
                                        stackOut_138_5 = stackIn_138_5;
                                        stackOut_138_6 = stackIn_138_6;
                                        stackOut_138_7 = stackIn_138_7;
                                        stackOut_138_8 = stackIn_138_8;
                                        stackOut_138_9 = 1300 - -ns.a(false, 700, vv.field_b);
                                        stackIn_139_0 = stackOut_138_0;
                                        stackIn_139_1 = stackOut_138_1;
                                        stackIn_139_2 = stackOut_138_2;
                                        stackIn_139_3 = stackOut_138_3;
                                        stackIn_139_4 = stackOut_138_4;
                                        stackIn_139_5 = stackOut_138_5;
                                        stackIn_139_6 = stackOut_138_6;
                                        stackIn_139_7 = stackOut_138_7;
                                        stackIn_139_8 = stackOut_138_8;
                                        stackIn_139_9 = stackOut_138_9;
                                        break L33;
                                      } else {
                                        stackOut_136_0 = (lf[]) (Object) stackIn_136_0;
                                        stackOut_136_1 = stackIn_136_1;
                                        stackOut_136_2 = null;
                                        stackOut_136_3 = null;
                                        stackOut_136_4 = stackIn_136_4;
                                        stackOut_136_5 = stackIn_136_5;
                                        stackOut_136_6 = stackIn_136_6;
                                        stackOut_136_7 = stackIn_136_7;
                                        stackOut_136_8 = stackIn_136_8;
                                        stackIn_137_0 = stackOut_136_0;
                                        stackIn_137_1 = stackOut_136_1;
                                        stackIn_137_2 = stackOut_136_2;
                                        stackIn_137_3 = stackOut_136_3;
                                        stackIn_137_4 = stackOut_136_4;
                                        stackIn_137_5 = stackOut_136_5;
                                        stackIn_137_6 = stackOut_136_6;
                                        stackIn_137_7 = stackOut_136_7;
                                        stackIn_137_8 = stackOut_136_8;
                                        stackOut_137_0 = (lf[]) (Object) stackIn_137_0;
                                        stackOut_137_1 = stackIn_137_1;
                                        stackOut_137_2 = null;
                                        stackOut_137_3 = null;
                                        stackOut_137_4 = stackIn_137_4;
                                        stackOut_137_5 = stackIn_137_5;
                                        stackOut_137_6 = stackIn_137_6;
                                        stackOut_137_7 = stackIn_137_7;
                                        stackOut_137_8 = stackIn_137_8;
                                        stackOut_137_9 = 0;
                                        stackIn_139_0 = stackOut_137_0;
                                        stackIn_139_1 = stackOut_137_1;
                                        stackIn_139_2 = stackOut_137_2;
                                        stackIn_139_3 = stackOut_137_3;
                                        stackIn_139_4 = stackOut_137_4;
                                        stackIn_139_5 = stackOut_137_5;
                                        stackIn_139_6 = stackOut_137_6;
                                        stackIn_139_7 = stackOut_137_7;
                                        stackIn_139_8 = stackOut_137_8;
                                        stackIn_139_9 = stackOut_137_9;
                                        break L33;
                                      }
                                    }
                                    stackIn_139_0[stackIn_139_1] = new lf(stackIn_139_4, stackIn_139_5 != 0, stackIn_139_6, stackIn_139_7, stackIn_139_8, stackIn_139_9);
                                    var8++;
                                    continue L32;
                                  }
                                }
                              } else {
                                var8 = 0;
                                L34: while (true) {
                                  if (((sk) this).field_y <= var8) {
                                    break L31;
                                  } else {
                                    L35: {
                                      stackOut_127_0 = ((sk) this).field_s;
                                      stackOut_127_1 = var8;
                                      stackOut_127_2 = null;
                                      stackOut_127_3 = null;
                                      stackOut_127_4 = ((sk) this).field_c;
                                      stackOut_127_5 = 1;
                                      stackOut_127_6 = tn.field_W[((sk) this).field_J][var8];
                                      stackOut_127_7 = kw.field_P[((sk) this).field_J][var8];
                                      stackOut_127_8 = ((sk) this).field_d;
                                      stackIn_130_0 = stackOut_127_0;
                                      stackIn_130_1 = stackOut_127_1;
                                      stackIn_130_2 = stackOut_127_2;
                                      stackIn_130_3 = stackOut_127_3;
                                      stackIn_130_4 = stackOut_127_4;
                                      stackIn_130_5 = stackOut_127_5;
                                      stackIn_130_6 = stackOut_127_6;
                                      stackIn_130_7 = stackOut_127_7;
                                      stackIn_130_8 = stackOut_127_8;
                                      stackIn_128_0 = stackOut_127_0;
                                      stackIn_128_1 = stackOut_127_1;
                                      stackIn_128_2 = stackOut_127_2;
                                      stackIn_128_3 = stackOut_127_3;
                                      stackIn_128_4 = stackOut_127_4;
                                      stackIn_128_5 = stackOut_127_5;
                                      stackIn_128_6 = stackOut_127_6;
                                      stackIn_128_7 = stackOut_127_7;
                                      stackIn_128_8 = stackOut_127_8;
                                      if (((sk) this).field_d) {
                                        stackOut_130_0 = (lf[]) (Object) stackIn_130_0;
                                        stackOut_130_1 = stackIn_130_1;
                                        stackOut_130_2 = null;
                                        stackOut_130_3 = null;
                                        stackOut_130_4 = stackIn_130_4;
                                        stackOut_130_5 = stackIn_130_5;
                                        stackOut_130_6 = stackIn_130_6;
                                        stackOut_130_7 = stackIn_130_7;
                                        stackOut_130_8 = stackIn_130_8;
                                        stackOut_130_9 = 0;
                                        stackIn_131_0 = stackOut_130_0;
                                        stackIn_131_1 = stackOut_130_1;
                                        stackIn_131_2 = stackOut_130_2;
                                        stackIn_131_3 = stackOut_130_3;
                                        stackIn_131_4 = stackOut_130_4;
                                        stackIn_131_5 = stackOut_130_5;
                                        stackIn_131_6 = stackOut_130_6;
                                        stackIn_131_7 = stackOut_130_7;
                                        stackIn_131_8 = stackOut_130_8;
                                        stackIn_131_9 = stackOut_130_9;
                                        break L35;
                                      } else {
                                        stackOut_128_0 = (lf[]) (Object) stackIn_128_0;
                                        stackOut_128_1 = stackIn_128_1;
                                        stackOut_128_2 = null;
                                        stackOut_128_3 = null;
                                        stackOut_128_4 = stackIn_128_4;
                                        stackOut_128_5 = stackIn_128_5;
                                        stackOut_128_6 = stackIn_128_6;
                                        stackOut_128_7 = stackIn_128_7;
                                        stackOut_128_8 = stackIn_128_8;
                                        stackIn_129_0 = stackOut_128_0;
                                        stackIn_129_1 = stackOut_128_1;
                                        stackIn_129_2 = stackOut_128_2;
                                        stackIn_129_3 = stackOut_128_3;
                                        stackIn_129_4 = stackOut_128_4;
                                        stackIn_129_5 = stackOut_128_5;
                                        stackIn_129_6 = stackOut_128_6;
                                        stackIn_129_7 = stackOut_128_7;
                                        stackIn_129_8 = stackOut_128_8;
                                        stackOut_129_0 = (lf[]) (Object) stackIn_129_0;
                                        stackOut_129_1 = stackIn_129_1;
                                        stackOut_129_2 = null;
                                        stackOut_129_3 = null;
                                        stackOut_129_4 = stackIn_129_4;
                                        stackOut_129_5 = stackIn_129_5;
                                        stackOut_129_6 = stackIn_129_6;
                                        stackOut_129_7 = stackIn_129_7;
                                        stackOut_129_8 = stackIn_129_8;
                                        stackOut_129_9 = 1300 + ns.a(false, 700, vv.field_b);
                                        stackIn_131_0 = stackOut_129_0;
                                        stackIn_131_1 = stackOut_129_1;
                                        stackIn_131_2 = stackOut_129_2;
                                        stackIn_131_3 = stackOut_129_3;
                                        stackIn_131_4 = stackOut_129_4;
                                        stackIn_131_5 = stackOut_129_5;
                                        stackIn_131_6 = stackOut_129_6;
                                        stackIn_131_7 = stackOut_129_7;
                                        stackIn_131_8 = stackOut_129_8;
                                        stackIn_131_9 = stackOut_129_9;
                                        break L35;
                                      }
                                    }
                                    stackIn_131_0[stackIn_131_1] = new lf(stackIn_131_4, stackIn_131_5 != 0, stackIn_131_6, stackIn_131_7, stackIn_131_8, stackIn_131_9);
                                    var8++;
                                    continue L34;
                                  }
                                }
                              }
                            }
                            L36: {
                              if (((sk) this).field_o) {
                                var8 = 0;
                                L37: while (true) {
                                  if (~var8 <= ~((sk) this).field_w) {
                                    break L36;
                                  } else {
                                    ((sk) this).field_i[var8] = new lf(((sk) this).field_a, false, tn.field_W[((sk) this).field_u][var8], kw.field_P[((sk) this).field_u][var8], ((sk) this).field_d, 0);
                                    var8++;
                                    continue L37;
                                  }
                                }
                              } else {
                                var8 = 0;
                                L38: while (true) {
                                  if (~var8 <= ~((sk) this).field_w) {
                                    break L36;
                                  } else {
                                    ((sk) this).field_i[var8] = new lf(((sk) this).field_a, false, tn.field_W[((sk) this).field_u][var8], kw.field_P[((sk) this).field_u][var8], ((sk) this).field_d, 0);
                                    var8++;
                                    continue L38;
                                  }
                                }
                              }
                            }
                            L39: {
                              stackOut_148_0 = this;
                              stackIn_150_0 = stackOut_148_0;
                              stackIn_149_0 = stackOut_148_0;
                              if (~((sk) this).field_J < ~((sk) this).field_u) {
                                stackOut_150_0 = this;
                                stackOut_150_1 = ((sk) this).field_J;
                                stackIn_151_0 = stackOut_150_0;
                                stackIn_151_1 = stackOut_150_1;
                                break L39;
                              } else {
                                stackOut_149_0 = this;
                                stackOut_149_1 = ((sk) this).field_u;
                                stackIn_151_0 = stackOut_149_0;
                                stackIn_151_1 = stackOut_149_1;
                                break L39;
                              }
                            }
                            L40: {
                              ((sk) this).field_C = stackIn_151_1;
                              if (0 != ((sk) this).field_v) {
                                break L40;
                              } else {
                                if (0 != ((sk) this).field_O) {
                                  break L40;
                                } else {
                                  if (!((sk) this).field_d) {
                                    ((sk) this).field_m = true;
                                    break L40;
                                  } else {
                                    break L40;
                                  }
                                }
                              }
                            }
                            L41: {
                              if (!((sk) this).field_d) {
                                break L41;
                              } else {
                                if (((sk) this).field_f) {
                                  ((sk) this).field_n = 6;
                                  this.h(param1 ^ 56);
                                  break L41;
                                } else {
                                  break L41;
                                }
                              }
                            }
                            L42: {
                              L43: {
                                if (!((sk) this).field_d) {
                                  break L43;
                                } else {
                                  if (((sk) this).field_L == 8) {
                                    ((sk) this).field_t = var3.field_F + var3.field_Q + ((sk) this).field_x.field_v * (var3.field_B + var3.field_G);
                                    break L42;
                                  } else {
                                    break L43;
                                  }
                                }
                              }
                              ((sk) this).field_t = ((sk) this).field_x.field_v * var3.field_G + var3.field_Q;
                              break L42;
                            }
                            u.field_p.b(var3.field_G * ((sk) this).field_x.field_v + var3.field_Q, param1 ^ 65);
                            break L0;
                          }
                        }
                      }
                      L44: {
                        L45: {
                          if (null == var6_ref) {
                            break L45;
                          } else {
                            if (var7 != null) {
                              break L44;
                            } else {
                              break L45;
                            }
                          }
                        }
                        var8_ref_String = db.field_d + ": Can see attacker or defender";
                        ((sk) this).field_x.a(0, var8_ref_String, (oj) (Object) var3);
                        break L44;
                      }
                      ((sk) this).field_n = 8;
                      return false;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            var6 = db.field_d + ": Attacker or defender off map";
            ((sk) this).field_x.a(0, var6, (oj) (Object) var3);
            ((sk) this).field_n = 8;
            return false;
          } else {
            break L0;
          }
        }
        L46: {
          if (param1 == 57) {
            break L46;
          } else {
            boolean discarded$1 = ((sk) this).a((oj) null, (byte) -19);
            break L46;
          }
        }
        ((sk) this).b(param0, (byte) 32);
        return true;
    }

    public final void a(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((sk) this).field_n == 8) {
                break L1;
              } else {
                ((sk) this).field_F = 0;
                break L1;
              }
            }
            L2: {
              ((sk) this).field_n = 8;
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
          throw ig.a((Throwable) (Object) var2, "sk.D(" + param0 + ')');
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
              ((sk) this).field_F = ((sk) this).field_F + 1;
              if (((sk) this).field_n != 0) {
                if (8 != ((sk) this).field_n) {
                  if (((sk) this).field_n != 1) {
                    L3: {
                      if (((sk) this).field_n == 2) {
                        break L3;
                      } else {
                        if (((sk) this).field_n == 3) {
                          break L3;
                        } else {
                          if (((sk) this).field_n == 4) {
                            break L3;
                          } else {
                            if (((sk) this).field_n == 5) {
                              this.c(false);
                              break L2;
                            } else {
                              if (6 != ((sk) this).field_n) {
                                if (7 != ((sk) this).field_n) {
                                  break L2;
                                } else {
                                  this.d(29823);
                                  break L2;
                                }
                              } else {
                                int discarded$5 = 1;
                                if (this.a()) {
                                  return;
                                } else {
                                  break L2;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    int discarded$6 = -8089;
                    this.j();
                    break L2;
                  } else {
                    int discarded$7 = -9;
                    if (this.g()) {
                      return;
                    } else {
                      break L2;
                    }
                  }
                } else {
                  int discarded$8 = 126;
                  this.d();
                  break L2;
                }
              } else {
                int discarded$9 = -124;
                this.o();
                break L2;
              }
            }
            var3_int = -77 % ((param1 - -26) / 48);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_53_0 = (RuntimeException) var3;
            stackOut_53_1 = new StringBuilder().append("sk.Q(");
            stackIn_56_0 = stackOut_53_0;
            stackIn_56_1 = stackOut_53_1;
            stackIn_54_0 = stackOut_53_0;
            stackIn_54_1 = stackOut_53_1;
            if (param0 == null) {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "null";
              stackIn_57_0 = stackOut_56_0;
              stackIn_57_1 = stackOut_56_1;
              stackIn_57_2 = stackOut_56_2;
              break L4;
            } else {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "{...}";
              stackIn_57_0 = stackOut_54_0;
              stackIn_57_1 = stackOut_54_1;
              stackIn_57_2 = stackOut_54_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_57_0, stackIn_57_2 + ',' + param1 + ')');
        }
    }

    private final void h(int param0) {
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
                boolean discarded$2 = ((sk) this).b(-67);
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              if (var2_int >= ((sk) this).field_D.length) {
                break L0;
              } else {
                L3: {
                  if (var2_int >= ((sk) this).field_O) {
                    ((sk) this).field_D[var2_int] = new km(100 + ns.a(false, 600, vv.field_b), 600, ns.a(false, 850, vv.field_b) + 900, ns.a(false, 600, vv.field_b) + 200, ((sk) this).field_z);
                    break L3;
                  } else {
                    ((sk) this).field_D[var2_int] = new km(((sk) this).field_i[((sk) this).field_b[var2_int]].field_a, 600 + -pk.field_T[((sk) this).field_a][0], ((sk) this).field_i[((sk) this).field_b[var2_int]].field_s, 200 + ns.a(false, 600, vv.field_b), ((sk) this).field_z);
                    break L3;
                  }
                }
                var2_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "sk.JA(" + param0 + ')');
        }
    }

    public final void a(byte param0) {
        try {
            if (param0 != -52) {
                ((sk) this).a(61, (jd) null, 33, true, (jd) null);
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "sk.O(" + param0 + ')');
        }
    }

    private final void j() {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((sk) this).field_n != 2) {
                break L1;
              } else {
                int discarded$7 = -4925;
                this.a(((sk) this).field_s);
                break L1;
              }
            }
            L2: {
              L3: {
                if (((sk) this).field_n == 3) {
                  break L3;
                } else {
                  if (4 == ((sk) this).field_n) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              int discarded$8 = -4925;
              this.a(((sk) this).field_i);
              break L2;
            }
            L4: {
              int discarded$9 = 12579;
              this.b(((sk) this).field_s);
              int discarded$10 = 12579;
              this.b(((sk) this).field_i);
              if (((sk) this).field_F <= 240) {
                break L4;
              } else {
                ((sk) this).field_F = 0;
                ((sk) this).field_n = 8;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "sk.BA(" + -8089 + ')');
        }
    }

    private final boolean g() {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_61_0 = 0;
        int stackIn_89_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_60_0 = 0;
        int stackOut_88_0 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            int discarded$4 = 1;
            this.b();
            var2_int = 1;
            var3 = 0;
            L1: while (true) {
              if (var3 >= ((sk) this).field_s.length) {
                var3 = 0;
                L2: while (true) {
                  if (~((sk) this).field_i.length >= ~var3) {
                    L3: {
                      if (var2_int == 0) {
                        break L3;
                      } else {
                        if (((sk) this).field_v != 0) {
                          break L3;
                        } else {
                          if (((sk) this).field_O != 0) {
                            break L3;
                          } else {
                            L4: {
                              if (!((sk) this).field_m) {
                                break L4;
                              } else {
                                if (500 >= ((sk) this).field_F) {
                                  break L3;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            ((sk) this).field_F = 0;
                            ((sk) this).field_n = ((sk) this).field_L;
                            stackOut_60_0 = 1;
                            stackIn_61_0 = stackOut_60_0;
                            return stackIn_61_0 != 0;
                          }
                        }
                      }
                    }
                    L5: {
                      if (!((sk) this).field_q) {
                        L6: {
                          if (((sk) this).field_F % 50 == 0) {
                            int discarded$5 = 49;
                            this.l();
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        int discarded$6 = 13047;
                        this.k();
                        break L5;
                      } else {
                        this.m(-13146);
                        int discarded$7 = 105;
                        this.e();
                        if (0 != ((sk) this).field_v) {
                          break L5;
                        } else {
                          if (((sk) this).field_O <= 0) {
                            break L5;
                          } else {
                            if (var2_int == 0) {
                              break L5;
                            } else {
                              if (((sk) this).field_F > 400) {
                                ((sk) this).field_O = ((sk) this).field_O - 1;
                                ((sk) this).field_i[0].field_d = true;
                                ((sk) this).field_i[0].a(2, (byte) -101);
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_88_0 = 0;
                    stackIn_89_0 = stackOut_88_0;
                    break L0;
                  } else {
                    L7: {
                      if (null == ((sk) this).field_i[var3]) {
                        break L7;
                      } else {
                        L8: {
                          ((sk) this).field_i[var3].d((byte) 113);
                          if (!((sk) this).field_P) {
                            break L8;
                          } else {
                            if (((sk) this).field_i[var3].field_e) {
                              ((sk) this).field_i[var3].a(0, 30, 0, 10, u.field_o[((sk) this).field_a][1], pk.field_T[((sk) this).field_a][1], (byte) 122);
                              ((sk) this).field_i[var3].field_e = false;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                        }
                        if (!((sk) this).field_i[var3].field_d) {
                          break L7;
                        } else {
                          if (((sk) this).field_i[var3].field_H) {
                            ((sk) this).field_i[var3] = null;
                            break L7;
                          } else {
                            var2_int = 0;
                            break L7;
                          }
                        }
                      }
                    }
                    var3++;
                    continue L2;
                  }
                }
              } else {
                L9: {
                  if (((sk) this).field_s[var3] != null) {
                    L10: {
                      ((sk) this).field_s[var3].d((byte) 113);
                      if (!((sk) this).field_E) {
                        break L10;
                      } else {
                        if (!((sk) this).field_s[var3].field_e) {
                          break L10;
                        } else {
                          ((sk) this).field_s[var3].a(0, 30, 0, -10, u.field_o[((sk) this).field_c][1], pk.field_T[((sk) this).field_c][1], (byte) 122);
                          ((sk) this).field_s[var3].field_e = false;
                          break L10;
                        }
                      }
                    }
                    if (!((sk) this).field_s[var3].field_d) {
                      break L9;
                    } else {
                      if (((sk) this).field_s[var3].field_H) {
                        ((sk) this).field_s[var3] = null;
                        break L9;
                      } else {
                        var2_int = 0;
                        break L9;
                      }
                    }
                  } else {
                    break L9;
                  }
                }
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "sk.DA(" + -9 + ')');
        }
        return stackIn_89_0 != 0;
    }

    private final void f(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (((sk) this).field_p == 0) {
              return;
            } else {
              var2_int = 0;
              var3 = new int[((sk) this).field_y];
              var4 = 0;
              L1: while (true) {
                if (var4 >= ((sk) this).field_y) {
                  if (1 > var2_int) {
                    return;
                  } else {
                    ((sk) this).field_p = ((sk) this).field_p - 1;
                    var4 = var3[ns.a(false, var2_int, vv.field_b)];
                    ((sk) this).field_s[var4].c((byte) 102);
                    break L0;
                  }
                } else {
                  L2: {
                    if (((sk) this).field_s[var4] == null) {
                      break L2;
                    } else {
                      if (((sk) this).field_s[var4].b((byte) 115)) {
                        var3[var2_int] = var4;
                        var2_int++;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var4++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "sk.P(" + -24577 + ')');
        }
    }

    private final void d(boolean param0) {
        RuntimeException var2 = null;
        int[] var2_array = null;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        Object stackIn_110_0 = null;
        lf stackIn_110_1 = null;
        int stackIn_125_0 = 0;
        int stackIn_125_1 = 0;
        lf stackIn_155_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_57_0 = 0;
        int stackOut_57_1 = 0;
        lf stackOut_153_0 = null;
        int stackOut_123_0 = 0;
        int stackOut_123_1 = 0;
        Object stackOut_108_0 = null;
        lf stackOut_108_1 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var2_array = new int[((sk) this).field_s.length];
            var3 = new int[((sk) this).field_i.length];
            var4 = 0;
            var5 = 0;
            L1: while (true) {
              if (((sk) this).field_s.length <= var5) {
                ((sk) this).field_y = var4;
                var4 = 0;
                var5 = 0;
                L2: while (true) {
                  if (((sk) this).field_i.length <= var5) {
                    ((sk) this).field_w = var4;
                    var5 = 0;
                    L3: while (true) {
                      if (((sk) this).field_y <= var5) {
                        var5 = 0;
                        if (1 == 1) {
                          L4: while (true) {
                            if (~((sk) this).field_w >= ~var5) {
                              L5: {
                                if (!cu.field_a) {
                                  break L5;
                                } else {
                                  L6: {
                                    if (((sk) this).field_f) {
                                      var5 = 0;
                                      L7: while (true) {
                                        if (~var5 <= ~((sk) this).field_w) {
                                          break L6;
                                        } else {
                                          L8: {
                                            if (((sk) this).field_i[var3[var5]] != null) {
                                              ((sk) this).field_i[var3[var5]].a(((sk) this).field_C, -46, true);
                                              break L8;
                                            } else {
                                              break L8;
                                            }
                                          }
                                          var5++;
                                          continue L7;
                                        }
                                      }
                                    } else {
                                      if (((sk) this).field_o) {
                                        var5 = 0;
                                        L9: while (true) {
                                          if (~((sk) this).field_y >= ~var5) {
                                            break L6;
                                          } else {
                                            L10: {
                                              if (((sk) this).field_s[var2_array[var5]] == null) {
                                                break L10;
                                              } else {
                                                ((sk) this).field_s[var2_array[var5]].a(((sk) this).field_C, -86, true);
                                                break L10;
                                              }
                                            }
                                            var5++;
                                            continue L9;
                                          }
                                        }
                                      } else {
                                        var5 = 0;
                                        var6 = 0;
                                        L11: while (true) {
                                          L12: {
                                            if (~((sk) this).field_y < ~var5) {
                                              break L12;
                                            } else {
                                              if (var6 >= ((sk) this).field_w) {
                                                break L6;
                                              } else {
                                                break L12;
                                              }
                                            }
                                          }
                                          stackOut_57_0 = ~var6;
                                          stackOut_57_1 = ~((sk) this).field_w;
                                          stackIn_59_0 = stackOut_57_0;
                                          stackIn_59_1 = stackOut_57_1;
                                          L13: {
                                            if (stackIn_59_0 <= stackIn_59_1) {
                                              break L13;
                                            } else {
                                              if (((sk) this).field_i[var3[var6]] == null) {
                                                var6++;
                                                break L13;
                                              } else {
                                                break L13;
                                              }
                                            }
                                          }
                                          L14: {
                                            if (var5 >= ((sk) this).field_y) {
                                              break L14;
                                            } else {
                                              if (null == ((sk) this).field_s[var2_array[var5]]) {
                                                var5++;
                                                break L14;
                                              } else {
                                                break L14;
                                              }
                                            }
                                          }
                                          if (((sk) this).field_w > var6) {
                                            if (~((sk) this).field_y >= ~var5) {
                                              int incrementValue$10 = var6;
                                              var6++;
                                              ((sk) this).field_i[var3[incrementValue$10]].a(((sk) this).field_C, -64, true);
                                              continue L11;
                                            } else {
                                              if (~((sk) this).field_s[var2_array[var5]].field_s < ~((sk) this).field_i[var3[var6]].field_s) {
                                                int incrementValue$11 = var5;
                                                var5++;
                                                ((sk) this).field_s[var2_array[incrementValue$11]].a(((sk) this).field_C, -106, true);
                                                continue L11;
                                              } else {
                                                int incrementValue$12 = var6;
                                                var6++;
                                                ((sk) this).field_i[var3[incrementValue$12]].a(((sk) this).field_C, -38, true);
                                                continue L11;
                                              }
                                            }
                                          } else {
                                            int incrementValue$13 = var5;
                                            var5++;
                                            ((sk) this).field_s[var2_array[incrementValue$13]].a(((sk) this).field_C, -91, true);
                                            continue L11;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  this.a((byte) 114, 0, 0, 128);
                                  break L5;
                                }
                              }
                              L15: {
                                if (!((sk) this).field_f) {
                                  if (((sk) this).field_o) {
                                    var5 = 0;
                                    L16: while (true) {
                                      if (~var5 <= ~((sk) this).field_y) {
                                        break L15;
                                      } else {
                                        stackOut_153_0 = ((sk) this).field_s[var2_array[var5]];
                                        stackIn_155_0 = stackOut_153_0;
                                        L17: {
                                          if (stackIn_155_0 != null) {
                                            ((sk) this).field_s[var2_array[var5]].a(((sk) this).field_C, -65, false);
                                            break L17;
                                          } else {
                                            break L17;
                                          }
                                        }
                                        var5++;
                                        continue L16;
                                      }
                                    }
                                  } else {
                                    var5 = 0;
                                    var6 = 0;
                                    L18: while (true) {
                                      L19: {
                                        if (~var5 > ~((sk) this).field_y) {
                                          break L19;
                                        } else {
                                          if (var6 >= ((sk) this).field_w) {
                                            break L15;
                                          } else {
                                            break L19;
                                          }
                                        }
                                      }
                                      stackOut_123_0 = ~var5;
                                      stackOut_123_1 = ~((sk) this).field_y;
                                      stackIn_125_0 = stackOut_123_0;
                                      stackIn_125_1 = stackOut_123_1;
                                      L20: {
                                        if (stackIn_125_0 <= stackIn_125_1) {
                                          break L20;
                                        } else {
                                          if (((sk) this).field_s[var2_array[var5]] != null) {
                                            break L20;
                                          } else {
                                            var5++;
                                            break L20;
                                          }
                                        }
                                      }
                                      L21: {
                                        if (((sk) this).field_w <= var6) {
                                          break L21;
                                        } else {
                                          if (((sk) this).field_i[var3[var6]] != null) {
                                            break L21;
                                          } else {
                                            var6++;
                                            break L21;
                                          }
                                        }
                                      }
                                      if (((sk) this).field_w <= var6) {
                                        int incrementValue$14 = var5;
                                        var5++;
                                        ((sk) this).field_s[var2_array[incrementValue$14]].a(((sk) this).field_C, -52, false);
                                        continue L18;
                                      } else {
                                        if (var5 < ((sk) this).field_y) {
                                          if (((sk) this).field_s[var2_array[var5]].field_s > ((sk) this).field_i[var3[var6]].field_s) {
                                            int incrementValue$15 = var5;
                                            var5++;
                                            ((sk) this).field_s[var2_array[incrementValue$15]].a(((sk) this).field_C, -65, false);
                                            continue L18;
                                          } else {
                                            int incrementValue$16 = var6;
                                            var6++;
                                            ((sk) this).field_i[var3[incrementValue$16]].a(((sk) this).field_C, -120, false);
                                            continue L18;
                                          }
                                        } else {
                                          int incrementValue$17 = var6;
                                          var6++;
                                          ((sk) this).field_i[var3[incrementValue$17]].a(((sk) this).field_C, -74, false);
                                          continue L18;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var5 = 0;
                                  L22: while (true) {
                                    if (~((sk) this).field_w >= ~var5) {
                                      break L15;
                                    } else {
                                      stackOut_108_0 = null;
                                      stackOut_108_1 = ((sk) this).field_i[var3[var5]];
                                      stackIn_110_0 = stackOut_108_0;
                                      stackIn_110_1 = stackOut_108_1;
                                      L23: {
                                        if (stackIn_110_0 != (Object) (Object) stackIn_110_1) {
                                          ((sk) this).field_i[var3[var5]].a(((sk) this).field_C, -92, false);
                                          break L23;
                                        } else {
                                          break L23;
                                        }
                                      }
                                      var5++;
                                      continue L22;
                                    }
                                  }
                                }
                              }
                              break L0;
                            } else {
                              var4 = var5;
                              var6 = var5 - -1;
                              L24: while (true) {
                                if (~((sk) this).field_w >= ~var6) {
                                  L25: {
                                    if (var5 != var4) {
                                      var6 = var3[var4];
                                      var3[var4] = var3[var5];
                                      var3[var5] = var6;
                                      break L25;
                                    } else {
                                      break L25;
                                    }
                                  }
                                  var5++;
                                  continue L4;
                                } else {
                                  L26: {
                                    if (~((sk) this).field_i[var3[var4]].field_s > ~((sk) this).field_i[var3[var6]].field_s) {
                                      var4 = var6;
                                      break L26;
                                    } else {
                                      break L26;
                                    }
                                  }
                                  var6++;
                                  continue L24;
                                }
                              }
                            }
                          }
                        } else {
                          return;
                        }
                      } else {
                        var4 = var5;
                        var6 = 1 + var5;
                        L27: while (true) {
                          if (~var6 <= ~((sk) this).field_y) {
                            L28: {
                              if (var4 == var5) {
                                break L28;
                              } else {
                                var6 = var2_array[var4];
                                var2_array[var4] = var2_array[var5];
                                var2_array[var5] = var6;
                                break L28;
                              }
                            }
                            var5++;
                            continue L3;
                          } else {
                            L29: {
                              if (((sk) this).field_s[var2_array[var6]].field_s > ((sk) this).field_s[var2_array[var4]].field_s) {
                                var4 = var6;
                                break L29;
                              } else {
                                break L29;
                              }
                            }
                            var6++;
                            continue L27;
                          }
                        }
                      }
                    }
                  } else {
                    L30: {
                      if (((sk) this).field_i[var5] == null) {
                        break L30;
                      } else {
                        int incrementValue$18 = var4;
                        var4++;
                        var3[incrementValue$18] = var5;
                        break L30;
                      }
                    }
                    var5++;
                    continue L2;
                  }
                }
              } else {
                L31: {
                  if (null != ((sk) this).field_s[var5]) {
                    int incrementValue$19 = var4;
                    var4++;
                    var2_array[incrementValue$19] = var5;
                    break L31;
                  } else {
                    break L31;
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "sk.S(" + true + ')');
        }
    }

    private final boolean a() {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_21_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_38_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_35_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_19_0 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var2_int = 1;
            var3 = 0;
            L1: while (true) {
              if (~var3 <= ~((sk) this).field_i.length) {
                var3 = 0;
                L2: while (true) {
                  if (((sk) this).field_D.length <= var3) {
                    if (var2_int != 0) {
                      ((sk) this).field_F = 0;
                      ((sk) this).field_n = ((sk) this).field_L;
                      stackOut_35_0 = 1;
                      stackIn_36_0 = stackOut_35_0;
                      return stackIn_36_0 != 0;
                    } else {
                      stackOut_37_0 = 0;
                      stackIn_38_0 = stackOut_37_0;
                      break L0;
                    }
                  } else {
                    stackOut_19_0 = ~((sk) this).field_D[var3].field_f;
                    stackIn_21_0 = stackOut_19_0;
                    L3: {
                      if (stackIn_21_0 >= 0) {
                        break L3;
                      } else {
                        var2_int = 0;
                        break L3;
                      }
                    }
                    L4: {
                      if (!((sk) this).field_D[var3].b(-103)) {
                        break L4;
                      } else {
                        if (~((sk) this).field_O < ~var3) {
                          ((sk) this).field_i[((sk) this).field_b[var3]].field_d = true;
                          ((sk) this).field_i[((sk) this).field_b[var3]].a(2, (byte) -103);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var3++;
                    continue L2;
                  }
                }
              } else {
                L5: {
                  if (null != ((sk) this).field_i[var3]) {
                    ((sk) this).field_i[var3].d((byte) 113);
                    if (!((sk) this).field_i[var3].field_d) {
                      break L5;
                    } else {
                      if (!((sk) this).field_i[var3].field_H) {
                        var2_int = 0;
                        break L5;
                      } else {
                        ((sk) this).field_i[var3] = null;
                        break L5;
                      }
                    }
                  } else {
                    break L5;
                  }
                }
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "sk.L(" + true + ')');
        }
        return stackIn_38_0 != 0;
    }

    private final void f() {
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
        Object stackIn_20_0 = null;
        Object stackIn_20_1 = null;
        Object stackIn_31_0 = null;
        Object stackIn_31_1 = null;
        int stackIn_93_0 = 0;
        int stackIn_93_1 = 0;
        int stackIn_117_0 = 0;
        int stackIn_121_0 = 0;
        int stackIn_125_0 = 0;
        int stackIn_160_0 = 0;
        int stackIn_160_1 = 0;
        int stackIn_183_0 = 0;
        int stackIn_187_0 = 0;
        int stackIn_191_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_91_0 = 0;
        int stackOut_91_1 = 0;
        int stackOut_116_0 = 0;
        int stackOut_114_0 = 0;
        int stackOut_120_0 = 0;
        int stackOut_118_0 = 0;
        int stackOut_124_0 = 0;
        int stackOut_122_0 = 0;
        int stackOut_158_0 = 0;
        int stackOut_158_1 = 0;
        int stackOut_182_0 = 0;
        int stackOut_180_0 = 0;
        int stackOut_186_0 = 0;
        int stackOut_184_0 = 0;
        int stackOut_190_0 = 0;
        int stackOut_188_0 = 0;
        Object stackOut_29_0 = null;
        Object stackOut_29_1 = null;
        Object stackOut_18_0 = null;
        Object stackOut_18_1 = null;
        var12 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((sk) this).field_D == null) {
                break L1;
              } else {
                if (0 != ((sk) this).field_D.length) {
                  var2_array = new int[((sk) this).field_s.length];
                  var3 = new int[((sk) this).field_i.length];
                  var4 = new int[((sk) this).field_D.length];
                  var5 = 0;
                  var6 = 0;
                  L2: while (true) {
                    if (((sk) this).field_s.length <= var6) {
                      var5 = 0;
                      var6 = 0;
                      L3: while (true) {
                        if (((sk) this).field_i.length <= var6) {
                          var5 = 0;
                          var6 = 0;
                          L4: while (true) {
                            if (var6 >= ((sk) this).field_D.length) {
                              var6 = 0;
                              L5: while (true) {
                                if (((sk) this).field_y <= var6) {
                                  var6 = 0;
                                  L6: while (true) {
                                    if (~((sk) this).field_w >= ~var6) {
                                      var6 = 0;
                                      L7: while (true) {
                                        if (((sk) this).field_p <= var6) {
                                          L8: {
                                            var6 = 0;
                                            var7 = 0;
                                            var8 = 0;
                                            if (!cu.field_a) {
                                              break L8;
                                            } else {
                                              L9: {
                                                if (((sk) this).field_o) {
                                                  var7 = ((sk) this).field_w;
                                                  break L9;
                                                } else {
                                                  break L9;
                                                }
                                              }
                                              L10: {
                                                if (((sk) this).field_f) {
                                                  var6 = ((sk) this).field_y;
                                                  break L10;
                                                } else {
                                                  break L10;
                                                }
                                              }
                                              L11: while (true) {
                                                L12: {
                                                  if (~((sk) this).field_y < ~var6) {
                                                    break L12;
                                                  } else {
                                                    if (~((sk) this).field_w < ~var7) {
                                                      break L12;
                                                    } else {
                                                      if (~var8 <= ~((sk) this).field_p) {
                                                        this.a((byte) 94, 0, 0, 128);
                                                        var6 = 0;
                                                        var8 = 0;
                                                        var7 = 0;
                                                        break L8;
                                                      } else {
                                                        break L12;
                                                      }
                                                    }
                                                  }
                                                }
                                                stackOut_91_0 = ~var8;
                                                stackOut_91_1 = ~((sk) this).field_p;
                                                stackIn_93_0 = stackOut_91_0;
                                                stackIn_93_1 = stackOut_91_1;
                                                L13: {
                                                  if (stackIn_93_0 <= stackIn_93_1) {
                                                    break L13;
                                                  } else {
                                                    if (null == ((sk) this).field_D[var4[var8]]) {
                                                      var8++;
                                                      break L13;
                                                    } else {
                                                      break L13;
                                                    }
                                                  }
                                                }
                                                L14: {
                                                  if (var6 >= ((sk) this).field_y) {
                                                    break L14;
                                                  } else {
                                                    if (null != ((sk) this).field_s[var2_array[var6]]) {
                                                      break L14;
                                                    } else {
                                                      var6++;
                                                      break L14;
                                                    }
                                                  }
                                                }
                                                L15: {
                                                  if (var7 >= ((sk) this).field_w) {
                                                    break L15;
                                                  } else {
                                                    if (((sk) this).field_i[var3[var7]] == null) {
                                                      var7++;
                                                      break L15;
                                                    } else {
                                                      break L15;
                                                    }
                                                  }
                                                }
                                                L16: {
                                                  if (var8 < ((sk) this).field_p) {
                                                    stackOut_116_0 = ((sk) this).field_D[var4[var8]].field_d;
                                                    stackIn_117_0 = stackOut_116_0;
                                                    break L16;
                                                  } else {
                                                    stackOut_114_0 = 100000;
                                                    stackIn_117_0 = stackOut_114_0;
                                                    break L16;
                                                  }
                                                }
                                                L17: {
                                                  var9 = stackIn_117_0;
                                                  if (((sk) this).field_y > var6) {
                                                    stackOut_120_0 = ((sk) this).field_s[var2_array[var6]].field_s;
                                                    stackIn_121_0 = stackOut_120_0;
                                                    break L17;
                                                  } else {
                                                    stackOut_118_0 = 100000;
                                                    stackIn_121_0 = stackOut_118_0;
                                                    break L17;
                                                  }
                                                }
                                                L18: {
                                                  var10 = stackIn_121_0;
                                                  if (((sk) this).field_w <= var7) {
                                                    stackOut_124_0 = 100000;
                                                    stackIn_125_0 = stackOut_124_0;
                                                    break L18;
                                                  } else {
                                                    stackOut_122_0 = ((sk) this).field_i[var3[var7]].field_s;
                                                    stackIn_125_0 = stackOut_122_0;
                                                    break L18;
                                                  }
                                                }
                                                L19: {
                                                  L20: {
                                                    var11 = stackIn_125_0;
                                                    if (~var11 >= ~var9) {
                                                      break L20;
                                                    } else {
                                                      if (var9 >= var10) {
                                                        break L20;
                                                      } else {
                                                        int incrementValue$9 = var8;
                                                        var8++;
                                                        ((sk) this).field_D[var4[incrementValue$9]].a(true, -8, true, ((sk) this).field_C);
                                                        break L19;
                                                      }
                                                    }
                                                  }
                                                  if (~var11 >= ~var10) {
                                                    int incrementValue$10 = var7;
                                                    var7++;
                                                    ((sk) this).field_i[var3[incrementValue$10]].a(((sk) this).field_C, -112, true);
                                                    break L19;
                                                  } else {
                                                    int incrementValue$11 = var6;
                                                    var6++;
                                                    ((sk) this).field_s[var2_array[incrementValue$11]].a(((sk) this).field_C, -53, true);
                                                    break L19;
                                                  }
                                                }
                                                continue L11;
                                              }
                                            }
                                          }
                                          L21: {
                                            if (!((sk) this).field_f) {
                                              break L21;
                                            } else {
                                              var6 = ((sk) this).field_y;
                                              break L21;
                                            }
                                          }
                                          L22: {
                                            if (((sk) this).field_o) {
                                              var7 = ((sk) this).field_w;
                                              break L22;
                                            } else {
                                              break L22;
                                            }
                                          }
                                          L23: while (true) {
                                            L24: {
                                              if (var6 < ((sk) this).field_y) {
                                                break L24;
                                              } else {
                                                if (~((sk) this).field_w < ~var7) {
                                                  break L24;
                                                } else {
                                                  if (var8 >= ((sk) this).field_p) {
                                                    break L0;
                                                  } else {
                                                    break L24;
                                                  }
                                                }
                                              }
                                            }
                                            stackOut_158_0 = ~((sk) this).field_p;
                                            stackOut_158_1 = ~var8;
                                            stackIn_160_0 = stackOut_158_0;
                                            stackIn_160_1 = stackOut_158_1;
                                            L25: {
                                              if (stackIn_160_0 >= stackIn_160_1) {
                                                break L25;
                                              } else {
                                                if (null != ((sk) this).field_D[var4[var8]]) {
                                                  break L25;
                                                } else {
                                                  var8++;
                                                  break L25;
                                                }
                                              }
                                            }
                                            L26: {
                                              if (~var6 <= ~((sk) this).field_y) {
                                                break L26;
                                              } else {
                                                if (null == ((sk) this).field_s[var2_array[var6]]) {
                                                  var6++;
                                                  break L26;
                                                } else {
                                                  break L26;
                                                }
                                              }
                                            }
                                            L27: {
                                              if (~((sk) this).field_w >= ~var7) {
                                                break L27;
                                              } else {
                                                if (((sk) this).field_i[var3[var7]] != null) {
                                                  break L27;
                                                } else {
                                                  var7++;
                                                  break L27;
                                                }
                                              }
                                            }
                                            L28: {
                                              if (~((sk) this).field_p >= ~var8) {
                                                stackOut_182_0 = 100000;
                                                stackIn_183_0 = stackOut_182_0;
                                                break L28;
                                              } else {
                                                stackOut_180_0 = ((sk) this).field_D[var4[var8]].field_d;
                                                stackIn_183_0 = stackOut_180_0;
                                                break L28;
                                              }
                                            }
                                            L29: {
                                              var9 = stackIn_183_0;
                                              if (var6 >= ((sk) this).field_y) {
                                                stackOut_186_0 = 100000;
                                                stackIn_187_0 = stackOut_186_0;
                                                break L29;
                                              } else {
                                                stackOut_184_0 = ((sk) this).field_s[var2_array[var6]].field_s;
                                                stackIn_187_0 = stackOut_184_0;
                                                break L29;
                                              }
                                            }
                                            L30: {
                                              var10 = stackIn_187_0;
                                              if (var7 >= ((sk) this).field_w) {
                                                stackOut_190_0 = 100000;
                                                stackIn_191_0 = stackOut_190_0;
                                                break L30;
                                              } else {
                                                stackOut_188_0 = ((sk) this).field_i[var3[var7]].field_s;
                                                stackIn_191_0 = stackOut_188_0;
                                                break L30;
                                              }
                                            }
                                            L31: {
                                              L32: {
                                                var11 = stackIn_191_0;
                                                if (~var9 <= ~var11) {
                                                  break L32;
                                                } else {
                                                  if (var10 > var9) {
                                                    int incrementValue$12 = var8;
                                                    var8++;
                                                    ((sk) this).field_D[var4[incrementValue$12]].a(true, -8, false, ((sk) this).field_C);
                                                    break L31;
                                                  } else {
                                                    break L32;
                                                  }
                                                }
                                              }
                                              if (var10 >= var11) {
                                                int incrementValue$13 = var7;
                                                var7++;
                                                ((sk) this).field_i[var3[incrementValue$13]].a(((sk) this).field_C, -66, false);
                                                break L31;
                                              } else {
                                                int incrementValue$14 = var6;
                                                var6++;
                                                ((sk) this).field_s[var2_array[incrementValue$14]].a(((sk) this).field_C, -108, false);
                                                break L31;
                                              }
                                            }
                                            continue L23;
                                          }
                                        } else {
                                          var5 = var6;
                                          var7 = 1 + var6;
                                          L33: while (true) {
                                            if (var7 >= ((sk) this).field_p) {
                                              L34: {
                                                if (~var5 != ~var6) {
                                                  var7 = var4[var5];
                                                  var4[var5] = var4[var6];
                                                  var4[var6] = var7;
                                                  break L34;
                                                } else {
                                                  break L34;
                                                }
                                              }
                                              var6++;
                                              continue L7;
                                            } else {
                                              L35: {
                                                if (((sk) this).field_D[var4[var5]].field_d >= ((sk) this).field_D[var4[var7]].field_d) {
                                                  break L35;
                                                } else {
                                                  var5 = var7;
                                                  break L35;
                                                }
                                              }
                                              var7++;
                                              continue L33;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      var5 = var6;
                                      var7 = 1 + var6;
                                      L36: while (true) {
                                        if (var7 >= ((sk) this).field_w) {
                                          L37: {
                                            if (~var6 == ~var5) {
                                              break L37;
                                            } else {
                                              var7 = var3[var5];
                                              var3[var5] = var3[var6];
                                              var3[var6] = var7;
                                              break L37;
                                            }
                                          }
                                          var6++;
                                          continue L6;
                                        } else {
                                          L38: {
                                            if (~((sk) this).field_i[var3[var7]].field_s < ~((sk) this).field_i[var3[var5]].field_s) {
                                              var5 = var7;
                                              break L38;
                                            } else {
                                              break L38;
                                            }
                                          }
                                          var7++;
                                          continue L36;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var5 = var6;
                                  var7 = 1 + var6;
                                  L39: while (true) {
                                    if (~var7 <= ~((sk) this).field_y) {
                                      L40: {
                                        if (~var6 == ~var5) {
                                          break L40;
                                        } else {
                                          var7 = var2_array[var5];
                                          var2_array[var5] = var2_array[var6];
                                          var2_array[var6] = var7;
                                          break L40;
                                        }
                                      }
                                      var6++;
                                      continue L5;
                                    } else {
                                      L41: {
                                        if (~((sk) this).field_s[var2_array[var7]].field_s >= ~((sk) this).field_s[var2_array[var5]].field_s) {
                                          break L41;
                                        } else {
                                          var5 = var7;
                                          break L41;
                                        }
                                      }
                                      var7++;
                                      continue L39;
                                    }
                                  }
                                }
                              }
                            } else {
                              stackOut_29_0 = null;
                              stackOut_29_1 = this;
                              stackIn_31_0 = stackOut_29_0;
                              stackIn_31_1 = stackOut_29_1;
                              L42: {
                                if (stackIn_31_0 == (Object) (Object) ((sk) this).field_D[var6]) {
                                  break L42;
                                } else {
                                  int incrementValue$15 = var5;
                                  var5++;
                                  var4[incrementValue$15] = var6;
                                  break L42;
                                }
                              }
                              var6++;
                              continue L4;
                            }
                          }
                        } else {
                          stackOut_18_0 = null;
                          stackOut_18_1 = this;
                          stackIn_20_0 = stackOut_18_0;
                          stackIn_20_1 = stackOut_18_1;
                          L43: {
                            if (stackIn_20_0 != (Object) (Object) ((sk) this).field_i[var6]) {
                              int incrementValue$16 = var5;
                              var5++;
                              var3[incrementValue$16] = var6;
                              break L43;
                            } else {
                              break L43;
                            }
                          }
                          var6++;
                          continue L3;
                        }
                      }
                    } else {
                      L44: {
                        if (((sk) this).field_s[var6] != null) {
                          int incrementValue$17 = var5;
                          var5++;
                          var2_array[incrementValue$17] = var6;
                          break L44;
                        } else {
                          break L44;
                        }
                      }
                      var6++;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            this.d(true);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "sk.AA(" + -15 + ')');
        }
    }

    private final void b() {
        try {
            this.a(((sk) this).field_i, 0, ((sk) this).field_J, ((sk) this).field_u, ((sk) this).field_s);
            this.a(((sk) this).field_s, 0, ((sk) this).field_u, ((sk) this).field_J, ((sk) this).field_i);
            int discarded$0 = 1;
            this.a(((sk) this).field_s, ((sk) this).field_J, ((sk) this).field_u, ((sk) this).field_i);
            int discarded$1 = 1;
            this.a(((sk) this).field_i, ((sk) this).field_u, ((sk) this).field_J, ((sk) this).field_s);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "sk.N(" + true + ')');
        }
    }

    private final void k() {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        Object stackIn_61_0 = null;
        lf stackIn_61_1 = null;
        Object stackIn_92_0 = null;
        lf stackIn_92_1 = null;
        lf stackIn_94_0 = null;
        Object stackOut_91_0 = null;
        lf stackOut_91_1 = null;
        lf stackOut_93_0 = null;
        Object stackOut_60_0 = null;
        lf stackOut_60_1 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        L0: {
          if (~((sk) this).field_u != ~((sk) this).field_J) {
            L1: {
              if (2 == ((sk) this).field_J) {
                break L1;
              } else {
                if (((sk) this).field_u != 2) {
                  if (((sk) this).field_J == 0) {
                    L2: {
                      if (((sk) this).field_i[0] == null) {
                        break L2;
                      } else {
                        if (!((sk) this).field_i[0].b((byte) -126)) {
                          break L2;
                        } else {
                          L3: {
                            L4: {
                              if (null == ((sk) this).field_s[0]) {
                                break L4;
                              } else {
                                if (!((sk) this).field_s[0].b((byte) 118)) {
                                  break L4;
                                } else {
                                  if (((sk) this).field_s[1] == null) {
                                    break L3;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                            }
                            if (((sk) this).field_s[1] == null) {
                              break L2;
                            } else {
                              if (((sk) this).field_s[1].b((byte) 117)) {
                                break L3;
                              } else {
                                break L2;
                              }
                            }
                          }
                          if (ns.a(false, 1000, vv.field_b) < 500) {
                            L5: {
                              ((sk) this).field_i[0].field_m = je.field_K[((sk) this).field_c][0] + -ns.a(false, 5, vv.field_b);
                              ((sk) this).field_i[0].field_f = 2;
                              if (null == ((sk) this).field_s[1]) {
                                break L5;
                              } else {
                                if (((sk) this).field_s[1].b((byte) 112)) {
                                  ((sk) this).field_s[1].field_m = ns.a(false, 5, vv.field_b);
                                  ((sk) this).field_s[1].field_f = 1;
                                  break L2;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            if (((sk) this).field_s[0] != null) {
                              ((sk) this).field_s[0].field_m = ns.a(false, 5, vv.field_b);
                              ((sk) this).field_s[0].field_f = 1;
                              break L2;
                            } else {
                              break L2;
                            }
                          } else {
                            L6: {
                              if (((sk) this).field_i[0] != null) {
                                ((sk) this).field_i[0].field_m = ns.a(false, 5, vv.field_b);
                                ((sk) this).field_i[0].field_f = 1;
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            L7: {
                              if (null == ((sk) this).field_s[1]) {
                                break L7;
                              } else {
                                if (((sk) this).field_s[1].b((byte) 126)) {
                                  ((sk) this).field_s[1].field_m = je.field_K[((sk) this).field_a][0] + -ns.a(false, 5, vv.field_b);
                                  ((sk) this).field_s[1].field_f = 2;
                                  break L2;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            if (null == ((sk) this).field_s[0]) {
                              break L2;
                            } else {
                              ((sk) this).field_s[0].field_m = je.field_K[((sk) this).field_a][0] + -ns.a(false, 5, vv.field_b);
                              ((sk) this).field_s[0].field_f = 2;
                              break L2;
                            }
                          }
                        }
                      }
                    }
                    L8: {
                      if (((sk) this).field_i[1] == null) {
                        break L8;
                      } else {
                        if (!((sk) this).field_i[1].b((byte) -109)) {
                          break L8;
                        } else {
                          L9: {
                            L10: {
                              if (null == ((sk) this).field_s[0]) {
                                break L10;
                              } else {
                                if (!((sk) this).field_s[0].b((byte) 72)) {
                                  break L10;
                                } else {
                                  if (null == ((sk) this).field_s[1]) {
                                    break L9;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                            }
                            if (null == ((sk) this).field_s[2]) {
                              break L8;
                            } else {
                              if (!((sk) this).field_s[2].b((byte) 99)) {
                                break L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                          if (ns.a(false, 1000, vv.field_b) >= 500) {
                            L11: {
                              if (null == ((sk) this).field_i[1]) {
                                break L11;
                              } else {
                                ((sk) this).field_i[1].field_m = ns.a(false, 5, vv.field_b);
                                ((sk) this).field_i[1].field_f = 1;
                                break L11;
                              }
                            }
                            L12: {
                              if (((sk) this).field_s[2] == null) {
                                break L12;
                              } else {
                                if (!((sk) this).field_s[2].b((byte) -122)) {
                                  break L12;
                                } else {
                                  ((sk) this).field_s[2].field_m = je.field_K[((sk) this).field_a][0] + -ns.a(false, 5, vv.field_b);
                                  ((sk) this).field_s[2].field_f = 2;
                                  break L8;
                                }
                              }
                            }
                            if (null == ((sk) this).field_s[0]) {
                              break L8;
                            } else {
                              ((sk) this).field_s[0].field_m = je.field_K[((sk) this).field_a][0] + -ns.a(false, 5, vv.field_b);
                              ((sk) this).field_s[0].field_f = 2;
                              break L8;
                            }
                          } else {
                            L13: {
                              if (null != ((sk) this).field_i[1]) {
                                ((sk) this).field_i[1].field_m = je.field_K[((sk) this).field_c][0] - ns.a(false, 5, vv.field_b);
                                ((sk) this).field_i[1].field_f = 2;
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                            L14: {
                              if (null == ((sk) this).field_s[2]) {
                                break L14;
                              } else {
                                if (!((sk) this).field_s[2].b((byte) -50)) {
                                  break L14;
                                } else {
                                  ((sk) this).field_s[2].field_m = ns.a(false, 5, vv.field_b);
                                  ((sk) this).field_s[2].field_f = 1;
                                  break L8;
                                }
                              }
                            }
                            if (((sk) this).field_s[0] == null) {
                              break L8;
                            } else {
                              ((sk) this).field_s[0].field_m = ns.a(false, 5, vv.field_b);
                              ((sk) this).field_s[0].field_f = 1;
                              break L8;
                            }
                          }
                        }
                      }
                    }
                    if (null == ((sk) this).field_s[0]) {
                      break L0;
                    } else {
                      if (((sk) this).field_s[0].b((byte) 120)) {
                        L15: {
                          if (null == ((sk) this).field_s[1]) {
                            break L15;
                          } else {
                            if (-1 == ((sk) this).field_s[1].field_f) {
                              break L15;
                            } else {
                              if (null == ((sk) this).field_s[2]) {
                                break L15;
                              } else {
                                if (((sk) this).field_s[2].field_f != -1) {
                                  if (ns.a(false, 1000, vv.field_b) < 500) {
                                    if (((sk) this).field_s[0] == null) {
                                      break L0;
                                    } else {
                                      ((sk) this).field_s[0].field_m = ((sk) this).field_s[1].field_m + ns.a(false, 5, vv.field_b);
                                      ((sk) this).field_s[0].field_f = ((sk) this).field_s[2].field_f;
                                      break L0;
                                    }
                                  } else {
                                    if (null != ((sk) this).field_s[0]) {
                                      ((sk) this).field_s[0].field_m = ((sk) this).field_s[1].field_m + ns.a(false, 5, vv.field_b);
                                      ((sk) this).field_s[0].field_f = ((sk) this).field_s[1].field_f;
                                      break L0;
                                    } else {
                                      break L0;
                                    }
                                  }
                                } else {
                                  break L15;
                                }
                              }
                            }
                          }
                        }
                        L16: {
                          if (((sk) this).field_s[1] == null) {
                            break L16;
                          } else {
                            if (((sk) this).field_s[1].field_f != -1) {
                              if (null != ((sk) this).field_s[0]) {
                                ((sk) this).field_s[0].field_m = ((sk) this).field_s[1].field_m + ns.a(false, 5, vv.field_b);
                                ((sk) this).field_s[0].field_f = ((sk) this).field_s[1].field_f;
                                break L0;
                              } else {
                                break L0;
                              }
                            } else {
                              break L16;
                            }
                          }
                        }
                        if (null == ((sk) this).field_s[2]) {
                          break L0;
                        } else {
                          if (((sk) this).field_s[2].field_f == -1) {
                            break L0;
                          } else {
                            if (null == ((sk) this).field_s[0]) {
                              break L0;
                            } else {
                              ((sk) this).field_s[0].field_m = ((sk) this).field_s[2].field_m - -ns.a(false, 5, vv.field_b);
                              ((sk) this).field_s[0].field_f = ((sk) this).field_s[2].field_f;
                              break L0;
                            }
                          }
                        }
                      } else {
                        break L0;
                      }
                    }
                  } else {
                    L17: {
                      if (null == ((sk) this).field_s[0]) {
                        break L17;
                      } else {
                        if (!((sk) this).field_s[0].b((byte) -61)) {
                          break L17;
                        } else {
                          L18: {
                            L19: {
                              if (null == ((sk) this).field_i[0]) {
                                break L19;
                              } else {
                                if (!((sk) this).field_i[0].b((byte) 104)) {
                                  break L19;
                                } else {
                                  if (null == ((sk) this).field_i[1]) {
                                    break L18;
                                  } else {
                                    break L19;
                                  }
                                }
                              }
                            }
                            if (((sk) this).field_i[1] == null) {
                              break L17;
                            } else {
                              if (((sk) this).field_i[1].b((byte) 33)) {
                                break L18;
                              } else {
                                break L17;
                              }
                            }
                          }
                          if (500 <= ns.a(false, 1000, vv.field_b)) {
                            L20: {
                              if (((sk) this).field_s[0] != null) {
                                ((sk) this).field_s[0].field_m = ns.a(false, 5, vv.field_b);
                                ((sk) this).field_s[0].field_f = 1;
                                break L20;
                              } else {
                                break L20;
                              }
                            }
                            L21: {
                              if (((sk) this).field_i[1] == null) {
                                break L21;
                              } else {
                                if (((sk) this).field_i[1].b((byte) -56)) {
                                  ((sk) this).field_i[1].field_m = je.field_K[((sk) this).field_c][0] - ns.a(false, 5, vv.field_b);
                                  ((sk) this).field_i[1].field_f = 2;
                                  break L17;
                                } else {
                                  break L21;
                                }
                              }
                            }
                            if (null == ((sk) this).field_i[0]) {
                              break L17;
                            } else {
                              ((sk) this).field_i[0].field_m = je.field_K[((sk) this).field_c][0] - ns.a(false, 5, vv.field_b);
                              ((sk) this).field_i[0].field_f = 2;
                              break L17;
                            }
                          } else {
                            L22: {
                              if (null != ((sk) this).field_s[0]) {
                                ((sk) this).field_s[0].field_m = je.field_K[((sk) this).field_a][0] + -ns.a(false, 5, vv.field_b);
                                ((sk) this).field_s[0].field_f = 2;
                                break L22;
                              } else {
                                break L22;
                              }
                            }
                            L23: {
                              if (((sk) this).field_i[1] == null) {
                                break L23;
                              } else {
                                if (!((sk) this).field_i[1].b((byte) -80)) {
                                  break L23;
                                } else {
                                  ((sk) this).field_i[1].field_m = je.field_K[((sk) this).field_c][0] + -ns.a(false, 5, vv.field_b);
                                  ((sk) this).field_i[1].field_f = 1;
                                  break L17;
                                }
                              }
                            }
                            if (((sk) this).field_i[0] == null) {
                              break L17;
                            } else {
                              ((sk) this).field_i[0].field_m = je.field_K[((sk) this).field_c][0] - ns.a(false, 5, vv.field_b);
                              ((sk) this).field_i[0].field_f = 1;
                              break L17;
                            }
                          }
                        }
                      }
                    }
                    L24: {
                      if (((sk) this).field_s[1] == null) {
                        break L24;
                      } else {
                        if (!((sk) this).field_s[1].b((byte) -45)) {
                          break L24;
                        } else {
                          L25: {
                            L26: {
                              if (null == ((sk) this).field_i[0]) {
                                break L26;
                              } else {
                                if (!((sk) this).field_i[0].b((byte) -90)) {
                                  break L26;
                                } else {
                                  if (((sk) this).field_i[1] == null) {
                                    break L25;
                                  } else {
                                    break L26;
                                  }
                                }
                              }
                            }
                            if (null == ((sk) this).field_i[2]) {
                              break L24;
                            } else {
                              if (((sk) this).field_i[2].b((byte) 29)) {
                                break L25;
                              } else {
                                break L24;
                              }
                            }
                          }
                          if (ns.a(false, 1000, vv.field_b) < 500) {
                            L27: {
                              if (null == ((sk) this).field_s[1]) {
                                break L27;
                              } else {
                                ((sk) this).field_s[1].field_m = je.field_K[((sk) this).field_a][0] - ns.a(false, 5, vv.field_b);
                                ((sk) this).field_s[1].field_f = 2;
                                break L27;
                              }
                            }
                            L28: {
                              if (null == ((sk) this).field_i[2]) {
                                break L28;
                              } else {
                                if (!((sk) this).field_i[2].b((byte) -112)) {
                                  break L28;
                                } else {
                                  ((sk) this).field_i[2].field_m = ns.a(false, 5, vv.field_b);
                                  ((sk) this).field_i[2].field_f = 1;
                                  break L24;
                                }
                              }
                            }
                            if (((sk) this).field_i[0] != null) {
                              ((sk) this).field_i[0].field_m = ns.a(false, 5, vv.field_b);
                              ((sk) this).field_i[0].field_f = 1;
                              break L24;
                            } else {
                              break L24;
                            }
                          } else {
                            L29: {
                              if (((sk) this).field_s[1] == null) {
                                break L29;
                              } else {
                                ((sk) this).field_s[1].field_m = ns.a(false, 5, vv.field_b);
                                ((sk) this).field_s[1].field_f = 1;
                                break L29;
                              }
                            }
                            L30: {
                              if (((sk) this).field_i[2] == null) {
                                break L30;
                              } else {
                                if (((sk) this).field_i[2].b((byte) -114)) {
                                  ((sk) this).field_i[2].field_m = je.field_K[((sk) this).field_c][0] - ns.a(false, 5, vv.field_b);
                                  ((sk) this).field_i[2].field_f = 2;
                                  break L24;
                                } else {
                                  break L30;
                                }
                              }
                            }
                            if (null != ((sk) this).field_i[0]) {
                              ((sk) this).field_i[0].field_m = je.field_K[((sk) this).field_c][0] + -ns.a(false, 30, vv.field_b);
                              ((sk) this).field_i[0].field_f = 2;
                              break L24;
                            } else {
                              break L24;
                            }
                          }
                        }
                      }
                    }
                    if (((sk) this).field_i[0] == null) {
                      break L0;
                    } else {
                      if (!((sk) this).field_i[0].b((byte) -70)) {
                        break L0;
                      } else {
                        L31: {
                          if (((sk) this).field_i[1] == null) {
                            break L31;
                          } else {
                            if (-1 == ((sk) this).field_i[1].field_f) {
                              break L31;
                            } else {
                              if (null == ((sk) this).field_i[2]) {
                                break L31;
                              } else {
                                if (-1 != ((sk) this).field_i[2].field_f) {
                                  if (ns.a(false, 1000, vv.field_b) < 500) {
                                    if (null != ((sk) this).field_i[0]) {
                                      ((sk) this).field_i[0].field_m = ((sk) this).field_i[2].field_m - -ns.a(false, 5, vv.field_b);
                                      ((sk) this).field_i[0].field_f = ((sk) this).field_i[2].field_f;
                                      break L0;
                                    } else {
                                      break L0;
                                    }
                                  } else {
                                    if (((sk) this).field_i[0] != null) {
                                      ((sk) this).field_i[0].field_m = ((sk) this).field_i[1].field_m + ns.a(false, 5, vv.field_b);
                                      ((sk) this).field_i[0].field_f = ((sk) this).field_i[1].field_f;
                                      break L0;
                                    } else {
                                      break L0;
                                    }
                                  }
                                } else {
                                  break L31;
                                }
                              }
                            }
                          }
                        }
                        L32: {
                          if (((sk) this).field_i[1] == null) {
                            break L32;
                          } else {
                            if (-1 != ((sk) this).field_i[1].field_f) {
                              if (null != ((sk) this).field_i[0]) {
                                ((sk) this).field_i[0].field_m = ((sk) this).field_i[1].field_m + ns.a(false, 5, vv.field_b);
                                ((sk) this).field_i[0].field_f = ((sk) this).field_i[1].field_f;
                                break L0;
                              } else {
                                break L0;
                              }
                            } else {
                              break L32;
                            }
                          }
                        }
                        if (((sk) this).field_i[2] == null) {
                          break L0;
                        } else {
                          if (-1 != ((sk) this).field_i[2].field_f) {
                            if (null == ((sk) this).field_i[0]) {
                              break L0;
                            } else {
                              ((sk) this).field_i[0].field_m = ((sk) this).field_i[2].field_m + ns.a(false, 5, vv.field_b);
                              ((sk) this).field_i[0].field_f = ((sk) this).field_i[2].field_f;
                              break L0;
                            }
                          } else {
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
            var2_int = 1;
            var3 = 0;
            L33: while (true) {
              if (~(-((sk) this).field_J + 3) >= ~var3) {
                var3 = 0;
                L34: while (true) {
                  if (~var3 <= ~(-((sk) this).field_u + 3)) {
                    L35: {
                      if (var2_int == 0) {
                        break L35;
                      } else {
                        if (ns.a(false, 1000, vv.field_b) >= 500) {
                          L36: {
                            if (((sk) this).field_J != 2) {
                              var3 = 0;
                              L37: while (true) {
                                if (~var3 <= ~(-((sk) this).field_J + 3)) {
                                  break L36;
                                } else {
                                  L38: {
                                    if (null != ((sk) this).field_s[var3]) {
                                      ((sk) this).field_s[var3].field_f = 2;
                                      break L38;
                                    } else {
                                      break L38;
                                    }
                                  }
                                  L39: {
                                    if (((sk) this).field_s[var3] != null) {
                                      ((sk) this).field_s[var3].field_m = je.field_K[((sk) this).field_a][0] + -ns.a(false, 5, vv.field_b);
                                      break L39;
                                    } else {
                                      break L39;
                                    }
                                  }
                                  var3++;
                                  continue L37;
                                }
                              }
                            } else {
                              if (null == ((sk) this).field_s[0]) {
                                break L36;
                              } else {
                                ((sk) this).field_s[0].field_f = 2;
                                ((sk) this).field_s[0].field_m = je.field_K[((sk) this).field_a][0];
                                break L36;
                              }
                            }
                          }
                          if (((sk) this).field_u != 2) {
                            var3 = 0;
                            L40: while (true) {
                              if (~var3 <= ~(3 - ((sk) this).field_u)) {
                                break L35;
                              } else {
                                stackOut_91_0 = null;
                                stackOut_91_1 = ((sk) this).field_i[var3];
                                stackIn_92_0 = stackOut_91_0;
                                stackIn_92_1 = stackOut_91_1;
                                L41: {
                                  if (stackIn_92_0 == (Object) (Object) stackIn_92_1) {
                                    break L41;
                                  } else {
                                    ((sk) this).field_i[var3].field_f = 1;
                                    stackOut_93_0 = ((sk) this).field_i[var3];
                                    stackIn_94_0 = stackOut_93_0;
                                    stackIn_94_0.field_m = ns.a(false, 5, vv.field_b);
                                    break L41;
                                  }
                                }
                                var3++;
                                continue L40;
                              }
                            }
                          } else {
                            if (((sk) this).field_i[0] != null) {
                              ((sk) this).field_i[0].a(1, (byte) -122);
                              break L35;
                            } else {
                              break L35;
                            }
                          }
                        } else {
                          L42: {
                            if (((sk) this).field_J == 2) {
                              if (null == ((sk) this).field_s[0]) {
                                break L42;
                              } else {
                                ((sk) this).field_s[0].a(1, (byte) -86);
                                break L42;
                              }
                            } else {
                              var3 = 0;
                              L43: while (true) {
                                if (var3 >= 3 - ((sk) this).field_J) {
                                  break L42;
                                } else {
                                  L44: {
                                    if (null != ((sk) this).field_s[var3]) {
                                      ((sk) this).field_s[var3].field_f = 1;
                                      break L44;
                                    } else {
                                      break L44;
                                    }
                                  }
                                  L45: {
                                    if (null == ((sk) this).field_s[var3]) {
                                      break L45;
                                    } else {
                                      ((sk) this).field_s[var3].field_m = ns.a(false, 5, vv.field_b);
                                      break L45;
                                    }
                                  }
                                  var3++;
                                  continue L43;
                                }
                              }
                            }
                          }
                          if (2 == ((sk) this).field_u) {
                            if (((sk) this).field_i[0] != null) {
                              ((sk) this).field_i[0].field_f = 2;
                              ((sk) this).field_i[0].field_m = je.field_K[((sk) this).field_c][0];
                              break L35;
                            } else {
                              break L35;
                            }
                          } else {
                            var3 = 0;
                            L46: while (true) {
                              if (3 + -((sk) this).field_u <= var3) {
                                break L35;
                              } else {
                                stackOut_60_0 = null;
                                stackOut_60_1 = ((sk) this).field_i[var3];
                                stackIn_61_0 = stackOut_60_0;
                                stackIn_61_1 = stackOut_60_1;
                                L47: {
                                  if (stackIn_61_0 == (Object) (Object) stackIn_61_1) {
                                    break L47;
                                  } else {
                                    ((sk) this).field_i[var3].field_f = 2;
                                    ((sk) this).field_i[var3].field_m = je.field_K[((sk) this).field_c][0] + -ns.a(false, 5, vv.field_b);
                                    break L47;
                                  }
                                }
                                var3++;
                                continue L46;
                              }
                            }
                          }
                        }
                      }
                    }
                    break L0;
                  } else {
                    L48: {
                      if (null == ((sk) this).field_i[var3]) {
                        break L48;
                      } else {
                        if (((sk) this).field_i[var3].b((byte) 30)) {
                          break L48;
                        } else {
                          var2_int = 0;
                          break L48;
                        }
                      }
                    }
                    var3++;
                    continue L34;
                  }
                }
              } else {
                L49: {
                  if (((sk) this).field_s[var3] == null) {
                    break L49;
                  } else {
                    if (!((sk) this).field_s[var3].b((byte) -74)) {
                      var2_int = 0;
                      break L49;
                    } else {
                      break L49;
                    }
                  }
                }
                var3++;
                continue L33;
              }
            }
          } else {
            var2_int = 0;
            L50: while (true) {
              if (var2_int >= 3 + -((sk) this).field_J) {
                break L0;
              } else {
                L51: {
                  if (null == ((sk) this).field_s[var2_int]) {
                    break L51;
                  } else {
                    if (null == ((sk) this).field_i[var2_int]) {
                      break L51;
                    } else {
                      if (!((sk) this).field_s[var2_int].b((byte) -74)) {
                        break L51;
                      } else {
                        if (!((sk) this).field_i[var2_int].b((byte) -110)) {
                          break L51;
                        } else {
                          if (ns.a(false, 1000, vv.field_b) < 500) {
                            ((sk) this).field_s[var2_int].a(1, (byte) -116);
                            ((sk) this).field_i[var2_int].field_f = 2;
                            ((sk) this).field_i[var2_int].field_m = je.field_K[((sk) this).field_c][0];
                            break L51;
                          } else {
                            ((sk) this).field_s[var2_int].a(2, (byte) -113);
                            ((sk) this).field_s[var2_int].field_m = je.field_K[((sk) this).field_a][0];
                            ((sk) this).field_i[var2_int].a(1, (byte) -119);
                            break L51;
                          }
                        }
                      }
                    }
                  }
                }
                var2_int++;
                continue L50;
              }
            }
          }
        }
    }

    private final void e(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (((sk) this).field_l == null) {
              return;
            } else {
              ((sk) this).field_B.field_c[0] = ((sk) this).field_k.field_x % ((sk) this).field_r;
              ((sk) this).field_B.field_c[1] = ((sk) this).field_k.field_x / ((sk) this).field_r;
              ((sk) this).field_B.f(-106);
              ((sk) this).field_B.i(0);
              ((sk) this).field_l[1] = ((sk) this).field_B.field_e[1];
              ((sk) this).field_l[0] = ((sk) this).field_B.field_e[0];
              ((sk) this).field_k.field_m = ((sk) this).field_l[0];
              ((sk) this).field_k.field_v = ((sk) this).field_l[1];
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "sk.W(" + 2 + ')');
        }
    }

    private final void o() {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              int discarded$2 = 12579;
              this.b(((sk) this).field_i);
              if (((sk) this).field_F != 30) {
                break L1;
              } else {
                ((sk) this).field_n = 1;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "sk.A(" + -124 + ')');
        }
    }

    final static String i() {
        RuntimeException var1 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        String stackIn_13_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_12_0 = null;
        String stackOut_10_0 = null;
        String stackOut_7_0 = null;
        String stackOut_4_0 = null;
        try {
          L0: {
            if (du.field_d != oh.field_L) {
              if (du.field_d != mh.field_b) {
                if (se.field_g.a((byte) -47)) {
                  stackOut_12_0 = ga.field_d;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  stackOut_10_0 = jh.field_j;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              } else {
                stackOut_7_0 = jh.field_j;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              }
            } else {
              stackOut_4_0 = ue.field_a;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "sk.G(" + -4938 + ')');
        }
        return stackIn_13_0;
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
              ((sk) this).field_H.b();
              this.a((byte) 99, 0, 0, -1);
              tm.a();
              tm.c();
              if (!((sk) this).field_d) {
                int discarded$3 = -15;
                this.f();
                if (!((sk) this).field_o) {
                  if (!((sk) this).field_f) {
                    break L1;
                  } else {
                    qn.f(0, 0, 320, 480, 0);
                    break L1;
                  }
                } else {
                  qn.f(320, 0, 640, 480, 0);
                  break L1;
                }
              } else {
                if (((sk) this).field_n == 5) {
                  this.a(true, ((sk) this).field_s, (byte) 109, ((sk) this).field_y, ((sk) this).field_D);
                  break L1;
                } else {
                  L2: {
                    if (((sk) this).field_n == 6) {
                      break L2;
                    } else {
                      L3: {
                        if (((sk) this).field_n != 8) {
                          break L3;
                        } else {
                          if (((sk) this).field_L == 8) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L4: {
                        if (((sk) this).field_n == 7) {
                          break L4;
                        } else {
                          if (8 != ((sk) this).field_n) {
                            break L1;
                          } else {
                            if (((sk) this).field_L == 7) {
                              break L4;
                            } else {
                              break L1;
                            }
                          }
                        }
                      }
                      int discarded$4 = 83;
                      this.a(((sk) this).field_y, ((sk) this).field_s);
                      break L1;
                    }
                  }
                  this.a(false, ((sk) this).field_i, (byte) 109, ((sk) this).field_w, ((sk) this).field_D);
                  break L1;
                }
              }
            }
            L5: {
              L6: {
                var2_int = 21;
                var3 = 35;
                var4 = 93;
                var5 = 35;
                var6 = rs.field_k - var2_int - var4;
                var7 = var3;
                if (!iu.field_n) {
                  break L6;
                } else {
                  if (((sk) this).b((byte) -96)) {
                    stackOut_49_0 = ci.field_e;
                    stackIn_50_0 = stackOut_49_0;
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              stackOut_47_0 = nd.field_b;
              stackIn_50_0 = stackOut_47_0;
              break L5;
            }
            L7: {
              var8 = stackIn_50_0;
              fe.a(var6, var7, var4, var5, il.field_s, var8, 0, 0, true);
              if (param0 < -119) {
                break L7;
              } else {
                ((sk) this).field_C = 65;
                break L7;
              }
            }
            L8: {
              var2_int = var4 >> 1;
              var3 = mp.k(-104) + (var5 >> 1);
              int discarded$5 = 1;
              fe.c(em.field_c, var2_int + var6, var7 - -var3, 2236962);
              if (((sk) this).field_x == null) {
                break L8;
              } else {
                if (((sk) this).field_x.field_T != null) {
                  L9: {
                    var3 = 19;
                    if (ku.field_J != null) {
                      stackOut_62_0 = ku.field_J.field_x >> 1;
                      stackIn_63_0 = stackOut_62_0;
                      break L9;
                    } else {
                      stackOut_60_0 = 0;
                      stackIn_63_0 = stackOut_60_0;
                      break L9;
                    }
                  }
                  L10: {
                    var5 = stackIn_63_0;
                    if (ku.field_J == null) {
                      stackOut_66_0 = 0;
                      stackIn_67_0 = stackOut_66_0;
                      break L10;
                    } else {
                      stackOut_64_0 = ku.field_J.field_A >> 1;
                      stackIn_67_0 = stackOut_64_0;
                      break L10;
                    }
                  }
                  L11: {
                    var4 = stackIn_67_0;
                    var2_int = 17;
                    var6 = var2_int;
                    var7 = -var5 + (ag.field_I.field_D - var3);
                    if (((sk) this).field_e <= -1) {
                      break L11;
                    } else {
                      ((sk) this).field_x.field_T[((sk) this).field_e].a(var6, ((sk) this).field_x.field_lb[((sk) this).field_e], false, false, var7, false, false, 122);
                      break L11;
                    }
                  }
                  var6 = -var2_int + (so.field_b.field_a + -var4);
                  if (((sk) this).field_g <= -1) {
                    break L8;
                  } else {
                    ((sk) this).field_x.field_T[((sk) this).field_g].a(var6, ((sk) this).field_x.field_lb[((sk) this).field_g], false, false, var7, false, false, 28);
                    break L8;
                  }
                } else {
                  break L8;
                }
              }
            }
            L12: {
              fe.b(0, 0, rs.field_k, se.field_a, dq.field_i, nd.field_b, 0, 0);
              so.field_b.a(5605);
              if (null == u.field_p) {
                ((sk) this).field_H.f(0, 0);
                break L12;
              } else {
                u.field_p.a(-66, ((sk) this).field_H);
                break L12;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "sk.H(" + param0 + ')');
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
            var6_array = new int[3 + -param2];
            var7 = 0;
            if (param2 == 2) {
              return;
            } else {
              L1: {
                if (1 == param2) {
                  L2: {
                    if (param4[0] == null) {
                      L3: {
                        L4: {
                          if (null == param0[0]) {
                            break L4;
                          } else {
                            if (!param0[0].field_d) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        if (param3 != 0) {
                          break L2;
                        } else {
                          if (null == param0[1]) {
                            break L2;
                          } else {
                            if (!param0[1].field_d) {
                              break L3;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                      var6_array[var7] = 0;
                      var7++;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  if (null != param4[1]) {
                    break L1;
                  } else {
                    L5: {
                      L6: {
                        if (null == param0[0]) {
                          break L6;
                        } else {
                          if (!param0[0].field_d) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      if (param3 != 0) {
                        break L1;
                      } else {
                        if (null == param0[2]) {
                          break L1;
                        } else {
                          if (!param0[2].field_d) {
                            break L5;
                          } else {
                            break L1;
                          }
                        }
                      }
                    }
                    var6_array[var7] = 1;
                    var7++;
                    break L1;
                  }
                } else {
                  if (param2 == 0) {
                    L7: {
                      if (param4[0] == null) {
                        L8: {
                          L9: {
                            if (param0[0] == null) {
                              break L9;
                            } else {
                              if (!param0[0].field_d) {
                                break L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                          if (param3 != 1) {
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
                        var6_array[var7] = 0;
                        var7++;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L10: {
                      if (null != param4[1]) {
                        break L10;
                      } else {
                        L11: {
                          L12: {
                            if (0 == param3) {
                              break L12;
                            } else {
                              if (null == param0[0]) {
                                break L12;
                              } else {
                                if (!param0[0].field_d) {
                                  break L11;
                                } else {
                                  break L12;
                                }
                              }
                            }
                          }
                          if (param3 != 0) {
                            break L10;
                          } else {
                            if (param0[1] == null) {
                              break L10;
                            } else {
                              if (!param0[1].field_d) {
                                break L11;
                              } else {
                                break L10;
                              }
                            }
                          }
                        }
                        var6_array[var7] = 1;
                        var7++;
                        break L10;
                      }
                    }
                    if (param4[2] != null) {
                      break L1;
                    } else {
                      L13: {
                        L14: {
                          if (param3 != 2) {
                            break L14;
                          } else {
                            if (null == param0[0]) {
                              break L14;
                            } else {
                              if (!param0[0].field_d) {
                                break L13;
                              } else {
                                break L14;
                              }
                            }
                          }
                        }
                        L15: {
                          if (param3 != 1) {
                            break L15;
                          } else {
                            if (null == param0[1]) {
                              break L15;
                            } else {
                              if (!param0[1].field_d) {
                                break L13;
                              } else {
                                break L15;
                              }
                            }
                          }
                        }
                        if (param3 != 0) {
                          break L1;
                        } else {
                          if (null == param0[2]) {
                            break L1;
                          } else {
                            if (!param0[2].field_d) {
                              break L13;
                            } else {
                              break L1;
                            }
                          }
                        }
                      }
                      var6_array[var7] = 2;
                      var7++;
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              if (var7 != 0) {
                L16: {
                  L17: {
                    var8 = -1;
                    var9 = var6_array[ns.a(false, var7, vv.field_b)];
                    if (1 != param2) {
                      break L17;
                    } else {
                      if (param4[2] == null) {
                        break L17;
                      } else {
                        var8 = 2;
                        break L16;
                      }
                    }
                  }
                  if (param2 != 0) {
                    break L16;
                  } else {
                    if (var9 != 2) {
                      L18: {
                        if (null == param4[3]) {
                          break L18;
                        } else {
                          if (!param4[3].b(2166)) {
                            break L18;
                          } else {
                            var8 = 3;
                            break L16;
                          }
                        }
                      }
                      if (param2 != 0) {
                        break L16;
                      } else {
                        if (param4[4] == null) {
                          break L16;
                        } else {
                          if (!param4[4].b(2166)) {
                            break L16;
                          } else {
                            var8 = 4;
                            break L16;
                          }
                        }
                      }
                    } else {
                      L19: {
                        if (null == param4[4]) {
                          break L19;
                        } else {
                          if (!param4[4].b(2166)) {
                            break L19;
                          } else {
                            var8 = 4;
                            break L16;
                          }
                        }
                      }
                      if (0 != param2) {
                        break L16;
                      } else {
                        if (null == param4[3]) {
                          break L16;
                        } else {
                          if (!param4[3].b(2166)) {
                            break L16;
                          } else {
                            var8 = 3;
                            break L16;
                          }
                        }
                      }
                    }
                  }
                }
                L20: {
                  if (var8 > -1) {
                    param4[var9] = param4[var8];
                    param4[var8] = null;
                    param4[var9].field_j = tn.field_W[param2][var9];
                    param4[var9].field_p = kw.field_P[param2][var9];
                    break L20;
                  } else {
                    break L20;
                  }
                }
                break L0;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var6 = decompiledCaughtException;
            stackOut_175_0 = (RuntimeException) var6;
            stackOut_175_1 = new StringBuilder().append("sk.HA(");
            stackIn_178_0 = stackOut_175_0;
            stackIn_178_1 = stackOut_175_1;
            stackIn_176_0 = stackOut_175_0;
            stackIn_176_1 = stackOut_175_1;
            if (param0 == null) {
              stackOut_178_0 = (RuntimeException) (Object) stackIn_178_0;
              stackOut_178_1 = (StringBuilder) (Object) stackIn_178_1;
              stackOut_178_2 = "null";
              stackIn_179_0 = stackOut_178_0;
              stackIn_179_1 = stackOut_178_1;
              stackIn_179_2 = stackOut_178_2;
              break L21;
            } else {
              stackOut_176_0 = (RuntimeException) (Object) stackIn_176_0;
              stackOut_176_1 = (StringBuilder) (Object) stackIn_176_1;
              stackOut_176_2 = "{...}";
              stackIn_179_0 = stackOut_176_0;
              stackIn_179_1 = stackOut_176_1;
              stackIn_179_2 = stackOut_176_2;
              break L21;
            }
          }
          L22: {
            stackOut_179_0 = (RuntimeException) (Object) stackIn_179_0;
            stackOut_179_1 = ((StringBuilder) (Object) stackIn_179_1).append(stackIn_179_2).append(',').append(0).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_182_0 = stackOut_179_0;
            stackIn_182_1 = stackOut_179_1;
            stackIn_180_0 = stackOut_179_0;
            stackIn_180_1 = stackOut_179_1;
            if (param4 == null) {
              stackOut_182_0 = (RuntimeException) (Object) stackIn_182_0;
              stackOut_182_1 = (StringBuilder) (Object) stackIn_182_1;
              stackOut_182_2 = "null";
              stackIn_183_0 = stackOut_182_0;
              stackIn_183_1 = stackOut_182_1;
              stackIn_183_2 = stackOut_182_2;
              break L22;
            } else {
              stackOut_180_0 = (RuntimeException) (Object) stackIn_180_0;
              stackOut_180_1 = (StringBuilder) (Object) stackIn_180_1;
              stackOut_180_2 = "{...}";
              stackIn_183_0 = stackOut_180_0;
              stackIn_183_1 = stackOut_180_1;
              stackIn_183_2 = stackOut_180_2;
              break L22;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_183_0, stackIn_183_2 + ')');
        }
    }

    private final void c(boolean param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= ((sk) this).field_s.length) {
                var2_int = 0;
                L2: while (true) {
                  L3: {
                    if (~((sk) this).field_D.length >= ~var2_int) {
                      break L3;
                    } else {
                      if (null == ((sk) this).field_D[var2_int]) {
                        break L3;
                      } else {
                        ((sk) this).field_D[var2_int].d(59);
                        var2_int++;
                        continue L2;
                      }
                    }
                  }
                  L4: {
                    if (0 != (((sk) this).field_F & 15)) {
                      break L4;
                    } else {
                      this.f(-24577);
                      break L4;
                    }
                  }
                  L5: {
                    if (((sk) this).field_D[-1 + ((sk) this).field_D.length] == null) {
                      break L5;
                    } else {
                      if (((sk) this).field_D[-1 + ((sk) this).field_D.length].field_f <= 200) {
                        break L5;
                      } else {
                        ((sk) this).field_n = 6;
                        this.h(1);
                        break L5;
                      }
                    }
                  }
                  break L0;
                }
              } else {
                L6: {
                  if (null == ((sk) this).field_s[var2_int]) {
                    break L6;
                  } else {
                    ((sk) this).field_s[var2_int].d((byte) 113);
                    if (!((sk) this).field_s[var2_int].field_l) {
                      break L6;
                    } else {
                      ((sk) this).field_s[var2_int].field_l = false;
                      this.a((byte) -84, var2_int);
                      if (!((sk) this).field_h) {
                        break L6;
                      } else {
                        ((sk) this).field_s[var2_int].a(0, 30, 1, -10, u.field_o[((sk) this).field_c][1], pk.field_T[((sk) this).field_c][1], (byte) 122);
                        break L6;
                      }
                    }
                  }
                }
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "sk.KA(" + false + ')');
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
                field_j = null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (jv.field_a) {
                  break L3;
                } else {
                  if (null != ((sk) this).field_A) {
                    if (param3 >= 0) {
                      ((sk) this).field_A.e(0, 0, param3);
                      break L2;
                    } else {
                      ((sk) this).field_A.f(0, 0);
                      break L2;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              qn.b();
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var5, "sk.LA(" + param0 + ',' + 0 + ',' + 0 + ',' + param3 + ')');
        }
    }

    private final int[] a(int param0, byte param1) {
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_3_0 = null;
        int[] stackIn_19_0 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_18_0 = null;
        Object stackOut_2_0 = null;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param1 <= -126) {
              var3 = new int[param0];
              var4 = new int[param0];
              var5 = 0;
              L1: while (true) {
                if (var5 >= param0) {
                  var5 = 0;
                  L2: while (true) {
                    if (~var5 <= ~(param0 + -1)) {
                      stackOut_18_0 = (int[]) var3;
                      stackIn_19_0 = stackOut_18_0;
                      break L0;
                    } else {
                      var6 = var5;
                      var7 = var4[var5];
                      var8 = var5 + 1;
                      L3: while (true) {
                        if (~param0 >= ~var8) {
                          var8 = var3[var6];
                          var4[var6] = var4[var5];
                          var3[var6] = var3[var5];
                          var4[var5] = var7;
                          var3[var5] = var8;
                          var5++;
                          continue L2;
                        } else {
                          L4: {
                            if (~var4[var8] < ~var7) {
                              var7 = var4[var8];
                              var6 = var8;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          var8++;
                          continue L3;
                        }
                      }
                    }
                  }
                } else {
                  var3[var5] = var5;
                  var4[var5] = ns.a(false, 2147483647, vv.field_b);
                  var5++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (int[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var3_ref, "sk.J(" + param0 + ',' + param1 + ')');
        }
        return stackIn_19_0;
    }

    private final void e() {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (((sk) this).field_v == 0) {
              return;
            } else {
              L1: {
                if (0 == ((sk) this).field_I) {
                  var2_int = 0;
                  var3 = 0;
                  var3 = 0;
                  L2: while (true) {
                    if (~var3 <= ~((sk) this).field_s.length) {
                      if (var2_int == 0) {
                        return;
                      } else {
                        var2_int = ns.a(false, var2_int, vv.field_b) + 1;
                        var3 = 0;
                        var3 = 0;
                        L3: while (true) {
                          L4: {
                            if (var3 >= ((sk) this).field_s.length) {
                              break L4;
                            } else {
                              if (0 >= var2_int) {
                                break L4;
                              } else {
                                L5: {
                                  if (null == ((sk) this).field_s[var3]) {
                                    break L5;
                                  } else {
                                    if (((sk) this).field_s[var3].field_D == 0) {
                                      var2_int--;
                                      break L5;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                                var3++;
                                continue L3;
                              }
                            }
                          }
                          ((sk) this).field_s[var3 - 1].a(2, (byte) -108);
                          ((sk) this).field_s[var3 + -1].a(0, 30, 1, 0, u.field_o[((sk) this).field_c][0], pk.field_T[((sk) this).field_c][0], (byte) 122);
                          ((sk) this).field_s[var3 + -1].field_d = true;
                          ((sk) this).field_i[0].a(1, (byte) -109);
                          ((sk) this).field_i[0].a(0, 30, 1, 20, u.field_o[((sk) this).field_a][1], pk.field_T[((sk) this).field_a][1], (byte) 122);
                          ((sk) this).field_v = ((sk) this).field_v - 1;
                          ((sk) this).field_I = 20 + ns.a(false, 20, vv.field_b);
                          break L1;
                        }
                      }
                    } else {
                      L6: {
                        if (((sk) this).field_s[var3] == null) {
                          break L6;
                        } else {
                          if (((sk) this).field_s[var3].field_D != 0) {
                            break L6;
                          } else {
                            var2_int++;
                            break L6;
                          }
                        }
                      }
                      var3++;
                      continue L2;
                    }
                  }
                } else {
                  ((sk) this).field_I = ((sk) this).field_I - 1;
                  break L1;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "sk.IA(" + 105 + ')');
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
                field_G = null;
                break L1;
              }
            }
            jm.field_g = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "sk.M(" + param0 + ')');
        }
    }

    private final boolean a(byte param0, int param1, lf[] param2, int param3, lf[] param4) {
        int[] var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_2_0 = 0;
        int stackIn_181_0 = 0;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_185_0 = 0;
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
            if (param1 != 2) {
              L1: {
                if (param1 == 1) {
                  L2: {
                    if (null == param4[0]) {
                      break L2;
                    } else {
                      if (param4[0].field_d) {
                        break L2;
                      } else {
                        if (!param4[0].b(2166)) {
                          break L2;
                        } else {
                          L3: {
                            L4: {
                              if (param2[0] == null) {
                                break L4;
                              } else {
                                if (!param2[0].field_d) {
                                  break L3;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            if (param3 != 0) {
                              break L2;
                            } else {
                              if (null == param2[1]) {
                                break L2;
                              } else {
                                if (param2[1].field_d) {
                                  break L2;
                                } else {
                                  if (param2[1].b(2166)) {
                                    break L3;
                                  } else {
                                    break L2;
                                  }
                                }
                              }
                            }
                          }
                          var6[var7] = 0;
                          var7++;
                          break L2;
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
                        L5: {
                          L6: {
                            if (param2[0] == null) {
                              break L6;
                            } else {
                              if (param2[0].field_d) {
                                break L6;
                              } else {
                                if (param2[0].b(2166)) {
                                  break L5;
                                } else {
                                  break L6;
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
                                  break L5;
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
                } else {
                  if (0 != param1) {
                    break L1;
                  } else {
                    L7: {
                      if (null == param4[0]) {
                        break L7;
                      } else {
                        if (param4[0].field_d) {
                          break L7;
                        } else {
                          if (param4[0].b(2166)) {
                            L8: {
                              L9: {
                                if (param2[0] == null) {
                                  break L9;
                                } else {
                                  if (param2[0].field_d) {
                                    break L9;
                                  } else {
                                    if (param2[0].b(2166)) {
                                      break L8;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                              }
                              if (1 != param3) {
                                break L7;
                              } else {
                                if (null == param2[1]) {
                                  break L7;
                                } else {
                                  if (param2[1].field_d) {
                                    break L7;
                                  } else {
                                    if (param2[1].b(2166)) {
                                      break L8;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                            }
                            var6[var7] = 0;
                            var7++;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    L10: {
                      if (param4[1] == null) {
                        break L10;
                      } else {
                        if (param4[1].field_d) {
                          break L10;
                        } else {
                          if (!param4[1].b(2166)) {
                            break L10;
                          } else {
                            L11: {
                              L12: {
                                if (param3 == 0) {
                                  break L12;
                                } else {
                                  if (param2[0] == null) {
                                    break L12;
                                  } else {
                                    if (param2[0].field_d) {
                                      break L12;
                                    } else {
                                      if (param2[0].b(2166)) {
                                        break L11;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                }
                              }
                              if (param3 != 0) {
                                break L10;
                              } else {
                                if (null == param2[1]) {
                                  break L10;
                                } else {
                                  if (param2[1].field_d) {
                                    break L10;
                                  } else {
                                    if (!param2[1].b(2166)) {
                                      break L10;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                              }
                            }
                            var6[var7] = 1;
                            var7++;
                            break L10;
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
                          L13: {
                            L14: {
                              if (param3 != 2) {
                                break L14;
                              } else {
                                if (param2[0] == null) {
                                  break L14;
                                } else {
                                  if (param2[0].field_d) {
                                    break L14;
                                  } else {
                                    if (param2[0].b(2166)) {
                                      break L13;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                              }
                            }
                            L15: {
                              if (param3 != 1) {
                                break L15;
                              } else {
                                if (param2[1] == null) {
                                  break L15;
                                } else {
                                  if (param2[1].field_d) {
                                    break L15;
                                  } else {
                                    if (param2[1].b(2166)) {
                                      break L13;
                                    } else {
                                      break L15;
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
                                    break L13;
                                  }
                                }
                              }
                            }
                          }
                          var6[var7] = 2;
                          var7++;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
              if (var7 != 0) {
                var8 = var6[ns.a(false, var7, vv.field_b)];
                param4[var8].field_d = true;
                stackOut_185_0 = 1;
                stackIn_186_0 = stackOut_185_0;
                break L0;
              } else {
                stackOut_180_0 = 0;
                stackIn_181_0 = stackOut_180_0;
                return stackIn_181_0 != 0;
              }
            } else {
              param4[0].field_d = true;
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var6_ref = decompiledCaughtException;
            stackOut_187_0 = (RuntimeException) var6_ref;
            stackOut_187_1 = new StringBuilder().append("sk.T(").append(-93).append(',').append(param1).append(',');
            stackIn_190_0 = stackOut_187_0;
            stackIn_190_1 = stackOut_187_1;
            stackIn_188_0 = stackOut_187_0;
            stackIn_188_1 = stackOut_187_1;
            if (param2 == null) {
              stackOut_190_0 = (RuntimeException) (Object) stackIn_190_0;
              stackOut_190_1 = (StringBuilder) (Object) stackIn_190_1;
              stackOut_190_2 = "null";
              stackIn_191_0 = stackOut_190_0;
              stackIn_191_1 = stackOut_190_1;
              stackIn_191_2 = stackOut_190_2;
              break L16;
            } else {
              stackOut_188_0 = (RuntimeException) (Object) stackIn_188_0;
              stackOut_188_1 = (StringBuilder) (Object) stackIn_188_1;
              stackOut_188_2 = "{...}";
              stackIn_191_0 = stackOut_188_0;
              stackIn_191_1 = stackOut_188_1;
              stackIn_191_2 = stackOut_188_2;
              break L16;
            }
          }
          L17: {
            stackOut_191_0 = (RuntimeException) (Object) stackIn_191_0;
            stackOut_191_1 = ((StringBuilder) (Object) stackIn_191_1).append(stackIn_191_2).append(',').append(param3).append(',');
            stackIn_194_0 = stackOut_191_0;
            stackIn_194_1 = stackOut_191_1;
            stackIn_192_0 = stackOut_191_0;
            stackIn_192_1 = stackOut_191_1;
            if (param4 == null) {
              stackOut_194_0 = (RuntimeException) (Object) stackIn_194_0;
              stackOut_194_1 = (StringBuilder) (Object) stackIn_194_1;
              stackOut_194_2 = "null";
              stackIn_195_0 = stackOut_194_0;
              stackIn_195_1 = stackOut_194_1;
              stackIn_195_2 = stackOut_194_2;
              break L17;
            } else {
              stackOut_192_0 = (RuntimeException) (Object) stackIn_192_0;
              stackOut_192_1 = (StringBuilder) (Object) stackIn_192_1;
              stackOut_192_2 = "{...}";
              stackIn_195_0 = stackOut_192_0;
              stackIn_195_1 = stackOut_192_1;
              stackIn_195_2 = stackOut_192_2;
              break L17;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_195_0, stackIn_195_2 + ')');
        }
        return stackIn_186_0 != 0;
    }

    private final void a(boolean param0, lf[] param1, byte param2, int param3, km[] param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int[] var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Object stackIn_30_0 = null;
        lf stackIn_30_1 = null;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        int stackIn_94_0 = 0;
        int stackIn_94_1 = 0;
        RuntimeException stackIn_116_0 = null;
        StringBuilder stackIn_116_1 = null;
        RuntimeException stackIn_118_0 = null;
        StringBuilder stackIn_118_1 = null;
        RuntimeException stackIn_119_0 = null;
        StringBuilder stackIn_119_1 = null;
        String stackIn_119_2 = null;
        RuntimeException stackIn_120_0 = null;
        StringBuilder stackIn_120_1 = null;
        RuntimeException stackIn_122_0 = null;
        StringBuilder stackIn_122_1 = null;
        RuntimeException stackIn_123_0 = null;
        StringBuilder stackIn_123_1 = null;
        String stackIn_123_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_64_0 = 0;
        int stackOut_64_1 = 0;
        int stackOut_92_0 = 0;
        int stackOut_92_1 = 0;
        Object stackOut_28_0 = null;
        lf stackOut_28_1 = null;
        RuntimeException stackOut_115_0 = null;
        StringBuilder stackOut_115_1 = null;
        RuntimeException stackOut_118_0 = null;
        StringBuilder stackOut_118_1 = null;
        String stackOut_118_2 = null;
        RuntimeException stackOut_116_0 = null;
        StringBuilder stackOut_116_1 = null;
        String stackOut_116_2 = null;
        RuntimeException stackOut_119_0 = null;
        StringBuilder stackOut_119_1 = null;
        RuntimeException stackOut_122_0 = null;
        StringBuilder stackOut_122_1 = null;
        String stackOut_122_2 = null;
        RuntimeException stackOut_120_0 = null;
        StringBuilder stackOut_120_1 = null;
        String stackOut_120_2 = null;
        var12 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            param3 = 0;
            var6_int = 0;
            L1: while (true) {
              if (~param1.length >= ~var6_int) {
                var6_int = 0;
                var7 = new int[param3];
                L2: while (true) {
                  L3: {
                    if (var6_int >= param4.length) {
                      break L3;
                    } else {
                      if (param4[var6_int] == null) {
                        break L3;
                      } else {
                        var6_int++;
                        continue L2;
                      }
                    }
                  }
                  var8 = new int[var6_int];
                  var9 = 0;
                  L4: while (true) {
                    if (~var9 <= ~var6_int) {
                      var6_int = 0;
                      var9 = 0;
                      L5: while (true) {
                        if (~param3 >= ~var9) {
                          param3 = var6_int;
                          var9 = 0;
                          L6: while (true) {
                            if (param3 <= var9) {
                              var9 = 0;
                              L7: while (true) {
                                if (~var8.length >= ~var9) {
                                  var9 = 0;
                                  if (109 == 109) {
                                    L8: {
                                      if (cu.field_a) {
                                        L9: while (true) {
                                          L10: {
                                            if (var8.length > var6_int) {
                                              break L10;
                                            } else {
                                              if (var9 >= param3) {
                                                this.a((byte) 98, 0, 0, 128);
                                                break L8;
                                              } else {
                                                break L10;
                                              }
                                            }
                                          }
                                          stackOut_64_0 = var9;
                                          stackOut_64_1 = param3;
                                          stackIn_66_0 = stackOut_64_0;
                                          stackIn_66_1 = stackOut_64_1;
                                          L11: {
                                            if (stackIn_66_0 >= stackIn_66_1) {
                                              break L11;
                                            } else {
                                              if (param1[var7[var9]] == null) {
                                                var9++;
                                                continue L9;
                                              } else {
                                                break L11;
                                              }
                                            }
                                          }
                                          if (~var9 <= ~param3) {
                                            int incrementValue$9 = var6_int;
                                            var6_int++;
                                            param4[var8[incrementValue$9]].a(param0, -8, true, ((sk) this).field_C);
                                            continue L9;
                                          } else {
                                            if (~var8.length >= ~var6_int) {
                                              int incrementValue$10 = var9;
                                              var9++;
                                              param1[var7[incrementValue$10]].a(((sk) this).field_C, -92, true);
                                              continue L9;
                                            } else {
                                              if (~param1[var7[var9]].field_s <= ~param4[var8[var6_int]].field_d) {
                                                int incrementValue$11 = var9;
                                                var9++;
                                                param1[var7[incrementValue$11]].a(((sk) this).field_C, -91, true);
                                                continue L9;
                                              } else {
                                                int incrementValue$12 = var6_int;
                                                var6_int++;
                                                param4[var8[incrementValue$12]].a(param0, -8, true, ((sk) this).field_C);
                                                continue L9;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        break L8;
                                      }
                                    }
                                    var9 = 0;
                                    var6_int = 0;
                                    L12: while (true) {
                                      L13: {
                                        if (~var6_int > ~var8.length) {
                                          break L13;
                                        } else {
                                          if (~param3 >= ~var9) {
                                            break L0;
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                      stackOut_92_0 = param3;
                                      stackOut_92_1 = var9;
                                      stackIn_94_0 = stackOut_92_0;
                                      stackIn_94_1 = stackOut_92_1;
                                      L14: {
                                        if (stackIn_94_0 <= stackIn_94_1) {
                                          break L14;
                                        } else {
                                          if (param1[var7[var9]] != null) {
                                            break L14;
                                          } else {
                                            var9++;
                                            continue L12;
                                          }
                                        }
                                      }
                                      if (var9 >= param3) {
                                        int incrementValue$13 = var6_int;
                                        var6_int++;
                                        param4[var8[incrementValue$13]].a(param0, -8, false, ((sk) this).field_C);
                                        continue L12;
                                      } else {
                                        if (~var6_int > ~var8.length) {
                                          if (param1[var7[var9]].field_s >= param4[var8[var6_int]].field_d) {
                                            int incrementValue$14 = var9;
                                            var9++;
                                            param1[var7[incrementValue$14]].a(((sk) this).field_C, -70, false);
                                            continue L12;
                                          } else {
                                            int incrementValue$15 = var6_int;
                                            var6_int++;
                                            param4[var8[incrementValue$15]].a(param0, -8, false, ((sk) this).field_C);
                                            continue L12;
                                          }
                                        } else {
                                          int incrementValue$16 = var9;
                                          var9++;
                                          param1[var7[incrementValue$16]].a(((sk) this).field_C, -65, false);
                                          continue L12;
                                        }
                                      }
                                    }
                                  } else {
                                    return;
                                  }
                                } else {
                                  var10 = var9;
                                  var11 = var9 + 1;
                                  L15: while (true) {
                                    if (var11 >= var8.length) {
                                      L16: {
                                        if (var9 == var10) {
                                          break L16;
                                        } else {
                                          var11 = var8[var10];
                                          var8[var10] = var8[var9];
                                          var8[var9] = var11;
                                          break L16;
                                        }
                                      }
                                      var9++;
                                      continue L7;
                                    } else {
                                      L17: {
                                        if (~param4[var8[var10]].field_d > ~param4[var8[var11]].field_d) {
                                          var10 = var11;
                                          break L17;
                                        } else {
                                          break L17;
                                        }
                                      }
                                      var11++;
                                      continue L15;
                                    }
                                  }
                                }
                              }
                            } else {
                              var10 = var9;
                              stackOut_28_0 = null;
                              stackOut_28_1 = param1[var7[var10]];
                              stackIn_30_0 = stackOut_28_0;
                              stackIn_30_1 = stackOut_28_1;
                              L18: {
                                if (stackIn_30_0 == (Object) (Object) stackIn_30_1) {
                                  break L18;
                                } else {
                                  var11 = 1 + var9;
                                  L19: while (true) {
                                    if (var11 >= param3) {
                                      if (var10 == var9) {
                                        break L18;
                                      } else {
                                        var11 = var7[var10];
                                        var7[var10] = var7[var9];
                                        var7[var9] = var11;
                                        break L18;
                                      }
                                    } else {
                                      L20: {
                                        if (null == param1[var7[var11]]) {
                                          break L20;
                                        } else {
                                          if (~param1[var7[var11]].field_s >= ~param1[var7[var10]].field_s) {
                                            break L20;
                                          } else {
                                            var10 = var11;
                                            break L20;
                                          }
                                        }
                                      }
                                      var11++;
                                      continue L19;
                                    }
                                  }
                                }
                              }
                              var9++;
                              continue L6;
                            }
                          }
                        } else {
                          L21: {
                            if (null != param1[var9]) {
                              int incrementValue$17 = var6_int;
                              var6_int++;
                              var7[incrementValue$17] = var9;
                              break L21;
                            } else {
                              break L21;
                            }
                          }
                          var9++;
                          continue L5;
                        }
                      }
                    } else {
                      var8[var9] = var9;
                      var9++;
                      continue L4;
                    }
                  }
                }
              } else {
                param3++;
                var6_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var6 = decompiledCaughtException;
            stackOut_115_0 = (RuntimeException) var6;
            stackOut_115_1 = new StringBuilder().append("sk.FA(").append(param0).append(',');
            stackIn_118_0 = stackOut_115_0;
            stackIn_118_1 = stackOut_115_1;
            stackIn_116_0 = stackOut_115_0;
            stackIn_116_1 = stackOut_115_1;
            if (param1 == null) {
              stackOut_118_0 = (RuntimeException) (Object) stackIn_118_0;
              stackOut_118_1 = (StringBuilder) (Object) stackIn_118_1;
              stackOut_118_2 = "null";
              stackIn_119_0 = stackOut_118_0;
              stackIn_119_1 = stackOut_118_1;
              stackIn_119_2 = stackOut_118_2;
              break L22;
            } else {
              stackOut_116_0 = (RuntimeException) (Object) stackIn_116_0;
              stackOut_116_1 = (StringBuilder) (Object) stackIn_116_1;
              stackOut_116_2 = "{...}";
              stackIn_119_0 = stackOut_116_0;
              stackIn_119_1 = stackOut_116_1;
              stackIn_119_2 = stackOut_116_2;
              break L22;
            }
          }
          L23: {
            stackOut_119_0 = (RuntimeException) (Object) stackIn_119_0;
            stackOut_119_1 = ((StringBuilder) (Object) stackIn_119_1).append(stackIn_119_2).append(',').append(109).append(',').append(param3).append(',');
            stackIn_122_0 = stackOut_119_0;
            stackIn_122_1 = stackOut_119_1;
            stackIn_120_0 = stackOut_119_0;
            stackIn_120_1 = stackOut_119_1;
            if (param4 == null) {
              stackOut_122_0 = (RuntimeException) (Object) stackIn_122_0;
              stackOut_122_1 = (StringBuilder) (Object) stackIn_122_1;
              stackOut_122_2 = "null";
              stackIn_123_0 = stackOut_122_0;
              stackIn_123_1 = stackOut_122_1;
              stackIn_123_2 = stackOut_122_2;
              break L23;
            } else {
              stackOut_120_0 = (RuntimeException) (Object) stackIn_120_0;
              stackOut_120_1 = (StringBuilder) (Object) stackIn_120_1;
              stackOut_120_2 = "{...}";
              stackIn_123_0 = stackOut_120_0;
              stackIn_123_1 = stackOut_120_1;
              stackIn_123_2 = stackOut_120_2;
              break L23;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_123_0, stackIn_123_2 + ')');
        }
    }

    private final void d(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            int discarded$3 = -4925;
            this.a(((sk) this).field_s);
            L1: {
              int discarded$4 = 12579;
              this.b(((sk) this).field_s);
              if (((sk) this).field_F <= 200) {
                break L1;
              } else {
                ((sk) this).field_F = 0;
                ((sk) this).field_n = 8;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "sk.R(" + 29823 + ')');
        }
    }

    public static void c() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_G = null;
            field_M = null;
            field_N = null;
            field_j = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "sk.V(" + -128 + ')');
        }
    }

    public final boolean b(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_11_0 = 0;
        try {
          L0: {
            L1: {
              L2: {
                if (((sk) this).field_n != 8) {
                  break L2;
                } else {
                  L3: {
                    if (null == u.field_p) {
                      break L3;
                    } else {
                      if (u.field_p.field_n != 0) {
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
                  int discarded$2 = 1;
                  eb.a(((sk) this).field_d, ((sk) this).field_c);
                  int discarded$3 = 1;
                  eb.a(((sk) this).field_d, ((sk) this).field_a);
                  break L4;
                } else {
                  break L4;
                }
              }
              stackOut_17_0 = var2_int;
              stackIn_18_0 = stackOut_17_0;
              break L0;
            } else {
              stackOut_11_0 = 0;
              stackIn_12_0 = stackOut_11_0;
              return stackIn_12_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "sk.K(" + param0 + ')');
        }
        return stackIn_18_0 != 0;
    }

    private final void a(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var4 = 34;
            var3_int = 0;
            L1: while (true) {
              L2: {
                if (~((sk) this).field_D.length >= ~var3_int) {
                  break L2;
                } else {
                  if (null == ((sk) this).field_D[var3_int]) {
                    break L2;
                  } else {
                    var3_int++;
                    continue L1;
                  }
                }
              }
              if (~var3_int <= ~((sk) this).field_D.length) {
                return;
              } else {
                ((sk) this).field_D[var3_int] = new km(-u.field_o[((sk) this).field_c][1] + ((sk) this).field_s[param1].field_a, 600 + -pk.field_T[((sk) this).field_c][1], ((sk) this).field_s[param1].field_s, 2, ((sk) this).field_z);
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var3, "sk.MA(" + -84 + ',' + param1 + ')');
        }
    }

    private final void b(lf[] param0) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (param0.length <= var3_int) {
                break L0;
              } else {
                L2: {
                  if (param0[var3_int] == null) {
                    break L2;
                  } else {
                    param0[var3_int].d((byte) 113);
                    break L2;
                  }
                }
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("sk.C(");
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + 12579 + ')');
        }
    }

    private final void l() {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var2_int = ((sk) this).field_y + -((sk) this).field_v;
                var3 = ((sk) this).field_w - ((sk) this).field_O;
                if (0 >= ((sk) this).field_O) {
                  break L2;
                } else {
                  if (((sk) this).field_v > 0) {
                    L3: {
                      if (var2_int <= 0) {
                        break L3;
                      } else {
                        if (0 >= var3) {
                          break L3;
                        } else {
                          if (ns.a(false, ((sk) this).field_O + ((sk) this).field_v, vv.field_b) > ((sk) this).field_v) {
                            if (!this.a((byte) -93, ((sk) this).field_u, ((sk) this).field_s, ((sk) this).field_J, ((sk) this).field_i)) {
                              break L1;
                            } else {
                              ((sk) this).field_O = ((sk) this).field_O - 1;
                              break L1;
                            }
                          } else {
                            if (!this.a((byte) -93, ((sk) this).field_J, ((sk) this).field_i, ((sk) this).field_u, ((sk) this).field_s)) {
                              break L1;
                            } else {
                              ((sk) this).field_v = ((sk) this).field_v - 1;
                              break L1;
                            }
                          }
                        }
                      }
                    }
                    if (var2_int > 0) {
                      if (!this.a((byte) -93, ((sk) this).field_J, ((sk) this).field_i, ((sk) this).field_u, ((sk) this).field_s)) {
                        break L1;
                      } else {
                        ((sk) this).field_v = ((sk) this).field_v - 1;
                        break L1;
                      }
                    } else {
                      if (var3 > 0) {
                        if (this.a((byte) -93, ((sk) this).field_u, ((sk) this).field_s, ((sk) this).field_J, ((sk) this).field_i)) {
                          ((sk) this).field_O = ((sk) this).field_O - 1;
                          break L1;
                        } else {
                          break L1;
                        }
                      } else {
                        break L1;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
              }
              if (0 < ((sk) this).field_v) {
                if (this.a((byte) -93, ((sk) this).field_J, ((sk) this).field_i, ((sk) this).field_u, ((sk) this).field_s)) {
                  ((sk) this).field_v = ((sk) this).field_v - 1;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                if (((sk) this).field_O > 0) {
                  if (!this.a((byte) -93, ((sk) this).field_u, ((sk) this).field_s, ((sk) this).field_J, ((sk) this).field_i)) {
                    break L1;
                  } else {
                    ((sk) this).field_O = ((sk) this).field_O - 1;
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "sk.PA(" + 49 + ')');
        }
    }

    private final void b(byte param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            ((sk) this).field_A = qc.a(param1, 8806);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var3, "sk.EA(" + 54 + ',' + param1 + ')');
        }
    }

    private final void d() {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            int discarded$5 = 12579;
            this.b(((sk) this).field_s);
            int discarded$6 = 12579;
            this.b(((sk) this).field_i);
            L1: {
              if (((sk) this).field_F != 1) {
                break L1;
              } else {
                L2: {
                  if (null == u.field_p) {
                    break L2;
                  } else {
                    u.field_p.a(-106, ((sk) this).field_t);
                    break L2;
                  }
                }
                int discarded$7 = -387;
                oo.e();
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "sk.NA(" + 126 + ')');
        }
    }

    final void a(int param0, jd param1, int param2, boolean param3, jd param4) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        Object stackIn_32_0 = null;
        Object stackIn_33_0 = null;
        Object stackIn_34_0 = null;
        Object stackIn_35_0 = null;
        Object stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        Object stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        Object stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        Object stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_44_2 = 0;
        Object stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        Object stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        Object stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        int stackIn_47_2 = 0;
        Object stackIn_50_0 = null;
        Object stackIn_51_0 = null;
        Object stackIn_52_0 = null;
        Object stackIn_53_0 = null;
        Object stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        Object stackIn_115_0 = null;
        Object stackIn_116_0 = null;
        Object stackIn_117_0 = null;
        int stackIn_117_1 = 0;
        lf[] stackIn_129_0 = null;
        int stackIn_129_1 = 0;
        lf stackIn_129_2 = null;
        lf stackIn_129_3 = null;
        int stackIn_129_4 = 0;
        int stackIn_129_5 = 0;
        int stackIn_129_6 = 0;
        int stackIn_129_7 = 0;
        boolean stackIn_129_8 = false;
        lf[] stackIn_130_0 = null;
        int stackIn_130_1 = 0;
        lf stackIn_130_2 = null;
        lf stackIn_130_3 = null;
        int stackIn_130_4 = 0;
        int stackIn_130_5 = 0;
        int stackIn_130_6 = 0;
        int stackIn_130_7 = 0;
        boolean stackIn_130_8 = false;
        lf[] stackIn_131_0 = null;
        int stackIn_131_1 = 0;
        lf stackIn_131_2 = null;
        lf stackIn_131_3 = null;
        int stackIn_131_4 = 0;
        int stackIn_131_5 = 0;
        int stackIn_131_6 = 0;
        int stackIn_131_7 = 0;
        boolean stackIn_131_8 = false;
        lf[] stackIn_132_0 = null;
        int stackIn_132_1 = 0;
        lf stackIn_132_2 = null;
        lf stackIn_132_3 = null;
        int stackIn_132_4 = 0;
        int stackIn_132_5 = 0;
        int stackIn_132_6 = 0;
        int stackIn_132_7 = 0;
        boolean stackIn_132_8 = false;
        int stackIn_132_9 = 0;
        lf[] stackIn_133_0 = null;
        int stackIn_133_1 = 0;
        lf stackIn_133_2 = null;
        lf stackIn_133_3 = null;
        int stackIn_133_4 = 0;
        int stackIn_133_5 = 0;
        int stackIn_133_6 = 0;
        int stackIn_133_7 = 0;
        boolean stackIn_133_8 = false;
        int stackIn_133_9 = 0;
        lf[] stackIn_134_0 = null;
        int stackIn_134_1 = 0;
        lf stackIn_134_2 = null;
        lf stackIn_134_3 = null;
        int stackIn_134_4 = 0;
        int stackIn_134_5 = 0;
        int stackIn_134_6 = 0;
        int stackIn_134_7 = 0;
        boolean stackIn_134_8 = false;
        int stackIn_134_9 = 0;
        int stackIn_134_10 = 0;
        lf[] stackIn_135_0 = null;
        int stackIn_135_1 = 0;
        lf stackIn_135_2 = null;
        lf stackIn_135_3 = null;
        int stackIn_135_4 = 0;
        int stackIn_135_5 = 0;
        int stackIn_135_6 = 0;
        int stackIn_135_7 = 0;
        boolean stackIn_135_8 = false;
        int stackIn_135_9 = 0;
        lf[] stackIn_140_0 = null;
        int stackIn_140_1 = 0;
        lf stackIn_140_2 = null;
        lf stackIn_140_3 = null;
        int stackIn_140_4 = 0;
        int stackIn_140_5 = 0;
        int stackIn_140_6 = 0;
        int stackIn_140_7 = 0;
        boolean stackIn_140_8 = false;
        lf[] stackIn_141_0 = null;
        int stackIn_141_1 = 0;
        lf stackIn_141_2 = null;
        lf stackIn_141_3 = null;
        int stackIn_141_4 = 0;
        int stackIn_141_5 = 0;
        int stackIn_141_6 = 0;
        int stackIn_141_7 = 0;
        boolean stackIn_141_8 = false;
        lf[] stackIn_142_0 = null;
        int stackIn_142_1 = 0;
        lf stackIn_142_2 = null;
        lf stackIn_142_3 = null;
        int stackIn_142_4 = 0;
        int stackIn_142_5 = 0;
        int stackIn_142_6 = 0;
        int stackIn_142_7 = 0;
        boolean stackIn_142_8 = false;
        lf[] stackIn_143_0 = null;
        int stackIn_143_1 = 0;
        lf stackIn_143_2 = null;
        lf stackIn_143_3 = null;
        int stackIn_143_4 = 0;
        int stackIn_143_5 = 0;
        int stackIn_143_6 = 0;
        int stackIn_143_7 = 0;
        boolean stackIn_143_8 = false;
        int stackIn_143_9 = 0;
        lf[] stackIn_144_0 = null;
        int stackIn_144_1 = 0;
        lf stackIn_144_2 = null;
        lf stackIn_144_3 = null;
        int stackIn_144_4 = 0;
        int stackIn_144_5 = 0;
        int stackIn_144_6 = 0;
        int stackIn_144_7 = 0;
        boolean stackIn_144_8 = false;
        int stackIn_144_9 = 0;
        lf[] stackIn_145_0 = null;
        int stackIn_145_1 = 0;
        lf stackIn_145_2 = null;
        lf stackIn_145_3 = null;
        int stackIn_145_4 = 0;
        int stackIn_145_5 = 0;
        int stackIn_145_6 = 0;
        int stackIn_145_7 = 0;
        boolean stackIn_145_8 = false;
        int stackIn_145_9 = 0;
        int stackIn_145_10 = 0;
        lf[] stackIn_146_0 = null;
        int stackIn_146_1 = 0;
        lf stackIn_146_2 = null;
        lf stackIn_146_3 = null;
        int stackIn_146_4 = 0;
        int stackIn_146_5 = 0;
        int stackIn_146_6 = 0;
        int stackIn_146_7 = 0;
        boolean stackIn_146_8 = false;
        int stackIn_146_9 = 0;
        Object stackIn_156_0 = null;
        Object stackIn_157_0 = null;
        Object stackIn_158_0 = null;
        int stackIn_158_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        Object stackOut_11_0 = null;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_23_0 = null;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        Object stackOut_31_0 = null;
        Object stackOut_32_0 = null;
        Object stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        Object stackOut_33_0 = null;
        Object stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        Object stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        Object stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        int stackOut_43_2 = 0;
        Object stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        int stackOut_42_2 = 0;
        Object stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        Object stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        int stackOut_46_2 = 0;
        Object stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        int stackOut_45_2 = 0;
        Object stackOut_49_0 = null;
        Object stackOut_50_0 = null;
        Object stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        Object stackOut_51_0 = null;
        Object stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        Object stackOut_114_0 = null;
        Object stackOut_116_0 = null;
        int stackOut_116_1 = 0;
        Object stackOut_115_0 = null;
        int stackOut_115_1 = 0;
        lf[] stackOut_139_0 = null;
        int stackOut_139_1 = 0;
        lf stackOut_139_2 = null;
        lf stackOut_139_3 = null;
        int stackOut_139_4 = 0;
        int stackOut_139_5 = 0;
        int stackOut_139_6 = 0;
        int stackOut_139_7 = 0;
        boolean stackOut_139_8 = false;
        lf[] stackOut_142_0 = null;
        int stackOut_142_1 = 0;
        lf stackOut_142_2 = null;
        lf stackOut_142_3 = null;
        int stackOut_142_4 = 0;
        int stackOut_142_5 = 0;
        int stackOut_142_6 = 0;
        int stackOut_142_7 = 0;
        boolean stackOut_142_8 = false;
        int stackOut_142_9 = 0;
        lf[] stackOut_144_0 = null;
        int stackOut_144_1 = 0;
        lf stackOut_144_2 = null;
        lf stackOut_144_3 = null;
        int stackOut_144_4 = 0;
        int stackOut_144_5 = 0;
        int stackOut_144_6 = 0;
        int stackOut_144_7 = 0;
        boolean stackOut_144_8 = false;
        int stackOut_144_9 = 0;
        int stackOut_144_10 = 0;
        lf[] stackOut_143_0 = null;
        int stackOut_143_1 = 0;
        lf stackOut_143_2 = null;
        lf stackOut_143_3 = null;
        int stackOut_143_4 = 0;
        int stackOut_143_5 = 0;
        int stackOut_143_6 = 0;
        int stackOut_143_7 = 0;
        boolean stackOut_143_8 = false;
        int stackOut_143_9 = 0;
        int stackOut_143_10 = 0;
        lf[] stackOut_145_0 = null;
        int stackOut_145_1 = 0;
        lf stackOut_145_2 = null;
        lf stackOut_145_3 = null;
        int stackOut_145_4 = 0;
        int stackOut_145_5 = 0;
        int stackOut_145_6 = 0;
        int stackOut_145_7 = 0;
        boolean stackOut_145_8 = false;
        int stackOut_145_9 = 0;
        lf[] stackOut_140_0 = null;
        int stackOut_140_1 = 0;
        lf stackOut_140_2 = null;
        lf stackOut_140_3 = null;
        int stackOut_140_4 = 0;
        int stackOut_140_5 = 0;
        int stackOut_140_6 = 0;
        int stackOut_140_7 = 0;
        boolean stackOut_140_8 = false;
        lf[] stackOut_141_0 = null;
        int stackOut_141_1 = 0;
        lf stackOut_141_2 = null;
        lf stackOut_141_3 = null;
        int stackOut_141_4 = 0;
        int stackOut_141_5 = 0;
        int stackOut_141_6 = 0;
        int stackOut_141_7 = 0;
        boolean stackOut_141_8 = false;
        int stackOut_141_9 = 0;
        lf[] stackOut_128_0 = null;
        int stackOut_128_1 = 0;
        lf stackOut_128_2 = null;
        lf stackOut_128_3 = null;
        int stackOut_128_4 = 0;
        int stackOut_128_5 = 0;
        int stackOut_128_6 = 0;
        int stackOut_128_7 = 0;
        boolean stackOut_128_8 = false;
        lf[] stackOut_131_0 = null;
        int stackOut_131_1 = 0;
        lf stackOut_131_2 = null;
        lf stackOut_131_3 = null;
        int stackOut_131_4 = 0;
        int stackOut_131_5 = 0;
        int stackOut_131_6 = 0;
        int stackOut_131_7 = 0;
        boolean stackOut_131_8 = false;
        int stackOut_131_9 = 0;
        lf[] stackOut_133_0 = null;
        int stackOut_133_1 = 0;
        lf stackOut_133_2 = null;
        lf stackOut_133_3 = null;
        int stackOut_133_4 = 0;
        int stackOut_133_5 = 0;
        int stackOut_133_6 = 0;
        int stackOut_133_7 = 0;
        boolean stackOut_133_8 = false;
        int stackOut_133_9 = 0;
        int stackOut_133_10 = 0;
        lf[] stackOut_132_0 = null;
        int stackOut_132_1 = 0;
        lf stackOut_132_2 = null;
        lf stackOut_132_3 = null;
        int stackOut_132_4 = 0;
        int stackOut_132_5 = 0;
        int stackOut_132_6 = 0;
        int stackOut_132_7 = 0;
        boolean stackOut_132_8 = false;
        int stackOut_132_9 = 0;
        int stackOut_132_10 = 0;
        lf[] stackOut_134_0 = null;
        int stackOut_134_1 = 0;
        lf stackOut_134_2 = null;
        lf stackOut_134_3 = null;
        int stackOut_134_4 = 0;
        int stackOut_134_5 = 0;
        int stackOut_134_6 = 0;
        int stackOut_134_7 = 0;
        boolean stackOut_134_8 = false;
        int stackOut_134_9 = 0;
        lf[] stackOut_129_0 = null;
        int stackOut_129_1 = 0;
        lf stackOut_129_2 = null;
        lf stackOut_129_3 = null;
        int stackOut_129_4 = 0;
        int stackOut_129_5 = 0;
        int stackOut_129_6 = 0;
        int stackOut_129_7 = 0;
        boolean stackOut_129_8 = false;
        lf[] stackOut_130_0 = null;
        int stackOut_130_1 = 0;
        lf stackOut_130_2 = null;
        lf stackOut_130_3 = null;
        int stackOut_130_4 = 0;
        int stackOut_130_5 = 0;
        int stackOut_130_6 = 0;
        int stackOut_130_7 = 0;
        boolean stackOut_130_8 = false;
        int stackOut_130_9 = 0;
        Object stackOut_155_0 = null;
        Object stackOut_157_0 = null;
        int stackOut_157_1 = 0;
        Object stackOut_156_0 = null;
        int stackOut_156_1 = 0;
        L0: {
          var9 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (null != ((sk) this).field_x) {
            this.b((byte) 54, ((sk) this).field_x.field_hb);
            break L0;
          } else {
            this.b((byte) 54, 0);
            break L0;
          }
        }
        L1: {
          if (~param1.field_Y < ~param0) {
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 1;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var6_int = stackIn_6_0;
          if (var6_int == 0) {
            break L2;
          } else {
            param2 = 0;
            break L2;
          }
        }
        L3: {
          if (param4.field_Y > param2) {
            stackOut_10_0 = 0;
            stackIn_11_0 = stackOut_10_0;
            break L3;
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            break L3;
          }
        }
        L4: {
          var7 = stackIn_11_0;
          stackOut_11_0 = this;
          stackIn_13_0 = stackOut_11_0;
          stackIn_12_0 = stackOut_11_0;
          if (1 >= bw.field_m[param4.field_N][7]) {
            stackOut_13_0 = this;
            stackOut_13_1 = 0;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            break L4;
          } else {
            stackOut_12_0 = this;
            stackOut_12_1 = 1;
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            break L4;
          }
        }
        L5: {
          ((sk) this).field_d = stackIn_14_1 != 0;
          if (param4.field_N != 34) {
            break L5;
          } else {
            if (!param4.field_W) {
              break L5;
            } else {
              ((sk) this).field_d = true;
              break L5;
            }
          }
        }
        L6: {
          if (param3) {
            break L6;
          } else {
            ((sk) this).field_v = 72;
            break L6;
          }
        }
        L7: {
          if (((sk) this).field_d) {
            param2 = 0;
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          ((sk) this).field_J = bw.field_m[param4.field_N][9];
          stackOut_23_0 = this;
          stackIn_25_0 = stackOut_23_0;
          stackIn_24_0 = stackOut_23_0;
          if (vu.field_N[((sk) this).field_J] * param4.field_Y % param4.field_t <= 0) {
            stackOut_25_0 = this;
            stackOut_25_1 = 0;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            break L8;
          } else {
            stackOut_24_0 = this;
            stackOut_24_1 = 1;
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            break L8;
          }
        }
        L9: {
          ((sk) this).field_y = stackIn_26_1 + param4.field_Y * vu.field_N[((sk) this).field_J] / param4.field_t;
          stackOut_26_0 = this;
          stackOut_26_1 = -((-param2 + param4.field_Y) * vu.field_N[((sk) this).field_J] / param4.field_t);
          stackIn_28_0 = stackOut_26_0;
          stackIn_28_1 = stackOut_26_1;
          stackIn_27_0 = stackOut_26_0;
          stackIn_27_1 = stackOut_26_1;
          if (vu.field_N[((sk) this).field_J] * (param4.field_Y + -param2) % param4.field_t > 0) {
            stackOut_28_0 = this;
            stackOut_28_1 = stackIn_28_1;
            stackOut_28_2 = 1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            stackIn_29_2 = stackOut_28_2;
            break L9;
          } else {
            stackOut_27_0 = this;
            stackOut_27_1 = stackIn_27_1;
            stackOut_27_2 = 0;
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_29_2 = stackOut_27_2;
            break L9;
          }
        }
        L10: {
          ((sk) this).field_v = stackIn_29_1 + (-stackIn_29_2 + ((sk) this).field_y);
          ((sk) this).field_c = param4.field_N;
          if (~((sk) this).field_v >= ~((sk) this).field_y) {
            break L10;
          } else {
            ((sk) this).field_v = ((sk) this).field_y;
            break L10;
          }
        }
        L11: {
          L12: {
            stackOut_31_0 = this;
            stackIn_34_0 = stackOut_31_0;
            stackIn_32_0 = stackOut_31_0;
            if (3 == param4.g(0)) {
              break L12;
            } else {
              stackOut_32_0 = this;
              stackIn_35_0 = stackOut_32_0;
              stackIn_33_0 = stackOut_32_0;
              if (7 != param1.field_N) {
                stackOut_35_0 = this;
                stackOut_35_1 = 0;
                stackIn_36_0 = stackOut_35_0;
                stackIn_36_1 = stackOut_35_1;
                break L11;
              } else {
                stackOut_33_0 = this;
                stackIn_34_0 = stackOut_33_0;
                break L12;
              }
            }
          }
          stackOut_34_0 = this;
          stackOut_34_1 = 1;
          stackIn_36_0 = stackOut_34_0;
          stackIn_36_1 = stackOut_34_1;
          break L11;
        }
        L13: {
          ((sk) this).field_E = stackIn_36_1 != 0;
          if (param1.field_N != 34) {
            break L13;
          } else {
            if (param1.field_W) {
              ((sk) this).field_q = true;
              break L13;
            } else {
              break L13;
            }
          }
        }
        L14: {
          ((sk) this).field_u = bw.field_m[param1.field_N][9];
          stackOut_41_0 = this;
          stackOut_41_1 = param1.field_Y * vu.field_N[((sk) this).field_u] / param1.field_t;
          stackIn_43_0 = stackOut_41_0;
          stackIn_43_1 = stackOut_41_1;
          stackIn_42_0 = stackOut_41_0;
          stackIn_42_1 = stackOut_41_1;
          if (vu.field_N[((sk) this).field_u] * param1.field_Y % param1.field_t <= 0) {
            stackOut_43_0 = this;
            stackOut_43_1 = stackIn_43_1;
            stackOut_43_2 = 0;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            stackIn_44_2 = stackOut_43_2;
            break L14;
          } else {
            stackOut_42_0 = this;
            stackOut_42_1 = stackIn_42_1;
            stackOut_42_2 = 1;
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_44_2 = stackOut_42_2;
            break L14;
          }
        }
        L15: {
          ((sk) this).field_w = stackIn_44_1 + stackIn_44_2;
          stackOut_44_0 = this;
          stackOut_44_1 = ((sk) this).field_w;
          stackIn_46_0 = stackOut_44_0;
          stackIn_46_1 = stackOut_44_1;
          stackIn_45_0 = stackOut_44_0;
          stackIn_45_1 = stackOut_44_1;
          if ((-param0 + param1.field_Y) * vu.field_N[((sk) this).field_u] % param1.field_t <= 0) {
            stackOut_46_0 = this;
            stackOut_46_1 = stackIn_46_1;
            stackOut_46_2 = 0;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            stackIn_47_2 = stackOut_46_2;
            break L15;
          } else {
            stackOut_45_0 = this;
            stackOut_45_1 = stackIn_45_1;
            stackOut_45_2 = 1;
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_47_2 = stackOut_45_2;
            break L15;
          }
        }
        L16: {
          ((sk) this).field_O = stackIn_47_1 - stackIn_47_2 - vu.field_N[((sk) this).field_u] * (param1.field_Y + -param0) / param1.field_t;
          ((sk) this).field_a = param1.field_N;
          if (~((sk) this).field_w <= ~((sk) this).field_O) {
            break L16;
          } else {
            ((sk) this).field_O = ((sk) this).field_w;
            break L16;
          }
        }
        L17: {
          L18: {
            stackOut_49_0 = this;
            stackIn_52_0 = stackOut_49_0;
            stackIn_50_0 = stackOut_49_0;
            if (param1.g(0) == 3) {
              break L18;
            } else {
              stackOut_50_0 = this;
              stackIn_53_0 = stackOut_50_0;
              stackIn_51_0 = stackOut_50_0;
              if (param1.field_N != 7) {
                stackOut_53_0 = this;
                stackOut_53_1 = 0;
                stackIn_54_0 = stackOut_53_0;
                stackIn_54_1 = stackOut_53_1;
                break L17;
              } else {
                stackOut_51_0 = this;
                stackIn_52_0 = stackOut_51_0;
                break L18;
              }
            }
          }
          stackOut_52_0 = this;
          stackOut_52_1 = 1;
          stackIn_54_0 = stackOut_52_0;
          stackIn_54_1 = stackOut_52_1;
          break L17;
        }
        L19: {
          ((sk) this).field_P = stackIn_54_1 != 0;
          if (((sk) this).field_d) {
            L20: {
              if (34 != ((sk) this).field_c) {
                if (param4.g(0) != 3) {
                  L21: {
                    if (((sk) this).field_c == 81) {
                      break L21;
                    } else {
                      if (4 == ((sk) this).field_c) {
                        break L21;
                      } else {
                        if (((sk) this).field_c == 74) {
                          break L21;
                        } else {
                          if (((sk) this).field_c == 67) {
                            ((sk) this).field_z = 3;
                            break L20;
                          } else {
                            if (((sk) this).field_c == 18) {
                              ((sk) this).field_z = 0;
                              break L20;
                            } else {
                              if (((sk) this).field_c != 28) {
                                if (((sk) this).field_c == 3) {
                                  ((sk) this).field_z = 6;
                                  break L20;
                                } else {
                                  break L20;
                                }
                              } else {
                                ((sk) this).field_z = 5;
                                break L20;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  ((sk) this).field_z = 7;
                  break L20;
                } else {
                  ((sk) this).field_z = bw.field_m[param4.field_N][1] + 8;
                  break L20;
                }
              } else {
                ((sk) this).field_z = 2;
                break L20;
              }
            }
            ((sk) this).field_p = ((sk) this).field_O - (-ns.a(false, ((sk) this).field_y, vv.field_b) + -((sk) this).field_y);
            ((sk) this).field_D = new km[((sk) this).field_p];
            ((sk) this).field_b = this.a(((sk) this).field_w, (byte) -127);
            ((sk) this).field_n = 5;
            if (var6_int != 0) {
              ((sk) this).field_L = 7;
              break L19;
            } else {
              ((sk) this).field_L = 8;
              break L19;
            }
          } else {
            ((sk) this).field_n = 1;
            if (var6_int == 0) {
              if (var7 != 0) {
                ((sk) this).field_L = 3;
                break L19;
              } else {
                ((sk) this).field_L = 4;
                break L19;
              }
            } else {
              ((sk) this).field_L = 2;
              break L19;
            }
          }
        }
        L22: {
          L23: {
            L24: {
              fn.a(((sk) this).field_d, ((sk) this).field_c, -32596);
              fn.a(((sk) this).field_d, ((sk) this).field_a, -32596);
              if (param4.field_N == 7) {
                break L24;
              } else {
                if (param4.field_N != 34) {
                  break L23;
                } else {
                  break L24;
                }
              }
            }
            if (!param4.field_W) {
              break L23;
            } else {
              ((sk) this).field_s = new lf[6];
              var8 = 0;
              L25: while (true) {
                if (var8 >= ((sk) this).field_y) {
                  break L22;
                } else {
                  ((sk) this).field_s[1 + var8] = new lf(((sk) this).field_c, true, id.field_d[var8], kr.field_F[var8], false, 0);
                  var8++;
                  continue L25;
                }
              }
            }
          }
          ((sk) this).field_s = new lf[vu.field_N[((sk) this).field_J]];
          break L22;
        }
        L26: {
          L27: {
            L28: {
              if (param1.field_N == 7) {
                break L28;
              } else {
                if (param1.field_N != 34) {
                  break L27;
                } else {
                  break L28;
                }
              }
            }
            if (param1.field_W) {
              ((sk) this).field_i = new lf[6];
              var8 = 0;
              L29: while (true) {
                if (~var8 <= ~((sk) this).field_w) {
                  break L26;
                } else {
                  ((sk) this).field_i[var8 + 1] = new lf(((sk) this).field_a, false, id.field_d[var8], kr.field_F[var8], false, 0);
                  var8++;
                  continue L29;
                }
              }
            } else {
              break L27;
            }
          }
          ((sk) this).field_i = new lf[vu.field_N[((sk) this).field_u]];
          break L26;
        }
        L30: {
          if (param1.field_N != 34) {
            break L30;
          } else {
            if (param1.field_W) {
              L31: {
                ((sk) this).field_w = 1;
                stackOut_114_0 = this;
                stackIn_116_0 = stackOut_114_0;
                stackIn_115_0 = stackOut_114_0;
                if (~(param1.field_Y - -param1.field_A) < ~param0) {
                  stackOut_116_0 = this;
                  stackOut_116_1 = 0;
                  stackIn_117_0 = stackOut_116_0;
                  stackIn_117_1 = stackOut_116_1;
                  break L31;
                } else {
                  stackOut_115_0 = this;
                  stackOut_115_1 = 1;
                  stackIn_117_0 = stackOut_115_0;
                  stackIn_117_1 = stackOut_115_1;
                  break L31;
                }
              }
              L32: {
                ((sk) this).field_O = stackIn_117_1;
                ((sk) this).field_u = 2;
                ((sk) this).field_a = 75;
                if (((sk) this).field_O == 1) {
                  ((sk) this).field_L = 2;
                  break L32;
                } else {
                  break L32;
                }
              }
              ((sk) this).field_q = true;
              break L30;
            } else {
              break L30;
            }
          }
        }
        L33: {
          if (34 != param4.field_N) {
            break L33;
          } else {
            if (!param4.field_W) {
              break L33;
            } else {
              ((sk) this).field_y = 1;
              ((sk) this).field_J = 2;
              ((sk) this).field_c = 75;
              ((sk) this).field_h = true;
              break L33;
            }
          }
        }
        L34: {
          if (((sk) this).field_f) {
            var8 = 0;
            L35: while (true) {
              if (var8 >= ((sk) this).field_y) {
                break L34;
              } else {
                L36: {
                  stackOut_139_0 = ((sk) this).field_s;
                  stackOut_139_1 = var8;
                  stackOut_139_2 = null;
                  stackOut_139_3 = null;
                  stackOut_139_4 = ((sk) this).field_c;
                  stackOut_139_5 = 1;
                  stackOut_139_6 = tn.field_W[((sk) this).field_J][var8];
                  stackOut_139_7 = kw.field_P[((sk) this).field_J][var8];
                  stackOut_139_8 = ((sk) this).field_d;
                  stackIn_142_0 = stackOut_139_0;
                  stackIn_142_1 = stackOut_139_1;
                  stackIn_142_2 = stackOut_139_2;
                  stackIn_142_3 = stackOut_139_3;
                  stackIn_142_4 = stackOut_139_4;
                  stackIn_142_5 = stackOut_139_5;
                  stackIn_142_6 = stackOut_139_6;
                  stackIn_142_7 = stackOut_139_7;
                  stackIn_142_8 = stackOut_139_8;
                  stackIn_140_0 = stackOut_139_0;
                  stackIn_140_1 = stackOut_139_1;
                  stackIn_140_2 = stackOut_139_2;
                  stackIn_140_3 = stackOut_139_3;
                  stackIn_140_4 = stackOut_139_4;
                  stackIn_140_5 = stackOut_139_5;
                  stackIn_140_6 = stackOut_139_6;
                  stackIn_140_7 = stackOut_139_7;
                  stackIn_140_8 = stackOut_139_8;
                  if (!((sk) this).field_d) {
                    L37: {
                      stackOut_142_0 = (lf[]) (Object) stackIn_142_0;
                      stackOut_142_1 = stackIn_142_1;
                      stackOut_142_2 = null;
                      stackOut_142_3 = null;
                      stackOut_142_4 = stackIn_142_4;
                      stackOut_142_5 = stackIn_142_5;
                      stackOut_142_6 = stackIn_142_6;
                      stackOut_142_7 = stackIn_142_7;
                      stackOut_142_8 = stackIn_142_8;
                      stackOut_142_9 = 1300;
                      stackIn_144_0 = stackOut_142_0;
                      stackIn_144_1 = stackOut_142_1;
                      stackIn_144_2 = stackOut_142_2;
                      stackIn_144_3 = stackOut_142_3;
                      stackIn_144_4 = stackOut_142_4;
                      stackIn_144_5 = stackOut_142_5;
                      stackIn_144_6 = stackOut_142_6;
                      stackIn_144_7 = stackOut_142_7;
                      stackIn_144_8 = stackOut_142_8;
                      stackIn_144_9 = stackOut_142_9;
                      stackIn_143_0 = stackOut_142_0;
                      stackIn_143_1 = stackOut_142_1;
                      stackIn_143_2 = stackOut_142_2;
                      stackIn_143_3 = stackOut_142_3;
                      stackIn_143_4 = stackOut_142_4;
                      stackIn_143_5 = stackOut_142_5;
                      stackIn_143_6 = stackOut_142_6;
                      stackIn_143_7 = stackOut_142_7;
                      stackIn_143_8 = stackOut_142_8;
                      stackIn_143_9 = stackOut_142_9;
                      if (param3) {
                        stackOut_144_0 = (lf[]) (Object) stackIn_144_0;
                        stackOut_144_1 = stackIn_144_1;
                        stackOut_144_2 = null;
                        stackOut_144_3 = null;
                        stackOut_144_4 = stackIn_144_4;
                        stackOut_144_5 = stackIn_144_5;
                        stackOut_144_6 = stackIn_144_6;
                        stackOut_144_7 = stackIn_144_7;
                        stackOut_144_8 = stackIn_144_8;
                        stackOut_144_9 = stackIn_144_9;
                        stackOut_144_10 = 0;
                        stackIn_145_0 = stackOut_144_0;
                        stackIn_145_1 = stackOut_144_1;
                        stackIn_145_2 = stackOut_144_2;
                        stackIn_145_3 = stackOut_144_3;
                        stackIn_145_4 = stackOut_144_4;
                        stackIn_145_5 = stackOut_144_5;
                        stackIn_145_6 = stackOut_144_6;
                        stackIn_145_7 = stackOut_144_7;
                        stackIn_145_8 = stackOut_144_8;
                        stackIn_145_9 = stackOut_144_9;
                        stackIn_145_10 = stackOut_144_10;
                        break L37;
                      } else {
                        stackOut_143_0 = (lf[]) (Object) stackIn_143_0;
                        stackOut_143_1 = stackIn_143_1;
                        stackOut_143_2 = null;
                        stackOut_143_3 = null;
                        stackOut_143_4 = stackIn_143_4;
                        stackOut_143_5 = stackIn_143_5;
                        stackOut_143_6 = stackIn_143_6;
                        stackOut_143_7 = stackIn_143_7;
                        stackOut_143_8 = stackIn_143_8;
                        stackOut_143_9 = stackIn_143_9;
                        stackOut_143_10 = 1;
                        stackIn_145_0 = stackOut_143_0;
                        stackIn_145_1 = stackOut_143_1;
                        stackIn_145_2 = stackOut_143_2;
                        stackIn_145_3 = stackOut_143_3;
                        stackIn_145_4 = stackOut_143_4;
                        stackIn_145_5 = stackOut_143_5;
                        stackIn_145_6 = stackOut_143_6;
                        stackIn_145_7 = stackOut_143_7;
                        stackIn_145_8 = stackOut_143_8;
                        stackIn_145_9 = stackOut_143_9;
                        stackIn_145_10 = stackOut_143_10;
                        break L37;
                      }
                    }
                    stackOut_145_0 = (lf[]) (Object) stackIn_145_0;
                    stackOut_145_1 = stackIn_145_1;
                    stackOut_145_2 = null;
                    stackOut_145_3 = null;
                    stackOut_145_4 = stackIn_145_4;
                    stackOut_145_5 = stackIn_145_5;
                    stackOut_145_6 = stackIn_145_6;
                    stackOut_145_7 = stackIn_145_7;
                    stackOut_145_8 = stackIn_145_8;
                    stackOut_145_9 = stackIn_145_9 - -ns.a(stackIn_145_10 != 0, 700, vv.field_b);
                    stackIn_146_0 = stackOut_145_0;
                    stackIn_146_1 = stackOut_145_1;
                    stackIn_146_2 = stackOut_145_2;
                    stackIn_146_3 = stackOut_145_3;
                    stackIn_146_4 = stackOut_145_4;
                    stackIn_146_5 = stackOut_145_5;
                    stackIn_146_6 = stackOut_145_6;
                    stackIn_146_7 = stackOut_145_7;
                    stackIn_146_8 = stackOut_145_8;
                    stackIn_146_9 = stackOut_145_9;
                    break L36;
                  } else {
                    stackOut_140_0 = (lf[]) (Object) stackIn_140_0;
                    stackOut_140_1 = stackIn_140_1;
                    stackOut_140_2 = null;
                    stackOut_140_3 = null;
                    stackOut_140_4 = stackIn_140_4;
                    stackOut_140_5 = stackIn_140_5;
                    stackOut_140_6 = stackIn_140_6;
                    stackOut_140_7 = stackIn_140_7;
                    stackOut_140_8 = stackIn_140_8;
                    stackIn_141_0 = stackOut_140_0;
                    stackIn_141_1 = stackOut_140_1;
                    stackIn_141_2 = stackOut_140_2;
                    stackIn_141_3 = stackOut_140_3;
                    stackIn_141_4 = stackOut_140_4;
                    stackIn_141_5 = stackOut_140_5;
                    stackIn_141_6 = stackOut_140_6;
                    stackIn_141_7 = stackOut_140_7;
                    stackIn_141_8 = stackOut_140_8;
                    stackOut_141_0 = (lf[]) (Object) stackIn_141_0;
                    stackOut_141_1 = stackIn_141_1;
                    stackOut_141_2 = null;
                    stackOut_141_3 = null;
                    stackOut_141_4 = stackIn_141_4;
                    stackOut_141_5 = stackIn_141_5;
                    stackOut_141_6 = stackIn_141_6;
                    stackOut_141_7 = stackIn_141_7;
                    stackOut_141_8 = stackIn_141_8;
                    stackOut_141_9 = 0;
                    stackIn_146_0 = stackOut_141_0;
                    stackIn_146_1 = stackOut_141_1;
                    stackIn_146_2 = stackOut_141_2;
                    stackIn_146_3 = stackOut_141_3;
                    stackIn_146_4 = stackOut_141_4;
                    stackIn_146_5 = stackOut_141_5;
                    stackIn_146_6 = stackOut_141_6;
                    stackIn_146_7 = stackOut_141_7;
                    stackIn_146_8 = stackOut_141_8;
                    stackIn_146_9 = stackOut_141_9;
                    break L36;
                  }
                }
                stackIn_146_0[stackIn_146_1] = new lf(stackIn_146_4, stackIn_146_5 != 0, stackIn_146_6, stackIn_146_7, stackIn_146_8, stackIn_146_9);
                var8++;
                continue L35;
              }
            }
          } else {
            var8 = 0;
            L38: while (true) {
              if (((sk) this).field_y <= var8) {
                break L34;
              } else {
                L39: {
                  stackOut_128_0 = ((sk) this).field_s;
                  stackOut_128_1 = var8;
                  stackOut_128_2 = null;
                  stackOut_128_3 = null;
                  stackOut_128_4 = ((sk) this).field_c;
                  stackOut_128_5 = 1;
                  stackOut_128_6 = tn.field_W[((sk) this).field_J][var8];
                  stackOut_128_7 = kw.field_P[((sk) this).field_J][var8];
                  stackOut_128_8 = ((sk) this).field_d;
                  stackIn_131_0 = stackOut_128_0;
                  stackIn_131_1 = stackOut_128_1;
                  stackIn_131_2 = stackOut_128_2;
                  stackIn_131_3 = stackOut_128_3;
                  stackIn_131_4 = stackOut_128_4;
                  stackIn_131_5 = stackOut_128_5;
                  stackIn_131_6 = stackOut_128_6;
                  stackIn_131_7 = stackOut_128_7;
                  stackIn_131_8 = stackOut_128_8;
                  stackIn_129_0 = stackOut_128_0;
                  stackIn_129_1 = stackOut_128_1;
                  stackIn_129_2 = stackOut_128_2;
                  stackIn_129_3 = stackOut_128_3;
                  stackIn_129_4 = stackOut_128_4;
                  stackIn_129_5 = stackOut_128_5;
                  stackIn_129_6 = stackOut_128_6;
                  stackIn_129_7 = stackOut_128_7;
                  stackIn_129_8 = stackOut_128_8;
                  if (!((sk) this).field_d) {
                    L40: {
                      stackOut_131_0 = (lf[]) (Object) stackIn_131_0;
                      stackOut_131_1 = stackIn_131_1;
                      stackOut_131_2 = null;
                      stackOut_131_3 = null;
                      stackOut_131_4 = stackIn_131_4;
                      stackOut_131_5 = stackIn_131_5;
                      stackOut_131_6 = stackIn_131_6;
                      stackOut_131_7 = stackIn_131_7;
                      stackOut_131_8 = stackIn_131_8;
                      stackOut_131_9 = 1300;
                      stackIn_133_0 = stackOut_131_0;
                      stackIn_133_1 = stackOut_131_1;
                      stackIn_133_2 = stackOut_131_2;
                      stackIn_133_3 = stackOut_131_3;
                      stackIn_133_4 = stackOut_131_4;
                      stackIn_133_5 = stackOut_131_5;
                      stackIn_133_6 = stackOut_131_6;
                      stackIn_133_7 = stackOut_131_7;
                      stackIn_133_8 = stackOut_131_8;
                      stackIn_133_9 = stackOut_131_9;
                      stackIn_132_0 = stackOut_131_0;
                      stackIn_132_1 = stackOut_131_1;
                      stackIn_132_2 = stackOut_131_2;
                      stackIn_132_3 = stackOut_131_3;
                      stackIn_132_4 = stackOut_131_4;
                      stackIn_132_5 = stackOut_131_5;
                      stackIn_132_6 = stackOut_131_6;
                      stackIn_132_7 = stackOut_131_7;
                      stackIn_132_8 = stackOut_131_8;
                      stackIn_132_9 = stackOut_131_9;
                      if (param3) {
                        stackOut_133_0 = (lf[]) (Object) stackIn_133_0;
                        stackOut_133_1 = stackIn_133_1;
                        stackOut_133_2 = null;
                        stackOut_133_3 = null;
                        stackOut_133_4 = stackIn_133_4;
                        stackOut_133_5 = stackIn_133_5;
                        stackOut_133_6 = stackIn_133_6;
                        stackOut_133_7 = stackIn_133_7;
                        stackOut_133_8 = stackIn_133_8;
                        stackOut_133_9 = stackIn_133_9;
                        stackOut_133_10 = 0;
                        stackIn_134_0 = stackOut_133_0;
                        stackIn_134_1 = stackOut_133_1;
                        stackIn_134_2 = stackOut_133_2;
                        stackIn_134_3 = stackOut_133_3;
                        stackIn_134_4 = stackOut_133_4;
                        stackIn_134_5 = stackOut_133_5;
                        stackIn_134_6 = stackOut_133_6;
                        stackIn_134_7 = stackOut_133_7;
                        stackIn_134_8 = stackOut_133_8;
                        stackIn_134_9 = stackOut_133_9;
                        stackIn_134_10 = stackOut_133_10;
                        break L40;
                      } else {
                        stackOut_132_0 = (lf[]) (Object) stackIn_132_0;
                        stackOut_132_1 = stackIn_132_1;
                        stackOut_132_2 = null;
                        stackOut_132_3 = null;
                        stackOut_132_4 = stackIn_132_4;
                        stackOut_132_5 = stackIn_132_5;
                        stackOut_132_6 = stackIn_132_6;
                        stackOut_132_7 = stackIn_132_7;
                        stackOut_132_8 = stackIn_132_8;
                        stackOut_132_9 = stackIn_132_9;
                        stackOut_132_10 = 1;
                        stackIn_134_0 = stackOut_132_0;
                        stackIn_134_1 = stackOut_132_1;
                        stackIn_134_2 = stackOut_132_2;
                        stackIn_134_3 = stackOut_132_3;
                        stackIn_134_4 = stackOut_132_4;
                        stackIn_134_5 = stackOut_132_5;
                        stackIn_134_6 = stackOut_132_6;
                        stackIn_134_7 = stackOut_132_7;
                        stackIn_134_8 = stackOut_132_8;
                        stackIn_134_9 = stackOut_132_9;
                        stackIn_134_10 = stackOut_132_10;
                        break L40;
                      }
                    }
                    stackOut_134_0 = (lf[]) (Object) stackIn_134_0;
                    stackOut_134_1 = stackIn_134_1;
                    stackOut_134_2 = null;
                    stackOut_134_3 = null;
                    stackOut_134_4 = stackIn_134_4;
                    stackOut_134_5 = stackIn_134_5;
                    stackOut_134_6 = stackIn_134_6;
                    stackOut_134_7 = stackIn_134_7;
                    stackOut_134_8 = stackIn_134_8;
                    stackOut_134_9 = stackIn_134_9 + ns.a(stackIn_134_10 != 0, 700, vv.field_b);
                    stackIn_135_0 = stackOut_134_0;
                    stackIn_135_1 = stackOut_134_1;
                    stackIn_135_2 = stackOut_134_2;
                    stackIn_135_3 = stackOut_134_3;
                    stackIn_135_4 = stackOut_134_4;
                    stackIn_135_5 = stackOut_134_5;
                    stackIn_135_6 = stackOut_134_6;
                    stackIn_135_7 = stackOut_134_7;
                    stackIn_135_8 = stackOut_134_8;
                    stackIn_135_9 = stackOut_134_9;
                    break L39;
                  } else {
                    stackOut_129_0 = (lf[]) (Object) stackIn_129_0;
                    stackOut_129_1 = stackIn_129_1;
                    stackOut_129_2 = null;
                    stackOut_129_3 = null;
                    stackOut_129_4 = stackIn_129_4;
                    stackOut_129_5 = stackIn_129_5;
                    stackOut_129_6 = stackIn_129_6;
                    stackOut_129_7 = stackIn_129_7;
                    stackOut_129_8 = stackIn_129_8;
                    stackIn_130_0 = stackOut_129_0;
                    stackIn_130_1 = stackOut_129_1;
                    stackIn_130_2 = stackOut_129_2;
                    stackIn_130_3 = stackOut_129_3;
                    stackIn_130_4 = stackOut_129_4;
                    stackIn_130_5 = stackOut_129_5;
                    stackIn_130_6 = stackOut_129_6;
                    stackIn_130_7 = stackOut_129_7;
                    stackIn_130_8 = stackOut_129_8;
                    stackOut_130_0 = (lf[]) (Object) stackIn_130_0;
                    stackOut_130_1 = stackIn_130_1;
                    stackOut_130_2 = null;
                    stackOut_130_3 = null;
                    stackOut_130_4 = stackIn_130_4;
                    stackOut_130_5 = stackIn_130_5;
                    stackOut_130_6 = stackIn_130_6;
                    stackOut_130_7 = stackIn_130_7;
                    stackOut_130_8 = stackIn_130_8;
                    stackOut_130_9 = 0;
                    stackIn_135_0 = stackOut_130_0;
                    stackIn_135_1 = stackOut_130_1;
                    stackIn_135_2 = stackOut_130_2;
                    stackIn_135_3 = stackOut_130_3;
                    stackIn_135_4 = stackOut_130_4;
                    stackIn_135_5 = stackOut_130_5;
                    stackIn_135_6 = stackOut_130_6;
                    stackIn_135_7 = stackOut_130_7;
                    stackIn_135_8 = stackOut_130_8;
                    stackIn_135_9 = stackOut_130_9;
                    break L39;
                  }
                }
                stackIn_135_0[stackIn_135_1] = new lf(stackIn_135_4, stackIn_135_5 != 0, stackIn_135_6, stackIn_135_7, stackIn_135_8, stackIn_135_9);
                var8++;
                continue L38;
              }
            }
          }
        }
        L41: {
          if (((sk) this).field_o) {
            var8 = 0;
            L42: while (true) {
              if (~((sk) this).field_w >= ~var8) {
                break L41;
              } else {
                ((sk) this).field_i[var8] = new lf(((sk) this).field_a, false, tn.field_W[((sk) this).field_u][var8], kw.field_P[((sk) this).field_u][var8], ((sk) this).field_d, 0);
                var8++;
                continue L42;
              }
            }
          } else {
            var8 = 0;
            L43: while (true) {
              if (var8 >= ((sk) this).field_w) {
                break L41;
              } else {
                ((sk) this).field_i[var8] = new lf(((sk) this).field_a, false, tn.field_W[((sk) this).field_u][var8], kw.field_P[((sk) this).field_u][var8], ((sk) this).field_d, 0);
                var8++;
                continue L43;
              }
            }
          }
        }
        L44: {
          stackOut_155_0 = this;
          stackIn_157_0 = stackOut_155_0;
          stackIn_156_0 = stackOut_155_0;
          if (~((sk) this).field_u > ~((sk) this).field_J) {
            stackOut_157_0 = this;
            stackOut_157_1 = ((sk) this).field_J;
            stackIn_158_0 = stackOut_157_0;
            stackIn_158_1 = stackOut_157_1;
            break L44;
          } else {
            stackOut_156_0 = this;
            stackOut_156_1 = ((sk) this).field_u;
            stackIn_158_0 = stackOut_156_0;
            stackIn_158_1 = stackOut_156_1;
            break L44;
          }
        }
        L45: {
          ((sk) this).field_C = stackIn_158_1;
          if (((sk) this).field_v != 0) {
            break L45;
          } else {
            if (((sk) this).field_O != 0) {
              break L45;
            } else {
              if (!((sk) this).field_d) {
                ((sk) this).field_m = true;
                break L45;
              } else {
                break L45;
              }
            }
          }
        }
        L46: {
          if (!((sk) this).field_d) {
            break L46;
          } else {
            if (((sk) this).field_f) {
              ((sk) this).field_n = 6;
              this.h(1);
              break L46;
            } else {
              break L46;
            }
          }
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
        ((sk) this).field_I = 60;
        ((sk) this).field_F = 0;
        ((sk) this).field_z = 1;
        try {
          L0: {
            L1: {
              ((sk) this).field_k = param2;
              ((sk) this).field_x = param0;
              if (((sk) this).field_x == null) {
                break L1;
              } else {
                ((sk) this).field_r = param0.field_v;
                ((sk) this).field_l = new int[2];
                ((sk) this).field_x = param0;
                break L1;
              }
            }
            L2: {
              if (param1 != null) {
                ((sk) this).field_B = param1;
                if (null == u.field_p) {
                  u.field_p = new sr(rs.field_k, se.field_a, param1);
                  break L2;
                } else {
                  u.field_p.field_k = ((sk) this).field_B;
                  break L2;
                }
              } else {
                break L2;
              }
            }
            ((sk) this).field_H = new wk(640, 480);
            var4 = cb.field_a[ns.a(false, cb.field_a.length, vv.field_b)];
            hh.a(-16147, 50, var4, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) runtimeException;
            stackOut_14_1 = new StringBuilder().append("sk.<init>(");
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L3;
            }
          }
          L4: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L4;
            }
          }
          L5: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L5;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L5;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = "Yes";
    }
}
