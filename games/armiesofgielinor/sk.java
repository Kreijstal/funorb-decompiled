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
                if ((-this.field_J + 3 ^ -1) >= (var2_int ^ -1)) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    if (this.field_s[var2_int] == null) {
                      break L3;
                    } else {
                      if (!this.field_s[var2_int].b((byte) 44)) {
                        break L3;
                      } else {
                        this.field_s[var2_int].field_m = ns.a(false, 20, vv.field_b);
                        this.field_s[var2_int].field_f = 1;
                        break L3;
                      }
                    }
                  }
                  var2_int++;
                  continue L2;
                }
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
        RuntimeException stackIn_148_0 = null;
        StringBuilder stackIn_148_1 = null;
        RuntimeException stackIn_149_0 = null;
        StringBuilder stackIn_149_1 = null;
        String stackIn_149_2 = null;
        StringBuilder stackIn_152_1 = null;
        StringBuilder stackIn_153_1 = null;
        String stackIn_153_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var6 = new int[-param1 + 3];
            var7 = 0;
            if ((param1 ^ -1) == -3) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if ((param1 ^ -1) == -2) {
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
                            if (-1 != (param2 ^ -1)) {
                              break L3;
                            } else {
                              if (param3[1] != null) {
                                break L2;
                              } else {
                                break L3;
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
                        var6[var7] = 1;
                        var7++;
                        break L1;
                      }
                    }
                  }
                } else {
                  if (-1 != (param1 ^ -1)) {
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
                            var6[var7] = 0;
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
                            if (-1 != (param2 ^ -1)) {
                              break L9;
                            } else {
                              if (null == param3[1]) {
                                break L9;
                              } else {
                                break L7;
                              }
                            }
                          }
                          var6[var7] = 1;
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
                          if (-3 != (param2 ^ -1)) {
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
                          if ((param2 ^ -1) != -1) {
                            break L12;
                          } else {
                            if (param3[2] != null) {
                              break L1;
                            } else {
                              break L12;
                            }
                          }
                        }
                        var6[var7] = 2;
                        var7++;
                        break L1;
                      }
                    }
                  }
                }
              }
              if (var7 != 0) {
                L13: {
                  var8 = -1;
                  if (param4) {
                    break L13;
                  } else {
                    this.field_C = -127;
                    break L13;
                  }
                }
                L14: {
                  L15: {
                    var9 = var6[ns.a(false, var7, vv.field_b)];
                    if (1 != param1) {
                      break L15;
                    } else {
                      if (param0[2] == null) {
                        var8 = 2;
                        break L14;
                      } else {
                        break L15;
                      }
                    }
                  }
                  if ((param1 ^ -1) == -1) {
                    if ((var9 ^ -1) == -3) {
                      if (null != param0[4]) {
                        if (0 != param1) {
                          break L14;
                        } else {
                          if (param0[3] != null) {
                            break L14;
                          } else {
                            var8 = 3;
                            break L14;
                          }
                        }
                      } else {
                        var8 = 4;
                        break L14;
                      }
                    } else {
                      if (param0[3] != null) {
                        if (param1 != 0) {
                          break L14;
                        } else {
                          if (param0[4] != null) {
                            break L14;
                          } else {
                            var8 = 4;
                            break L14;
                          }
                        }
                      } else {
                        var8 = 3;
                        break L14;
                      }
                    }
                  } else {
                    break L14;
                  }
                }
                L16: {
                  if (var8 <= -1) {
                    break L16;
                  } else {
                    param0[var8] = param0[var9];
                    param0[var9] = null;
                    param0[var8].field_j = tn.field_W[param1][var8];
                    param0[var8].field_p = kw.field_P[param1][var8];
                    break L16;
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var6_ref = decompiledCaughtException;
            stackIn_148_0 = (RuntimeException) (var6_ref);

            stackIn_148_1 = new StringBuilder().append("sk.B(");

            if (param0 == null) {
              stackIn_149_0 = (RuntimeException) ((Object) stackIn_148_0);
              stackIn_149_1 = (StringBuilder) ((Object) stackIn_148_1);
              stackIn_149_2 = "null";
              break L17;
            } else {
              stackIn_149_0 = (RuntimeException) ((Object) stackIn_148_0);
              stackIn_149_1 = (StringBuilder) ((Object) stackIn_148_1);
              stackIn_149_2 = "{...}";
              break L17;
            }
          }
          L18: {


            stackIn_152_1 = ((StringBuilder) (Object) stackIn_149_1).append(stackIn_149_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_149_0 = (RuntimeException) ((Object) stackIn_149_0);
              stackIn_153_1 = (StringBuilder) ((Object) stackIn_152_1);
              stackIn_153_2 = "null";
              break L18;
            } else {
              stackIn_149_0 = (RuntimeException) ((Object) stackIn_149_0);
              stackIn_153_1 = (StringBuilder) ((Object) stackIn_152_1);
              stackIn_153_2 = "{...}";
              break L18;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_149_0), stackIn_153_2 + ',' + param4 + ')');
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
        int var4 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
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
              if ((var3_int ^ -1) <= (param0.length ^ -1)) {
                break L0;
              } else {
                L3: {
                  if (null == param0[var3_int]) {
                    break L3;
                  } else {
                    if (!param0[var3_int].b((byte) 121)) {
                      break L3;
                    } else {
                      param0[var3_int].field_f = 5;
                      param0[var3_int].field_m = ns.a(false, 20, vv.field_b);
                      break L3;
                    }
                  }
                }
                var3_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3);

            stackIn_19_1 = new StringBuilder().append("sk.GA(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, lf[] param1, byte param2) {
        int incrementValue$1 = 0;
        lf stackIn_11_0 = null;
        Object stackIn_20_0 = null;
        lf stackIn_20_1 = null;
        Object stackIn_26_0 = null;
        lf stackIn_26_1 = null;
        lf stackIn_41_0 = null;
        Object stackIn_52_0 = null;
        lf stackIn_52_1 = null;
        lf stackIn_55_0 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_62_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = ArmiesOfGielinor.field_M ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param2 == 83) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        param0 = 0;
                        var4_int = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((var4_int ^ -1) <= (param1.length ^ -1)) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        param0++;
                        var4_int++;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var4_int = 0;
                        var5 = new int[param0];
                        var6 = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var6 >= param1.length) {
                            statePc = 17;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_55_0 = param1[var6];
                        stackIn_11_0 = stackIn_55_0;
                        if (false) {
                            statePc = 55;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (stackIn_11_0 != null) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        incrementValue$1 = var4_int;
                        var4_int++;
                        var5[incrementValue$1] = var6;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var6++;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        param0 = var4_int;
                        var6 = 0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (param0 <= var6) {
                            statePc = 37;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var7 = var6;
                        stackIn_52_0 = null;
                        stackIn_20_0 = stackIn_52_0;
                        stackIn_52_1 = param1[var5[var7]];
                        stackIn_20_1 = stackIn_52_1;
                        if (false) {
                            statePc = 52;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (stackIn_20_0 == stackIn_20_1) {
                            statePc = 36;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var8 = var6 + 1;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var8 >= param0) {
                            statePc = 34;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackIn_52_0 = null;
                        stackIn_26_0 = stackIn_52_0;
                        stackIn_52_1 = param1[var5[var8]];
                        stackIn_26_1 = stackIn_52_1;
                        if (false) {
                            statePc = 52;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (stackIn_26_0 == stackIn_26_1) {
                            statePc = 33;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if ((param1[var5[var8]].field_s ^ -1) >= (param1[var5[var7]].field_s ^ -1)) {
                            statePc = 33;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var7 = var8;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var8++;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (var7 == var6) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var8 = var5[var7];
                        var5[var7] = var5[var6];
                        var5[var6] = var8;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var6++;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (!cu.field_a) {
                            statePc = 48;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var6 = 0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (var6 >= param0) {
                            statePc = 47;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackIn_55_0 = param1[var5[var6]];
                        stackIn_41_0 = stackIn_55_0;
                        if (false) {
                            statePc = 55;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (stackIn_41_0 == null) {
                            statePc = 46;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        param1[var5[var6]].a(this.field_C, -84, true);
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var6++;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        this.a((byte) 104, 0, 0, 128);
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var6 = 0;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if ((param0 ^ -1) >= (var6 ^ -1)) {
                            statePc = 63;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackIn_52_0 = null;
                        stackIn_52_1 = param1[var5[var6]];
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (stackIn_52_0 == stackIn_52_1) {
                            statePc = 56;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        stackIn_55_0 = param1[var5[var6]];
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        ((lf) (Object) stackIn_55_0).a(this.field_C, param2 ^ -56, false);
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var6++;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 58: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_61_0 = (RuntimeException) (var4);
                    stackIn_59_0 = stackIn_61_0;
                    stackIn_61_1 = new StringBuilder().append("sk.F(").append(param0).append(',');
                    stackIn_59_1 = stackIn_61_1;
                    if (param1 == null) {
                        statePc = 61;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    stackIn_62_0 = (RuntimeException) ((Object) stackIn_59_0);
                    stackIn_62_1 = (StringBuilder) ((Object) stackIn_59_1);
                    stackIn_62_2 = "{...}";
                    statePc = 62;
                    continue stateLoop;
                }
                case 61: {
                    stackIn_62_0 = (RuntimeException) ((Object) stackIn_61_0);
                    stackIn_62_1 = (StringBuilder) ((Object) stackIn_61_1);
                    stackIn_62_2 = "null";
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    throw ig.a((Throwable) ((Object) stackIn_62_0), stackIn_62_2 + ',' + param2 + ')');
                }
                case 63: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final boolean b(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_7_0 = false;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null != u.field_p) {
              if (param0 < -25) {
                stackIn_7_0 = u.field_p.a((byte) -106);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 1;
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
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_32_0 = 0;
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        Object stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        Object stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int stackIn_41_2 = 0;
        Object stackIn_54_0 = null;
        Object stackIn_56_0 = null;
        Object stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        Object stackIn_66_0 = null;
        Object stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        Object stackIn_70_0 = null;
        Object stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        Object stackIn_84_0 = null;
        Object stackIn_86_0 = null;
        Object stackIn_87_0 = null;
        int stackIn_87_1 = 0;
        Object stackIn_189_0 = null;
        Object stackIn_190_0 = null;
        int stackIn_190_1 = 0;
        lf[] stackIn_201_0;
        int stackIn_201_1;
        lf stackIn_201_2;
        lf stackIn_201_3;
        int stackIn_201_4;
        int stackIn_201_5;
        int stackIn_201_6;
        int stackIn_201_7;
        boolean stackIn_201_8;
        lf[] stackIn_202_0;
        int stackIn_202_1;
        lf stackIn_202_2;
        lf stackIn_202_3;
        int stackIn_202_4;
        int stackIn_202_5;
        int stackIn_202_6;
        int stackIn_202_7;
        boolean stackIn_202_8;
        int stackIn_202_9;
        lf[] stackIn_210_0;
        int stackIn_210_1;
        lf stackIn_210_2;
        lf stackIn_210_3;
        int stackIn_210_4;
        int stackIn_210_5;
        int stackIn_210_6;
        int stackIn_210_7;
        boolean stackIn_210_8;
        lf[] stackIn_211_0;
        int stackIn_211_1;
        lf stackIn_211_2;
        lf stackIn_211_3;
        int stackIn_211_4;
        int stackIn_211_5;
        int stackIn_211_6;
        int stackIn_211_7;
        boolean stackIn_211_8;
        int stackIn_211_9;
        Object stackIn_227_0 = null;
        Object stackIn_228_0 = null;
        int stackIn_228_1 = 0;
        int stackIn_259_0 = 0;
        RuntimeException stackIn_263_0 = null;
        StringBuilder stackIn_263_1 = null;
        RuntimeException stackIn_264_0 = null;
        StringBuilder stackIn_264_1 = null;
        String stackIn_264_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        ag var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        jd var6 = null;
        String var6_ref = null;
        jd var7 = null;
        int var8 = 0;
        String var8_ref_String = null;
        int var9 = 0;
        int var10 = 0;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (1 == param0.field_m) {
                L2: {
                  var3 = (ag) ((Object) param0);
                  var4 = this.field_x.field_v * var3.field_G + var3.field_Q;
                  var5 = var3.field_F + (var4 + var3.field_B * this.field_x.field_v);
                  stackIn_7_0 = this;

                  if (var3.field_B * var3.field_B + var3.field_F * var3.field_F <= 1) {
                    stackIn_8_0 = this;
                    stackIn_8_1 = 0;
                    break L2;
                  } else {
                    stackIn_8_0 = this;
                    stackIn_8_1 = 1;
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
                            var6 = this.field_x.field_Eb[var4].field_c;
                            var7 = this.field_x.field_Eb[var5].field_c;
                            if (var6 == null) {
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
                                  var8 = var6.field_A + var6.field_Y;
                                  var9 = var6.field_t - -var6.field_A;
                                  this.field_e = var6.field_O;
                                  this.field_J = bw.field_m[var6.field_N][9];
                                  stackIn_36_0 = this;

                                  if (0 < vu.field_N[this.field_J] * var8 % var9) {
                                    stackIn_37_0 = this;
                                    stackIn_37_1 = 1;
                                    break L5;
                                  } else {
                                    stackIn_37_0 = this;
                                    stackIn_37_1 = 0;
                                    break L5;
                                  }
                                }
                                L6: {
                                  ((sk) (this)).field_y = stackIn_37_1 + var8 * vu.field_N[this.field_J] / var9;
                                  stackIn_40_0 = this;

                                  stackIn_40_1 = this.field_y + -(vu.field_N[this.field_J] * (var8 + -var3.field_R) / var9);

                                  if (-1 > ((-var3.field_R + var8) * vu.field_N[this.field_J] % var9 ^ -1)) {
                                    stackIn_41_0 = this;
                                    stackIn_41_1 = stackIn_40_1;
                                    stackIn_41_2 = 1;
                                    break L6;
                                  } else {
                                    stackIn_41_0 = this;
                                    stackIn_41_1 = stackIn_40_1;
                                    stackIn_41_2 = 0;
                                    break L6;
                                  }
                                }
                                L7: {
                                  L8: {
                                    ((sk) (this)).field_v = stackIn_41_1 + -stackIn_41_2;
                                    if (-8 == (var6.field_P ^ -1)) {
                                      break L8;
                                    } else {
                                      if (-9 != (var6.field_P ^ -1)) {
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
                                  this.field_c = var6.field_N;
                                  if (this.field_v <= this.field_y) {
                                    break L9;
                                  } else {
                                    this.field_v = this.field_y;
                                    break L9;
                                  }
                                }
                                L10: {
                                  L11: {
                                    stackIn_54_0 = this;

                                    if (var6.g(0) == 3) {
                                      break L11;
                                    } else {
                                      stackIn_56_0 = this;

                                      if (-8 != (var7.field_N ^ -1)) {
                                        stackIn_57_0 = this;
                                        stackIn_57_1 = 0;
                                        break L10;
                                      } else {
                                        stackIn_54_0 = this;
                                        break L11;
                                      }
                                    }
                                  }
                                  stackIn_57_0 = this;
                                  stackIn_57_1 = 1;
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
                                  stackIn_66_0 = this;

                                  if (-1 <= (vu.field_N[this.field_u] * var8 % var9 ^ -1)) {
                                    stackIn_67_0 = this;
                                    stackIn_67_1 = 0;
                                    break L13;
                                  } else {
                                    stackIn_67_0 = this;
                                    stackIn_67_1 = 1;
                                    break L13;
                                  }
                                }
                                L14: {
                                  ((sk) (this)).field_w = stackIn_67_1 + var8 * vu.field_N[this.field_u] / var9;
                                  stackIn_70_0 = this;

                                  if (0 >= (var8 - var3.field_K) * vu.field_N[this.field_u] % var9) {
                                    stackIn_71_0 = this;
                                    stackIn_71_1 = 0;
                                    break L14;
                                  } else {
                                    stackIn_71_0 = this;
                                    stackIn_71_1 = 1;
                                    break L14;
                                  }
                                }
                                L15: {
                                  L16: {
                                    ((sk) (this)).field_O = -stackIn_71_1 - ((var8 - var3.field_K) * vu.field_N[this.field_u] / var9 - this.field_w);
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
                                    stackIn_84_0 = this;

                                    if ((var7.g(0) ^ -1) == -4) {
                                      break L19;
                                    } else {
                                      stackIn_86_0 = this;

                                      if (7 != var7.field_N) {
                                        stackIn_87_0 = this;
                                        stackIn_87_1 = 0;
                                        break L18;
                                      } else {
                                        stackIn_84_0 = this;
                                        break L19;
                                      }
                                    }
                                  }
                                  stackIn_87_0 = this;
                                  stackIn_87_1 = 1;
                                  break L18;
                                }
                                L20: {
                                  ((sk) (this)).field_P = stackIn_87_1 != 0;
                                  if (this.field_d) {
                                    L21: {
                                      if ((this.field_c ^ -1) != -35) {
                                        if ((var6.g(param1 ^ 57) ^ -1) != -4) {
                                          L22: {
                                            if (this.field_c == 81) {
                                              break L22;
                                            } else {
                                              if (-5 == (this.field_c ^ -1)) {
                                                break L22;
                                              } else {
                                                if ((this.field_c ^ -1) == -75) {
                                                  break L22;
                                                } else {
                                                  if (this.field_c != 67) {
                                                    if ((this.field_c ^ -1) != -19) {
                                                      if ((this.field_c ^ -1) != -29) {
                                                        if (-4 == (this.field_c ^ -1)) {
                                                          this.field_z = 6;
                                                          break L21;
                                                        } else {
                                                          break L21;
                                                        }
                                                      } else {
                                                        this.field_z = 5;
                                                        break L21;
                                                      }
                                                    } else {
                                                      this.field_z = 0;
                                                      break L21;
                                                    }
                                                  } else {
                                                    this.field_z = 3;
                                                    break L21;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          this.field_z = 7;
                                          break L21;
                                        } else {
                                          this.field_z = 8 - -bw.field_m[var6.field_N][1];
                                          break L21;
                                        }
                                      } else {
                                        this.field_z = 2;
                                        break L21;
                                      }
                                    }
                                    this.field_p = this.field_O - (-ns.a(false, this.field_y, vv.field_b) - this.field_y);
                                    this.field_D = new km[this.field_p];
                                    this.field_b = this.a(this.field_w, (byte) -128);
                                    this.field_n = 5;
                                    if (var3.field_M) {
                                      this.field_L = 7;
                                      break L20;
                                    } else {
                                      this.field_L = 8;
                                      break L20;
                                    }
                                  } else {
                                    L23: {
                                      if (!var3.field_M) {
                                        if (!var3.field_N) {
                                          this.field_L = 4;
                                          break L23;
                                        } else {
                                          this.field_L = 3;
                                          break L23;
                                        }
                                      } else {
                                        this.field_L = 2;
                                        break L23;
                                      }
                                    }
                                    this.field_n = 0;
                                    break L20;
                                  }
                                }
                                L24: {
                                  L25: {
                                    fn.a(this.field_d, this.field_c, param1 + -32653);
                                    fn.a(this.field_d, this.field_a, param1 ^ -32619);
                                    if (-35 != (this.field_c ^ -1)) {
                                      break L25;
                                    } else {
                                      if (!var3.field_J) {
                                        break L25;
                                      } else {
                                        this.field_s = new lf[6];
                                        var8 = 0;
                                        L26: while (true) {
                                          if ((this.field_y ^ -1) >= (var8 ^ -1)) {
                                            break L24;
                                          } else {
                                            this.field_s[1 + var8] = new lf(this.field_c, true, id.field_d[var8], kr.field_F[var8], false, 0);
                                            var8++;
                                            continue L26;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  this.field_s = new lf[vu.field_N[this.field_J]];
                                  break L24;
                                }
                                L27: {
                                  if (!this.field_q) {
                                    this.field_i = new lf[vu.field_N[this.field_u]];
                                    break L27;
                                  } else {
                                    this.field_i = new lf[6];
                                    var8 = 0;
                                    L28: while (true) {
                                      if ((this.field_w ^ -1) >= (var8 ^ -1)) {
                                        break L27;
                                      } else {
                                        this.field_i[1 + var8] = new lf(this.field_a, false, id.field_d[var8], kr.field_F[var8], false, 0);
                                        var8++;
                                        continue L28;
                                      }
                                    }
                                  }
                                }
                                L29: {
                                  if ((this.field_c ^ -1) != -35) {
                                    break L29;
                                  } else {
                                    if (!var3.field_J) {
                                      break L29;
                                    } else {
                                      this.field_h = true;
                                      this.field_y = 1;
                                      this.field_c = 75;
                                      this.field_J = 2;
                                      break L29;
                                    }
                                  }
                                }
                                L30: {
                                  if (this.field_q) {
                                    L31: {
                                      this.field_a = 75;
                                      this.field_w = 1;
                                      stackIn_189_0 = this;

                                      if (var7.field_A + var7.field_Y > var3.field_K) {
                                        stackIn_190_0 = this;
                                        stackIn_190_1 = 0;
                                        break L31;
                                      } else {
                                        stackIn_190_0 = this;
                                        stackIn_190_1 = 1;
                                        break L31;
                                      }
                                    }
                                    ((sk) (this)).field_O = stackIn_190_1;
                                    this.field_u = 2;
                                    if (this.field_O == 1) {
                                      this.field_L = 2;
                                      break L30;
                                    } else {
                                      break L30;
                                    }
                                  } else {
                                    break L30;
                                  }
                                }
                                L32: {
                                  if (!this.field_f) {
                                    var8 = 0;
                                    L33: while (true) {
                                      if ((this.field_y ^ -1) >= (var8 ^ -1)) {
                                        break L32;
                                      } else {
                                        L34: {
                                          stackIn_210_0 = this.field_s;

                                          stackIn_210_1 = var8;

                                          stackIn_210_2 = null;

                                          stackIn_210_3 = null;

                                          stackIn_210_4 = this.field_c;

                                          stackIn_210_5 = 1;

                                          stackIn_210_6 = tn.field_W[this.field_J][var8];

                                          stackIn_210_7 = kw.field_P[this.field_J][var8];

                                          stackIn_210_8 = this.field_d;

                                          if (!this.field_d) {
                                            stackIn_211_0 = (lf[]) ((Object) stackIn_210_0);
                                            stackIn_211_1 = stackIn_210_1;
                                            stackIn_211_2 = null;
                                            stackIn_211_3 = null;
                                            stackIn_211_4 = stackIn_210_4;
                                            stackIn_211_5 = stackIn_210_5;
                                            stackIn_211_6 = stackIn_210_6;
                                            stackIn_211_7 = stackIn_210_7;
                                            stackIn_211_8 = stackIn_210_8;
                                            stackIn_211_9 = 1300 - -ns.a(false, 700, vv.field_b);
                                            break L34;
                                          } else {









                                            stackIn_211_0 = (lf[]) ((Object) stackIn_210_0);
                                            stackIn_211_1 = stackIn_210_1;
                                            stackIn_211_2 = null;
                                            stackIn_211_3 = null;
                                            stackIn_211_4 = stackIn_210_4;
                                            stackIn_211_5 = stackIn_210_5;
                                            stackIn_211_6 = stackIn_210_6;
                                            stackIn_211_7 = stackIn_210_7;
                                            stackIn_211_8 = stackIn_210_8;
                                            stackIn_211_9 = 0;
                                            break L34;
                                          }
                                        }
                                        stackIn_211_0[stackIn_211_1] = new lf(stackIn_211_4, stackIn_211_5 != 0, stackIn_211_6, stackIn_211_7, stackIn_211_8, stackIn_211_9);
                                        var8++;
                                        continue L33;
                                      }
                                    }
                                  } else {
                                    var8 = 0;
                                    L35: while (true) {
                                      if (this.field_y <= var8) {
                                        break L32;
                                      } else {
                                        L36: {
                                          stackIn_201_0 = this.field_s;

                                          stackIn_201_1 = var8;

                                          stackIn_201_2 = null;

                                          stackIn_201_3 = null;

                                          stackIn_201_4 = this.field_c;

                                          stackIn_201_5 = 1;

                                          stackIn_201_6 = tn.field_W[this.field_J][var8];

                                          stackIn_201_7 = kw.field_P[this.field_J][var8];

                                          stackIn_201_8 = this.field_d;

                                          if (this.field_d) {
                                            stackIn_202_0 = (lf[]) ((Object) stackIn_201_0);
                                            stackIn_202_1 = stackIn_201_1;
                                            stackIn_202_2 = null;
                                            stackIn_202_3 = null;
                                            stackIn_202_4 = stackIn_201_4;
                                            stackIn_202_5 = stackIn_201_5;
                                            stackIn_202_6 = stackIn_201_6;
                                            stackIn_202_7 = stackIn_201_7;
                                            stackIn_202_8 = stackIn_201_8;
                                            stackIn_202_9 = 0;
                                            break L36;
                                          } else {









                                            stackIn_202_0 = (lf[]) ((Object) stackIn_201_0);
                                            stackIn_202_1 = stackIn_201_1;
                                            stackIn_202_2 = null;
                                            stackIn_202_3 = null;
                                            stackIn_202_4 = stackIn_201_4;
                                            stackIn_202_5 = stackIn_201_5;
                                            stackIn_202_6 = stackIn_201_6;
                                            stackIn_202_7 = stackIn_201_7;
                                            stackIn_202_8 = stackIn_201_8;
                                            stackIn_202_9 = 1300 + ns.a(false, 700, vv.field_b);
                                            break L36;
                                          }
                                        }
                                        stackIn_202_0[stackIn_202_1] = new lf(stackIn_202_4, stackIn_202_5 != 0, stackIn_202_6, stackIn_202_7, stackIn_202_8, stackIn_202_9);
                                        var8++;
                                        continue L35;
                                      }
                                    }
                                  }
                                }
                                L37: {
                                  if (this.field_o) {
                                    var8 = 0;
                                    L38: while (true) {
                                      if ((var8 ^ -1) <= (this.field_w ^ -1)) {
                                        break L37;
                                      } else {
                                        this.field_i[var8] = new lf(this.field_a, false, tn.field_W[this.field_u][var8], kw.field_P[this.field_u][var8], this.field_d, 0);
                                        var8++;
                                        continue L38;
                                      }
                                    }
                                  } else {
                                    var8 = 0;
                                    L39: while (true) {
                                      if ((var8 ^ -1) <= (this.field_w ^ -1)) {
                                        break L37;
                                      } else {
                                        this.field_i[var8] = new lf(this.field_a, false, tn.field_W[this.field_u][var8], kw.field_P[this.field_u][var8], this.field_d, 0);
                                        var8++;
                                        continue L39;
                                      }
                                    }
                                  }
                                }
                                L40: {
                                  stackIn_227_0 = this;

                                  if ((this.field_J ^ -1) < (this.field_u ^ -1)) {
                                    stackIn_228_0 = this;
                                    stackIn_228_1 = this.field_J;
                                    break L40;
                                  } else {
                                    stackIn_228_0 = this;
                                    stackIn_228_1 = this.field_u;
                                    break L40;
                                  }
                                }
                                L41: {
                                  ((sk) (this)).field_C = stackIn_228_1;
                                  if (0 != this.field_v) {
                                    break L41;
                                  } else {
                                    if (0 != this.field_O) {
                                      break L41;
                                    } else {
                                      if (!this.field_d) {
                                        this.field_m = true;
                                        break L41;
                                      } else {
                                        break L41;
                                      }
                                    }
                                  }
                                }
                                L42: {
                                  if (!this.field_d) {
                                    break L42;
                                  } else {
                                    if (this.field_f) {
                                      this.field_n = 6;
                                      this.h(param1 ^ 56);
                                      break L42;
                                    } else {
                                      break L42;
                                    }
                                  }
                                }
                                L43: {
                                  L44: {
                                    if (!this.field_d) {
                                      break L44;
                                    } else {
                                      if (this.field_L == 8) {
                                        this.field_t = var3.field_F + var3.field_Q + this.field_x.field_v * (var3.field_B + var3.field_G);
                                        break L43;
                                      } else {
                                        break L44;
                                      }
                                    }
                                  }
                                  this.field_t = this.field_x.field_v * var3.field_G + var3.field_Q;
                                  break L43;
                                }
                                u.field_p.b(var3.field_G * this.field_x.field_v + var3.field_Q, param1 ^ 65);
                                break L1;
                              }
                            }
                          }
                          L45: {
                            L46: {
                              if (null == var6) {
                                break L46;
                              } else {
                                if (var7 != null) {
                                  break L45;
                                } else {
                                  break L46;
                                }
                              }
                            }
                            var8_ref_String = db.field_d + ": Can see attacker or defender";
                            this.field_x.a(0, var8_ref_String, var3);
                            break L45;
                          }
                          this.field_n = 8;
                          stackIn_32_0 = 0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                var6_ref = db.field_d + ": Attacker or defender off map";
                this.field_x.a(0, var6_ref, var3);
                this.field_n = 8;
                stackIn_19_0 = 0;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                break L1;
              }
            }
            L47: {
              if (param1 == 57) {
                break L47;
              } else {
                this.a((oj) null, (byte) -19);
                break L47;
              }
            }
            this.b(param0, (byte) 32);
            stackIn_259_0 = 1;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L48: {
            var3_ref = decompiledCaughtException;
            stackIn_263_0 = (RuntimeException) (var3_ref);

            stackIn_263_1 = new StringBuilder().append("sk.E(");

            if (param0 == null) {
              stackIn_264_0 = (RuntimeException) ((Object) stackIn_263_0);
              stackIn_264_1 = (StringBuilder) ((Object) stackIn_263_1);
              stackIn_264_2 = "null";
              break L48;
            } else {
              stackIn_264_0 = (RuntimeException) ((Object) stackIn_263_0);
              stackIn_264_1 = (StringBuilder) ((Object) stackIn_263_1);
              stackIn_264_2 = "{...}";
              break L48;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_264_0), stackIn_264_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_19_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_32_0 != 0;
          } else {
            return stackIn_259_0 != 0;
          }
        }
    }

    public final void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
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
              this.field_F = this.field_F + 1;
              if ((this.field_n ^ -1) != -1) {
                if (8 != this.field_n) {
                  if (-2 != (this.field_n ^ -1)) {
                    L3: {
                      if (-3 == (this.field_n ^ -1)) {
                        break L3;
                      } else {
                        if ((this.field_n ^ -1) == -4) {
                          break L3;
                        } else {
                          if (this.field_n == 4) {
                            break L3;
                          } else {
                            if ((this.field_n ^ -1) == -6) {
                              this.c(false);
                              break L2;
                            } else {
                              if (6 != this.field_n) {
                                if (7 != this.field_n) {
                                  break L2;
                                } else {
                                  this.d(29823);
                                  break L2;
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
                } else {
                  this.d((byte) 126);
                  break L2;
                }
              } else {
                this.o(-124);
                break L2;
              }
            }
            var3_int = -77 % ((param1 - -26) / 48);
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_56_0 = (RuntimeException) (var3);

            stackIn_56_1 = new StringBuilder().append("sk.Q(");

            if (param0 == null) {
              stackIn_57_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_57_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackIn_57_2 = "null";
              break L4;
            } else {
              stackIn_57_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_57_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackIn_57_2 = "{...}";
              break L4;
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
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                this.b(-67);
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              if (var2_int >= this.field_D.length) {
                break L0;
              } else {
                L3: {
                  if (var2_int >= this.field_O) {
                    this.field_D[var2_int] = new km(100 + ns.a(false, 600, vv.field_b), 600, ns.a(false, 850, vv.field_b) + 900, ns.a(false, 600, vv.field_b) + 200, this.field_z);
                    break L3;
                  } else {
                    this.field_D[var2_int] = new km(this.field_i[this.field_b[var2_int]].field_a, 600 + -pk.field_T[this.field_a][0], this.field_i[this.field_b[var2_int]].field_s, 200 + ns.a(false, 600, vv.field_b), this.field_z);
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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
        int stackIn_62_0 = 0;
        lf stackIn_79_0 = null;
        int stackIn_91_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            this.b(true);
            var2_int = 1;
            var3 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var3 >= this.field_s.length) {
                    var3 = 0;
                    L4: while (true) {
                      if ((this.field_i.length ^ -1) >= (var3 ^ -1)) {
                        L5: {
                          if (var2_int == 0) {
                            break L5;
                          } else {
                            if ((this.field_v ^ -1) != -1) {
                              break L5;
                            } else {
                              if (-1 != (this.field_O ^ -1)) {
                                break L5;
                              } else {
                                L6: {
                                  if (!this.field_m) {
                                    break L6;
                                  } else {
                                    if (500 >= this.field_F) {
                                      break L5;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                                this.field_F = 0;
                                this.field_n = this.field_L;
                                stackIn_62_0 = 1;
                                decompiledRegionSelector0 = 0;
                                break L0;
                              }
                            }
                          }
                        }
                        if (!this.field_q) {
                          L7: {
                            if (this.field_F % 50 == 0) {
                              this.l(param0 + 58);
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          this.k(13047);
                          break L2;
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
                                  stackIn_79_0 = this.field_i[0];
                                  break L3;
                                } else {
                                  break L2;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        L8: {
                          if (null == this.field_i[var3]) {
                            break L8;
                          } else {
                            L9: {
                              this.field_i[var3].d((byte) 113);
                              if (!this.field_P) {
                                break L9;
                              } else {
                                if (this.field_i[var3].field_e) {
                                  this.field_i[var3].a(0, 30, 0, 10, u.field_o[this.field_a][1], pk.field_T[this.field_a][1], (byte) 122);
                                  this.field_i[var3].field_e = false;
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            if (!this.field_i[var3].field_d) {
                              break L8;
                            } else {
                              if (this.field_i[var3].field_H) {
                                this.field_i[var3] = null;
                                break L8;
                              } else {
                                var2_int = 0;
                                break L8;
                              }
                            }
                          }
                        }
                        var3++;
                        continue L4;
                      }
                    }
                  } else {
                    stackIn_79_0 = this.field_s[var3];

                    L10: {
                      if (stackIn_79_0 != null) {
                        L11: {
                          this.field_s[var3].d((byte) 113);
                          if (!this.field_E) {
                            break L11;
                          } else {
                            if (!this.field_s[var3].field_e) {
                              break L11;
                            } else {
                              this.field_s[var3].a(0, 30, 0, -10, u.field_o[this.field_c][1], pk.field_T[this.field_c][1], (byte) 122);
                              this.field_s[var3].field_e = false;
                              break L11;
                            }
                          }
                        }
                        if (!this.field_s[var3].field_d) {
                          break L10;
                        } else {
                          if (this.field_s[var3].field_H) {
                            this.field_s[var3] = null;
                            break L10;
                          } else {
                            var2_int = 0;
                            break L10;
                          }
                        }
                      } else {
                        break L10;
                      }
                    }
                    var3++;
                    continue L1;
                  }
                }
                ((lf) (Object) stackIn_79_0).a(2, (byte) -101);
                break L2;
              }
              L12: {
                if (param0 == -9) {
                  break L12;
                } else {
                  this.a((oj) null, (byte) 69);
                  break L12;
                }
              }
              stackIn_91_0 = 0;
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
          return stackIn_62_0 != 0;
        } else {
          return stackIn_91_0 != 0;
        }
    }

    private final void f(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        lf stackIn_25_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                  if (var4 >= this.field_y) {
                    if (1 > var2_int) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      this.field_p = this.field_p - 1;
                      var4 = var3[ns.a(false, var2_int, vv.field_b)];
                      stackIn_25_0 = this.field_s[var4];
                      break L3;
                    }
                  } else {
                    stackIn_25_0 = this.field_s[var4];

                    L4: {
                      if (stackIn_25_0 == null) {
                        break L4;
                      } else {
                        if (this.field_s[var4].b((byte) 115)) {
                          var3[var2_int] = var4;
                          var2_int++;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var4++;
                    continue L2;
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
        Object stackIn_4_0 = null;
        lf stackIn_4_1 = null;
        lf stackIn_13_0 = null;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        lf stackIn_97_0 = null;
        lf stackIn_107_0 = null;
        Object stackIn_119_0 = null;
        lf stackIn_119_1 = null;
        int stackIn_130_0 = 0;
        int stackIn_130_1 = 0;
        int stackIn_135_0 = 0;
        int stackIn_135_1 = 0;
        lf stackIn_165_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int statePc = 0;
        Throwable caughtException = null;
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = ArmiesOfGielinor.field_M ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2 = new int[this.field_s.length];
                        var3 = new int[this.field_i.length];
                        var4 = 0;
                        var5 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (this.field_s.length <= var5) {
                            statePc = 10;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_119_0 = null;
                        stackIn_4_0 = stackIn_119_0;
                        stackIn_119_1 = this.field_s[var5];
                        stackIn_4_1 = stackIn_119_1;
                        if (false) {
                            statePc = 119;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (stackIn_4_0 != stackIn_4_1) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        incrementValue$10 = var4;
                        var4++;
                        var2[incrementValue$10] = var5;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var5++;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        this.field_y = var4;
                        var4 = 0;
                        var5 = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (this.field_i.length <= var5) {
                            statePc = 19;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_165_0 = this.field_i[var5];
                        stackIn_13_0 = stackIn_165_0;
                        if (false) {
                            statePc = 165;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (stackIn_13_0 == null) {
                            statePc = 18;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        incrementValue$11 = var4;
                        var4++;
                        var3[incrementValue$11] = var5;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var5++;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        this.field_w = var4;
                        var5 = 0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (this.field_y <= var5) {
                            statePc = 34;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var4 = var5;
                        var6 = 1 + var5;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if ((var6 ^ -1) <= (this.field_y ^ -1)) {
                            statePc = 30;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackIn_31_0 = this.field_s[var2[var6]].field_s;
                        stackIn_24_0 = stackIn_31_0;
                        stackIn_31_1 = this.field_s[var2[var4]].field_s;
                        stackIn_24_1 = stackIn_31_1;
                        if (false) {
                            statePc = 31;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (stackIn_24_0 > stackIn_24_1) {
                            statePc = 28;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var4 = var6;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var6++;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackIn_31_0 = var4;
                        stackIn_31_1 = var5;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (stackIn_31_0 == stackIn_31_1) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var6 = var2[var4];
                        var2[var4] = var2[var5];
                        var2[var5] = var6;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var5++;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var5 = 0;
                        if (param0) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 35: {
                    return;
                }
                case 36: {
                    try {
                        if ((this.field_w ^ -1) >= (var5 ^ -1)) {
                            statePc = 51;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var4 = var5;
                        var6 = var5 - -1;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if ((this.field_w ^ -1) >= (var6 ^ -1)) {
                            statePc = 46;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackIn_47_0 = this.field_i[var3[var4]].field_s ^ -1;
                        stackIn_40_0 = stackIn_47_0;
                        stackIn_47_1 = this.field_i[var3[var6]].field_s ^ -1;
                        stackIn_40_1 = stackIn_47_1;
                        if (false) {
                            statePc = 47;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (stackIn_40_0 > stackIn_40_1) {
                            statePc = 44;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var4 = var6;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var6++;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackIn_47_0 = var5;
                        stackIn_47_1 = var4;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (stackIn_47_0 != stackIn_47_1) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var6 = var3[var4];
                        var3[var4] = var3[var5];
                        var3[var5] = var6;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var5++;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (!cu.field_a) {
                            statePc = 114;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (this.field_f) {
                            statePc = 104;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (this.field_o) {
                            statePc = 94;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var5 = 0;
                        var6 = 0;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if ((this.field_y ^ -1) < (var5 ^ -1)) {
                            statePc = 64;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        stackIn_66_0 = var6;
                        stackIn_61_0 = stackIn_66_0;
                        stackIn_66_1 = this.field_w;
                        stackIn_61_1 = stackIn_66_1;
                        if (false) {
                            statePc = 66;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (stackIn_61_0 >= stackIn_61_1) {
                            statePc = 93;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        stackIn_66_0 = var6 ^ -1;
                        stackIn_66_1 = this.field_w ^ -1;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (stackIn_66_0 <= stackIn_66_1) {
                            statePc = 73;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (this.field_i[var3[var6]] == null) {
                            statePc = 72;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        var6++;
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (var5 >= this.field_y) {
                            statePc = 80;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (null == this.field_s[var2[var5]]) {
                            statePc = 79;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var5++;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (this.field_w > var6) {
                            statePc = 84;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        incrementValue$12 = var5;
                        var5++;
                        this.field_s[var2[incrementValue$12]].a(this.field_C, -91, true);
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if ((this.field_y ^ -1) >= (var5 ^ -1)) {
                            statePc = 92;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if ((this.field_s[var2[var5]].field_s ^ -1) < (this.field_i[var3[var6]].field_s ^ -1)) {
                            statePc = 91;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        incrementValue$13 = var6;
                        var6++;
                        this.field_i[var3[incrementValue$13]].a(this.field_C, -38, true);
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        incrementValue$14 = var5;
                        var5++;
                        this.field_s[var2[incrementValue$14]].a(this.field_C, -106, true);
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        incrementValue$15 = var6;
                        var6++;
                        this.field_i[var3[incrementValue$15]].a(this.field_C, -64, true);
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        var5 = 0;
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        if ((this.field_y ^ -1) >= (var5 ^ -1)) {
                            statePc = 103;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        stackIn_165_0 = this.field_s[var2[var5]];
                        stackIn_97_0 = stackIn_165_0;
                        if (false) {
                            statePc = 165;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if (stackIn_97_0 == null) {
                            statePc = 102;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        this.field_s[var2[var5]].a(this.field_C, -86, true);
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        var5++;
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        var5 = 0;
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        if ((var5 ^ -1) <= (this.field_w ^ -1)) {
                            statePc = 113;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        stackIn_165_0 = this.field_i[var3[var5]];
                        stackIn_107_0 = stackIn_165_0;
                        if (false) {
                            statePc = 165;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        if (stackIn_107_0 != null) {
                            statePc = 111;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        this.field_i[var3[var5]].a(this.field_C, -46, true);
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        var5++;
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        this.a((byte) 114, 0, 0, 128);
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        if (!this.field_f) {
                            statePc = 124;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        var5 = 0;
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        if ((this.field_w ^ -1) >= (var5 ^ -1)) {
                            statePc = 123;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        stackIn_119_0 = null;
                        stackIn_119_1 = this.field_i[var3[var5]];
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        if (stackIn_119_0 != stackIn_119_1) {
                            statePc = 121;
                        } else {
                            statePc = 120;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        this.field_i[var3[var5]].a(this.field_C, -92, false);
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        var5++;
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        statePc = 171;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        if (this.field_o) {
                            statePc = 161;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        var5 = 0;
                        var6 = 0;
                        statePc = 128;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        if ((var5 ^ -1) > (this.field_y ^ -1)) {
                            statePc = 133;
                        } else {
                            statePc = 129;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        stackIn_135_0 = var6;
                        stackIn_130_0 = stackIn_135_0;
                        stackIn_135_1 = this.field_w;
                        stackIn_130_1 = stackIn_135_1;
                        if (false) {
                            statePc = 135;
                        } else {
                            statePc = 130;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        if (stackIn_130_0 >= stackIn_130_1) {
                            statePc = 160;
                        } else {
                            statePc = 131;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        stackIn_135_0 = var5 ^ -1;
                        stackIn_135_1 = this.field_y ^ -1;
                        statePc = 135;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        if (stackIn_135_0 <= stackIn_135_1) {
                            statePc = 141;
                        } else {
                            statePc = 136;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        if (this.field_s[var2[var5]] != null) {
                            statePc = 141;
                        } else {
                            statePc = 137;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        statePc = 139;
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        var5++;
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        if (this.field_w <= var6) {
                            statePc = 147;
                        } else {
                            statePc = 142;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        if (this.field_i[var3[var6]] != null) {
                            statePc = 147;
                        } else {
                            statePc = 143;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        statePc = 145;
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        var6++;
                        statePc = 147;
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        if (this.field_w <= var6) {
                            statePc = 159;
                        } else {
                            statePc = 148;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        if (var5 < this.field_y) {
                            statePc = 154;
                        } else {
                            statePc = 149;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        statePc = 151;
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        incrementValue$16 = var6;
                        var6++;
                        this.field_i[var3[incrementValue$16]].a(this.field_C, -74, false);
                        statePc = 128;
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        if (this.field_s[var2[var5]].field_s > this.field_i[var3[var6]].field_s) {
                            statePc = 158;
                        } else {
                            statePc = 155;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        incrementValue$17 = var6;
                        var6++;
                        this.field_i[var3[incrementValue$17]].a(this.field_C, -120, false);
                        statePc = 128;
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        incrementValue$18 = var5;
                        var5++;
                        this.field_s[var2[incrementValue$18]].a(this.field_C, -65, false);
                        statePc = 128;
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        incrementValue$19 = var5;
                        var5++;
                        this.field_s[var2[incrementValue$19]].a(this.field_C, -52, false);
                        statePc = 128;
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        statePc = 171;
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        var5 = 0;
                        statePc = 162;
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        if ((var5 ^ -1) <= (this.field_y ^ -1)) {
                            statePc = 171;
                        } else {
                            statePc = 163;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        stackIn_165_0 = this.field_s[var2[var5]];
                        statePc = 165;
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        if (stackIn_165_0 != null) {
                            statePc = 167;
                        } else {
                            statePc = 166;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        statePc = 168;
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        this.field_s[var2[var5]].a(this.field_C, -65, false);
                        statePc = 168;
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        var5++;
                        statePc = 162;
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 170: {
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    throw ig.a((Throwable) ((Object) var2_ref), "sk.S(" + param0 + ')');
                }
                case 171: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final boolean a(boolean param0) {
        int stackIn_21_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_38_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var2_int = param0 ? 1 : 0;
            var3 = 0;
            L1: while (true) {
              if ((var3 ^ -1) <= (this.field_i.length ^ -1)) {
                var3 = 0;
                L2: while (true) {
                  if (this.field_D.length <= var3) {
                    if (var2_int != 0) {
                      this.field_F = 0;
                      this.field_n = this.field_L;
                      stackIn_36_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      stackIn_38_0 = 0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    stackIn_21_0 = this.field_D[var3].field_f ^ -1;
                    L3: {
                      if (stackIn_21_0 >= 0) {
                        break L3;
                      } else {
                        var2_int = 0;
                        break L3;
                      }
                    }
                    L4: {
                      if (!this.field_D[var3].b(-103)) {
                        break L4;
                      } else {
                        if ((this.field_O ^ -1) < (var3 ^ -1)) {
                          this.field_i[this.field_b[var3]].field_d = true;
                          this.field_i[this.field_b[var3]].a(2, (byte) -103);
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
                  if (null != this.field_i[var3]) {
                    this.field_i[var3].d((byte) 113);
                    if (!this.field_i[var3].field_d) {
                      break L5;
                    } else {
                      if (!this.field_i[var3].field_H) {
                        var2_int = 0;
                        break L5;
                      } else {
                        this.field_i[var3] = null;
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
          throw ig.a((Throwable) ((Object) var2), "sk.L(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_36_0 != 0;
        } else {
          return stackIn_38_0 != 0;
        }
    }

    private final void f(byte param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        Object stackIn_20_0 = null;
        Object stackIn_20_1 = null;
        Object stackIn_31_0 = null;
        Object stackIn_31_1 = null;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        int stackIn_75_0 = 0;
        int stackIn_75_1 = 0;
        int stackIn_100_0 = 0;
        int stackIn_100_1 = 0;
        int stackIn_124_0 = 0;
        int stackIn_128_0 = 0;
        int stackIn_132_0 = 0;
        int stackIn_168_0 = 0;
        int stackIn_168_1 = 0;
        int stackIn_191_0 = 0;
        int stackIn_195_0 = 0;
        int stackIn_199_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] var2 = null;
        RuntimeException var2_ref = null;
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
        var12 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (this.field_D == null) {
                break L1;
              } else {
                if (0 != this.field_D.length) {
                  var2 = new int[this.field_s.length];
                  var3 = new int[this.field_i.length];
                  var4 = new int[this.field_D.length];
                  var5 = 0;
                  var6 = 0;
                  L2: while (true) {
                    if (this.field_s.length <= var6) {
                      var5 = 0;
                      var6 = 0;
                      L3: while (true) {
                        if (this.field_i.length <= var6) {
                          var5 = 0;
                          var6 = 0;
                          L4: while (true) {
                            if (var6 >= this.field_D.length) {
                              var6 = 0;
                              L5: while (true) {
                                if (this.field_y <= var6) {
                                  var6 = 0;
                                  L6: while (true) {
                                    if ((this.field_w ^ -1) >= (var6 ^ -1)) {
                                      var6 = 0;
                                      L7: while (true) {
                                        if (this.field_p <= var6) {
                                          L8: {
                                            var6 = 0;
                                            var7 = 0;
                                            var8 = 0;
                                            if (!cu.field_a) {
                                              break L8;
                                            } else {
                                              L9: {
                                                if (this.field_o) {
                                                  var7 = this.field_w;
                                                  break L9;
                                                } else {
                                                  break L9;
                                                }
                                              }
                                              L10: {
                                                if (this.field_f) {
                                                  var6 = this.field_y;
                                                  break L10;
                                                } else {
                                                  break L10;
                                                }
                                              }
                                              L11: while (true) {
                                                L12: {
                                                  L13: {
                                                    if ((this.field_y ^ -1) < (var6 ^ -1)) {
                                                      break L13;
                                                    } else {
                                                      stackIn_100_0 = this.field_w ^ -1;

                                                      stackIn_100_1 = var7 ^ -1;

                                                      if (stackIn_100_0 < stackIn_100_1) {
                                                        break L13;
                                                      } else {
                                                        if ((var8 ^ -1) <= (this.field_p ^ -1)) {
                                                          this.a((byte) 94, 0, 0, 128);
                                                          var6 = 0;
                                                          var8 = 0;
                                                          var7 = 0;
                                                          break L8;
                                                        } else {
                                                          break L13;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  stackIn_100_0 = var8 ^ -1;
                                                  stackIn_100_1 = this.field_p ^ -1;
                                                  break L12;
                                                }
                                                L14: {
                                                  if (stackIn_100_0 <= stackIn_100_1) {
                                                    break L14;
                                                  } else {
                                                    if (null == this.field_D[var4[var8]]) {
                                                      var8++;
                                                      break L14;
                                                    } else {
                                                      break L14;
                                                    }
                                                  }
                                                }
                                                L15: {
                                                  if (var6 >= this.field_y) {
                                                    break L15;
                                                  } else {
                                                    if (null != this.field_s[var2[var6]]) {
                                                      break L15;
                                                    } else {
                                                      var6++;
                                                      break L15;
                                                    }
                                                  }
                                                }
                                                L16: {
                                                  if (var7 >= this.field_w) {
                                                    break L16;
                                                  } else {
                                                    if (this.field_i[var3[var7]] == null) {
                                                      var7++;
                                                      break L16;
                                                    } else {
                                                      break L16;
                                                    }
                                                  }
                                                }
                                                L17: {
                                                  if (var8 < this.field_p) {
                                                    stackIn_124_0 = this.field_D[var4[var8]].field_d;
                                                    break L17;
                                                  } else {
                                                    stackIn_124_0 = 100000;
                                                    break L17;
                                                  }
                                                }
                                                L18: {
                                                  var9 = stackIn_124_0;
                                                  if (this.field_y > var6) {
                                                    stackIn_128_0 = this.field_s[var2[var6]].field_s;
                                                    break L18;
                                                  } else {
                                                    stackIn_128_0 = 100000;
                                                    break L18;
                                                  }
                                                }
                                                L19: {
                                                  var10 = stackIn_128_0;
                                                  if (this.field_w <= var7) {
                                                    stackIn_132_0 = 100000;
                                                    break L19;
                                                  } else {
                                                    stackIn_132_0 = this.field_i[var3[var7]].field_s;
                                                    break L19;
                                                  }
                                                }
                                                L20: {
                                                  L21: {
                                                    var11 = stackIn_132_0;
                                                    if ((var11 ^ -1) >= (var9 ^ -1)) {
                                                      break L21;
                                                    } else {
                                                      if (var9 >= var10) {
                                                        break L21;
                                                      } else {
                                                        incrementValue$0 = var8;
                                                        var8++;
                                                        this.field_D[var4[incrementValue$0]].a(true, -8, true, this.field_C);
                                                        break L20;
                                                      }
                                                    }
                                                  }
                                                  if ((var11 ^ -1) >= (var10 ^ -1)) {
                                                    incrementValue$1 = var7;
                                                    var7++;
                                                    this.field_i[var3[incrementValue$1]].a(this.field_C, param0 + -97, true);
                                                    break L20;
                                                  } else {
                                                    incrementValue$2 = var6;
                                                    var6++;
                                                    this.field_s[var2[incrementValue$2]].a(this.field_C, param0 ^ 58, true);
                                                    break L20;
                                                  }
                                                }
                                                continue L11;
                                              }
                                            }
                                          }
                                          L22: {
                                            if (!this.field_f) {
                                              break L22;
                                            } else {
                                              var6 = this.field_y;
                                              break L22;
                                            }
                                          }
                                          L23: {
                                            if (param0 == -15) {
                                              break L23;
                                            } else {
                                              this.b((byte) -125, 8);
                                              break L23;
                                            }
                                          }
                                          L24: {
                                            if (this.field_o) {
                                              var7 = this.field_w;
                                              break L24;
                                            } else {
                                              break L24;
                                            }
                                          }
                                          L25: while (true) {
                                            L26: {
                                              L27: {
                                                if (var6 < this.field_y) {
                                                  break L27;
                                                } else {
                                                  stackIn_168_0 = this.field_w ^ -1;

                                                  stackIn_168_1 = var7 ^ -1;

                                                  if (stackIn_168_0 < stackIn_168_1) {
                                                    break L27;
                                                  } else {
                                                    if (var8 >= this.field_p) {
                                                      decompiledRegionSelector0 = 1;
                                                      break L0;
                                                    } else {
                                                      break L27;
                                                    }
                                                  }
                                                }
                                              }
                                              stackIn_168_0 = this.field_p ^ -1;
                                              stackIn_168_1 = var8 ^ -1;
                                              break L26;
                                            }
                                            L28: {
                                              if (stackIn_168_0 >= stackIn_168_1) {
                                                break L28;
                                              } else {
                                                if (null != this.field_D[var4[var8]]) {
                                                  break L28;
                                                } else {
                                                  var8++;
                                                  break L28;
                                                }
                                              }
                                            }
                                            L29: {
                                              if ((var6 ^ -1) <= (this.field_y ^ -1)) {
                                                break L29;
                                              } else {
                                                if (null == this.field_s[var2[var6]]) {
                                                  var6++;
                                                  break L29;
                                                } else {
                                                  break L29;
                                                }
                                              }
                                            }
                                            L30: {
                                              if ((this.field_w ^ -1) >= (var7 ^ -1)) {
                                                break L30;
                                              } else {
                                                if (this.field_i[var3[var7]] != null) {
                                                  break L30;
                                                } else {
                                                  var7++;
                                                  break L30;
                                                }
                                              }
                                            }
                                            L31: {
                                              if ((this.field_p ^ -1) >= (var8 ^ -1)) {
                                                stackIn_191_0 = 100000;
                                                break L31;
                                              } else {
                                                stackIn_191_0 = this.field_D[var4[var8]].field_d;
                                                break L31;
                                              }
                                            }
                                            L32: {
                                              var9 = stackIn_191_0;
                                              if (var6 >= this.field_y) {
                                                stackIn_195_0 = 100000;
                                                break L32;
                                              } else {
                                                stackIn_195_0 = this.field_s[var2[var6]].field_s;
                                                break L32;
                                              }
                                            }
                                            L33: {
                                              var10 = stackIn_195_0;
                                              if (var7 >= this.field_w) {
                                                stackIn_199_0 = 100000;
                                                break L33;
                                              } else {
                                                stackIn_199_0 = this.field_i[var3[var7]].field_s;
                                                break L33;
                                              }
                                            }
                                            L34: {
                                              L35: {
                                                var11 = stackIn_199_0;
                                                if ((var9 ^ -1) <= (var11 ^ -1)) {
                                                  break L35;
                                                } else {
                                                  if (var10 > var9) {
                                                    incrementValue$3 = var8;
                                                    var8++;
                                                    this.field_D[var4[incrementValue$3]].a(true, -8, false, this.field_C);
                                                    break L34;
                                                  } else {
                                                    break L35;
                                                  }
                                                }
                                              }
                                              if (var10 >= var11) {
                                                incrementValue$4 = var7;
                                                var7++;
                                                this.field_i[var3[incrementValue$4]].a(this.field_C, param0 + -51, false);
                                                break L34;
                                              } else {
                                                incrementValue$5 = var6;
                                                var6++;
                                                this.field_s[var2[incrementValue$5]].a(this.field_C, param0 + -93, false);
                                                break L34;
                                              }
                                            }
                                            continue L25;
                                          }
                                        } else {
                                          var5 = var6;
                                          var7 = 1 + var6;
                                          L36: while (true) {
                                            L37: {
                                              if (var7 >= this.field_p) {
                                                stackIn_75_0 = var5 ^ -1;
                                                stackIn_75_1 = var6 ^ -1;
                                                break L37;
                                              } else {
                                                stackIn_75_0 = this.field_D[var4[var5]].field_d;

                                                stackIn_75_1 = this.field_D[var4[var7]].field_d;

                                                L38: {
                                                  if (stackIn_75_0 >= stackIn_75_1) {
                                                    break L38;
                                                  } else {
                                                    var5 = var7;
                                                    break L38;
                                                  }
                                                }
                                                var7++;
                                                continue L36;
                                              }
                                            }
                                            L39: {
                                              if (stackIn_75_0 != stackIn_75_1) {
                                                var7 = var4[var5];
                                                var4[var5] = var4[var6];
                                                var4[var6] = var7;
                                                break L39;
                                              } else {
                                                break L39;
                                              }
                                            }
                                            var6++;
                                            continue L7;
                                          }
                                        }
                                      }
                                    } else {
                                      var5 = var6;
                                      var7 = 1 + var6;
                                      L40: while (true) {
                                        L41: {
                                          if (var7 >= this.field_w) {
                                            stackIn_61_0 = var6 ^ -1;
                                            stackIn_61_1 = var5 ^ -1;
                                            break L41;
                                          } else {
                                            stackIn_61_0 = this.field_i[var3[var7]].field_s ^ -1;

                                            stackIn_61_1 = this.field_i[var3[var5]].field_s ^ -1;

                                            L42: {
                                              if (stackIn_61_0 < stackIn_61_1) {
                                                var5 = var7;
                                                break L42;
                                              } else {
                                                break L42;
                                              }
                                            }
                                            var7++;
                                            continue L40;
                                          }
                                        }
                                        L43: {
                                          if (stackIn_61_0 == stackIn_61_1) {
                                            break L43;
                                          } else {
                                            var7 = var3[var5];
                                            var3[var5] = var3[var6];
                                            var3[var6] = var7;
                                            break L43;
                                          }
                                        }
                                        var6++;
                                        continue L6;
                                      }
                                    }
                                  }
                                } else {
                                  var5 = var6;
                                  var7 = 1 + var6;
                                  L44: while (true) {
                                    L45: {
                                      if ((var7 ^ -1) <= (this.field_y ^ -1)) {
                                        stackIn_46_0 = var6 ^ -1;
                                        stackIn_46_1 = var5 ^ -1;
                                        break L45;
                                      } else {
                                        stackIn_46_0 = this.field_s[var2[var7]].field_s ^ -1;

                                        stackIn_46_1 = this.field_s[var2[var5]].field_s ^ -1;

                                        L46: {
                                          if (stackIn_46_0 >= stackIn_46_1) {
                                            break L46;
                                          } else {
                                            var5 = var7;
                                            break L46;
                                          }
                                        }
                                        var7++;
                                        continue L44;
                                      }
                                    }
                                    L47: {
                                      if (stackIn_46_0 == stackIn_46_1) {
                                        break L47;
                                      } else {
                                        var7 = var2[var5];
                                        var2[var5] = var2[var6];
                                        var2[var6] = var7;
                                        break L47;
                                      }
                                    }
                                    var6++;
                                    continue L5;
                                  }
                                }
                              }
                            } else {
                              stackIn_31_0 = null;
                              stackIn_31_1 = this;
                              L48: {
                                if (stackIn_31_0 == ((sk) (this)).field_D[var6]) {
                                  break L48;
                                } else {
                                  incrementValue$6 = var5;
                                  var5++;
                                  var4[incrementValue$6] = var6;
                                  break L48;
                                }
                              }
                              var6++;
                              continue L4;
                            }
                          }
                        } else {
                          stackIn_20_0 = null;
                          stackIn_20_1 = this;
                          L49: {
                            if (stackIn_20_0 != ((sk) (this)).field_i[var6]) {
                              incrementValue$7 = var5;
                              var5++;
                              var3[incrementValue$7] = var6;
                              break L49;
                            } else {
                              break L49;
                            }
                          }
                          var6++;
                          continue L3;
                        }
                      }
                    } else {
                      L50: {
                        if (this.field_s[var6] != null) {
                          incrementValue$8 = var5;
                          var5++;
                          var2[incrementValue$8] = var6;
                          break L50;
                        } else {
                          break L50;
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
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2_ref), "sk.AA(" + param0 + ')');
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
        lf stackIn_38_0 = null;
        Object stackIn_51_0 = null;
        lf stackIn_51_1 = null;
        Object stackIn_69_0 = null;
        lf stackIn_69_1 = null;
        Object stackIn_89_0 = null;
        lf stackIn_89_1 = null;
        Object stackIn_112_0 = null;
        lf stackIn_112_1 = null;
        Object stackIn_133_0 = null;
        lf stackIn_133_1 = null;
        lf stackIn_136_0 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int statePc = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = ArmiesOfGielinor.field_M ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (param0 == 13047) {
                        statePc = 4;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    this.a((byte) 42, -38, -15, 53);
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if ((this.field_u ^ -1) != (this.field_J ^ -1)) {
                        statePc = 29;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var2_int = 0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (var2_int >= 3 + -this.field_J) {
                        statePc = 487;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (null == this.field_s[var2_int]) {
                        statePc = 27;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (null == this.field_i[var2_int]) {
                        statePc = 27;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (!this.field_s[var2_int].b((byte) -74)) {
                        statePc = 27;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (!this.field_i[var2_int].b((byte) -110)) {
                        statePc = 27;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (ns.a(false, 1000, vv.field_b) < 500) {
                        statePc = 25;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    this.field_s[var2_int].a(2, (byte) -113);
                    this.field_s[var2_int].field_m = je.field_K[this.field_a][0];
                    this.field_i[var2_int].a(1, (byte) -119);
                    statePc = 27;
                    continue stateLoop;
                }
                case 25: {
                    this.field_s[var2_int].a(1, (byte) -116);
                    this.field_i[var2_int].field_f = 2;
                    this.field_i[var2_int].field_m = je.field_K[this.field_c][0];
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    var2_int++;
                    statePc = 6;
                    continue stateLoop;
                }
                case 29: {
                    if (2 == this.field_J) {
                        statePc = 35;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (-3 != (this.field_u ^ -1)) {
                        statePc = 139;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    var2_int = 1;
                    var3 = 0;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    if ((-this.field_J + 3 ^ -1) >= (var3 ^ -1)) {
                        statePc = 48;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    stackIn_136_0 = this.field_s[var3];
                    stackIn_38_0 = stackIn_136_0;
                    if (false) {
                        statePc = 136;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (stackIn_38_0 == null) {
                        statePc = 47;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (!this.field_s[var3].b((byte) -74)) {
                        statePc = 46;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 46: {
                    var2_int = 0;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    var3++;
                    statePc = 36;
                    continue stateLoop;
                }
                case 48: {
                    var3 = 0;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    if ((var3 ^ -1) <= (-this.field_u + 3 ^ -1)) {
                        statePc = 59;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    stackIn_133_0 = null;
                    stackIn_51_0 = stackIn_133_0;
                    stackIn_133_1 = this.field_i[var3];
                    stackIn_51_1 = stackIn_133_1;
                    if (false) {
                        statePc = 133;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    if (stackIn_51_0 == stackIn_51_1) {
                        statePc = 58;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (this.field_i[var3].b((byte) 30)) {
                        statePc = 58;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    var2_int = 0;
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    var3++;
                    statePc = 49;
                    continue stateLoop;
                }
                case 59: {
                    if (var2_int == 0) {
                        statePc = 487;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    if (-501 >= (ns.a(false, 1000, vv.field_b) ^ -1)) {
                        statePc = 100;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    if ((this.field_J ^ -1) == -3) {
                        statePc = 79;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    var3 = 0;
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    if (var3 >= 3 - this.field_J) {
                        statePc = 84;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    stackIn_89_0 = null;
                    stackIn_69_0 = stackIn_89_0;
                    stackIn_89_1 = this.field_s[var3];
                    stackIn_69_1 = stackIn_89_1;
                    if (false) {
                        statePc = 89;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    if (stackIn_69_0 != stackIn_69_1) {
                        statePc = 73;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 73: {
                    this.field_s[var3].field_f = 1;
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    if (null == this.field_s[var3]) {
                        statePc = 77;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    this.field_s[var3].field_m = ns.a(false, 5, vv.field_b);
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    var3++;
                    statePc = 67;
                    continue stateLoop;
                }
                case 79: {
                    if (null == this.field_s[0]) {
                        statePc = 84;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    this.field_s[0].a(1, (byte) -86);
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    if (2 == this.field_u) {
                        statePc = 94;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    var3 = 0;
                    statePc = 86;
                    continue stateLoop;
                }
                case 86: {
                    if (3 + -this.field_u <= var3) {
                        statePc = 487;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    stackIn_89_0 = null;
                    stackIn_89_1 = this.field_i[var3];
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    if (stackIn_89_0 == stackIn_89_1) {
                        statePc = 92;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    this.field_i[var3].field_f = 2;
                    this.field_i[var3].field_m = je.field_K[this.field_c][0] + -ns.a(false, 5, vv.field_b);
                    statePc = 92;
                    continue stateLoop;
                }
                case 92: {
                    var3++;
                    statePc = 86;
                    continue stateLoop;
                }
                case 94: {
                    if (this.field_i[0] != null) {
                        statePc = 99;
                    } else {
                        statePc = 487;
                    }
                    continue stateLoop;
                }
                case 99: {
                    this.field_i[0].field_f = 2;
                    this.field_i[0].field_m = je.field_K[this.field_c][0];
                    statePc = 487;
                    continue stateLoop;
                }
                case 100: {
                    if ((this.field_J ^ -1) != -3) {
                        statePc = 109;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    if (null == this.field_s[0]) {
                        statePc = 122;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    this.field_s[0].field_f = 2;
                    this.field_s[0].field_m = je.field_K[this.field_a][0];
                    statePc = 122;
                    continue stateLoop;
                }
                case 109: {
                    var3 = 0;
                    statePc = 110;
                    continue stateLoop;
                }
                case 110: {
                    if ((var3 ^ -1) <= (-this.field_J + 3 ^ -1)) {
                        statePc = 122;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    stackIn_133_0 = null;
                    stackIn_112_0 = stackIn_133_0;
                    stackIn_133_1 = this.field_s[var3];
                    stackIn_112_1 = stackIn_133_1;
                    if (false) {
                        statePc = 133;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    if (stackIn_112_0 != stackIn_112_1) {
                        statePc = 116;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 116: {
                    this.field_s[var3].field_f = 2;
                    statePc = 117;
                    continue stateLoop;
                }
                case 117: {
                    if (this.field_s[var3] != null) {
                        statePc = 120;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 120: {
                    this.field_s[var3].field_m = je.field_K[this.field_a][0] + -ns.a(false, 5, vv.field_b);
                    statePc = 121;
                    continue stateLoop;
                }
                case 121: {
                    var3++;
                    statePc = 110;
                    continue stateLoop;
                }
                case 122: {
                    if ((this.field_u ^ -1) != -3) {
                        statePc = 129;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    if (this.field_i[0] != null) {
                        statePc = 128;
                    } else {
                        statePc = 487;
                    }
                    continue stateLoop;
                }
                case 128: {
                    this.field_i[0].a(1, (byte) -122);
                    statePc = 487;
                    continue stateLoop;
                }
                case 129: {
                    var3 = 0;
                    statePc = 130;
                    continue stateLoop;
                }
                case 130: {
                    if ((var3 ^ -1) <= (3 - this.field_u ^ -1)) {
                        statePc = 487;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    stackIn_133_0 = null;
                    stackIn_133_1 = this.field_i[var3];
                    statePc = 133;
                    continue stateLoop;
                }
                case 133: {
                    if (stackIn_133_0 == stackIn_133_1) {
                        statePc = 137;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    this.field_i[var3].field_f = 1;
                    stackIn_136_0 = this.field_i[var3];
                    statePc = 136;
                    continue stateLoop;
                }
                case 136: {
                    stackIn_136_0.field_m = ns.a(false, 5, vv.field_b);
                    statePc = 137;
                    continue stateLoop;
                }
                case 137: {
                    var3++;
                    statePc = 130;
                    continue stateLoop;
                }
                case 139: {
                    if (-1 == (this.field_J ^ -1)) {
                        statePc = 316;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    if (null == this.field_s[0]) {
                        statePc = 203;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    if (!this.field_s[0].b((byte) -61)) {
                        statePc = 203;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    if (null == this.field_i[0]) {
                        statePc = 157;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    if (!this.field_i[0].b((byte) 104)) {
                        statePc = 157;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    if (null == this.field_i[1]) {
                        statePc = 165;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    if (this.field_i[1] == null) {
                        statePc = 203;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    if (this.field_i[1].b((byte) 33)) {
                        statePc = 165;
                    } else {
                        statePc = 203;
                    }
                    continue stateLoop;
                }
                case 165: {
                    if (500 <= ns.a(false, 1000, vv.field_b)) {
                        statePc = 185;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    if (null != this.field_s[0]) {
                        statePc = 171;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 171: {
                    this.field_s[0].field_m = je.field_K[this.field_a][0] + -ns.a(false, 5, vv.field_b);
                    this.field_s[0].field_f = 2;
                    statePc = 172;
                    continue stateLoop;
                }
                case 172: {
                    if (this.field_i[1] == null) {
                        statePc = 179;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 173: {
                    if (!this.field_i[1].b((byte) -80)) {
                        statePc = 179;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    this.field_i[1].field_m = je.field_K[this.field_c][0] + -ns.a(false, 5, vv.field_b);
                    this.field_i[1].field_f = 1;
                    statePc = 203;
                    continue stateLoop;
                }
                case 179: {
                    if (this.field_i[0] == null) {
                        statePc = 203;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 182: {
                    this.field_i[0].field_m = je.field_K[this.field_c][0] - ns.a(false, 5, vv.field_b);
                    this.field_i[0].field_f = 1;
                    statePc = 203;
                    continue stateLoop;
                }
                case 185: {
                    if (this.field_s[0] != null) {
                        statePc = 190;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 190: {
                    this.field_s[0].field_m = ns.a(false, 5, vv.field_b);
                    this.field_s[0].field_f = 1;
                    statePc = 191;
                    continue stateLoop;
                }
                case 191: {
                    if (this.field_i[1] == null) {
                        statePc = 195;
                    } else {
                        statePc = 192;
                    }
                    continue stateLoop;
                }
                case 192: {
                    if (this.field_i[1].b((byte) -56)) {
                        statePc = 201;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 195: {
                    if (null == this.field_i[0]) {
                        statePc = 203;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 198: {
                    this.field_i[0].field_m = je.field_K[this.field_c][0] - ns.a(false, 5, vv.field_b);
                    this.field_i[0].field_f = 2;
                    statePc = 203;
                    continue stateLoop;
                }
                case 201: {
                    this.field_i[1].field_m = je.field_K[this.field_c][0] - ns.a(false, 5, vv.field_b);
                    this.field_i[1].field_f = 2;
                    statePc = 203;
                    continue stateLoop;
                }
                case 203: {
                    if (this.field_s[1] == null) {
                        statePc = 261;
                    } else {
                        statePc = 204;
                    }
                    continue stateLoop;
                }
                case 204: {
                    if (!this.field_s[1].b((byte) -45)) {
                        statePc = 261;
                    } else {
                        statePc = 207;
                    }
                    continue stateLoop;
                }
                case 207: {
                    if (null == this.field_i[0]) {
                        statePc = 216;
                    } else {
                        statePc = 210;
                    }
                    continue stateLoop;
                }
                case 210: {
                    if (!this.field_i[0].b((byte) -90)) {
                        statePc = 216;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 213: {
                    if (this.field_i[1] == null) {
                        statePc = 224;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 216: {
                    if (null == this.field_i[2]) {
                        statePc = 261;
                    } else {
                        statePc = 219;
                    }
                    continue stateLoop;
                }
                case 219: {
                    if (this.field_i[2].b((byte) 29)) {
                        statePc = 224;
                    } else {
                        statePc = 261;
                    }
                    continue stateLoop;
                }
                case 224: {
                    if (ns.a(false, 1000, vv.field_b) < 500) {
                        statePc = 243;
                    } else {
                        statePc = 225;
                    }
                    continue stateLoop;
                }
                case 225: {
                    if (this.field_s[1] == null) {
                        statePc = 230;
                    } else {
                        statePc = 228;
                    }
                    continue stateLoop;
                }
                case 228: {
                    this.field_s[1].field_m = ns.a(false, 5, vv.field_b);
                    this.field_s[1].field_f = 1;
                    statePc = 230;
                    continue stateLoop;
                }
                case 230: {
                    if (this.field_i[2] == null) {
                        statePc = 234;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 231: {
                    if (this.field_i[2].b((byte) -114)) {
                        statePc = 240;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 234: {
                    if (null != this.field_i[0]) {
                        statePc = 239;
                    } else {
                        statePc = 261;
                    }
                    continue stateLoop;
                }
                case 239: {
                    this.field_i[0].field_m = je.field_K[this.field_c][0] + -ns.a(false, 30, vv.field_b);
                    this.field_i[0].field_f = 2;
                    statePc = 261;
                    continue stateLoop;
                }
                case 240: {
                    this.field_i[2].field_m = je.field_K[this.field_c][0] - ns.a(false, 5, vv.field_b);
                    this.field_i[2].field_f = 2;
                    statePc = 261;
                    continue stateLoop;
                }
                case 243: {
                    if (null == this.field_s[1]) {
                        statePc = 248;
                    } else {
                        statePc = 246;
                    }
                    continue stateLoop;
                }
                case 246: {
                    this.field_s[1].field_m = je.field_K[this.field_a][0] - ns.a(false, 5, vv.field_b);
                    this.field_s[1].field_f = 2;
                    statePc = 248;
                    continue stateLoop;
                }
                case 248: {
                    if (null == this.field_i[2]) {
                        statePc = 255;
                    } else {
                        statePc = 249;
                    }
                    continue stateLoop;
                }
                case 249: {
                    if (!this.field_i[2].b((byte) -112)) {
                        statePc = 255;
                    } else {
                        statePc = 252;
                    }
                    continue stateLoop;
                }
                case 252: {
                    this.field_i[2].field_m = ns.a(false, 5, vv.field_b);
                    this.field_i[2].field_f = 1;
                    statePc = 261;
                    continue stateLoop;
                }
                case 255: {
                    if (this.field_i[0] != null) {
                        statePc = 260;
                    } else {
                        statePc = 261;
                    }
                    continue stateLoop;
                }
                case 260: {
                    this.field_i[0].field_m = ns.a(false, 5, vv.field_b);
                    this.field_i[0].field_f = 1;
                    statePc = 261;
                    continue stateLoop;
                }
                case 261: {
                    if (this.field_i[0] == null) {
                        statePc = 487;
                    } else {
                        statePc = 262;
                    }
                    continue stateLoop;
                }
                case 262: {
                    if (!this.field_i[0].b((byte) -70)) {
                        statePc = 487;
                    } else {
                        statePc = 265;
                    }
                    continue stateLoop;
                }
                case 265: {
                    if (this.field_i[1] == null) {
                        statePc = 277;
                    } else {
                        statePc = 268;
                    }
                    continue stateLoop;
                }
                case 268: {
                    if (-1 == this.field_i[1].field_f) {
                        statePc = 277;
                    } else {
                        statePc = 271;
                    }
                    continue stateLoop;
                }
                case 271: {
                    if (null == this.field_i[2]) {
                        statePc = 277;
                    } else {
                        statePc = 274;
                    }
                    continue stateLoop;
                }
                case 274: {
                    if (-1 != this.field_i[2].field_f) {
                        statePc = 301;
                    } else {
                        statePc = 277;
                    }
                    continue stateLoop;
                }
                case 277: {
                    if (this.field_i[1] == null) {
                        statePc = 283;
                    } else {
                        statePc = 280;
                    }
                    continue stateLoop;
                }
                case 280: {
                    if (-1 != this.field_i[1].field_f) {
                        statePc = 295;
                    } else {
                        statePc = 283;
                    }
                    continue stateLoop;
                }
                case 283: {
                    if (this.field_i[2] == null) {
                        statePc = 487;
                    } else {
                        statePc = 286;
                    }
                    continue stateLoop;
                }
                case 286: {
                    if (-1 != this.field_i[2].field_f) {
                        statePc = 291;
                    } else {
                        statePc = 487;
                    }
                    continue stateLoop;
                }
                case 291: {
                    if (null == this.field_i[0]) {
                        statePc = 487;
                    } else {
                        statePc = 292;
                    }
                    continue stateLoop;
                }
                case 292: {
                    this.field_i[0].field_m = this.field_i[2].field_m + ns.a(false, 5, vv.field_b);
                    this.field_i[0].field_f = this.field_i[2].field_f;
                    statePc = 487;
                    continue stateLoop;
                }
                case 295: {
                    if (null != this.field_i[0]) {
                        statePc = 300;
                    } else {
                        statePc = 487;
                    }
                    continue stateLoop;
                }
                case 300: {
                    this.field_i[0].field_m = this.field_i[1].field_m + ns.a(false, 5, vv.field_b);
                    this.field_i[0].field_f = this.field_i[1].field_f;
                    statePc = 487;
                    continue stateLoop;
                }
                case 301: {
                    if (-501 < (ns.a(false, 1000, vv.field_b) ^ -1)) {
                        statePc = 310;
                    } else {
                        statePc = 304;
                    }
                    continue stateLoop;
                }
                case 304: {
                    if (this.field_i[0] != null) {
                        statePc = 309;
                    } else {
                        statePc = 487;
                    }
                    continue stateLoop;
                }
                case 309: {
                    this.field_i[0].field_m = this.field_i[1].field_m + ns.a(false, 5, vv.field_b);
                    this.field_i[0].field_f = this.field_i[1].field_f;
                    statePc = 487;
                    continue stateLoop;
                }
                case 310: {
                    if (null != this.field_i[0]) {
                        statePc = 315;
                    } else {
                        statePc = 487;
                    }
                    continue stateLoop;
                }
                case 315: {
                    this.field_i[0].field_m = this.field_i[2].field_m - -ns.a(false, 5, vv.field_b);
                    this.field_i[0].field_f = this.field_i[2].field_f;
                    statePc = 487;
                    continue stateLoop;
                }
                case 316: {
                    if (this.field_i[0] == null) {
                        statePc = 373;
                    } else {
                        statePc = 319;
                    }
                    continue stateLoop;
                }
                case 319: {
                    if (!this.field_i[0].b((byte) -126)) {
                        statePc = 373;
                    } else {
                        statePc = 322;
                    }
                    continue stateLoop;
                }
                case 322: {
                    if (null == this.field_s[0]) {
                        statePc = 331;
                    } else {
                        statePc = 325;
                    }
                    continue stateLoop;
                }
                case 325: {
                    if (!this.field_s[0].b((byte) 118)) {
                        statePc = 331;
                    } else {
                        statePc = 328;
                    }
                    continue stateLoop;
                }
                case 328: {
                    if (this.field_s[1] == null) {
                        statePc = 339;
                    } else {
                        statePc = 331;
                    }
                    continue stateLoop;
                }
                case 331: {
                    if (this.field_s[1] == null) {
                        statePc = 373;
                    } else {
                        statePc = 334;
                    }
                    continue stateLoop;
                }
                case 334: {
                    if (this.field_s[1].b((byte) 117)) {
                        statePc = 339;
                    } else {
                        statePc = 373;
                    }
                    continue stateLoop;
                }
                case 339: {
                    if ((ns.a(false, 1000, vv.field_b) ^ -1) > -501) {
                        statePc = 359;
                    } else {
                        statePc = 340;
                    }
                    continue stateLoop;
                }
                case 340: {
                    if (this.field_i[0] != null) {
                        statePc = 345;
                    } else {
                        statePc = 346;
                    }
                    continue stateLoop;
                }
                case 345: {
                    this.field_i[0].field_m = ns.a(false, 5, vv.field_b);
                    this.field_i[0].field_f = 1;
                    statePc = 346;
                    continue stateLoop;
                }
                case 346: {
                    if (null == this.field_s[1]) {
                        statePc = 350;
                    } else {
                        statePc = 347;
                    }
                    continue stateLoop;
                }
                case 347: {
                    if (this.field_s[1].b((byte) 126)) {
                        statePc = 356;
                    } else {
                        statePc = 350;
                    }
                    continue stateLoop;
                }
                case 350: {
                    if (null == this.field_s[0]) {
                        statePc = 373;
                    } else {
                        statePc = 353;
                    }
                    continue stateLoop;
                }
                case 353: {
                    this.field_s[0].field_m = je.field_K[this.field_a][0] + -ns.a(false, 5, vv.field_b);
                    this.field_s[0].field_f = 2;
                    statePc = 373;
                    continue stateLoop;
                }
                case 356: {
                    this.field_s[1].field_m = je.field_K[this.field_a][0] + -ns.a(false, 5, vv.field_b);
                    this.field_s[1].field_f = 2;
                    statePc = 373;
                    continue stateLoop;
                }
                case 359: {
                    this.field_i[0].field_m = je.field_K[this.field_c][0] + -ns.a(false, 5, vv.field_b);
                    this.field_i[0].field_f = 2;
                    if (null == this.field_s[1]) {
                        statePc = 365;
                    } else {
                        statePc = 362;
                    }
                    continue stateLoop;
                }
                case 362: {
                    if (this.field_s[1].b((byte) 112)) {
                        statePc = 371;
                    } else {
                        statePc = 365;
                    }
                    continue stateLoop;
                }
                case 365: {
                    if (this.field_s[0] != null) {
                        statePc = 370;
                    } else {
                        statePc = 373;
                    }
                    continue stateLoop;
                }
                case 370: {
                    this.field_s[0].field_m = ns.a(false, 5, vv.field_b);
                    this.field_s[0].field_f = 1;
                    statePc = 373;
                    continue stateLoop;
                }
                case 371: {
                    this.field_s[1].field_m = ns.a(false, 5, vv.field_b);
                    this.field_s[1].field_f = 1;
                    statePc = 373;
                    continue stateLoop;
                }
                case 373: {
                    if (this.field_i[1] == null) {
                        statePc = 431;
                    } else {
                        statePc = 374;
                    }
                    continue stateLoop;
                }
                case 374: {
                    if (!this.field_i[1].b((byte) -109)) {
                        statePc = 431;
                    } else {
                        statePc = 377;
                    }
                    continue stateLoop;
                }
                case 377: {
                    if (null == this.field_s[0]) {
                        statePc = 386;
                    } else {
                        statePc = 380;
                    }
                    continue stateLoop;
                }
                case 380: {
                    if (!this.field_s[0].b((byte) 72)) {
                        statePc = 386;
                    } else {
                        statePc = 383;
                    }
                    continue stateLoop;
                }
                case 383: {
                    if (null == this.field_s[1]) {
                        statePc = 392;
                    } else {
                        statePc = 386;
                    }
                    continue stateLoop;
                }
                case 386: {
                    if (null == this.field_s[2]) {
                        statePc = 431;
                    } else {
                        statePc = 389;
                    }
                    continue stateLoop;
                }
                case 389: {
                    if (!this.field_s[2].b((byte) 99)) {
                        statePc = 431;
                    } else {
                        statePc = 392;
                    }
                    continue stateLoop;
                }
                case 392: {
                    if ((ns.a(false, 1000, vv.field_b) ^ -1) <= -501) {
                        statePc = 414;
                    } else {
                        statePc = 395;
                    }
                    continue stateLoop;
                }
                case 395: {
                    if (null != this.field_i[1]) {
                        statePc = 400;
                    } else {
                        statePc = 401;
                    }
                    continue stateLoop;
                }
                case 400: {
                    this.field_i[1].field_m = je.field_K[this.field_c][0] - ns.a(false, 5, vv.field_b);
                    this.field_i[1].field_f = 2;
                    statePc = 401;
                    continue stateLoop;
                }
                case 401: {
                    if (null == this.field_s[2]) {
                        statePc = 408;
                    } else {
                        statePc = 402;
                    }
                    continue stateLoop;
                }
                case 402: {
                    if (!this.field_s[2].b((byte) -50)) {
                        statePc = 408;
                    } else {
                        statePc = 405;
                    }
                    continue stateLoop;
                }
                case 405: {
                    this.field_s[2].field_m = ns.a(false, 5, vv.field_b);
                    this.field_s[2].field_f = 1;
                    statePc = 431;
                    continue stateLoop;
                }
                case 408: {
                    if (this.field_s[0] == null) {
                        statePc = 431;
                    } else {
                        statePc = 411;
                    }
                    continue stateLoop;
                }
                case 411: {
                    this.field_s[0].field_m = ns.a(false, 5, vv.field_b);
                    this.field_s[0].field_f = 1;
                    statePc = 431;
                    continue stateLoop;
                }
                case 414: {
                    if (null == this.field_i[1]) {
                        statePc = 419;
                    } else {
                        statePc = 417;
                    }
                    continue stateLoop;
                }
                case 417: {
                    this.field_i[1].field_m = ns.a(false, 5, vv.field_b);
                    this.field_i[1].field_f = 1;
                    statePc = 419;
                    continue stateLoop;
                }
                case 419: {
                    if (this.field_s[2] == null) {
                        statePc = 426;
                    } else {
                        statePc = 420;
                    }
                    continue stateLoop;
                }
                case 420: {
                    if (!this.field_s[2].b((byte) -122)) {
                        statePc = 426;
                    } else {
                        statePc = 423;
                    }
                    continue stateLoop;
                }
                case 423: {
                    this.field_s[2].field_m = je.field_K[this.field_a][0] + -ns.a(false, 5, vv.field_b);
                    this.field_s[2].field_f = 2;
                    statePc = 431;
                    continue stateLoop;
                }
                case 426: {
                    if (null == this.field_s[0]) {
                        statePc = 431;
                    } else {
                        statePc = 429;
                    }
                    continue stateLoop;
                }
                case 429: {
                    this.field_s[0].field_m = je.field_K[this.field_a][0] + -ns.a(false, 5, vv.field_b);
                    this.field_s[0].field_f = 2;
                    statePc = 431;
                    continue stateLoop;
                }
                case 431: {
                    if (null == this.field_s[0]) {
                        statePc = 487;
                    } else {
                        statePc = 432;
                    }
                    continue stateLoop;
                }
                case 432: {
                    if (this.field_s[0].b((byte) 120)) {
                        statePc = 437;
                    } else {
                        statePc = 487;
                    }
                    continue stateLoop;
                }
                case 437: {
                    if (null == this.field_s[1]) {
                        statePc = 447;
                    } else {
                        statePc = 438;
                    }
                    continue stateLoop;
                }
                case 438: {
                    if (-1 == this.field_s[1].field_f) {
                        statePc = 447;
                    } else {
                        statePc = 441;
                    }
                    continue stateLoop;
                }
                case 441: {
                    if (null == this.field_s[2]) {
                        statePc = 447;
                    } else {
                        statePc = 444;
                    }
                    continue stateLoop;
                }
                case 444: {
                    if (this.field_s[2].field_f != -1) {
                        statePc = 471;
                    } else {
                        statePc = 447;
                    }
                    continue stateLoop;
                }
                case 447: {
                    if (this.field_s[1] == null) {
                        statePc = 453;
                    } else {
                        statePc = 450;
                    }
                    continue stateLoop;
                }
                case 450: {
                    if ((this.field_s[1].field_f ^ -1) != 0) {
                        statePc = 465;
                    } else {
                        statePc = 453;
                    }
                    continue stateLoop;
                }
                case 453: {
                    if (null == this.field_s[2]) {
                        statePc = 487;
                    } else {
                        statePc = 456;
                    }
                    continue stateLoop;
                }
                case 456: {
                    if ((this.field_s[2].field_f ^ -1) == 0) {
                        statePc = 487;
                    } else {
                        statePc = 459;
                    }
                    continue stateLoop;
                }
                case 459: {
                    if (null == this.field_s[0]) {
                        statePc = 487;
                    } else {
                        statePc = 462;
                    }
                    continue stateLoop;
                }
                case 462: {
                    this.field_s[0].field_m = this.field_s[2].field_m - -ns.a(false, 5, vv.field_b);
                    this.field_s[0].field_f = this.field_s[2].field_f;
                    statePc = 487;
                    continue stateLoop;
                }
                case 465: {
                    if (null != this.field_s[0]) {
                        statePc = 470;
                    } else {
                        statePc = 487;
                    }
                    continue stateLoop;
                }
                case 470: {
                    this.field_s[0].field_m = this.field_s[1].field_m + ns.a(false, 5, vv.field_b);
                    this.field_s[0].field_f = this.field_s[1].field_f;
                    statePc = 487;
                    continue stateLoop;
                }
                case 471: {
                    if (ns.a(false, 1000, vv.field_b) < 500) {
                        statePc = 480;
                    } else {
                        statePc = 474;
                    }
                    continue stateLoop;
                }
                case 474: {
                    if (null != this.field_s[0]) {
                        statePc = 479;
                    } else {
                        statePc = 487;
                    }
                    continue stateLoop;
                }
                case 479: {
                    this.field_s[0].field_m = this.field_s[1].field_m + ns.a(false, 5, vv.field_b);
                    this.field_s[0].field_f = this.field_s[1].field_f;
                    statePc = 487;
                    continue stateLoop;
                }
                case 480: {
                    if (this.field_s[0] == null) {
                        statePc = 487;
                    } else {
                        statePc = 483;
                    }
                    continue stateLoop;
                }
                case 483: {
                    this.field_s[0].field_m = this.field_s[1].field_m + ns.a(false, 5, vv.field_b);
                    this.field_s[0].field_f = this.field_s[2].field_f;
                    statePc = 487;
                    continue stateLoop;
                }
                case 487: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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
                  stackIn_13_0 = ga.field_d;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_11_0 = jh.field_j;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_8_0 = jh.field_j;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_5_0 = ue.field_a;
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
        int[] stackIn_50_0 = null;
        int stackIn_63_0 = 0;
        int stackIn_67_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_H.b();
              this.a((byte) 99, 0, 0, -1);
              tm.a();
              tm.c();
              if (!this.field_d) {
                this.f((byte) -15);
                if (!this.field_o) {
                  if (!this.field_f) {
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
                if ((this.field_n ^ -1) == -6) {
                  this.a(true, this.field_s, (byte) 109, this.field_y, this.field_D);
                  break L1;
                } else {
                  L2: {
                    if (-7 == (this.field_n ^ -1)) {
                      break L2;
                    } else {
                      L3: {
                        if (-9 != (this.field_n ^ -1)) {
                          break L3;
                        } else {
                          if (-9 == (this.field_L ^ -1)) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L4: {
                        if (this.field_n == 7) {
                          break L4;
                        } else {
                          if (8 != this.field_n) {
                            break L1;
                          } else {
                            if (-8 == (this.field_L ^ -1)) {
                              break L4;
                            } else {
                              break L1;
                            }
                          }
                        }
                      }
                      this.a(this.field_y, this.field_s, (byte) 83);
                      break L1;
                    }
                  }
                  this.a(false, this.field_i, (byte) 109, this.field_w, this.field_D);
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
                var7 = var3 + 0;
                if (!iu.field_n) {
                  break L6;
                } else {
                  if (this.b((byte) -96)) {
                    stackIn_50_0 = ci.field_e;
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              stackIn_50_0 = nd.field_b;
              break L5;
            }
            L7: {
              var8 = stackIn_50_0;
              fe.a(var6, var7, var4, var5, il.field_s, var8, 0, 0, true);
              if (param0 < -119) {
                break L7;
              } else {
                this.field_C = 65;
                break L7;
              }
            }
            L8: {
              var2_int = var4 >> -1365344159;
              var3 = mp.k(-104) + (var5 >> 194242593);
              fe.c(em.field_c, var2_int + var6, var7 - -var3, 2236962, true);
              if (this.field_x == null) {
                break L8;
              } else {
                if (this.field_x.field_T != null) {
                  L9: {
                    var3 = 19;
                    if (ku.field_J != null) {
                      stackIn_63_0 = ku.field_J.field_x >> -3007455;
                      break L9;
                    } else {
                      stackIn_63_0 = 0;
                      break L9;
                    }
                  }
                  L10: {
                    var5 = stackIn_63_0;
                    if (ku.field_J == null) {
                      stackIn_67_0 = 0;
                      break L10;
                    } else {
                      stackIn_67_0 = ku.field_J.field_A >> -541784767;
                      break L10;
                    }
                  }
                  L11: {
                    var4 = stackIn_67_0;
                    var2_int = 17;
                    var6 = 0 + var2_int;
                    var7 = -var5 + (ag.field_I.field_D - var3);
                    if (this.field_e <= -1) {
                      break L11;
                    } else {
                      this.field_x.field_T[this.field_e].a(var6, this.field_x.field_lb[this.field_e], false, false, var7, false, false, 122);
                      break L11;
                    }
                  }
                  var6 = -var2_int + (so.field_b.field_a + -var4);
                  if ((this.field_g ^ -1) >= 0) {
                    break L8;
                  } else {
                    this.field_x.field_T[this.field_g].a(var6, this.field_x.field_lb[this.field_g], false, false, var7, false, false, 28);
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
                this.field_H.f(0, 0);
                break L12;
              } else {
                u.field_p.a(-66, this.field_H);
                break L12;
              }
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
        RuntimeException stackIn_178_0 = null;
        StringBuilder stackIn_178_1 = null;
        RuntimeException stackIn_179_0 = null;
        StringBuilder stackIn_179_1 = null;
        String stackIn_179_2 = null;
        StringBuilder stackIn_182_1 = null;
        StringBuilder stackIn_183_1 = null;
        String stackIn_183_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var6 = new int[3 + -param2];
            var7 = param1;
            if (-3 == (param2 ^ -1)) {
              decompiledRegionSelector0 = 0;
              break L0;
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
                        if (-1 != (param3 ^ -1)) {
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
                      var6[var7] = 0;
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
                      if (-1 != (param3 ^ -1)) {
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
                    var6[var7] = 1;
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
                          if (-2 != (param3 ^ -1)) {
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
                        var6[var7] = 0;
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
                          if (-1 != (param3 ^ -1)) {
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
                        var6[var7] = 1;
                        var7++;
                        break L10;
                      }
                    }
                    if (param4[2] != null) {
                      break L1;
                    } else {
                      L13: {
                        L14: {
                          if (-3 != (param3 ^ -1)) {
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
                          if (-2 != (param3 ^ -1)) {
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
                        if ((param3 ^ -1) != -1) {
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
                      var6[var7] = 2;
                      var7++;
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              if (-1 != (var7 ^ -1)) {
                L16: {
                  L17: {
                    var8 = -1;
                    var9 = var6[ns.a(false, var7, vv.field_b)];
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
                  if ((param2 ^ -1) != -1) {
                    break L16;
                  } else {
                    if (-3 != (var9 ^ -1)) {
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
                      if (-1 != (param2 ^ -1)) {
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
                  if (0 > (var8 ^ -1)) {
                    param4[var9] = param4[var8];
                    param4[var8] = null;
                    param4[var9].field_j = tn.field_W[param2][var9];
                    param4[var9].field_p = kw.field_P[param2][var9];
                    break L20;
                  } else {
                    break L20;
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var6_ref = decompiledCaughtException;
            stackIn_178_0 = (RuntimeException) (var6_ref);

            stackIn_178_1 = new StringBuilder().append("sk.HA(");

            if (param0 == null) {
              stackIn_179_0 = (RuntimeException) ((Object) stackIn_178_0);
              stackIn_179_1 = (StringBuilder) ((Object) stackIn_178_1);
              stackIn_179_2 = "null";
              break L21;
            } else {
              stackIn_179_0 = (RuntimeException) ((Object) stackIn_178_0);
              stackIn_179_1 = (StringBuilder) ((Object) stackIn_178_1);
              stackIn_179_2 = "{...}";
              break L21;
            }
          }
          L22: {


            stackIn_182_1 = ((StringBuilder) (Object) stackIn_179_1).append(stackIn_179_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_179_0 = (RuntimeException) ((Object) stackIn_179_0);
              stackIn_183_1 = (StringBuilder) ((Object) stackIn_182_1);
              stackIn_183_2 = "null";
              break L22;
            } else {
              stackIn_179_0 = (RuntimeException) ((Object) stackIn_179_0);
              stackIn_183_1 = (StringBuilder) ((Object) stackIn_182_1);
              stackIn_183_2 = "{...}";
              break L22;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_179_0), stackIn_183_2 + ')');
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= this.field_s.length) {
                var2_int = 0;
                L2: while (true) {
                  L3: {
                    if ((this.field_D.length ^ -1) >= (var2_int ^ -1)) {
                      break L3;
                    } else {
                      if (null == this.field_D[var2_int]) {
                        break L3;
                      } else {
                        this.field_D[var2_int].d(59);
                        var2_int++;
                        continue L2;
                      }
                    }
                  }
                  if (!param0) {
                    L4: {
                      if (0 != (this.field_F & 15)) {
                        break L4;
                      } else {
                        this.f(-24577);
                        break L4;
                      }
                    }
                    L5: {
                      if (this.field_D[-1 + this.field_D.length] == null) {
                        break L5;
                      } else {
                        if (-201 <= (this.field_D[-1 + this.field_D.length].field_f ^ -1)) {
                          break L5;
                        } else {
                          this.field_n = 6;
                          this.h(1);
                          break L5;
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
              } else {
                L6: {
                  if (null == this.field_s[var2_int]) {
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
                continue L1;
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
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
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
                if (jv.field_a) {
                  break L3;
                } else {
                  if (null != this.field_A) {
                    if ((param3 ^ -1) <= -1) {
                      this.field_A.e(param1, param2, param3);
                      break L2;
                    } else {
                      this.field_A.f(param1, param2);
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
          throw ig.a((Throwable) ((Object) var5), "sk.LA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final int[] a(int param0, byte param1) {
        int[] stackIn_3_0 = null;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int[] stackIn_21_0 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = ArmiesOfGielinor.field_M ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 <= -126) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = (int[]) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        var3 = new int[param0];
                        var4 = new int[param0];
                        var5 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var5 >= param0) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var3[var5] = var5;
                        var4[var5] = ns.a(false, 2147483647, vv.field_b);
                        var5++;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var5 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_11_0 = var5 ^ -1;
                        stackIn_11_1 = param0 + -1 ^ -1;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (stackIn_11_0 <= stackIn_11_1) {
                            statePc = 20;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var6 = var5;
                        var7 = var4[var5];
                        var8 = var5 + 1;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if ((param0 ^ -1) >= (var8 ^ -1)) {
                            statePc = 19;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackIn_11_0 = var4[var8] ^ -1;
                        stackIn_15_0 = stackIn_11_0;
                        stackIn_11_1 = var7 ^ -1;
                        stackIn_15_1 = stackIn_11_1;
                        if (false) {
                            statePc = 11;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (stackIn_15_0 < stackIn_15_1) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var7 = var4[var8];
                        var6 = var8;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var8++;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var8 = var3[var6];
                        var4[var6] = var4[var5];
                        var3[var6] = var3[var5];
                        var4[var5] = var7;
                        var3[var5] = var8;
                        var5++;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_21_0 = (int[]) (var3);
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 21: {
                    return stackIn_21_0;
                }
                case 22: {
                    var3_ref = (RuntimeException) ((Object) caughtException);
                    throw ig.a((Throwable) ((Object) var3_ref), "sk.J(" + param0 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void e(byte param0) {
        lf stackIn_43_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
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
                if (0 == this.field_I) {
                  var2_int = 0;
                  var3 = 0;
                  var3 = 0;
                  L3: while (true) {
                    L4: {
                      if ((var3 ^ -1) <= (this.field_s.length ^ -1)) {
                        if (var2_int == 0) {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          var2_int = ns.a(false, var2_int, vv.field_b) + 1;
                          var3 = 0;
                          var3 = 0;
                          L5: while (true) {
                            L6: {
                              if (var3 >= this.field_s.length) {
                                break L6;
                              } else {
                                if (0 >= var2_int) {
                                  break L6;
                                } else {
                                  L7: {
                                    if (null == this.field_s[var3]) {
                                      break L7;
                                    } else {
                                      if (this.field_s[var3].field_D == 0) {
                                        var2_int--;
                                        break L7;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                  var3++;
                                  continue L5;
                                }
                              }
                            }
                            this.field_s[var3 - 1].a(2, (byte) -108);
                            this.field_s[var3 + -1].a(0, 30, 1, 0, u.field_o[this.field_c][0], pk.field_T[this.field_c][0], (byte) 122);
                            this.field_s[var3 + -1].field_d = true;
                            this.field_i[0].a(1, (byte) -109);
                            stackIn_43_0 = this.field_i[0];
                            break L4;
                          }
                        }
                      } else {
                        stackIn_43_0 = this.field_s[var3];

                        L8: {
                          if (stackIn_43_0 == null) {
                            break L8;
                          } else {
                            if (this.field_s[var3].field_D != 0) {
                              break L8;
                            } else {
                              var2_int++;
                              break L8;
                            }
                          }
                        }
                        var3++;
                        continue L3;
                      }
                    }
                    ((lf) (Object) stackIn_43_0).a(0, 30, 1, 20, u.field_o[this.field_a][1], pk.field_T[this.field_a][1], (byte) 122);
                    this.field_v = this.field_v - 1;
                    this.field_I = 20 + ns.a(false, 20, vv.field_b);
                    break L2;
                  }
                } else {
                  this.field_I = this.field_I - 1;
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
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
        int stackIn_2_0 = 0;
        int stackIn_181_0 = 0;
        int stackIn_184_0 = 0;
        int stackIn_186_0 = 0;
        RuntimeException stackIn_190_0 = null;
        StringBuilder stackIn_190_1 = null;
        RuntimeException stackIn_191_0 = null;
        StringBuilder stackIn_191_1 = null;
        String stackIn_191_2 = null;
        StringBuilder stackIn_194_1 = null;
        StringBuilder stackIn_195_1 = null;
        String stackIn_195_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        try {
          L0: {
            var6 = new int[3 - param1];
            var7 = 0;
            if ((param1 ^ -1) != -3) {
              L1: {
                if (-2 == (param1 ^ -1)) {
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
                            if (-1 != (param3 ^ -1)) {
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
                                if (param2[0].b(param0 + 2259)) {
                                  break L5;
                                } else {
                                  break L6;
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
                                if ((param3 ^ -1) == -1) {
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
              if (-1 != (var7 ^ -1)) {
                var8 = var6[ns.a(false, var7, vv.field_b)];
                if (param0 == -93) {
                  param4[var8].field_d = true;
                  stackIn_186_0 = 1;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_184_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_181_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              param4[0].field_d = true;
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var6_ref = decompiledCaughtException;
            stackIn_190_0 = (RuntimeException) (var6_ref);

            stackIn_190_1 = new StringBuilder().append("sk.T(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_191_0 = (RuntimeException) ((Object) stackIn_190_0);
              stackIn_191_1 = (StringBuilder) ((Object) stackIn_190_1);
              stackIn_191_2 = "null";
              break L16;
            } else {
              stackIn_191_0 = (RuntimeException) ((Object) stackIn_190_0);
              stackIn_191_1 = (StringBuilder) ((Object) stackIn_190_1);
              stackIn_191_2 = "{...}";
              break L16;
            }
          }
          L17: {


            stackIn_194_1 = ((StringBuilder) (Object) stackIn_191_1).append(stackIn_191_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_191_0 = (RuntimeException) ((Object) stackIn_191_0);
              stackIn_195_1 = (StringBuilder) ((Object) stackIn_194_1);
              stackIn_195_2 = "null";
              break L17;
            } else {
              stackIn_191_0 = (RuntimeException) ((Object) stackIn_191_0);
              stackIn_195_1 = (StringBuilder) ((Object) stackIn_194_1);
              stackIn_195_2 = "{...}";
              break L17;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_191_0), stackIn_195_2 + ')');
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
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        Object stackIn_30_0 = null;
        lf stackIn_30_1 = null;
        Object stackIn_34_0 = null;
        lf stackIn_34_1 = null;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        int stackIn_70_0 = 0;
        int stackIn_70_1 = 0;
        int stackIn_94_0 = 0;
        int stackIn_94_1 = 0;
        int stackIn_99_0 = 0;
        int stackIn_99_1 = 0;
        RuntimeException stackIn_121_0 = null;
        StringBuilder stackIn_121_1 = null;
        RuntimeException stackIn_123_0 = null;
        StringBuilder stackIn_123_1 = null;
        RuntimeException stackIn_124_0 = null;
        StringBuilder stackIn_124_1 = null;
        String stackIn_124_2 = null;
        RuntimeException stackIn_125_0 = null;
        StringBuilder stackIn_125_1 = null;
        RuntimeException stackIn_127_0 = null;
        StringBuilder stackIn_127_1 = null;
        RuntimeException stackIn_128_0 = null;
        StringBuilder stackIn_128_1 = null;
        String stackIn_128_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = ArmiesOfGielinor.field_M ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        param3 = 0;
                        var6_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((param1.length ^ -1) >= (var6_int ^ -1)) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        param3++;
                        var6_int++;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var6_int = 0;
                        var7 = new int[param3];
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var6_int >= param4.length) {
                            statePc = 12;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (param4[var6_int] == null) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var6_int++;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var8 = new int[var6_int];
                        var9 = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if ((var9 ^ -1) <= (var6_int ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var8[var9] = var9;
                        var9++;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var6_int = 0;
                        var9 = 0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if ((param3 ^ -1) >= (var9 ^ -1)) {
                            statePc = 26;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (null != param1[var9]) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        incrementValue$0 = var6_int;
                        var6_int++;
                        var7[incrementValue$0] = var9;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var9++;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        param3 = var6_int;
                        var9 = 0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (param3 <= var9) {
                            statePc = 43;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var10 = var9;
                        stackIn_30_0 = null;
                        stackIn_30_1 = param1[var7[var10]];
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (stackIn_30_0 == stackIn_30_1) {
                            statePc = 42;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var11 = 1 + var9;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (var11 >= param3) {
                            statePc = 40;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackIn_30_0 = null;
                        stackIn_34_0 = stackIn_30_0;
                        stackIn_30_1 = param1[var7[var11]];
                        stackIn_34_1 = stackIn_30_1;
                        if (false) {
                            statePc = 30;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (stackIn_34_0 == stackIn_34_1) {
                            statePc = 39;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if ((param1[var7[var11]].field_s ^ -1) >= (param1[var7[var10]].field_s ^ -1)) {
                            statePc = 39;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var10 = var11;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var11++;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (var10 == var9) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var11 = var7[var10];
                        var7[var10] = var7[var9];
                        var7[var9] = var11;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var9++;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var9 = 0;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if ((var8.length ^ -1) >= (var9 ^ -1)) {
                            statePc = 58;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var10 = var9;
                        var11 = var9 + 1;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var11 >= var8.length) {
                            statePc = 54;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackIn_55_0 = param4[var8[var10]].field_d ^ -1;
                        stackIn_48_0 = stackIn_55_0;
                        stackIn_55_1 = param4[var8[var11]].field_d ^ -1;
                        stackIn_48_1 = stackIn_55_1;
                        if (false) {
                            statePc = 55;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (stackIn_48_0 > stackIn_48_1) {
                            statePc = 52;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var10 = var11;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var11++;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        stackIn_55_0 = var9;
                        stackIn_55_1 = var10;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (stackIn_55_0 == stackIn_55_1) {
                            statePc = 57;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var11 = var8[var10];
                        var8[var10] = var8[var9];
                        var8[var9] = var11;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var9++;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var9 = 0;
                        if (param2 == 109) {
                            statePc = 60;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 59: {
                    return;
                }
                case 60: {
                    try {
                        if (cu.field_a) {
                            statePc = 63;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (var8.length > var6_int) {
                            statePc = 68;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        stackIn_70_0 = var9;
                        stackIn_65_0 = stackIn_70_0;
                        stackIn_70_1 = param3;
                        stackIn_65_1 = stackIn_70_1;
                        if (false) {
                            statePc = 70;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (stackIn_65_0 >= stackIn_65_1) {
                            statePc = 90;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        stackIn_70_0 = var9;
                        stackIn_70_1 = param3;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (stackIn_70_0 >= stackIn_70_1) {
                            statePc = 77;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (param1[var7[var9]] == null) {
                            statePc = 76;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        var9++;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if ((var9 ^ -1) <= (param3 ^ -1)) {
                            statePc = 89;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if ((var8.length ^ -1) >= (var6_int ^ -1)) {
                            statePc = 88;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if ((param1[var7[var9]].field_s ^ -1) <= (param4[var8[var6_int]].field_d ^ -1)) {
                            statePc = 87;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        incrementValue$1 = var6_int;
                        var6_int++;
                        param4[var8[incrementValue$1]].a(param0, param2 ^ -107, true, this.field_C);
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        incrementValue$2 = var9;
                        var9++;
                        param1[var7[incrementValue$2]].a(this.field_C, -91, true);
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        incrementValue$3 = var9;
                        var9++;
                        param1[var7[incrementValue$3]].a(this.field_C, param2 ^ -55, true);
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        incrementValue$4 = var6_int;
                        var6_int++;
                        param4[var8[incrementValue$4]].a(param0, -8, true, this.field_C);
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        this.a((byte) 98, 0, 0, 128);
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        var9 = 0;
                        var6_int = 0;
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if ((var6_int ^ -1) > (var8.length ^ -1)) {
                            statePc = 97;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        stackIn_99_0 = param3 ^ -1;
                        stackIn_94_0 = stackIn_99_0;
                        stackIn_99_1 = var9 ^ -1;
                        stackIn_94_1 = stackIn_99_1;
                        if (false) {
                            statePc = 99;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        if (stackIn_94_0 >= stackIn_94_1) {
                            statePc = 129;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        stackIn_99_0 = param3;
                        stackIn_99_1 = var9;
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if (stackIn_99_0 <= stackIn_99_1) {
                            statePc = 106;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if (param1[var7[var9]] != null) {
                            statePc = 106;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        var9++;
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        if (var9 >= param3) {
                            statePc = 118;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        if ((var6_int ^ -1) > (var8.length ^ -1)) {
                            statePc = 113;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        incrementValue$5 = var9;
                        var9++;
                        param1[var7[incrementValue$5]].a(this.field_C, -65, false);
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        if (param1[var7[var9]].field_s >= param4[var8[var6_int]].field_d) {
                            statePc = 117;
                        } else {
                            statePc = 114;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        incrementValue$6 = var6_int;
                        var6_int++;
                        param4[var8[incrementValue$6]].a(param0, -8, false, this.field_C);
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        incrementValue$7 = var9;
                        var9++;
                        param1[var7[incrementValue$7]].a(this.field_C, -70, false);
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        incrementValue$8 = var6_int;
                        var6_int++;
                        param4[var8[incrementValue$8]].a(param0, -8, false, this.field_C);
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 120: {
                    var6 = (RuntimeException) ((Object) caughtException);
                    stackIn_123_0 = (RuntimeException) (var6);
                    stackIn_121_0 = stackIn_123_0;
                    stackIn_123_1 = new StringBuilder().append("sk.FA(").append(param0).append(',');
                    stackIn_121_1 = stackIn_123_1;
                    if (param1 == null) {
                        statePc = 123;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    stackIn_124_0 = (RuntimeException) ((Object) stackIn_121_0);
                    stackIn_124_1 = (StringBuilder) ((Object) stackIn_121_1);
                    stackIn_124_2 = "{...}";
                    statePc = 124;
                    continue stateLoop;
                }
                case 123: {
                    stackIn_124_0 = (RuntimeException) ((Object) stackIn_123_0);
                    stackIn_124_1 = (StringBuilder) ((Object) stackIn_123_1);
                    stackIn_124_2 = "null";
                    statePc = 124;
                    continue stateLoop;
                }
                case 124: {
                    stackIn_127_0 = (RuntimeException) ((Object) stackIn_124_0);
                    stackIn_125_0 = stackIn_127_0;
                    stackIn_127_1 = ((StringBuilder) (Object) stackIn_124_1).append(stackIn_124_2).append(',').append(param2).append(',').append(param3).append(',');
                    stackIn_125_1 = stackIn_127_1;
                    if (param4 == null) {
                        statePc = 127;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    stackIn_128_0 = (RuntimeException) ((Object) stackIn_125_0);
                    stackIn_128_1 = (StringBuilder) ((Object) stackIn_125_1);
                    stackIn_128_2 = "{...}";
                    statePc = 128;
                    continue stateLoop;
                }
                case 127: {
                    stackIn_128_0 = (RuntimeException) ((Object) stackIn_127_0);
                    stackIn_128_1 = (StringBuilder) ((Object) stackIn_127_1);
                    stackIn_128_2 = "null";
                    statePc = 128;
                    continue stateLoop;
                }
                case 128: {
                    throw ig.a((Throwable) ((Object) stackIn_128_0), stackIn_128_2 + ')');
                }
                case 129: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
                  stackIn_10_0 = 1;
                  break L1;
                }
              }
              stackIn_10_0 = 0;
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
              stackIn_18_0 = var2_int;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_12_0 = 0;
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
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
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
                    continue L1;
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
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3), "sk.MA(" + param0 + ',' + param1 + ')');
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
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (param0.length <= var3_int) {
                L2: {
                  if (param1 == 12579) {
                    break L2;
                  } else {
                    this.field_c = 97;
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  if (param0[var3_int] == null) {
                    break L3;
                  } else {
                    param0[var3_int].d((byte) 113);
                    break L3;
                  }
                }
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (runtimeException);

            stackIn_16_1 = new StringBuilder().append("sk.C(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
    }

    private final void l(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
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
                var2_int = this.field_y + -this.field_v;
                var3 = this.field_w - this.field_O;
                if (0 >= this.field_O) {
                  break L3;
                } else {
                  if (-1 > (this.field_v ^ -1)) {
                    L4: {
                      if ((var2_int ^ -1) >= -1) {
                        break L4;
                      } else {
                        if (0 >= var3) {
                          break L4;
                        } else {
                          if (ns.a(false, this.field_O + this.field_v, vv.field_b) > this.field_v) {
                            if (!this.a((byte) -93, this.field_u, this.field_s, this.field_J, this.field_i)) {
                              break L2;
                            } else {
                              this.field_O = this.field_O - 1;
                              break L2;
                            }
                          } else {
                            if (!this.a((byte) -93, this.field_J, this.field_i, this.field_u, this.field_s)) {
                              break L2;
                            } else {
                              this.field_v = this.field_v - 1;
                              break L2;
                            }
                          }
                        }
                      }
                    }
                    if (-1 > (var2_int ^ -1)) {
                      if (!this.a((byte) -93, this.field_J, this.field_i, this.field_u, this.field_s)) {
                        break L2;
                      } else {
                        this.field_v = this.field_v - 1;
                        break L2;
                      }
                    } else {
                      if ((var3 ^ -1) < -1) {
                        if (this.a((byte) -93, this.field_u, this.field_s, this.field_J, this.field_i)) {
                          this.field_O = this.field_O - 1;
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        break L2;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
              }
              if (0 < this.field_v) {
                if (this.a((byte) -93, this.field_J, this.field_i, this.field_u, this.field_s)) {
                  this.field_v = this.field_v - 1;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                if (-1 > (this.field_O ^ -1)) {
                  if (!this.a((byte) -93, this.field_u, this.field_s, this.field_J, this.field_i)) {
                    break L2;
                  } else {
                    this.field_O = this.field_O - 1;
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        Object stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        Object stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        Object stackIn_49_0 = null;
        Object stackIn_51_0 = null;
        Object stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        Object stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        Object stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        int stackIn_63_2 = 0;
        Object stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        Object stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        int stackIn_67_2 = 0;
        Object stackIn_74_0 = null;
        Object stackIn_76_0 = null;
        Object stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        Object stackIn_185_0 = null;
        Object stackIn_186_0 = null;
        int stackIn_186_1 = 0;
        lf[] stackIn_204_0 = null;
        int stackIn_204_1 = 0;
        lf stackIn_204_2 = null;
        lf stackIn_204_3 = null;
        int stackIn_204_4 = 0;
        int stackIn_204_5 = 0;
        int stackIn_204_6 = 0;
        int stackIn_204_7 = 0;
        boolean stackIn_204_8 = false;
        int stackIn_206_9;
        int stackIn_207_9;
        int stackIn_207_10;
        lf[] stackIn_208_0;
        int stackIn_208_1;
        lf stackIn_208_2;
        lf stackIn_208_3;
        int stackIn_208_4;
        int stackIn_208_5;
        int stackIn_208_6;
        int stackIn_208_7;
        boolean stackIn_208_8;
        int stackIn_208_9;
        lf[] stackIn_216_0 = null;
        int stackIn_216_1 = 0;
        lf stackIn_216_2 = null;
        lf stackIn_216_3 = null;
        int stackIn_216_4 = 0;
        int stackIn_216_5 = 0;
        int stackIn_216_6 = 0;
        int stackIn_216_7 = 0;
        boolean stackIn_216_8 = false;
        int stackIn_218_9;
        int stackIn_219_9;
        int stackIn_219_10;
        lf[] stackIn_220_0;
        int stackIn_220_1;
        lf stackIn_220_2;
        lf stackIn_220_3;
        int stackIn_220_4;
        int stackIn_220_5;
        int stackIn_220_6;
        int stackIn_220_7;
        boolean stackIn_220_8;
        int stackIn_220_9;
        Object stackIn_236_0 = null;
        Object stackIn_237_0 = null;
        int stackIn_237_1 = 0;
        RuntimeException stackIn_258_0 = null;
        StringBuilder stackIn_258_1 = null;
        RuntimeException stackIn_259_0 = null;
        StringBuilder stackIn_259_1 = null;
        String stackIn_259_2 = null;
        StringBuilder stackIn_262_1 = null;
        StringBuilder stackIn_263_1 = null;
        String stackIn_263_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null != this.field_x) {
                this.b((byte) 54, this.field_x.field_hb);
                break L1;
              } else {
                this.b((byte) 54, 0);
                break L1;
              }
            }
            L2: {
              if ((param1.field_Y ^ -1) < (param0 ^ -1)) {
                stackIn_11_0 = 0;
                break L2;
              } else {
                stackIn_11_0 = 1;
                break L2;
              }
            }
            L3: {
              var6_int = stackIn_11_0;
              if (var6_int == 0) {
                break L3;
              } else {
                param2 = 0;
                break L3;
              }
            }
            L4: {
              if (param4.field_Y > param2) {
                stackIn_17_0 = 0;
                break L4;
              } else {
                stackIn_17_0 = 1;
                break L4;
              }
            }
            L5: {
              var7 = stackIn_17_0;
              stackIn_20_0 = this;

              if (1 >= bw.field_m[param4.field_N][7]) {
                stackIn_21_0 = this;
                stackIn_21_1 = 0;
                break L5;
              } else {
                stackIn_21_0 = this;
                stackIn_21_1 = 1;
                break L5;
              }
            }
            L6: {
              ((sk) (this)).field_d = stackIn_21_1 != 0;
              if ((param4.field_N ^ -1) != -35) {
                break L6;
              } else {
                if (!param4.field_W) {
                  break L6;
                } else {
                  this.field_d = true;
                  break L6;
                }
              }
            }
            L7: {
              if (param3) {
                break L7;
              } else {
                this.field_v = 72;
                break L7;
              }
            }
            L8: {
              if (this.field_d) {
                param2 = 0;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              this.field_J = bw.field_m[param4.field_N][9];
              stackIn_37_0 = this;

              if ((vu.field_N[this.field_J] * param4.field_Y % param4.field_t ^ -1) >= -1) {
                stackIn_38_0 = this;
                stackIn_38_1 = 0;
                break L9;
              } else {
                stackIn_38_0 = this;
                stackIn_38_1 = 1;
                break L9;
              }
            }
            L10: {
              ((sk) (this)).field_y = stackIn_38_1 + param4.field_Y * vu.field_N[this.field_J] / param4.field_t;
              stackIn_41_0 = this;

              stackIn_41_1 = -((-param2 + param4.field_Y) * vu.field_N[this.field_J] / param4.field_t);

              if (vu.field_N[this.field_J] * (param4.field_Y + -param2) % param4.field_t > 0) {
                stackIn_42_0 = this;
                stackIn_42_1 = stackIn_41_1;
                stackIn_42_2 = 1;
                break L10;
              } else {
                stackIn_42_0 = this;
                stackIn_42_1 = stackIn_41_1;
                stackIn_42_2 = 0;
                break L10;
              }
            }
            L11: {
              ((sk) (this)).field_v = stackIn_42_1 + (-stackIn_42_2 + this.field_y);
              this.field_c = param4.field_N;
              if ((this.field_v ^ -1) >= (this.field_y ^ -1)) {
                break L11;
              } else {
                this.field_v = this.field_y;
                break L11;
              }
            }
            L12: {
              L13: {
                stackIn_49_0 = this;

                if (3 == param4.g(0)) {
                  break L13;
                } else {
                  stackIn_51_0 = this;

                  if (7 != param1.field_N) {
                    stackIn_52_0 = this;
                    stackIn_52_1 = 0;
                    break L12;
                  } else {
                    stackIn_49_0 = this;
                    break L13;
                  }
                }
              }
              stackIn_52_0 = this;
              stackIn_52_1 = 1;
              break L12;
            }
            L14: {
              ((sk) (this)).field_E = stackIn_52_1 != 0;
              if (-35 != (param1.field_N ^ -1)) {
                break L14;
              } else {
                if (param1.field_W) {
                  this.field_q = true;
                  break L14;
                } else {
                  break L14;
                }
              }
            }
            L15: {
              this.field_u = bw.field_m[param1.field_N][9];
              stackIn_62_0 = this;

              stackIn_62_1 = param1.field_Y * vu.field_N[this.field_u] / param1.field_t;

              if (-1 <= (vu.field_N[this.field_u] * param1.field_Y % param1.field_t ^ -1)) {
                stackIn_63_0 = this;
                stackIn_63_1 = stackIn_62_1;
                stackIn_63_2 = 0;
                break L15;
              } else {
                stackIn_63_0 = this;
                stackIn_63_1 = stackIn_62_1;
                stackIn_63_2 = 1;
                break L15;
              }
            }
            L16: {
              ((sk) (this)).field_w = stackIn_63_1 + stackIn_63_2;
              stackIn_66_0 = this;

              stackIn_66_1 = this.field_w;

              if ((-param0 + param1.field_Y) * vu.field_N[this.field_u] % param1.field_t <= 0) {
                stackIn_67_0 = this;
                stackIn_67_1 = stackIn_66_1;
                stackIn_67_2 = 0;
                break L16;
              } else {
                stackIn_67_0 = this;
                stackIn_67_1 = stackIn_66_1;
                stackIn_67_2 = 1;
                break L16;
              }
            }
            L17: {
              ((sk) (this)).field_O = stackIn_67_1 - stackIn_67_2 - vu.field_N[this.field_u] * (param1.field_Y + -param0) / param1.field_t;
              this.field_a = param1.field_N;
              if ((this.field_w ^ -1) <= (this.field_O ^ -1)) {
                break L17;
              } else {
                this.field_O = this.field_w;
                break L17;
              }
            }
            L18: {
              L19: {
                stackIn_74_0 = this;

                if (-4 == (param1.g(0) ^ -1)) {
                  break L19;
                } else {
                  stackIn_76_0 = this;

                  if (param1.field_N != 7) {
                    stackIn_77_0 = this;
                    stackIn_77_1 = 0;
                    break L18;
                  } else {
                    stackIn_74_0 = this;
                    break L19;
                  }
                }
              }
              stackIn_77_0 = this;
              stackIn_77_1 = 1;
              break L18;
            }
            L20: {
              ((sk) (this)).field_P = stackIn_77_1 != 0;
              if (this.field_d) {
                L21: {
                  if (34 != this.field_c) {
                    if ((param4.g(0) ^ -1) != -4) {
                      L22: {
                        if (-82 == (this.field_c ^ -1)) {
                          break L22;
                        } else {
                          if (4 == this.field_c) {
                            break L22;
                          } else {
                            if (this.field_c == 74) {
                              break L22;
                            } else {
                              if (-68 == (this.field_c ^ -1)) {
                                this.field_z = 3;
                                break L21;
                              } else {
                                if (this.field_c == 18) {
                                  this.field_z = 0;
                                  break L21;
                                } else {
                                  if (this.field_c != 28) {
                                    if (this.field_c == 3) {
                                      this.field_z = 6;
                                      break L21;
                                    } else {
                                      break L21;
                                    }
                                  } else {
                                    this.field_z = 5;
                                    break L21;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      this.field_z = 7;
                      break L21;
                    } else {
                      this.field_z = bw.field_m[param4.field_N][1] + 8;
                      break L21;
                    }
                  } else {
                    this.field_z = 2;
                    break L21;
                  }
                }
                this.field_p = this.field_O - (-ns.a(false, this.field_y, vv.field_b) + -this.field_y);
                this.field_D = new km[this.field_p];
                this.field_b = this.a(this.field_w, (byte) -127);
                this.field_n = 5;
                if (var6_int != 0) {
                  this.field_L = 7;
                  break L20;
                } else {
                  this.field_L = 8;
                  break L20;
                }
              } else {
                this.field_n = 1;
                if (var6_int == 0) {
                  if (var7 != 0) {
                    this.field_L = 3;
                    break L20;
                  } else {
                    this.field_L = 4;
                    break L20;
                  }
                } else {
                  this.field_L = 2;
                  break L20;
                }
              }
            }
            L23: {
              L24: {
                L25: {
                  fn.a(this.field_d, this.field_c, -32596);
                  fn.a(this.field_d, this.field_a, -32596);
                  if (param4.field_N == 7) {
                    break L25;
                  } else {
                    if (-35 != (param4.field_N ^ -1)) {
                      break L24;
                    } else {
                      break L25;
                    }
                  }
                }
                if (!param4.field_W) {
                  break L24;
                } else {
                  this.field_s = new lf[6];
                  var8 = 0;
                  L26: while (true) {
                    if (var8 >= this.field_y) {
                      break L23;
                    } else {
                      this.field_s[1 + var8] = new lf(this.field_c, true, id.field_d[var8], kr.field_F[var8], false, 0);
                      var8++;
                      continue L26;
                    }
                  }
                }
              }
              this.field_s = new lf[vu.field_N[this.field_J]];
              break L23;
            }
            L27: {
              L28: {
                L29: {
                  if (-8 == (param1.field_N ^ -1)) {
                    break L29;
                  } else {
                    if (-35 != (param1.field_N ^ -1)) {
                      break L28;
                    } else {
                      break L29;
                    }
                  }
                }
                if (param1.field_W) {
                  this.field_i = new lf[6];
                  var8 = 0;
                  L30: while (true) {
                    if ((var8 ^ -1) <= (this.field_w ^ -1)) {
                      break L27;
                    } else {
                      this.field_i[var8 + 1] = new lf(this.field_a, false, id.field_d[var8], kr.field_F[var8], false, 0);
                      var8++;
                      continue L30;
                    }
                  }
                } else {
                  break L28;
                }
              }
              this.field_i = new lf[vu.field_N[this.field_u]];
              break L27;
            }
            L31: {
              if (param1.field_N != 34) {
                break L31;
              } else {
                if (param1.field_W) {
                  L32: {
                    this.field_w = 1;
                    stackIn_185_0 = this;

                    if ((param1.field_Y - -param1.field_A ^ -1) < (param0 ^ -1)) {
                      stackIn_186_0 = this;
                      stackIn_186_1 = 0;
                      break L32;
                    } else {
                      stackIn_186_0 = this;
                      stackIn_186_1 = 1;
                      break L32;
                    }
                  }
                  L33: {
                    ((sk) (this)).field_O = stackIn_186_1;
                    this.field_u = 2;
                    this.field_a = 75;
                    if ((this.field_O ^ -1) == -2) {
                      this.field_L = 2;
                      break L33;
                    } else {
                      break L33;
                    }
                  }
                  this.field_q = true;
                  break L31;
                } else {
                  break L31;
                }
              }
            }
            L34: {
              if (34 != param4.field_N) {
                break L34;
              } else {
                if (!param4.field_W) {
                  break L34;
                } else {
                  this.field_y = 1;
                  this.field_J = 2;
                  this.field_c = 75;
                  this.field_h = true;
                  break L34;
                }
              }
            }
            L35: {
              if (this.field_f) {
                var8 = 0;
                L36: while (true) {
                  if (var8 >= this.field_y) {
                    break L35;
                  } else {
                    L37: {
                      stackIn_216_0 = this.field_s;

                      stackIn_216_1 = var8;

                      stackIn_216_2 = null;

                      stackIn_216_3 = null;

                      stackIn_216_4 = this.field_c;

                      stackIn_216_5 = 1;

                      stackIn_216_6 = tn.field_W[this.field_J][var8];

                      stackIn_216_7 = kw.field_P[this.field_J][var8];

                      stackIn_216_8 = this.field_d;

                      if (!this.field_d) {
                        L38: {


















                          stackIn_218_9 = 1300;

                          if (param3) {
                            stackIn_216_0 = (lf[]) ((Object) stackIn_216_0);

                            stackIn_216_2 = null;
                            stackIn_216_3 = null;





                            stackIn_219_9 = stackIn_218_9;
                            stackIn_219_10 = 0;
                            break L38;
                          } else {
                            stackIn_216_0 = (lf[]) ((Object) stackIn_216_0);

                            stackIn_216_2 = null;
                            stackIn_216_3 = null;





                            stackIn_219_9 = stackIn_218_9;
                            stackIn_219_10 = 1;
                            break L38;
                          }
                        }
                        stackIn_220_0 = (lf[]) ((Object) stackIn_216_0);
                        stackIn_220_1 = stackIn_216_1;
                        stackIn_220_2 = null;
                        stackIn_220_3 = null;
                        stackIn_220_4 = stackIn_216_4;
                        stackIn_220_5 = stackIn_216_5;
                        stackIn_220_6 = stackIn_216_6;
                        stackIn_220_7 = stackIn_216_7;
                        stackIn_220_8 = stackIn_216_8;
                        stackIn_220_9 = stackIn_219_9 - -ns.a(stackIn_219_10 != 0, 700, vv.field_b);
                        break L37;
                      } else {









                        stackIn_220_0 = (lf[]) ((Object) stackIn_216_0);
                        stackIn_220_1 = stackIn_216_1;
                        stackIn_220_2 = null;
                        stackIn_220_3 = null;
                        stackIn_220_4 = stackIn_216_4;
                        stackIn_220_5 = stackIn_216_5;
                        stackIn_220_6 = stackIn_216_6;
                        stackIn_220_7 = stackIn_216_7;
                        stackIn_220_8 = stackIn_216_8;
                        stackIn_220_9 = 0;
                        break L37;
                      }
                    }
                    stackIn_220_0[stackIn_220_1] = new lf(stackIn_220_4, stackIn_220_5 != 0, stackIn_220_6, stackIn_220_7, stackIn_220_8, stackIn_220_9);
                    var8++;
                    continue L36;
                  }
                }
              } else {
                var8 = 0;
                L39: while (true) {
                  if (this.field_y <= var8) {
                    break L35;
                  } else {
                    L40: {
                      stackIn_204_0 = this.field_s;

                      stackIn_204_1 = var8;

                      stackIn_204_2 = null;

                      stackIn_204_3 = null;

                      stackIn_204_4 = this.field_c;

                      stackIn_204_5 = 1;

                      stackIn_204_6 = tn.field_W[this.field_J][var8];

                      stackIn_204_7 = kw.field_P[this.field_J][var8];

                      stackIn_204_8 = this.field_d;

                      if (!this.field_d) {
                        L41: {


















                          stackIn_206_9 = 1300;

                          if (param3) {
                            stackIn_204_0 = (lf[]) ((Object) stackIn_204_0);

                            stackIn_204_2 = null;
                            stackIn_204_3 = null;





                            stackIn_207_9 = stackIn_206_9;
                            stackIn_207_10 = 0;
                            break L41;
                          } else {
                            stackIn_204_0 = (lf[]) ((Object) stackIn_204_0);

                            stackIn_204_2 = null;
                            stackIn_204_3 = null;





                            stackIn_207_9 = stackIn_206_9;
                            stackIn_207_10 = 1;
                            break L41;
                          }
                        }
                        stackIn_208_0 = (lf[]) ((Object) stackIn_204_0);
                        stackIn_208_1 = stackIn_204_1;
                        stackIn_208_2 = null;
                        stackIn_208_3 = null;
                        stackIn_208_4 = stackIn_204_4;
                        stackIn_208_5 = stackIn_204_5;
                        stackIn_208_6 = stackIn_204_6;
                        stackIn_208_7 = stackIn_204_7;
                        stackIn_208_8 = stackIn_204_8;
                        stackIn_208_9 = stackIn_207_9 + ns.a(stackIn_207_10 != 0, 700, vv.field_b);
                        break L40;
                      } else {









                        stackIn_208_0 = (lf[]) ((Object) stackIn_204_0);
                        stackIn_208_1 = stackIn_204_1;
                        stackIn_208_2 = null;
                        stackIn_208_3 = null;
                        stackIn_208_4 = stackIn_204_4;
                        stackIn_208_5 = stackIn_204_5;
                        stackIn_208_6 = stackIn_204_6;
                        stackIn_208_7 = stackIn_204_7;
                        stackIn_208_8 = stackIn_204_8;
                        stackIn_208_9 = 0;
                        break L40;
                      }
                    }
                    stackIn_208_0[stackIn_208_1] = new lf(stackIn_208_4, stackIn_208_5 != 0, stackIn_208_6, stackIn_208_7, stackIn_208_8, stackIn_208_9);
                    var8++;
                    continue L39;
                  }
                }
              }
            }
            L42: {
              if (this.field_o) {
                var8 = 0;
                L43: while (true) {
                  if ((this.field_w ^ -1) >= (var8 ^ -1)) {
                    break L42;
                  } else {
                    this.field_i[var8] = new lf(this.field_a, false, tn.field_W[this.field_u][var8], kw.field_P[this.field_u][var8], this.field_d, 0);
                    var8++;
                    continue L43;
                  }
                }
              } else {
                var8 = 0;
                L44: while (true) {
                  if (var8 >= this.field_w) {
                    break L42;
                  } else {
                    this.field_i[var8] = new lf(this.field_a, false, tn.field_W[this.field_u][var8], kw.field_P[this.field_u][var8], this.field_d, 0);
                    var8++;
                    continue L44;
                  }
                }
              }
            }
            L45: {
              stackIn_236_0 = this;

              if ((this.field_u ^ -1) > (this.field_J ^ -1)) {
                stackIn_237_0 = this;
                stackIn_237_1 = this.field_J;
                break L45;
              } else {
                stackIn_237_0 = this;
                stackIn_237_1 = this.field_u;
                break L45;
              }
            }
            L46: {
              ((sk) (this)).field_C = stackIn_237_1;
              if (-1 != (this.field_v ^ -1)) {
                break L46;
              } else {
                if (-1 != (this.field_O ^ -1)) {
                  break L46;
                } else {
                  if (!this.field_d) {
                    this.field_m = true;
                    break L46;
                  } else {
                    break L46;
                  }
                }
              }
            }
            L47: {
              if (!this.field_d) {
                break L47;
              } else {
                if (this.field_f) {
                  this.field_n = 6;
                  this.h(1);
                  break L47;
                } else {
                  break L47;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L48: {
            var6 = decompiledCaughtException;
            stackIn_258_0 = (RuntimeException) (var6);

            stackIn_258_1 = new StringBuilder().append("sk.U(").append(param0).append(',');

            if (param1 == null) {
              stackIn_259_0 = (RuntimeException) ((Object) stackIn_258_0);
              stackIn_259_1 = (StringBuilder) ((Object) stackIn_258_1);
              stackIn_259_2 = "null";
              break L48;
            } else {
              stackIn_259_0 = (RuntimeException) ((Object) stackIn_258_0);
              stackIn_259_1 = (StringBuilder) ((Object) stackIn_258_1);
              stackIn_259_2 = "{...}";
              break L48;
            }
          }
          L49: {


            stackIn_262_1 = ((StringBuilder) (Object) stackIn_259_1).append(stackIn_259_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_259_0 = (RuntimeException) ((Object) stackIn_259_0);
              stackIn_263_1 = (StringBuilder) ((Object) stackIn_262_1);
              stackIn_263_2 = "null";
              break L49;
            } else {
              stackIn_259_0 = (RuntimeException) ((Object) stackIn_259_0);
              stackIn_263_1 = (StringBuilder) ((Object) stackIn_262_1);
              stackIn_263_2 = "{...}";
              break L49;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_259_0), stackIn_263_2 + ')');
        }
    }

    sk(ha param0, v param1, vb param2) {
        RuntimeException runtimeException = null;
        um var4 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
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
                this.field_B = param1;
                if (null == u.field_p) {
                  u.field_p = new sr(rs.field_k, se.field_a, param1);
                  break L2;
                } else {
                  u.field_p.field_k = this.field_B;
                  break L2;
                }
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
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (runtimeException);

            stackIn_17_1 = new StringBuilder().append("sk.<init>(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_18_0), stackIn_26_2 + ')');
        }
    }

    static {
        field_N = "Yes";
    }
}
