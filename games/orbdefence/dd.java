/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dd extends kj {
    static cb field_A;
    private int field_C;
    private boolean field_H;
    private int field_G;
    private boolean field_I;
    private int field_F;
    static java.security.SecureRandom field_D;
    static int[] field_B;
    private int field_E;

    final void a(int param0, int param1, byte param2, pj param3, int param4, int param5) {
        try {
            super.a(param0, param1, (byte) -117, param3, param4, param5);
            if (param2 >= -91) {
                pj var8 = (pj) null;
                this.a(-94, 81, (byte) 57, (pj) null, 57, -115);
            }
            this.field_v = 0;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "dd.J(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(byte param0, pj param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_28_2 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (!(this.field_y instanceof s)) {
                    break L3;
                  } else {
                    if (!((s) ((Object) this.field_y)).field_F) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (-2 != (this.field_v ^ -1)) {
                  break L2;
                } else {
                  L4: {
                    L5: {
                      var5_int = -this.field_C + (ua.field_a - param2);
                      var6 = vl.field_d + (-this.field_F - param3);
                      if (this.field_s != var5_int) {
                        break L5;
                      } else {
                        if (this.field_n != var6) {
                          break L5;
                        } else {
                          break L4;
                        }
                      }
                    }
                    this.field_s = var5_int;
                    this.field_n = var6;
                    if (this.field_h instanceof gf) {
                      ((gf) ((Object) this.field_h)).a(param2, true, param3, (dd) (this));
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  if (!OrbDefence.field_D) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (this.field_I) {
                L6: {
                  if (this.field_E != this.field_s) {
                    L7: {
                      var5_int = this.field_E - this.field_s;
                      stackOut_15_0 = this;
                      stackOut_15_1 = this.field_s;
                      stackIn_19_0 = stackOut_15_0;
                      stackIn_19_1 = stackOut_15_1;
                      stackIn_16_0 = stackOut_15_0;
                      stackIn_16_1 = stackOut_15_1;
                      if (-3 > (Math.abs(var5_int) ^ -1)) {
                        stackOut_19_0 = this;
                        stackOut_19_1 = stackIn_19_1;
                        stackOut_19_2 = var5_int >> 1398164449;
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        stackIn_20_2 = stackOut_19_2;
                        break L7;
                      } else {
                        stackOut_16_0 = this;
                        stackOut_16_1 = stackIn_16_1;
                        stackIn_18_0 = stackOut_16_0;
                        stackIn_18_1 = stackOut_16_1;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        if (-1 > (var5_int ^ -1)) {
                          stackOut_18_0 = this;
                          stackOut_18_1 = stackIn_18_1;
                          stackOut_18_2 = 1;
                          stackIn_20_0 = stackOut_18_0;
                          stackIn_20_1 = stackOut_18_1;
                          stackIn_20_2 = stackOut_18_2;
                          break L7;
                        } else {
                          stackOut_17_0 = this;
                          stackOut_17_1 = stackIn_17_1;
                          stackOut_17_2 = -1;
                          stackIn_20_0 = stackOut_17_0;
                          stackIn_20_1 = stackOut_17_1;
                          stackIn_20_2 = stackOut_17_2;
                          break L7;
                        }
                      }
                    }
                    ((dd) (this)).field_s = stackIn_20_1 + stackIn_20_2;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                if (this.field_n != this.field_G) {
                  L8: {
                    var5_int = this.field_G - this.field_n;
                    stackOut_23_0 = this;
                    stackOut_23_1 = this.field_n;
                    stackIn_27_0 = stackOut_23_0;
                    stackIn_27_1 = stackOut_23_1;
                    stackIn_24_0 = stackOut_23_0;
                    stackIn_24_1 = stackOut_23_1;
                    if (2 < Math.abs(var5_int)) {
                      stackOut_27_0 = this;
                      stackOut_27_1 = stackIn_27_1;
                      stackOut_27_2 = var5_int >> -1907579935;
                      stackIn_28_0 = stackOut_27_0;
                      stackIn_28_1 = stackOut_27_1;
                      stackIn_28_2 = stackOut_27_2;
                      break L8;
                    } else {
                      stackOut_24_0 = this;
                      stackOut_24_1 = stackIn_24_1;
                      stackIn_26_0 = stackOut_24_0;
                      stackIn_26_1 = stackOut_24_1;
                      stackIn_25_0 = stackOut_24_0;
                      stackIn_25_1 = stackOut_24_1;
                      if (-1 > (var5_int ^ -1)) {
                        stackOut_26_0 = this;
                        stackOut_26_1 = stackIn_26_1;
                        stackOut_26_2 = 1;
                        stackIn_28_0 = stackOut_26_0;
                        stackIn_28_1 = stackOut_26_1;
                        stackIn_28_2 = stackOut_26_2;
                        break L8;
                      } else {
                        stackOut_25_0 = this;
                        stackOut_25_1 = stackIn_25_1;
                        stackOut_25_2 = -1;
                        stackIn_28_0 = stackOut_25_0;
                        stackIn_28_1 = stackOut_25_1;
                        stackIn_28_2 = stackOut_25_2;
                        break L8;
                      }
                    }
                  }
                  ((dd) (this)).field_n = stackIn_28_1 + stackIn_28_2;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                super.a(param0, param1, param2, param3);
                return;
              }
            }
            super.a(param0, param1, param2, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) (var5);
            stackOut_31_1 = new StringBuilder().append("dd.A(").append(param0).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L9;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L9;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final StringBuilder a(byte param0, Hashtable param1, int param2, StringBuilder param3) {
        StringBuilder discarded$26 = null;
        StringBuilder discarded$27 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_7_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_6_0 = null;
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
        try {
          L0: {
            L1: {
              if (param0 <= -23) {
                break L1;
              } else {
                dd.c((byte) 95);
                break L1;
              }
            }
            L2: {
              if (!this.a(9882, param3, param2, param1)) {
                break L2;
              } else {
                this.a(param2, (byte) -98, param1, param3);
                this.a(param3, param2, -19956, param1);
                discarded$26 = param3.append(" revert=").append(this.field_I);
                if ((this.field_E ^ -1) == -2147483648) {
                  break L2;
                } else {
                  if (2147483647 == this.field_G) {
                    break L2;
                  } else {
                    discarded$27 = param3.append(" to ").append(this.field_E).append(',').append(this.field_G);
                    break L2;
                  }
                }
              }
            }
            stackOut_6_0 = (StringBuilder) (param3);
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var5);
            stackOut_8_1 = new StringBuilder().append("dd.C(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param2).append(',');
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
          throw dd.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        return stackIn_7_0;
    }

    final static ui a(Throwable param0, String param1) {
        ui var2 = null;
        if (param0 instanceof ui) {
            var2 = (ui) ((Object) param0);
            var2.field_d = var2.field_d + ' ' + param1;
        } else {
            var2 = new ui(param0, param1);
        }
        return var2;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, boolean param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = 0;
        var17 = OrbDefence.field_D ? 1 : 0;
        if (param10) {
          field_D = (java.security.SecureRandom) null;
          if (param14 <= param6) {
            if (param6 < param5) {
              ke.a(param15, param7, param6, param13, param11, param8, param9, param4, param3, ul.field_b, param2, param12, param5, param0, param14, param1, 1551567504);
              return;
            } else {
              L0: {
                if (param14 < param5) {
                  ke.a(param7, param15, param5, param0, param3, param8, param9, param4, param11, ul.field_b, param2, param1, param6, param13, param14, param12, 1551567504);
                  if (var17 == 0) {
                    break L0;
                  } else {
                    ke.a(param15, param7, param6, param13, param11, param8, param9, param4, param3, ul.field_b, param2, param12, param5, param0, param14, param1, 1551567504);
                    return;
                  }
                } else {
                  ke.a(param9, param15, param14, param0, param3, param11, param7, param13, param8, ul.field_b, param12, param1, param6, param4, param5, param2, 1551567504);
                  if (var17 == 0) {
                    break L0;
                  } else {
                    ke.a(param7, param15, param5, param0, param3, param8, param9, param4, param11, ul.field_b, param2, param1, param6, param13, param14, param12, 1551567504);
                    ke.a(param15, param7, param6, param13, param11, param8, param9, param4, param3, ul.field_b, param2, param12, param5, param0, param14, param1, 1551567504);
                    return;
                  }
                }
              }
              return;
            }
          } else {
            if (param5 <= param14) {
              if (param5 <= param6) {
                ke.a(param15, param9, param6, param4, param8, param11, param7, param13, param3, ul.field_b, param12, param2, param14, param0, param5, param1, 1551567504);
                if (var17 != 0) {
                  if (param6 >= param5) {
                    if (param14 < param5) {
                      ke.a(param7, param15, param5, param0, param3, param8, param9, param4, param11, ul.field_b, param2, param1, param6, param13, param14, param12, 1551567504);
                      if (var17 == 0) {
                        return;
                      } else {
                        ke.a(param15, param7, param6, param13, param11, param8, param9, param4, param3, ul.field_b, param2, param12, param5, param0, param14, param1, 1551567504);
                        return;
                      }
                    } else {
                      ke.a(param9, param15, param14, param0, param3, param11, param7, param13, param8, ul.field_b, param12, param1, param6, param4, param5, param2, 1551567504);
                      if (var17 != 0) {
                        ke.a(param7, param15, param5, param0, param3, param8, param9, param4, param11, ul.field_b, param2, param1, param6, param13, param14, param12, 1551567504);
                        if (var17 == 0) {
                          return;
                        } else {
                          ke.a(param15, param7, param6, param13, param11, param8, param9, param4, param3, ul.field_b, param2, param12, param5, param0, param14, param1, 1551567504);
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  } else {
                    ke.a(param15, param7, param6, param13, param11, param8, param9, param4, param3, ul.field_b, param2, param12, param5, param0, param14, param1, 1551567504);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                ke.a(param7, param9, param5, param4, param8, param3, param15, param0, param11, ul.field_b, param1, param2, param14, param13, param6, param12, 1551567504);
                if (var17 != 0) {
                  ke.a(param15, param9, param6, param4, param8, param11, param7, param13, param3, ul.field_b, param12, param2, param14, param0, param5, param1, 1551567504);
                  if (var17 != 0) {
                    if (param6 >= param5) {
                      L1: {
                        if (param14 < param5) {
                          break L1;
                        } else {
                          ke.a(param9, param15, param14, param0, param3, param11, param7, param13, param8, ul.field_b, param12, param1, param6, param4, param5, param2, 1551567504);
                          break L1;
                        }
                      }
                      ke.a(param7, param15, param5, param0, param3, param8, param9, param4, param11, ul.field_b, param2, param1, param6, param13, param14, param12, 1551567504);
                      if (var17 == 0) {
                        return;
                      } else {
                        ke.a(param15, param7, param6, param13, param11, param8, param9, param4, param3, ul.field_b, param2, param12, param5, param0, param14, param1, 1551567504);
                        return;
                      }
                    } else {
                      ke.a(param15, param7, param6, param13, param11, param8, param9, param4, param3, ul.field_b, param2, param12, param5, param0, param14, param1, 1551567504);
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              ke.a(param9, param7, param14, param13, param11, param3, param15, param0, param8, ul.field_b, param1, param12, param5, param4, param6, param2, 1551567504);
              if (var17 == 0) {
                return;
              } else {
                L2: {
                  if (param5 <= param6) {
                    break L2;
                  } else {
                    ke.a(param7, param9, param5, param4, param8, param3, param15, param0, param11, ul.field_b, param1, param2, param14, param13, param6, param12, 1551567504);
                    break L2;
                  }
                }
                L3: {
                  ke.a(param15, param9, param6, param4, param8, param11, param7, param13, param3, ul.field_b, param12, param2, param14, param0, param5, param1, 1551567504);
                  if (var17 == 0) {
                    break L3;
                  } else {
                    L4: {
                      if (param6 < param5) {
                        break L4;
                      } else {
                        L5: {
                          if (param14 < param5) {
                            break L5;
                          } else {
                            ke.a(param9, param15, param14, param0, param3, param11, param7, param13, param8, ul.field_b, param12, param1, param6, param4, param5, param2, 1551567504);
                            break L5;
                          }
                        }
                        ke.a(param7, param15, param5, param0, param3, param8, param9, param4, param11, ul.field_b, param2, param1, param6, param13, param14, param12, 1551567504);
                        if (var17 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    ke.a(param15, param7, param6, param13, param11, param8, param9, param4, param3, ul.field_b, param2, param12, param5, param0, param14, param1, 1551567504);
                    break L3;
                  }
                }
                return;
              }
            }
          }
        } else {
          if (param14 <= param6) {
            if (param6 >= param5) {
              if (param14 < param5) {
                ke.a(param7, param15, param5, param0, param3, param8, param9, param4, param11, ul.field_b, param2, param1, param6, param13, param14, param12, 1551567504);
                if (var17 != 0) {
                  ke.a(param15, param7, param6, param13, param11, param8, param9, param4, param3, ul.field_b, param2, param12, param5, param0, param14, param1, 1551567504);
                  return;
                } else {
                  return;
                }
              } else {
                ke.a(param9, param15, param14, param0, param3, param11, param7, param13, param8, ul.field_b, param12, param1, param6, param4, param5, param2, 1551567504);
                if (var17 != 0) {
                  ke.a(param7, param15, param5, param0, param3, param8, param9, param4, param11, ul.field_b, param2, param1, param6, param13, param14, param12, 1551567504);
                  ke.a(param15, param7, param6, param13, param11, param8, param9, param4, param3, ul.field_b, param2, param12, param5, param0, param14, param1, 1551567504);
                  return;
                } else {
                  return;
                }
              }
            } else {
              ke.a(param15, param7, param6, param13, param11, param8, param9, param4, param3, ul.field_b, param2, param12, param5, param0, param14, param1, 1551567504);
              return;
            }
          } else {
            if (param5 <= param14) {
              if (param5 <= param6) {
                ke.a(param15, param9, param6, param4, param8, param11, param7, param13, param3, ul.field_b, param12, param2, param14, param0, param5, param1, 1551567504);
                if (var17 != 0) {
                  L6: {
                    L7: {
                      if (param6 < param5) {
                        break L7;
                      } else {
                        L8: {
                          if (param14 < param5) {
                            break L8;
                          } else {
                            ke.a(param9, param15, param14, param0, param3, param11, param7, param13, param8, ul.field_b, param12, param1, param6, param4, param5, param2, 1551567504);
                            break L8;
                          }
                        }
                        ke.a(param7, param15, param5, param0, param3, param8, param9, param4, param11, ul.field_b, param2, param1, param6, param13, param14, param12, 1551567504);
                        if (var17 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    ke.a(param15, param7, param6, param13, param11, param8, param9, param4, param3, ul.field_b, param2, param12, param5, param0, param14, param1, 1551567504);
                    break L6;
                  }
                  return;
                } else {
                  return;
                }
              } else {
                ke.a(param7, param9, param5, param4, param8, param3, param15, param0, param11, ul.field_b, param1, param2, param14, param13, param6, param12, 1551567504);
                if (var17 != 0) {
                  L9: {
                    L10: {
                      ke.a(param15, param9, param6, param4, param8, param11, param7, param13, param3, ul.field_b, param12, param2, param14, param0, param5, param1, 1551567504);
                      if (param6 < param5) {
                        break L10;
                      } else {
                        L11: {
                          if (param14 < param5) {
                            break L11;
                          } else {
                            ke.a(param9, param15, param14, param0, param3, param11, param7, param13, param8, ul.field_b, param12, param1, param6, param4, param5, param2, 1551567504);
                            break L11;
                          }
                        }
                        ke.a(param7, param15, param5, param0, param3, param8, param9, param4, param11, ul.field_b, param2, param1, param6, param13, param14, param12, 1551567504);
                        if (var17 == 0) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    ke.a(param15, param7, param6, param13, param11, param8, param9, param4, param3, ul.field_b, param2, param12, param5, param0, param14, param1, 1551567504);
                    break L9;
                  }
                  return;
                } else {
                  return;
                }
              }
            } else {
              ke.a(param9, param7, param14, param13, param11, param3, param15, param0, param8, ul.field_b, param1, param12, param5, param4, param6, param2, 1551567504);
              if (var17 != 0) {
                L12: {
                  if (param5 <= param6) {
                    break L12;
                  } else {
                    ke.a(param7, param9, param5, param4, param8, param3, param15, param0, param11, ul.field_b, param1, param2, param14, param13, param6, param12, 1551567504);
                    break L12;
                  }
                }
                L13: {
                  ke.a(param15, param9, param6, param4, param8, param11, param7, param13, param3, ul.field_b, param12, param2, param14, param0, param5, param1, 1551567504);
                  if (var17 == 0) {
                    break L13;
                  } else {
                    L14: {
                      if (param6 < param5) {
                        break L14;
                      } else {
                        L15: {
                          if (param14 < param5) {
                            break L15;
                          } else {
                            ke.a(param9, param15, param14, param0, param3, param11, param7, param13, param8, ul.field_b, param12, param1, param6, param4, param5, param2, 1551567504);
                            break L15;
                          }
                        }
                        ke.a(param7, param15, param5, param0, param3, param8, param9, param4, param11, ul.field_b, param2, param1, param6, param13, param14, param12, 1551567504);
                        if (var17 == 0) {
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    ke.a(param15, param7, param6, param13, param11, param8, param9, param4, param3, ul.field_b, param2, param12, param5, param0, param14, param1, 1551567504);
                    break L13;
                  }
                }
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    final boolean a(byte param0, pj param1, int param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        pj var9 = null;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_6_0 = 0;
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
            L1: {
              if (param0 <= -115) {
                break L1;
              } else {
                var9 = (pj) null;
                this.a((byte) 38, (pj) null, 56, -20);
                break L1;
              }
            }
            L2: {
              var8_int = super.a((byte) -124, param1, param2, param3, param4, param5, param6) ? 1 : 0;
              if (var8_int == 0) {
                break L2;
              } else {
                if (this.field_H) {
                  stackOut_12_0 = 1;
                  stackIn_13_0 = stackOut_12_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            if (this.a((byte) 3, param5, param4, param6, param3)) {
              this.field_v = param2;
              if (1 != param2) {
                stackOut_10_0 = 1;
                stackIn_11_0 = stackOut_10_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                this.field_C = -param3 + (-this.field_s + param5);
                this.field_F = -param6 + param4 - this.field_n;
                al.field_c = (dd) (this);
                return true;
              }
            } else {
              stackOut_6_0 = var8_int;
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var8);
            stackOut_14_1 = new StringBuilder().append("dd.F(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            return stackIn_13_0 != 0;
          }
        }
    }

    private dd(int param0, int param1, int param2, int param3, td param4, ag param5, pj param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_G = 2147483647;
        this.field_E = 2147483647;
        try {
            this.field_H = param8 ? true : false;
            this.field_I = param7 ? true : false;
            this.field_y = param6;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "dd.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void b(byte param0) {
        super.b((byte) -116);
        this.field_y.a(0, 0, this.field_r, (byte) -90, this.field_m);
        this.field_E = this.field_s;
        this.field_G = this.field_n;
        int var2 = -53 % ((55 - param0) / 49);
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        var3 = param1 >>> -670469025;
        if (param0 != -1) {
          return -63;
        } else {
          return (param1 - -var3) / param2 + -var3;
        }
    }

    public static void c(byte param0) {
        field_D = null;
        field_B = null;
        if (param0 >= -102) {
            return;
        }
        field_A = null;
    }

    static {
    }
}
