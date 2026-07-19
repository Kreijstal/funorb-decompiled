/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ul extends rg {
    private long field_Y;
    private boolean field_Z;
    static boolean field_W;
    private int field_S;
    static bi field_P;
    private int field_R;
    static mi field_U;
    private long field_T;
    private boolean field_X;
    private int field_Q;
    private int field_V;

    private final void m(byte param0) {
        int var2 = 0;
        int var3 = 0;
        if (this.field_Q != this.field_R) {
            var2 = this.field_R < this.field_Q ? this.field_R : this.field_Q;
            var3 = this.field_Q <= this.field_R ? this.field_R : this.field_Q;
            this.field_Q = var2;
            this.field_R = var2;
            this.field_B = this.field_B.substring(0, var2) + this.field_B.substring(var3, this.field_B.length());
            this.k((byte) -126);
        }
        if (param0 >= -120) {
            this.l((byte) -38);
        }
    }

    ul(String param0, uk param1, int param2) {
        super(param0, param1);
        this.field_T = 0L;
        this.field_Z = false;
        this.field_V = -1;
        try {
            this.field_S = param2;
            this.field_n = bg.field_d.field_u;
            this.a(true, false, param0);
            this.field_X = true;
            this.field_Y = ri.a(-3);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "ul.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void b(int param0, int param1) {
        String discarded$0 = null;
        this.field_Q = param1;
        if (param0 != -12521) {
            discarded$0 = this.j(47);
        }
        if (!mc.field_e[81]) {
            this.field_R = this.field_Q;
        }
    }

    final void a(boolean param0, boolean param1, String param2) {
        int dupTemp$3 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              if (!param1) {
                break L1;
              } else {
                this.field_T = 93L;
                break L1;
              }
            }
            L2: {
              if (param2 != null) {
                break L2;
              } else {
                param2 = "";
                break L2;
              }
            }
            L3: {
              this.field_B = param2;
              var4_int = param2.length();
              if (0 == (this.field_S ^ -1)) {
                break L3;
              } else {
                if (this.field_S >= var4_int) {
                  break L3;
                } else {
                  this.field_B = this.field_B.substring(0, this.field_S);
                  break L3;
                }
              }
            }
            L4: {
              dupTemp$3 = this.field_B.length();
              this.field_R = dupTemp$3;
              this.field_Q = dupTemp$3;
              if (!param0) {
                this.k((byte) -126);
                break L4;
              } else {
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var4);
            stackOut_11_1 = new StringBuilder().append("ul.P(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    final void l(byte param0) {
        String discarded$0 = null;
        this.field_B = "";
        this.field_Q = 0;
        this.field_R = 0;
        this.k((byte) -126);
        if (param0 < 13) {
            discarded$0 = ul.k(-26);
        }
    }

    private final void j(byte param0) {
        this.h((byte) 32);
        this.m((byte) -124);
        if (param0 >= -14) {
            this.field_S = -93;
        }
    }

    private final void g(int param0) {
        sc var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        pj var9 = null;
        var8 = Confined.field_J ? 1 : 0;
        if (this.field_X) {
          if (this.field_n instanceof pj) {
            var9 = (pj) ((Object) this.field_n);
            var3 = var9.a((fj) (this), (byte) -114);
            if (param0 >= 111) {
              var4 = var3.a(true);
              var5 = var9.a((fj) (this), -123);
              var6 = var9.a(-1431655766) >> 2021856001;
              if (var4 < -var6 + var5) {
                this.field_y = 0;
                this.field_v = 0;
                return;
              } else {
                L0: {
                  var7 = this.field_v - -var3.a(this.field_Q, -125);
                  if (var7 > var5 + -var6) {
                    this.field_v = this.field_v + var5 - (var6 - -var7);
                    break L0;
                  } else {
                    if (var6 > var7) {
                      this.field_v = -var7 - (-var6 - this.field_v);
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                }
                L1: {
                  if (this.field_v <= 0) {
                    if (var6 + -var5 > this.field_v) {
                      this.field_v = -var5 - -var6;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    this.field_v = 0;
                    break L1;
                  }
                }
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          this.field_y = 0;
          this.field_v = 0;
          return;
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        pj var5 = null;
        long var6 = 0L;
        if (param2 <= 36) {
            return;
        }
        if (this.field_n != null) {
            if (-1 == (param1 ^ -1)) {
                this.field_n.a((byte) -122, param3, this.field_L, (fj) (this), param0);
                if (!(!(this.field_n instanceof pj))) {
                    var5 = (pj) ((Object) this.field_n);
                    if (!(this.field_Q == this.field_R)) {
                        var5.a(param3, (fj) (this), 0, this.field_R, param0, this.field_Q);
                    }
                    var6 = ri.a(-3);
                    if (500L > (var6 - this.field_Y) % 1000L) {
                        var5.a(param3, (fj) (this), param0, -71, this.field_Q);
                    }
                }
            }
        }
    }

    private final int f(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Confined.field_J ? 1 : 0;
        var2 = this.field_B.length();
        if (param0 == 0) {
          if (var2 != this.field_Q) {
            var3 = this.field_Q - -1;
            L0: while (true) {
              L1: {
                if (var3 >= var2) {
                  break L1;
                } else {
                  if (32 == this.field_B.charAt(-1 + var3)) {
                    break L1;
                  } else {
                    var3++;
                    continue L0;
                  }
                }
              }
              return var3;
            }
          } else {
            return this.field_Q;
          }
        } else {
          return 39;
        }
    }

    final boolean a(fj param0, byte param1, int param2, char param3) {
        int dupTemp$1 = 0;
        RuntimeException var5 = null;
        int var5_int = 0;
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        int stackIn_27_0 = 0;
        Object stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        Object stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        Object stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int stackIn_34_2 = 0;
        int stackIn_35_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_78_0 = 0;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_37_0 = 0;
        Object stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_33_2 = 0;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        int stackOut_32_2 = 0;
        int stackOut_34_0 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        int stackOut_26_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_77_0 = 0;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        try {
          L0: {
            this.field_Y = ri.a(-3);
            if (param3 == 60) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param3 != 62) {
                L1: {
                  if (param3 < 32) {
                    break L1;
                  } else {
                    if (param3 <= 126) {
                      L2: {
                        if (this.field_Q == this.field_R) {
                          break L2;
                        } else {
                          this.m((byte) -121);
                          break L2;
                        }
                      }
                      L3: {
                        L4: {
                          if (this.field_S == -1) {
                            break L4;
                          } else {
                            if (this.field_B.length() < this.field_S) {
                              break L4;
                            } else {
                              break L3;
                            }
                          }
                        }
                        L5: {
                          if (this.field_Q < this.field_B.length()) {
                            this.field_B = this.field_B.substring(0, this.field_Q) + param3 + this.field_B.substring(this.field_Q, this.field_B.length());
                            this.field_Q = this.field_Q + 1;
                            this.field_R = this.field_Q;
                            break L5;
                          } else {
                            this.field_B = this.field_B + param3;
                            dupTemp$1 = this.field_B.length();
                            this.field_Q = dupTemp$1;
                            this.field_R = dupTemp$1;
                            break L5;
                          }
                        }
                        this.k((byte) -121);
                        break L3;
                      }
                      stackOut_75_0 = 1;
                      stackIn_76_0 = stackOut_75_0;
                      decompiledRegionSelector0 = 14;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                L6: {
                  if (85 == param2) {
                    if (this.field_R == this.field_Q) {
                      if (0 < this.field_Q) {
                        this.field_R = this.field_Q + -1;
                        this.m((byte) -127);
                        stackOut_64_0 = 1;
                        stackIn_65_0 = stackOut_64_0;
                        decompiledRegionSelector0 = 13;
                        break L0;
                      } else {
                        break L6;
                      }
                    } else {
                      this.m((byte) -123);
                      stackOut_60_0 = 1;
                      stackIn_61_0 = stackOut_60_0;
                      decompiledRegionSelector0 = 12;
                      break L0;
                    }
                  } else {
                    if ((param2 ^ -1) != -102) {
                      if (param2 != 13) {
                        if ((param2 ^ -1) != -97) {
                          if ((param2 ^ -1) != -98) {
                            if (-103 != (param2 ^ -1)) {
                              if (103 != param2) {
                                if (-85 == (param2 ^ -1)) {
                                  this.i((byte) 122);
                                  stackOut_57_0 = 1;
                                  stackIn_58_0 = stackOut_57_0;
                                  decompiledRegionSelector0 = 11;
                                  break L0;
                                } else {
                                  L7: {
                                    if (!mc.field_e[82]) {
                                      break L7;
                                    } else {
                                      if (65 != param2) {
                                        break L7;
                                      } else {
                                        this.j((byte) -89);
                                        stackOut_45_0 = 1;
                                        stackIn_46_0 = stackOut_45_0;
                                        decompiledRegionSelector0 = 8;
                                        break L0;
                                      }
                                    }
                                  }
                                  L8: {
                                    if (!mc.field_e[82]) {
                                      break L8;
                                    } else {
                                      if (66 == param2) {
                                        this.h((byte) 71);
                                        stackOut_55_0 = 1;
                                        stackIn_56_0 = stackOut_55_0;
                                        decompiledRegionSelector0 = 10;
                                        break L0;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                  if (!mc.field_e[82]) {
                                    break L6;
                                  } else {
                                    if (-68 == (param2 ^ -1)) {
                                      this.i(83);
                                      stackOut_53_0 = 1;
                                      stackIn_54_0 = stackOut_53_0;
                                      decompiledRegionSelector0 = 9;
                                      break L0;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              } else {
                                this.b(-12521, this.field_B.length());
                                stackOut_40_0 = 1;
                                stackIn_41_0 = stackOut_40_0;
                                decompiledRegionSelector0 = 7;
                                break L0;
                              }
                            } else {
                              this.b(-12521, 0);
                              stackOut_37_0 = 1;
                              stackIn_38_0 = stackOut_37_0;
                              decompiledRegionSelector0 = 6;
                              break L0;
                            }
                          } else {
                            if (this.field_Q < this.field_B.length()) {
                              L9: {
                                stackOut_31_0 = this;
                                stackOut_31_1 = -12521;
                                stackIn_33_0 = stackOut_31_0;
                                stackIn_33_1 = stackOut_31_1;
                                stackIn_32_0 = stackOut_31_0;
                                stackIn_32_1 = stackOut_31_1;
                                if (!mc.field_e[82]) {
                                  stackOut_33_0 = this;
                                  stackOut_33_1 = stackIn_33_1;
                                  stackOut_33_2 = this.field_Q - -1;
                                  stackIn_34_0 = stackOut_33_0;
                                  stackIn_34_1 = stackOut_33_1;
                                  stackIn_34_2 = stackOut_33_2;
                                  break L9;
                                } else {
                                  stackOut_32_0 = this;
                                  stackOut_32_1 = stackIn_32_1;
                                  stackOut_32_2 = this.f(0);
                                  stackIn_34_0 = stackOut_32_0;
                                  stackIn_34_1 = stackOut_32_1;
                                  stackIn_34_2 = stackOut_32_2;
                                  break L9;
                                }
                              }
                              this.b(stackIn_34_1, stackIn_34_2);
                              stackOut_34_0 = 1;
                              stackIn_35_0 = stackOut_34_0;
                              decompiledRegionSelector0 = 5;
                              break L0;
                            } else {
                              break L6;
                            }
                          }
                        } else {
                          if ((this.field_Q ^ -1) < -1) {
                            L10: {
                              stackOut_23_0 = this;
                              stackOut_23_1 = -12521;
                              stackIn_25_0 = stackOut_23_0;
                              stackIn_25_1 = stackOut_23_1;
                              stackIn_24_0 = stackOut_23_0;
                              stackIn_24_1 = stackOut_23_1;
                              if (mc.field_e[82]) {
                                stackOut_25_0 = this;
                                stackOut_25_1 = stackIn_25_1;
                                stackOut_25_2 = this.h(-9674);
                                stackIn_26_0 = stackOut_25_0;
                                stackIn_26_1 = stackOut_25_1;
                                stackIn_26_2 = stackOut_25_2;
                                break L10;
                              } else {
                                stackOut_24_0 = this;
                                stackOut_24_1 = stackIn_24_1;
                                stackOut_24_2 = -1 + this.field_Q;
                                stackIn_26_0 = stackOut_24_0;
                                stackIn_26_1 = stackOut_24_1;
                                stackIn_26_2 = stackOut_24_2;
                                break L10;
                              }
                            }
                            this.b(stackIn_26_1, stackIn_26_2);
                            stackOut_26_0 = 1;
                            stackIn_27_0 = stackOut_26_0;
                            decompiledRegionSelector0 = 4;
                            break L0;
                          } else {
                            break L6;
                          }
                        }
                      } else {
                        this.l((byte) 101);
                        stackOut_18_0 = 1;
                        stackIn_19_0 = stackOut_18_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    } else {
                      if (this.field_R != this.field_Q) {
                        this.m((byte) -126);
                        stackOut_15_0 = 1;
                        stackIn_16_0 = stackOut_15_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        if (this.field_Q < this.field_B.length()) {
                          this.field_R = 1 + this.field_Q;
                          this.m((byte) -122);
                          stackOut_13_0 = 1;
                          stackIn_14_0 = stackOut_13_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                }
                var5_int = -114 % ((param1 - 47) / 43);
                stackOut_77_0 = 0;
                stackIn_78_0 = stackOut_77_0;
                decompiledRegionSelector0 = 15;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var5 = decompiledCaughtException;
            stackOut_79_0 = (RuntimeException) (var5);
            stackOut_79_1 = new StringBuilder().append("ul.Q(");
            stackIn_81_0 = stackOut_79_0;
            stackIn_81_1 = stackOut_79_1;
            stackIn_80_0 = stackOut_79_0;
            stackIn_80_1 = stackOut_79_1;
            if (param0 == null) {
              stackOut_81_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackOut_81_1 = (StringBuilder) ((Object) stackIn_81_1);
              stackOut_81_2 = "null";
              stackIn_82_0 = stackOut_81_0;
              stackIn_82_1 = stackOut_81_1;
              stackIn_82_2 = stackOut_81_2;
              break L11;
            } else {
              stackOut_80_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackOut_80_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackOut_80_2 = "{...}";
              stackIn_82_0 = stackOut_80_0;
              stackIn_82_1 = stackOut_80_1;
              stackIn_82_2 = stackOut_80_2;
              break L11;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_82_0), stackIn_82_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_27_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_35_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_38_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_41_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_46_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_54_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_56_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_58_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_61_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_65_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_76_0 != 0;
                                    } else {
                                      return stackIn_78_0 != 0;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final boolean a(int param0, int param1, byte param2, int param3, fj param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        long var8_long = 0L;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
              if (!(this.field_n instanceof pj)) {
                stackOut_18_0 = 0;
                stackIn_19_0 = stackOut_18_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  var8_int = ((pj) ((Object) this.field_n)).a((byte) 108, param3, jh.field_R, param0, ld.field_l, (fj) (this));
                  stackOut_3_0 = this;
                  stackOut_3_1 = -12521;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_5_1 = stackOut_3_1;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  if (0 != (var8_int ^ -1)) {
                    stackOut_5_0 = this;
                    stackOut_5_1 = stackIn_5_1;
                    stackOut_5_2 = var8_int;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    stackIn_6_2 = stackOut_5_2;
                    break L1;
                  } else {
                    stackOut_4_0 = this;
                    stackOut_4_1 = stackIn_4_1;
                    stackOut_4_2 = 0;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    stackIn_6_2 = stackOut_4_2;
                    break L1;
                  }
                }
                L2: {
                  this.b(stackIn_6_1, stackIn_6_2);
                  var8_long = ri.a(-3);
                  stackOut_6_0 = this;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (-this.field_T + var8_long >= 250L) {
                    stackOut_8_0 = this;
                    stackOut_8_1 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    break L2;
                  } else {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    break L2;
                  }
                }
                L3: {
                  ((ul) (this)).field_Z = stackIn_9_1 != 0;
                  if (this.field_Z) {
                    L4: {
                      this.field_R = this.h(param2 + -9765);
                      this.field_Q = this.f(0);
                      if ((this.field_Q ^ -1) >= -1) {
                        break L4;
                      } else {
                        if (32 == this.field_B.charAt(this.field_Q + -1)) {
                          this.field_Q = this.field_Q - 1;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    this.field_V = this.field_Q;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                this.field_T = var8_long;
                stackOut_16_0 = 1;
                stackIn_17_0 = stackOut_16_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var8);
            stackOut_20_1 = new StringBuilder().append("ul.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param4 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_17_0 != 0;
        } else {
          return stackIn_19_0 != 0;
        }
    }

    final static String k(int param0) {
        if (2 > we.field_c) {
            return fb.field_c;
        }
        if (null != o.field_f) {
            if (!(o.field_f.b(0))) {
                return hc.field_s;
            }
            return b.field_k;
        }
        if (!(wc.field_Wb.b(0))) {
            return fi.field_b;
        }
        if (!(wc.field_Wb.a("commonui", 0))) {
            return dl.field_a + " - " + wc.field_Wb.b(-8087, "commonui") + "%";
        }
        if (!(i.field_r.b(0))) {
            return pb.field_a;
        }
        if (!i.field_r.a("commonui", 0)) {
            return qf.field_d + " - " + i.field_r.b(param0 + -8087, "commonui") + "%";
        }
        if (!tf.field_k.b(param0)) {
            return nl.field_d;
        }
        if (!tf.field_k.a(25057)) {
            return bd.field_c + " - " + tf.field_k.c(-123) + "%";
        }
        return hm.field_W;
    }

    void k(byte param0) {
        if (param0 > -117) {
            this.field_X = false;
        }
        if (!(!(this.field_t instanceof uj))) {
            ((uj) ((Object) this.field_t)).a(32175, (ul) (this));
        }
    }

    void a(fj param0, int param1, int param2, int param3) {
        pj var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3);
              this.g(122);
              if (1 == this.field_o) {
                L2: {
                  if (this.field_n instanceof pj) {
                    var5 = (pj) ((Object) this.field_n);
                    var6 = var5.a((byte) 77, param3, jh.field_R, param2, ld.field_l, (fj) (this));
                    if (-1 != var6) {
                      L3: {
                        if (!this.field_Z) {
                          break L3;
                        } else {
                          if (this.field_V <= var6) {
                            break L3;
                          } else {
                            if (this.field_R >= var6) {
                              break L3;
                            } else {
                              var6 = this.field_V;
                              break L3;
                            }
                          }
                        }
                      }
                      this.field_Q = var6;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                this.field_Y = ri.a(-3);
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var5_ref);
            stackOut_13_1 = new StringBuilder().append("ul.V(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void h(byte param0) {
        boolean discarded$0 = false;
        if (param0 <= 23) {
            discarded$0 = this.a((fj) null, (byte) -24, 52, 'ﾬ');
        }
        String var2 = this.j(82);
        if (!(var2.length() <= 0)) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.j(82))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    final static void a(int param0, String param1, int param2, int param3, int param4) {
        String discarded$2 = null;
        RuntimeException runtimeException = null;
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
              nn.field_t[param2].d(param0, param4);
              pn.field_a.c(param1, 2 + param0, 14 + param4, 16777215, -1);
              if (param3 == -4245) {
                break L1;
              } else {
                discarded$2 = ul.k(69);
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
            stackOut_3_1 = new StringBuilder().append("ul.L(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == (this.field_S ^ -1)) {
                break L1;
              } else {
                var3_int = this.field_S + -this.field_B.length();
                if (-1 >= (var3_int ^ -1)) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  param1 = param1.substring(0, var3_int);
                  break L1;
                }
              }
            }
            L2: {
              if (this.field_Q == this.field_B.length()) {
                this.field_B = this.field_B + param1;
                break L2;
              } else {
                this.field_B = this.field_B.substring(0, this.field_Q) + param1 + this.field_B.substring(this.field_Q, this.field_B.length());
                break L2;
              }
            }
            this.field_Q = this.field_Q + param1.length();
            this.field_R = this.field_Q;
            this.k((byte) -119);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3);
            stackOut_10_1 = new StringBuilder().append("ul.A(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void b(boolean param0) {
        if (param0) {
            return;
        }
        field_P = null;
        field_U = null;
    }

    private final int h(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = Confined.field_J ? 1 : 0;
        if (0 != this.field_Q) {
          var2 = this.field_Q + -1;
          if (param0 == -9674) {
            L0: while (true) {
              L1: {
                if (var2 <= 0) {
                  break L1;
                } else {
                  if (-33 == (this.field_B.charAt(var2 - 1) ^ -1)) {
                    break L1;
                  } else {
                    var2--;
                    continue L0;
                  }
                }
              }
              return var2;
            }
          } else {
            return 26;
          }
        } else {
          return this.field_Q;
        }
    }

    private final void i(int param0) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                this.m((byte) -122);
                var3 = 127 / ((param0 - 5) / 59);
                this.a(0, var2);
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var2_ref = (Exception) (Object) decompiledCaughtException;
                break L1;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void i(byte param0) {
        if (param0 <= 117) {
            return;
        }
        if (!(!(this.field_t instanceof uj))) {
            ((uj) ((Object) this.field_t)).a((ul) (this), (byte) 83);
        }
    }

    final static he[] a(hb param0, int param1) {
        int discarded$12 = 0;
        int discarded$13 = 0;
        int discarded$14 = 0;
        int discarded$15 = 0;
        int discarded$16 = 0;
        int discarded$17 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        he[] var4 = null;
        int var5 = 0;
        he var6_ref_he = null;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_3_0 = null;
        he[] stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        he[] stackOut_10_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var7 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var2_int = param0.g(8, 0);
            if (var2_int <= 0) {
              var3 = param0.g(12, param1 ^ param1);
              var4 = new he[var3];
              var5 = 0;
              L1: while (true) {
                if (var5 >= var3) {
                  stackOut_10_0 = (he[]) (var4);
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    if (!sm.a(param1 + -31570, param0)) {
                      var6 = param0.g(ic.a(var5 + -1, (byte) 68), 0);
                      var4[var5] = var4[var6];
                      break L2;
                    } else {
                      var6_ref_he = new he();
                      discarded$12 = param0.g(24, 0);
                      discarded$13 = param0.g(24, param1 + -31662);
                      var6_ref_he.field_a = param0.g(24, param1 + -31662);
                      discarded$14 = param0.g(9, 0);
                      discarded$15 = param0.g(12, 0);
                      discarded$16 = param0.g(12, 0);
                      discarded$17 = param0.g(12, 0);
                      var4[var5] = var6_ref_he;
                      break L2;
                    }
                  }
                  var5++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var2);
            stackOut_12_1 = new StringBuilder().append("ul.HA(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (he[]) ((Object) stackIn_3_0);
        } else {
          return stackIn_11_0;
        }
    }

    private final String j(int param0) {
        if (param0 != 82) {
            return (String) null;
        }
        int var2 = this.field_R < this.field_Q ? this.field_R : this.field_Q;
        int var3 = this.field_Q <= this.field_R ? this.field_R : this.field_Q;
        return this.field_B.substring(var2, var3);
    }

    static {
    }
}
