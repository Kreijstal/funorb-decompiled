/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class se extends wn {
    private int field_F;
    private boolean field_N;
    static kc field_H;
    static int field_I;
    static char field_E;
    private boolean field_K;
    static String field_J;
    private int field_M;
    private int field_G;
    static String field_L;
    private int field_O;

    final static void a(byte param0, String param1) {
        System.out.println("Error: " + si.a(param1, "%0a", "\n", (byte) 100));
        int var2 = -71 / ((param0 - -53) / 57);
    }

    final static dk a(int param0, java.awt.Component param1, int param2, byte param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            RuntimeException var4_ref2 = null;
            dk var5 = null;
            ga var5_ref = null;
            dk stackIn_3_0 = null;
            ga stackIn_5_0 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            dk stackOut_2_0 = null;
            ga stackOut_4_0 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var4 = Class.forName("sh");
                      var5 = (dk) (var4.newInstance());
                      var5.a(param2, param1, param3 ^ -123, param0);
                      if (param3 == -123) {
                        break L2;
                      } else {
                        field_E = 'ﾣ';
                        break L2;
                      }
                    }
                    stackOut_2_0 = (dk) (var5);
                    stackIn_3_0 = stackOut_2_0;
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4_ref = decompiledCaughtException;
                  var5_ref = new ga();
                  ((dk) ((Object) var5_ref)).a(param2, param1, 0, param0);
                  stackOut_4_0 = (ga) (var5_ref);
                  stackIn_5_0 = stackOut_4_0;
                  return (dk) ((Object) stackIn_5_0);
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) (var4_ref2);
                stackOut_6_1 = new StringBuilder().append("se.F(").append(param0).append(',');
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param1 == null) {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L3;
                } else {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L3;
                }
              }
              throw aa.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(qm param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (!(this.field_B instanceof ag)) {
                    break L3;
                  } else {
                    if (!((ag) ((Object) this.field_B)).field_B) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if ((this.field_t ^ -1) == -2) {
                  L4: {
                    var5_int = an.field_g - this.field_F + -param1;
                    var6 = -param3 + me.field_I + -this.field_O;
                    if (var5_int != this.field_n) {
                      break L4;
                    } else {
                      if (this.field_j == var6) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  this.field_j = var6;
                  this.field_n = var5_int;
                  if (!(this.field_o instanceof il)) {
                    break L1;
                  } else {
                    ((il) ((Object) this.field_o)).a((se) (this), param1, 20172, param3);
                    break L1;
                  }
                } else {
                  break L2;
                }
              }
              if (!this.field_K) {
                break L1;
              } else {
                L5: {
                  if (this.field_n == this.field_M) {
                    break L5;
                  } else {
                    L6: {
                      var5_int = this.field_M - this.field_n;
                      stackOut_7_0 = this;
                      stackOut_7_1 = this.field_n;
                      stackIn_11_0 = stackOut_7_0;
                      stackIn_11_1 = stackOut_7_1;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      if (Math.abs(var5_int) > 2) {
                        stackOut_11_0 = this;
                        stackOut_11_1 = stackIn_11_1;
                        stackOut_11_2 = var5_int >> -1795271295;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        stackIn_12_2 = stackOut_11_2;
                        break L6;
                      } else {
                        stackOut_8_0 = this;
                        stackOut_8_1 = stackIn_8_1;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (-1 <= (var5_int ^ -1)) {
                          stackOut_10_0 = this;
                          stackOut_10_1 = stackIn_10_1;
                          stackOut_10_2 = -1;
                          stackIn_12_0 = stackOut_10_0;
                          stackIn_12_1 = stackOut_10_1;
                          stackIn_12_2 = stackOut_10_2;
                          break L6;
                        } else {
                          stackOut_9_0 = this;
                          stackOut_9_1 = stackIn_9_1;
                          stackOut_9_2 = 1;
                          stackIn_12_0 = stackOut_9_0;
                          stackIn_12_1 = stackOut_9_1;
                          stackIn_12_2 = stackOut_9_2;
                          break L6;
                        }
                      }
                    }
                    ((se) (this)).field_n = stackIn_12_1 + stackIn_12_2;
                    break L5;
                  }
                }
                if (this.field_G == this.field_j) {
                  break L1;
                } else {
                  L7: {
                    var5_int = this.field_G - this.field_j;
                    stackOut_14_0 = this;
                    stackOut_14_1 = this.field_j;
                    stackIn_18_0 = stackOut_14_0;
                    stackIn_18_1 = stackOut_14_1;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    if ((Math.abs(var5_int) ^ -1) < -3) {
                      stackOut_18_0 = this;
                      stackOut_18_1 = stackIn_18_1;
                      stackOut_18_2 = var5_int >> -2088377183;
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      stackIn_19_2 = stackOut_18_2;
                      break L7;
                    } else {
                      stackOut_15_0 = this;
                      stackOut_15_1 = stackIn_15_1;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_17_1 = stackOut_15_1;
                      stackIn_16_0 = stackOut_15_0;
                      stackIn_16_1 = stackOut_15_1;
                      if (0 >= var5_int) {
                        stackOut_17_0 = this;
                        stackOut_17_1 = stackIn_17_1;
                        stackOut_17_2 = -1;
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_19_1 = stackOut_17_1;
                        stackIn_19_2 = stackOut_17_2;
                        break L7;
                      } else {
                        stackOut_16_0 = this;
                        stackOut_16_1 = stackIn_16_1;
                        stackOut_16_2 = 1;
                        stackIn_19_0 = stackOut_16_0;
                        stackIn_19_1 = stackOut_16_1;
                        stackIn_19_2 = stackOut_16_2;
                        break L7;
                      }
                    }
                  }
                  ((se) (this)).field_j = stackIn_19_1 + stackIn_19_2;
                  break L1;
                }
              }
            }
            super.a(param0, param1, param2, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) (var5);
            stackOut_27_1 = new StringBuilder().append("se.E(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L8;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, int param1, qm param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_4_0 = 0;
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
            L1: {
              var9 = 120 % ((param4 - -42) / 35);
              var8_int = super.a(param0, param1, param2, param3, 40, param5, param6) ? 1 : 0;
              if (var8_int == 0) {
                break L1;
              } else {
                if (this.field_N) {
                  stackOut_10_0 = 1;
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (this.a((byte) -47, param3, param0, param6, param5)) {
              this.field_t = param1;
              if (-2 != (param1 ^ -1)) {
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                so.field_i = (se) (this);
                this.field_O = -this.field_j + param0 - param3;
                this.field_F = -param6 + (param5 - this.field_n);
                return true;
              }
            } else {
              stackOut_4_0 = var8_int;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var8);
            stackOut_12_1 = new StringBuilder().append("se.DA(").append(param0).append(',').append(param1).append(',');
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
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_11_0 != 0;
          }
        }
    }

    final static void a(byte param0, int param1, int param2) {
        L0: {
          L1: {
            if (co.field_e == null) {
              break L1;
            } else {
              if (param1 > co.field_e.length) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          co.field_e = new int[param1 * 2];
          break L0;
        }
        if (nf.field_z != null) {
          if (nf.field_z.length >= param1) {
            L2: {
              L3: {
                if (null == hc.field_e) {
                  break L3;
                } else {
                  if (param1 > hc.field_e.length) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              hc.field_e = new int[2 * param1];
              break L2;
            }
            L4: {
              L5: {
                if (tj.field_u == null) {
                  break L5;
                } else {
                  if (param1 > tj.field_u.length) {
                    break L5;
                  } else {
                    break L4;
                  }
                }
              }
              tj.field_u = new int[param1 * 2];
              break L4;
            }
            if (ba.field_o == null) {
              L6: {
                L7: {
                  ba.field_o = new int[2 * param1];
                  if (lm.field_i == null) {
                    break L7;
                  } else {
                    if (param1 > lm.field_i.length) {
                      break L7;
                    } else {
                      break L6;
                    }
                  }
                }
                lm.field_i = new int[2 * param1];
                break L6;
              }
              if (param0 <= -10) {
                if (ki.field_r != null) {
                  if (param1 - -param2 > ki.field_r.length) {
                    L8: {
                      L9: {
                        ki.field_r = new int[2 * (param1 - -param2)];
                        if (wh.field_e == null) {
                          break L9;
                        } else {
                          if (wh.field_e.length < param1) {
                            break L9;
                          } else {
                            break L8;
                          }
                        }
                      }
                      wh.field_e = new boolean[2 * param1];
                      break L8;
                    }
                    je.field_b = 0;
                    qa.field_m = -2147483648;
                    tm.field_g = -2147483648;
                    ld.field_m = 2147483647;
                    ao.field_g = 2147483647;
                    return;
                  } else {
                    L10: {
                      L11: {
                        if (wh.field_e == null) {
                          break L11;
                        } else {
                          if (wh.field_e.length < param1) {
                            break L11;
                          } else {
                            break L10;
                          }
                        }
                      }
                      wh.field_e = new boolean[2 * param1];
                      break L10;
                    }
                    je.field_b = 0;
                    qa.field_m = -2147483648;
                    tm.field_g = -2147483648;
                    ld.field_m = 2147483647;
                    ao.field_g = 2147483647;
                    return;
                  }
                } else {
                  L12: {
                    L13: {
                      ki.field_r = new int[2 * (param1 - -param2)];
                      if (wh.field_e == null) {
                        break L13;
                      } else {
                        if (wh.field_e.length < param1) {
                          break L13;
                        } else {
                          break L12;
                        }
                      }
                    }
                    wh.field_e = new boolean[2 * param1];
                    break L12;
                  }
                  je.field_b = 0;
                  qa.field_m = -2147483648;
                  tm.field_g = -2147483648;
                  ld.field_m = 2147483647;
                  ao.field_g = 2147483647;
                  return;
                }
              } else {
                L14: {
                  L15: {
                    field_E = '_';
                    if (ki.field_r == null) {
                      break L15;
                    } else {
                      if (param1 - -param2 <= ki.field_r.length) {
                        break L14;
                      } else {
                        break L15;
                      }
                    }
                  }
                  ki.field_r = new int[2 * (param1 - -param2)];
                  break L14;
                }
                L16: {
                  L17: {
                    if (wh.field_e == null) {
                      break L17;
                    } else {
                      if (wh.field_e.length < param1) {
                        break L17;
                      } else {
                        break L16;
                      }
                    }
                  }
                  wh.field_e = new boolean[2 * param1];
                  break L16;
                }
                je.field_b = 0;
                qa.field_m = -2147483648;
                tm.field_g = -2147483648;
                ld.field_m = 2147483647;
                ao.field_g = 2147483647;
                return;
              }
            } else {
              if (param1 <= ba.field_o.length) {
                L18: {
                  L19: {
                    if (lm.field_i == null) {
                      break L19;
                    } else {
                      if (param1 > lm.field_i.length) {
                        break L19;
                      } else {
                        break L18;
                      }
                    }
                  }
                  lm.field_i = new int[2 * param1];
                  break L18;
                }
                if (param0 <= -10) {
                  if (ki.field_r != null) {
                    if (param1 - -param2 > ki.field_r.length) {
                      L20: {
                        L21: {
                          ki.field_r = new int[2 * (param1 - -param2)];
                          if (wh.field_e == null) {
                            break L21;
                          } else {
                            if (wh.field_e.length < param1) {
                              break L21;
                            } else {
                              break L20;
                            }
                          }
                        }
                        wh.field_e = new boolean[2 * param1];
                        break L20;
                      }
                      je.field_b = 0;
                      qa.field_m = -2147483648;
                      tm.field_g = -2147483648;
                      ld.field_m = 2147483647;
                      ao.field_g = 2147483647;
                      return;
                    } else {
                      L22: {
                        L23: {
                          if (wh.field_e == null) {
                            break L23;
                          } else {
                            if (wh.field_e.length < param1) {
                              break L23;
                            } else {
                              break L22;
                            }
                          }
                        }
                        wh.field_e = new boolean[2 * param1];
                        break L22;
                      }
                      je.field_b = 0;
                      qa.field_m = -2147483648;
                      tm.field_g = -2147483648;
                      ld.field_m = 2147483647;
                      ao.field_g = 2147483647;
                      return;
                    }
                  } else {
                    L24: {
                      L25: {
                        ki.field_r = new int[2 * (param1 - -param2)];
                        if (wh.field_e == null) {
                          break L25;
                        } else {
                          if (wh.field_e.length < param1) {
                            break L25;
                          } else {
                            break L24;
                          }
                        }
                      }
                      wh.field_e = new boolean[2 * param1];
                      break L24;
                    }
                    je.field_b = 0;
                    qa.field_m = -2147483648;
                    tm.field_g = -2147483648;
                    ld.field_m = 2147483647;
                    ao.field_g = 2147483647;
                    return;
                  }
                } else {
                  field_E = '_';
                  if (ki.field_r != null) {
                    if (param1 - -param2 > ki.field_r.length) {
                      L26: {
                        L27: {
                          ki.field_r = new int[2 * (param1 - -param2)];
                          if (wh.field_e == null) {
                            break L27;
                          } else {
                            if (wh.field_e.length < param1) {
                              break L27;
                            } else {
                              break L26;
                            }
                          }
                        }
                        wh.field_e = new boolean[2 * param1];
                        break L26;
                      }
                      je.field_b = 0;
                      qa.field_m = -2147483648;
                      tm.field_g = -2147483648;
                      ld.field_m = 2147483647;
                      ao.field_g = 2147483647;
                      return;
                    } else {
                      L28: {
                        L29: {
                          if (wh.field_e == null) {
                            break L29;
                          } else {
                            if (wh.field_e.length < param1) {
                              break L29;
                            } else {
                              break L28;
                            }
                          }
                        }
                        wh.field_e = new boolean[2 * param1];
                        break L28;
                      }
                      je.field_b = 0;
                      qa.field_m = -2147483648;
                      tm.field_g = -2147483648;
                      ld.field_m = 2147483647;
                      ao.field_g = 2147483647;
                      return;
                    }
                  } else {
                    L30: {
                      L31: {
                        ki.field_r = new int[2 * (param1 - -param2)];
                        if (wh.field_e == null) {
                          break L31;
                        } else {
                          if (wh.field_e.length < param1) {
                            break L31;
                          } else {
                            break L30;
                          }
                        }
                      }
                      wh.field_e = new boolean[2 * param1];
                      break L30;
                    }
                    je.field_b = 0;
                    qa.field_m = -2147483648;
                    tm.field_g = -2147483648;
                    ld.field_m = 2147483647;
                    ao.field_g = 2147483647;
                    return;
                  }
                }
              } else {
                L32: {
                  L33: {
                    ba.field_o = new int[2 * param1];
                    if (lm.field_i == null) {
                      break L33;
                    } else {
                      if (param1 > lm.field_i.length) {
                        break L33;
                      } else {
                        break L32;
                      }
                    }
                  }
                  lm.field_i = new int[2 * param1];
                  break L32;
                }
                L34: {
                  if (param0 <= -10) {
                    break L34;
                  } else {
                    field_E = '_';
                    break L34;
                  }
                }
                if (ki.field_r != null) {
                  if (param1 - -param2 > ki.field_r.length) {
                    L35: {
                      L36: {
                        ki.field_r = new int[2 * (param1 - -param2)];
                        if (wh.field_e == null) {
                          break L36;
                        } else {
                          if (wh.field_e.length < param1) {
                            break L36;
                          } else {
                            break L35;
                          }
                        }
                      }
                      wh.field_e = new boolean[2 * param1];
                      break L35;
                    }
                    je.field_b = 0;
                    qa.field_m = -2147483648;
                    tm.field_g = -2147483648;
                    ld.field_m = 2147483647;
                    ao.field_g = 2147483647;
                    return;
                  } else {
                    L37: {
                      L38: {
                        if (wh.field_e == null) {
                          break L38;
                        } else {
                          if (wh.field_e.length < param1) {
                            break L38;
                          } else {
                            break L37;
                          }
                        }
                      }
                      wh.field_e = new boolean[2 * param1];
                      break L37;
                    }
                    je.field_b = 0;
                    qa.field_m = -2147483648;
                    tm.field_g = -2147483648;
                    ld.field_m = 2147483647;
                    ao.field_g = 2147483647;
                    return;
                  }
                } else {
                  L39: {
                    L40: {
                      ki.field_r = new int[2 * (param1 - -param2)];
                      if (wh.field_e == null) {
                        break L40;
                      } else {
                        if (wh.field_e.length < param1) {
                          break L40;
                        } else {
                          break L39;
                        }
                      }
                    }
                    wh.field_e = new boolean[2 * param1];
                    break L39;
                  }
                  je.field_b = 0;
                  qa.field_m = -2147483648;
                  tm.field_g = -2147483648;
                  ld.field_m = 2147483647;
                  ao.field_g = 2147483647;
                  return;
                }
              }
            }
          } else {
            nf.field_z = new int[param1 * 2];
            if (null == hc.field_e) {
              L41: {
                L42: {
                  hc.field_e = new int[2 * param1];
                  if (tj.field_u == null) {
                    break L42;
                  } else {
                    if (param1 > tj.field_u.length) {
                      break L42;
                    } else {
                      break L41;
                    }
                  }
                }
                tj.field_u = new int[param1 * 2];
                break L41;
              }
              L43: {
                L44: {
                  if (ba.field_o == null) {
                    break L44;
                  } else {
                    if (param1 <= ba.field_o.length) {
                      break L43;
                    } else {
                      break L44;
                    }
                  }
                }
                ba.field_o = new int[2 * param1];
                break L43;
              }
              L45: {
                L46: {
                  if (lm.field_i == null) {
                    break L46;
                  } else {
                    if (param1 > lm.field_i.length) {
                      break L46;
                    } else {
                      break L45;
                    }
                  }
                }
                lm.field_i = new int[2 * param1];
                break L45;
              }
              L47: {
                if (param0 <= -10) {
                  break L47;
                } else {
                  field_E = '_';
                  break L47;
                }
              }
              L48: {
                L49: {
                  if (ki.field_r == null) {
                    break L49;
                  } else {
                    if (param1 - -param2 <= ki.field_r.length) {
                      break L48;
                    } else {
                      break L49;
                    }
                  }
                }
                ki.field_r = new int[2 * (param1 - -param2)];
                break L48;
              }
              L50: {
                L51: {
                  if (wh.field_e == null) {
                    break L51;
                  } else {
                    if (wh.field_e.length < param1) {
                      break L51;
                    } else {
                      break L50;
                    }
                  }
                }
                wh.field_e = new boolean[2 * param1];
                break L50;
              }
              je.field_b = 0;
              qa.field_m = -2147483648;
              tm.field_g = -2147483648;
              ld.field_m = 2147483647;
              ao.field_g = 2147483647;
              return;
            } else {
              L52: {
                if (param1 > hc.field_e.length) {
                  hc.field_e = new int[2 * param1];
                  break L52;
                } else {
                  break L52;
                }
              }
              L53: {
                L54: {
                  if (tj.field_u == null) {
                    break L54;
                  } else {
                    if (param1 > tj.field_u.length) {
                      break L54;
                    } else {
                      break L53;
                    }
                  }
                }
                tj.field_u = new int[param1 * 2];
                break L53;
              }
              L55: {
                L56: {
                  if (ba.field_o == null) {
                    break L56;
                  } else {
                    if (param1 <= ba.field_o.length) {
                      break L55;
                    } else {
                      break L56;
                    }
                  }
                }
                ba.field_o = new int[2 * param1];
                break L55;
              }
              L57: {
                L58: {
                  if (lm.field_i == null) {
                    break L58;
                  } else {
                    if (param1 > lm.field_i.length) {
                      break L58;
                    } else {
                      break L57;
                    }
                  }
                }
                lm.field_i = new int[2 * param1];
                break L57;
              }
              L59: {
                if (param0 <= -10) {
                  break L59;
                } else {
                  field_E = '_';
                  break L59;
                }
              }
              L60: {
                L61: {
                  if (ki.field_r == null) {
                    break L61;
                  } else {
                    if (param1 - -param2 <= ki.field_r.length) {
                      break L60;
                    } else {
                      break L61;
                    }
                  }
                }
                ki.field_r = new int[2 * (param1 - -param2)];
                break L60;
              }
              L62: {
                L63: {
                  if (wh.field_e == null) {
                    break L63;
                  } else {
                    if (wh.field_e.length < param1) {
                      break L63;
                    } else {
                      break L62;
                    }
                  }
                }
                wh.field_e = new boolean[2 * param1];
                break L62;
              }
              je.field_b = 0;
              qa.field_m = -2147483648;
              tm.field_g = -2147483648;
              ld.field_m = 2147483647;
              ao.field_g = 2147483647;
              return;
            }
          }
        } else {
          L64: {
            L65: {
              nf.field_z = new int[param1 * 2];
              if (null == hc.field_e) {
                break L65;
              } else {
                if (param1 > hc.field_e.length) {
                  break L65;
                } else {
                  break L64;
                }
              }
            }
            hc.field_e = new int[2 * param1];
            break L64;
          }
          L66: {
            L67: {
              if (tj.field_u == null) {
                break L67;
              } else {
                if (param1 > tj.field_u.length) {
                  break L67;
                } else {
                  break L66;
                }
              }
            }
            tj.field_u = new int[param1 * 2];
            break L66;
          }
          L68: {
            L69: {
              if (ba.field_o == null) {
                break L69;
              } else {
                if (param1 <= ba.field_o.length) {
                  break L68;
                } else {
                  break L69;
                }
              }
            }
            ba.field_o = new int[2 * param1];
            break L68;
          }
          L70: {
            L71: {
              if (lm.field_i == null) {
                break L71;
              } else {
                if (param1 > lm.field_i.length) {
                  break L71;
                } else {
                  break L70;
                }
              }
            }
            lm.field_i = new int[2 * param1];
            break L70;
          }
          L72: {
            if (param0 <= -10) {
              break L72;
            } else {
              field_E = '_';
              break L72;
            }
          }
          L73: {
            L74: {
              if (ki.field_r == null) {
                break L74;
              } else {
                if (param1 - -param2 <= ki.field_r.length) {
                  break L73;
                } else {
                  break L74;
                }
              }
            }
            ki.field_r = new int[2 * (param1 - -param2)];
            break L73;
          }
          L75: {
            L76: {
              if (wh.field_e == null) {
                break L76;
              } else {
                if (wh.field_e.length < param1) {
                  break L76;
                } else {
                  break L75;
                }
              }
            }
            wh.field_e = new boolean[2 * param1];
            break L75;
          }
          je.field_b = 0;
          qa.field_m = -2147483648;
          tm.field_g = -2147483648;
          ld.field_m = 2147483647;
          ao.field_g = 2147483647;
          return;
        }
    }

    public static void f(int param0) {
        if (param0 >= -88) {
          field_L = (String) null;
          field_H = null;
          field_J = null;
          field_L = null;
          return;
        } else {
          field_H = null;
          field_J = null;
          field_L = null;
          return;
        }
    }

    final void a(byte param0) {
        super.a(param0);
        this.field_B.a(this.field_k, 0, this.field_v, 0, -90);
        this.field_M = this.field_n;
        this.field_G = this.field_j;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, qm param5) {
        try {
            super.a(param0, param1, param2, param3, param4, param5);
            this.field_t = 0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "se.IA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    se(int param0, int param1, int param2, int param3, pf param4, wc param5, qm param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_M = 2147483647;
        this.field_G = 2147483647;
        try {
            this.field_K = param7 ? true : false;
            this.field_N = param8 ? true : false;
            this.field_B = param6;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "se.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final StringBuilder a(StringBuilder param0, int param1, Hashtable param2, byte param3) {
        StringBuilder discarded$26 = null;
        StringBuilder discarded$27 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
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
              if (!this.a(param0, (byte) -90, param2, param1)) {
                break L1;
              } else {
                this.a(param0, param1, param2, 1);
                this.a(0, param2, param0, param1);
                discarded$26 = param0.append(" revert=").append(this.field_K);
                if (2147483647 == this.field_M) {
                  break L1;
                } else {
                  if (this.field_G != 2147483647) {
                    discarded$27 = param0.append(" to ").append(this.field_M).append(',').append(this.field_G);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            var5_int = -77 % ((50 - param3) / 60);
            stackOut_5_0 = (StringBuilder) (param0);
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var5);
            stackOut_7_1 = new StringBuilder().append("se.FA(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
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
          throw aa.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    static {
        field_I = -1;
        field_E = '/';
        field_L = "Accept <%0> into this game";
        field_J = "Main Menu";
    }
}
