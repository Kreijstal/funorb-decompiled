/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th extends sh {
    static volatile int field_s;
    static String[] field_m;
    private ei field_o;
    private boolean field_B;
    private int field_u;
    private ei field_C;
    private wk field_y;
    private wk field_F;
    static int field_n;
    private ei field_t;
    private int field_E;
    static int field_D;
    private int field_A;
    private int field_x;
    private int[] field_p;
    private wk field_r;
    static mf field_z;
    private int[] field_q;
    static dd[] field_v;
    private boolean field_w;

    private final void a(byte param0, int param1, int param2, ei param3) {
        param3.a(param2, true, -1);
        if (param0 < 16) {
            return;
        }
        try {
            param3.a((byte) -49, param1);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "th.E(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized void a(wk param0, int param1, int param2, boolean param3, int param4, int param5) {
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_34_0 = 0;
        ei stackIn_43_0 = null;
        ei stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        ei stackIn_52_0 = null;
        ei stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        var8 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!this.field_B) {
                break L1;
              } else {
                if (param3) {
                  L2: {
                    L3: {
                      if (this.field_u > 0) {
                        break L3;
                      } else {
                        L4: {
                          if (this.field_r == null) {
                            break L4;
                          } else {
                            this.field_o.e(-398);
                            break L4;
                          }
                        }
                        this.field_r = param0;
                        if (param0 == null) {
                          break L2;
                        } else {
                          this.field_o.a(false, 64, param0);
                          this.a((byte) 64, param1, param5, this.field_o);
                          if (var8 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    L5: {
                      if (this.field_F != null) {
                        this.field_C.e(-398);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    this.field_F = param0;
                    if (param0 != null) {
                      this.field_C.a(false, param2 + 524395, param0);
                      this.a((byte) 87, param1, param5, this.field_C);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L6: {
              stackIn_19_0 = this;

              if (!param3) {
                stackIn_20_0 = this;
                stackIn_20_1 = 0;
                break L6;
              } else {
                stackIn_20_0 = this;
                stackIn_20_1 = 1;
                break L6;
              }
            }
            ((th) (this)).field_B = stackIn_20_1 != 0;
            if (param0 != this.field_F) {
              if (param0 != this.field_r) {
                L7: {
                  if (param2 == -524289) {
                    break L7;
                  } else {
                    this.field_r = (wk) null;
                    break L7;
                  }
                }
                L8: {
                  L9: {
                    if (null != this.field_F) {
                      break L9;
                    } else {
                      var7_int = 1;
                      if (var8 == 0) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L10: {
                    if (this.field_r == null) {
                      break L10;
                    } else {
                      L11: {
                        if ((this.field_E ^ -1) <= -524289) {
                          stackIn_34_0 = 0;
                          break L11;
                        } else {
                          stackIn_34_0 = 1;
                          break L11;
                        }
                      }
                      var7_int = stackIn_34_0;
                      if (var8 == 0) {
                        break L8;
                      } else {
                        break L10;
                      }
                    }
                  }
                  var7_int = 0;
                  break L8;
                }
                L12: {
                  L13: {
                    if (var7_int != 0) {
                      break L13;
                    } else {
                      L14: {
                        if (this.field_r != null) {
                          this.field_o.e(-398);
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      L15: {
                        this.field_r = param0;
                        if (param0 == null) {
                          break L15;
                        } else {
                          L16: {
                            stackIn_43_0 = this.field_o;

                            if (param3) {
                              stackIn_44_0 = (ei) ((Object) stackIn_43_0);
                              stackIn_44_1 = 0;
                              break L16;
                            } else {
                              stackIn_44_0 = (ei) ((Object) stackIn_43_0);
                              stackIn_44_1 = 1;
                              break L16;
                            }
                          }
                          ((ei) (Object) stackIn_44_0).a(stackIn_44_1 != 0, param2 + 524353, param0);
                          this.a((byte) 104, param1, param5, this.field_o);
                          break L15;
                        }
                      }
                      this.field_u = -param4;
                      if (var8 == 0) {
                        break L12;
                      } else {
                        break L13;
                      }
                    }
                  }
                  L17: {
                    if (this.field_F != null) {
                      this.field_C.e(-398);
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    this.field_F = param0;
                    if (param0 == null) {
                      break L18;
                    } else {
                      L19: {
                        stackIn_52_0 = this.field_C;

                        if (param3) {
                          stackIn_53_0 = (ei) ((Object) stackIn_52_0);
                          stackIn_53_1 = 0;
                          break L19;
                        } else {
                          stackIn_53_0 = (ei) ((Object) stackIn_52_0);
                          stackIn_53_1 = 1;
                          break L19;
                        }
                      }
                      ((ei) (Object) stackIn_53_0).a(stackIn_53_1 != 0, 101, param0);
                      this.a((byte) 79, param1, param5, this.field_C);
                      break L18;
                    }
                  }
                  this.field_u = param4;
                  break L12;
                }
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                this.field_u = -param4;
                this.a((byte) 57, param1, param5, this.field_o);
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              this.field_u = param4;
              this.a((byte) 72, param1, param5, this.field_C);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var7 = decompiledCaughtException;
            stackIn_58_0 = (RuntimeException) (var7);

            stackIn_58_1 = new StringBuilder().append("th.F(");

            if (param0 == null) {
              stackIn_59_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackIn_59_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackIn_59_2 = "null";
              break L20;
            } else {
              stackIn_59_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackIn_59_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackIn_59_2 = "{...}";
              break L20;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_59_0), stackIn_59_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
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
              return;
            }
          }
        }
    }

    public static void b(boolean param0) {
        field_z = null;
        if (param0) {
            field_D = -86;
        }
        field_v = null;
        field_m = null;
    }

    final synchronized int a() {
        return 2;
    }

    final sh d() {
        return null;
    }

    final void b(int[] param0, int param1, int param2) {
        int stackIn_33_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_69_0 = 0;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (0 < this.field_x) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.a(param2);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        if (!this.field_B) {
                            statePc = 13;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (-1 <= (this.field_u ^ -1)) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (!this.field_C.d(31499)) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (0 <= this.field_u) {
                            statePc = 13;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (!this.field_o.d(31499)) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        this.field_B = false;
                        this.field_u = -this.field_u;
                        this.field_r = null;
                        if (var11 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        this.field_F = null;
                        this.field_B = false;
                        this.field_u = -this.field_u;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var4_int = this.field_x * (this.field_E >> 439093676) / 256;
                        var5 = this.field_x - var4_int;
                        if (0 != this.field_u) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        this.field_E = this.field_E + param2 * this.field_u;
                        if (this.field_E < 1048576) {
                            statePc = 21;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        this.field_E = 1048576;
                        if (this.field_B) {
                            statePc = 30;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        this.field_u = 0;
                        if (this.field_w) {
                            statePc = 30;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (this.field_r == null) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        this.field_o.e(-398);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        this.field_r = null;
                        if (var11 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (0 >= this.field_E) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        this.field_E = 0;
                        if (!this.field_B) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        this.field_u = 0;
                        if (this.field_w) {
                            statePc = 30;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (this.field_F != null) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        this.field_C.e(-398);
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        this.field_F = null;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (la.field_h) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackIn_33_0 = param2;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackIn_33_0 = param2 << 1335842689;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var6 = stackIn_33_0;
                        if (-257 < (this.field_A ^ -1)) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (this.field_F != null) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (this.field_r != null) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (-257 != (var4_int ^ -1)) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        this.field_C.b(param0, param1, param2);
                        if (var11 == 0) {
                            statePc = 58;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if ((var5 ^ -1) == -257) {
                            statePc = 57;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (this.field_q == null) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (var6 <= this.field_q.length) {
                            statePc = 47;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        this.field_p = new int[var6];
                        this.field_q = new int[var6];
                        if (var11 == 0) {
                            statePc = 48;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        dm.a(this.field_q, 0, var6);
                        dm.a(this.field_p, 0, var6);
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        this.field_C.b(this.field_q, 0, param2);
                        this.field_o.b(this.field_p, 0, param2);
                        if (!la.field_h) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        param1 = param1 << 1;
                        stackIn_51_0 = param1 << 1;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackIn_51_0 = param1;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var7 = stackIn_51_0;
                        var8 = 0;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (var8 >= var6) {
                            statePc = 56;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        param0[var8 + var7] = param0[var8 + var7] + (var4_int * this.field_q[var8] + this.field_p[var8] * var5 >> 1604844392);
                        var8++;
                        if (var11 != 0) {
                            statePc = 58;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var11 == 0) {
                            statePc = 52;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (var11 == 0) {
                            statePc = 58;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        this.field_o.b(param0, param1, param2);
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (this.field_y == null) {
                            statePc = 79;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (this.field_A != 0) {
                            statePc = 61;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (null == this.field_q) {
                            statePc = 65;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (this.field_q.length < var6) {
                            statePc = 65;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        dm.a(this.field_q, 0, var6);
                        if (var11 == 0) {
                            statePc = 66;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        this.field_q = new int[var6];
                        this.field_p = new int[var6];
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        this.field_t.b(this.field_q, 0, param2);
                        if (la.field_h) {
                            statePc = 68;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        stackIn_69_0 = param1;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        param1 = param1 << 1;
                        stackIn_69_0 = param1 << 1;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        var7 = stackIn_69_0;
                        var8 = this.field_A * this.field_x / 256;
                        var9 = -var8 + this.field_x;
                        var10 = 0;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (var6 <= var10) {
                            statePc = 79;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        param0[var7 - -var10] = param0[var10 + var7] * var9 - -(this.field_q[var10] * var8) >> 1513585096;
                        var10++;
                        if (var11 != 0) {
                            statePc = 79;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (var11 == 0) {
                            statePc = 70;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 75: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_77_0 = (RuntimeException) (var4);
                    stackIn_76_0 = stackIn_77_0;
                    stackIn_77_1 = new StringBuilder().append("th.G(");
                    stackIn_76_1 = stackIn_77_1;
                    if (param0 == null) {
                        statePc = 77;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    stackIn_78_0 = (RuntimeException) ((Object) stackIn_76_0);
                    stackIn_78_1 = (StringBuilder) ((Object) stackIn_76_1);
                    stackIn_78_2 = "{...}";
                    statePc = 78;
                    continue stateLoop;
                }
                case 77: {
                    stackIn_78_0 = (RuntimeException) ((Object) stackIn_77_0);
                    stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
                    stackIn_78_2 = "null";
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    throw pf.a((Throwable) ((Object) stackIn_78_0), stackIn_78_2 + ',' + param1 + ',' + param2 + ')');
                }
                case 79: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final synchronized void a(int param0, byte param1) {
        this.field_x = param0;
        if (param1 <= 2) {
            this.field_E = -91;
        }
    }

    final sh c() {
        return null;
    }

    final synchronized void a(int param0) {
        int var3;
        L0: {
          var3 = fleas.field_A ? 1 : 0;
          if (this.field_E > 0) {
            if (this.field_F != null) {
              this.field_C.a(param0);
              if (-1048577 < (this.field_E ^ -1)) {
                if (this.field_r != null) {
                  this.field_o.a(param0);
                  if (0 >= this.field_A) {
                    break L0;
                  } else {
                    if (null == this.field_y) {
                      break L0;
                    } else {
                      this.field_t.a(param0);
                      break L0;
                    }
                  }
                } else {
                  if (0 >= this.field_A) {
                    break L0;
                  } else {
                    if (null == this.field_y) {
                      break L0;
                    } else {
                      this.field_t.a(param0);
                      break L0;
                    }
                  }
                }
              } else {
                if (0 >= this.field_A) {
                  break L0;
                } else {
                  if (null == this.field_y) {
                    break L0;
                  } else {
                    this.field_t.a(param0);
                    break L0;
                  }
                }
              }
            } else {
              if (-1048577 < (this.field_E ^ -1)) {
                if (this.field_r != null) {
                  this.field_o.a(param0);
                  if (0 >= this.field_A) {
                    break L0;
                  } else {
                    if (null == this.field_y) {
                      break L0;
                    } else {
                      this.field_t.a(param0);
                      break L0;
                    }
                  }
                } else {
                  if (0 >= this.field_A) {
                    break L0;
                  } else {
                    if (null == this.field_y) {
                      break L0;
                    } else {
                      this.field_t.a(param0);
                      break L0;
                    }
                  }
                }
              } else {
                if (0 >= this.field_A) {
                  break L0;
                } else {
                  if (null == this.field_y) {
                    break L0;
                  } else {
                    this.field_t.a(param0);
                    break L0;
                  }
                }
              }
            }
          } else {
            if (-1048577 < (this.field_E ^ -1)) {
              if (this.field_r != null) {
                this.field_o.a(param0);
                if (0 >= this.field_A) {
                  break L0;
                } else {
                  if (null == this.field_y) {
                    break L0;
                  } else {
                    this.field_t.a(param0);
                    break L0;
                  }
                }
              } else {
                if (0 < this.field_A) {
                  if (null == this.field_y) {
                    break L0;
                  } else {
                    this.field_t.a(param0);
                    break L0;
                  }
                } else {
                  if (0 >= this.field_A) {
                    break L0;
                  } else {
                    if (null == this.field_y) {
                      break L0;
                    } else {
                      this.field_t.a(param0);
                      break L0;
                    }
                  }
                }
              }
            } else {
              if (0 >= this.field_A) {
                break L0;
              } else {
                if (null != this.field_y) {
                  this.field_t.a(param0);
                  break L0;
                } else {
                  if (0 >= this.field_A) {
                    break L0;
                  } else {
                    if (null == this.field_y) {
                      break L0;
                    } else {
                      this.field_t.a(param0);
                      break L0;
                    }
                  }
                }
              }
            }
          }
        }
        L1: {
          if (!this.field_B) {
            break L1;
          } else {
            L2: {
              if (-1 <= (this.field_u ^ -1)) {
                break L2;
              } else {
                if (this.field_C.d(31499)) {
                  break L2;
                } else {
                  this.field_u = -this.field_u;
                  this.field_F = null;
                  this.field_B = false;
                  if (var3 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
            if (this.field_u >= 0) {
              break L1;
            } else {
              if (!this.field_o.d(31499)) {
                this.field_B = false;
                this.field_r = null;
                this.field_u = -this.field_u;
                break L1;
              } else {
                break L1;
              }
            }
          }
        }
        L3: {
          if (-1 == (this.field_u ^ -1)) {
            break L3;
          } else {
            L4: {
              this.field_E = this.field_E + param0 * this.field_u;
              if (1048576 <= this.field_E) {
                break L4;
              } else {
                if (this.field_E <= 0) {
                  this.field_E = 0;
                  if (!this.field_B) {
                    this.field_u = 0;
                    if (this.field_w) {
                      break L3;
                    } else {
                      L5: {
                        if (this.field_F != null) {
                          this.field_C.e(-398);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      this.field_F = null;
                      if (var3 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  } else {
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
            }
            this.field_E = 1048576;
            if (!this.field_B) {
              this.field_u = 0;
              if (this.field_w) {
                break L3;
              } else {
                L6: {
                  if (null == this.field_r) {
                    break L6;
                  } else {
                    this.field_o.e(-398);
                    break L6;
                  }
                }
                this.field_r = null;
                break L3;
              }
            } else {
              break L3;
            }
          }
        }
    }

    private th() throws Throwable {
        throw new Error();
    }

    static {
        field_m = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_s = 0;
        field_n = 0;
        field_D = 256;
        field_v = new dd[50];
    }
}
