/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class mg {
    private java.util.zip.Inflater field_b;
    static String[][] field_a;

    private mg(int param0, int param1, int param2) {
    }

    final static int a(boolean param0) {
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_80_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_77_0 = 0;
        try {
          L0: {
            if (hj.field_f < 2) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                if (ob.field_c == 0) {
                  if (!qd.field_Jb.a(0)) {
                    stackOut_53_0 = 20;
                    stackIn_54_0 = stackOut_53_0;
                    return stackIn_54_0;
                  } else {
                    if (qd.field_Jb.a(255, "commonui")) {
                      if (!sb.field_i.a(0)) {
                        stackOut_61_0 = 50;
                        stackIn_62_0 = stackOut_61_0;
                        return stackIn_62_0;
                      } else {
                        if (sb.field_i.a(255, "commonui")) {
                          if (!ig.field_t.a(0)) {
                            stackOut_69_0 = 70;
                            stackIn_70_0 = stackOut_69_0;
                            return stackIn_70_0;
                          } else {
                            if (!ig.field_t.c((byte) 54)) {
                              stackOut_74_0 = 80;
                              stackIn_75_0 = stackOut_74_0;
                              return stackIn_75_0;
                            } else {
                              break L1;
                            }
                          }
                        } else {
                          stackOut_64_0 = 60;
                          stackIn_65_0 = stackOut_64_0;
                          return stackIn_65_0;
                        }
                      }
                    } else {
                      stackOut_56_0 = 40;
                      stackIn_57_0 = stackOut_56_0;
                      return stackIn_57_0;
                    }
                  }
                } else {
                  L2: {
                    if (bi.field_I != null) {
                      if (bi.field_I.a(0)) {
                        if (!bi.field_I.a((byte) 12, "")) {
                          stackOut_17_0 = 29;
                          stackIn_18_0 = stackOut_17_0;
                          return stackIn_18_0;
                        } else {
                          if (!bi.field_I.a(255, "")) {
                            stackOut_22_0 = 29;
                            stackIn_23_0 = stackOut_22_0;
                            return stackIn_23_0;
                          } else {
                            break L2;
                          }
                        }
                      } else {
                        stackOut_12_0 = 14;
                        stackIn_13_0 = stackOut_12_0;
                        return stackIn_13_0;
                      }
                    } else {
                      break L2;
                    }
                  }
                  if (!qd.field_Jb.a(0)) {
                    stackOut_27_0 = 43;
                    stackIn_28_0 = stackOut_27_0;
                    return stackIn_28_0;
                  } else {
                    if (qd.field_Jb.a(255, "commonui")) {
                      if (!sb.field_i.a(0)) {
                        stackOut_35_0 = 71;
                        stackIn_36_0 = stackOut_35_0;
                        return stackIn_36_0;
                      } else {
                        if (sb.field_i.a(255, "commonui")) {
                          if (!ig.field_t.a(0)) {
                            stackOut_43_0 = 82;
                            stackIn_44_0 = stackOut_43_0;
                            return stackIn_44_0;
                          } else {
                            if (!ig.field_t.c((byte) 22)) {
                              stackOut_48_0 = 86;
                              stackIn_49_0 = stackOut_48_0;
                              return stackIn_49_0;
                            } else {
                              break L1;
                            }
                          }
                        } else {
                          stackOut_38_0 = 80;
                          stackIn_39_0 = stackOut_38_0;
                          return stackIn_39_0;
                        }
                      }
                    } else {
                      stackOut_30_0 = 57;
                      stackIn_31_0 = stackOut_30_0;
                      return stackIn_31_0;
                    }
                  }
                }
              }
              if (param0) {
                stackOut_79_0 = 100;
                stackIn_80_0 = stackOut_79_0;
                break L0;
              } else {
                stackOut_77_0 = 119;
                stackIn_78_0 = stackOut_77_0;
                return stackIn_78_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var1, "mg.A(" + param0 + ')');
        }
        return stackIn_80_0;
    }

    final static void a(int param0, int param1, int param2) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (null == ja.field_t) {
                  break L2;
                } else {
                  if (ja.field_t.length < param0) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              ja.field_t = new int[2 * param0];
              break L1;
            }
            L3: {
              L4: {
                if (null == rc.field_i) {
                  break L4;
                } else {
                  if (rc.field_i.length < param0) {
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
              rc.field_i = new int[param0 * 2];
              break L3;
            }
            L5: {
              if (param1 >= 48) {
                break L5;
              } else {
                int discarded$1 = mg.a(true);
                break L5;
              }
            }
            L6: {
              L7: {
                if (null == fi.field_h) {
                  break L7;
                } else {
                  if (param0 <= fi.field_h.length) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              fi.field_h = new int[param0 * 2];
              break L6;
            }
            L8: {
              L9: {
                if (kk.field_a == null) {
                  break L9;
                } else {
                  if (~kk.field_a.length <= ~param0) {
                    break L8;
                  } else {
                    break L9;
                  }
                }
              }
              kk.field_a = new int[param0 * 2];
              break L8;
            }
            L10: {
              L11: {
                if (null == qj.field_d) {
                  break L11;
                } else {
                  if (~param0 < ~qj.field_d.length) {
                    break L11;
                  } else {
                    break L10;
                  }
                }
              }
              qj.field_d = new int[param0 * 2];
              break L10;
            }
            L12: {
              L13: {
                if (null == kf.field_c) {
                  break L13;
                } else {
                  if (~param0 < ~kf.field_c.length) {
                    break L13;
                  } else {
                    break L12;
                  }
                }
              }
              kf.field_c = new int[2 * param0];
              break L12;
            }
            L14: {
              L15: {
                if (null == bj.field_a) {
                  break L15;
                } else {
                  if (bj.field_a.length >= param2 + param0) {
                    break L14;
                  } else {
                    break L15;
                  }
                }
              }
              bj.field_a = new int[2 * (param2 + param0)];
              break L14;
            }
            L16: {
              L17: {
                if (null == cb.field_c) {
                  break L17;
                } else {
                  if (~cb.field_c.length <= ~param0) {
                    break L16;
                  } else {
                    break L17;
                  }
                }
              }
              cb.field_c = new boolean[param0 * 2];
              break L16;
            }
            pf.field_f = -2147483648;
            ha.field_c = 2147483647;
            mh.field_b = -2147483648;
            gg.field_b = 0;
            cc.field_B = 2147483647;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var3, "mg.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public mg() {
        this(-1, 1000000, 1000000);
    }

    final void a(byte[] param0, od param1, int param2) {
        try {
            Exception var4 = null;
            RuntimeException var4_ref = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            String stackIn_24_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            RuntimeException stackOut_23_0 = null;
            StringBuilder stackOut_23_1 = null;
            String stackOut_23_2 = null;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            String stackOut_21_2 = null;
            try {
              L0: {
                L1: {
                  if (param1.field_h[param1.field_j] != 31) {
                    break L1;
                  } else {
                    if (param1.field_h[param1.field_j - -1] == -117) {
                      L2: {
                        if (null != ((mg) this).field_b) {
                          break L2;
                        } else {
                          ((mg) this).field_b = new java.util.zip.Inflater(true);
                          break L2;
                        }
                      }
                      try {
                        L3: {
                          ((mg) this).field_b.setInput(param1.field_h, param1.field_j + 10, -param1.field_j + (-18 + param1.field_h.length));
                          if (param2 == -1) {
                            int discarded$2 = ((mg) this).field_b.inflate(param0);
                            break L3;
                          } else {
                            return;
                          }
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var4 = (Exception) (Object) decompiledCaughtException;
                        ((mg) this).field_b.reset();
                        throw new RuntimeException("");
                      }
                      ((mg) this).field_b.reset();
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                throw new RuntimeException("");
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_16_0 = (RuntimeException) var4_ref;
                stackOut_16_1 = new StringBuilder().append("mg.C(");
                stackIn_19_0 = stackOut_16_0;
                stackIn_19_1 = stackOut_16_1;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                if (param0 == null) {
                  stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                  stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                  stackOut_19_2 = "null";
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  stackIn_20_2 = stackOut_19_2;
                  break L4;
                } else {
                  stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                  stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                  stackOut_17_2 = "{...}";
                  stackIn_20_0 = stackOut_17_0;
                  stackIn_20_1 = stackOut_17_1;
                  stackIn_20_2 = stackOut_17_2;
                  break L4;
                }
              }
              L5: {
                stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
                stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
                stackIn_23_0 = stackOut_20_0;
                stackIn_23_1 = stackOut_20_1;
                stackIn_21_0 = stackOut_20_0;
                stackIn_21_1 = stackOut_20_1;
                if (param1 == null) {
                  stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
                  stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
                  stackOut_23_2 = "null";
                  stackIn_24_0 = stackOut_23_0;
                  stackIn_24_1 = stackOut_23_1;
                  stackIn_24_2 = stackOut_23_2;
                  break L5;
                } else {
                  stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                  stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
                  stackOut_21_2 = "{...}";
                  stackIn_24_0 = stackOut_21_0;
                  stackIn_24_1 = stackOut_21_1;
                  stackIn_24_2 = stackOut_21_2;
                  break L5;
                }
              }
              throw ie.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        if (param0 != 5) {
            return;
        }
        try {
            field_a = null;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "mg.B(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[][]{new String[8], new String[1], new String[1], new String[3], new String[1], new String[1], new String[3], new String[1], new String[1]};
    }
}
