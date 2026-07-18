/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ek extends vg implements ni {
    static String field_H;
    static String field_y;
    static bi field_z;
    vg[] field_B;
    static String field_G;
    static int field_A;
    static qr field_E;
    static bc field_D;
    static boolean[] field_F;

    private final boolean a(int param0, int param1, vg param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        vg var6 = null;
        vg var7 = null;
        int var8 = 0;
        int stackIn_3_0 = 0;
        Object stackIn_7_0 = null;
        vg stackIn_7_1 = null;
        Object stackIn_15_0 = null;
        vg stackIn_15_1 = null;
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
        Object stackOut_6_0 = null;
        vg stackOut_6_1 = null;
        Object stackOut_14_0 = null;
        vg stackOut_14_1 = null;
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
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var4_int = 24 / ((param1 - -58) / 41);
            if (null != ((ek) this).field_B) {
              var5 = ((ek) this).field_B.length - 1;
              L1: while (true) {
                L2: {
                  if (var5 < 0) {
                    break L2;
                  } else {
                    var6 = ((ek) this).field_B[var5];
                    stackOut_6_0 = null;
                    stackOut_6_1 = (vg) var6;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    L3: while (true) {
                      L4: {
                        if (stackIn_7_0 == (Object) (Object) stackIn_7_1) {
                          break L4;
                        } else {
                          L5: {
                            if (var6.f(1)) {
                              break L5;
                            } else {
                              if (var8 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          var5 = var5 - param0;
                          L6: while (true) {
                            if (var5 < 0) {
                              break L4;
                            } else {
                              var7 = ((ek) this).field_B[var5];
                              stackOut_14_0 = null;
                              stackOut_14_1 = (vg) var7;
                              stackIn_7_0 = stackOut_14_0;
                              stackIn_7_1 = stackOut_14_1;
                              stackIn_15_0 = stackOut_14_0;
                              stackIn_15_1 = stackOut_14_1;
                              if (var8 != 0) {
                                continue L3;
                              } else {
                                L7: {
                                  if (stackIn_15_0 == (Object) (Object) stackIn_15_1) {
                                    break L7;
                                  } else {
                                    if (var7.a((byte) 123, param2)) {
                                      stackOut_21_0 = 1;
                                      stackIn_22_0 = stackOut_21_0;
                                      return stackIn_22_0 != 0;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                                var5 = var5 - param0;
                                if (var8 == 0) {
                                  continue L6;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                        }
                      }
                      var5--;
                      if (var8 == 0) {
                        continue L1;
                      } else {
                        break L2;
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
            stackOut_27_1 = new StringBuilder().append("ek.H(").append(param0).append(',').append(param1).append(',');
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param2 == null) {
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
          throw r.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ')');
        }
        return stackIn_26_0 != 0;
    }

    final boolean a(int param0, int param1, int param2, vg param3, int param4, int param5, int param6) {
        vg[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        vg var10 = null;
        int var11 = 0;
        int stackIn_5_0 = 0;
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
        int stackOut_4_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (((ek) this).field_B == null) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              var8 = ((ek) this).field_B;
              var9 = param0;
              L1: while (true) {
                L2: {
                  if (var8.length <= var9) {
                    break L2;
                  } else {
                    L3: {
                      var10 = var8[var9];
                      if (null == var10) {
                        break L3;
                      } else {
                        if (!var10.f(1)) {
                          break L3;
                        } else {
                          if (!var10.a(param0, param1, param2, param3, param4, param5, param6)) {
                            break L3;
                          } else {
                            stackOut_15_0 = 1;
                            stackIn_16_0 = stackOut_15_0;
                            return stackIn_16_0 != 0;
                          }
                        }
                      }
                    }
                    var9++;
                    if (var11 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_18_0 = 0;
                stackIn_19_0 = stackOut_18_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8_ref = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var8_ref;
            stackOut_20_1 = new StringBuilder().append("ek.MA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
              break L4;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L4;
            }
          }
          throw r.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_19_0 != 0;
    }

    ek(int param0, int param1, int param2, int param3, iq param4) {
        super(param0, param1, param2, param3, param4, (ko) null);
    }

    final boolean a(int param0, char param1, int param2, vg param3) {
        vg[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        int var6 = 0;
        vg var7 = null;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_19_0 = 0;
        boolean stackIn_28_0 = false;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_29_0 = 0;
        boolean stackOut_27_0 = false;
        boolean stackOut_25_0 = false;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (null != ((ek) this).field_B) {
              L1: {
                if (param2 == 13) {
                  break L1;
                } else {
                  bi[] discarded$2 = ek.a(12, 50, -9, 113, (byte) 82);
                  break L1;
                }
              }
              var5 = ((ek) this).field_B;
              var6 = 0;
              L2: while (true) {
                L3: {
                  if (var6 >= var5.length) {
                    break L3;
                  } else {
                    L4: {
                      var7 = var5[var6];
                      if (var7 == null) {
                        break L4;
                      } else {
                        if (!var7.f(1)) {
                          break L4;
                        } else {
                          if (var7.a(param0, param1, 13, param3)) {
                            stackOut_18_0 = 1;
                            stackIn_19_0 = stackOut_18_0;
                            return stackIn_19_0 != 0;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var6++;
                    if (var8 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var5_int = param0;
                if (80 != var5_int) {
                  stackOut_29_0 = 0;
                  stackIn_30_0 = stackOut_29_0;
                  break L0;
                } else {
                  L5: {
                    if (di.field_p[81]) {
                      stackOut_27_0 = this.a(111, param3);
                      stackIn_28_0 = stackOut_27_0;
                      break L5;
                    } else {
                      stackOut_25_0 = this.a(param3, -1);
                      stackIn_28_0 = stackOut_25_0;
                      break L5;
                    }
                  }
                  return stackIn_28_0;
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
            stackOut_31_0 = (RuntimeException) var5_ref;
            stackOut_31_1 = new StringBuilder().append("ek.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_34_0 = stackOut_31_0;
            stackIn_34_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param3 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L6;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_35_0 = stackOut_32_0;
              stackIn_35_1 = stackOut_32_1;
              stackIn_35_2 = stackOut_32_2;
              break L6;
            }
          }
          throw r.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ')');
        }
        return stackIn_30_0 != 0;
    }

    private final boolean a(vg param0, int param1) {
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
              if (param1 == -1) {
                break L1;
              } else {
                boolean discarded$2 = ek.a(-30, 122, -111, (byte) 51, -17, -36, -28);
                break L1;
              }
            }
            stackOut_3_0 = this.a(param0, (byte) -110, 1);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("ek.A(");
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
          throw r.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    private final void a(int param0, StringBuilder param1, Hashtable param2, int param3) {
        RuntimeException runtimeException = null;
        vg[] var5 = null;
        int var6 = 0;
        vg var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (((ek) this).field_B != null) {
              var5 = ((ek) this).field_B;
              var6 = param3;
              L1: while (true) {
                L2: {
                  L3: {
                    if (~var6 <= ~var5.length) {
                      break L3;
                    } else {
                      var7 = var5[var6];
                      StringBuilder discarded$14 = param1.append('\n');
                      if (var9 != 0) {
                        break L2;
                      } else {
                        var8 = 0;
                        L4: while (true) {
                          L5: {
                            L6: {
                              L7: {
                                if (~param0 > ~var8) {
                                  break L7;
                                } else {
                                  StringBuilder discarded$15 = param1.append(' ');
                                  var8++;
                                  if (var9 != 0) {
                                    break L6;
                                  } else {
                                    if (var9 == 0) {
                                      continue L4;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              if (null == var7) {
                                break L6;
                              } else {
                                StringBuilder discarded$16 = var7.a((byte) -28, param2, 1 + param0, param1);
                                if (var9 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            StringBuilder discarded$17 = param1.append("null");
                            break L5;
                          }
                          var6++;
                          if (var9 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
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
          L8: {
            runtimeException = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) runtimeException;
            stackOut_19_1 = new StringBuilder().append("ek.I(").append(param0).append(',');
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L8;
            }
          }
          L9: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
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
          throw r.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 > 99) {
                break L1;
              } else {
                vg discarded$2 = this.a((byte) 48);
                break L1;
              }
            }
            super.a(param0, param1, (byte) 101, param3, param4);
            ((ek) this).h(116);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var6, "ek.IA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static bi[] a(int param0, int param1, int param2, int param3, byte param4) {
        RuntimeException var5 = null;
        bi[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        bi[] stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (param4 == -92) {
                break L1;
              } else {
                field_E = null;
                break L1;
              }
            }
            stackOut_3_0 = pg.a(param2, 1, 1, (byte) -41, param3, param0, 3, 1, param1);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var5, "ek.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_4_0;
    }

    final static boolean a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        try {
          L0: {
            L1: {
              if (param3 < -66) {
                break L1;
              } else {
                ek.a(-78);
                break L1;
              }
            }
            L2: {
              L3: {
                if (param2 > param1) {
                  break L3;
                } else {
                  if (param2 + param5 <= param1) {
                    break L3;
                  } else {
                    if (param6 < param4) {
                      break L3;
                    } else {
                      if (param6 >= param0 + param4) {
                        break L3;
                      } else {
                        stackOut_13_0 = 1;
                        stackIn_16_0 = stackOut_13_0;
                        break L2;
                      }
                    }
                  }
                }
              }
              stackOut_15_0 = 0;
              stackIn_16_0 = stackOut_15_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var7, "ek.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_16_0 != 0;
    }

    final void e(byte param0) {
        RuntimeException runtimeException = null;
        vg[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        vg var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var2 = ((ek) this).field_B;
            var3 = 119 % ((param0 - -84) / 33);
            var4 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var2.length >= ~var4) {
                    break L3;
                  } else {
                    var5 = var2[var4];
                    if (var6 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (var5 == null) {
                          break L4;
                        } else {
                          var5.e((byte) 6);
                          break L4;
                        }
                      }
                      var4++;
                      if (var6 == 0) {
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
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) (Object) runtimeException, "ek.OA(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_D = null;
              field_z = null;
              field_F = null;
              field_y = null;
              field_G = null;
              field_E = null;
              if (param0 == -1) {
                break L1;
              } else {
                field_F = null;
                break L1;
              }
            }
            field_H = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1, "ek.G(" + param0 + ')');
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        vg var6 = null;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 != 0) {
                break L1;
              } else {
                if (null == ((ek) this).field_p) {
                  break L1;
                } else {
                  ((ek) this).field_p.a((vg) this, param3, true, param2, (byte) 12);
                  break L1;
                }
              }
            }
            L2: {
              if (param1 == -11857) {
                break L2;
              } else {
                ((ek) this).a(-17, 93, (byte) 121, 115, -79);
                break L2;
              }
            }
            L3: {
              L4: {
                if (((ek) this).field_B != null) {
                  var5_int = -1 + ((ek) this).field_B.length;
                  L5: while (true) {
                    if (var5_int < 0) {
                      break L4;
                    } else {
                      var6 = ((ek) this).field_B[var5_int];
                      if (var7 != 0) {
                        break L3;
                      } else {
                        L6: {
                          if (null == var6) {
                            break L6;
                          } else {
                            var6.a(param0, param1, ((ek) this).field_q + param2, ((ek) this).field_m + param3);
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
          throw r.a((Throwable) (Object) var5, "ek.AA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, int param1, byte param2, int param3, int param4, int param5, vg param6) {
        vg[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        vg var10 = null;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (null != ((ek) this).field_B) {
              var8 = ((ek) this).field_B;
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
                          if (null == var10) {
                            break L4;
                          } else {
                            if (!var10.a(param0, param1, (byte) 111, param3, ((ek) this).field_m + param4, ((ek) this).field_q + param5, param6)) {
                              break L4;
                            } else {
                              stackOut_13_0 = 1;
                              stackIn_14_0 = stackOut_13_0;
                              return stackIn_14_0 != 0;
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
                  if (param2 >= 95) {
                    break L2;
                  } else {
                    stackOut_17_0 = 1;
                    stackIn_18_0 = stackOut_17_0;
                    return stackIn_18_0 != 0;
                  }
                }
                stackOut_19_0 = 0;
                stackIn_20_0 = stackOut_19_0;
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
            stackOut_21_0 = (RuntimeException) var8_ref;
            stackOut_21_1 = new StringBuilder().append("ek.TA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param6 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L5;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L5;
            }
          }
          throw r.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
        }
        return stackIn_20_0 != 0;
    }

    private final vg a(byte param0) {
        vg[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        vg var4 = null;
        int var5 = 0;
        Object stackIn_5_0 = null;
        vg stackIn_16_0 = null;
        Object stackIn_22_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        vg stackOut_15_0 = null;
        Object stackOut_21_0 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (null == ((ek) this).field_B) {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (vg) (Object) stackIn_5_0;
            } else {
              var2 = ((ek) this).field_B;
              var3 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var3 >= var2.length) {
                      break L3;
                    } else {
                      var4 = var2[var3];
                      if (var5 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (var4 == null) {
                            break L4;
                          } else {
                            if (!var4.f(1)) {
                              break L4;
                            } else {
                              stackOut_15_0 = (vg) var4;
                              stackIn_16_0 = stackOut_15_0;
                              return stackIn_16_0;
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
                  if (param0 == -96) {
                    break L2;
                  } else {
                    field_z = null;
                    break L2;
                  }
                }
                stackOut_21_0 = null;
                stackIn_22_0 = stackOut_21_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2_ref, "ek.L(" + param0 + ')');
        }
        return (vg) (Object) stackIn_22_0;
    }

    final boolean f(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == 1) {
              L1: {
                if (null == this.a((byte) -96)) {
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
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "ek.EA(" + param0 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, vg param5) {
        RuntimeException runtimeException = null;
        vg[] var7 = null;
        int var8 = 0;
        vg var9 = null;
        int var10 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        Object stackOut_14_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (((ek) this).field_B == null) {
              return;
            } else {
              var7 = ((ek) this).field_B;
              var8 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    L4: {
                      if (var8 >= var7.length) {
                        break L4;
                      } else {
                        var9 = var7[var8];
                        stackOut_6_0 = null;
                        stackIn_16_0 = stackOut_6_0;
                        stackIn_7_0 = stackOut_6_0;
                        if (var10 != 0) {
                          break L3;
                        } else {
                          L5: {
                            if (stackIn_7_0 == (Object) (Object) var9) {
                              break L5;
                            } else {
                              var9.a(param0, ((ek) this).field_q + param1, param2 - -((ek) this).field_m, param3, -600269855, param5);
                              break L5;
                            }
                          }
                          var8++;
                          if (var10 == 0) {
                            continue L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    if (param4 == -600269855) {
                      break L2;
                    } else {
                      stackOut_14_0 = null;
                      stackIn_16_0 = stackOut_14_0;
                      break L3;
                    }
                  }
                  field_E = (qr) (Object) stackIn_16_0;
                  break L2;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) runtimeException;
            stackOut_18_1 = new StringBuilder().append("ek.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param5 == null) {
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
          throw r.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
    }

    abstract void h(int param0);

    final boolean a(byte param0, vg param1) {
        vg[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        vg var6 = null;
        int var7 = 0;
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
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var4 = 101 / ((61 - param0) / 59);
            var3 = ((ek) this).field_B;
            var5 = 0;
            L1: while (true) {
              L2: {
                if (~var5 <= ~var3.length) {
                  break L2;
                } else {
                  L3: {
                    var6 = var3[var5];
                    if (null == var6) {
                      break L3;
                    } else {
                      if (var6.a((byte) -10, param1)) {
                        stackOut_9_0 = 1;
                        stackIn_10_0 = stackOut_9_0;
                        return stackIn_10_0 != 0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var5++;
                  if (var7 == 0) {
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
            stackOut_14_1 = new StringBuilder().append("ek.CA(").append(param0).append(',');
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
          throw r.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
        return stackIn_13_0 != 0;
    }

    private final boolean a(vg param0, byte param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        vg var5 = null;
        vg var6 = null;
        int var7 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        vg stackIn_12_0 = null;
        vg stackIn_20_0 = null;
        int stackIn_28_0 = 0;
        int stackIn_32_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        vg stackOut_11_0 = null;
        vg stackOut_19_0 = null;
        int stackOut_27_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (((ek) this).field_B == null) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              if (param1 <= -70) {
                var4_int = 0;
                L1: while (true) {
                  L2: {
                    if (~((ek) this).field_B.length >= ~var4_int) {
                      break L2;
                    } else {
                      stackOut_11_0 = ((ek) this).field_B[var4_int];
                      stackIn_12_0 = stackOut_11_0;
                      L3: while (true) {
                        L4: {
                          var5 = stackIn_12_0;
                          if (null == var5) {
                            break L4;
                          } else {
                            L5: {
                              if (var5.f(1)) {
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
                              if (~var4_int <= ~((ek) this).field_B.length) {
                                break L4;
                              } else {
                                var6 = ((ek) this).field_B[var4_int];
                                stackOut_19_0 = (vg) var6;
                                stackIn_12_0 = stackOut_19_0;
                                stackIn_20_0 = stackOut_19_0;
                                if (var7 != 0) {
                                  continue L3;
                                } else {
                                  L7: {
                                    L8: {
                                      if (stackIn_20_0 != null) {
                                        break L8;
                                      } else {
                                        if (var7 == 0) {
                                          break L7;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                    if (!var6.a((byte) 126, param0)) {
                                      break L7;
                                    } else {
                                      stackOut_27_0 = 1;
                                      stackIn_28_0 = stackOut_27_0;
                                      return stackIn_28_0 != 0;
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
                        if (var7 == 0) {
                          continue L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  stackOut_31_0 = 0;
                  stackIn_32_0 = stackOut_31_0;
                  break L0;
                }
              } else {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var4;
            stackOut_33_1 = new StringBuilder().append("ek.D(");
            stackIn_36_0 = stackOut_33_0;
            stackIn_36_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param0 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L9;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_37_0 = stackOut_34_0;
              stackIn_37_1 = stackOut_34_1;
              stackIn_37_2 = stackOut_34_2;
              break L9;
            }
          }
          throw r.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_32_0 != 0;
    }

    void a(int param0, int param1, vg param2, byte param3) {
        RuntimeException runtimeException = null;
        vg[] var5 = null;
        int var6 = 0;
        vg var7 = null;
        int var8 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            super.a(param0, param1, param2, param3);
            if (null == ((ek) this).field_B) {
              return;
            } else {
              var5 = ((ek) this).field_B;
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
                          if (null == var7) {
                            break L4;
                          } else {
                            var7.a(((ek) this).field_m + param0, param1 - -((ek) this).field_q, param2, (byte) 91);
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
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) runtimeException;
            stackOut_14_1 = new StringBuilder().append("ek.PA(").append(param0).append(',').append(param1).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
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
          throw r.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param3 + ')');
        }
    }

    final int e(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        vg[] var3 = null;
        int var4 = 0;
        vg var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_2_0 = 0;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            if (param0 == -600269855) {
              var3 = ((ek) this).field_B;
              var4 = 0;
              L1: while (true) {
                L2: {
                  if (var4 >= var3.length) {
                    break L2;
                  } else {
                    L3: {
                      var5 = var3[var4];
                      if (var5 == null) {
                        break L3;
                      } else {
                        var6 = var5.e(param0);
                        if (var6 <= var2_int) {
                          break L3;
                        } else {
                          var2_int = var6;
                          break L3;
                        }
                      }
                    }
                    var4++;
                    if (var7 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_10_0 = var2_int;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              }
            } else {
              stackOut_2_0 = -89;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "ek.KA(" + param0 + ')');
        }
        return stackIn_11_0;
    }

    private final boolean a(int param0, vg param1) {
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
            if (param0 >= 98) {
              stackOut_3_0 = this.a(1, 22, param1);
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
            stackOut_5_1 = new StringBuilder().append("ek.J(").append(param0).append(',');
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
          throw r.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_4_0;
    }

    final StringBuilder a(byte param0, Hashtable param1, int param2, StringBuilder param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        StringBuilder stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (!((ek) this).a(false, param2, param3, param1)) {
                break L1;
              } else {
                ((ek) this).a(param1, param2, false, param3);
                this.a(param2, param3, param1, 0);
                break L1;
              }
            }
            var5_int = -103 % ((64 - param0) / 61);
            stackOut_3_0 = (StringBuilder) param3;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("ek.NA(").append(param0).append(',');
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
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
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
          throw r.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        return stackIn_4_0;
    }

    final String c(boolean param0) {
        vg[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        vg var4 = null;
        String var5 = null;
        int var6 = 0;
        Object stackIn_5_0 = null;
        String stackIn_19_0 = null;
        Object stackIn_25_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        String stackOut_18_0 = null;
        Object stackOut_24_0 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (null == ((ek) this).field_B) {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (String) (Object) stackIn_5_0;
            } else {
              var2 = ((ek) this).field_B;
              var3 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (~var3 <= ~var2.length) {
                      break L3;
                    } else {
                      var4 = var2[var3];
                      if (var6 != 0) {
                        break L2;
                      } else {
                        L4: {
                          L5: {
                            if (var4 != null) {
                              break L5;
                            } else {
                              if (var6 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          var5 = var4.c(true);
                          if (var5 != null) {
                            stackOut_18_0 = (String) var5;
                            stackIn_19_0 = stackOut_18_0;
                            return stackIn_19_0;
                          } else {
                            break L4;
                          }
                        }
                        var3++;
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  if (param0) {
                    break L2;
                  } else {
                    boolean discarded$2 = ((ek) this).a(115, -37, -38, (vg) null, 68, 55, -109);
                    break L2;
                  }
                }
                stackOut_24_0 = null;
                stackIn_25_0 = stackOut_24_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2_ref, "ek.JA(" + param0 + ')');
        }
        return (String) (Object) stackIn_25_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "<%0> has resigned.";
        field_H = "Year of Great Beginnings";
        field_G = "Unrated game";
    }
}
