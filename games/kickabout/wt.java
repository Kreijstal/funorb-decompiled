/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class wt extends fd implements jp {
    static int field_v;
    static int field_x;
    static ut field_y;
    static ut[] field_z;
    fd[] field_w;
    static wu field_A;

    private final boolean a(fd param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        fd var5 = null;
        fd var6 = null;
        int var7 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_36_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var7 = Kickabout.field_G;
        try {
          L0: {
            if (((wt) this).field_w == null) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              if (param1 == -28) {
                var4_int = 0;
                L1: while (true) {
                  L2: {
                    if (var4_int >= ((wt) this).field_w.length) {
                      break L2;
                    } else {
                      L3: {
                        L4: {
                          var5 = ((wt) this).field_w[var4_int];
                          if (var5 == null) {
                            break L4;
                          } else {
                            L5: {
                              if (var5.b(100)) {
                                break L5;
                              } else {
                                if (var7 == 0) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            var4_int = var4_int + param2;
                            L6: while (true) {
                              if (var4_int >= ((wt) this).field_w.length) {
                                break L4;
                              } else {
                                var6 = ((wt) this).field_w[var4_int];
                                if (var7 != 0) {
                                  break L3;
                                } else {
                                  L7: {
                                    L8: {
                                      if (null != var6) {
                                        break L8;
                                      } else {
                                        if (var7 == 0) {
                                          break L7;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                    if (!var6.a(param0, param1 ^ -28)) {
                                      break L7;
                                    } else {
                                      stackOut_30_0 = 1;
                                      stackIn_31_0 = stackOut_30_0;
                                      return stackIn_31_0 != 0;
                                    }
                                  }
                                  var4_int = var4_int + param2;
                                  if (var7 == 0) {
                                    continue L6;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                            }
                          }
                        }
                        var4_int++;
                        break L3;
                      }
                      if (var7 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackOut_35_0 = 0;
                  stackIn_36_0 = stackOut_35_0;
                  break L0;
                }
              } else {
                stackOut_7_0 = 1;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) var4;
            stackOut_37_1 = new StringBuilder().append("wt.I(");
            stackIn_40_0 = stackOut_37_0;
            stackIn_40_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param0 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L9;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_41_0 = stackOut_38_0;
              stackIn_41_1 = stackOut_38_1;
              stackIn_41_2 = stackOut_38_2;
              break L9;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_36_0 != 0;
    }

    final boolean b(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 >= 10) {
              L1: {
                if (this.a(true) == null) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_7_0 = stackOut_4_0;
                  break L1;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "wt.KA(" + param0 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final StringBuilder a(int param0, int param1, Hashtable param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 17883) {
                break L1;
              } else {
                boolean discarded$2 = ((wt) this).a(125, (fd) null, 11, -44, 107, -118, 34);
                break L1;
              }
            }
            L2: {
              if (((wt) this).a(1, param3, param2, param1)) {
                ((wt) this).b(param1, param3, param2, param0 ^ -3421);
                this.a(param2, 10, param1, param3);
                break L2;
              } else {
                break L2;
              }
            }
            stackOut_7_0 = (StringBuilder) param3;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5;
            stackOut_9_1 = new StringBuilder().append("wt.GA(").append(param0).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L4;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_8_0;
    }

    final static wh a(int param0, boolean param1, boolean param2, int param3, int param4, int param5) {
        wh var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        Object stackIn_2_0 = null;
        wh stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        wh stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (pn.field_z.a(false) < 16) {
              var7 = -79 % ((-85 - param5) / 32);
              var6 = new wh(param3, param0, param4, param2, param1);
              pn.field_z.a((gn) (Object) var6, 3);
              stackOut_3_0 = (wh) var6;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (wh) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var6_ref, "wt.R(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_4_0;
    }

    public static void b(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_y = null;
              field_z = null;
              if (!param0) {
                break L1;
              } else {
                field_y = null;
                break L1;
              }
            }
            field_A = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "wt.H(" + param0 + ')');
        }
    }

    private final void a(Hashtable param0, int param1, int param2, StringBuilder param3) {
        fd[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        fd var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var9 = Kickabout.field_G;
        try {
          L0: {
            if (null == ((wt) this).field_w) {
              return;
            } else {
              L1: {
                if (param1 == 10) {
                  break L1;
                } else {
                  ((wt) this).a((byte) 88, (fd) null, 119, 67);
                  break L1;
                }
              }
              var5 = ((wt) this).field_w;
              var6 = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (var6 >= var5.length) {
                      break L4;
                    } else {
                      var7 = var5[var6];
                      StringBuilder discarded$9 = param3.append('\n');
                      if (var9 != 0) {
                        break L3;
                      } else {
                        var8 = 0;
                        L5: while (true) {
                          L6: {
                            L7: {
                              L8: {
                                if (~param2 > ~var8) {
                                  break L8;
                                } else {
                                  StringBuilder discarded$10 = param3.append(' ');
                                  var8++;
                                  if (var9 != 0) {
                                    break L7;
                                  } else {
                                    if (var9 == 0) {
                                      continue L5;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                              }
                              if (var7 != null) {
                                break L7;
                              } else {
                                StringBuilder discarded$11 = param3.append("null");
                                if (var9 == 0) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            StringBuilder discarded$12 = var7.a(17883, param2 - -1, param0, param3);
                            break L6;
                          }
                          var6++;
                          if (var9 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  break L3;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5_ref = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var5_ref;
            stackOut_23_1 = new StringBuilder().append("wt.M(");
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L9;
            }
          }
          L10: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param3 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L10;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L10;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ')');
        }
    }

    private final boolean a(int param0, fd param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 == 9) {
              stackOut_3_0 = this.a(-17305, param1, 1);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("wt.J(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_4_0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        try {
            super.a(param0, param1, param2, param3, param4);
            ((wt) this).a((byte) -118);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "wt.W(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final boolean b(fd param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param1 >= 84) {
                break L1;
              } else {
                int discarded$2 = ((wt) this).f((byte) 119);
                break L1;
              }
            }
            stackOut_3_0 = this.a(param0, -28, 1);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("wt.L(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final boolean a(char param0, byte param1, fd param2, int param3) {
        fd[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        int var6 = 0;
        fd var7 = null;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_17_0 = 0;
        boolean stackIn_29_0 = false;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        boolean stackOut_28_0 = false;
        boolean stackOut_26_0 = false;
        int stackOut_30_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var8 = Kickabout.field_G;
        try {
          L0: {
            if (null != ((wt) this).field_w) {
              var5 = ((wt) this).field_w;
              var6 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (~var6 <= ~var5.length) {
                      break L3;
                    } else {
                      var7 = var5[var6];
                      if (var8 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (null == var7) {
                            break L4;
                          } else {
                            if (!var7.b(35)) {
                              break L4;
                            } else {
                              if (!var7.a(param0, (byte) -123, param2, param3)) {
                                break L4;
                              } else {
                                stackOut_16_0 = 1;
                                stackIn_17_0 = stackOut_16_0;
                                return stackIn_17_0 != 0;
                              }
                            }
                          }
                        }
                        var6++;
                        if (var8 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  if (param1 < -60) {
                    break L2;
                  } else {
                    field_v = -42;
                    break L2;
                  }
                }
                var5_int = param3;
                if (80 == var5_int) {
                  L5: {
                    if (!ne.field_G[81]) {
                      stackOut_28_0 = this.b(param2, 87);
                      stackIn_29_0 = stackOut_28_0;
                      break L5;
                    } else {
                      stackOut_26_0 = this.a(9, param2);
                      stackIn_29_0 = stackOut_26_0;
                      break L5;
                    }
                  }
                  return stackIn_29_0;
                } else {
                  stackOut_30_0 = 0;
                  stackIn_31_0 = stackOut_30_0;
                  break L0;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5_ref = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var5_ref;
            stackOut_32_1 = new StringBuilder().append("wt.E(").append(param0).append(',').append(param1).append(',');
            stackIn_35_0 = stackOut_32_0;
            stackIn_35_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param2 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L6;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_36_0 = stackOut_33_0;
              stackIn_36_1 = stackOut_33_1;
              stackIn_36_2 = stackOut_33_2;
              break L6;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ',' + param3 + ')');
        }
        return stackIn_31_0 != 0;
    }

    final static void a(int param0, nu param1, int param2, ut[] param3) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var5 = Kickabout.field_G;
        try {
          L0: {
            nw.field_b = param1;
            ek.field_G = param2;
            tm.field_n = param3;
            if (param0 == 0) {
              L1: {
                L2: {
                  if (ek.field_G == -2) {
                    break L2;
                  } else {
                    af.field_a = new dt[4];
                    var4_int = 0;
                    L3: while (true) {
                      L4: {
                        if (var4_int >= 4) {
                          break L4;
                        } else {
                          af.field_a[var4_int] = new dt((gm) (Object) nw.field_b.field_P[nw.field_b.field_g[ek.field_G].field_p][var4_int - -1], var4_int + 1);
                          var4_int++;
                          if (var5 != 0) {
                            break L1;
                          } else {
                            if (var5 == 0) {
                              continue L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                af.field_a = null;
                break L1;
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) runtimeException;
            stackOut_14_1 = new StringBuilder().append("wt.G(").append(param0).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param2).append(',');
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L6;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
    }

    final static boolean a(tj param0, nl param1, byte param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        int stackIn_20_0 = 0;
        nl stackIn_23_0 = null;
        nl stackIn_25_0 = null;
        nl stackIn_27_0 = null;
        nl stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_34_0 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        nl stackOut_22_0 = null;
        nl stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        nl stackOut_23_0 = null;
        nl stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        try {
          L0: {
            L1: {
              if (-1 != param0.field_m) {
                break L1;
              } else {
                if (0 == param0.field_h) {
                  break L1;
                } else {
                  L2: {
                    var4_int = -(param1.field_o >> 235307553) + 20;
                    if (param2 == -75) {
                      break L2;
                    } else {
                      wn discarded$1 = wt.a(69, (String[]) null);
                      break L2;
                    }
                  }
                  L3: {
                    var5 = (param1.field_w + -param0.field_p) / param0.field_h;
                    var5 = 9 * var5 >> -468456381;
                    if (var5 <= 2) {
                      break L3;
                    } else {
                      if (var5 >= var4_int) {
                        break L3;
                      } else {
                        L4: {
                          var6 = param0.field_t - -(param0.field_q * var5);
                          var7 = Math.abs(-var6 + param1.field_M);
                          if (var6 <= 24379392) {
                            break L4;
                          } else {
                            if (var6 < 34275328) {
                              L5: {
                                L6: {
                                  if (-28 + (var7 >> 1397024848) > 12) {
                                    break L6;
                                  } else {
                                    L7: {
                                      stackOut_22_0 = (nl) param1;
                                      stackIn_27_0 = stackOut_22_0;
                                      stackIn_23_0 = stackOut_22_0;
                                      if (~param1.field_M > ~var6) {
                                        stackOut_27_0 = (nl) (Object) stackIn_27_0;
                                        stackOut_27_1 = 8;
                                        stackIn_28_0 = stackOut_27_0;
                                        stackIn_28_1 = stackOut_27_1;
                                        break L7;
                                      } else {
                                        stackOut_23_0 = (nl) (Object) stackIn_23_0;
                                        stackIn_25_0 = stackOut_23_0;
                                        stackOut_25_0 = (nl) (Object) stackIn_25_0;
                                        stackOut_25_1 = 2;
                                        stackIn_28_0 = stackOut_25_0;
                                        stackIn_28_1 = stackOut_25_1;
                                        break L7;
                                      }
                                    }
                                    stackIn_28_0.field_G = stackIn_28_1;
                                    if (Kickabout.field_G == 0) {
                                      break L5;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                                param1.c(var6, 5);
                                break L5;
                              }
                              stackOut_31_0 = 1;
                              stackIn_32_0 = stackOut_31_0;
                              return stackIn_32_0 != 0;
                            } else {
                              break L4;
                            }
                          }
                        }
                        param1.field_G = 0;
                        stackOut_19_0 = 0;
                        stackIn_20_0 = stackOut_19_0;
                        return stackIn_20_0 != 0;
                      }
                    }
                  }
                  stackOut_33_0 = 0;
                  stackIn_34_0 = stackOut_33_0;
                  break L0;
                }
              }
            }
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            return stackIn_7_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var4;
            stackOut_35_1 = new StringBuilder().append("wt.F(");
            stackIn_38_0 = stackOut_35_0;
            stackIn_38_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param0 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L8;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_39_0 = stackOut_36_0;
              stackIn_39_1 = stackOut_36_1;
              stackIn_39_2 = stackOut_36_2;
              break L8;
            }
          }
          L9: {
            stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
            stackOut_39_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',');
            stackIn_42_0 = stackOut_39_0;
            stackIn_42_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param1 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L9;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_43_0 = stackOut_40_0;
              stackIn_43_1 = stackOut_40_1;
              stackIn_43_2 = stackOut_40_2;
              break L9;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_43_0, stackIn_43_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_34_0 != 0;
    }

    final static wn a(int param0, String[] param1) {
        wn var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        wn stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        wn stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 <= -108) {
              var2 = new wn(false);
              var2.field_f = param1;
              stackOut_3_0 = (wn) var2;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (wn) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2_ref;
            stackOut_5_1 = new StringBuilder().append("wt.A(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_4_0;
    }

    abstract void a(byte param0);

    void a(int param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        fd var6 = null;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (0 != param0) {
                break L1;
              } else {
                if (null == ((wt) this).field_r) {
                  break L1;
                } else {
                  ((wt) this).field_r.a(126, true, param3, (fd) this, param2);
                  break L1;
                }
              }
            }
            L2: {
              if (param1 == 65) {
                break L2;
              } else {
                field_x = -84;
                break L2;
              }
            }
            L3: {
              L4: {
                if (((wt) this).field_w != null) {
                  var5_int = ((wt) this).field_w.length + -1;
                  L5: while (true) {
                    if (var5_int < 0) {
                      break L4;
                    } else {
                      var6 = ((wt) this).field_w[var5_int];
                      if (var7 != 0) {
                        break L3;
                      } else {
                        L6: {
                          if (null == var6) {
                            break L6;
                          } else {
                            var6.a(param0, 65, param2 - -((wt) this).field_t, ((wt) this).field_g + param3);
                            break L6;
                          }
                        }
                        var5_int--;
                        if (var7 == 0) {
                          continue L5;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                } else {
                  break L4;
                }
              }
              break L3;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var5, "wt.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final String f(int param0) {
        fd[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        fd var4 = null;
        String var5 = null;
        int var6 = 0;
        Object stackIn_3_0 = null;
        String stackIn_14_0 = null;
        Object stackIn_17_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_13_0 = null;
        Object stackOut_16_0 = null;
        Object stackOut_2_0 = null;
        var6 = Kickabout.field_G;
        try {
          L0: {
            if (((wt) this).field_w != null) {
              L1: {
                var2 = ((wt) this).field_w;
                if (param0 == -1) {
                  break L1;
                } else {
                  field_A = null;
                  break L1;
                }
              }
              var3 = 0;
              L2: while (true) {
                L3: {
                  if (~var2.length >= ~var3) {
                    break L3;
                  } else {
                    L4: {
                      var4 = var2[var3];
                      if (var4 == null) {
                        break L4;
                      } else {
                        var5 = var4.f(-1);
                        if (null != var5) {
                          stackOut_13_0 = (String) var5;
                          stackIn_14_0 = stackOut_13_0;
                          return stackIn_14_0;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var3++;
                    if (var6 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
                stackOut_16_0 = null;
                stackIn_17_0 = stackOut_16_0;
                break L0;
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (String) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2_ref, "wt.MA(" + param0 + ')');
        }
        return (String) (Object) stackIn_17_0;
    }

    final int f(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        fd[] var3 = null;
        int var4 = 0;
        fd var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        var7 = Kickabout.field_G;
        try {
          L0: {
            var2_int = 0;
            var3 = ((wt) this).field_w;
            var4 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var3.length <= var4) {
                    break L3;
                  } else {
                    var5 = var3[var4];
                    if (var7 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (var5 == null) {
                          break L4;
                        } else {
                          var6 = var5.f((byte) 118);
                          if (var2_int >= var6) {
                            break L4;
                          } else {
                            var2_int = var6;
                            break L4;
                          }
                        }
                      }
                      var4++;
                      if (var7 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 == 118) {
                  break L2;
                } else {
                  boolean discarded$2 = ((wt) this).a(20, (fd) null, 22, -126, -123, 63, -127);
                  break L2;
                }
              }
              stackOut_13_0 = var2_int;
              stackIn_14_0 = stackOut_13_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "wt.NA(" + param0 + ')');
        }
        return stackIn_14_0;
    }

    wt(int param0, int param1, int param2, int param3, gj param4) {
        super(param0, param1, param2, param3, param4, (jv) null);
    }

    final boolean a(boolean param0, int param1, int param2, fd param3, int param4, int param5, int param6) {
        fd[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        fd var10 = null;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var11 = Kickabout.field_G;
        try {
          L0: {
            if (((wt) this).field_w != null) {
              L1: {
                if (param0) {
                  break L1;
                } else {
                  field_v = -64;
                  break L1;
                }
              }
              var8 = ((wt) this).field_w;
              var9 = 0;
              L2: while (true) {
                L3: {
                  if (var9 >= var8.length) {
                    break L3;
                  } else {
                    L4: {
                      var10 = var8[var9];
                      if (var10 == null) {
                        break L4;
                      } else {
                        if (var10.a(param0, param1 - -((wt) this).field_g, param2, param3, param4, param5 - -((wt) this).field_t, param6)) {
                          stackOut_15_0 = 1;
                          stackIn_16_0 = stackOut_15_0;
                          return stackIn_16_0 != 0;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var9++;
                    if (var11 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
                stackOut_18_0 = 0;
                stackIn_19_0 = stackOut_18_0;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8_ref = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var8_ref;
            stackOut_20_1 = new StringBuilder().append("wt.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
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
          throw nb.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_19_0 != 0;
    }

    private final fd a(boolean param0) {
        fd[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        fd var4 = null;
        int var5 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        fd stackIn_14_0 = null;
        Object stackIn_20_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        fd stackOut_13_0 = null;
        Object stackOut_19_0 = null;
        Object stackOut_2_0 = null;
        var5 = Kickabout.field_G;
        try {
          L0: {
            if (null != ((wt) this).field_w) {
              var2 = ((wt) this).field_w;
              var3 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (~var3 <= ~var2.length) {
                      break L3;
                    } else {
                      var4 = var2[var3];
                      stackOut_6_0 = null;
                      stackIn_20_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (stackIn_7_0 == (Object) (Object) var4) {
                            break L4;
                          } else {
                            if (!var4.b(100)) {
                              break L4;
                            } else {
                              stackOut_13_0 = (fd) var4;
                              stackIn_14_0 = stackOut_13_0;
                              return stackIn_14_0;
                            }
                          }
                        }
                        var3++;
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L5: {
                    if (param0) {
                      break L5;
                    } else {
                      String discarded$2 = ((wt) this).f(91);
                      break L5;
                    }
                  }
                  stackOut_19_0 = null;
                  stackIn_20_0 = stackOut_19_0;
                  break L2;
                }
                break L0;
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (fd) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2_ref, "wt.D(" + param0 + ')');
        }
        return (fd) (Object) stackIn_20_0;
    }

    final void a(int param0, int param1, int param2, fd param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        fd[] var7 = null;
        int var8 = 0;
        fd var9 = null;
        int var10 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var10 = Kickabout.field_G;
        try {
          L0: {
            if (null != ((wt) this).field_w) {
              var7 = ((wt) this).field_w;
              var8 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var7.length <= var8) {
                      break L3;
                    } else {
                      var9 = var7[var8];
                      if (var10 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (var9 == null) {
                            break L4;
                          } else {
                            var9.a(((wt) this).field_g + param0, param1, param2, param3, -1, ((wt) this).field_t + param5);
                            break L4;
                          }
                        }
                        var8++;
                        if (var10 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  if (param4 == -1) {
                    break L2;
                  } else {
                    wh discarded$3 = wt.a(-45, false, false, 110, 69, -102);
                    break L2;
                  }
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) runtimeException;
            stackOut_16_1 = new StringBuilder().append("wt.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L5;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    void a(byte param0, fd param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        fd[] var5 = null;
        int var6 = 0;
        fd var7 = null;
        int var8 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var8 = Kickabout.field_G;
        try {
          L0: {
            super.a(param0, param1, param2, param3);
            if (null != ((wt) this).field_w) {
              var5 = ((wt) this).field_w;
              var6 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var6 >= var5.length) {
                      break L3;
                    } else {
                      var7 = var5[var6];
                      if (var8 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (var7 == null) {
                            break L4;
                          } else {
                            var7.a((byte) 12, param1, ((wt) this).field_t + param2, ((wt) this).field_g + param3);
                            break L4;
                          }
                        }
                        var6++;
                        if (var8 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  break L2;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) runtimeException;
            stackOut_13_1 = new StringBuilder().append("wt.P(").append(param0).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L5;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final boolean a(int param0, fd param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        fd var5 = null;
        fd var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        fd stackIn_10_0 = null;
        fd stackIn_15_0 = null;
        int stackIn_22_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        fd stackOut_9_0 = null;
        fd stackOut_14_0 = null;
        int stackOut_21_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var7 = Kickabout.field_G;
        try {
          L0: {
            if (((wt) this).field_w != null) {
              L1: {
                if (param0 == -17305) {
                  break L1;
                } else {
                  field_z = null;
                  break L1;
                }
              }
              var4_int = -1 + ((wt) this).field_w.length;
              L2: while (true) {
                L3: {
                  if (var4_int < 0) {
                    break L3;
                  } else {
                    stackOut_9_0 = ((wt) this).field_w[var4_int];
                    stackIn_10_0 = stackOut_9_0;
                    L4: while (true) {
                      L5: {
                        var5 = stackIn_10_0;
                        if (null == var5) {
                          break L5;
                        } else {
                          if (!var5.b(92)) {
                            break L5;
                          } else {
                            var4_int = var4_int - param2;
                            L6: while (true) {
                              if (var4_int < 0) {
                                break L5;
                              } else {
                                var6 = ((wt) this).field_w[var4_int];
                                stackOut_14_0 = (fd) var6;
                                stackIn_10_0 = stackOut_14_0;
                                stackIn_15_0 = stackOut_14_0;
                                if (var7 != 0) {
                                  continue L4;
                                } else {
                                  L7: {
                                    if (stackIn_15_0 == null) {
                                      break L7;
                                    } else {
                                      if (var6.a(param1, 0)) {
                                        stackOut_21_0 = 1;
                                        stackIn_22_0 = stackOut_21_0;
                                        return stackIn_22_0 != 0;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                  var4_int = var4_int - param2;
                                  if (var7 == 0) {
                                    continue L6;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      var4_int--;
                      if (var7 == 0) {
                        continue L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_25_0 = 0;
                stackIn_26_0 = stackOut_25_0;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var4;
            stackOut_27_1 = new StringBuilder().append("wt.K(").append(param0).append(',');
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L8;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ',' + param2 + ')');
        }
        return stackIn_26_0 != 0;
    }

    final void g(int param0) {
        RuntimeException runtimeException = null;
        fd[] var2 = null;
        int var3 = 0;
        fd var4 = null;
        int var5 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_13_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_11_0 = null;
        var5 = Kickabout.field_G;
        try {
          L0: {
            var2 = ((wt) this).field_w;
            var3 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (~var2.length >= ~var3) {
                      break L4;
                    } else {
                      var4 = var2[var3];
                      stackOut_3_0 = null;
                      stackIn_13_0 = stackOut_3_0;
                      stackIn_4_0 = stackOut_3_0;
                      if (var5 != 0) {
                        break L3;
                      } else {
                        L5: {
                          if (stackIn_4_0 == (Object) (Object) var4) {
                            break L5;
                          } else {
                            var4.g(84);
                            break L5;
                          }
                        }
                        var3++;
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (param0 == 84) {
                    break L2;
                  } else {
                    stackOut_11_0 = null;
                    stackIn_13_0 = stackOut_11_0;
                    break L3;
                  }
                }
                field_z = (ut[]) (Object) stackIn_13_0;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw nb.a((Throwable) (Object) runtimeException, "wt.FA(" + param0 + ')');
        }
    }

    final boolean a(int param0, fd param1, int param2, int param3, int param4, int param5, int param6) {
        fd[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        fd var10 = null;
        int var11 = 0;
        int stackIn_5_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_24_0 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var11 = Kickabout.field_G;
        try {
          L0: {
            if (null == ((wt) this).field_w) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              var8 = ((wt) this).field_w;
              var9 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var9 >= var8.length) {
                      break L3;
                    } else {
                      var10 = var8[var9];
                      if (var11 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (var10 == null) {
                            break L4;
                          } else {
                            if (!var10.b(127)) {
                              break L4;
                            } else {
                              if (var10.a(param0, param1, param2, param3, param4, param5, -87)) {
                                stackOut_20_0 = 1;
                                stackIn_21_0 = stackOut_20_0;
                                return stackIn_21_0 != 0;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        var9++;
                        if (var11 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  var9 = -27 / ((param6 - 63) / 56);
                  break L2;
                }
                stackOut_24_0 = 0;
                stackIn_25_0 = stackOut_24_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8_ref = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var8_ref;
            stackOut_26_1 = new StringBuilder().append("wt.BA(").append(param0).append(',');
            stackIn_29_0 = stackOut_26_0;
            stackIn_29_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L5;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_30_0 = stackOut_27_0;
              stackIn_30_1 = stackOut_27_1;
              stackIn_30_2 = stackOut_27_2;
              break L5;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_25_0 != 0;
    }

    final boolean a(fd param0, int param1) {
        fd[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        fd var5 = null;
        int var6 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var6 = Kickabout.field_G;
        try {
          L0: {
            var3 = ((wt) this).field_w;
            var4 = param1;
            L1: while (true) {
              L2: {
                if (var4 >= var3.length) {
                  break L2;
                } else {
                  L3: {
                    var5 = var3[var4];
                    if (null == var5) {
                      break L3;
                    } else {
                      if (var5.a(param0, param1)) {
                        stackOut_9_0 = 1;
                        stackIn_10_0 = stackOut_9_0;
                        return stackIn_10_0 != 0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var4++;
                  if (var6 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_12_0 = 0;
              stackIn_13_0 = stackOut_12_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3_ref;
            stackOut_14_1 = new StringBuilder().append("wt.HA(");
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L4;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param1 + ')');
        }
        return stackIn_13_0 != 0;
    }

    static {
    }
}
