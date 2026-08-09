/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ul extends hc {
    private boolean field_J;
    static ed[] field_E;
    private int field_N;
    private long field_G;
    private boolean field_M;
    static int[] field_I;
    static ce field_O;
    private long field_D;
    private int field_H;
    private int field_P;
    private int field_L;

    final boolean a(hm param0, char param1, int param2, int param3) {
        int dupTemp$0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_43_0 = 0;
        Object stackIn_48_0 = null;
        Object stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        int stackIn_50_0 = 0;
        Object stackIn_54_0 = null;
        Object stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_77_0 = 0;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              this.field_G = td.b(128);
              if (param3 >= 0) {
                break L1;
              } else {
                this.g((byte) 21);
                break L1;
              }
            }
            L2: {
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
                      if (126 >= param1) {
                        L4: {
                          if (this.field_L == this.field_P) {
                            break L4;
                          } else {
                            this.k(0);
                            break L4;
                          }
                        }
                        L5: {
                          L6: {
                            if (0 == (this.field_H ^ -1)) {
                              break L6;
                            } else {
                              if (this.field_l.length() >= this.field_H) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          L7: {
                            if (this.field_L >= this.field_l.length()) {
                              this.field_l = this.field_l + param1;
                              dupTemp$0 = this.field_l.length();
                              this.field_L = dupTemp$0;
                              this.field_P = dupTemp$0;
                              break L7;
                            } else {
                              this.field_l = this.field_l.substring(0, this.field_L) + param1 + this.field_l.substring(this.field_L, this.field_l.length());
                              this.field_L = this.field_L + 1;
                              this.field_P = this.field_L;
                              break L7;
                            }
                          }
                          this.a(false);
                          break L5;
                        }
                        stackIn_75_0 = 1;
                        decompiledRegionSelector0 = 14;
                        break L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L8: {
                    if (-86 == (param2 ^ -1)) {
                      if (this.field_P != this.field_L) {
                        this.k(0);
                        stackIn_64_0 = 1;
                        decompiledRegionSelector0 = 13;
                        break L0;
                      } else {
                        if (-1 <= (this.field_L ^ -1)) {
                          break L8;
                        } else {
                          this.field_P = this.field_L + -1;
                          this.k(0);
                          stackIn_62_0 = 1;
                          decompiledRegionSelector0 = 12;
                          break L0;
                        }
                      }
                    } else {
                      if (-102 != (param2 ^ -1)) {
                        if (param2 == 13) {
                          this.h((byte) -29);
                          stackIn_58_0 = 1;
                          decompiledRegionSelector0 = 11;
                          break L0;
                        } else {
                          if (-97 == (param2 ^ -1)) {
                            if (-1 <= (this.field_L ^ -1)) {
                              break L8;
                            } else {
                              L9: {
                                stackIn_54_0 = this;

                                if (!ik.field_h[82]) {
                                  stackIn_55_0 = this;
                                  stackIn_55_1 = -1 + this.field_L;
                                  break L9;
                                } else {
                                  stackIn_55_0 = this;
                                  stackIn_55_1 = this.p(-94);
                                  break L9;
                                }
                              }
                              this.b(stackIn_55_1, 22);
                              stackIn_56_0 = 1;
                              decompiledRegionSelector0 = 10;
                              break L0;
                            }
                          } else {
                            if (97 == param2) {
                              if (this.field_L < this.field_l.length()) {
                                L10: {
                                  stackIn_48_0 = this;

                                  if (ik.field_h[82]) {
                                    stackIn_49_0 = this;
                                    stackIn_49_1 = this.o(1);
                                    break L10;
                                  } else {
                                    stackIn_49_0 = this;
                                    stackIn_49_1 = this.field_L + 1;
                                    break L10;
                                  }
                                }
                                this.b(stackIn_49_1, 121);
                                stackIn_50_0 = 1;
                                decompiledRegionSelector0 = 9;
                                break L0;
                              } else {
                                return false;
                              }
                            } else {
                              if (102 != param2) {
                                if (param2 == 103) {
                                  this.b(this.field_l.length(), 115);
                                  stackIn_43_0 = 1;
                                  decompiledRegionSelector0 = 8;
                                  break L0;
                                } else {
                                  if ((param2 ^ -1) != -85) {
                                    L11: {
                                      if (!ik.field_h[82]) {
                                        break L11;
                                      } else {
                                        if (-66 == (param2 ^ -1)) {
                                          this.g((byte) 8);
                                          stackIn_41_0 = 1;
                                          decompiledRegionSelector0 = 7;
                                          break L0;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                    L12: {
                                      if (!ik.field_h[82]) {
                                        break L12;
                                      } else {
                                        if (66 == param2) {
                                          this.e((byte) 104);
                                          stackIn_39_0 = 1;
                                          decompiledRegionSelector0 = 6;
                                          break L0;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                    if (!ik.field_h[82]) {
                                      break L8;
                                    } else {
                                      if (-68 != (param2 ^ -1)) {
                                        break L8;
                                      } else {
                                        this.q(87);
                                        stackIn_37_0 = 1;
                                        decompiledRegionSelector0 = 5;
                                        break L0;
                                      }
                                    }
                                  } else {
                                    this.n(0);
                                    stackIn_27_0 = 1;
                                    decompiledRegionSelector0 = 4;
                                    break L0;
                                  }
                                }
                              } else {
                                this.b(0, 33);
                                stackIn_23_0 = 1;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              }
                            }
                          }
                        }
                      } else {
                        if (this.field_P != this.field_L) {
                          this.k(0);
                          stackIn_17_0 = 1;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          if (this.field_L >= this.field_l.length()) {
                            break L8;
                          } else {
                            this.field_P = this.field_L + 1;
                            this.k(0);
                            stackIn_15_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                    }
                  }
                  stackIn_77_0 = 0;
                  decompiledRegionSelector0 = 15;
                  break L0;
                }
              }
            }
            stackIn_6_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var5 = decompiledCaughtException;
            stackIn_80_0 = (RuntimeException) (var5);

            stackIn_80_1 = new StringBuilder().append("ul.G(");

            if (param0 == null) {
              stackIn_81_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackIn_81_2 = "null";
              break L13;
            } else {
              stackIn_81_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackIn_81_2 = "{...}";
              break L13;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_81_0), stackIn_81_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
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
                return stackIn_23_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_27_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_37_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_39_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_41_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_43_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_50_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_56_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_58_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_62_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_64_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_75_0 != 0;
                                    } else {
                                      return stackIn_77_0 != 0;
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

    private final String l(int param0) {
        int var2;
        int var3;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        L0: {
          if (this.field_P >= this.field_L) {
            stackIn_3_0 = this.field_L;
            break L0;
          } else {
            stackIn_3_0 = this.field_P;
            break L0;
          }
        }
        var2 = stackIn_3_0;
        if (param0 != 100) {
          return (String) null;
        } else {
          L1: {
            if (this.field_L <= this.field_P) {
              stackIn_7_0 = this.field_P;
              break L1;
            } else {
              stackIn_7_0 = this.field_L;
              break L1;
            }
          }
          var3 = stackIn_7_0;
          return this.field_l.substring(var2, var3);
        }
    }

    void a(boolean param0) {
        if (!(this.field_q instanceof rj)) {
          if (param0) {
            field_O = (ce) null;
            return;
          } else {
            return;
          }
        } else {
          ((rj) ((Object) this.field_q)).a((ul) (this), 0);
          if (!param0) {
            return;
          } else {
            field_O = (ce) null;
            return;
          }
        }
    }

    private final int o(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = EscapeVector.field_A;
        var2 = this.field_l.length();
        if (var2 != this.field_L) {
          var3 = param0 + this.field_L;
          L0: while (true) {
            if (var2 > var3) {
              if (this.field_l.charAt(var3 + -1) != 32) {
                var3++;
                continue L0;
              } else {
                return var3;
              }
            } else {
              return var3;
            }
          }
        } else {
          return this.field_L;
        }
    }

    final static int a(int param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        param1 = param1 & 8191;
        if (param0 <= -124) {
          if ((param1 ^ -1) > -4097) {
            L0: {
              if (-2049 >= (param1 ^ -1)) {
                stackIn_19_0 = -un.field_t[-2048 + param1];
                break L0;
              } else {
                stackIn_19_0 = un.field_t[-param1 + 2048];
                break L0;
              }
            }
            return stackIn_19_0;
          } else {
            L1: {
              if (-6145 < (param1 ^ -1)) {
                stackIn_15_0 = -un.field_t[6144 - param1];
                break L1;
              } else {
                stackIn_15_0 = un.field_t[-6144 + param1];
                break L1;
              }
            }
            return stackIn_15_0;
          }
        } else {
          ul.a(-64, 14);
          if ((param1 ^ -1) > -4097) {
            L2: {
              if (-2049 >= (param1 ^ -1)) {
                stackIn_9_0 = -un.field_t[-2048 + param1];
                break L2;
              } else {
                stackIn_9_0 = un.field_t[-param1 + 2048];
                break L2;
              }
            }
            return stackIn_9_0;
          } else {
            L3: {
              if (-6145 < (param1 ^ -1)) {
                stackIn_5_0 = -un.field_t[6144 - param1];
                break L3;
              } else {
                stackIn_5_0 = un.field_t[-6144 + param1];
                break L3;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    private final void n(int param0) {
        if (!(this.field_q instanceof rj)) {
          if (param0 != 0) {
            ul.a(-65, 47, 47);
            return;
          } else {
            return;
          }
        } else {
          ((rj) ((Object) this.field_q)).a(true, (ul) (this));
          if (param0 == 0) {
            return;
          } else {
            ul.a(-65, 47, 47);
            return;
          }
        }
    }

    final void a(String param0, boolean param1, int param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == -33) {
                break L1;
              } else {
                this.h((byte) 111);
                break L1;
              }
            }
            L2: {
              if (param0 == null) {
                param0 = "";
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              this.field_l = param0;
              var4_int = param0.length();
              if (0 == (this.field_H ^ -1)) {
                break L3;
              } else {
                if (var4_int <= this.field_H) {
                  break L3;
                } else {
                  this.field_l = this.field_l.substring(0, this.field_H);
                  break L3;
                }
              }
            }
            dupTemp$1 = this.field_l.length();
            this.field_P = dupTemp$1;
            this.field_L = dupTemp$1;
            if (!param1) {
              this.a(false);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("ul.DA(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if ((this.field_H ^ -1) != 0) {
                var3_int = this.field_H - this.field_l.length();
                if (0 > var3_int) {
                  param1 = param1.substring(0, var3_int);
                  break L1;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == -120) {
                break L2;
              } else {
                this.field_J = false;
                break L2;
              }
            }
            L3: {
              if (this.field_L != this.field_l.length()) {
                this.field_l = this.field_l.substring(0, this.field_L) + param1 + this.field_l.substring(this.field_L, this.field_l.length());
                break L3;
              } else {
                this.field_l = this.field_l + param1;
                break L3;
              }
            }
            this.field_L = this.field_L + param1.length();
            this.field_P = this.field_L;
            this.a(false);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("ul.W(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(int param0, int param1, byte param2, int param3, int param4, hm param5, int param6) {
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
              stackIn_18_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              if (this.field_s instanceof ao) {
                L1: {
                  var8_int = ((ao) ((Object) this.field_s)).a(param4, param0, bj.field_y, dh.field_d, 118, (hm) (this));
                  stackIn_5_0 = this;

                  if ((var8_int ^ -1) == 0) {
                    stackIn_6_0 = this;
                    stackIn_6_1 = 0;
                    break L1;
                  } else {
                    stackIn_6_0 = this;
                    stackIn_6_1 = var8_int;
                    break L1;
                  }
                }
                L2: {
                  this.b(stackIn_6_1, 61);
                  var8_long = td.b(param2 + 125);
                  stackIn_8_0 = this;

                  if (-251L >= (-this.field_D + var8_long ^ -1L)) {
                    stackIn_9_0 = this;
                    stackIn_9_1 = 0;
                    break L2;
                  } else {
                    stackIn_9_0 = this;
                    stackIn_9_1 = 1;
                    break L2;
                  }
                }
                L3: {
                  ((ul) (this)).field_M = stackIn_9_1 != 0;
                  if (!this.field_M) {
                    break L3;
                  } else {
                    L4: {
                      this.field_P = this.p(-121);
                      this.field_L = this.o(1);
                      if (-1 <= (this.field_L ^ -1)) {
                        break L4;
                      } else {
                        if (-33 == (this.field_l.charAt(-1 + this.field_L) ^ -1)) {
                          this.field_L = this.field_L - 1;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    this.field_N = this.field_L;
                    break L3;
                  }
                }
                this.field_D = var8_long;
                stackIn_16_0 = 1;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var8);

            stackIn_21_1 = new StringBuilder().append("ul.V(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_16_0 != 0;
        } else {
          return stackIn_18_0 != 0;
        }
    }

    final static ed a(int param0, int param1, mf param2, byte param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3 > 3) {
              break L0;
            } else {
              ul.f((byte) -115);
              break L0;
            }
          }
          if (uc.a(param2, 105, param0, param1)) {
            return al.a((byte) 108);
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("ul.T(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
        }
    }

    private final int p(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = EscapeVector.field_A;
        if (-1 == (this.field_L ^ -1)) {
          return this.field_L;
        } else {
          var3 = -8 % ((param0 - 6) / 38);
          var2 = this.field_L - 1;
          L0: while (true) {
            if (-1 > (var2 ^ -1)) {
              if (this.field_l.charAt(var2 + -1) != 32) {
                var2--;
                continue L0;
              } else {
                return var2;
              }
            } else {
              return var2;
            }
          }
        }
    }

    public static void f(byte param0) {
        field_O = null;
        if (param0 > -52) {
            field_O = (ce) null;
            field_E = null;
            field_I = null;
            return;
        }
        field_E = null;
        field_I = null;
    }

    private final void b(int param0, int param1) {
        if (param1 >= 17) {
          this.field_L = param0;
          if (!ik.field_h[81]) {
            this.field_P = this.field_L;
            return;
          } else {
            return;
          }
        } else {
          ul.f((byte) -102);
          this.field_L = param0;
          if (ik.field_h[81]) {
            return;
          } else {
            this.field_P = this.field_L;
            return;
          }
        }
    }

    private final void m(int param0) {
        pg var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        ao var9;
        var8 = EscapeVector.field_A;
        if (this.field_J) {
          if (this.field_s instanceof ao) {
            var9 = (ao) ((Object) this.field_s);
            var3 = var9.b((hm) (this), 90);
            var4 = var3.a((byte) -112);
            var5 = var9.a((hm) (this), -25033);
            var6 = var9.a(115) >> -1851814207;
            if (var5 + -var6 > var4) {
              this.field_n = 0;
              this.field_v = 0;
              return;
            } else {
              if (param0 == -22686) {
                var7 = this.field_n - -var3.a((byte) -79, this.field_L);
                if (var5 + -var6 >= var7) {
                  if (var7 < var6) {
                    this.field_n = -var7 - -var6 + this.field_n;
                    if ((this.field_n ^ -1) >= -1) {
                      if (-var5 - -var6 <= this.field_n) {
                        return;
                      } else {
                        this.field_n = -var5 - -var6;
                        return;
                      }
                    } else {
                      this.field_n = 0;
                      return;
                    }
                  } else {
                    if ((this.field_n ^ -1) >= -1) {
                      if (-var5 - -var6 <= this.field_n) {
                        return;
                      } else {
                        this.field_n = -var5 - -var6;
                        return;
                      }
                    } else {
                      this.field_n = 0;
                      return;
                    }
                  }
                } else {
                  this.field_n = this.field_n - (var7 + (-var5 + var6));
                  if ((this.field_n ^ -1) >= -1) {
                    if (-var5 - -var6 <= this.field_n) {
                      return;
                    } else {
                      this.field_n = -var5 - -var6;
                      return;
                    }
                  } else {
                    this.field_n = 0;
                    return;
                  }
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        } else {
          this.field_n = 0;
          this.field_v = 0;
          return;
        }
    }

    private final void q(int param0) {
        try {
            Exception exception = null;
            String var2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                this.k(0);
                this.a((byte) -120, var2);
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                exception = (Exception) (Object) decompiledCaughtException;
                break L1;
              }
            }
            if (param0 < 34) {
              ul.f((byte) 49);
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void g(byte param0) {
        if (param0 != 8) {
          this.a(-32, (byte) 101, 85, 10);
          this.e((byte) 90);
          this.k(0);
          return;
        } else {
          this.e((byte) 90);
          this.k(0);
          return;
        }
    }

    private final void k(int param0) {
        int var2;
        int var3;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        L0: {
          if (this.field_L != this.field_P) {
            L1: {
              if (this.field_L <= this.field_P) {
                stackIn_5_0 = this.field_L;
                break L1;
              } else {
                stackIn_5_0 = this.field_P;
                break L1;
              }
            }
            L2: {
              var2 = stackIn_5_0;
              if (this.field_P >= this.field_L) {
                stackIn_8_0 = this.field_P;
                break L2;
              } else {
                stackIn_8_0 = this.field_L;
                break L2;
              }
            }
            var3 = stackIn_8_0;
            this.field_L = var2;
            this.field_P = var2;
            this.field_l = this.field_l.substring(0, var2) + this.field_l.substring(var3, this.field_l.length());
            this.a(false);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 0) {
          this.field_P = 46;
          return;
        } else {
          return;
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (0 != param1) {
          if (param1 != 1) {
            if ((param1 ^ -1) == -3) {
              param0 = dc.a(-110, 100, param0) * 100;
              return param0;
            } else {
              if (param2 >= 24) {
                if (3 != param1) {
                  return 0;
                } else {
                  param0 = dc.a(-74, 100, param0) * 100;
                  return param0;
                }
              } else {
                return 31;
              }
            }
          } else {
            return param0 / 2;
          }
        } else {
          return param0;
        }
    }

    ul(String param0, wn param1, int param2) {
        super(param0, param1);
        this.field_N = -1;
        this.field_M = false;
        this.field_D = 0L;
        try {
            this.field_s = mb.field_g.field_p;
            this.field_H = param2;
            this.a(param0, true, -33);
            this.field_J = true;
            this.field_G = td.b(128);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ul.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    void a(int param0, int param1, int param2, hm param3) {
        RuntimeException runtimeException = null;
        int var6 = 0;
        ao var7 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.a(param0 + 0, param1, param2, param3);
              if (param0 == -14472) {
                break L1;
              } else {
                field_I = (int[]) null;
                break L1;
              }
            }
            L2: {
              this.m(-22686);
              if (-2 != (this.field_t ^ -1)) {
                break L2;
              } else {
                L3: {
                  if (!(this.field_s instanceof ao)) {
                    break L3;
                  } else {
                    var7 = (ao) ((Object) this.field_s);
                    var6 = var7.a(param2, param1, bj.field_y, dh.field_d, param0 + 14560, (hm) (this));
                    if (var6 == -1) {
                      break L3;
                    } else {
                      L4: {
                        if (!this.field_M) {
                          break L4;
                        } else {
                          if (this.field_N <= var6) {
                            break L4;
                          } else {
                            if (var6 > this.field_P) {
                              var6 = this.field_N;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      this.field_L = var6;
                      break L3;
                    }
                  }
                }
                this.field_G = td.b(128);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (runtimeException);

            stackIn_15_1 = new StringBuilder().append("ul.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    final void h(byte param0) {
        hm var3;
        this.field_l = "";
        this.field_P = 0;
        this.field_L = 0;
        if (param0 != -29) {
          var3 = (hm) null;
          this.a(-33, 14, (byte) 69, 46, -80, (hm) null, 28);
          this.a(false);
          return;
        } else {
          this.a(false);
          return;
        }
    }

    private final void e(byte param0) {
        try {
            String var2;
            if (param0 <= 86) {
              L0: {
                this.field_L = -80;
                var2 = this.l(100);
                if ((var2.length() ^ -1) < -1) {
                  java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.l(100))), (java.awt.datatransfer.ClipboardOwner) null);
                  break L0;
                } else {
                  break L0;
                }
              }
              return;
            } else {
              L1: {
                var2 = this.l(100);
                if ((var2.length() ^ -1) < -1) {
                  java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.l(100))), (java.awt.datatransfer.ClipboardOwner) null);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        long var6;
        ao var8;
        ao var9;
        ao var10;
        if (param1 > 85) {
          if (this.field_s != null) {
            if (param2 == 0) {
              this.field_s.a(param3, param0, -21, (hm) (this), this.field_y);
              if (this.field_s instanceof ao) {
                L0: {
                  var10 = (ao) ((Object) this.field_s);
                  if (this.field_P != this.field_L) {
                    var10.a(param3, this.field_L, (hm) (this), this.field_P, -613528456, param0);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                var6 = td.b(128);
                if (500L <= (-this.field_G + var6) % 1000L) {
                  return;
                } else {
                  var10.a((hm) (this), this.field_L, param3, param0, true);
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
          this.field_H = -76;
          if (this.field_s != null) {
            if (param2 == 0) {
              this.field_s.a(param3, param0, -21, (hm) (this), this.field_y);
              if (this.field_s instanceof ao) {
                L1: {
                  var9 = (ao) ((Object) this.field_s);
                  var8 = var9;
                  if (this.field_P != this.field_L) {
                    var9.a(param3, this.field_L, (hm) (this), this.field_P, -613528456, param0);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var6 = td.b(128);
                if (500L <= (-this.field_G + var6) % 1000L) {
                  return;
                } else {
                  var9.a((hm) (this), this.field_L, param3, param0, true);
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
    }

    static {
        field_I = new int[128];
    }
}
