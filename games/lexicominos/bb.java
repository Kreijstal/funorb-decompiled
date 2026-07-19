/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb extends nb implements jk {
    private String[] field_D;
    private ag field_L;
    private kf[] field_G;
    static m field_J;
    static volatile int field_I;
    static String field_K;
    static String[] field_F;
    static db field_C;

    final void a(byte param0, int param1, int param2, int param3) {
        int discarded$2 = 0;
        le var5 = null;
        super.a(param0, param1, param2, param3);
        if (param3 == 0) {
          var5 = ql.field_Q;
          if (null != this.field_D) {
            discarded$2 = var5.a(ka.field_a, this.field_t + param2, param1 + this.field_o, this.field_j, 20, 16777215, -1, 0, 0, var5.field_G + var5.field_E);
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void a(String[] param0, boolean param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4_int = 0;
        uj var4 = null;
        int var5 = 0;
        int var6 = 0;
        kf stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        boolean stackIn_16_3 = false;
        kf stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        kf stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        kf stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        int stackIn_19_3 = 0;
        kf stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        boolean stackIn_21_3 = false;
        kf stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        kf stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        kf stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        kf stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        boolean stackOut_20_3 = false;
        kf stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        boolean stackOut_15_3 = false;
        kf stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        kf stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        int stackOut_18_3 = 0;
        kf stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        int stackOut_17_3 = 0;
        kf stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        kf stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        kf stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_A.g(-81);
              if (param0 == null) {
                break L1;
              } else {
                if (param0.length == 0) {
                  break L1;
                } else {
                  var3_int = param0.length;
                  this.field_D = new String[var3_int];
                  var4_int = 0;
                  L2: while (true) {
                    L3: {
                      if (var3_int <= var4_int) {
                        if (!param1) {
                          break L3;
                        } else {
                          field_J = (m) null;
                          break L3;
                        }
                      } else {
                        this.field_D[var4_int] = pj.a((CharSequence) ((Object) param0[var4_int]), (byte) -126).replace(' ', ' ');
                        var4_int++;
                        if (var6 != 0) {
                          break L3;
                        } else {
                          continue L2;
                        }
                      }
                    }
                    var4 = new uj(ql.field_Q, 0, 1);
                    this.field_G = new kf[1 + var3_int];
                    var5 = 0;
                    L4: while (true) {
                      L5: {
                        if (var3_int <= var5) {
                          this.field_G[var3_int] = new kf(bc.field_J, (vd) (this));
                          this.field_G[var3_int].field_i = (rd) ((Object) var4);
                          stackOut_20_0 = this.field_G[var3_int];
                          stackOut_20_1 = 15;
                          stackOut_20_2 = 100;
                          stackOut_20_3 = param1;
                          stackIn_21_0 = stackOut_20_0;
                          stackIn_21_1 = stackOut_20_1;
                          stackIn_21_2 = stackOut_20_2;
                          stackIn_21_3 = stackOut_20_3;
                          break L5;
                        } else {
                          this.field_G[var5] = new kf(this.field_D[var5], (vd) (this));
                          this.field_G[var5].field_i = (rd) ((Object) var4);
                          this.field_G[var5].field_q = cb.field_A;
                          stackOut_15_0 = this.field_G[var5];
                          stackOut_15_1 = 15;
                          stackOut_15_2 = 80;
                          stackOut_15_3 = param1;
                          stackIn_21_0 = stackOut_15_0;
                          stackIn_21_1 = stackOut_15_1;
                          stackIn_21_2 = stackOut_15_2;
                          stackIn_21_3 = stackOut_15_3;
                          stackIn_16_0 = stackOut_15_0;
                          stackIn_16_1 = stackOut_15_1;
                          stackIn_16_2 = stackOut_15_2;
                          stackIn_16_3 = stackOut_15_3;
                          if (var6 != 0) {
                            break L5;
                          } else {
                            L6: {
                              stackOut_16_0 = (kf) ((Object) stackIn_16_0);
                              stackOut_16_1 = stackIn_16_1;
                              stackOut_16_2 = stackIn_16_2;
                              stackIn_18_0 = stackOut_16_0;
                              stackIn_18_1 = stackOut_16_1;
                              stackIn_18_2 = stackOut_16_2;
                              stackIn_17_0 = stackOut_16_0;
                              stackIn_17_1 = stackOut_16_1;
                              stackIn_17_2 = stackOut_16_2;
                              if (stackIn_16_3) {
                                stackOut_18_0 = (kf) ((Object) stackIn_18_0);
                                stackOut_18_1 = stackIn_18_1;
                                stackOut_18_2 = stackIn_18_2;
                                stackOut_18_3 = 0;
                                stackIn_19_0 = stackOut_18_0;
                                stackIn_19_1 = stackOut_18_1;
                                stackIn_19_2 = stackOut_18_2;
                                stackIn_19_3 = stackOut_18_3;
                                break L6;
                              } else {
                                stackOut_17_0 = (kf) ((Object) stackIn_17_0);
                                stackOut_17_1 = stackIn_17_1;
                                stackOut_17_2 = stackIn_17_2;
                                stackOut_17_3 = 1;
                                stackIn_19_0 = stackOut_17_0;
                                stackIn_19_1 = stackOut_17_1;
                                stackIn_19_2 = stackOut_17_2;
                                stackIn_19_3 = stackOut_17_3;
                                break L6;
                              }
                            }
                            ((kf) (Object) stackIn_19_0).a(stackIn_19_1, stackIn_19_2, stackIn_19_3 != 0, 20 + 16 * var5, 0);
                            this.b((byte) 112, this.field_G[var5]);
                            var5++;
                            continue L4;
                          }
                        }
                      }
                      L7: {
                        stackOut_21_0 = (kf) ((Object) stackIn_21_0);
                        stackOut_21_1 = stackIn_21_1;
                        stackOut_21_2 = stackIn_21_2;
                        stackIn_23_0 = stackOut_21_0;
                        stackIn_23_1 = stackOut_21_1;
                        stackIn_23_2 = stackOut_21_2;
                        stackIn_22_0 = stackOut_21_0;
                        stackIn_22_1 = stackOut_21_1;
                        stackIn_22_2 = stackOut_21_2;
                        if (stackIn_21_3) {
                          stackOut_23_0 = (kf) ((Object) stackIn_23_0);
                          stackOut_23_1 = stackIn_23_1;
                          stackOut_23_2 = stackIn_23_2;
                          stackOut_23_3 = 0;
                          stackIn_24_0 = stackOut_23_0;
                          stackIn_24_1 = stackOut_23_1;
                          stackIn_24_2 = stackOut_23_2;
                          stackIn_24_3 = stackOut_23_3;
                          break L7;
                        } else {
                          stackOut_22_0 = (kf) ((Object) stackIn_22_0);
                          stackOut_22_1 = stackIn_22_1;
                          stackOut_22_2 = stackIn_22_2;
                          stackOut_22_3 = 1;
                          stackIn_24_0 = stackOut_22_0;
                          stackIn_24_1 = stackOut_22_1;
                          stackIn_24_2 = stackOut_22_2;
                          stackIn_24_3 = stackOut_22_3;
                          break L7;
                        }
                      }
                      ((kf) (Object) stackIn_24_0).a(stackIn_24_1, stackIn_24_2, stackIn_24_3 != 0, (1 + var3_int) * 16 + 20, 0);
                      this.b((byte) -80, this.field_G[var3_int]);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
              }
            }
            this.field_D = null;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) (var3);
            stackOut_26_1 = new StringBuilder().append("bb.C(");
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L8;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(char param0, int param1, w param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_6_0 = false;
        boolean stackOut_10_0 = false;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            var5_int = 120 % ((param3 - -13) / 55);
            if (super.a(param0, param1, param2, (byte) 42)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((param1 ^ -1) == -99) {
                stackOut_6_0 = this.a(0, param2);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (99 == param1) {
                  stackOut_10_0 = this.c((byte) 119, param2);
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var5);
            stackOut_12_1 = new StringBuilder().append("bb.P(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_11_0;
          }
        }
    }

    public final void a(int param0, int param1, int param2, int param3, kf param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        kf stackIn_4_0 = null;
        kf stackIn_4_1 = null;
        kf stackIn_6_0 = null;
        kf stackIn_6_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        kf stackOut_3_0 = null;
        kf stackOut_3_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (var6_int >= this.field_D.length) {
                      break L4;
                    } else {
                      stackOut_3_0 = this.field_G[var6_int];
                      stackOut_3_1 = (kf) (param4);
                      stackIn_6_0 = stackOut_3_0;
                      stackIn_6_1 = stackOut_3_1;
                      stackIn_4_0 = stackOut_3_0;
                      stackIn_4_1 = stackOut_3_1;
                      if (var7 != 0) {
                        if (stackIn_6_0 == stackIn_6_1) {
                          break L3;
                        } else {
                          break L2;
                        }
                      } else {
                        L5: {
                          if (stackIn_4_0 != stackIn_4_1) {
                            break L5;
                          } else {
                            this.field_L.a(this.field_D[var6_int], (byte) 110);
                            break L5;
                          }
                        }
                        var6_int++;
                        if (var7 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (this.field_G[this.field_D.length] == param4) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
                this.field_L.a((byte) -12);
                break L2;
              }
              if (param2 == 215535458) {
                break L0;
              } else {
                field_F = (String[]) null;
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var6);
            stackOut_16_1 = new StringBuilder().append("bb.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param4 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
    }

    final static boolean a(CharSequence param0, boolean param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        boolean stackIn_23_0 = false;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_36_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_32_0 = 0;
        boolean stackOut_22_0 = false;
        int stackOut_29_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var3_int = param0.length();
                if (1 > var3_int) {
                  break L1;
                } else {
                  if (-13 > (var3_int ^ -1)) {
                    break L1;
                  } else {
                    var4 = ck.a(param0, (byte) -48);
                    if (var4 == null) {
                      stackOut_13_0 = 0;
                      stackIn_14_0 = stackOut_13_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      if (var4.length() >= 1) {
                        L2: {
                          if (cf.a(var4.charAt(0), (byte) 78)) {
                            break L2;
                          } else {
                            if (cf.a(var4.charAt(-1 + var4.length()), (byte) 78)) {
                              break L2;
                            } else {
                              var5 = 0;
                              var6 = 0;
                              L3: while (true) {
                                L4: {
                                  if (var6 >= param0.length()) {
                                    stackOut_32_0 = var5 ^ -1;
                                    stackIn_33_0 = stackOut_32_0;
                                    break L4;
                                  } else {
                                    var7 = param0.charAt(var6);
                                    stackOut_22_0 = cf.a((char) var7, (byte) 78);
                                    stackIn_33_0 = stackOut_22_0 ? 1 : 0;
                                    stackIn_23_0 = stackOut_22_0;
                                    if (var8 != 0) {
                                      break L4;
                                    } else {
                                      L5: {
                                        L6: {
                                          if (!stackIn_23_0) {
                                            break L6;
                                          } else {
                                            var5++;
                                            if (var8 == 0) {
                                              break L5;
                                            } else {
                                              break L6;
                                            }
                                          }
                                        }
                                        var5 = 0;
                                        break L5;
                                      }
                                      L7: {
                                        if (2 > var5) {
                                          break L7;
                                        } else {
                                          if (param1) {
                                            break L7;
                                          } else {
                                            stackOut_29_0 = 0;
                                            stackIn_30_0 = stackOut_29_0;
                                            decompiledRegionSelector0 = 4;
                                            break L0;
                                          }
                                        }
                                      }
                                      var6++;
                                      continue L3;
                                    }
                                  }
                                }
                                if (stackIn_33_0 < param2) {
                                  stackOut_35_0 = 0;
                                  stackIn_36_0 = stackOut_35_0;
                                  decompiledRegionSelector0 = 5;
                                  break L0;
                                } else {
                                  return true;
                                }
                              }
                            }
                          }
                        }
                        stackOut_18_0 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        return false;
                      }
                    }
                  }
                }
              }
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) (var3);
            stackOut_37_1 = new StringBuilder().append("bb.D(");
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param0 == null) {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L8;
            } else {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L8;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_30_0 != 0;
                } else {
                  return stackIn_36_0 != 0;
                }
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_F = null;
        field_C = null;
        field_K = null;
        if (param0 != -26) {
            field_C = (db) null;
            field_J = null;
            return;
        }
        field_J = null;
    }

    bb(ag param0) {
        super(0, 0, 0, 0, (rd) null);
        try {
            this.field_L = param0;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "bb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_I = 0;
        field_J = new m("email");
        field_K = "Create";
        field_F = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_C = new db(311, 450);
    }
}
