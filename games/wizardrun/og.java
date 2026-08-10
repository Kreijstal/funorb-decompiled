/*
 * Decompiled by CFR-JS 0.4.0.
 */
class og extends pl {
    private boolean field_F;
    private int field_L;
    private int field_H;
    private boolean field_Q;
    private long field_I;
    static qj field_N;
    static String field_P;
    static qj field_S;
    static String[] field_R;
    static int field_O;
    private int field_M;
    static String field_G;
    private int field_J;
    private long field_K;

    final void a(int param0, int param1, int param2, int param3) {
        qe var8 = null;
        long var6 = 0L;
        if (null != this.field_w && param2 == 0) {
            this.field_w.a(param0, param3, (ub) (this), true, this.field_B);
            if (this.field_w instanceof qe) {
                var8 = (qe) ((Object) this.field_w);
                if (!(this.field_J == this.field_L)) {
                    var8.a(this.field_L, true, this.field_J, param3, param0, (ub) (this));
                }
                var6 = d.a((byte) 54);
                if (-501L < ((-this.field_I + var6) % 1000L ^ -1L)) {
                    var8.a(param3, param0, (ub) (this), 0, this.field_L);
                }
            }
        }
        if (param1 != 0) {
            this.field_Q = true;
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (param2 > -69) {
            return;
        }
        field_O = param0;
        ee.field_r = param1;
    }

    private final int g(byte param0) {
        int var2;
        int var3;
        int var4;
        var4 = wizardrun.field_H;
        var2 = this.field_k.length();
        if (this.field_L != var2) {
          if (param0 >= 19) {
            var3 = 1 + this.field_L;
            L0: while (true) {
              L1: {
                if (var3 >= var2) {
                  break L1;
                } else {
                  if (this.field_k.charAt(-1 + var3) == 32) {
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
            return 50;
          }
        } else {
          return this.field_L;
        }
    }

    og(String param0, ce param1, int param2) {
        super(param0, param1);
        this.field_Q = false;
        this.field_M = -1;
        this.field_K = 0L;
        try {
            this.field_w = kc.field_H.field_b;
            this.field_H = param2;
            this.a(-1, true, param0);
            this.field_F = true;
            this.field_I = d.a((byte) 94);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "og.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean a(char param0, int param1, byte param2, ub param3) {
        int dupTemp$0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_34_0 = 0;
        Object stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        Object stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        int stackIn_43_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_66_0 = 0;
        Object stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        Object stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        int stackIn_71_2 = 0;
        int stackIn_72_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_76_0 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              this.field_I = d.a((byte) 99);
              if (param0 == 60) {
                break L1;
              } else {
                if (param0 == 62) {
                  break L1;
                } else {
                  if (param2 < -96) {
                    L2: {
                      if (param0 < 32) {
                        break L2;
                      } else {
                        if (param0 > 126) {
                          break L2;
                        } else {
                          L3: {
                            if (this.field_J == this.field_L) {
                              break L3;
                            } else {
                              this.g(-110);
                              break L3;
                            }
                          }
                          L4: {
                            if ((this.field_H ^ -1) == 0) {
                              break L4;
                            } else {
                              if (this.field_k.length() < this.field_H) {
                                break L4;
                              } else {
                                return true;
                              }
                            }
                          }
                          L5: {
                            if (this.field_L >= this.field_k.length()) {
                              this.field_k = this.field_k + param0;
                              dupTemp$0 = this.field_k.length();
                              this.field_L = dupTemp$0;
                              this.field_J = dupTemp$0;
                              break L5;
                            } else {
                              this.field_k = this.field_k.substring(0, this.field_L) + param0 + this.field_k.substring(this.field_L, this.field_k.length());
                              this.field_L = this.field_L + 1;
                              this.field_J = this.field_L;
                              break L5;
                            }
                          }
                          this.i((byte) -84);
                          stackIn_19_0 = 1;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                    L6: {
                      if (param1 != 85) {
                        if (-102 != (param1 ^ -1)) {
                          if (param1 == 13) {
                            this.e(true);
                            stackIn_74_0 = 1;
                            decompiledRegionSelector0 = 15;
                            break L0;
                          } else {
                            if (96 == param1) {
                              if (0 >= this.field_L) {
                                break L6;
                              } else {
                                L7: {
                                  stackIn_70_0 = this;

                                  stackIn_70_1 = 27;

                                  if (hi.field_p[82]) {
                                    stackIn_71_0 = this;
                                    stackIn_71_1 = stackIn_70_1;
                                    stackIn_71_2 = this.d(31823);
                                    break L7;
                                  } else {
                                    stackIn_71_0 = this;
                                    stackIn_71_1 = stackIn_70_1;
                                    stackIn_71_2 = -1 + this.field_L;
                                    break L7;
                                  }
                                }
                                this.a((byte) stackIn_71_1, stackIn_71_2);
                                stackIn_72_0 = 1;
                                decompiledRegionSelector0 = 14;
                                break L0;
                              }
                            } else {
                              if (-98 != (param1 ^ -1)) {
                                if ((param1 ^ -1) == -103) {
                                  this.a((byte) 10, 0);
                                  stackIn_66_0 = 1;
                                  decompiledRegionSelector0 = 13;
                                  break L0;
                                } else {
                                  if ((param1 ^ -1) != -104) {
                                    if (-85 != (param1 ^ -1)) {
                                      L8: {
                                        if (!hi.field_p[82]) {
                                          break L8;
                                        } else {
                                          if ((param1 ^ -1) == -66) {
                                            this.j((byte) 75);
                                            stackIn_64_0 = 1;
                                            decompiledRegionSelector0 = 12;
                                            break L0;
                                          } else {
                                            break L8;
                                          }
                                        }
                                      }
                                      L9: {
                                        if (!hi.field_p[82]) {
                                          break L9;
                                        } else {
                                          if (param1 != 66) {
                                            break L9;
                                          } else {
                                            this.f(false);
                                            stackIn_57_0 = 1;
                                            decompiledRegionSelector0 = 10;
                                            break L0;
                                          }
                                        }
                                      }
                                      if (!hi.field_p[82]) {
                                        break L6;
                                      } else {
                                        if (param1 == 67) {
                                          this.h((byte) 126);
                                          stackIn_62_0 = 1;
                                          decompiledRegionSelector0 = 11;
                                          break L0;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    } else {
                                      this.h(0);
                                      stackIn_50_0 = 1;
                                      decompiledRegionSelector0 = 9;
                                      break L0;
                                    }
                                  } else {
                                    this.a((byte) 92, this.field_k.length());
                                    stackIn_47_0 = 1;
                                    decompiledRegionSelector0 = 8;
                                    break L0;
                                  }
                                }
                              } else {
                                if (this.field_L >= this.field_k.length()) {
                                  break L6;
                                } else {
                                  L10: {
                                    stackIn_41_0 = this;

                                    stackIn_41_1 = -127;

                                    if (!hi.field_p[82]) {
                                      stackIn_42_0 = this;
                                      stackIn_42_1 = stackIn_41_1;
                                      stackIn_42_2 = 1 + this.field_L;
                                      break L10;
                                    } else {
                                      stackIn_42_0 = this;
                                      stackIn_42_1 = stackIn_41_1;
                                      stackIn_42_2 = this.g((byte) 24);
                                      break L10;
                                    }
                                  }
                                  this.a((byte) stackIn_42_1, stackIn_42_2);
                                  stackIn_43_0 = 1;
                                  decompiledRegionSelector0 = 7;
                                  break L0;
                                }
                              }
                            }
                          }
                        } else {
                          if (this.field_L != this.field_J) {
                            this.g(76);
                            stackIn_34_0 = 1;
                            decompiledRegionSelector0 = 6;
                            break L0;
                          } else {
                            if (this.field_L < this.field_k.length()) {
                              this.field_J = 1 + this.field_L;
                              this.g(-73);
                              stackIn_32_0 = 1;
                              decompiledRegionSelector0 = 5;
                              break L0;
                            } else {
                              break L6;
                            }
                          }
                        }
                      } else {
                        if (this.field_J != this.field_L) {
                          this.g(-92);
                          stackIn_26_0 = 1;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          if ((this.field_L ^ -1) >= -1) {
                            break L6;
                          } else {
                            this.field_J = -1 + this.field_L;
                            this.g(31);
                            stackIn_24_0 = 1;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          }
                        }
                      }
                    }
                    stackIn_76_0 = 0;
                    decompiledRegionSelector0 = 16;
                    break L0;
                  } else {
                    stackIn_7_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
            stackIn_4_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var5 = decompiledCaughtException;
            stackIn_79_0 = (RuntimeException) (var5);

            stackIn_79_1 = new StringBuilder().append("og.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_80_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackIn_80_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackIn_80_2 = "null";
              break L11;
            } else {
              stackIn_80_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackIn_80_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackIn_80_2 = "{...}";
              break L11;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_80_0), stackIn_80_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_19_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_24_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_26_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_32_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_34_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_43_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_47_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_50_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_57_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_62_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_64_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_66_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_72_0 != 0;
                                    } else {
                                      if (decompiledRegionSelector0 == 15) {
                                        return stackIn_74_0 != 0;
                                      } else {
                                        return stackIn_76_0 != 0;
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
    }

    private final void b(String param0, int param1) {
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
              if (this.field_H != -1) {
                var3_int = this.field_H + -this.field_k.length();
                if ((var3_int ^ -1) > -1) {
                  param0 = param0.substring(0, var3_int);
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
              if (this.field_L != this.field_k.length()) {
                this.field_k = this.field_k.substring(0, this.field_L) + param0 + this.field_k.substring(this.field_L, this.field_k.length());
                break L2;
              } else {
                this.field_k = this.field_k + param0;
                break L2;
              }
            }
            L3: {
              this.field_L = this.field_L + param0.length();
              if (param1 > 76) {
                break L3;
              } else {
                this.a((byte) -42, -84);
                break L3;
              }
            }
            this.field_J = this.field_L;
            this.i((byte) -122);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("og.KA(");

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
          throw bd.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    void i(byte param0) {
        if (this.field_s instanceof fj) {
            ((fj) ((Object) this.field_s)).a((og) (this), 5);
        }
        if (param0 >= -59) {
            this.field_Q = true;
        }
    }

    final static void a(ai param0, int param1, int param2) {
        mg var8 = null;
        mg var9 = null;
        int var4 = 0;
        int var5 = 0;
        int var7 = wizardrun.field_H;
        try {
            var8 = n.field_b;
            var9 = var8;
            var9.c((byte) -105, param1);
            var9.field_m = var9.field_m + 1;
            var4 = var9.field_m;
            var9.b((byte) 11, 1);
            var9.b(-1947079288, param0.field_i);
            var9.b(-1947079288, param0.field_t);
            var9.b(-1947079288, param0.field_o);
            var9.f(param0.field_k, 613003928);
            var9.f(param0.field_l, 613003928);
            var9.f(param0.field_m, 613003928);
            var9.f(param0.field_p, 613003928);
            var9.b((byte) 11, param0.field_q.length);
            var5 = 0;
            int var6 = -49 / ((param2 - 44) / 56);
            while (param0.field_q.length > var5) {
                var8.f(param0.field_q[var5], 613003928);
                var5++;
            }
            var9.e(var4, -1182887024);
            var9.a(-var4 + var9.field_m, -87);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "og.UA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean a(int param0, byte param1, int param2, int param3, int param4, int param5, ub param6) {
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          L0: {
            L1: {
              if (super.a(param0, (byte) -83, param2, param3, param4, param5, param6)) {
                if (!(this.field_w instanceof qe)) {
                  break L1;
                } else {
                  L2: {
                    var8_int = ((qe) ((Object) this.field_w)).a(9397, pg.field_n, param0, (ub) (this), param3, fi.field_B);
                    stackIn_5_0 = this;

                    stackIn_5_1 = -118;

                    if (-1 == var8_int) {
                      stackIn_6_0 = this;
                      stackIn_6_1 = stackIn_5_1;
                      stackIn_6_2 = 0;
                      break L2;
                    } else {
                      stackIn_6_0 = this;
                      stackIn_6_1 = stackIn_5_1;
                      stackIn_6_2 = var8_int;
                      break L2;
                    }
                  }
                  L3: {
                    this.a((byte) stackIn_6_1, stackIn_6_2);
                    var8_long = d.a((byte) 42);
                    stackIn_8_0 = this;

                    if (-251L >= (var8_long + -this.field_K ^ -1L)) {
                      stackIn_9_0 = this;
                      stackIn_9_1 = 0;
                      break L3;
                    } else {
                      stackIn_9_0 = this;
                      stackIn_9_1 = 1;
                      break L3;
                    }
                  }
                  L4: {
                    ((og) (this)).field_Q = stackIn_9_1 != 0;
                    if (!this.field_Q) {
                      break L4;
                    } else {
                      L5: {
                        this.field_J = this.d(31823);
                        this.field_L = this.g((byte) 113);
                        if (-1 <= (this.field_L ^ -1)) {
                          break L5;
                        } else {
                          if (this.field_k.charAt(-1 + this.field_L) != 32) {
                            break L5;
                          } else {
                            this.field_L = this.field_L - 1;
                            break L5;
                          }
                        }
                      }
                      this.field_M = this.field_L;
                      break L4;
                    }
                  }
                  this.field_K = var8_long;
                  stackIn_15_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                break L1;
              }
            }
            var8_int = -66 % ((param1 - 12) / 36);
            stackIn_17_0 = 0;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var8);

            stackIn_20_1 = new StringBuilder().append("og.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_15_0 != 0;
        } else {
          return stackIn_17_0 != 0;
        }
    }

    final void e(boolean param0) {
        this.field_J = 0;
        this.field_L = 0;
        this.field_k = "";
        if (!param0) {
            return;
        }
        this.i((byte) -81);
    }

    void a(int param0, int param1, int param2, ub param3) {
        qe var7 = null;
        int var6 = 0;
        try {
            super.a(param0 + 0, param1, param2, param3);
            this.e(param0 ^ param0);
            if ((this.field_q ^ -1) == -2) {
                if (!(!(this.field_w instanceof qe))) {
                    var7 = (qe) ((Object) this.field_w);
                    var6 = var7.a(9397, pg.field_n, param2, (ub) (this), param1, fi.field_B);
                    if (!((var6 ^ -1) == 0)) {
                        if (this.field_Q && var6 < this.field_M) {
                            if (!(var6 <= this.field_J)) {
                                var6 = this.field_M;
                            }
                        }
                        this.field_L = var6;
                    }
                }
                this.field_I = d.a((byte) 44);
            }
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "og.H(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void k(byte param0) {
        field_S = null;
        field_G = null;
        if (param0 != 37) {
            ai var2 = (ai) null;
            og.a((ai) null, 98, 109);
        }
        field_N = null;
        field_R = null;
        field_P = null;
    }

    private final int d(int param0) {
        int var2;
        int var3;
        var3 = wizardrun.field_H;
        if (-1 == (this.field_L ^ -1)) {
          return this.field_L;
        } else {
          L0: {
            if (param0 == 31823) {
              break L0;
            } else {
              field_O = -60;
              break L0;
            }
          }
          var2 = this.field_L - 1;
          L1: while (true) {
            L2: {
              if (0 >= var2) {
                break L2;
              } else {
                if (this.field_k.charAt(-1 + var2) == 32) {
                  break L2;
                } else {
                  var2--;
                  continue L1;
                }
              }
            }
            return var2;
          }
        }
    }

    private final void h(int param0) {
        if (param0 != 0) {
            this.a(59, -78, 27, 72);
        }
        if (this.field_s instanceof fj) {
            ((fj) ((Object) this.field_s)).a(param0 ^ -117, (og) (this));
        }
    }

    private final void a(byte param0, int param1) {
        int var3 = 10 % ((-48 - param0) / 44);
        this.field_L = param1;
        if (!(hi.field_p[81])) {
            this.field_J = this.field_L;
        }
    }

    private final String f(int param0) {
        if (param0 != -12938) {
            this.field_J = 68;
        }
        int var2 = this.field_L > this.field_J ? this.field_J : this.field_L;
        int var3 = this.field_L > this.field_J ? this.field_L : this.field_J;
        return this.field_k.substring(var2, var3);
    }

    private final void e(int param0) {
        af var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        qe var9;
        var8 = wizardrun.field_H;
        if (this.field_F) {
          L0: {
            if (param0 == 0) {
              break L0;
            } else {
              this.field_K = 13L;
              break L0;
            }
          }
          if (!(this.field_w instanceof qe)) {
            return;
          } else {
            var9 = (qe) ((Object) this.field_w);
            var3 = var9.a((ub) (this), (byte) 78);
            var4 = var3.a(-127);
            var5 = var9.a((ub) (this), param0 + -106);
            var6 = var9.a((byte) 62) >> -815417439;
            if (var4 >= var5 + -var6) {
              L1: {
                var7 = this.field_i - -var3.a(62, this.field_L);
                if (var5 + -var6 >= var7) {
                  if (var6 <= var7) {
                    break L1;
                  } else {
                    this.field_i = this.field_i + var6 - var7;
                    break L1;
                  }
                } else {
                  this.field_i = var5 + (-var6 - var7) + this.field_i;
                  break L1;
                }
              }
              L2: {
                if (-1 > (this.field_i ^ -1)) {
                  this.field_i = 0;
                  break L2;
                } else {
                  if (this.field_i < var6 + -var5) {
                    this.field_i = var6 + -var5;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              return;
            } else {
              this.field_i = 0;
              this.field_j = 0;
              return;
            }
          }
        } else {
          this.field_j = 0;
          this.field_i = 0;
          return;
        }
    }

    private final void f(boolean param0) {
        String var2 = this.f(-12938);
        if (param0) {
            return;
        }
        if (!(-1 <= (var2.length() ^ -1))) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.f(-12938))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    final void a(int param0, boolean param1, String param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (param2 == null) {
                param2 = "";
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              this.field_k = param2;
              var4_int = param2.length();
              if (this.field_H == param0) {
                break L2;
              } else {
                if (this.field_H < var4_int) {
                  this.field_k = this.field_k.substring(0, this.field_H);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              dupTemp$1 = this.field_k.length();
              this.field_J = dupTemp$1;
              this.field_L = dupTemp$1;
              if (param1) {
                break L3;
              } else {
                this.i((byte) -94);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("og.LA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    private final void g(int param0) {
        int var3 = 0;
        int var2 = 0;
        if (this.field_J != this.field_L) {
            var2 = this.field_L > this.field_J ? this.field_J : this.field_L;
            var3 = this.field_L <= this.field_J ? this.field_J : this.field_L;
            this.field_L = var2;
            this.field_J = var2;
            this.field_k = this.field_k.substring(0, var2) + this.field_k.substring(var3, this.field_k.length());
            this.i((byte) -115);
        }
        var2 = 47 / ((param0 - -20) / 43);
    }

    private final void h(byte param0) {
        try {
            Throwable decompiledCaughtException = null;
            String var2 = null;
            Exception var2_ref = null;
            try {
              L0: {
                L1: {
                  var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                  if (param0 >= 1) {
                    break L1;
                  } else {
                    this.field_J = -125;
                    break L1;
                  }
                }
                this.g(-125);
                this.b(var2, 84);
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2_ref = (Exception) (Object) decompiledCaughtException;
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void j(byte param0) {
        if (param0 != 75) {
            this.a(-59, 57, 98, 61);
        }
        this.f(false);
        this.g(param0 + -145);
    }

    static {
        field_O = -1;
        field_G = "Main Menu";
        field_P = "Move left and right";
    }
}
