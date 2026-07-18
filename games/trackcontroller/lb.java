/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class lb extends rh {
    static boolean field_M;
    private int field_L;
    private long field_R;
    static rd field_O;
    private boolean field_K;
    private long field_I;
    private boolean field_P;
    private int field_N;
    private int field_Q;
    private int field_J;

    final boolean a(byte param0, char param1, al param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        int stackIn_23_0 = 0;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        int stackIn_30_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_74_0 = 0;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_71_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_34_0 = 0;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        int stackOut_29_0 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        int stackOut_22_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        try {
          L0: {
            L1: {
              ((lb) this).field_I = qg.a(false);
              var5_int = -37 % ((param0 - 17) / 51);
              if (param1 == 60) {
                break L1;
              } else {
                if (62 == param1) {
                  break L1;
                } else {
                  L2: {
                    if (param1 < 32) {
                      break L2;
                    } else {
                      if (param1 <= 126) {
                        L3: {
                          if (~((lb) this).field_N == ~((lb) this).field_Q) {
                            break L3;
                          } else {
                            int discarded$9 = 29388;
                            this.j();
                            break L3;
                          }
                        }
                        L4: {
                          L5: {
                            if (((lb) this).field_J == -1) {
                              break L5;
                            } else {
                              if (~((lb) this).field_s.length() > ~((lb) this).field_J) {
                                break L5;
                              } else {
                                break L4;
                              }
                            }
                          }
                          L6: {
                            if (((lb) this).field_Q < ((lb) this).field_s.length()) {
                              ((lb) this).field_s = ((lb) this).field_s.substring(0, ((lb) this).field_Q) + param1 + ((lb) this).field_s.substring(((lb) this).field_Q, ((lb) this).field_s.length());
                              ((lb) this).field_Q = ((lb) this).field_Q + 1;
                              ((lb) this).field_N = ((lb) this).field_Q;
                              break L6;
                            } else {
                              ((lb) this).field_s = ((lb) this).field_s + param1;
                              int dupTemp$10 = ((lb) this).field_s.length();
                              ((lb) this).field_Q = dupTemp$10;
                              ((lb) this).field_N = dupTemp$10;
                              break L6;
                            }
                          }
                          ((lb) this).b(true);
                          break L4;
                        }
                        stackOut_71_0 = 1;
                        stackIn_72_0 = stackOut_71_0;
                        return stackIn_72_0 != 0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L7: {
                    if (param3 != 85) {
                      if (param3 == 101) {
                        if (~((lb) this).field_Q != ~((lb) this).field_N) {
                          int discarded$11 = 29388;
                          this.j();
                          stackOut_60_0 = 1;
                          stackIn_61_0 = stackOut_60_0;
                          return stackIn_61_0 != 0;
                        } else {
                          if (~((lb) this).field_Q <= ~((lb) this).field_s.length()) {
                            break L7;
                          } else {
                            ((lb) this).field_N = 1 + ((lb) this).field_Q;
                            int discarded$12 = 29388;
                            this.j();
                            stackOut_58_0 = 1;
                            stackIn_59_0 = stackOut_58_0;
                            return stackIn_59_0 != 0;
                          }
                        }
                      } else {
                        if (param3 == 13) {
                          ((lb) this).l(-90);
                          stackOut_54_0 = 1;
                          stackIn_55_0 = stackOut_54_0;
                          return stackIn_55_0 != 0;
                        } else {
                          if (param3 != 96) {
                            if (97 != param3) {
                              if (param3 == 102) {
                                this.a(-19166, 0);
                                stackOut_52_0 = 1;
                                stackIn_53_0 = stackOut_52_0;
                                return stackIn_53_0 != 0;
                              } else {
                                if (param3 == 103) {
                                  this.a(-19166, ((lb) this).field_s.length());
                                  stackOut_50_0 = 1;
                                  stackIn_51_0 = stackOut_50_0;
                                  return stackIn_51_0 != 0;
                                } else {
                                  if (param3 != 84) {
                                    L8: {
                                      if (!ni.field_m[82]) {
                                        break L8;
                                      } else {
                                        if (param3 == 65) {
                                          this.d((byte) 13);
                                          stackOut_48_0 = 1;
                                          stackIn_49_0 = stackOut_48_0;
                                          return stackIn_49_0 != 0;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                    L9: {
                                      if (!ni.field_m[82]) {
                                        break L9;
                                      } else {
                                        if (66 != param3) {
                                          break L9;
                                        } else {
                                          this.m(118);
                                          stackOut_41_0 = 1;
                                          stackIn_42_0 = stackOut_41_0;
                                          return stackIn_42_0 != 0;
                                        }
                                      }
                                    }
                                    if (!ni.field_m[82]) {
                                      break L7;
                                    } else {
                                      if (param3 == 67) {
                                        int discarded$13 = 82;
                                        this.e();
                                        stackOut_46_0 = 1;
                                        stackIn_47_0 = stackOut_46_0;
                                        return stackIn_47_0 != 0;
                                      } else {
                                        return false;
                                      }
                                    }
                                  } else {
                                    int discarded$14 = 0;
                                    this.c();
                                    stackOut_34_0 = 1;
                                    stackIn_35_0 = stackOut_34_0;
                                    return stackIn_35_0 != 0;
                                  }
                                }
                              }
                            } else {
                              if (((lb) this).field_Q >= ((lb) this).field_s.length()) {
                                break L7;
                              } else {
                                L10: {
                                  stackOut_26_0 = this;
                                  stackOut_26_1 = -19166;
                                  stackIn_28_0 = stackOut_26_0;
                                  stackIn_28_1 = stackOut_26_1;
                                  stackIn_27_0 = stackOut_26_0;
                                  stackIn_27_1 = stackOut_26_1;
                                  if (!ni.field_m[82]) {
                                    stackOut_28_0 = this;
                                    stackOut_28_1 = stackIn_28_1;
                                    stackOut_28_2 = 1 + ((lb) this).field_Q;
                                    stackIn_29_0 = stackOut_28_0;
                                    stackIn_29_1 = stackOut_28_1;
                                    stackIn_29_2 = stackOut_28_2;
                                    break L10;
                                  } else {
                                    int discarded$15 = 0;
                                    stackOut_27_0 = this;
                                    stackOut_27_1 = stackIn_27_1;
                                    stackOut_27_2 = this.r();
                                    stackIn_29_0 = stackOut_27_0;
                                    stackIn_29_1 = stackOut_27_1;
                                    stackIn_29_2 = stackOut_27_2;
                                    break L10;
                                  }
                                }
                                this.a(stackIn_29_1, stackIn_29_2);
                                stackOut_29_0 = 1;
                                stackIn_30_0 = stackOut_29_0;
                                return stackIn_30_0 != 0;
                              }
                            }
                          } else {
                            if (((lb) this).field_Q <= 0) {
                              break L7;
                            } else {
                              L11: {
                                stackOut_19_0 = this;
                                stackOut_19_1 = -19166;
                                stackIn_21_0 = stackOut_19_0;
                                stackIn_21_1 = stackOut_19_1;
                                stackIn_20_0 = stackOut_19_0;
                                stackIn_20_1 = stackOut_19_1;
                                if (ni.field_m[82]) {
                                  stackOut_21_0 = this;
                                  stackOut_21_1 = stackIn_21_1;
                                  stackOut_21_2 = this.k(-1);
                                  stackIn_22_0 = stackOut_21_0;
                                  stackIn_22_1 = stackOut_21_1;
                                  stackIn_22_2 = stackOut_21_2;
                                  break L11;
                                } else {
                                  stackOut_20_0 = this;
                                  stackOut_20_1 = stackIn_20_1;
                                  stackOut_20_2 = -1 + ((lb) this).field_Q;
                                  stackIn_22_0 = stackOut_20_0;
                                  stackIn_22_1 = stackOut_20_1;
                                  stackIn_22_2 = stackOut_20_2;
                                  break L11;
                                }
                              }
                              this.a(stackIn_22_1, stackIn_22_2);
                              stackOut_22_0 = 1;
                              stackIn_23_0 = stackOut_22_0;
                              return stackIn_23_0 != 0;
                            }
                          }
                        }
                      }
                    } else {
                      if (~((lb) this).field_N == ~((lb) this).field_Q) {
                        if (((lb) this).field_Q <= 0) {
                          break L7;
                        } else {
                          ((lb) this).field_N = -1 + ((lb) this).field_Q;
                          int discarded$16 = 29388;
                          this.j();
                          stackOut_13_0 = 1;
                          stackIn_14_0 = stackOut_13_0;
                          return stackIn_14_0 != 0;
                        }
                      } else {
                        int discarded$17 = 29388;
                        this.j();
                        stackOut_10_0 = 1;
                        stackIn_11_0 = stackOut_10_0;
                        return stackIn_11_0 != 0;
                      }
                    }
                  }
                  stackOut_73_0 = 0;
                  stackIn_74_0 = stackOut_73_0;
                  break L0;
                }
              }
            }
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackOut_75_0 = (RuntimeException) var5;
            stackOut_75_1 = new StringBuilder().append("lb.GA(").append(param0).append(',').append(param1).append(',');
            stackIn_77_0 = stackOut_75_0;
            stackIn_77_1 = stackOut_75_1;
            stackIn_76_0 = stackOut_75_0;
            stackIn_76_1 = stackOut_75_1;
            if (param2 == null) {
              stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
              stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
              stackOut_77_2 = "null";
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              break L12;
            } else {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "{...}";
              stackIn_78_0 = stackOut_76_0;
              stackIn_78_1 = stackOut_76_1;
              stackIn_78_2 = stackOut_76_2;
              break L12;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_78_0, stackIn_78_2 + ',' + param3 + ')');
        }
        return stackIn_74_0 != 0;
    }

    public static void n(int param0) {
        if (param0 != -85) {
            lb.n(-22);
        }
        field_O = null;
    }

    private final void e() {
        try {
            String var2 = null;
            Exception var2_ref = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var3 = 0;
                var2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                int discarded$1 = 29388;
                this.j();
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

    private final void c() {
        if (!(!(((lb) this).field_l instanceof se))) {
            ((se) (Object) ((lb) this).field_l).b(-28, (lb) this);
        }
    }

    final boolean a(al param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        long var8_long = 0L;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_18_0 = 0;
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
            if (super.a(param0, param1, param2, param3, param4 + param4, param5, param6)) {
              if (((lb) this).field_y instanceof dl) {
                L1: {
                  var8_int = ((dl) (Object) ((lb) this).field_y).a(param6, kf.field_b, 81, fg.field_a, param5, (al) this);
                  stackOut_4_0 = this;
                  stackOut_4_1 = -19166;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  if (var8_int == -1) {
                    stackOut_6_0 = this;
                    stackOut_6_1 = stackIn_6_1;
                    stackOut_6_2 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    stackIn_7_2 = stackOut_6_2;
                    break L1;
                  } else {
                    stackOut_5_0 = this;
                    stackOut_5_1 = stackIn_5_1;
                    stackOut_5_2 = var8_int;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    stackIn_7_2 = stackOut_5_2;
                    break L1;
                  }
                }
                L2: {
                  this.a(stackIn_7_1, stackIn_7_2);
                  var8_long = qg.a(false);
                  stackOut_7_0 = this;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_8_0 = stackOut_7_0;
                  if (-((lb) this).field_R + var8_long >= 250L) {
                    stackOut_9_0 = this;
                    stackOut_9_1 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    break L2;
                  } else {
                    stackOut_8_0 = this;
                    stackOut_8_1 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    break L2;
                  }
                }
                L3: {
                  ((lb) this).field_K = stackIn_10_1 != 0;
                  if (!((lb) this).field_K) {
                    break L3;
                  } else {
                    L4: {
                      ((lb) this).field_N = this.k(param4 + -1);
                      int discarded$1 = 0;
                      ((lb) this).field_Q = this.r();
                      if (0 >= ((lb) this).field_Q) {
                        break L4;
                      } else {
                        if (32 == ((lb) this).field_s.charAt(-1 + ((lb) this).field_Q)) {
                          ((lb) this).field_Q = ((lb) this).field_Q - 1;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    ((lb) this).field_L = ((lb) this).field_Q;
                    break L3;
                  }
                }
                ((lb) this).field_R = var8_long;
                stackOut_16_0 = 1;
                stackIn_17_0 = stackOut_16_0;
                return stackIn_17_0 != 0;
              } else {
                stackOut_18_0 = 0;
                stackIn_19_0 = stackOut_18_0;
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
            stackOut_20_0 = (RuntimeException) var8;
            stackOut_20_1 = new StringBuilder().append("lb.R(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_19_0 != 0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        dl var8 = null;
        long var6 = 0L;
        if (param3 != 29221) {
            this.d((byte) 60);
        }
        if (((lb) this).field_y != null) {
            if (param0 == 0) {
                ((lb) this).field_y.a(-24969, (al) this, param2, ((lb) this).field_B, param1);
                if (((lb) this).field_y instanceof dl) {
                    var8 = (dl) (Object) ((lb) this).field_y;
                    if (((lb) this).field_Q != ((lb) this).field_N) {
                        var8.b(param1, param2, ((lb) this).field_Q, -84, ((lb) this).field_N, (al) this);
                    }
                    var6 = qg.a(false);
                    if (500L > (var6 + -((lb) this).field_I) % 1000L) {
                        var8.a(((lb) this).field_Q, (al) this, param3 ^ -29312, param2, param1);
                    }
                }
            }
        }
    }

    final void a(boolean param0, String param1, int param2) {
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
              if (param1 != null) {
                break L1;
              } else {
                param1 = "";
                break L1;
              }
            }
            L2: {
              ((lb) this).field_s = param1;
              var4_int = -28 % ((param2 - 12) / 39);
              var5 = param1.length();
              if (((lb) this).field_J == -1) {
                break L2;
              } else {
                if (((lb) this).field_J >= var5) {
                  break L2;
                } else {
                  ((lb) this).field_s = ((lb) this).field_s.substring(0, ((lb) this).field_J);
                  break L2;
                }
              }
            }
            L3: {
              int dupTemp$3 = ((lb) this).field_s.length();
              ((lb) this).field_N = dupTemp$3;
              ((lb) this).field_Q = dupTemp$3;
              if (!param0) {
                ((lb) this).b(true);
                break L3;
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("lb.F(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1) {
        if (param0 != -19166) {
            return;
        }
        ((lb) this).field_Q = param1;
        if (!(ni.field_m[81])) {
            ((lb) this).field_N = ((lb) this).field_Q;
        }
    }

    private final String p(int param0) {
        if (param0 > -82) {
            this.a(-5, 11);
        }
        int var2 = ((lb) this).field_Q <= ((lb) this).field_N ? ((lb) this).field_Q : ((lb) this).field_N;
        int var3 = ((lb) this).field_N < ((lb) this).field_Q ? ((lb) this).field_Q : ((lb) this).field_N;
        return ((lb) this).field_s.substring(var2, var3);
    }

    private final void d(byte param0) {
        this.m(param0 + 110);
        if (param0 != 13) {
            return;
        }
        int discarded$0 = 29388;
        this.j();
    }

    private final int k(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = TrackController.field_F ? 1 : 0;
        if (0 != ((lb) this).field_Q) {
          var2 = param0 + ((lb) this).field_Q;
          L0: while (true) {
            L1: {
              if (var2 <= 0) {
                break L1;
              } else {
                if (((lb) this).field_s.charAt(-1 + var2) == 32) {
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
          return ((lb) this).field_Q;
        }
    }

    private final int r() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = TrackController.field_F ? 1 : 0;
        var2 = ((lb) this).field_s.length();
        if (((lb) this).field_Q != var2) {
          lb.o(54);
          var3 = 1 + ((lb) this).field_Q;
          L0: while (true) {
            L1: {
              if (var3 >= var2) {
                break L1;
              } else {
                if (32 == ((lb) this).field_s.charAt(-1 + var3)) {
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
          return ((lb) this).field_Q;
        }
    }

    private final void a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (((lb) this).field_J == -1) {
                break L1;
              } else {
                var3_int = ((lb) this).field_J + -((lb) this).field_s.length();
                if (0 <= var3_int) {
                  return;
                } else {
                  param1 = param1.substring(0, var3_int);
                  break L1;
                }
              }
            }
            L2: {
              if (((lb) this).field_Q == ((lb) this).field_s.length()) {
                ((lb) this).field_s = ((lb) this).field_s + param1;
                break L2;
              } else {
                ((lb) this).field_s = ((lb) this).field_s.substring(0, ((lb) this).field_Q) + param1 + ((lb) this).field_s.substring(((lb) this).field_Q, ((lb) this).field_s.length());
                break L2;
              }
            }
            ((lb) this).field_Q = ((lb) this).field_Q + param1.length();
            ((lb) this).field_N = ((lb) this).field_Q;
            ((lb) this).b(true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("lb.K(").append(0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    private final void q(int param0) {
        int var2 = 0;
        dl var3 = null;
        rb var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = TrackController.field_F ? 1 : 0;
        if (((lb) this).field_P) {
          var2 = 124 / ((param0 - 28) / 54);
          if (((lb) this).field_y instanceof dl) {
            var3 = (dl) (Object) ((lb) this).field_y;
            var4 = var3.a((byte) 110, (al) this);
            var5 = var4.c(-1);
            var6 = var3.a((al) this, 121);
            var7 = var3.a((byte) 46) >> 1;
            if (-var7 + var6 > var5) {
              ((lb) this).field_o = 0;
              ((lb) this).field_A = 0;
              return;
            } else {
              L0: {
                var8 = ((lb) this).field_o + var4.a((byte) 111, ((lb) this).field_Q);
                if (var6 - var7 < var8) {
                  ((lb) this).field_o = -var7 - -var6 - (var8 - ((lb) this).field_o);
                  break L0;
                } else {
                  if (var7 > var8) {
                    ((lb) this).field_o = var7 - var8 + ((lb) this).field_o;
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
              L1: {
                if (((lb) this).field_o > 0) {
                  ((lb) this).field_o = 0;
                  break L1;
                } else {
                  if (((lb) this).field_o >= -var6 - -var7) {
                    break L1;
                  } else {
                    ((lb) this).field_o = var7 + -var6;
                    break L1;
                  }
                }
              }
              return;
            }
          } else {
            return;
          }
        } else {
          ((lb) this).field_o = 0;
          ((lb) this).field_A = 0;
          return;
        }
    }

    private final void m(int param0) {
        String var2 = this.p(-95);
        if (var2.length() > 0) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.p(-87)), (java.awt.datatransfer.ClipboardOwner) null);
        }
        if (param0 <= 115) {
            Object var3 = null;
            ((lb) this).a(-33, -113, (byte) 101, (al) null);
        }
    }

    final static String a(CharSequence param0, boolean param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_13_0 = null;
        String stackIn_18_0 = null;
        Object stackIn_21_0 = null;
        String stackIn_29_0 = null;
        String stackIn_34_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_33_0 = null;
        String stackOut_28_0 = null;
        Object stackOut_20_0 = null;
        String stackOut_17_0 = null;
        String stackOut_12_0 = null;
        String stackOut_7_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var8 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                var3_int = param0.length();
                if (var3_int < 1) {
                  break L1;
                } else {
                  if (var3_int > 12) {
                    break L1;
                  } else {
                    L2: {
                      int discarded$2 = -11133;
                      var4 = r.a(param0);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if (var4.length() >= 1) {
                          L3: {
                            if (sf.a(var4.charAt(0), -33)) {
                              break L3;
                            } else {
                              if (sf.a(var4.charAt(var4.length() - 1), -33)) {
                                break L3;
                              } else {
                                var5 = 0;
                                if (param2 == 1236) {
                                  var6 = 0;
                                  L4: while (true) {
                                    if (var6 >= param0.length()) {
                                      if (var5 > 0) {
                                        stackOut_33_0 = wd.field_J;
                                        stackIn_34_0 = stackOut_33_0;
                                        break L0;
                                      } else {
                                        return null;
                                      }
                                    } else {
                                      L5: {
                                        var7 = param0.charAt(var6);
                                        if (!sf.a((char) var7, param2 ^ -1269)) {
                                          var5 = 0;
                                          break L5;
                                        } else {
                                          var5++;
                                          break L5;
                                        }
                                      }
                                      if (var5 < 2) {
                                        var6++;
                                        continue L4;
                                      } else {
                                        stackOut_28_0 = rb.field_d;
                                        stackIn_29_0 = stackOut_28_0;
                                        return stackIn_29_0;
                                      }
                                    }
                                  }
                                } else {
                                  stackOut_20_0 = null;
                                  stackIn_21_0 = stackOut_20_0;
                                  return (String) (Object) stackIn_21_0;
                                }
                              }
                            }
                          }
                          stackOut_17_0 = wd.field_J;
                          stackIn_18_0 = stackOut_17_0;
                          return stackIn_18_0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackOut_12_0 = ei.field_j;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  }
                }
              }
              stackOut_7_0 = ei.field_j;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            } else {
              stackOut_2_0 = ei.field_j;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var3;
            stackOut_35_1 = new StringBuilder().append("lb.B(");
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param0 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L6;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L6;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + ',' + false + ',' + param2 + ')');
        }
        return stackIn_34_0;
    }

    void a(int param0, int param1, byte param2, al param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        dl var7 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              super.a(param0, param1, param2, param3);
              this.q(param2 ^ 92);
              if (((lb) this).field_r == 1) {
                L2: {
                  if (((lb) this).field_y instanceof dl) {
                    var7 = (dl) (Object) ((lb) this).field_y;
                    var6 = var7.a(param0, kf.field_b, 119, fg.field_a, param1, (al) this);
                    if (var6 != -1) {
                      L3: {
                        if (!((lb) this).field_K) {
                          break L3;
                        } else {
                          if (((lb) this).field_L <= var6) {
                            break L3;
                          } else {
                            if (((lb) this).field_N < var6) {
                              var6 = ((lb) this).field_L;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      ((lb) this).field_Q = var6;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                ((lb) this).field_I = qg.a(false);
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
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("lb.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
    }

    void b(boolean param0) {
        if (!(!(((lb) this).field_l instanceof se))) {
            ((se) (Object) ((lb) this).field_l).a(-12230, (lb) this);
        }
        if (!param0) {
            ((lb) this).a(69, -108, 109, -105);
        }
    }

    lb(String param0, tg param1, int param2) {
        super(param0, param1);
        ((lb) this).field_L = -1;
        ((lb) this).field_K = false;
        ((lb) this).field_R = 0L;
        try {
            ((lb) this).field_y = field_O.field_e;
            ((lb) this).field_J = param2;
            ((lb) this).a(true, param0, -74);
            ((lb) this).field_P = true;
            ((lb) this).field_I = qg.a(false);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "lb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void o(int param0) {
        mc.field_H = new vd();
        re.field_g.b((al) (Object) mc.field_H, -103);
        if (param0 > -78) {
            Object var2 = null;
            String discarded$0 = lb.a((CharSequence) null, false, -68);
        }
    }

    final void l(int param0) {
        ((lb) this).field_s = "";
        ((lb) this).field_N = 0;
        ((lb) this).field_Q = 0;
        ((lb) this).b(true);
        if (param0 > -67) {
            ((lb) this).field_J = -105;
        }
    }

    private final void j() {
        int var2 = 0;
        int var3 = 0;
        if (((lb) this).field_N != ((lb) this).field_Q) {
            var2 = ((lb) this).field_Q <= ((lb) this).field_N ? ((lb) this).field_Q : ((lb) this).field_N;
            var3 = ((lb) this).field_Q <= ((lb) this).field_N ? ((lb) this).field_N : ((lb) this).field_Q;
            ((lb) this).field_Q = var2;
            ((lb) this).field_N = var2;
            ((lb) this).field_s = ((lb) this).field_s.substring(0, var2) + ((lb) this).field_s.substring(var3, ((lb) this).field_s.length());
            ((lb) this).b(true);
        }
    }

    static {
    }
}
