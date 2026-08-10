/*
 * Decompiled by CFR-JS 0.4.0.
 */
class rl extends kf {
    private int field_L;
    private long field_M;
    private boolean field_N;
    private long field_J;
    static int field_E;
    private int field_F;
    private int field_G;
    private boolean field_K;
    private int field_I;
    static rb field_H;
    static volatile boolean field_O;

    final static int b(int param0, int param1, int param2) {
        int var3 = param1 >>> -1397638113;
        if (param2 != 25668) {
            field_H = (rb) null;
        }
        return (var3 + param1) / param0 - var3;
    }

    private final void l(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (this.field_F != this.field_I) {
            var2 = this.field_I < this.field_F ? this.field_I : this.field_F;
            var3 = this.field_F > this.field_I ? this.field_F : this.field_I;
            this.field_I = var2;
            this.field_F = var2;
            this.field_u = this.field_u.substring(0, var2) + this.field_u.substring(var3, this.field_u.length());
            this.f(false);
        }
        if (param0 != -1) {
            this.m(-24);
        }
    }

    private final void a(String param0, byte param1) {
        int var3_int = 0;
        w var4 = null;
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
            L1: {
              if (this.field_G == -1) {
                break L1;
              } else {
                var3_int = this.field_G + -this.field_u.length();
                if ((var3_int ^ -1) > -1) {
                  param0 = param0.substring(0, var3_int);
                  break L1;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L2: {
              if (this.field_F == this.field_u.length()) {
                this.field_u = this.field_u + param0;
                break L2;
              } else {
                this.field_u = this.field_u.substring(0, this.field_F) + param0 + this.field_u.substring(this.field_F, this.field_u.length());
                break L2;
              }
            }
            L3: {
              this.field_F = this.field_F + param0.length();
              if (param1 >= 85) {
                break L3;
              } else {
                var4 = (w) null;
                this.a(10, -121, (w) null, 67, -118, 113, -122);
                break L3;
              }
            }
            this.field_I = this.field_F;
            this.f(false);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("rl.D(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(char param0, int param1, w param2, byte param3) {
        int dupTemp$0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_42_0 = 0;
        Object stackIn_46_0 = null;
        Object stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_73_0 = 0;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        try {
          L0: {
            this.field_J = rf.c(0);
            var5_int = 32 / ((param3 - -13) / 55);
            if (param0 == 60) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 != 62) {
                L1: {
                  if (param0 < 32) {
                    break L1;
                  } else {
                    if (param0 <= 126) {
                      L2: {
                        if (this.field_F == this.field_I) {
                          break L2;
                        } else {
                          this.l(-1);
                          break L2;
                        }
                      }
                      L3: {
                        L4: {
                          if (0 == (this.field_G ^ -1)) {
                            break L4;
                          } else {
                            if (this.field_u.length() >= this.field_G) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L5: {
                          if (this.field_F < this.field_u.length()) {
                            this.field_u = this.field_u.substring(0, this.field_F) + param0 + this.field_u.substring(this.field_F, this.field_u.length());
                            this.field_F = this.field_F + 1;
                            this.field_I = this.field_F;
                            break L5;
                          } else {
                            this.field_u = this.field_u + param0;
                            dupTemp$0 = this.field_u.length();
                            this.field_F = dupTemp$0;
                            this.field_I = dupTemp$0;
                            break L5;
                          }
                        }
                        this.f(false);
                        break L3;
                      }
                      stackIn_71_0 = 1;
                      decompiledRegionSelector0 = 14;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                L6: {
                  if (-86 == (param1 ^ -1)) {
                    if (this.field_I == this.field_F) {
                      if (this.field_F <= 0) {
                        break L6;
                      } else {
                        this.field_I = this.field_F + -1;
                        this.l(-1);
                        stackIn_60_0 = 1;
                        decompiledRegionSelector0 = 13;
                        break L0;
                      }
                    } else {
                      this.l(-1);
                      stackIn_57_0 = 1;
                      decompiledRegionSelector0 = 12;
                      break L0;
                    }
                  } else {
                    if (101 == param1) {
                      if (this.field_F == this.field_I) {
                        if (this.field_F >= this.field_u.length()) {
                          break L6;
                        } else {
                          this.field_I = this.field_F - -1;
                          this.l(-1);
                          stackIn_54_0 = 1;
                          decompiledRegionSelector0 = 11;
                          break L0;
                        }
                      } else {
                        this.l(-1);
                        stackIn_51_0 = 1;
                        decompiledRegionSelector0 = 10;
                        break L0;
                      }
                    } else {
                      if ((param1 ^ -1) != -14) {
                        if ((param1 ^ -1) == -97) {
                          if (this.field_F <= 0) {
                            break L6;
                          } else {
                            L7: {
                              stackIn_46_0 = this;

                              if (!wa.field_j[82]) {
                                stackIn_47_0 = this;
                                stackIn_47_1 = -1 + this.field_F;
                                break L7;
                              } else {
                                stackIn_47_0 = this;
                                stackIn_47_1 = this.n(-1);
                                break L7;
                              }
                            }
                            this.a(stackIn_47_1, 10);
                            stackIn_48_0 = 1;
                            decompiledRegionSelector0 = 9;
                            break L0;
                          }
                        } else {
                          if (97 != param1) {
                            if (-103 == (param1 ^ -1)) {
                              this.a(0, -124);
                              stackIn_42_0 = 1;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            } else {
                              if ((param1 ^ -1) != -104) {
                                if (-85 != (param1 ^ -1)) {
                                  L8: {
                                    if (!wa.field_j[82]) {
                                      break L8;
                                    } else {
                                      if (param1 != 65) {
                                        break L8;
                                      } else {
                                        this.m(67);
                                        stackIn_32_0 = 1;
                                        decompiledRegionSelector0 = 5;
                                        break L0;
                                      }
                                    }
                                  }
                                  L9: {
                                    if (!wa.field_j[82]) {
                                      break L9;
                                    } else {
                                      if (-67 != (param1 ^ -1)) {
                                        break L9;
                                      } else {
                                        this.k(-1);
                                        stackIn_36_0 = 1;
                                        decompiledRegionSelector0 = 6;
                                        break L0;
                                      }
                                    }
                                  }
                                  if (!wa.field_j[82]) {
                                    break L6;
                                  } else {
                                    if (param1 != 67) {
                                      break L6;
                                    } else {
                                      this.f((byte) 113);
                                      stackIn_40_0 = 1;
                                      decompiledRegionSelector0 = 7;
                                      break L0;
                                    }
                                  }
                                } else {
                                  this.e(false);
                                  stackIn_28_0 = 1;
                                  decompiledRegionSelector0 = 4;
                                  break L0;
                                }
                              } else {
                                this.a(this.field_u.length(), -115);
                                stackIn_25_0 = 1;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              }
                            }
                          } else {
                            if (this.field_F < this.field_u.length()) {
                              L10: {
                                stackIn_19_0 = this;

                                if (!wa.field_j[82]) {
                                  stackIn_20_0 = this;
                                  stackIn_20_1 = 1 + this.field_F;
                                  break L10;
                                } else {
                                  stackIn_20_0 = this;
                                  stackIn_20_1 = this.i(32);
                                  break L10;
                                }
                              }
                              this.a(stackIn_20_1, 5);
                              stackIn_21_0 = 1;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            } else {
                              break L6;
                            }
                          }
                        }
                      } else {
                        this.j(0);
                        stackIn_12_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                }
                stackIn_73_0 = 0;
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
            stackIn_76_0 = (RuntimeException) (var5);

            stackIn_76_1 = new StringBuilder().append("rl.P(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_77_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackIn_77_2 = "null";
              break L11;
            } else {
              stackIn_77_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackIn_77_2 = "{...}";
              break L11;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_77_0), stackIn_77_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_21_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_25_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_28_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_32_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_36_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_40_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_42_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_48_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_51_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_54_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_57_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_60_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_71_0 != 0;
                                    } else {
                                      return stackIn_73_0 != 0;
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

    final boolean a(int param0, int param1, w param2, int param3, int param4, int param5, int param6) {
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
              if (!(this.field_i instanceof ub)) {
                stackIn_19_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  var8_int = ((ub) ((Object) this.field_i)).a((w) (this), param4, 9, param5, bk.field_b, sh.field_e);
                  stackIn_5_0 = this;

                  if (-1 != var8_int) {
                    stackIn_6_0 = this;
                    stackIn_6_1 = var8_int;
                    break L1;
                  } else {
                    stackIn_6_0 = this;
                    stackIn_6_1 = 0;
                    break L1;
                  }
                }
                L2: {
                  this.a(stackIn_6_1, -124);
                  var8_long = rf.c(0);
                  stackIn_8_0 = this;

                  if (250L <= -this.field_M + var8_long) {
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
                  ((rl) (this)).field_K = stackIn_9_1 != 0;
                  if (this.field_K) {
                    L4: {
                      this.field_I = this.n(param0 ^ 4807);
                      this.field_F = this.i(32);
                      if (0 >= this.field_F) {
                        break L4;
                      } else {
                        if (-33 == (this.field_u.charAt(-1 + this.field_F) ^ -1)) {
                          this.field_F = this.field_F - 1;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    this.field_L = this.field_F;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                this.field_M = var8_long;
                stackIn_17_0 = 1;
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
            stackIn_22_0 = (RuntimeException) (var8);

            stackIn_22_1 = new StringBuilder().append("rl.VA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_17_0 != 0;
        } else {
          return stackIn_19_0 != 0;
        }
    }

    private final void e(byte param0) {
        ve var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        ub var10;
        var9 = Lexicominos.field_L ? 1 : 0;
        if (this.field_N) {
          if (this.field_i instanceof ub) {
            var10 = (ub) ((Object) this.field_i);
            var3 = var10.a((w) (this), (byte) 122);
            var4 = var3.a((byte) 94);
            var5 = var10.a((w) (this), 227);
            var6 = var10.a(2) >> -2073301887;
            if (var4 < var5 + -var6) {
              this.field_l = 0;
              this.field_p = 0;
              return;
            } else {
              L0: {
                var7 = this.field_p - -var3.a((byte) -116, this.field_F);
                if (-var6 + var5 < var7) {
                  this.field_p = -var7 - var6 - (-var5 - this.field_p);
                  break L0;
                } else {
                  if (var7 >= var6) {
                    break L0;
                  } else {
                    this.field_p = this.field_p - -var6 - var7;
                    break L0;
                  }
                }
              }
              L1: {
                if ((this.field_p ^ -1) < -1) {
                  this.field_p = 0;
                  break L1;
                } else {
                  if (-var5 - -var6 > this.field_p) {
                    this.field_p = -var5 - -var6;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              var8 = 62 / ((param0 - 30) / 38);
              return;
            }
          } else {
            return;
          }
        } else {
          this.field_l = 0;
          this.field_p = 0;
          return;
        }
    }

    private final int n(int param0) {
        int var2;
        int var3;
        var3 = Lexicominos.field_L ? 1 : 0;
        if ((this.field_F ^ -1) != param0) {
          var2 = this.field_F + -1;
          L0: while (true) {
            L1: {
              if ((var2 ^ -1) >= -1) {
                break L1;
              } else {
                if (32 == this.field_u.charAt(var2 - 1)) {
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
          return this.field_F;
        }
    }

    final void a(String param0, int param1, boolean param2) {
        int dupTemp$2 = 0;
        int var4_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                param0 = "";
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 == -1) {
                break L2;
              } else {
                this.f((byte) 39);
                break L2;
              }
            }
            L3: {
              this.field_u = param0;
              var4_int = param0.length();
              if (0 == (this.field_G ^ -1)) {
                break L3;
              } else {
                if (this.field_G >= var4_int) {
                  break L3;
                } else {
                  this.field_u = this.field_u.substring(0, this.field_G);
                  break L3;
                }
              }
            }
            L4: {
              dupTemp$2 = this.field_u.length();
              this.field_I = dupTemp$2;
              this.field_F = dupTemp$2;
              if (!param2) {
                this.f(false);
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
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("rl.R(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        ub var8 = null;
        long var6 = 0L;
        if (this.field_i != null) {
            if (!(param3 != 0)) {
                this.field_i.a(param1, param2, this.field_D, (w) (this), -3284);
                if (!(!(this.field_i instanceof ub))) {
                    var8 = (ub) ((Object) this.field_i);
                    if (!(this.field_F == this.field_I)) {
                        var8.a(param1, param2, (w) (this), (byte) 31, this.field_I, this.field_F);
                    }
                    var6 = rf.c(0);
                    if (!((var6 + -this.field_J) % 1000L >= 500L)) {
                        var8.a(this.field_F, param2, param1, (w) (this), true);
                    }
                }
            }
        }
        if (param0 != -115) {
            field_O = false;
        }
    }

    final void j(int param0) {
        this.field_u = "";
        this.field_F = param0;
        this.field_I = 0;
        this.f(false);
    }

    public static void g(byte param0) {
        field_H = null;
        int var1 = -50 / ((param0 - 16) / 52);
    }

    private final void a(int param0, int param1) {
        this.field_F = param0;
        if (!(wa.field_j[81])) {
            this.field_I = this.field_F;
        }
        int var3 = 79 % ((-75 - param1) / 40);
    }

    void f(boolean param0) {
        if (this.field_r instanceof nf) {
            ((nf) ((Object) this.field_r)).a((byte) 10, (rl) (this));
        }
        if (param0) {
            this.field_N = true;
        }
    }

    private final void m(int param0) {
        if (param0 < 40) {
            return;
        }
        this.k(-1);
        this.l(-1);
    }

    void a(byte param0, w param1, int param2, int param3) {
        ub var5 = null;
        int var6 = 0;
        try {
            super.a(param0, param1, param2, param3);
            this.e((byte) 94);
            if (this.field_h == 1) {
                if (this.field_i instanceof ub) {
                    var5 = (ub) ((Object) this.field_i);
                    var6 = var5.a((w) (this), param2, 9, param3, bk.field_b, sh.field_e);
                    if (var6 != -1) {
                        if (this.field_K && var6 < this.field_L && this.field_I < var6) {
                            var6 = this.field_L;
                        }
                        this.field_F = var6;
                    }
                }
                this.field_J = rf.c(param0 ^ -119);
            }
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "rl.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void e(boolean param0) {
        if (!(!(this.field_r instanceof nf))) {
            ((nf) ((Object) this.field_r)).a((rl) (this), true);
        }
        if (param0) {
            this.m(-20);
        }
    }

    private final void f(byte param0) {
        try {
            Throwable decompiledCaughtException = null;
            String var2 = null;
            Exception var2_ref = null;
            int var3 = 0;
            try {
              L0: {
                var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                this.l(-1);
                var3 = -67 % ((19 - param0) / 35);
                this.a(var2, (byte) 100);
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

    private final void k(int param0) {
        String var2 = this.d((byte) -83);
        if (!((var2.length() ^ -1) >= param0)) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.d((byte) -41))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    private final String d(byte param0) {
        int var2 = this.field_F > this.field_I ? this.field_I : this.field_F;
        int var3 = this.field_F <= this.field_I ? this.field_I : this.field_F;
        if (param0 > -27) {
            return (String) null;
        }
        return this.field_u.substring(var2, var3);
    }

    private final int i(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = Lexicominos.field_L ? 1 : 0;
        var2 = this.field_u.length();
        if (var2 != this.field_F) {
          L0: {
            if (param0 == 32) {
              break L0;
            } else {
              this.field_F = 55;
              break L0;
            }
          }
          var3 = 1 + this.field_F;
          L1: while (true) {
            L2: {
              if (var3 >= var2) {
                break L2;
              } else {
                if (this.field_u.charAt(var3 - 1) == 32) {
                  break L2;
                } else {
                  var3++;
                  continue L1;
                }
              }
            }
            return var3;
          }
        } else {
          return this.field_F;
        }
    }

    rl(String param0, vd param1, int param2) {
        super(param0, param1);
        this.field_M = 0L;
        this.field_L = -1;
        this.field_K = false;
        try {
            this.field_i = nb.field_z.field_a;
            this.field_G = param2;
            this.a(param0, -1, true);
            this.field_N = true;
            this.field_J = rf.c(0);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "rl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_H = new rb();
        field_O = false;
    }
}
