/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nu {
    private boolean field_W;
    private boolean field_w;
    int field_I;
    int field_v;
    int field_c;
    static String field_M;
    tf field_E;
    private int field_U;
    boolean field_f;
    int field_O;
    static String field_D;
    static boolean field_j;
    String[] field_S;
    int field_u;
    private boolean field_T;
    boolean field_L;
    boolean field_e;
    boolean field_l;
    tj field_V;
    int[] field_d;
    boolean field_h;
    boolean field_y;
    oe field_n;
    up[][] field_b;
    la[] field_B;
    wr field_C;
    boolean field_A;
    it[] field_g;
    la[] field_x;
    boolean field_z;
    private p field_ab;
    int field_Z;
    private boolean[] field_F;
    int field_t;
    int[] field_r;
    private jc[] field_q;
    boolean field_p;
    boolean field_s;
    ua field_X;
    nl[][] field_P;
    int[][] field_i;
    int field_J;
    boolean field_Y;
    static String field_a;
    private ch field_N;
    int[] field_H;
    gt[] field_R;
    boolean field_G;
    int field_m;
    int[][] field_k;
    wl field_o;
    int[] field_Q;

    final void a(ml param0, int param1) {
        int stackIn_26_0 = 0;
        int stackIn_35_0 = 0;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = Kickabout.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 == -5) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        nu.b(false);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        param0.p(-103);
                        this.field_v = sk.a(param1 ^ -19886, 8, 0, 4, param0, 16) - 1;
                        var3_int = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((var3_int ^ -1) <= (this.field_I ^ -1)) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        this.field_R[var3_int].b(param0, param1 + 9);
                        this.field_R[var3_int].c(param0, param1 ^ -6);
                        var3_int++;
                        if (var5 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var5 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (this.field_u != 0) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        this.field_n.b(param0, 4);
                        this.field_n.a(param1 ^ 65, param0);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (2 != this.field_u) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        this.field_C.b(param0, param1 ^ -1);
                        this.field_C.c(param0, param1 + 7);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (3 == this.field_u) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        this.field_o.b(param0, 4);
                        this.field_o.a(param0, false);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (this.field_u == 4) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        this.field_V.b(param0, 4);
                        var3_int = 0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (-3 >= (var3_int ^ -1)) {
                            statePc = 34;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackIn_35_0 = 0;
                        stackIn_26_0 = stackIn_35_0;
                        if (var5 != 0) {
                            statePc = 35;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var4 = stackIn_26_0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (5 <= var4) {
                            statePc = 32;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        this.field_P[var3_int][var4].b(param0, 4);
                        var4++;
                        if (var5 != 0) {
                            statePc = 33;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var5 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var3_int++;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var5 == 0) {
                            statePc = 24;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        this.field_X.b(param0, 4);
                        stackIn_35_0 = 0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var3_int = stackIn_35_0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (var3_int >= 2) {
                            statePc = 46;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (var5 != 0) {
                            statePc = 47;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var4 = 0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (-6 >= (var4 ^ -1)) {
                            statePc = 44;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        this.field_P[var3_int][var4].b(9, param0);
                        var4++;
                        if (var5 != 0) {
                            statePc = 45;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var5 == 0) {
                            statePc = 39;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var3_int++;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (var5 == 0) {
                            statePc = 36;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        this.field_V.c(param0, 17);
                        this.field_X.a(param0, (byte) -65);
                        this.field_J = param0.l(8, 59);
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        this.field_G = mu.a(param0, (byte) -39);
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        param0.l((byte) 115);
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 50: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_53_0 = (RuntimeException) (var3);
                    stackIn_51_0 = stackIn_53_0;
                    stackIn_53_1 = new StringBuilder().append("nu.C(");
                    stackIn_51_1 = stackIn_53_1;
                    if (param0 == null) {
                        statePc = 53;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    stackIn_54_0 = (RuntimeException) ((Object) stackIn_51_0);
                    stackIn_54_1 = (StringBuilder) ((Object) stackIn_51_1);
                    stackIn_54_2 = "{...}";
                    statePc = 54;
                    continue stateLoop;
                }
                case 53: {
                    stackIn_54_0 = (RuntimeException) ((Object) stackIn_53_0);
                    stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
                    stackIn_54_2 = "null";
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    throw nb.a((Throwable) ((Object) stackIn_54_0), stackIn_54_2 + ',' + param1 + ')');
                }
                case 55: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(byte param0, ki param1) {
        nl stackIn_63_0 = null;
        nl stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        nl var5 = null;
        try {
          L0: {
            if (-5 == (this.field_u ^ -1)) {
              L1: {
                if (null == this.field_X) {
                  break L1;
                } else {
                  if ((this.field_X.field_m ^ -1) > -41) {
                    break L1;
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              L2: {
                if (this.field_O == -1) {
                  break L2;
                } else {
                  if (this.field_O >= this.field_v) {
                    break L2;
                  } else {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              L3: {
                var3_int = param1.field_u;
                if (param0 > 58) {
                  break L3;
                } else {
                  this.a(95);
                  break L3;
                }
              }
              var4 = param1.field_v & 255;
              if (this.field_R[var3_int].d(3511)) {
                L4: {
                  var5 = this.a((byte) 92, var3_int);
                  if (-2 < (var4 ^ -1)) {
                    break L4;
                  } else {
                    if (-6 > (var4 ^ -1)) {
                      break L4;
                    } else {
                      if (!this.field_h) {
                        this.field_R[var3_int].field_p = var4 + -1;
                        this.field_R[var3_int].a((mo) (this.field_g[var3_int]), (byte) 84);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                L5: {
                  if (0 != var4) {
                    break L5;
                  } else {
                    if (this.field_A) {
                      break L5;
                    } else {
                      L6: {
                        if (var5.field_N.c(var5.field_y, -73)) {
                          break L6;
                        } else {
                          if (this.c(var3_int, -32)) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      if (0 != var5.field_C) {
                        break L5;
                      } else {
                        if (0 == var5.field_u) {
                          var5.a((mo) (this.field_g[var3_int]), (byte) 84);
                          var5.a((byte) -31, 4);
                          var5.field_C = var5.a((byte) -99);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                }
                L7: {
                  L8: {
                    L9: {
                      if ((var4 ^ -1) != -7) {
                        break L9;
                      } else {
                        if (!this.field_y) {
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    if (-8 != (var4 ^ -1)) {
                      break L7;
                    } else {
                      if (!this.field_z) {
                        break L8;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if (var5.field_u != 0) {
                    break L7;
                  } else {
                    if (this.c(var3_int, -126)) {
                      L10: {
                        var5.a((byte) -31, 1);
                        stackIn_63_0 = (nl) (var5);

                        if ((var4 ^ -1) != -8) {
                          stackIn_64_0 = (nl) ((Object) stackIn_63_0);
                          stackIn_64_1 = 0;
                          break L10;
                        } else {
                          stackIn_64_0 = (nl) ((Object) stackIn_63_0);
                          stackIn_64_1 = 1;
                          break L10;
                        }
                      }
                      stackIn_64_0.field_O = stackIn_64_1 != 0;
                      var5.field_L = var5.c((byte) -99);
                      var5.a((mo) (this.field_g[var3_int]), (byte) 84);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                decompiledRegionSelector0 = 4;
                break L0;
              } else {
                decompiledRegionSelector0 = 3;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3 = decompiledCaughtException;
            stackIn_69_0 = (RuntimeException) (var3);

            stackIn_69_1 = new StringBuilder().append("nu.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "null";
              break L11;
            } else {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "{...}";
              break L11;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_70_0), stackIn_70_2 + ')');
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

    final int c(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var4 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = Kickabout.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = 0;
                        if ((this.field_u ^ -1) == -5) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var3 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var3 >= 2) {
                            statePc = 15;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_16_0 = 0;
                        stackIn_7_0 = stackIn_16_0;
                        if (var5 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var4 = stackIn_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var4 >= 5) {
                            statePc = 13;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var2_int = var2_int ^ this.field_P[var3][var4].b((byte) -65);
                        var4++;
                        if (var5 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var5 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var3++;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var5 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var2_int = var2_int ^ this.field_X.c(0);
                        stackIn_16_0 = var2_int ^ this.field_V.d(121);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var2_int = stackIn_16_0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var3 = 71 % ((param0 - 16) / 38);
                        stackIn_18_0 = var2_int;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    return stackIn_18_0;
                }
                case 19: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw nb.a((Throwable) ((Object) var2), "nu.Q(" + param0 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(int param0, boolean param1, long param2, int param3, int param4) {
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        up var11 = null;
        int var12 = 0;
        int var13 = 0;
        var13 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if ((param4 ^ -1) > -3) {
                stackIn_5_0 = 0;
                break L1;
              } else {
                stackIn_5_0 = 1;
                break L1;
              }
            }
            L2: {
              L3: {
                var7_int = stackIn_5_0;
                if (-1272878999116L == (param2 ^ -1L)) {
                  break L3;
                } else {
                  if ((param2 ^ -1L) != -1272878132286L) {
                    stackIn_12_0 = 0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_12_0 = 1;
              break L2;
            }
            L4: {
              var8 = stackIn_12_0;
              if (var8 != 0) {
                break L4;
              } else {
                L5: {
                  if (var7_int == 0) {
                    break L5;
                  } else {
                    if ((param0 ^ -1) == -12) {
                      break L5;
                    } else {
                      break L4;
                    }
                  }
                }
                if (!param1) {
                  var9 = 0;
                  L6: while (true) {
                    L7: {
                      L8: {
                        if (-5 >= (var9 ^ -1)) {
                          break L8;
                        } else {
                          var10 = this.field_g[param3].field_p;
                          stackIn_37_0 = param3;

                          if (var13 != 0) {
                            break L7;
                          } else {
                            L9: {
                              if (stackIn_37_0 != this.field_i[var10][var9]) {
                                break L9;
                              } else {
                                var11 = this.field_P[var10][1 + var9].field_N;
                                var12 = this.field_P[var10][var9 - -1].field_y ? 1 : 0;
                                if (var11.a(true, param0, var12 != 0)) {
                                  stackIn_34_0 = 1;
                                  decompiledRegionSelector0 = 3;
                                  break L0;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            var9++;
                            if (var13 == 0) {
                              continue L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                      stackIn_37_0 = 0;
                      break L7;
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  stackIn_23_0 = 1;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            stackIn_20_0 = 1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var7), "nu.J(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_20_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_23_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_37_0 != 0;
            } else {
              return stackIn_34_0 != 0;
            }
          }
        }
    }

    final int b(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_17_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Kickabout.field_G;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if ((this.field_g.length ^ -1) >= (var3_int ^ -1)) {
                    break L3;
                  } else {
                    stackIn_16_0 = this.field_g[var3_int].field_p;

                    stackIn_16_1 = param1;

                    if (var5 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_16_0 != stackIn_16_1) {
                          break L4;
                        } else {
                          if (this.field_R[var3_int].d(3511)) {
                            stackIn_13_0 = var3_int;
                            decompiledRegionSelector0 = 0;
                            break L0;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var3_int++;
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackIn_16_0 = 120;
                stackIn_16_1 = (param0 - -10) / 47;
                break L2;
              }
              var4 = stackIn_16_0 % stackIn_16_1;
              stackIn_17_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var3), "nu.HA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_13_0;
        } else {
          return stackIn_17_0;
        }
    }

    private final void a(int param0, ki param1) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            if (0 == this.field_u) {
              if (!this.field_R[param1.field_u].d(param0 + 3510)) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param0 == 1) {
                    break L1;
                  } else {
                    nu.b(false);
                    break L1;
                  }
                }
                this.field_n.a(param1.field_u, 11678, param1.field_v);
                this.field_n.a((mo) (this.field_g[param1.field_u]), (byte) 84);
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("nu.KA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
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

    private final void b(int param0) {
        int fieldTemp$0 = 0;
        jc dupTemp$1 = null;
        jc dupTemp$2 = null;
        jc dupTemp$3 = null;
        jc dupTemp$4 = null;
        jc dupTemp$5 = null;
        jc dupTemp$6 = null;
        jc dupTemp$7 = null;
        jc dupTemp$8 = null;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        int stackIn_77_0 = 0;
        int stackIn_77_1 = 0;
        int stackIn_79_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_82_1 = 0;
        int stackIn_126_0 = 0;
        int stackIn_192_0 = 0;
        Object stackIn_195_0 = null;
        Object stackIn_208_0 = null;
        int stackIn_217_0 = 0;
        int stackIn_217_1 = 0;
        int stackIn_219_0 = 0;
        int stackIn_222_0 = 0;
        int stackIn_222_1 = 0;
        int stackIn_256_0 = 0;
        int stackIn_256_1 = 0;
        int stackIn_278_0 = 0;
        int stackIn_292_0 = 0;
        int stackIn_294_0 = 0;
        int stackIn_294_1 = 0;
        int stackIn_296_0 = 0;
        int stackIn_298_0 = 0;
        int stackIn_300_0 = 0;
        int stackIn_302_0 = 0;
        int stackIn_302_1 = 0;
        int stackIn_322_0 = 0;
        int stackIn_322_1 = 0;
        int stackIn_332_0 = 0;
        int stackIn_332_1 = 0;
        tj stackIn_349_0 = null;
        tj stackIn_351_0 = null;
        tj stackIn_352_0 = null;
        int stackIn_352_1 = 0;
        ch stackIn_353_0 = null;
        int stackIn_353_1 = 0;
        int stackIn_353_2 = 0;
        nl stackIn_353_3 = null;
        int stackIn_353_4 = 0;
        int stackIn_353_5 = 0;
        ch stackIn_355_0 = null;
        int stackIn_355_1 = 0;
        int stackIn_355_2 = 0;
        nl stackIn_355_3 = null;
        int stackIn_355_4 = 0;
        int stackIn_355_5 = 0;
        ch stackIn_356_0 = null;
        int stackIn_356_1 = 0;
        int stackIn_356_2 = 0;
        nl stackIn_356_3 = null;
        int stackIn_356_4 = 0;
        int stackIn_356_5 = 0;
        int stackIn_356_6 = 0;
        int stackIn_368_0 = 0;
        int stackIn_368_1 = 0;
        int stackIn_370_0 = 0;
        int stackIn_373_0 = 0;
        int stackIn_373_1 = 0;
        int stackIn_442_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        int statePc = 0;
        int var2_int = 0;
        nl var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        nl var4_ref_nl = null;
        int var4 = 0;
        int var5_int = 0;
        nl var5 = null;
        int var6 = 0;
        nl var6_ref_nl = null;
        int var7 = 0;
        int var8_int = 0;
        nl var8 = null;
        int var9 = 0;
        int var10 = 0;
        long var10_long = 0L;
        int var11 = 0;
        int var12 = 0;
        nl var13 = null;
        int var14 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = Kickabout.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (-1 == this.field_O) {
                        statePc = 8;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if ((this.field_O ^ -1) > (this.field_v ^ -1)) {
                        statePc = 7;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 7: {
                    return;
                }
                case 8: {
                    fieldTemp$0 = this.field_J - 1;
                    this.field_J = this.field_J - 1;
                    if (fieldTemp$0 <= 0) {
                        statePc = 11;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 11: {
                    this.field_J = 255;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (param0 == 11660) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    field_D = (String) null;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    vl.a((nu) (this), (byte) -41);
                    var2_int = 0;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    stackIn_17_0 = -3;
                    stackIn_17_1 = var2_int ^ -1;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (stackIn_17_0 >= stackIn_17_1) {
                        statePc = 60;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackIn_61_0 = 0;
                    stackIn_19_0 = stackIn_61_0;
                    if (var14 != 0) {
                        statePc = 61;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var3 = stackIn_19_0;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if (var3 >= 5) {
                        statePc = 59;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var4_ref_nl = this.field_P[var2_int][var3];
                    stackIn_17_0 = this.field_V.field_m;
                    stackIn_22_0 = stackIn_17_0;
                    stackIn_17_1 = var2_int;
                    stackIn_22_1 = stackIn_17_1;
                    if (var14 != 0) {
                        statePc = 17;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (stackIn_22_0 != stackIn_22_1) {
                        statePc = 28;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if ((var3 ^ -1) != (this.field_V.field_s ^ -1)) {
                        statePc = 28;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackIn_29_0 = 1;
                    statePc = 29;
                    continue stateLoop;
                }
                case 28: {
                    stackIn_29_0 = 0;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    var5_int = stackIn_29_0;
                    var6 = this.a((byte) 6, var2_int, var3);
                    if (-1 == var6) {
                        statePc = 35;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (!this.field_R[var6].field_u) {
                        statePc = 35;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    stackIn_36_0 = 1;
                    statePc = 36;
                    continue stateLoop;
                }
                case 35: {
                    stackIn_36_0 = 0;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    var7 = stackIn_36_0;
                    var4_ref_nl.a(2, this.field_x, var7 != 0, var5_int != 0);
                    if (var2_int != 0) {
                        statePc = 40;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (this.field_s) {
                        statePc = 46;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (1 != var2_int) {
                        statePc = 48;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (!this.field_p) {
                        statePc = 48;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    stackIn_49_0 = 1;
                    statePc = 49;
                    continue stateLoop;
                }
                case 48: {
                    stackIn_49_0 = 0;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    var8_int = stackIn_49_0;
                    if (var3 != 0) {
                        statePc = 53;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    hv.a(true, (nu) (this), var2_int);
                    if (var14 == 0) {
                        statePc = 58;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    if (var8_int != 0) {
                        statePc = 58;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    jt.a((nu) (this), (byte) -127, var3, var2_int);
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    var3++;
                    if (var14 == 0) {
                        statePc = 20;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    var2_int++;
                    if (var14 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    this.field_V.a((byte) -97, this.field_t, this.field_B);
                    this.field_X.a(this.field_V, -123);
                    stackIn_61_0 = -41;
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    if (stackIn_61_0 == (this.field_X.field_m ^ -1)) {
                        statePc = 64;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 64: {
                    this.field_X.field_j[this.field_X.field_n] = this.field_X.field_j[this.field_X.field_n] + 1;
                    this.field_V.field_m = -1;
                    this.field_V.field_r = 205;
                    this.field_P[-this.field_X.field_n + 1][0].field_o = 0;
                    this.a(param0 ^ 11662);
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    if ((this.field_X.field_m ^ -1) > -246) {
                        statePc = 75;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    this.a(-this.field_X.field_n + 1, 0);
                    this.field_X.field_m = 0;
                    var2_int = 0;
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    if ((var2_int ^ -1) <= (this.field_X.field_j.length ^ -1)) {
                        statePc = 75;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    stackIn_77_0 = -100;
                    stackIn_69_0 = stackIn_77_0;
                    stackIn_77_1 = this.field_X.field_j[var2_int] ^ -1;
                    stackIn_69_1 = stackIn_77_1;
                    if (var14 != 0) {
                        statePc = 77;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    if (stackIn_69_0 > stackIn_69_1) {
                        statePc = 73;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 73: {
                    this.field_X.field_j[var2_int] = 99;
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    var2_int++;
                    if (var14 == 0) {
                        statePc = 67;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    var2_int = 0;
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    stackIn_77_0 = 2;
                    stackIn_77_1 = var2_int;
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    if (stackIn_77_0 <= stackIn_77_1) {
                        statePc = 191;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    stackIn_192_0 = 0;
                    stackIn_79_0 = stackIn_192_0;
                    if (var14 != 0) {
                        statePc = 192;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    var3 = stackIn_79_0;
                    statePc = 80;
                    continue stateLoop;
                }
                case 80: {
                    if (var3 >= 5) {
                        statePc = 190;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    var4_ref_nl = this.field_P[var2_int][var3];
                    stackIn_77_0 = var4_ref_nl.field_u;
                    stackIn_82_0 = stackIn_77_0;
                    stackIn_77_1 = 2;
                    stackIn_82_1 = stackIn_77_1;
                    if (var14 != 0) {
                        statePc = 77;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    if (stackIn_82_0 != stackIn_82_1) {
                        statePc = 113;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    if (-21 != (var4_ref_nl.field_L ^ -1)) {
                        statePc = 113;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    if ((var2_int ^ -1) != (this.field_V.field_m ^ -1)) {
                        statePc = 113;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    if ((var3 ^ -1) != (this.field_V.field_s ^ -1)) {
                        statePc = 113;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    if (var4_ref_nl.field_z >= 0) {
                        statePc = 98;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    this.b(-var4_ref_nl.field_z, (byte) -72);
                    if (var14 == 0) {
                        statePc = 113;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    var5_int = var4_ref_nl.a(var4_ref_nl.field_z, (byte) -68);
                    this.a(var5_int, var4_ref_nl.field_O, var4_ref_nl.field_N.c(var4_ref_nl.field_y, (byte) -62), var4_ref_nl.field_x, (byte) -66, var4_ref_nl.field_P);
                    this.field_V.a((mo) (var4_ref_nl), (byte) 84);
                    var6_ref_nl = this.field_P[-var2_int + 1][0];
                    this.field_N.a((nu) (this), 32, this.field_v, var2_int, var4_ref_nl, var5_int, var6_ref_nl, this.field_V.field_o, var3);
                    var7 = this.a((byte) 6, var2_int, var3);
                    if (0 == (var7 ^ -1)) {
                        statePc = 113;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    if (var4_ref_nl.field_O) {
                        statePc = 111;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    if (var5_int >= 128) {
                        statePc = 108;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    dupTemp$1 = this.field_q[var7];
                    dupTemp$1.field_i = dupTemp$1.field_i + 1;
                    if (var14 == 0) {
                        statePc = 113;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    dupTemp$2 = this.field_q[var7];
                    dupTemp$2.field_f = dupTemp$2.field_f + 1;
                    if (var14 == 0) {
                        statePc = 113;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    dupTemp$3 = this.field_q[var7];
                    dupTemp$3.field_q = dupTemp$3.field_q + 1;
                    statePc = 113;
                    continue stateLoop;
                }
                case 113: {
                    if (0 == var4_ref_nl.field_u) {
                        statePc = 189;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    if (-1 <= (var4_ref_nl.field_L ^ -1)) {
                        statePc = 119;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 119: {
                    if (var2_int != this.field_V.field_m) {
                        statePc = 125;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    if ((var3 ^ -1) != (this.field_V.field_s ^ -1)) {
                        statePc = 125;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    stackIn_126_0 = 1;
                    statePc = 126;
                    continue stateLoop;
                }
                case 125: {
                    stackIn_126_0 = 0;
                    statePc = 126;
                    continue stateLoop;
                }
                case 126: {
                    var5_int = stackIn_126_0;
                    if (-3 == (var4_ref_nl.field_u ^ -1)) {
                        statePc = 187;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    if (var4_ref_nl.field_u != 1) {
                        statePc = 133;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    var4_ref_nl.field_L = var4_ref_nl.c((byte) -99);
                    if (var14 == 0) {
                        statePc = 189;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    if (var4_ref_nl.field_u != 5) {
                        statePc = 139;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    var4_ref_nl.a((byte) -31, 6);
                    if (var14 == 0) {
                        statePc = 189;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    if (7 != var4_ref_nl.field_u) {
                        statePc = 145;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    var4_ref_nl.a((byte) -31, 8);
                    if (var14 == 0) {
                        statePc = 189;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    if (-9 != (var4_ref_nl.field_u ^ -1)) {
                        statePc = 151;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    var4_ref_nl.a((byte) -31, 9);
                    if (var14 == 0) {
                        statePc = 189;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    if (var4_ref_nl.field_u != 3) {
                        statePc = 157;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    if (var5_int == 0) {
                        statePc = 184;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    if ((var4_ref_nl.field_u ^ -1) == -13) {
                        statePc = 178;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    if (var4_ref_nl.field_u != 13) {
                        statePc = 166;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    if (0 == var4_ref_nl.field_v) {
                        statePc = 175;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    if (var4_ref_nl.field_u != 14) {
                        statePc = 172;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    var4_ref_nl.field_L = 1;
                    if (var14 == 0) {
                        statePc = 189;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 172: {
                    var4_ref_nl.a((byte) -31, 0);
                    if (var14 == 0) {
                        statePc = 189;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 175: {
                    var4_ref_nl.a((byte) -31, 10);
                    if (var14 == 0) {
                        statePc = 189;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 178: {
                    var4_ref_nl.a((byte) -31, 10);
                    if (var5_int != 0) {
                        statePc = 189;
                    } else {
                        statePc = 181;
                    }
                    continue stateLoop;
                }
                case 181: {
                    var4_ref_nl.field_L = var4_ref_nl.field_L + 60;
                    if (var14 == 0) {
                        statePc = 189;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 184: {
                    var4_ref_nl.a((byte) -31, 10);
                    var4_ref_nl.field_L = var4_ref_nl.field_L + 20;
                    if (var14 == 0) {
                        statePc = 189;
                    } else {
                        statePc = 187;
                    }
                    continue stateLoop;
                }
                case 187: {
                    var4_ref_nl.a((byte) -31, 0);
                    statePc = 189;
                    continue stateLoop;
                }
                case 189: {
                    var3++;
                    if (var14 == 0) {
                        statePc = 80;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    var2_int++;
                    if (var14 == 0) {
                        statePc = 76;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 191: {
                    stackIn_192_0 = 0;
                    statePc = 192;
                    continue stateLoop;
                }
                case 192: {
                    var2_int = stackIn_192_0;
                    statePc = 193;
                    continue stateLoop;
                }
                case 193: {
                    if ((this.field_I ^ -1) >= (var2_int ^ -1)) {
                        statePc = 207;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 194: {
                    stackIn_208_0 = this;
                    stackIn_195_0 = stackIn_208_0;
                    if (var14 != 0) {
                        statePc = 208;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 195: {
                    if (!((nu) (this)).field_R[var2_int].d(3511)) {
                        statePc = 206;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 198: {
                    if (this.field_R[var2_int].field_p == 0) {
                        statePc = 206;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 201: {
                    if (this.c(var2_int, -125)) {
                        statePc = 206;
                    } else {
                        statePc = 204;
                    }
                    continue stateLoop;
                }
                case 204: {
                    this.a(73, this.field_R[var2_int], this.field_R[var2_int].field_p, var2_int);
                    this.field_R[var2_int].field_p = 0;
                    statePc = 206;
                    continue stateLoop;
                }
                case 206: {
                    var2_int++;
                    if (var14 == 0) {
                        statePc = 193;
                    } else {
                        statePc = 207;
                    }
                    continue stateLoop;
                }
                case 207: {
                    stackIn_208_0 = this;
                    statePc = 208;
                    continue stateLoop;
                }
                case 208: {
                    var2 = this.b((byte) -96);
                    if (var2 == null) {
                        statePc = 212;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 209: {
                    this.field_V.field_p = var2.field_w;
                    this.field_V.field_v = var2.field_v;
                    this.field_V.field_t = var2.field_M;
                    if (var14 == 0) {
                        statePc = 252;
                    } else {
                        statePc = 212;
                    }
                    continue stateLoop;
                }
                case 212: {
                    if (!this.field_V.g(param0 ^ -11752)) {
                        statePc = 252;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 215: {
                    var3 = this.field_V.e(10);
                    var4 = 0;
                    statePc = 216;
                    continue stateLoop;
                }
                case 216: {
                    stackIn_217_0 = 2;
                    stackIn_217_1 = var4;
                    statePc = 217;
                    continue stateLoop;
                }
                case 217: {
                    if (stackIn_217_0 <= stackIn_217_1) {
                        statePc = 252;
                    } else {
                        statePc = 218;
                    }
                    continue stateLoop;
                }
                case 218: {
                    stackIn_292_0 = 0;
                    stackIn_219_0 = stackIn_292_0;
                    if (var14 != 0) {
                        statePc = 292;
                    } else {
                        statePc = 219;
                    }
                    continue stateLoop;
                }
                case 219: {
                    var5_int = stackIn_219_0;
                    statePc = 220;
                    continue stateLoop;
                }
                case 220: {
                    if ((var5_int ^ -1) <= -6) {
                        statePc = 251;
                    } else {
                        statePc = 221;
                    }
                    continue stateLoop;
                }
                case 221: {
                    var6_ref_nl = this.field_P[var4][var5_int];
                    var7 = 900;
                    stackIn_217_0 = var5_int ^ -1;
                    stackIn_222_0 = stackIn_217_0;
                    stackIn_217_1 = -1;
                    stackIn_222_1 = stackIn_217_1;
                    if (var14 != 0) {
                        statePc = 217;
                    } else {
                        statePc = 222;
                    }
                    continue stateLoop;
                }
                case 222: {
                    if (stackIn_222_0 != stackIn_222_1) {
                        statePc = 224;
                    } else {
                        statePc = 223;
                    }
                    continue stateLoop;
                }
                case 223: {
                    var8_int = -var6_ref_nl.field_o + 20;
                    var7 = var8_int * var8_int;
                    statePc = 224;
                    continue stateLoop;
                }
                case 224: {
                    if ((var3 ^ -1) < (var7 << 2028798864 ^ -1)) {
                        statePc = 250;
                    } else {
                        statePc = 225;
                    }
                    continue stateLoop;
                }
                case 225: {
                    if (3 == var6_ref_nl.field_u) {
                        statePc = 250;
                    } else {
                        statePc = 228;
                    }
                    continue stateLoop;
                }
                case 228: {
                    if (var6_ref_nl.field_u == 13) {
                        statePc = 250;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 231: {
                    if (var6_ref_nl.field_u == 5) {
                        statePc = 250;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 234: {
                    if (-8 == (var6_ref_nl.field_u ^ -1)) {
                        statePc = 250;
                    } else {
                        statePc = 237;
                    }
                    continue stateLoop;
                }
                case 237: {
                    if ((var6_ref_nl.field_u ^ -1) == -9) {
                        statePc = 250;
                    } else {
                        statePc = 240;
                    }
                    continue stateLoop;
                }
                case 240: {
                    if (-10 == (var6_ref_nl.field_u ^ -1)) {
                        statePc = 250;
                    } else {
                        statePc = 243;
                    }
                    continue stateLoop;
                }
                case 243: {
                    var8_int = var6_ref_nl.f(-127) - this.field_V.a(true);
                    var9 = var6_ref_nl.a(true) - this.field_V.c(879306160);
                    if ((var9 * var9 + var8_int * var8_int ^ -1) <= -1601) {
                        statePc = 250;
                    } else {
                        statePc = 244;
                    }
                    continue stateLoop;
                }
                case 244: {
                    this.field_V.a((mo) (var6_ref_nl), (byte) 84);
                    this.field_V.field_s = var5_int;
                    this.field_V.field_i = 0;
                    this.field_V.field_m = var4;
                    if (0 != var5_int) {
                        statePc = 249;
                    } else {
                        statePc = 250;
                    }
                    continue stateLoop;
                }
                case 249: {
                    this.a(-115, this.field_V, var5_int, this.b((byte) 107, var4));
                    statePc = 250;
                    continue stateLoop;
                }
                case 250: {
                    var5_int++;
                    if (var14 == 0) {
                        statePc = 220;
                    } else {
                        statePc = 251;
                    }
                    continue stateLoop;
                }
                case 251: {
                    var4++;
                    if (var14 == 0) {
                        statePc = 216;
                    } else {
                        statePc = 252;
                    }
                    continue stateLoop;
                }
                case 252: {
                    if (null != var2) {
                        statePc = 291;
                    } else {
                        statePc = 253;
                    }
                    continue stateLoop;
                }
                case 253: {
                    var3 = 0;
                    statePc = 254;
                    continue stateLoop;
                }
                case 254: {
                    if (2 <= var3) {
                        statePc = 291;
                    } else {
                        statePc = 255;
                    }
                    continue stateLoop;
                }
                case 255: {
                    var4_ref_nl = this.field_P[var3][0];
                    stackIn_294_0 = var4_ref_nl.field_u ^ -1;
                    stackIn_256_0 = stackIn_294_0;
                    stackIn_294_1 = -3;
                    stackIn_256_1 = stackIn_294_1;
                    if (var14 != 0) {
                        statePc = 294;
                    } else {
                        statePc = 256;
                    }
                    continue stateLoop;
                }
                case 256: {
                    if (stackIn_256_0 == stackIn_256_1) {
                        statePc = 290;
                    } else {
                        statePc = 259;
                    }
                    continue stateLoop;
                }
                case 259: {
                    if ((var4_ref_nl.field_u ^ -1) != -4) {
                        statePc = 265;
                    } else {
                        statePc = 262;
                    }
                    continue stateLoop;
                }
                case 262: {
                    if (var14 == 0) {
                        statePc = 290;
                    } else {
                        statePc = 265;
                    }
                    continue stateLoop;
                }
                case 265: {
                    var5_int = this.field_V.a(true) - var4_ref_nl.f(-102);
                    var6 = this.field_V.c(879306160) - var4_ref_nl.a(true);
                    var7 = var6 * var6 + var5_int * var5_int;
                    if (-785 < (var7 ^ -1)) {
                        statePc = 268;
                    } else {
                        statePc = 290;
                    }
                    continue stateLoop;
                }
                case 268: {
                    var8_int = uv.b(var6, var5_int, (byte) 2);
                    var9 = 511 & 693 * var4_ref_nl.f(-99);
                    if (256 <= var9) {
                        statePc = 271;
                    } else {
                        statePc = 269;
                    }
                    continue stateLoop;
                }
                case 269: {
                    var9 -= 512;
                    statePc = 271;
                    continue stateLoop;
                }
                case 271: {
                    var8_int = 8191 & var8_int - (-8192 - var9);
                    if (-6 == (var4_ref_nl.field_u ^ -1)) {
                        statePc = 274;
                    } else {
                        statePc = 286;
                    }
                    continue stateLoop;
                }
                case 274: {
                    if (var3 == 0) {
                        statePc = 277;
                    } else {
                        statePc = 275;
                    }
                    continue stateLoop;
                }
                case 275: {
                    stackIn_278_0 = -1024;
                    statePc = 278;
                    continue stateLoop;
                }
                case 277: {
                    stackIn_278_0 = 1024;
                    statePc = 278;
                    continue stateLoop;
                }
                case 278: {
                    var10 = stackIn_278_0;
                    if ((var4_ref_nl.field_G & 2) != 0) {
                        statePc = 281;
                    } else {
                        statePc = 282;
                    }
                    continue stateLoop;
                }
                case 281: {
                    var8_int = 8191 & -var10 + (8192 + var8_int);
                    statePc = 282;
                    continue stateLoop;
                }
                case 282: {
                    if (0 != (var4_ref_nl.field_G & 8)) {
                        statePc = 285;
                    } else {
                        statePc = 286;
                    }
                    continue stateLoop;
                }
                case 285: {
                    var8_int = 8191 & var10 + var8_int - -8192;
                    statePc = 286;
                    continue stateLoop;
                }
                case 286: {
                    this.field_V.a((mo) (var4_ref_nl), (byte) 84);
                    var10 = pc.a(this.field_V.e(3), -524289) >> -1020370264;
                    this.field_V.field_q = (we.a(var8_int, false) >> -1040016728) * var10;
                    this.field_V.field_h = var10 * (ei.a(var8_int, (byte) -23) >> -1786263928);
                    this.field_V.a((byte) -78, this.field_t, this.field_B);
                    if ((var4_ref_nl.field_o ^ -1) > -16) {
                        statePc = 289;
                    } else {
                        statePc = 290;
                    }
                    continue stateLoop;
                }
                case 289: {
                    var4_ref_nl.field_o = var4_ref_nl.field_o + 1;
                    statePc = 290;
                    continue stateLoop;
                }
                case 290: {
                    var3++;
                    if (var14 == 0) {
                        statePc = 254;
                    } else {
                        statePc = 291;
                    }
                    continue stateLoop;
                }
                case 291: {
                    stackIn_292_0 = 0;
                    statePc = 292;
                    continue stateLoop;
                }
                case 292: {
                    var3 = stackIn_292_0;
                    statePc = 293;
                    continue stateLoop;
                }
                case 293: {
                    stackIn_294_0 = -3;
                    stackIn_294_1 = var3 ^ -1;
                    statePc = 294;
                    continue stateLoop;
                }
                case 294: {
                    if (stackIn_294_0 >= stackIn_294_1) {
                        statePc = 441;
                    } else {
                        statePc = 295;
                    }
                    continue stateLoop;
                }
                case 295: {
                    stackIn_442_0 = 0;
                    stackIn_296_0 = stackIn_442_0;
                    if (var14 != 0) {
                        statePc = 442;
                    } else {
                        statePc = 296;
                    }
                    continue stateLoop;
                }
                case 296: {
                    stackIn_298_0 = stackIn_296_0;
                    statePc = 298;
                    continue stateLoop;
                }
                case 298: {
                    var4 = stackIn_298_0;
                    statePc = 299;
                    continue stateLoop;
                }
                case 299: {
                    stackIn_300_0 = -6;
                    statePc = 300;
                    continue stateLoop;
                }
                case 300: {
                    if (stackIn_300_0 >= (var4 ^ -1)) {
                        statePc = 440;
                    } else {
                        statePc = 301;
                    }
                    continue stateLoop;
                }
                case 301: {
                    var5 = this.field_P[var3][var4];
                    stackIn_294_0 = -4;
                    stackIn_302_0 = stackIn_294_0;
                    stackIn_294_1 = var5.field_u ^ -1;
                    stackIn_302_1 = stackIn_294_1;
                    if (var14 != 0) {
                        statePc = 294;
                    } else {
                        statePc = 302;
                    }
                    continue stateLoop;
                }
                case 302: {
                    if (stackIn_302_0 == stackIn_302_1) {
                        statePc = 309;
                    } else {
                        statePc = 303;
                    }
                    continue stateLoop;
                }
                case 303: {
                    if (-14 == (var5.field_u ^ -1)) {
                        statePc = 309;
                    } else {
                        statePc = 306;
                    }
                    continue stateLoop;
                }
                case 306: {
                    if (var14 == 0) {
                        statePc = 439;
                    } else {
                        statePc = 309;
                    }
                    continue stateLoop;
                }
                case 309: {
                    if (this.field_V.field_m != -1) {
                        statePc = 365;
                    } else {
                        statePc = 312;
                    }
                    continue stateLoop;
                }
                case 312: {
                    if ((Math.abs(-var5.field_v + this.field_V.field_v) >> 1289666544 ^ -1) <= -31) {
                        statePc = 365;
                    } else {
                        statePc = 315;
                    }
                    continue stateLoop;
                }
                case 315: {
                    if ((this.field_V.field_r ^ -1) != -1) {
                        statePc = 365;
                    } else {
                        statePc = 318;
                    }
                    continue stateLoop;
                }
                case 318: {
                    var6 = var5.f(param0 + -11776) + -this.field_V.a(true);
                    var7 = var5.a(true) - this.field_V.c(879306160);
                    var8_int = var7 * var7 + var6 * var6;
                    if (-1601 >= (var8_int ^ -1)) {
                        statePc = 365;
                    } else {
                        statePc = 319;
                    }
                    continue stateLoop;
                }
                case 319: {
                    this.field_V.a((mo) (var5), (byte) 84);
                    var9 = (4 * var5.field_N.d(var5.field_y, 0) << -1563718448) / 100 + 524288;
                    var10_long = (long)(var9 + Math.max(var5.field_q, pc.a(this.field_V.e(-127), -524289)));
                    this.field_V.field_r = 5;
                    this.field_V.field_h = (int)((long)var5.field_m * var10_long / (long)var5.field_q);
                    this.field_V.field_q = (int)(var10_long * (long)var5.field_k / (long)var5.field_q);
                    var12 = 0;
                    statePc = 320;
                    continue stateLoop;
                }
                case 320: {
                    if (var12 >= this.field_I) {
                        statePc = 331;
                    } else {
                        statePc = 321;
                    }
                    continue stateLoop;
                }
                case 321: {
                    stackIn_332_0 = this.field_g[var12].field_p;
                    stackIn_322_0 = stackIn_332_0;
                    stackIn_332_1 = var3;
                    stackIn_322_1 = stackIn_332_1;
                    if (var14 != 0) {
                        statePc = 332;
                    } else {
                        statePc = 322;
                    }
                    continue stateLoop;
                }
                case 322: {
                    if (stackIn_322_0 != stackIn_322_1) {
                        statePc = 330;
                    } else {
                        statePc = 325;
                    }
                    continue stateLoop;
                }
                case 325: {
                    if ((this.field_R[var12].field_g ^ -1) != (var4 ^ -1)) {
                        statePc = 330;
                    } else {
                        statePc = 328;
                    }
                    continue stateLoop;
                }
                case 328: {
                    this.field_V.field_j = var12;
                    statePc = 330;
                    continue stateLoop;
                }
                case 330: {
                    var12++;
                    if (var14 == 0) {
                        statePc = 320;
                    } else {
                        statePc = 331;
                    }
                    continue stateLoop;
                }
                case 331: {
                    var12 = this.a((byte) 6, var3, var4);
                    stackIn_332_0 = 13;
                    stackIn_332_1 = var5.field_u;
                    statePc = 332;
                    continue stateLoop;
                }
                case 332: {
                    if (stackIn_332_0 != stackIn_332_1) {
                        statePc = 345;
                    } else {
                        statePc = 333;
                    }
                    continue stateLoop;
                }
                case 333: {
                    if (-3 != (this.field_V.field_i ^ -1)) {
                        statePc = 345;
                    } else {
                        statePc = 336;
                    }
                    continue stateLoop;
                }
                case 336: {
                    if ((this.field_V.field_o ^ -1) == 0) {
                        statePc = 345;
                    } else {
                        statePc = 339;
                    }
                    continue stateLoop;
                }
                case 339: {
                    if (0 == (var12 ^ -1)) {
                        statePc = 345;
                    } else {
                        statePc = 342;
                    }
                    continue stateLoop;
                }
                case 342: {
                    if ((this.field_V.field_o ^ -1) != (var12 ^ -1)) {
                        statePc = 345;
                    } else {
                        statePc = 345;
                    }
                    continue stateLoop;
                }
                case 345: {
                    if ((var12 ^ -1) == 0) {
                        statePc = 348;
                    } else {
                        statePc = 346;
                    }
                    continue stateLoop;
                }
                case 346: {
                    this.field_V.field_o = var12;
                    statePc = 348;
                    continue stateLoop;
                }
                case 348: {
                    stackIn_351_0 = this.field_V;
                    stackIn_349_0 = stackIn_351_0;
                    if ((var5.field_u ^ -1) == -14) {
                        statePc = 351;
                    } else {
                        statePc = 349;
                    }
                    continue stateLoop;
                }
                case 349: {
                    stackIn_352_0 = (tj) ((Object) stackIn_349_0);
                    stackIn_352_1 = 1;
                    statePc = 352;
                    continue stateLoop;
                }
                case 351: {
                    stackIn_352_0 = (tj) ((Object) stackIn_351_0);
                    stackIn_352_1 = 2;
                    statePc = 352;
                    continue stateLoop;
                }
                case 352: {
                    stackIn_352_0.field_i = stackIn_352_1;
                    var13 = this.field_P[-var3 + 1][0];
                    stackIn_355_0 = this.field_N;
                    stackIn_353_0 = stackIn_355_0;
                    stackIn_355_1 = 35;
                    stackIn_353_1 = stackIn_355_1;
                    stackIn_355_2 = this.field_V.field_o;
                    stackIn_353_2 = stackIn_355_2;
                    stackIn_355_3 = (nl) (var13);
                    stackIn_353_3 = stackIn_355_3;
                    stackIn_355_4 = var4;
                    stackIn_353_4 = stackIn_355_4;
                    stackIn_355_5 = this.field_v;
                    stackIn_353_5 = stackIn_355_5;
                    if (var5.field_u != 13) {
                        statePc = 355;
                    } else {
                        statePc = 353;
                    }
                    continue stateLoop;
                }
                case 353: {
                    stackIn_356_0 = (ch) ((Object) stackIn_353_0);
                    stackIn_356_1 = stackIn_353_1;
                    stackIn_356_2 = stackIn_353_2;
                    stackIn_356_3 = (nl) ((Object) stackIn_353_3);
                    stackIn_356_4 = stackIn_353_4;
                    stackIn_356_5 = stackIn_353_5;
                    stackIn_356_6 = 3;
                    statePc = 356;
                    continue stateLoop;
                }
                case 355: {
                    stackIn_356_0 = (ch) ((Object) stackIn_355_0);
                    stackIn_356_1 = stackIn_355_1;
                    stackIn_356_2 = stackIn_355_2;
                    stackIn_356_3 = (nl) ((Object) stackIn_355_3);
                    stackIn_356_4 = stackIn_355_4;
                    stackIn_356_5 = stackIn_355_5;
                    stackIn_356_6 = 2;
                    statePc = 356;
                    continue stateLoop;
                }
                case 356: {
                    ((ch) (Object) stackIn_356_0).a((byte) stackIn_356_1, stackIn_356_2, stackIn_356_3, stackIn_356_4, stackIn_356_5, stackIn_356_6, var3, (nu) (this), var5);
                    if (0 != (var5.field_F ^ -1)) {
                        statePc = 359;
                    } else {
                        statePc = 365;
                    }
                    continue stateLoop;
                }
                case 359: {
                    if (var5.field_u != 13) {
                        statePc = 363;
                    } else {
                        statePc = 360;
                    }
                    continue stateLoop;
                }
                case 360: {
                    dupTemp$4 = this.field_q[var5.field_F];
                    dupTemp$4.field_h = dupTemp$4.field_h + 1;
                    if (var14 == 0) {
                        statePc = 365;
                    } else {
                        statePc = 363;
                    }
                    continue stateLoop;
                }
                case 363: {
                    dupTemp$5 = this.field_q[var5.field_F];
                    dupTemp$5.field_j = dupTemp$5.field_j + 1;
                    statePc = 365;
                    continue stateLoop;
                }
                case 365: {
                    if ((var5.field_u ^ -1) != -4) {
                        statePc = 439;
                    } else {
                        statePc = 366;
                    }
                    continue stateLoop;
                }
                case 366: {
                    var6 = 0;
                    statePc = 367;
                    continue stateLoop;
                }
                case 367: {
                    stackIn_368_0 = 2;
                    stackIn_368_1 = var6;
                    statePc = 368;
                    continue stateLoop;
                }
                case 368: {
                    if (stackIn_368_0 <= stackIn_368_1) {
                        statePc = 439;
                    } else {
                        statePc = 369;
                    }
                    continue stateLoop;
                }
                case 369: {
                    stackIn_300_0 = 0;
                    stackIn_370_0 = stackIn_300_0;
                    if (var14 != 0) {
                        statePc = 300;
                    } else {
                        statePc = 370;
                    }
                    continue stateLoop;
                }
                case 370: {
                    var7 = stackIn_370_0;
                    statePc = 371;
                    continue stateLoop;
                }
                case 371: {
                    if (var7 >= 5) {
                        statePc = 438;
                    } else {
                        statePc = 372;
                    }
                    continue stateLoop;
                }
                case 372: {
                    stackIn_368_0 = var3;
                    stackIn_373_0 = stackIn_368_0;
                    stackIn_368_1 = var6;
                    stackIn_373_1 = stackIn_368_1;
                    if (var14 != 0) {
                        statePc = 368;
                    } else {
                        statePc = 373;
                    }
                    continue stateLoop;
                }
                case 373: {
                    if (stackIn_373_0 != stackIn_373_1) {
                        statePc = 380;
                    } else {
                        statePc = 374;
                    }
                    continue stateLoop;
                }
                case 374: {
                    if (var7 != var4) {
                        statePc = 380;
                    } else {
                        statePc = 377;
                    }
                    continue stateLoop;
                }
                case 377: {
                    if (var14 == 0) {
                        statePc = 437;
                    } else {
                        statePc = 380;
                    }
                    continue stateLoop;
                }
                case 380: {
                    var8 = this.field_P[var6][var7];
                    if (0 == var4) {
                        statePc = 402;
                    } else {
                        statePc = 381;
                    }
                    continue stateLoop;
                }
                case 381: {
                    if (var3 != var6) {
                        statePc = 390;
                    } else {
                        statePc = 384;
                    }
                    continue stateLoop;
                }
                case 384: {
                    if (!this.field_F[var6]) {
                        statePc = 390;
                    } else {
                        statePc = 387;
                    }
                    continue stateLoop;
                }
                case 387: {
                    if (var14 == 0) {
                        statePc = 437;
                    } else {
                        statePc = 390;
                    }
                    continue stateLoop;
                }
                case 390: {
                    if (var3 != var6) {
                        statePc = 396;
                    } else {
                        statePc = 393;
                    }
                    continue stateLoop;
                }
                case 393: {
                    if (!var5.field_N.b(false, var5.field_y)) {
                        statePc = 437;
                    } else {
                        statePc = 396;
                    }
                    continue stateLoop;
                }
                case 396: {
                    if (var6 != var3) {
                        statePc = 402;
                    } else {
                        statePc = 399;
                    }
                    continue stateLoop;
                }
                case 399: {
                    if (var8.field_N.b(var8.field_y, (byte) -111)) {
                        statePc = 437;
                    } else {
                        statePc = 402;
                    }
                    continue stateLoop;
                }
                case 402: {
                    var9 = var5.f(-122) - var8.f(-94);
                    var10 = var5.a(true) + -var8.a(true);
                    if (-1601 >= (var9 * var9 - -(var10 * var10) ^ -1)) {
                        statePc = 437;
                    } else {
                        statePc = 403;
                    }
                    continue stateLoop;
                }
                case 403: {
                    if (4 == var8.field_J) {
                        statePc = 437;
                    } else {
                        statePc = 406;
                    }
                    continue stateLoop;
                }
                case 406: {
                    var8.a((byte) -31, 7);
                    var8.field_L = var8.field_L + var5.field_N.a(var5.field_y, false);
                    var8.a((mo) (var5), (byte) 84);
                    if (var4 != 0) {
                        statePc = 411;
                    } else {
                        statePc = 412;
                    }
                    continue stateLoop;
                }
                case 411: {
                    var11 = var5.field_L;
                    var5.a((byte) -31, 12);
                    var5.field_L = var11;
                    statePc = 412;
                    continue stateLoop;
                }
                case 412: {
                    var11 = this.a((byte) 6, var6, var7);
                    if (0 != (var11 ^ -1)) {
                        statePc = 415;
                    } else {
                        statePc = 416;
                    }
                    continue stateLoop;
                }
                case 415: {
                    dupTemp$6 = this.field_q[var11];
                    dupTemp$6.field_a = dupTemp$6.field_a + 1;
                    statePc = 416;
                    continue stateLoop;
                }
                case 416: {
                    if ((var6 ^ -1) != (this.field_V.field_m ^ -1)) {
                        statePc = 420;
                    } else {
                        statePc = 417;
                    }
                    continue stateLoop;
                }
                case 417: {
                    if (this.field_V.field_s == var7) {
                        statePc = 426;
                    } else {
                        statePc = 420;
                    }
                    continue stateLoop;
                }
                case 420: {
                    if (-1 != var5.field_F) {
                        statePc = 425;
                    } else {
                        statePc = 437;
                    }
                    continue stateLoop;
                }
                case 425: {
                    dupTemp$7 = this.field_q[var5.field_F];
                    dupTemp$7.field_c = dupTemp$7.field_c + 1;
                    if (var14 == 0) {
                        statePc = 437;
                    } else {
                        statePc = 426;
                    }
                    continue stateLoop;
                }
                case 426: {
                    this.field_V.field_s = var4;
                    this.field_V.field_m = var3;
                    if (-1 == (this.field_V.field_s ^ -1)) {
                        statePc = 434;
                    } else {
                        statePc = 429;
                    }
                    continue stateLoop;
                }
                case 429: {
                    if (this.a((byte) 6, var3, var4) != -1) {
                        statePc = 434;
                    } else {
                        statePc = 432;
                    }
                    continue stateLoop;
                }
                case 432: {
                    this.a(-127, this.field_V, var4, this.b((byte) 49, var3));
                    statePc = 434;
                    continue stateLoop;
                }
                case 434: {
                    if ((var5.field_F ^ -1) == 0) {
                        statePc = 437;
                    } else {
                        statePc = 435;
                    }
                    continue stateLoop;
                }
                case 435: {
                    dupTemp$8 = this.field_q[var5.field_F];
                    dupTemp$8.field_m = dupTemp$8.field_m + 1;
                    statePc = 437;
                    continue stateLoop;
                }
                case 437: {
                    var7++;
                    if (var14 == 0) {
                        statePc = 371;
                    } else {
                        statePc = 438;
                    }
                    continue stateLoop;
                }
                case 438: {
                    var6++;
                    if (var14 == 0) {
                        statePc = 367;
                    } else {
                        statePc = 439;
                    }
                    continue stateLoop;
                }
                case 439: {
                    var4++;
                    if (var14 == 0) {
                        statePc = 299;
                    } else {
                        statePc = 440;
                    }
                    continue stateLoop;
                }
                case 440: {
                    var3++;
                    if (var14 == 0) {
                        statePc = 293;
                    } else {
                        statePc = 441;
                    }
                    continue stateLoop;
                }
                case 441: {
                    stackIn_442_0 = 0;
                    statePc = 442;
                    continue stateLoop;
                }
                case 442: {
                    if (stackIn_442_0 == (this.field_V.field_m ^ -1)) {
                        statePc = 446;
                    } else {
                        statePc = 443;
                    }
                    continue stateLoop;
                }
                case 443: {
                    if (0 != (this.field_V.field_s ^ -1)) {
                        statePc = 446;
                    } else {
                        statePc = 446;
                    }
                    continue stateLoop;
                }
                case 446: {
                    if (null == this.b((byte) -96)) {
                        statePc = 453;
                    } else {
                        statePc = 447;
                    }
                    continue stateLoop;
                }
                case 447: {
                    if ((this.a((byte) 6, this.field_V.field_m, this.field_V.field_s) ^ -1) != 0) {
                        statePc = 452;
                    } else {
                        statePc = 453;
                    }
                    continue stateLoop;
                }
                case 452: {
                    this.field_V.field_o = this.a((byte) 6, this.field_V.field_m, this.field_V.field_s);
                    statePc = 453;
                    continue stateLoop;
                }
                case 453: {
                    if (this.field_ab == null) {
                        statePc = 458;
                    } else {
                        statePc = 454;
                    }
                    continue stateLoop;
                }
                case 454: {
                    this.field_ab.a(-27626, (nu) (this));
                    statePc = 458;
                    continue stateLoop;
                }
                case 458: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(nu param0, byte param1) {
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = Kickabout.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (this.field_I <= var3_int) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        this.field_g[var3_int].a(param0.field_g[var3_int], false);
                        var3_int++;
                        if (var5 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var5 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var3_int = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((var3_int ^ -1) <= -3) {
                            statePc = 20;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackIn_21_0 = 0;
                        stackIn_10_0 = stackIn_21_0;
                        if (var5 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_12_0 = stackIn_10_0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var4 = stackIn_12_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if ((var4 ^ -1) <= -5) {
                            statePc = 18;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        this.field_i[var3_int][var4] = param0.field_i[var3_int][var4];
                        this.field_k[var3_int][var4] = param0.field_k[var3_int][var4];
                        this.field_b[var3_int][var4].a((byte) -89, param0.field_b[var3_int][var4]);
                        var4++;
                        if (var5 != 0) {
                            statePc = 19;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var5 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        this.field_r[var3_int] = param0.field_r[var3_int];
                        this.field_H[var3_int] = param0.field_H[var3_int];
                        this.field_d[var3_int] = param0.field_d[var3_int];
                        this.field_Q[var3_int] = param0.field_Q[var3_int];
                        var3_int++;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var5 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        this.field_m = param0.field_m;
                        this.field_Z = param0.field_Z;
                        this.field_t = param0.field_t;
                        stackIn_21_0 = this.field_u;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (stackIn_21_0 == param0.field_u) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        this.a(param0.field_u, (byte) -125);
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        this.field_v = param0.field_v;
                        var3_int = 0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if ((this.field_I ^ -1) >= (var3_int ^ -1)) {
                            statePc = 30;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        this.field_R[var3_int].a(param0.field_R[var3_int], false);
                        var3_int++;
                        if (var5 != 0) {
                            statePc = 33;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var5 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (0 != this.field_u) {
                            statePc = 33;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        this.field_n.a(param0.field_n, false);
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (this.field_u != 2) {
                            statePc = 36;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        this.field_C.a(param0.field_C, false);
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (this.field_u == 3) {
                            statePc = 39;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        this.field_o.a(param0.field_o, false);
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (param1 > 42) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 41: {
                    return;
                }
                case 42: {
                    try {
                        if (this.field_u == 4) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var3_int = 0;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (2 <= var3_int) {
                            statePc = 56;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackIn_65_0 = 0;
                        stackIn_48_0 = stackIn_65_0;
                        if (var5 != 0) {
                            statePc = 65;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var4 = stackIn_48_0;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if ((var4 ^ -1) <= -6) {
                            statePc = 54;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        this.field_P[var3_int][var4].a(param0.field_P[var3_int][var4], false);
                        var4++;
                        if (var5 != 0) {
                            statePc = 55;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var5 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var3_int++;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (var5 == 0) {
                            statePc = 46;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        this.field_V.a(param0.field_V, false);
                        this.field_X.a(param0.field_X, false);
                        this.field_J = param0.field_J;
                        this.field_G = param0.field_G;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (this.field_N != null) {
                            statePc = 60;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        this.field_N.a(-4, param0.field_N);
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (this.field_q != null) {
                            statePc = 64;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        stackIn_65_0 = 0;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var3_int = stackIn_65_0;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if ((this.field_q.length ^ -1) >= (var3_int ^ -1)) {
                            statePc = 71;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        this.field_q[var3_int].a(true, param0.field_q[var3_int]);
                        var3_int++;
                        if (var5 != 0) {
                            statePc = 74;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (var5 == 0) {
                            statePc = 66;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (this.field_ab != null) {
                            statePc = 74;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        this.field_ab.a(120, param0.field_ab);
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 76: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_79_0 = (RuntimeException) (var3);
                    stackIn_77_0 = stackIn_79_0;
                    stackIn_79_1 = new StringBuilder().append("nu.DA(");
                    stackIn_77_1 = stackIn_79_1;
                    if (param0 == null) {
                        statePc = 79;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    stackIn_80_0 = (RuntimeException) ((Object) stackIn_77_0);
                    stackIn_80_1 = (StringBuilder) ((Object) stackIn_77_1);
                    stackIn_80_2 = "{...}";
                    statePc = 80;
                    continue stateLoop;
                }
                case 79: {
                    stackIn_80_0 = (RuntimeException) ((Object) stackIn_79_0);
                    stackIn_80_1 = (StringBuilder) ((Object) stackIn_79_1);
                    stackIn_80_2 = "null";
                    statePc = 80;
                    continue stateLoop;
                }
                case 80: {
                    throw nb.a((Throwable) ((Object) stackIn_80_0), stackIn_80_2 + ',' + param1 + ')');
                }
                case 81: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void b(boolean param0) {
        RuntimeException runtimeException = null;
        dt[] var1 = null;
        int var2 = 0;
        dt var3 = null;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Kickabout.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (null == af.field_a) {
                            statePc = 7;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (!nw.field_b.field_R[ek.field_G].d(3511)) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return;
                }
                case 8: {
                    try {
                        var1 = af.field_a;
                        var2 = 0;
                        if (!param0) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        nu.b(false);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((var1.length ^ -1) >= (var2 ^ -1)) {
                            statePc = 18;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var3 = var1[var2];
                        var3.a((byte) 10);
                        var2++;
                        if (var4 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var4 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw nb.a((Throwable) ((Object) runtimeException), "nu.BA(" + param0 + ')');
                }
                case 18: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(nl param0, byte param1) {
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        tj var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Kickabout.field_G;
        try {
          L0: {
            var3_int = param0.field_M;
            var4 = param0.field_w;
            var5 = new tj();
            var5.a(this.field_V, false);
            var8 = -3 / ((param1 - -30) / 33);
            var6 = 2147483647;
            var7 = 0;
            var7 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var7 >= param0.field_L) {
                    break L3;
                  } else {
                    var3_int = var3_int + param0.field_k;
                    var4 = var4 + param0.field_m;
                    var5.a((byte) -85, this.field_t, this.field_B);
                    stackIn_12_0 = var7;

                    stackIn_12_1 = 10;

                    if (var12 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_12_0 > stackIn_12_1) {
                          var9 = -var3_int + var5.field_t >> -363182576;
                          var10 = var5.field_p + -var4 >> -1079648304;
                          var11 = var9 * var9 - -(var10 * var10);
                          if ((var6 ^ -1) >= (var11 ^ -1)) {
                            break L3;
                          } else {
                            var6 = var11;
                            break L4;
                          }
                        } else {
                          break L4;
                        }
                      }
                      var7++;
                      if (var12 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackIn_12_0 = -10001;
                stackIn_12_1 = var6 ^ -1;
                break L2;
              }
              L5: {
                if (stackIn_12_0 >= stackIn_12_1) {
                  break L5;
                } else {
                  if (var7 > 1) {
                    param0.field_B = (-param0.field_w + var5.field_p) / var7;
                    param0.field_L = var7 + 1;
                    param0.field_r = (var5.field_t - param0.field_M) / var7;
                    param0.field_s = true;
                    var9 = -param0.field_v + var5.field_v + -327680;
                    if (var9 <= 0) {
                      break L5;
                    } else {
                      if (param0.field_v == 0) {
                        L6: {
                          param0.field_K = (var9 + (var7 * 26214 * var7 >> 524113633)) / var7;
                          if (458752 < param0.field_K) {
                            param0.field_K = 458752;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        param0.a((byte) -31, 13);
                        param0.field_L = (param0.field_K << 568114689) / 26214;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  } else {
                    break L5;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var3);

            stackIn_33_1 = new StringBuilder().append("nu.N(");

            if (param0 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L7;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L7;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param1 + ')');
        }
    }

    private final void b(boolean param0, ki param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        nl var4 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_u == 4) {
              L1: {
                if (this.field_X == null) {
                  break L1;
                } else {
                  if (40 <= this.field_X.field_m) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (-1 == this.field_O) {
                  break L2;
                } else {
                  if ((this.field_v ^ -1) >= (this.field_O ^ -1)) {
                    break L2;
                  } else {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              L3: {
                if (param0) {
                  break L3;
                } else {
                  this.field_y = true;
                  break L3;
                }
              }
              L4: {
                var3_int = param1.field_u;
                if (!this.field_R[var3_int].d(3511)) {
                  break L4;
                } else {
                  if (!this.field_Y) {
                    var4 = this.a((byte) -94, var3_int);
                    var4.field_G = param1.field_v;
                    var4.a((mo) (this.field_g[var3_int]), (byte) 84);
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    break L4;
                  }
                }
              }
              decompiledRegionSelector0 = 3;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (runtimeException);

            stackIn_25_1 = new StringBuilder().append("nu.AA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L5;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L5;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
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

    private final void a(boolean param0, ki param1) {
        tj stackIn_23_0 = null;
        tj stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        tj stackIn_31_0 = null;
        tj stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        tj stackIn_39_0 = null;
        tj stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        tj stackIn_47_0 = null;
        tj stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        tj stackIn_58_0 = null;
        tj stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        tj stackIn_66_0 = null;
        tj stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        gt stackIn_74_0 = null;
        gt stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        Object stackIn_82_0 = null;
        Object stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_89_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        gt var4 = null;
        try {
          L0: {
            if ((this.field_u ^ -1) == -5) {
              L1: {
                var3_int = param1.field_v;
                var4 = this.field_R[param1.field_u];
                if (-1 != (var3_int ^ -1)) {
                  break L1;
                } else {
                  var4.field_l = var4.field_l ^ 1;
                  break L1;
                }
              }
              L2: {
                if (var3_int == 1) {
                  var4.field_l = var4.field_l ^ 2;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if ((var3_int ^ -1) == -3) {
                  var4.field_l = var4.field_l ^ 4;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if ((var3_int ^ -1) == -4) {
                  var4.field_l = var4.field_l ^ 8;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (-5 == (var3_int ^ -1)) {
                  L6: {
                    stackIn_23_0 = this.field_V;

                    if (-4 != (this.field_V.field_l ^ -1)) {
                      stackIn_24_0 = (tj) ((Object) stackIn_23_0);
                      stackIn_24_1 = 3;
                      break L6;
                    } else {
                      stackIn_24_0 = (tj) ((Object) stackIn_23_0);
                      stackIn_24_1 = mp.field_p[this.field_t];
                      break L6;
                    }
                  }
                  stackIn_24_0.field_l = stackIn_24_1;
                  break L5;
                } else {
                  break L5;
                }
              }
              L7: {
                if (var3_int == 5) {
                  L8: {
                    stackIn_31_0 = this.field_V;

                    if (this.field_V.field_l != 4) {
                      stackIn_32_0 = (tj) ((Object) stackIn_31_0);
                      stackIn_32_1 = 4;
                      break L8;
                    } else {
                      stackIn_32_0 = (tj) ((Object) stackIn_31_0);
                      stackIn_32_1 = mp.field_p[this.field_t];
                      break L8;
                    }
                  }
                  stackIn_32_0.field_l = stackIn_32_1;
                  break L7;
                } else {
                  break L7;
                }
              }
              L9: {
                if ((var3_int ^ -1) == -7) {
                  L10: {
                    stackIn_39_0 = this.field_V;

                    if (this.field_V.field_l != 5) {
                      stackIn_40_0 = (tj) ((Object) stackIn_39_0);
                      stackIn_40_1 = 5;
                      break L10;
                    } else {
                      stackIn_40_0 = (tj) ((Object) stackIn_39_0);
                      stackIn_40_1 = mp.field_p[this.field_t];
                      break L10;
                    }
                  }
                  stackIn_40_0.field_l = stackIn_40_1;
                  break L9;
                } else {
                  break L9;
                }
              }
              L11: {
                if (var3_int != 7) {
                  break L11;
                } else {
                  L12: {
                    stackIn_47_0 = this.field_V;

                    if (-7 == (this.field_V.field_l ^ -1)) {
                      stackIn_48_0 = (tj) ((Object) stackIn_47_0);
                      stackIn_48_1 = mp.field_p[this.field_t];
                      break L12;
                    } else {

                      stackIn_48_0 = (tj) ((Object) stackIn_47_0);
                      stackIn_48_1 = 6;
                      break L12;
                    }
                  }
                  stackIn_48_0.field_l = stackIn_48_1;
                  break L11;
                }
              }
              L13: {
                if (!param0) {
                  break L13;
                } else {
                  this.b((byte) -83);
                  break L13;
                }
              }
              L14: {
                if ((var3_int ^ -1) != -9) {
                  break L14;
                } else {
                  L15: {
                    stackIn_58_0 = this.field_V;

                    if ((this.field_V.field_l ^ -1) != -8) {
                      stackIn_59_0 = (tj) ((Object) stackIn_58_0);
                      stackIn_59_1 = 7;
                      break L15;
                    } else {

                      stackIn_59_0 = (tj) ((Object) stackIn_58_0);
                      stackIn_59_1 = mp.field_p[this.field_t];
                      break L15;
                    }
                  }
                  stackIn_59_0.field_l = stackIn_59_1;
                  break L14;
                }
              }
              L16: {
                if (9 == var3_int) {
                  L17: {
                    stackIn_66_0 = this.field_V;

                    if (this.field_V.field_l != 8) {
                      stackIn_67_0 = (tj) ((Object) stackIn_66_0);
                      stackIn_67_1 = 8;
                      break L17;
                    } else {
                      stackIn_67_0 = (tj) ((Object) stackIn_66_0);
                      stackIn_67_1 = mp.field_p[this.field_t];
                      break L17;
                    }
                  }
                  stackIn_67_0.field_l = stackIn_67_1;
                  break L16;
                } else {
                  break L16;
                }
              }
              L18: {
                if (var3_int != 11) {
                  break L18;
                } else {
                  L19: {
                    stackIn_74_0 = (gt) (var4);

                    if (var4.field_u) {
                      stackIn_75_0 = (gt) ((Object) stackIn_74_0);
                      stackIn_75_1 = 0;
                      break L19;
                    } else {

                      stackIn_75_0 = (gt) ((Object) stackIn_74_0);
                      stackIn_75_1 = 1;
                      break L19;
                    }
                  }
                  stackIn_75_0.field_u = stackIn_75_1 != 0;
                  break L18;
                }
              }
              L20: {
                if (var3_int == 10) {
                  L21: {
                    stackIn_82_0 = this;

                    if (this.field_G) {
                      stackIn_83_0 = this;
                      stackIn_83_1 = 0;
                      break L21;
                    } else {
                      stackIn_83_0 = this;
                      stackIn_83_1 = 1;
                      break L21;
                    }
                  }
                  ((nu) (this)).field_G = stackIn_83_1 != 0;
                  break L20;
                } else {
                  break L20;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var3 = decompiledCaughtException;
            stackIn_88_0 = (RuntimeException) (var3);

            stackIn_88_1 = new StringBuilder().append("nu.T(").append(param0).append(',');

            if (param1 == null) {
              stackIn_89_0 = (RuntimeException) ((Object) stackIn_88_0);
              stackIn_89_1 = (StringBuilder) ((Object) stackIn_88_1);
              stackIn_89_2 = "null";
              break L22;
            } else {
              stackIn_89_0 = (RuntimeException) ((Object) stackIn_88_0);
              stackIn_89_1 = (StringBuilder) ((Object) stackIn_88_1);
              stackIn_89_2 = "{...}";
              break L22;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_89_0), stackIn_89_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    nu(nu param0) {
        this(param0.field_S, param0.field_U, param0.field_c, param0.field_f, param0.field_e, param0.field_L, param0.field_T, param0.field_W, param0.field_w);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.a(param0, (byte) 74);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("nu.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    final void a(nu param0, int param1, int param2, int param3) {
        int stackIn_22_0 = 0;
        int stackIn_39_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Kickabout.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_v = param0.field_v;
                        var5_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var5_int >= this.field_I) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        this.field_R[var5_int].a(param0.field_R[var5_int], param1, param2, 117);
                        var5_int++;
                        if (var7 != 0) {
                            statePc = 37;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var7 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (-1 == (this.field_u ^ -1)) {
                            statePc = 37;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (this.field_u == 2) {
                            statePc = 34;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((this.field_u ^ -1) == -4) {
                            statePc = 31;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (4 == this.field_u) {
                            statePc = 19;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var5_int = 0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var5_int >= 2) {
                            statePc = 30;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackIn_39_0 = 0;
                        stackIn_22_0 = stackIn_39_0;
                        if (var7 != 0) {
                            statePc = 39;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var6 = stackIn_22_0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if ((var6 ^ -1) <= -6) {
                            statePc = 28;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        this.field_P[var5_int][var6].a(param0.field_P[var5_int][var6], param1, param2, 104);
                        var6++;
                        if (var7 != 0) {
                            statePc = 29;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var7 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var5_int++;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var7 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        this.field_V.a(param0.field_V, param1, param2, 68);
                        this.field_X.a(param0.field_X, param1, param2, 41);
                        this.field_G = param0.field_G;
                        if (var7 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        this.field_o.a(param0.field_o, param1, param2, 72);
                        if (var7 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        this.field_C.a(param0.field_C, param1, param2, 83);
                        if (var7 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        this.field_n.a(param0.field_n, param1, param2, param3 + 61);
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackIn_39_0 = param3;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (stackIn_39_0 == -6) {
                            statePc = 48;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        this.a(68, true, -108L, -124, 51);
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 43: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_46_0 = (RuntimeException) (var5);
                    stackIn_44_0 = stackIn_46_0;
                    stackIn_46_1 = new StringBuilder().append("nu.LA(");
                    stackIn_44_1 = stackIn_46_1;
                    if (param0 == null) {
                        statePc = 46;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    stackIn_47_0 = (RuntimeException) ((Object) stackIn_44_0);
                    stackIn_47_1 = (StringBuilder) ((Object) stackIn_44_1);
                    stackIn_47_2 = "{...}";
                    statePc = 47;
                    continue stateLoop;
                }
                case 46: {
                    stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
                    stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
                    stackIn_47_2 = "null";
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    throw nb.a((Throwable) ((Object) stackIn_47_0), stackIn_47_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
                }
                case 48: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final nl b(byte param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        nl stackIn_7_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if ((this.field_V.field_m ^ -1) != 0) {
              L1: {
                if (param0 == -96) {
                  break L1;
                } else {
                  this.a((nl) null, (byte) 6);
                  break L1;
                }
              }
              stackIn_7_0 = this.field_P[this.field_V.field_m][this.field_V.field_s];
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2), "nu.H(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (nl) ((Object) stackIn_2_0);
        } else {
          return stackIn_7_0;
        }
    }

    final boolean c(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 <= -4) {
                break L1;
              } else {
                this.a((byte) 53, (ki) null);
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_g[param0].field_p != this.field_V.field_m) {
                  break L3;
                } else {
                  if ((this.field_V.field_s ^ -1) != (this.field_R[param0].field_g ^ -1)) {
                    break L3;
                  } else {
                    stackIn_10_0 = 1;
                    break L2;
                  }
                }
              }
              stackIn_10_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var3), "nu.GA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_10_0 != 0;
    }

    private final void c(int param0, ki param1) {
        gt stackIn_37_0 = null;
        gt stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        gt stackIn_44_0 = null;
        gt stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_62_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = Kickabout.field_G;
        try {
          L0: {
            var3_int = param1.field_u;
            if (param0 == 5) {
              L1: {
                L2: {
                  L3: {
                    L4: {
                      L5: {
                        var4 = param1.field_v;
                        if ((var4 ^ -1) == -1) {
                          L6: {
                            this.field_R[var3_int].field_v = true;
                            if (this.field_u < 5) {
                              this.field_R[var3_int].field_s = true;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          this.field_R[var3_int].a((mo) (this.field_g[var3_int]), (byte) 84);
                          this.field_R[var3_int].field_g = -1;
                          this.b(10, var3_int);
                          if (var5 == 0) {
                            break L1;
                          } else {
                            break L5;
                          }
                        } else {
                          L7: {
                            if (var4 != 2) {
                              break L7;
                            } else {
                              if (var5 == 0) {
                                break L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                          if (-4 == (var4 ^ -1)) {
                            break L4;
                          } else {
                            L8: {
                              if (var4 != 1) {
                                break L8;
                              } else {
                                if (var5 == 0) {
                                  break L3;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            if (var4 == 4) {
                              break L2;
                            } else {
                              break L1;
                            }
                          }
                        }
                      }
                      if (this.field_R[var3_int].d(3511)) {
                        L9: {
                          stackIn_37_0 = this.field_R[var3_int];

                          if (this.field_R[var3_int].field_q) {
                            stackIn_38_0 = (gt) ((Object) stackIn_37_0);
                            stackIn_38_1 = 0;
                            break L9;
                          } else {
                            stackIn_38_0 = (gt) ((Object) stackIn_37_0);
                            stackIn_38_1 = 1;
                            break L9;
                          }
                        }
                        stackIn_38_0.field_q = stackIn_38_1 != 0;
                        if (var5 == 0) {
                          break L1;
                        } else {
                          break L4;
                        }
                      } else {
                        break L1;
                      }
                    }
                    L10: {
                      stackIn_44_0 = this.field_R[var3_int];

                      if (this.field_R[var3_int].field_k) {
                        stackIn_45_0 = (gt) ((Object) stackIn_44_0);
                        stackIn_45_1 = 0;
                        break L10;
                      } else {

                        stackIn_45_0 = (gt) ((Object) stackIn_44_0);
                        stackIn_45_1 = 1;
                        break L10;
                      }
                    }
                    stackIn_45_0.field_k = stackIn_45_1 != 0;
                    if (var5 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                  if (-6 >= (this.field_u ^ -1)) {
                    break L1;
                  } else {
                    if (this.field_R[var3_int].field_s) {
                      break L1;
                    } else {
                      this.b(10, var3_int);
                      this.field_R[var3_int].a((mo) (this.field_g[var3_int]), (byte) 84);
                      this.field_R[var3_int].field_s = true;
                      this.field_R[var3_int].field_g = -1;
                      this.field_q[var3_int].field_p = this.field_v;
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                this.field_R[var3_int].a((mo) (this.field_g[var3_int]), (byte) 84);
                this.field_R[var3_int].field_i = true;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3 = decompiledCaughtException;
            stackIn_61_0 = (RuntimeException) (var3);

            stackIn_61_1 = new StringBuilder().append("nu.S(").append(param0).append(',');

            if (param1 == null) {
              stackIn_62_0 = (RuntimeException) ((Object) stackIn_61_0);
              stackIn_62_1 = (StringBuilder) ((Object) stackIn_61_1);
              stackIn_62_2 = "null";
              break L11;
            } else {
              stackIn_62_0 = (RuntimeException) ((Object) stackIn_61_0);
              stackIn_62_1 = (StringBuilder) ((Object) stackIn_61_1);
              stackIn_62_2 = "{...}";
              break L11;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_62_0), stackIn_62_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_35_0 = 0;
        nl stackIn_42_0 = null;
        nl stackIn_44_0 = null;
        nl stackIn_46_0 = null;
        nl stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4_int = 0;
        nl[] var4 = null;
        int var5 = 0;
        nl var6 = null;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Kickabout.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!this.field_p) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        param0 = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var3_int = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_5_0 = var3_int;
                        stackIn_5_1 = 2;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (stackIn_5_0 >= stackIn_5_1) {
                            statePc = 34;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_35_0 = 0;
                        stackIn_7_0 = stackIn_35_0;
                        if (var7 != 0) {
                            statePc = 35;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var4_int = stackIn_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (-6 >= (var4_int ^ -1)) {
                            statePc = 33;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackIn_5_0 = var3_int ^ -1;
                        stackIn_10_0 = stackIn_5_0;
                        stackIn_5_1 = -2;
                        stackIn_10_1 = stackIn_5_1;
                        if (var7 != 0) {
                            statePc = 5;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0 != stackIn_10_1) {
                            statePc = 16;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (-1 == (var4_int ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackIn_17_0 = 1;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackIn_17_0 = 0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var5 = stackIn_17_0;
                        var6 = this.field_P[var3_int][var4_int];
                        if (var5 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (this.field_s) {
                            statePc = 30;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var5 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (this.field_p) {
                            statePc = 30;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var6.field_M = ts.a(var4_int, param0, var3_int, 448) << -566502320;
                        var6.field_w = cp.a((byte) 21, var4_int, var3_int, param0) << 1234384944;
                        if (var7 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var6.field_M = sh.a(70, var4_int);
                        var6.field_w = fm.a((byte) -27, var3_int);
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var4_int++;
                        if (var7 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var3_int++;
                        if (var7 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        this.field_V.a(29360128, 0, (byte) 26, 44040192);
                        this.field_V.field_m = -1;
                        stackIn_35_0 = param1;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var3_int = stackIn_35_0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if ((var3_int ^ -1) <= -3) {
                            statePc = 50;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var4 = this.field_P[var3_int];
                        if (var7 != 0) {
                            statePc = 53;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var5 = 0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (var5 >= var4.length) {
                            statePc = 48;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var6 = var4[var5];
                        if (var7 != 0) {
                            statePc = 49;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackIn_46_0 = (nl) (var6);
                        stackIn_42_0 = stackIn_46_0;
                        if ((var3_int ^ -1) != -1) {
                            statePc = 46;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackIn_44_0 = (nl) ((Object) stackIn_42_0);
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackIn_47_0 = (nl) ((Object) stackIn_44_0);
                        stackIn_47_1 = -1;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackIn_47_0 = (nl) ((Object) stackIn_46_0);
                        stackIn_47_1 = 1;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackIn_47_0.field_n = stackIn_47_1;
                        var6.field_G = 0;
                        var6.field_j = 0;
                        var5++;
                        if (var7 == 0) {
                            statePc = 39;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var3_int++;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var7 == 0) {
                            statePc = 36;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        this.field_E.b(param1 + 22997);
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 52: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    throw nb.a((Throwable) ((Object) var3), "nu.R(" + param0 + ',' + param1 + ')');
                }
                case 53: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(byte param0, ki param1) {
        jc dupTemp$0 = null;
        int stackIn_41_0 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        nl var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        try {
          L0: {
            if ((this.field_u ^ -1) != -5) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (null == this.field_X) {
                  break L1;
                } else {
                  if (-41 < (this.field_X.field_m ^ -1)) {
                    break L1;
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              L2: {
                if (-1 == this.field_O) {
                  break L2;
                } else {
                  if (this.field_O >= this.field_v) {
                    break L2;
                  } else {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              var3_int = param1.field_u;
              if (this.field_R[var3_int].d(3511)) {
                if (param0 == 60) {
                  L3: {
                    var4 = this.c(var3_int, -126) ? 1 : 0;
                    var5 = this.a((byte) -119, var3_int);
                    var6 = param1.field_o;
                    var7 = param1.field_p;
                    if (var6 != 0) {
                      break L3;
                    } else {
                      if (-1 != (var7 ^ -1)) {
                        break L3;
                      } else {
                        var6 = var5.field_j;
                        var7 = var5.field_n;
                        break L3;
                      }
                    }
                  }
                  L4: {
                    L5: {
                      L6: {
                        var5.a((mo) (this.field_g[var3_int]), (byte) 84);
                        if (var4 == 0) {
                          break L6;
                        } else {
                          if (-2 == (var5.field_u ^ -1)) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      if (var4 != 0) {
                        break L4;
                      } else {
                        if (!var5.d((byte) 108)) {
                          break L4;
                        } else {
                          if (!this.field_l) {
                            L7: {
                              var8 = uv.b(var7, var6, (byte) 2);
                              var5.b(var8, param0 + -61);
                              if (-1 != this.field_V.field_m) {
                                break L7;
                              } else {
                                this.a(var5, (byte) 115);
                                break L7;
                              }
                            }
                            var5.field_F = var3_int;
                            dupTemp$0 = this.field_q[var3_int];
                            dupTemp$0.field_n = dupTemp$0.field_n + 1;
                            if (Kickabout.field_G == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    L8: {
                      var5.field_P = var7;
                      var5.field_x = var6;
                      var5.field_z = param1.field_v;
                      var8 = var5.d(5339);
                      var9 = uv.a(true, var7, var6);
                      if ((pq.b(170, var8 ^ var9) ^ -1) >= -2) {
                        stackIn_41_0 = 0;
                        break L8;
                      } else {
                        stackIn_41_0 = 1;
                        break L8;
                      }
                    }
                    L9: {
                      var10 = stackIn_41_0;
                      var5.field_h = var9;
                      var5.a((byte) -31, 2);
                      if (var10 != 0) {
                        var5.field_L = var5.field_L + 16;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    var11 = var5.a(var5.field_z, (byte) -68) + -128;
                    if ((var11 ^ -1) >= -1) {
                      break L4;
                    } else {
                      var5.field_L = var5.field_L + (16 * var11 >> -2111933561);
                      break L4;
                    }
                  }
                  decompiledRegionSelector0 = 5;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              } else {
                decompiledRegionSelector0 = 3;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackIn_52_0 = (RuntimeException) (var3);

            stackIn_52_1 = new StringBuilder().append("nu.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_53_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "null";
              break L10;
            } else {
              stackIn_53_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "{...}";
              break L10;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_53_0), stackIn_53_2 + ')');
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

    private final String c(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_12_0 = null;
        String stackIn_15_0 = null;
        String stackIn_20_0 = null;
        String stackIn_25_0 = null;
        String stackIn_27_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (-1 == (this.field_u ^ -1)) {
              stackIn_4_0 = "TeamSelection";
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var2_int = -3 / ((-57 - param0) / 49);
              if ((this.field_u ^ -1) == -2) {
                stackIn_9_0 = "WaitForPlayers";
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (-3 != (this.field_u ^ -1)) {
                  if (-4 != (this.field_u ^ -1)) {
                    if (-5 == (this.field_u ^ -1)) {
                      stackIn_20_0 = "Playing";
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if (-6 == (this.field_u ^ -1)) {
                        stackIn_25_0 = "GameOver";
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        stackIn_27_0 = "Invalid[" + this.field_u + "]";
                        decompiledRegionSelector0 = 6;
                        break L0;
                      }
                    }
                  } else {
                    stackIn_15_0 = "LineUp";
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_12_0 = "Formation";
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2), "nu.IA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_15_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_20_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_25_0;
                  } else {
                    return stackIn_27_0;
                  }
                }
              }
            }
          }
        }
    }

    public static void a(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_j = true;
                break L1;
              }
            }
            field_M = null;
            field_a = null;
            field_D = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "nu.CA(" + param0 + ')');
        }
    }

    final nl a(byte param0, int param1) {
        nl stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        try {
          L0: {
            var3_int = 48 / ((param0 - 27) / 62);
            stackIn_1_0 = this.field_P[this.field_g[param1].field_p][this.field_R[param1].field_g];
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var3), "nu.F(" + param0 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    final int a(byte param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0;
        var5 = Kickabout.field_G;
        try {
          L0: {
            if (param0 == 6) {
              var4_int = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if ((var4_int ^ -1) <= (this.field_g.length ^ -1)) {
                      break L3;
                    } else {
                      stackOut_6_0 = this.field_R[var4_int].d(3511);
                      stackIn_20_0 = stackOut_6_0 ? 1 : 0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (!stackIn_7_0) {
                            break L4;
                          } else {
                            if (param1 != this.field_g[var4_int].field_p) {
                              break L4;
                            } else {
                              if (param2 != this.field_R[var4_int].field_g) {
                                break L4;
                              } else {
                                stackIn_17_0 = var4_int;
                                decompiledRegionSelector0 = 2;
                                break L0;
                              }
                            }
                          }
                        }
                        var4_int++;
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackIn_20_0 = -1;
                  break L2;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = 119;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var4), "nu.W(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_20_0;
          } else {
            return stackIn_17_0;
          }
        }
    }

    private final void b(int param0, int param1) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            if (param0 == 10) {
              L1: {
                L2: {
                  if ((this.field_u ^ -1) != -1) {
                    break L2;
                  } else {
                    this.field_n.a(false, param1);
                    this.field_n.a((mo) (this.field_g[param1]), (byte) 84);
                    if (Kickabout.field_G == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (2 == this.field_u) {
                  break L1;
                } else {
                  if (4 == this.field_u) {
                    if (this.c(param1, -78)) {
                      this.field_V.field_m = -1;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var3), "nu.JA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, mo param1, int param2, int param3) {
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6_int = 0;
        nl var6 = null;
        int var7_int = 0;
        nl var7 = null;
        int var8 = 0;
        var8 = Kickabout.field_G;
        try {
          L0: {
            var5_int = this.field_g[param3].field_p;
            var6_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if ((this.field_I ^ -1) >= (var6_int ^ -1)) {
                    break L3;
                  } else {
                    stackIn_13_0 = var5_int;

                    stackIn_13_1 = this.field_g[var6_int].field_p;

                    if (var8 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_13_0 != stackIn_13_1) {
                          break L4;
                        } else {
                          if (param2 != this.field_R[var6_int].field_g) {
                            break L4;
                          } else {
                            decompiledRegionSelector0 = 0;
                            break L0;
                          }
                        }
                      }
                      var6_int++;
                      if (var8 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackIn_13_0 = -103;
                stackIn_13_1 = (param0 - -39) / 48;
                break L2;
              }
              L5: {
                var7_int = stackIn_13_0 % stackIn_13_1;
                if (this.field_R[param3].field_g == -1) {
                  break L5;
                } else {
                  this.a((byte) 118, param3).field_I = 6;
                  break L5;
                }
              }
              L6: {
                if ((this.field_R[param3].field_g ^ -1) == 0) {
                  break L6;
                } else {
                  var6 = this.field_P[var5_int][this.field_R[param3].field_g];
                  var7 = this.field_P[var5_int][param2];
                  var7.field_G = var6.field_G;
                  break L6;
                }
              }
              this.field_R[param3].field_g = param2;
              this.a((byte) 91, param3).a(param1, (byte) 84);
              this.field_R[param3].a(param1, (byte) 84);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var5);

            stackIn_23_1 = new StringBuilder().append("nu.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(ki param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (3 == this.field_u) {
              if (this.field_R[param0.field_u].d(3511)) {
                L1: {
                  this.field_o.a(param0.field_v, 0, param0.field_t, param0.field_s, param0.field_u);
                  this.field_o.a((mo) (this.field_g[param0.field_u]), (byte) 84);
                  if (param1 < -8) {
                    break L1;
                  } else {
                    this.c(-30);
                    break L1;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
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
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (runtimeException);

            stackIn_10_1 = new StringBuilder().append("nu.O(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
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

    private final void b(int param0, byte param1) {
        long stackIn_13_0 = 0L;
        long stackIn_15_0 = 0L;
        int statePc = 0;
        Throwable caughtException = null;
        nl var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        long var8 = 0L;
        long var10 = 0L;
        int var12_int = 0;
        long var12 = 0L;
        int var14 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = Kickabout.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3 = this.field_P[this.field_V.field_m][param0];
                        var4 = var3.field_M;
                        var5 = var3.field_w;
                        if ((this.field_V.field_m ^ -1) != -2) {
                            statePc = 8;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (this.field_p) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var5 = 44040192;
                        var4 = 29360128;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var6 = (var4 - this.field_V.field_t) * 3 >> 2081448162;
                        var7 = (var5 - this.field_V.field_p) * 3 >> 1577588130;
                        var8 = sg.field_d[this.field_t];
                        var10 = var8;
                        var12_int = 0;
                        if (param1 == -72) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        this.b((byte) -75, -73);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((var12_int ^ -1) <= -71) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_15_0 = var8 * var10 >> 964477520;
                        stackIn_13_0 = stackIn_15_0;
                        if (var14 != 0) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var10 = stackIn_13_0;
                        var12_int++;
                        if (var14 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackIn_15_0 = (-var8 + 65536L << 1089405008) / (-var10 + 65536L);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var12 = stackIn_15_0;
                        this.field_V.field_h = (int)((long)var7 * var12 >> -716140208);
                        this.field_V.field_n = 573440;
                        this.field_V.field_q = (int)((long)var6 * var12 >> 312093840);
                        this.field_V.field_r = 10;
                        this.field_V.field_m = -1;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    var3_ref = (RuntimeException) ((Object) caughtException);
                    throw nb.a((Throwable) ((Object) var3_ref), "nu.U(" + param0 + ',' + param1 + ')');
                }
                case 18: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, boolean param1, boolean param2, int param3, byte param4, int param5) {
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        try {
          L0: {
            L1: {
              var7_int = (393216 * param0 >> -187141240) + 786432;
              if (!param1) {
                stackIn_4_0 = 227;
                break L1;
              } else {
                stackIn_4_0 = 700;
                break L1;
              }
            }
            L2: {
              var8 = stackIn_4_0;
              if (param4 <= -6) {
                break L2;
              } else {
                field_D = (String) null;
                break L2;
              }
            }
            L3: {
              var9 = (var7_int >> -1306717592) * we.a(var8, false) >> -1901559064;
              var10 = (var7_int >> -1456886360) * ei.a(var8, (byte) -23) >> -410319384;
              if (!param2) {
                break L3;
              } else {
                if (param1) {
                  break L3;
                } else {
                  if ((param0 ^ -1) >= -33) {
                    break L3;
                  } else {
                    var9 = var9 + ((var9 * 3 >> 1926099745) - -(1280 * param0));
                    this.field_V.field_A = 25;
                    break L3;
                  }
                }
              }
            }
            L4: {
              var11 = de.a(param5 * param5 + param3 * param3, (byte) 84);
              this.field_V.field_n = var10;
              if (var11 != 0) {
                this.field_V.field_q = param3 * var9 / var11;
                this.field_V.field_h = param5 * var9 / var11;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              L6: {
                this.field_V.field_m = -1;
                if (!param1) {
                  break L6;
                } else {
                  this.field_V.field_r = 35;
                  if (Kickabout.field_G == 0) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              this.field_V.field_r = 20;
              break L5;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var7), "nu.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void d(int param0) {
        gt dupTemp$0 = null;
        nl dupTemp$1 = null;
        int stackIn_27_0 = 0;
        int stackIn_36_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3_int = 0;
        nl var3 = null;
        int var4 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Kickabout.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (-1 > (this.field_v ^ -1)) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        this.field_v = this.field_v - 1;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (this.field_u == 0) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.field_n.field_b = this.field_n.field_b + 1;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (this.field_u == 2) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        this.field_C.field_b = this.field_C.field_b + 1;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (-4 != (this.field_u ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        this.field_o.field_b = this.field_o.field_b + 1;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (this.field_u != param0) {
                            statePc = 35;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var2_int = 0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var2_int >= this.field_I) {
                            statePc = 23;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        dupTemp$0 = this.field_R[var2_int];
                        dupTemp$0.field_b = dupTemp$0.field_b + 1;
                        var2_int++;
                        if (var4 != 0) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var4 == 0) {
                            statePc = 18;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        this.field_V.field_b = this.field_V.field_b + 1;
                        this.field_X.field_b = this.field_X.field_b + 1;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var2_int = 0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (2 <= var2_int) {
                            statePc = 35;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackIn_36_0 = 0;
                        stackIn_27_0 = stackIn_36_0;
                        if (var4 != 0) {
                            statePc = 36;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var3_int = stackIn_27_0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if ((var3_int ^ -1) <= -6) {
                            statePc = 33;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        dupTemp$1 = this.field_P[var2_int][var3_int];
                        dupTemp$1.field_b = dupTemp$1.field_b + 1;
                        var3_int++;
                        if (var4 != 0) {
                            statePc = 34;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (var4 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var2_int++;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (var4 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackIn_36_0 = this.field_u ^ -1;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (stackIn_36_0 != -5) {
                            statePc = 63;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        this.b(11660);
                        var2_int = 0;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (var2_int >= this.field_I) {
                            statePc = 63;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (var4 != 0) {
                            statePc = 63;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (this.field_R[var2_int].field_s) {
                            statePc = 60;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (-1 < (this.field_g[var2_int].field_p ^ -1)) {
                            statePc = 60;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if ((this.field_R[var2_int].field_g ^ -1) <= -1) {
                            statePc = 52;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var4 == 0) {
                            statePc = 60;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var3 = this.a((byte) -39, var2_int);
                        if ((this.field_g[var2_int].field_p ^ -1) != -1) {
                            statePc = 56;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (var3.a(true) < 672) {
                            statePc = 56;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (this.field_g[var2_int].field_p != 1) {
                            statePc = 60;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if ((var3.a(true) ^ -1) >= -673) {
                            statePc = 60;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var2_int++;
                        if (var4 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 62: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw nb.a((Throwable) ((Object) var2), "nu.FA(" + param0 + ')');
                }
                case 63: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, long param1, int param2, int param3, boolean param4, String param5) {
        RuntimeException runtimeException = null;
        int var7_int = 0;
        ml stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        ml stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              or.field_d.b(param3, (byte) 77);
              or.field_d.field_n = or.field_d.field_n + 1;
              var7_int = or.field_d.field_n;
              or.field_d.a(param1, -1781890008);
              or.field_d.a(14190, param5);
              or.field_d.a(118, param2);
              stackIn_3_0 = or.field_d;

              stackIn_3_1 = 114;

              if (param4) {
                stackIn_4_0 = (ml) ((Object) stackIn_3_0);
                stackIn_4_1 = stackIn_3_1;
                stackIn_4_2 = 1;
                break L1;
              } else {
                stackIn_4_0 = (ml) ((Object) stackIn_3_0);
                stackIn_4_1 = stackIn_3_1;
                stackIn_4_2 = 0;
                break L1;
              }
            }
            L2: {
              ((ml) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_4_2);
              if (param0 > 101) {
                break L2;
              } else {
                field_j = false;
                break L2;
              }
            }
            or.field_d.c(62, or.field_d.field_n + -var7_int);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (runtimeException);

            stackIn_12_1 = new StringBuilder().append("nu.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    final void a(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        ki var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Kickabout.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2 = (ki) ((Object) this.field_E.g(24009));
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (null == var2) {
                            statePc = 58;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var3 = var2.field_r;
                        stackIn_59_0 = 2;
                        stackIn_4_0 = stackIn_59_0;
                        stackIn_59_1 = var3;
                        stackIn_4_1 = stackIn_59_1;
                        if (var4 != 0) {
                            statePc = 59;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (stackIn_4_0 == stackIn_4_1) {
                            statePc = 34;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((var3 ^ -1) == -2) {
                            statePc = 37;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((var3 ^ -1) == -1) {
                            statePc = 40;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if ((var3 ^ -1) == -5) {
                            statePc = 43;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (-4 == (var3 ^ -1)) {
                            statePc = 46;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if ((var3 ^ -1) == -6) {
                            statePc = 49;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (6 != var3) {
                            statePc = 28;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var4 == 0) {
                            statePc = 52;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if ((var3 ^ -1) != -8) {
                            statePc = 57;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (var4 == 0) {
                            statePc = 55;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        this.a((byte) 60, var2);
                        if (var4 == 0) {
                            statePc = 57;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        this.b((byte) 125, var2);
                        if (var4 == 0) {
                            statePc = 57;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        this.b(true, var2);
                        if (var4 == 0) {
                            statePc = 57;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        this.a(1, var2);
                        if (var4 == 0) {
                            statePc = 57;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        this.b(26214, var2);
                        if (var4 == 0) {
                            statePc = 57;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        this.a(var2, (byte) -34);
                        if (var4 == 0) {
                            statePc = 57;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        this.c(5, var2);
                        if (var4 == 0) {
                            statePc = 57;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        this.a(false, var2);
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var2 = (ki) ((Object) this.field_E.c(33));
                        if (var4 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        stackIn_59_0 = 69;
                        stackIn_59_1 = (param0 - 70) / 48;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var3 = stackIn_59_0 % stackIn_59_1;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 61: {
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    throw nb.a((Throwable) ((Object) var2_ref), "nu.A(" + param0 + ')');
                }
                case 62: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0) {
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        boolean stackIn_5_0 = false;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        boolean stackIn_23_0 = false;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_41_0 = 0;
        boolean stackOut_4_0;
        boolean stackOut_22_0;
        int statePc = 0;
        Throwable caughtException = null;
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Kickabout.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2 = new int[]{3, 4, param0, 1};
                        var3 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = this.field_R.length ^ -1;
                        stackIn_3_1 = var3 ^ -1;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (stackIn_3_0 >= stackIn_3_1) {
                            statePc = 18;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = this.field_R[var3].d(3511);
                        stackIn_19_0 = stackOut_4_0 ? 1 : 0;
                        stackIn_5_0 = stackOut_4_0;
                        if (var7 != 0) {
                            statePc = 19;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (!stackIn_5_0) {
                            statePc = 17;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var4 = this.field_g[var3].field_p;
                        var5 = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (4 <= var5) {
                            statePc = 17;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var6 = var2[var5];
                        stackIn_3_0 = var3;
                        stackIn_11_0 = stackIn_3_0;
                        stackIn_3_1 = this.field_i[var4][var6 - 1];
                        stackIn_11_1 = stackIn_3_1;
                        if (var7 != 0) {
                            statePc = 3;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (stackIn_11_0 == stackIn_11_1) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        this.field_R[var3].field_g = var6;
                        if (var7 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var5++;
                        if (var7 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var3++;
                        if (var7 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_19_0 = 0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var3 = stackIn_19_0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_21_0 = var3 ^ -1;
                        stackIn_21_1 = -3;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (stackIn_21_0 <= stackIn_21_1) {
                            statePc = 40;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackOut_22_0 = this.field_R[this.field_i[var3][2]].d(3511);
                        stackIn_41_0 = stackOut_22_0 ? 1 : 0;
                        stackIn_23_0 = stackOut_22_0;
                        if (var7 != 0) {
                            statePc = 41;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (stackIn_23_0) {
                            statePc = 39;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var4 = 0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var4 >= this.field_I) {
                            statePc = 39;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackIn_21_0 = var3 ^ -1;
                        stackIn_29_0 = stackIn_21_0;
                        stackIn_21_1 = this.field_g[var4].field_p ^ -1;
                        stackIn_29_1 = stackIn_21_1;
                        if (var7 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (stackIn_29_0 != stackIn_29_1) {
                            statePc = 36;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (!this.field_R[var4].d(3511)) {
                            statePc = 36;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        this.field_R[var4].field_g = 3;
                        if (var7 == 0) {
                            statePc = 39;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var4++;
                        if (var7 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var3++;
                        if (var7 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackIn_41_0 = 0;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var3 = stackIn_41_0;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (-3 >= (var3 ^ -1)) {
                            statePc = 52;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (var7 != 0) {
                            statePc = 55;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var4 = 1;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (-6 >= (var4 ^ -1)) {
                            statePc = 50;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        this.field_P[var3][var4].field_I = 0;
                        var4++;
                        if (var7 != 0) {
                            statePc = 51;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (var7 == 0) {
                            statePc = 45;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var3++;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var7 == 0) {
                            statePc = 42;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        this.field_J = 0;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 54: {
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    throw nb.a((Throwable) ((Object) var2_ref), "nu.M(" + param0 + ')');
                }
                case 55: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, byte param1) {
        Object stackIn_30_0 = null;
        jc stackIn_31_0 = null;
        jc stackIn_33_0 = null;
        jc stackIn_35_0 = null;
        jc stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        Object stackIn_38_0 = null;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        Object var6 = null;
        up var6_ref = null;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Kickabout.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 <= -49) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        this.field_u = param0;
                        this.field_v = cv.field_a[this.field_u];
                        if (-1 != (this.field_u ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        this.field_n = new oe(this.field_R);
                        if (var7 == 0) {
                            statePc = 67;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (this.field_u != 1) {
                            statePc = 12;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (this.field_u != 2) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        this.field_C = new wr();
                        if (var7 == 0) {
                            statePc = 67;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (3 == this.field_u) {
                            statePc = 63;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if ((this.field_u ^ -1) != -5) {
                            statePc = 67;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (this.field_q != null) {
                            statePc = 27;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var3_int = 0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if ((this.field_g.length ^ -1) >= (var3_int ^ -1)) {
                            statePc = 37;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackIn_38_0 = this;
                        stackIn_30_0 = stackIn_38_0;
                        if (var7 != 0) {
                            statePc = 38;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackIn_35_0 = ((nu) (this)).field_q[var3_int];
                        stackIn_31_0 = stackIn_35_0;
                        if (-1 != (this.field_g[var3_int].field_p ^ -1)) {
                            statePc = 35;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackIn_33_0 = (jc) ((Object) stackIn_31_0);
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackIn_36_0 = (jc) ((Object) stackIn_33_0);
                        stackIn_36_1 = 1;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackIn_36_0 = (jc) ((Object) stackIn_35_0);
                        stackIn_36_1 = 0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackIn_36_0.field_o = stackIn_36_1 != 0;
                        var3_int++;
                        if (var7 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackIn_38_0 = this;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        ((nu) (this)).field_v = this.field_O;
                        if (0 < this.field_v) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        this.field_v = this.field_v + 140;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        this.field_V = new tj();
                        this.field_P = new nl[2][5];
                        var3_int = 0;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackIn_44_0 = 2;
                        stackIn_44_1 = var3_int;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (stackIn_44_0 <= stackIn_44_1) {
                            statePc = 61;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (var7 != 0) {
                            statePc = 62;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var4 = 0;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (-6 >= (var4 ^ -1)) {
                            statePc = 60;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var5 = 1;
                        stackIn_44_0 = -1;
                        stackIn_49_0 = stackIn_44_0;
                        stackIn_44_1 = var4 ^ -1;
                        stackIn_49_1 = stackIn_44_1;
                        if (var7 != 0) {
                            statePc = 44;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (stackIn_49_0 <= stackIn_49_1) {
                            statePc = 52;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var6_int = this.field_i[var3_int][-1 + var4];
                        if (0 != (this.field_c & 1 << var6_int)) {
                            statePc = 52;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var5 = 0;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var6 = null;
                        if (var4 != 0) {
                            statePc = 54;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var6_ref = mv.b(false);
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var6_ref = this.field_b[var3_int][-1 + var4];
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        this.field_P[var3_int][var4] = new nl();
                        this.field_P[var3_int][var4].a(var5 != 0, var6_ref, 3);
                        if (var6_ref.a(var5 != 0, (byte) -111)) {
                            statePc = 58;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        this.field_F[var3_int] = true;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var4++;
                        if (var7 == 0) {
                            statePc = 47;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var3_int++;
                        if (var7 == 0) {
                            statePc = 43;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        this.field_V.field_l = mp.field_p[this.field_t];
                        this.field_X = new ua();
                        this.a(1, 0);
                        this.a(2);
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (var7 == 0) {
                            statePc = 67;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        this.field_o = new wl(this.field_e, this.field_g, this.field_R, this.field_i, this.field_k, this.field_b);
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 66: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    throw nb.a((Throwable) ((Object) var3), "nu.EA(" + param0 + ',' + param1 + ')');
                }
                case 67: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(int param0, ki param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (2 == this.field_u) {
              L1: {
                if (param0 == 26214) {
                  break L1;
                } else {
                  this.field_V = (tj) null;
                  break L1;
                }
              }
              var3_int = this.field_g[param1.field_u].field_p;
              if ((this.b((byte) 72, var3_int) ^ -1) == (param1.field_u ^ -1)) {
                this.field_C.a(var3_int, 1, param1.field_v);
                this.field_C.a((mo) (this.field_g[param1.field_u]), (byte) 84);
                decompiledRegionSelector0 = 2;
                break L0;
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
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (runtimeException);

            stackIn_12_1 = new StringBuilder().append("nu.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
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

    final void a(ki param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_E.a(param0, 3);
              if (param1 < -114) {
                break L1;
              } else {
                this.toString();
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("nu.V(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
    }

    public final String toString() {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        StringBuilder discarded$12 = null;
        StringBuilder discarded$13 = null;
        StringBuilder discarded$14 = null;
        StringBuilder discarded$15 = null;
        StringBuilder discarded$16 = null;
        StringBuilder discarded$17 = null;
        StringBuilder discarded$18 = null;
        StringBuilder discarded$19 = null;
        StringBuilder discarded$20 = null;
        StringBuilder discarded$21 = null;
        StringBuilder discarded$22 = null;
        StringBuilder discarded$23 = null;
        StringBuilder discarded$24 = null;
        StringBuilder discarded$25 = null;
        StringBuilder discarded$26 = null;
        StringBuilder discarded$27 = null;
        StringBuilder discarded$28 = null;
        StringBuilder discarded$29 = null;
        boolean stackIn_14_0 = false;
        int stackIn_42_0 = 0;
        int stackIn_49_0 = 0;
        StringBuilder stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        int stackIn_52_2 = 0;
        int stackIn_52_3 = 0;
        StringBuilder stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        int stackIn_53_2 = 0;
        int stackIn_53_3 = 0;
        StringBuilder stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        StringBuilder stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        StringBuilder stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        StringBuilder stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        StringBuilder stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        int stackIn_63_2 = 0;
        int stackIn_63_3 = 0;
        StringBuilder stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        StringBuilder stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        StringBuilder stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        int stackIn_74_0 = 0;
        int stackIn_90_0 = 0;
        int stackIn_94_0 = 0;
        String stackIn_100_0 = null;
        boolean stackOut_13_0;
        int statePc = 0;
        Throwable caughtException = null;
        StringBuilder var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        ki var3_ref_ki = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = Kickabout.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var1 = new StringBuilder("CommonGame(players=" + this.field_I + ",timelimit=" + this.field_O + ") phase=" + this.c((byte) 59) + " phase_time=" + this.field_v + "\n");
                        discarded$0 = var1.append("\tsurface=" + this.field_t + "\ttier=" + this.field_m + "\twinner=" + this.field_Z + "\tai_tick=" + this.field_J);
                        if (!this.field_G) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        discarded$1 = var1.append("\tbigheadmode");
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (this.field_s) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        discarded$2 = var1.append("\tdisable_local");
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (!this.field_p) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        discarded$3 = var1.append("\tdisable_opponent");
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        discarded$4 = var1.append("\n");
                        var2 = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var2 >= this.field_S.length) {
                            statePc = 41;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        discarded$5 = var1.append("\t" + var2 + " [" + this.field_g[var2].field_p + "]: " + this.field_S[var2] + "\t" + this.field_R[var2].field_g + " " + this.field_R[var2].field_p + " " + this.field_R[var2].field_l + "\t");
                        stackOut_13_0 = this.field_R[var2].field_k;
                        stackIn_42_0 = stackOut_13_0 ? 1 : 0;
                        stackIn_14_0 = stackOut_13_0;
                        if (var6 != 0) {
                            statePc = 42;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (!stackIn_14_0) {
                            statePc = 19;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        discarded$6 = var1.append("offer_rematch\t");
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (!this.field_R[var2].field_q) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        discarded$7 = var1.append("offer_draw\t");
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (this.field_R[var2].field_s) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        discarded$8 = var1.append("resigned\t");
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (!this.field_R[var2].field_v) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        discarded$9 = var1.append("departed\t");
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (this.field_R[var2].field_i) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        discarded$10 = var1.append("!loaded_pitch\t");
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (!this.field_R[var2].field_n) {
                            statePc = 35;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        discarded$11 = var1.append("!reward\t");
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (this.field_R[var2].field_u) {
                            statePc = 39;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        discarded$12 = var1.append("megamode\t");
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        discarded$13 = var1.append("\n");
                        var2++;
                        if (var6 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var2 = this.field_E.a(false);
                        stackIn_42_0 = var2;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (stackIn_42_0 <= 0) {
                            statePc = 46;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        discarded$14 = var1.append("\tEnqueued moves: " + var2 + "\n");
                        var3_ref_ki = (ki) ((Object) this.field_E.g(24009));
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (null == var3_ref_ki) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        discarded$15 = var1.append("\t\t" + var3_ref_ki + "\n");
                        var3_ref_ki = (ki) ((Object) this.field_E.c(33));
                        if (var6 == 0) {
                            statePc = 44;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var3 = 0;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (var3 >= 2) {
                            statePc = 73;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        discarded$16 = var1.append("\tteam " + var3 + ": kit=[" + this.field_H[var3] + "," + this.field_d[var3] + "," + this.field_Q[var3] + "]\tslot_owner=[");
                        stackIn_74_0 = 0;
                        stackIn_49_0 = stackIn_74_0;
                        if (var6 != 0) {
                            statePc = 74;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var4 = stackIn_49_0;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (-5 >= (var4 ^ -1)) {
                            statePc = 60;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackIn_52_0 = (StringBuilder) (var1);
                        stackIn_52_1 = new StringBuilder().append(this.field_i[var3][var4]);
                        stackIn_52_2 = -4;
                        stackIn_52_3 = var4 ^ -1;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        stackIn_63_0 = (StringBuilder) ((Object) stackIn_52_0);
                        stackIn_53_0 = stackIn_63_0;
                        stackIn_63_1 = (StringBuilder) ((Object) stackIn_52_1);
                        stackIn_53_1 = stackIn_63_1;
                        stackIn_63_2 = stackIn_52_2;
                        stackIn_53_2 = stackIn_63_2;
                        stackIn_63_3 = stackIn_52_3;
                        stackIn_53_3 = stackIn_63_3;
                        if (var6 != 0) {
                            statePc = 63;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        stackIn_58_0 = (StringBuilder) ((Object) stackIn_53_0);
                        stackIn_54_0 = stackIn_58_0;
                        stackIn_58_1 = (StringBuilder) ((Object) stackIn_53_1);
                        stackIn_54_1 = stackIn_58_1;
                        if (stackIn_53_2 >= stackIn_53_3) {
                            statePc = 58;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        stackIn_56_0 = (StringBuilder) ((Object) stackIn_54_0);
                        stackIn_56_1 = (StringBuilder) ((Object) stackIn_54_1);
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        stackIn_59_0 = (StringBuilder) ((Object) stackIn_56_0);
                        stackIn_59_1 = (StringBuilder) ((Object) stackIn_56_1);
                        stackIn_59_2 = ",";
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        stackIn_59_0 = (StringBuilder) ((Object) stackIn_58_0);
                        stackIn_59_1 = (StringBuilder) ((Object) stackIn_58_1);
                        stackIn_59_2 = "";
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        discarded$17 = ((StringBuilder) (Object) stackIn_59_0).append(stackIn_59_2);
                        var4++;
                        if (var6 == 0) {
                            statePc = 50;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        discarded$18 = var1.append("]\tchosen_player_ids=[");
                        var4 = 0;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (-5 >= (var4 ^ -1)) {
                            statePc = 68;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        stackIn_52_0 = (StringBuilder) (var1);
                        stackIn_63_0 = stackIn_52_0;
                        stackIn_52_1 = new StringBuilder().append(this.field_k[var3][var4]);
                        stackIn_63_1 = stackIn_52_1;
                        stackIn_52_2 = var4;
                        stackIn_63_2 = stackIn_52_2;
                        stackIn_52_3 = 3;
                        stackIn_63_3 = stackIn_52_3;
                        if (var6 != 0) {
                            statePc = 52;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        stackIn_66_0 = (StringBuilder) ((Object) stackIn_63_0);
                        stackIn_64_0 = stackIn_66_0;
                        stackIn_66_1 = (StringBuilder) ((Object) stackIn_63_1);
                        stackIn_64_1 = stackIn_66_1;
                        if (stackIn_63_2 >= stackIn_63_3) {
                            statePc = 66;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        stackIn_67_0 = (StringBuilder) ((Object) stackIn_64_0);
                        stackIn_67_1 = (StringBuilder) ((Object) stackIn_64_1);
                        stackIn_67_2 = ",";
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        stackIn_67_0 = (StringBuilder) ((Object) stackIn_66_0);
                        stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
                        stackIn_67_2 = "";
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        discarded$19 = ((StringBuilder) (Object) stackIn_67_0).append(stackIn_67_2);
                        var4++;
                        if (var6 == 0) {
                            statePc = 61;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        discarded$20 = var1.append("]\tformation=" + this.field_r[var3]);
                        if (this.field_F[var3]) {
                            statePc = 71;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        discarded$21 = var1.append("\tteam_immunity");
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        discarded$22 = var1.append("\n");
                        var3++;
                        if (var6 == 0) {
                            statePc = 47;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        stackIn_74_0 = -1;
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (stackIn_74_0 != (this.field_u ^ -1)) {
                            statePc = 77;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        discarded$23 = var1.append("\t" + this.field_n);
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if ((this.field_u ^ -1) == -3) {
                            statePc = 80;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        discarded$24 = var1.append("\t" + this.field_C);
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if (-4 == (this.field_u ^ -1)) {
                            statePc = 84;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        discarded$25 = var1.append("\t" + this.field_o);
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (-5 == (this.field_u ^ -1)) {
                            statePc = 88;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        discarded$26 = var1.append("\n\t" + this.field_X);
                        discarded$27 = var1.append("\n\t" + this.field_V);
                        var3 = 0;
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        stackIn_90_0 = 2;
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (stackIn_90_0 <= var3) {
                            statePc = 99;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        var4 = 0;
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if (var4 >= 5) {
                            statePc = 98;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        discarded$28 = var1.append("\n\t" + var3 + "." + var4 + " " + this.field_P[var3][var4]);
                        var5 = this.a((byte) 6, var3, var4);
                        stackIn_90_0 = var5 ^ -1;
                        stackIn_94_0 = stackIn_90_0;
                        if (var6 != 0) {
                            statePc = 90;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        if (stackIn_94_0 != 0) {
                            statePc = 96;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        discarded$29 = var1.append("\n\t\tCTRL=\t" + this.field_S[var5]);
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        var4++;
                        if (var6 == 0) {
                            statePc = 92;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        var3++;
                        if (var6 == 0) {
                            statePc = 89;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        stackIn_100_0 = var1.toString();
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 100: {
                    return stackIn_100_0;
                }
                case 101: {
                    var1_ref = (RuntimeException) ((Object) caughtException);
                    throw nb.a((Throwable) ((Object) var1_ref), "nu.toString()");
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(ml param0, int param1, int param2) {
        int stackIn_29_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_68_1 = 0;
        int stackIn_85_0 = 0;
        int stackIn_85_1 = 0;
        int stackIn_111_0 = 0;
        int stackIn_120_0 = 0;
        RuntimeException stackIn_136_0 = null;
        StringBuilder stackIn_136_1 = null;
        RuntimeException stackIn_138_0 = null;
        StringBuilder stackIn_138_1 = null;
        RuntimeException stackIn_139_0 = null;
        StringBuilder stackIn_139_1 = null;
        String stackIn_139_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Kickabout.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        param0.p(param2 ^ -118);
                        var4_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var4_int >= this.field_I) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        this.field_g[var4_int].field_h = param0.l(16, 59);
                        this.field_g[var4_int].field_f = param0.l(3, 59);
                        var4_int++;
                        if (var7 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var7 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        this.field_u = param0.l(3, param2 ^ 58);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (this.field_u <= 0) {
                            statePc = 25;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var4_int = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var4_int >= this.field_I) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        this.field_g[var4_int].field_p = param0.l(1, 59);
                        var4_int++;
                        if (var7 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var7 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var4_int = 0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (-3 >= (var4_int ^ -1)) {
                            statePc = 23;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        this.field_H[var4_int] = param0.l(5, 59);
                        this.field_d[var4_int] = param0.l(5, param2 + 58);
                        this.field_Q[var4_int] = param0.l(5, 59);
                        var4_int++;
                        if (var7 != 0) {
                            statePc = 24;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var7 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        this.field_t = param0.l(2, 59);
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        this.field_m = param0.l(2, 59);
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (2 >= this.field_u) {
                            statePc = 37;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var4_int = 0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var4_int >= 2) {
                            statePc = 37;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        this.field_r[var4_int] = param0.l(3, 59);
                        stackIn_38_0 = 0;
                        stackIn_29_0 = stackIn_38_0;
                        if (var7 != 0) {
                            statePc = 38;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var5 = stackIn_29_0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (4 <= var5) {
                            statePc = 35;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        this.field_i[var4_int][var5] = param0.l(3, ek.b(param2, 58));
                        var5++;
                        if (var7 != 0) {
                            statePc = 36;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (var7 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var4_int++;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (var7 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackIn_38_0 = 3;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (stackIn_38_0 >= this.field_u) {
                            statePc = 63;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var4_int = 0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if ((var4_int ^ -1) <= -3) {
                            statePc = 50;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackIn_51_0 = 0;
                        stackIn_42_0 = stackIn_51_0;
                        if (var7 != 0) {
                            statePc = 51;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var5 = stackIn_42_0;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (-5 >= (var5 ^ -1)) {
                            statePc = 48;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        this.field_k[var4_int][var5] = param0.l(4, 59) + -1;
                        var5++;
                        if (var7 != 0) {
                            statePc = 49;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (var7 == 0) {
                            statePc = 43;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var4_int++;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var7 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        param0.l((byte) 121);
                        stackIn_51_0 = 0;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var4_int = stackIn_51_0;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (-3 >= (var4_int ^ -1)) {
                            statePc = 62;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        stackIn_64_0 = 0;
                        stackIn_54_0 = stackIn_64_0;
                        if (var7 != 0) {
                            statePc = 64;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var5 = stackIn_54_0;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (-5 >= (var5 ^ -1)) {
                            statePc = 60;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        this.field_b[var4_int][var5].a(param2 ^ 46, param0);
                        var5++;
                        if (var7 != 0) {
                            statePc = 61;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (var7 == 0) {
                            statePc = 55;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var4_int++;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (var7 == 0) {
                            statePc = 52;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        param0.p(-116);
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        stackIn_64_0 = 5;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (stackIn_64_0 > this.field_u) {
                            statePc = 84;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        this.field_Z = param0.l(3, 59) + -3;
                        var4_int = 0;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if ((this.field_I ^ -1) >= (var4_int ^ -1)) {
                            statePc = 84;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        this.field_g[var4_int].field_l = mu.a(param0, (byte) -39);
                        this.field_g[var4_int].field_i = mu.a(param0, (byte) -39);
                        stackIn_85_0 = var4_int;
                        stackIn_68_0 = stackIn_85_0;
                        stackIn_85_1 = param1;
                        stackIn_68_1 = stackIn_85_1;
                        if (var7 != 0) {
                            statePc = 85;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (stackIn_68_0 != stackIn_68_1) {
                            statePc = 82;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var5 = param0.l(1, 59);
                        if (var5 != 1) {
                            statePc = 72;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        param0.l(7, 59);
                        this.field_g[var4_int].field_g = param0.l(15, 59);
                        var5 = param0.l(1, 59);
                        this.field_g[var4_int].field_k = param0.l(6, 59);
                        if ((var5 ^ -1) == -2) {
                            statePc = 75;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        this.field_g[var4_int].field_k = -this.field_g[var4_int].field_k;
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        var6 = 0;
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if ((var6 ^ -1) <= (this.field_g[var4_int].field_o.length ^ -1)) {
                            statePc = 82;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        this.field_g[var4_int].field_o[var6] = param0.l(8, 59);
                        var6++;
                        if (var7 != 0) {
                            statePc = 83;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (var7 == 0) {
                            statePc = 77;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        var4_int++;
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if (var7 == 0) {
                            statePc = 66;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        this.a(this.field_u, (byte) -124);
                        stackIn_85_0 = param2;
                        stackIn_85_1 = 1;
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (stackIn_85_0 == stackIn_85_1) {
                            statePc = 87;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 86: {
                    return;
                }
                case 87: {
                    try {
                        this.field_v = -1 + sk.a(19881, 8, 0, 4, param0, 16);
                        var4_int = 0;
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if (var4_int >= this.field_I) {
                            statePc = 93;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        this.field_R[var4_int].b(param0, 4);
                        this.field_R[var4_int].c(param0, param2 + 0);
                        var4_int++;
                        if (var7 != 0) {
                            statePc = 97;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (var7 == 0) {
                            statePc = 88;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        if ((this.field_u ^ -1) == -1) {
                            statePc = 96;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        this.field_n.b(param0, 4);
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        this.field_n.a(74, param0);
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        if ((this.field_u ^ -1) == -3) {
                            statePc = 101;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        this.field_C.b(param0, 4);
                        this.field_C.c(param0, 2);
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if (3 != this.field_u) {
                            statePc = 105;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        this.field_o.b(param0, 4);
                        this.field_o.a(param0, false);
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        if (this.field_u == 4) {
                            statePc = 108;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        this.field_V.b(param0, 4);
                        var4_int = 0;
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        if ((var4_int ^ -1) <= -3) {
                            statePc = 119;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        stackIn_120_0 = 0;
                        stackIn_111_0 = stackIn_120_0;
                        if (var7 != 0) {
                            statePc = 120;
                        } else {
                            statePc = 111;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        var5 = stackIn_111_0;
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        if (var5 >= 5) {
                            statePc = 117;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        this.field_P[var4_int][var5].b(param0, 4);
                        var5++;
                        if (var7 != 0) {
                            statePc = 118;
                        } else {
                            statePc = 114;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        if (var7 == 0) {
                            statePc = 112;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        var4_int++;
                        statePc = 118;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        if (var7 == 0) {
                            statePc = 109;
                        } else {
                            statePc = 119;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        this.field_X.b(param0, param2 ^ 5);
                        stackIn_120_0 = 0;
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        var4_int = stackIn_120_0;
                        statePc = 121;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        if (-3 >= (var4_int ^ -1)) {
                            statePc = 131;
                        } else {
                            statePc = 122;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        if (var7 != 0) {
                            statePc = 132;
                        } else {
                            statePc = 123;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        var5 = 0;
                        statePc = 124;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        if (-6 >= (var5 ^ -1)) {
                            statePc = 129;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        this.field_P[var4_int][var5].a(param2 + -13919, param0);
                        var5++;
                        if (var7 != 0) {
                            statePc = 130;
                        } else {
                            statePc = 126;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        if (var7 == 0) {
                            statePc = 124;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        statePc = 129;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        var4_int++;
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        if (var7 == 0) {
                            statePc = 121;
                        } else {
                            statePc = 131;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        this.field_V.a(param0, (byte) -124);
                        this.field_X.a(param0, (byte) -84);
                        this.field_J = param0.l(8, 59);
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        this.field_G = mu.a(param0, (byte) -39);
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        param0.l((byte) 95);
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 135: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_138_0 = (RuntimeException) (var4);
                    stackIn_136_0 = stackIn_138_0;
                    stackIn_138_1 = new StringBuilder().append("nu.P(");
                    stackIn_136_1 = stackIn_138_1;
                    if (param0 == null) {
                        statePc = 138;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    stackIn_139_0 = (RuntimeException) ((Object) stackIn_136_0);
                    stackIn_139_1 = (StringBuilder) ((Object) stackIn_136_1);
                    stackIn_139_2 = "{...}";
                    statePc = 139;
                    continue stateLoop;
                }
                case 138: {
                    stackIn_139_0 = (RuntimeException) ((Object) stackIn_138_0);
                    stackIn_139_1 = (StringBuilder) ((Object) stackIn_138_1);
                    stackIn_139_2 = "null";
                    statePc = 139;
                    continue stateLoop;
                }
                case 139: {
                    throw nb.a((Throwable) ((Object) stackIn_139_0), stackIn_139_2 + ',' + param1 + ',' + param2 + ')');
                }
                case 140: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    nu(String[] param0, int param1, int param2, boolean param3, boolean param4, boolean param5, boolean param6, boolean param7, boolean param8) {
        Object stackIn_4_0 = null;
        it[] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        it stackIn_5_2 = null;
        it stackIn_5_3 = null;
        int stackIn_5_4 = 0;
        it[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        it stackIn_7_2 = null;
        it stackIn_7_3 = null;
        int stackIn_7_4 = 0;
        it[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        it stackIn_9_2 = null;
        it stackIn_9_3 = null;
        int stackIn_9_4 = 0;
        it[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        it stackIn_10_2 = null;
        it stackIn_10_3 = null;
        int stackIn_10_4 = 0;
        int stackIn_10_5 = 0;
        Object stackIn_12_0 = null;
        int stackIn_15_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = Kickabout.field_G;
                    this.field_u = -1;
                    this.field_E = new tf();
                    this.field_l = false;
                    this.field_A = false;
                    this.field_h = false;
                    this.field_z = false;
                    this.field_p = false;
                    this.field_Z = -2;
                    this.field_s = false;
                    this.field_B = vi.field_t;
                    this.field_y = false;
                    this.field_Y = false;
                    this.field_G = false;
                    this.field_x = wk.field_g;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_W = param7;
                        this.field_S = param0;
                        this.field_T = param6;
                        this.field_e = param4;
                        this.field_U = param1;
                        this.field_f = param3;
                        this.field_c = param2;
                        this.field_w = param8;
                        this.field_L = param5;
                        this.field_I = this.field_S.length;
                        this.field_O = op.field_z[this.field_U];
                        this.field_g = new it[this.field_I];
                        this.field_R = new gt[this.field_I];
                        var10_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var10_int >= this.field_I) {
                            statePc = 11;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_12_0 = this;
                        stackIn_4_0 = stackIn_12_0;
                        if (var12 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_9_0 = ((nu) (this)).field_g;
                        stackIn_5_0 = stackIn_9_0;
                        stackIn_9_1 = var10_int;
                        stackIn_5_1 = stackIn_9_1;
                        stackIn_9_2 = null;
                        stackIn_5_2 = stackIn_9_2;
                        stackIn_9_3 = null;
                        stackIn_5_3 = stackIn_9_3;
                        stackIn_9_4 = var10_int;
                        stackIn_5_4 = stackIn_9_4;
                        if (1 != qj.b(this.field_c >> var10_int, 1)) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_7_0 = (it[]) ((Object) stackIn_5_0);
                        stackIn_7_1 = stackIn_5_1;
                        stackIn_7_2 = null;
                        stackIn_7_3 = null;
                        stackIn_7_4 = stackIn_5_4;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_10_0 = (it[]) ((Object) stackIn_7_0);
                        stackIn_10_1 = stackIn_7_1;
                        stackIn_10_2 = null;
                        stackIn_10_3 = null;
                        stackIn_10_4 = stackIn_7_4;
                        stackIn_10_5 = 1;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackIn_10_0 = (it[]) ((Object) stackIn_9_0);
                        stackIn_10_1 = stackIn_9_1;
                        stackIn_10_2 = null;
                        stackIn_10_3 = null;
                        stackIn_10_4 = stackIn_9_4;
                        stackIn_10_5 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_10_0[stackIn_10_1] = new it(stackIn_10_4, stackIn_10_5 != 0);
                        this.field_R[var10_int] = new gt();
                        var10_int++;
                        if (var12 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        this.field_r = new int[2];
                        this.field_b = new up[2][4];
                        this.field_k = new int[2][4];
                        stackIn_12_0 = this;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        ((nu) (this)).field_i = new int[2][4];
                        var10_int = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var10_int >= 2) {
                            statePc = 23;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackIn_24_0 = 0;
                        stackIn_15_0 = stackIn_24_0;
                        if (var12 != 0) {
                            statePc = 24;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var11 = stackIn_15_0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var11 >= 4) {
                            statePc = 21;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        this.field_b[var10_int][var11] = new up();
                        this.field_k[var10_int][var11] = -1;
                        var11++;
                        if (var12 != 0) {
                            statePc = 22;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var12 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var10_int++;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var12 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        this.field_d = new int[2];
                        this.field_H = new int[2];
                        this.field_F = new boolean[2];
                        this.field_Q = new int[2];
                        this.field_N = new ch();
                        this.field_ab = new p(this.field_I);
                        this.field_q = new jc[this.field_I];
                        stackIn_24_0 = 0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var10_int = stackIn_24_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if ((this.field_I ^ -1) >= (var10_int ^ -1)) {
                            statePc = 36;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        this.field_q[var10_int] = new jc();
                        var10_int++;
                        if (var12 != 0) {
                            statePc = 36;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var12 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 31: {
                    var10 = (RuntimeException) ((Object) caughtException);
                    stackIn_34_0 = (RuntimeException) (var10);
                    stackIn_32_0 = stackIn_34_0;
                    stackIn_34_1 = new StringBuilder().append("nu.<init>(");
                    stackIn_32_1 = stackIn_34_1;
                    if (param0 == null) {
                        statePc = 34;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    stackIn_35_0 = (RuntimeException) ((Object) stackIn_32_0);
                    stackIn_35_1 = (StringBuilder) ((Object) stackIn_32_1);
                    stackIn_35_2 = "{...}";
                    statePc = 35;
                    continue stateLoop;
                }
                case 34: {
                    stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
                    stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
                    stackIn_35_2 = "null";
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    throw nb.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
                }
                case 36: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_D = "<%0> would need a rating of <%1> to play with the current options.";
        field_j = false;
        field_M = "Waiting for graphics";
        field_a = "away";
    }
}
