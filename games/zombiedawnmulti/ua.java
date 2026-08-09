/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ua extends rg {
    private boolean field_O;
    static re field_I;
    private boolean field_H;
    private int field_G;
    private int field_M;
    private int field_L;
    private int field_F;
    static String field_K;
    static cj field_E;
    static int field_N;

    final StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        StringBuilder discarded$62 = null;
        StringBuilder discarded$63 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 7) {
              L1: {
                if (this.a(param1, param0 ^ 126, param3, param2)) {
                  this.a(param2, param3, (byte) 26, param1);
                  this.a(param1, true, param3, param2);
                  discarded$62 = param3.append(" revert=").append(this.field_H);
                  if (this.field_G == 2147483647) {
                    break L1;
                  } else {
                    if ((this.field_M ^ -1) == -2147483648) {
                      break L1;
                    } else {
                      discarded$63 = param3.append(" to ").append(this.field_G).append(',').append(this.field_M);
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
              stackIn_9_0 = (StringBuilder) (param3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (StringBuilder) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("ua.GA(").append(param0).append(',');

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
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_9_0;
        }
    }

    final static int h(int param0) {
        int var1;
        var1 = -104 % ((59 - param0) / 49);
        tj.field_a.b(0);
        if (!i.field_a.b((byte) 99)) {
          return ch.b(19352);
        } else {
          return 0;
        }
    }

    public static void g(byte param0) {
        field_E = null;
        field_I = null;
        field_K = null;
        if (param0 >= -12) {
            field_K = (String) null;
        }
    }

    final void a(int param0) {
        super.a(param0);
        this.field_B.b(0, 0, 28972, this.field_n, this.field_w);
        this.field_G = this.field_y;
        this.field_M = this.field_i;
    }

    final static String a(byte param0, int param1, String param2) {
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_14_0 = null;
        String stackIn_17_0 = null;
        String stackIn_21_0 = null;
        String stackIn_25_0 = null;
        String stackIn_28_0 = null;
        String stackIn_31_0 = null;
        String stackIn_34_0 = null;
        String stackIn_38_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        ul var4 = null;
        try {
          L0: {
            if ((param1 ^ -1) != -2) {
              if ((param1 ^ -1) != -3) {
                if (-4 != (param1 ^ -1)) {
                  L1: {
                    if (param0 == -61) {
                      break L1;
                    } else {
                      var4 = (ul) null;
                      ua.a((ul) null, (ul) null, (byte) 0);
                      break L1;
                    }
                  }
                  if (4 == param1) {
                    stackIn_14_0 = vl.a(fh.field_f, new String[]{param2}, 2);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if ((param1 ^ -1) != -6) {
                      if ((param1 ^ -1) == -7) {
                        stackIn_21_0 = vl.a(ik.field_e, new String[]{param2}, 2);
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if ((param1 ^ -1) == -8) {
                          stackIn_25_0 = vl.a(sf.field_c, new String[]{param2}, 2);
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          if (8 != param1) {
                            if ((param1 ^ -1) != -12) {
                              if (param1 != 12) {
                                if (13 == param1) {
                                  stackIn_38_0 = vl.a(qk.field_i, new String[]{param2}, param0 + 63);
                                  decompiledRegionSelector0 = 10;
                                  break L0;
                                } else {
                                  return null;
                                }
                              } else {
                                stackIn_34_0 = vl.a(oa.field_b, new String[]{param2}, param0 + 63);
                                decompiledRegionSelector0 = 9;
                                break L0;
                              }
                            } else {
                              stackIn_31_0 = vl.a(qh.field_b, new String[]{param2}, 2);
                              decompiledRegionSelector0 = 8;
                              break L0;
                            }
                          } else {
                            stackIn_28_0 = vl.a(tq.field_Fb, new String[]{param2}, 2);
                            decompiledRegionSelector0 = 7;
                            break L0;
                          }
                        }
                      }
                    } else {
                      stackIn_17_0 = vl.a(un.field_l, new String[]{param2}, 2);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                } else {
                  stackIn_8_0 = vl.a(ki.field_l, new String[]{param2}, 2);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = vl.a(qb.field_o, new String[]{param2}, 2);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = vl.a(oe.field_e, new String[]{param2}, 2);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_42_0 = (RuntimeException) (var3);

            stackIn_42_1 = new StringBuilder().append("ua.JA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L2;
            } else {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_17_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_21_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_25_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_28_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_31_0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_34_0;
                          } else {
                            return stackIn_38_0;
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

    final boolean a(int param0, int param1, int param2, cf param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var8_int = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
              if (var8_int == 0) {
                break L1;
              } else {
                if (!this.field_O) {
                  break L1;
                } else {
                  stackIn_3_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            if (this.a(-94, param5, param1, param0, param6)) {
              this.field_u = param2;
              if (1 != param2) {
                stackIn_10_0 = 1;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                qi.field_a = (ua) (this);
                this.field_F = -param6 + (-this.field_i + param0);
                this.field_L = -param5 + (-this.field_y + param1);
                return true;
              }
            } else {
              stackIn_6_0 = var8_int;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var8);

            stackIn_13_1 = new StringBuilder().append("ua.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw fa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            return stackIn_10_0 != 0;
          }
        }
    }

    final static void i(int param0) {
        L0: {
          if (h.field_L != null) {
            h.field_L.m(-7435);
            break L0;
          } else {
            break L0;
          }
        }
        qe.field_e = new cp();
        if (param0 != -2) {
          ua.h(-84);
          wj.field_i.a((cf) (qe.field_e), (byte) 123);
          return;
        } else {
          wj.field_i.a((cf) (qe.field_e), (byte) 123);
          return;
        }
    }

    final void a(int param0, cf param1, int param2, int param3, boolean param4, int param5) {
        try {
            super.a(param0, param1, param2, param3, param4, param5);
            this.field_u = 0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ua.NA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private ua(int param0, int param1, int param2, int param3, nl param4, bj param5, cf param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_M = 2147483647;
        this.field_G = 2147483647;
        try {
            this.field_H = param7 ? true : false;
            this.field_B = param6;
            this.field_O = param8 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ua.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static void a(ul param0, ul param1, byte param2) {
        try {
            if (param2 != 23) {
                field_N = 91;
            }
            lb.field_d = param0;
            pl.field_C = param1;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ua.IA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(int param0, cf param1, int param2, int param3) {
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    if (!(this.field_B instanceof gn)) {
                      break L4;
                    } else {
                      if (!((gn) ((Object) this.field_B)).field_F) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if ((this.field_u ^ -1) == -2) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                if (this.field_H) {
                  L5: {
                    if (this.field_G != this.field_y) {
                      L6: {
                        var5_int = this.field_G + -this.field_y;
                        stackIn_11_0 = this;

                        stackIn_11_1 = this.field_y;

                        if (Math.abs(var5_int) <= 2) {
                          stackIn_13_0 = this;

                          if (0 < var5_int) {
                            stackIn_14_0 = this;
                            stackIn_14_1 = stackIn_11_1;
                            stackIn_14_2 = 1;
                            break L6;
                          } else {
                            stackIn_14_0 = this;
                            stackIn_14_1 = stackIn_11_1;
                            stackIn_14_2 = -1;
                            break L6;
                          }
                        } else {
                          stackIn_14_0 = this;
                          stackIn_14_1 = stackIn_11_1;
                          stackIn_14_2 = var5_int >> 2135042977;
                          break L6;
                        }
                      }
                      ((ua) (this)).field_y = stackIn_14_1 + stackIn_14_2;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if (this.field_M == this.field_i) {
                    break L1;
                  } else {
                    L7: {
                      var5_int = this.field_M + -this.field_i;
                      stackIn_20_0 = this;

                      stackIn_20_1 = this.field_i;

                      if (2 < Math.abs(var5_int)) {
                        stackIn_21_0 = this;
                        stackIn_21_1 = stackIn_20_1;
                        stackIn_21_2 = var5_int >> -1034321183;
                        break L7;
                      } else {
                        stackIn_19_0 = this;

                        if ((var5_int ^ -1) < -1) {
                          stackIn_21_0 = this;
                          stackIn_21_1 = stackIn_20_1;
                          stackIn_21_2 = 1;
                          break L7;
                        } else {
                          stackIn_21_0 = this;
                          stackIn_21_1 = stackIn_20_1;
                          stackIn_21_2 = -1;
                          break L7;
                        }
                      }
                    }
                    ((ua) (this)).field_i = stackIn_21_1 + stackIn_21_2;
                    if (!ZombieDawnMulti.field_E) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                } else {
                  super.a(param0, param1, param2, param3);
                  return;
                }
              }
              L8: {
                var5_int = -this.field_L + (bd.field_g + -param2);
                var6 = -param3 + (-this.field_F + bo.field_d);
                if (this.field_y != var5_int) {
                  break L8;
                } else {
                  if (this.field_i == var6) {
                    break L1;
                  } else {
                    break L8;
                  }
                }
              }
              this.field_i = var6;
              this.field_y = var5_int;
              if (!(this.field_A instanceof ad)) {
                break L1;
              } else {
                ((ad) ((Object) this.field_A)).a(param2, false, (ua) (this), param3);
                break L1;
              }
            }
            super.a(param0, param1, param2, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var5);

            stackIn_31_1 = new StringBuilder().append("ua.T(").append(param0).append(',');

            if (param1 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L9;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L9;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_K = "Resume Game";
        field_I = new re();
    }
}
