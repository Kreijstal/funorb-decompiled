/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bf {
    static int field_e;
    static String field_m;
    static String field_i;
    static int field_a;
    o field_k;
    private int field_g;
    private boolean field_c;
    private int field_l;
    private int field_d;
    o[] field_j;
    static sh[] field_b;
    private int field_h;
    private int field_n;
    static oc field_f;

    public static void a(byte param0) {
        field_m = null;
        field_i = null;
        field_b = null;
        field_f = null;
    }

    final bf a(int param0, boolean param1) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (param0 != 0) {
          L0: {
            bf discarded$13 = ((bf) this).d(-88, 84);
            stackOut_5_0 = this;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param1) {
              stackOut_7_0 = this;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = this;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          ((bf) this).field_c = stackIn_8_1 != 0;
          return (bf) this;
        } else {
          L1: {
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param1) {
              stackOut_3_0 = this;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = this;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          ((bf) this).field_c = stackIn_4_1 != 0;
          return (bf) this;
        }
    }

    final bf b(int param0, int param1) {
        int var3 = 105 % ((param1 - -18) / 45);
        ((bf) this).field_l = param0;
        return (bf) this;
    }

    final static boolean c(int param0, int param1) {
        try {
            int var2_int = 0;
            IOException var2 = null;
            int stackIn_13_0 = 0;
            int stackIn_15_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_14_0 = 0;
            int stackOut_12_0 = 0;
            if (te.field_N.field_m < param1) {
              if (lf.field_d == null) {
                return false;
              } else {
                try {
                  L0: {
                    L1: {
                      if (param0 >= 35) {
                        break L1;
                      } else {
                        boolean discarded$2 = bf.c(-65, -12);
                        break L1;
                      }
                    }
                    var2_int = lf.field_d.b(-30119);
                    if (var2_int <= 0) {
                      if (0 > var2_int) {
                        je.a(false);
                        return false;
                      } else {
                        if (30000L >= dh.b(-1)) {
                          break L0;
                        } else {
                          je.a(false);
                          return false;
                        }
                      }
                    } else {
                      L2: {
                        if (param1 + -te.field_N.field_m < var2_int) {
                          var2_int = param1 - te.field_N.field_m;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      lf.field_d.a((byte) 59, te.field_N.field_m, var2_int, te.field_N.field_l);
                      md.field_y = je.a(1);
                      te.field_N.field_m = te.field_N.field_m + var2_int;
                      if (te.field_N.field_m >= param1) {
                        te.field_N.field_m = 0;
                        stackOut_14_0 = 1;
                        stackIn_15_0 = stackOut_14_0;
                        return stackIn_15_0 != 0;
                      } else {
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        return stackIn_13_0 != 0;
                      }
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = (IOException) (Object) decompiledCaughtException;
                  je.a(false);
                  return false;
                }
                return false;
              }
            } else {
              return true;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(bf param0, int param1, rc param2, int param3, int param4, ql param5) {
        RuntimeException var7 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          L0: {
            L1: {
              if (((bf) this).field_c) {
                param0.a(90, param4, param1, param5, param2);
                param0.a(36);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (null == ((bf) this).field_k) {
                break L2;
              } else {
                param0.field_k = ((bf) this).field_k;
                break L2;
              }
            }
            L3: {
              if (((bf) this).field_l == -2147483648) {
                break L3;
              } else {
                param0.field_l = ((bf) this).field_l;
                break L3;
              }
            }
            L4: {
              if (-1 > ((bf) this).field_d) {
                break L4;
              } else {
                param0.field_d = ((bf) this).field_d;
                break L4;
              }
            }
            L5: {
              if (param3 == ((bf) this).field_g) {
                break L5;
              } else {
                param0.field_g = ((bf) this).field_g;
                break L5;
              }
            }
            L6: {
              if (((bf) this).field_n < -1) {
                break L6;
              } else {
                param0.field_n = ((bf) this).field_n;
                break L6;
              }
            }
            L7: {
              if (((bf) this).field_h != -2147483648) {
                param0.field_h = ((bf) this).field_h;
                break L7;
              } else {
                break L7;
              }
            }
            if (((bf) this).field_j == null) {
              break L0;
            } else {
              param0.field_j = ((bf) this).field_j;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var7;
            stackOut_19_1 = new StringBuilder().append("bf.C(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          L9: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44).append(param1).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          L10: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param5 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L10;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L10;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 41);
        }
    }

    final bf a(int param0, int param1) {
        ((bf) this).field_n = param0;
        if (param1 != 256) {
            ((bf) this).a(-114);
            return (bf) this;
        }
        return (bf) this;
    }

    final static int b(byte param0) {
        return -pk.field_ab + dh.field_h;
    }

    final bf d(int param0, int param1) {
        ((bf) this).field_d = param1;
        if (param0 > -114) {
            Object var4 = null;
            ((bf) this).a((bf) null, 56);
            return (bf) this;
        }
        return (bf) this;
    }

    final void a(int param0, int param1, int param2, ql param3, rc param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        String var6_ref = null;
        int var7 = 0;
        mg stackIn_17_0 = null;
        String stackIn_17_1 = null;
        mg stackIn_18_0 = null;
        String stackIn_18_1 = null;
        mg stackIn_19_0 = null;
        String stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        mg stackIn_20_0 = null;
        String stackIn_20_1 = null;
        int stackIn_20_2 = 0;
        int stackIn_20_3 = 0;
        int stackIn_20_4 = 0;
        mg stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        int stackIn_21_3 = 0;
        int stackIn_21_4 = 0;
        mg stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        int stackIn_22_4 = 0;
        int stackIn_22_5 = 0;
        mg stackIn_23_0 = null;
        String stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        int stackIn_23_4 = 0;
        int stackIn_23_5 = 0;
        int stackIn_23_6 = 0;
        int stackIn_23_7 = 0;
        mg stackIn_24_0 = null;
        String stackIn_24_1 = null;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        int stackIn_24_4 = 0;
        int stackIn_24_5 = 0;
        int stackIn_24_6 = 0;
        int stackIn_24_7 = 0;
        mg stackIn_25_0 = null;
        String stackIn_25_1 = null;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_25_4 = 0;
        int stackIn_25_5 = 0;
        int stackIn_25_6 = 0;
        int stackIn_25_7 = 0;
        int stackIn_25_8 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        mg stackOut_16_0 = null;
        String stackOut_16_1 = null;
        mg stackOut_18_0 = null;
        String stackOut_18_1 = null;
        int stackOut_18_2 = 0;
        mg stackOut_17_0 = null;
        String stackOut_17_1 = null;
        int stackOut_17_2 = 0;
        mg stackOut_19_0 = null;
        String stackOut_19_1 = null;
        int stackOut_19_2 = 0;
        int stackOut_19_3 = 0;
        int stackOut_19_4 = 0;
        mg stackOut_21_0 = null;
        String stackOut_21_1 = null;
        int stackOut_21_2 = 0;
        int stackOut_21_3 = 0;
        int stackOut_21_4 = 0;
        int stackOut_21_5 = 0;
        mg stackOut_20_0 = null;
        String stackOut_20_1 = null;
        int stackOut_20_2 = 0;
        int stackOut_20_3 = 0;
        int stackOut_20_4 = 0;
        int stackOut_20_5 = 0;
        mg stackOut_22_0 = null;
        String stackOut_22_1 = null;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        int stackOut_22_4 = 0;
        int stackOut_22_5 = 0;
        int stackOut_22_6 = 0;
        int stackOut_22_7 = 0;
        mg stackOut_24_0 = null;
        String stackOut_24_1 = null;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        int stackOut_24_4 = 0;
        int stackOut_24_5 = 0;
        int stackOut_24_6 = 0;
        int stackOut_24_7 = 0;
        int stackOut_24_8 = 0;
        mg stackOut_23_0 = null;
        String stackOut_23_1 = null;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        int stackOut_23_4 = 0;
        int stackOut_23_5 = 0;
        int stackOut_23_6 = 0;
        int stackOut_23_7 = 0;
        int stackOut_23_8 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        try {
          L0: {
            L1: {
              uj.a(param4.field_t, param4.field_x, param2 + param4.field_m, ((bf) this).field_j, param1 - -param4.field_j, 2);
              if (null != ((bf) this).field_k) {
                L2: {
                  var6_int = param2 + (param4.field_m + ((bf) this).field_l);
                  if (1 != param3.field_g) {
                    break L2;
                  } else {
                    var6_int = var6_int + (param4.field_t - ((bf) this).field_k.field_q) / 2;
                    break L2;
                  }
                }
                L3: {
                  var7 = param1 - (-param4.field_j + -((bf) this).field_h);
                  if (param3.field_b == 1) {
                    var7 = var7 + (-((bf) this).field_k.field_r + param4.field_x) / 2;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (2 != param3.field_g) {
                    break L4;
                  } else {
                    var6_int = var6_int + (param4.field_t - ((bf) this).field_k.field_q);
                    break L4;
                  }
                }
                L5: {
                  if (2 != param3.field_b) {
                    break L5;
                  } else {
                    var7 = var7 + (param4.field_x - ((bf) this).field_k.field_r);
                    break L5;
                  }
                }
                ((bf) this).field_k.d(var6_int, var7);
                break L1;
              } else {
                break L1;
              }
            }
            L6: {
              var6_ref = param3.b(param4, 0);
              if (var6_ref == null) {
                break L6;
              } else {
                if (param3.field_l == null) {
                  break L6;
                } else {
                  if (((bf) this).field_d >= 0) {
                    L7: {
                      stackOut_16_0 = param3.field_l;
                      stackOut_16_1 = (String) var6_ref;
                      stackIn_18_0 = stackOut_16_0;
                      stackIn_18_1 = stackOut_16_1;
                      stackIn_17_0 = stackOut_16_0;
                      stackIn_17_1 = stackOut_16_1;
                      if (((bf) this).field_l == -2147483648) {
                        stackOut_18_0 = (mg) (Object) stackIn_18_0;
                        stackOut_18_1 = (String) (Object) stackIn_18_1;
                        stackOut_18_2 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        stackIn_19_2 = stackOut_18_2;
                        break L7;
                      } else {
                        stackOut_17_0 = (mg) (Object) stackIn_17_0;
                        stackOut_17_1 = (String) (Object) stackIn_17_1;
                        stackOut_17_2 = ((bf) this).field_l;
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_19_1 = stackOut_17_1;
                        stackIn_19_2 = stackOut_17_2;
                        break L7;
                      }
                    }
                    L8: {
                      stackOut_19_0 = (mg) (Object) stackIn_19_0;
                      stackOut_19_1 = (String) (Object) stackIn_19_1;
                      stackOut_19_2 = stackIn_19_2 + (param3.field_a + param2 + param4.field_m);
                      stackOut_19_3 = param3.field_d;
                      stackOut_19_4 = param4.field_j + param1;
                      stackIn_21_0 = stackOut_19_0;
                      stackIn_21_1 = stackOut_19_1;
                      stackIn_21_2 = stackOut_19_2;
                      stackIn_21_3 = stackOut_19_3;
                      stackIn_21_4 = stackOut_19_4;
                      stackIn_20_0 = stackOut_19_0;
                      stackIn_20_1 = stackOut_19_1;
                      stackIn_20_2 = stackOut_19_2;
                      stackIn_20_3 = stackOut_19_3;
                      stackIn_20_4 = stackOut_19_4;
                      if (-2147483648 != ((bf) this).field_h) {
                        stackOut_21_0 = (mg) (Object) stackIn_21_0;
                        stackOut_21_1 = (String) (Object) stackIn_21_1;
                        stackOut_21_2 = stackIn_21_2;
                        stackOut_21_3 = stackIn_21_3;
                        stackOut_21_4 = stackIn_21_4;
                        stackOut_21_5 = ((bf) this).field_h;
                        stackIn_22_0 = stackOut_21_0;
                        stackIn_22_1 = stackOut_21_1;
                        stackIn_22_2 = stackOut_21_2;
                        stackIn_22_3 = stackOut_21_3;
                        stackIn_22_4 = stackOut_21_4;
                        stackIn_22_5 = stackOut_21_5;
                        break L8;
                      } else {
                        stackOut_20_0 = (mg) (Object) stackIn_20_0;
                        stackOut_20_1 = (String) (Object) stackIn_20_1;
                        stackOut_20_2 = stackIn_20_2;
                        stackOut_20_3 = stackIn_20_3;
                        stackOut_20_4 = stackIn_20_4;
                        stackOut_20_5 = 0;
                        stackIn_22_0 = stackOut_20_0;
                        stackIn_22_1 = stackOut_20_1;
                        stackIn_22_2 = stackOut_20_2;
                        stackIn_22_3 = stackOut_20_3;
                        stackIn_22_4 = stackOut_20_4;
                        stackIn_22_5 = stackOut_20_5;
                        break L8;
                      }
                    }
                    L9: {
                      stackOut_22_0 = (mg) (Object) stackIn_22_0;
                      stackOut_22_1 = (String) (Object) stackIn_22_1;
                      stackOut_22_2 = stackIn_22_2;
                      stackOut_22_3 = stackIn_22_3 + (stackIn_22_4 + stackIn_22_5);
                      stackOut_22_4 = -param3.field_n + (param4.field_t + -param3.field_a);
                      stackOut_22_5 = -param3.field_j + (-param3.field_d + param4.field_x);
                      stackOut_22_6 = ((bf) this).field_d;
                      stackOut_22_7 = ((bf) this).field_n;
                      stackIn_24_0 = stackOut_22_0;
                      stackIn_24_1 = stackOut_22_1;
                      stackIn_24_2 = stackOut_22_2;
                      stackIn_24_3 = stackOut_22_3;
                      stackIn_24_4 = stackOut_22_4;
                      stackIn_24_5 = stackOut_22_5;
                      stackIn_24_6 = stackOut_22_6;
                      stackIn_24_7 = stackOut_22_7;
                      stackIn_23_0 = stackOut_22_0;
                      stackIn_23_1 = stackOut_22_1;
                      stackIn_23_2 = stackOut_22_2;
                      stackIn_23_3 = stackOut_22_3;
                      stackIn_23_4 = stackOut_22_4;
                      stackIn_23_5 = stackOut_22_5;
                      stackIn_23_6 = stackOut_22_6;
                      stackIn_23_7 = stackOut_22_7;
                      if (((bf) this).field_g != -2147483648) {
                        stackOut_24_0 = (mg) (Object) stackIn_24_0;
                        stackOut_24_1 = (String) (Object) stackIn_24_1;
                        stackOut_24_2 = stackIn_24_2;
                        stackOut_24_3 = stackIn_24_3;
                        stackOut_24_4 = stackIn_24_4;
                        stackOut_24_5 = stackIn_24_5;
                        stackOut_24_6 = stackIn_24_6;
                        stackOut_24_7 = stackIn_24_7;
                        stackOut_24_8 = ((bf) this).field_g;
                        stackIn_25_0 = stackOut_24_0;
                        stackIn_25_1 = stackOut_24_1;
                        stackIn_25_2 = stackOut_24_2;
                        stackIn_25_3 = stackOut_24_3;
                        stackIn_25_4 = stackOut_24_4;
                        stackIn_25_5 = stackOut_24_5;
                        stackIn_25_6 = stackOut_24_6;
                        stackIn_25_7 = stackOut_24_7;
                        stackIn_25_8 = stackOut_24_8;
                        break L9;
                      } else {
                        stackOut_23_0 = (mg) (Object) stackIn_23_0;
                        stackOut_23_1 = (String) (Object) stackIn_23_1;
                        stackOut_23_2 = stackIn_23_2;
                        stackOut_23_3 = stackIn_23_3;
                        stackOut_23_4 = stackIn_23_4;
                        stackOut_23_5 = stackIn_23_5;
                        stackOut_23_6 = stackIn_23_6;
                        stackOut_23_7 = stackIn_23_7;
                        stackOut_23_8 = 256;
                        stackIn_25_0 = stackOut_23_0;
                        stackIn_25_1 = stackOut_23_1;
                        stackIn_25_2 = stackOut_23_2;
                        stackIn_25_3 = stackOut_23_3;
                        stackIn_25_4 = stackOut_23_4;
                        stackIn_25_5 = stackOut_23_5;
                        stackIn_25_6 = stackOut_23_6;
                        stackIn_25_7 = stackOut_23_7;
                        stackIn_25_8 = stackOut_23_8;
                        break L9;
                      }
                    }
                    int discarded$2 = ((mg) (Object) stackIn_25_0).a(stackIn_25_1, stackIn_25_2, stackIn_25_3, stackIn_25_4, stackIn_25_5, stackIn_25_6, stackIn_25_7, stackIn_25_8, param3.field_g, param3.field_b, param3.field_f);
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
            }
            if (param0 > 45) {
              break L0;
            } else {
              bf discarded$3 = ((bf) this).a(-35, 3);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var6;
            stackOut_29_1 = new StringBuilder().append("bf.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param3 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L10;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L10;
            }
          }
          L11: {
            stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(44);
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param4 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L11;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L11;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + 41);
        }
    }

    final bf a(o[] param0, byte param1) {
        RuntimeException var3 = null;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
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
              ((bf) this).field_j = param0;
              if (param1 == 119) {
                break L1;
              } else {
                field_i = null;
                break L1;
              }
            }
            stackOut_2_0 = this;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("bf.L(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return (bf) this;
    }

    final bf a(int param0, byte param1) {
        if (param1 < 59) {
            return null;
        }
        ((bf) this).field_h = param0;
        return (bf) this;
    }

    final void a(int param0) {
        ((bf) this).field_l = 0;
        ((bf) this).field_h = 0;
        if (param0 != 36) {
          field_b = null;
          ((bf) this).field_d = 0;
          ((bf) this).field_g = 256;
          ((bf) this).field_k = null;
          ((bf) this).field_n = -1;
          ((bf) this).field_j = null;
          return;
        } else {
          ((bf) this).field_d = 0;
          ((bf) this).field_g = 256;
          ((bf) this).field_k = null;
          ((bf) this).field_n = -1;
          ((bf) this).field_j = null;
          return;
        }
    }

    bf() {
        ((bf) this).field_l = -2147483648;
        ((bf) this).field_k = null;
        ((bf) this).field_d = -2;
        ((bf) this).field_h = -2147483648;
        ((bf) this).field_j = null;
        ((bf) this).field_n = -2;
        ((bf) this).field_g = -2147483648;
        ((bf) this).field_c = false;
    }

    final void a(bf param0, int param1) {
        try {
            param0.field_k = ((bf) this).field_k;
            param0.field_j = ((bf) this).field_j;
            param0.field_h = ((bf) this).field_h;
            param0.field_d = ((bf) this).field_d;
            if (param1 != 2) {
                Object var4 = null;
                ((bf) this).a(-90, 43, 73, (ql) null, (rc) null);
            }
            param0.field_l = ((bf) this).field_l;
            param0.field_g = ((bf) this).field_g;
            param0.field_n = ((bf) this).field_n;
            param0.field_c = ((bf) this).field_c;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "bf.E(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = -1;
        field_b = new sh[36];
        field_m = "You have 1 unread message!";
    }
}
