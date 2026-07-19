/*
 * Decompiled by CFR-JS 0.4.0.
 */
class go extends kg {
    private int field_H;
    private int field_R;
    private int field_N;
    static os field_E;
    static String field_K;
    static boolean field_D;
    static String field_G;
    private long field_F;
    static qr field_I;
    static bi field_L;
    private boolean field_P;
    private int field_O;
    private long field_Q;
    private boolean field_M;

    private final void k(byte param0) {
        int var3 = 0;
        int var2 = 0;
        if (this.field_H != this.field_N) {
            var2 = this.field_N < this.field_H ? this.field_N : this.field_H;
            var3 = this.field_H > this.field_N ? this.field_H : this.field_N;
            this.field_N = var2;
            this.field_H = var2;
            this.field_s = this.field_s.substring(0, var2) + this.field_s.substring(var3, this.field_s.length());
            this.i(5018);
        }
        var2 = 75 % ((-61 - param0) / 54);
    }

    private final void h(byte param0) {
        if (param0 > -33) {
          field_E = (os) null;
          this.h(-1);
          this.k((byte) 120);
          return;
        } else {
          this.h(-1);
          this.k((byte) 120);
          return;
        }
    }

    private final void a(byte param0, String param1) {
        int var3_int = 0;
        if (this.field_O != -1) {
            var3_int = this.field_O + -this.field_s.length();
            if (!(0 > var3_int)) {
                return;
            }
            param1 = param1.substring(0, var3_int);
        }
        if (this.field_H != this.field_s.length()) {
            this.field_s = this.field_s.substring(0, this.field_H) + param1 + this.field_s.substring(this.field_H, this.field_s.length());
        } else {
            this.field_s = this.field_s + param1;
        }
        this.field_H = this.field_H + param1.length();
        if (param0 > -88) {
            return;
        }
        try {
            this.field_N = this.field_H;
            this.i(5018);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "go.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void e(boolean param0) {
        if (!param0) {
            return;
        }
        this.field_N = 0;
        this.field_H = 0;
        this.field_s = "";
        this.i(5018);
    }

    final boolean a(int param0, int param1, byte param2, int param3, int param4, int param5, vg param6) {
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
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
        int stackOut_20_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            L1: {
              if (!super.a(param0, param1, (byte) 100, param3, param4, param5, param6)) {
                break L1;
              } else {
                if (this.field_p instanceof pj) {
                  L2: {
                    var8_int = ((pj) ((Object) this.field_p)).a(param4, pd.field_k, param5, (vg) (this), true, bb.field_b);
                    stackOut_3_0 = this;
                    stackOut_3_1 = 119;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (0 == (var8_int ^ -1)) {
                      stackOut_5_0 = this;
                      stackOut_5_1 = stackIn_5_1;
                      stackOut_5_2 = 0;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      stackIn_6_2 = stackOut_5_2;
                      break L2;
                    } else {
                      stackOut_4_0 = this;
                      stackOut_4_1 = stackIn_4_1;
                      stackOut_4_2 = var8_int;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      stackIn_6_2 = stackOut_4_2;
                      break L2;
                    }
                  }
                  L3: {
                    this.a(stackIn_6_1, stackIn_6_2);
                    var8_long = pr.a(14274);
                    stackOut_6_0 = this;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (-251L >= (-this.field_F + var8_long ^ -1L)) {
                      stackOut_8_0 = this;
                      stackOut_8_1 = 0;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      break L3;
                    } else {
                      stackOut_7_0 = this;
                      stackOut_7_1 = 1;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_9_1 = stackOut_7_1;
                      break L3;
                    }
                  }
                  L4: {
                    ((go) (this)).field_P = stackIn_9_1 != 0;
                    if (this.field_P) {
                      L5: {
                        this.field_N = this.g((byte) 96);
                        this.field_H = this.a(-1);
                        if (-1 <= (this.field_H ^ -1)) {
                          break L5;
                        } else {
                          if (this.field_s.charAt(-1 + this.field_H) == 32) {
                            this.field_H = this.field_H - 1;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                      this.field_R = this.field_H;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  this.field_F = var8_long;
                  stackOut_16_0 = 1;
                  stackIn_17_0 = stackOut_16_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (param2 > 95) {
              stackOut_20_0 = 0;
              stackIn_21_0 = stackOut_20_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              field_L = (bi) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var8);
            stackOut_22_1 = new StringBuilder().append("go.TA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param6 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L6;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_17_0 != 0;
        } else {
          return stackIn_21_0 != 0;
        }
    }

    private final void j(byte param0) {
        qo var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        pj var9 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!this.field_M) {
          this.field_l = 0;
          this.field_h = 0;
          return;
        } else {
          if (this.field_p instanceof pj) {
            var9 = (pj) ((Object) this.field_p);
            var3 = var9.a((vg) (this), true);
            var4 = var3.c(126);
            if (param0 == -59) {
              var5 = var9.a(120, (vg) (this));
              var6 = var9.a(false) >> 203183073;
              if (var4 >= -var6 + var5) {
                var7 = this.field_h - -var3.a(true, this.field_H);
                if (-var6 + var5 < var7) {
                  this.field_h = this.field_h - var6 + (var5 - var7);
                  if (-1 <= (this.field_h ^ -1)) {
                    if (this.field_h >= -var5 + var6) {
                      return;
                    } else {
                      this.field_h = -var5 + var6;
                      return;
                    }
                  } else {
                    this.field_h = 0;
                    return;
                  }
                } else {
                  if (var6 > var7) {
                    this.field_h = -var7 - -var6 + this.field_h;
                    if (-1 <= (this.field_h ^ -1)) {
                      if (this.field_h >= -var5 + var6) {
                        return;
                      } else {
                        this.field_h = -var5 + var6;
                        return;
                      }
                    } else {
                      this.field_h = 0;
                      return;
                    }
                  } else {
                    if (-1 <= (this.field_h ^ -1)) {
                      if (this.field_h >= -var5 + var6) {
                        return;
                      } else {
                        this.field_h = -var5 + var6;
                        return;
                      }
                    } else {
                      this.field_h = 0;
                      return;
                    }
                  }
                }
              } else {
                this.field_l = 0;
                this.field_h = 0;
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        pj var5 = null;
        long var6 = 0L;
        if (param1 == -11857) {
          if (this.field_p != null) {
            if (param0 == 0) {
              this.field_p.a((vg) (this), param3, this.field_y, param2, (byte) 12);
              if (this.field_p instanceof pj) {
                L0: {
                  var5 = (pj) ((Object) this.field_p);
                  if (this.field_H != this.field_N) {
                    var5.a(this.field_N, param2, param3, this.field_H, 0, (vg) (this));
                    break L0;
                  } else {
                    break L0;
                  }
                }
                var6 = pr.a(param1 + 26131);
                if ((var6 - this.field_Q) % 1000L >= 500L) {
                  return;
                } else {
                  var5.a(this.field_H, param3, -127, param2, (vg) (this));
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private final void a(int param0, int param1) {
        if (param0 < 64) {
            return;
        }
        this.field_H = param1;
        if (di.field_p[81]) {
            return;
        }
        this.field_N = this.field_H;
    }

    final boolean a(int param0, char param1, int param2, vg param3) {
        int dupTemp$1 = 0;
        RuntimeException var5 = null;
        int stackIn_6_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_44_0 = 0;
        Object stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        Object stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        Object stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        int stackIn_51_0 = 0;
        Object stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        Object stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        Object stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        int stackIn_57_2 = 0;
        int stackIn_58_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_79_0 = 0;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_83_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_76_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_59_0 = 0;
        Object stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        Object stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        int stackOut_56_2 = 0;
        Object stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        int stackOut_55_2 = 0;
        int stackOut_57_0 = 0;
        Object stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        Object stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        Object stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        int stackOut_48_2 = 0;
        int stackOut_50_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        String stackOut_82_2 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 13) {
                break L1;
              } else {
                this.field_F = -52L;
                break L1;
              }
            }
            L2: {
              this.field_Q = pr.a(param2 ^ 14287);
              if (param1 == 60) {
                break L2;
              } else {
                if (62 == param1) {
                  break L2;
                } else {
                  L3: {
                    if (param1 < 32) {
                      break L3;
                    } else {
                      if (param1 <= 126) {
                        L4: {
                          if (this.field_H == this.field_N) {
                            break L4;
                          } else {
                            this.k((byte) -116);
                            break L4;
                          }
                        }
                        L5: {
                          L6: {
                            if (this.field_O == -1) {
                              break L6;
                            } else {
                              if (this.field_s.length() >= this.field_O) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          L7: {
                            if (this.field_H < this.field_s.length()) {
                              this.field_s = this.field_s.substring(0, this.field_H) + param1 + this.field_s.substring(this.field_H, this.field_s.length());
                              this.field_H = this.field_H + 1;
                              this.field_N = this.field_H;
                              break L7;
                            } else {
                              this.field_s = this.field_s + param1;
                              dupTemp$1 = this.field_s.length();
                              this.field_H = dupTemp$1;
                              this.field_N = dupTemp$1;
                              break L7;
                            }
                          }
                          this.i(5018);
                          break L5;
                        }
                        stackOut_76_0 = 1;
                        stackIn_77_0 = stackOut_76_0;
                        decompiledRegionSelector0 = 14;
                        break L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (85 != param0) {
                    L8: {
                      if (param0 == 101) {
                        if (this.field_N != this.field_H) {
                          this.k((byte) -117);
                          stackOut_65_0 = 1;
                          stackIn_66_0 = stackOut_65_0;
                          decompiledRegionSelector0 = 13;
                          break L0;
                        } else {
                          if (this.field_H >= this.field_s.length()) {
                            break L8;
                          } else {
                            this.field_N = 1 + this.field_H;
                            this.k((byte) -117);
                            stackOut_63_0 = 1;
                            stackIn_64_0 = stackOut_63_0;
                            decompiledRegionSelector0 = 12;
                            break L0;
                          }
                        }
                      } else {
                        if (13 == param0) {
                          this.e(true);
                          stackOut_59_0 = 1;
                          stackIn_60_0 = stackOut_59_0;
                          decompiledRegionSelector0 = 11;
                          break L0;
                        } else {
                          if (param0 == 96) {
                            if (-1 > (this.field_H ^ -1)) {
                              L9: {
                                stackOut_54_0 = this;
                                stackOut_54_1 = 127;
                                stackIn_56_0 = stackOut_54_0;
                                stackIn_56_1 = stackOut_54_1;
                                stackIn_55_0 = stackOut_54_0;
                                stackIn_55_1 = stackOut_54_1;
                                if (di.field_p[82]) {
                                  stackOut_56_0 = this;
                                  stackOut_56_1 = stackIn_56_1;
                                  stackOut_56_2 = this.g((byte) 88);
                                  stackIn_57_0 = stackOut_56_0;
                                  stackIn_57_1 = stackOut_56_1;
                                  stackIn_57_2 = stackOut_56_2;
                                  break L9;
                                } else {
                                  stackOut_55_0 = this;
                                  stackOut_55_1 = stackIn_55_1;
                                  stackOut_55_2 = -1 + this.field_H;
                                  stackIn_57_0 = stackOut_55_0;
                                  stackIn_57_1 = stackOut_55_1;
                                  stackIn_57_2 = stackOut_55_2;
                                  break L9;
                                }
                              }
                              this.a(stackIn_57_1, stackIn_57_2);
                              stackOut_57_0 = 1;
                              stackIn_58_0 = stackOut_57_0;
                              decompiledRegionSelector0 = 10;
                              break L0;
                            } else {
                              break L8;
                            }
                          } else {
                            if (-98 == (param0 ^ -1)) {
                              if (this.field_H < this.field_s.length()) {
                                L10: {
                                  stackOut_47_0 = this;
                                  stackOut_47_1 = 88;
                                  stackIn_49_0 = stackOut_47_0;
                                  stackIn_49_1 = stackOut_47_1;
                                  stackIn_48_0 = stackOut_47_0;
                                  stackIn_48_1 = stackOut_47_1;
                                  if (!di.field_p[82]) {
                                    stackOut_49_0 = this;
                                    stackOut_49_1 = stackIn_49_1;
                                    stackOut_49_2 = 1 + this.field_H;
                                    stackIn_50_0 = stackOut_49_0;
                                    stackIn_50_1 = stackOut_49_1;
                                    stackIn_50_2 = stackOut_49_2;
                                    break L10;
                                  } else {
                                    stackOut_48_0 = this;
                                    stackOut_48_1 = stackIn_48_1;
                                    stackOut_48_2 = this.a(-1);
                                    stackIn_50_0 = stackOut_48_0;
                                    stackIn_50_1 = stackOut_48_1;
                                    stackIn_50_2 = stackOut_48_2;
                                    break L10;
                                  }
                                }
                                this.a(stackIn_50_1, stackIn_50_2);
                                stackOut_50_0 = 1;
                                stackIn_51_0 = stackOut_50_0;
                                decompiledRegionSelector0 = 9;
                                break L0;
                              } else {
                                break L8;
                              }
                            } else {
                              if (102 != param0) {
                                if ((param0 ^ -1) != -104) {
                                  if ((param0 ^ -1) == -85) {
                                    this.i((byte) 2);
                                    stackOut_43_0 = 1;
                                    stackIn_44_0 = stackOut_43_0;
                                    decompiledRegionSelector0 = 8;
                                    break L0;
                                  } else {
                                    L11: {
                                      if (!di.field_p[82]) {
                                        break L11;
                                      } else {
                                        if ((param0 ^ -1) != -66) {
                                          break L11;
                                        } else {
                                          this.h((byte) -95);
                                          stackOut_31_0 = 1;
                                          stackIn_32_0 = stackOut_31_0;
                                          decompiledRegionSelector0 = 5;
                                          break L0;
                                        }
                                      }
                                    }
                                    L12: {
                                      if (!di.field_p[82]) {
                                        break L12;
                                      } else {
                                        if (-67 == (param0 ^ -1)) {
                                          this.h(param2 + -14);
                                          stackOut_41_0 = 1;
                                          stackIn_42_0 = stackOut_41_0;
                                          decompiledRegionSelector0 = 7;
                                          break L0;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                    if (!di.field_p[82]) {
                                      break L8;
                                    } else {
                                      if (67 == param0) {
                                        this.m((byte) -7);
                                        stackOut_39_0 = 1;
                                        stackIn_40_0 = stackOut_39_0;
                                        decompiledRegionSelector0 = 6;
                                        break L0;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                } else {
                                  this.a(88, this.field_s.length());
                                  stackOut_26_0 = 1;
                                  stackIn_27_0 = stackOut_26_0;
                                  decompiledRegionSelector0 = 4;
                                  break L0;
                                }
                              } else {
                                this.a(97, 0);
                                stackOut_23_0 = 1;
                                stackIn_24_0 = stackOut_23_0;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_78_0 = 0;
                    stackIn_79_0 = stackOut_78_0;
                    decompiledRegionSelector0 = 15;
                    break L0;
                  } else {
                    if (this.field_N != this.field_H) {
                      this.k((byte) 22);
                      stackOut_16_0 = 1;
                      stackIn_17_0 = stackOut_16_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      if (-1 > (this.field_H ^ -1)) {
                        this.field_N = -1 + this.field_H;
                        this.k((byte) -120);
                        stackOut_14_0 = 1;
                        stackIn_15_0 = stackOut_14_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        return false;
                      }
                    }
                  }
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var5 = decompiledCaughtException;
            stackOut_80_0 = (RuntimeException) (var5);
            stackOut_80_1 = new StringBuilder().append("go.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_82_0 = stackOut_80_0;
            stackIn_82_1 = stackOut_80_1;
            stackIn_81_0 = stackOut_80_0;
            stackIn_81_1 = stackOut_80_1;
            if (param3 == null) {
              stackOut_82_0 = (RuntimeException) ((Object) stackIn_82_0);
              stackOut_82_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackOut_82_2 = "null";
              stackIn_83_0 = stackOut_82_0;
              stackIn_83_1 = stackOut_82_1;
              stackIn_83_2 = stackOut_82_2;
              break L13;
            } else {
              stackOut_81_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackOut_81_1 = (StringBuilder) ((Object) stackIn_81_1);
              stackOut_81_2 = "{...}";
              stackIn_83_0 = stackOut_81_0;
              stackIn_83_1 = stackOut_81_1;
              stackIn_83_2 = stackOut_81_2;
              break L13;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_83_0), stackIn_83_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_17_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_24_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_27_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_32_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_40_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_42_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_44_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_51_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_58_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_60_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_64_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_66_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_77_0 != 0;
                                    } else {
                                      return stackIn_79_0 != 0;
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

    final static boolean j(int param0) {
        if (param0 != 0) {
            return false;
        }
        return js.a(-83, kq.f((byte) 127));
    }

    private final int a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = this.field_s.length();
        if (var2 == this.field_H) {
          return this.field_H;
        } else {
          var3 = 1 + this.field_H;
          L0: while (true) {
            if (var2 > var3) {
              if (this.field_s.charAt(-1 + var3) != 32) {
                var3++;
                continue L0;
              } else {
                if (param0 != -1) {
                  this.h((byte) 17);
                  return var3;
                } else {
                  return var3;
                }
              }
            } else {
              if (param0 != -1) {
                this.h((byte) 17);
                return var3;
              } else {
                return var3;
              }
            }
          }
        }
    }

    go(String param0, ko param1, int param2) {
        super(param0, param1);
        this.field_F = 0L;
        this.field_R = -1;
        this.field_P = false;
        try {
            this.field_p = qq.field_I.field_f;
            this.field_O = param2;
            this.a(67, param0, true);
            this.field_M = true;
            this.field_Q = pr.a(14274);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "go.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    void a(int param0, int param1, vg param2, byte param3) {
        RuntimeException runtimeException = null;
        pj var5 = null;
        int var6 = 0;
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
              super.a(param0, param1, param2, param3);
              this.j((byte) -59);
              if (1 != this.field_o) {
                break L1;
              } else {
                L2: {
                  if (this.field_p instanceof pj) {
                    var5 = (pj) ((Object) this.field_p);
                    var6 = var5.a(param0, pd.field_k, param1, (vg) (this), true, bb.field_b);
                    if ((var6 ^ -1) == 0) {
                      break L2;
                    } else {
                      L3: {
                        if (!this.field_P) {
                          break L3;
                        } else {
                          if (this.field_R <= var6) {
                            break L3;
                          } else {
                            if (var6 <= this.field_N) {
                              break L3;
                            } else {
                              var6 = this.field_R;
                              break L3;
                            }
                          }
                        }
                      }
                      this.field_H = var6;
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                this.field_Q = pr.a(14274);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (runtimeException);
            stackOut_11_1 = new StringBuilder().append("go.PA(").append(param0).append(',').append(param1).append(',');
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
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
        }
    }

    void i(int param0) {
        L0: {
          if (this.field_u instanceof od) {
            ((od) ((Object) this.field_u)).a((go) (this), 95);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 == 5018) {
          return;
        } else {
          this.field_N = -127;
          return;
        }
    }

    final void a(int param0, String param1, boolean param2) {
        int dupTemp$2 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              var4_int = 98 % ((4 - param0) / 40);
              if (param1 == null) {
                param1 = "";
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              this.field_s = param1;
              var5 = param1.length();
              if (this.field_O == -1) {
                break L2;
              } else {
                if (this.field_O >= var5) {
                  break L2;
                } else {
                  this.field_s = this.field_s.substring(0, this.field_O);
                  break L2;
                }
              }
            }
            dupTemp$2 = this.field_s.length();
            this.field_N = dupTemp$2;
            this.field_H = dupTemp$2;
            if (param2) {
              break L0;
            } else {
              this.i(5018);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var4);
            stackOut_9_1 = new StringBuilder().append("go.K(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ')');
        }
    }

    private final String l(byte param0) {
        int var2 = 0;
        int var3 = 0;
        String var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          if (this.field_H <= this.field_N) {
            stackOut_2_0 = this.field_H;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = this.field_N;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var2 = stackIn_3_0;
          if (this.field_N >= this.field_H) {
            stackOut_5_0 = this.field_N;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = this.field_H;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        var3 = stackIn_6_0;
        if (param0 < 78) {
          var4 = (String) null;
          this.a((byte) 98, (String) null);
          return this.field_s.substring(var2, var3);
        } else {
          return this.field_s.substring(var2, var3);
        }
    }

    final static boolean a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                field_E = (os) null;
                break L1;
              }
            }
            stackOut_2_0 = wk.a(10, param1, param0 ^ 126, true);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("go.N(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    private final void m(byte param0) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                this.k((byte) -117);
                this.a((byte) -109, var2);
                if (param0 == -7) {
                  break L0;
                } else {
                  this.field_R = -30;
                  return;
                }
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

    final static hh a(int param0, String param1, bc param2, bc param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        hh stackIn_2_0 = null;
        hh stackIn_4_0 = null;
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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        hh stackOut_3_0 = null;
        hh stackOut_1_0 = null;
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
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            var5_int = param2.a(126, param4);
            var6 = param2.a(var5_int, (byte) 106, param1);
            if (param0 >= 94) {
              stackOut_3_0 = cf.a(param3, 1, param2, var5_int, var6);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (hh) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var5);
            stackOut_5_1 = new StringBuilder().append("go.P(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
            if (param2 == null) {
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
          L3: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          L4: {
            stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param4 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final void h(int param0) {
        try {
            String var2 = null;
            var2 = this.l((byte) 102);
            if (param0 <= (var2.length() ^ -1)) {
              return;
            } else {
              java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.l((byte) 120))), (java.awt.datatransfer.ClipboardOwner) null);
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void k(int param0) {
        field_G = null;
        if (param0 <= 73) {
            return;
        }
        field_I = null;
        field_E = null;
        field_K = null;
        field_L = null;
    }

    private final int g(byte param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        if (this.field_H != 0) {
          var2 = -1 + this.field_H;
          if (param0 >= 87) {
            L0: while (true) {
              if (0 < var2) {
                if (this.field_s.charAt(var2 - 1) != 32) {
                  var2--;
                  continue L0;
                } else {
                  return var2;
                }
              } else {
                return var2;
              }
            }
          } else {
            return -4;
          }
        } else {
          return this.field_H;
        }
    }

    private final void i(byte param0) {
        String discarded$4 = null;
        String discarded$5 = null;
        if (!(this.field_u instanceof od)) {
          if (param0 == 2) {
            return;
          } else {
            discarded$4 = this.l((byte) -113);
            return;
          }
        } else {
          ((od) ((Object) this.field_u)).a(4340, (go) (this));
          if (param0 == 2) {
            return;
          } else {
            discarded$5 = this.l((byte) -113);
            return;
          }
        }
    }

    static {
        field_D = false;
        field_K = "If you are not, please change your password to something more obscure!";
        field_G = "Please remove <%0> from your ignore list first.";
    }
}
