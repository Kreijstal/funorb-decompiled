/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bj extends ak {
    private boolean field_D;
    private int field_H;
    private int field_C;
    static ng field_E;
    private int field_G;
    private boolean field_F;
    private int field_B;

    final StringBuilder a(int param0, boolean param1, Hashtable param2, StringBuilder param3) {
        RuntimeException var5 = null;
        Object stackIn_6_0 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_7_0 = null;
        Object stackOut_5_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
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
              if (!((bj) this).a(param2, param3, (byte) 14, param0)) {
                break L1;
              } else {
                ((bj) this).a(param0, param3, param2, 32362);
                ((bj) this).a(param2, (byte) 12, param0, param3);
                StringBuilder discarded$26 = param3.append(" revert=").append(((bj) this).field_F);
                if (((bj) this).field_G == 2147483647) {
                  break L1;
                } else {
                  if (((bj) this).field_C == 2147483647) {
                    break L1;
                  } else {
                    StringBuilder discarded$27 = param3.append(" to ").append(((bj) this).field_G).append(44).append(((bj) this).field_C);
                    break L1;
                  }
                }
              }
            }
            if (param1) {
              stackOut_7_0 = (StringBuilder) param3;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_5_0 = null;
              stackIn_6_0 = stackOut_5_0;
              return (StringBuilder) (Object) stackIn_6_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5;
            stackOut_9_1 = new StringBuilder().append("bj.HA(").append(param0).append(44).append(param1).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          L3: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
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
          throw ii.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_8_0;
    }

    public static void k() {
        field_E = null;
    }

    final void a(int param0, int param1, lk param2, int param3, int param4, int param5) {
        try {
            super.a(param0, param1, param2, param3, (int) (char)param4, param5);
            ((bj) this).field_u = 0;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "bj.MA(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final static void a(wi param0, byte param1, int param2, si param3) {
        try {
            RuntimeException var4 = null;
            int var5 = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            int var6_int = 0;
            String var7 = null;
            String var8 = null;
            int var9 = 0;
            String[] var10 = null;
            int var11_int = 0;
            byte[][] var11 = null;
            Class[] var12 = null;
            int var12_int = 0;
            int var13 = 0;
            int var14 = 0;
            String var15 = null;
            String var16 = null;
            int var17 = 0;
            Object var18 = null;
            byte[][] var19 = null;
            byte[][] var20 = null;
            byte[][] var21 = null;
            byte[][] var22 = null;
            RuntimeException stackIn_34_0 = null;
            StringBuilder stackIn_34_1 = null;
            RuntimeException stackIn_35_0 = null;
            StringBuilder stackIn_35_1 = null;
            RuntimeException stackIn_36_0 = null;
            StringBuilder stackIn_36_1 = null;
            String stackIn_36_2 = null;
            RuntimeException stackIn_37_0 = null;
            StringBuilder stackIn_37_1 = null;
            RuntimeException stackIn_38_0 = null;
            StringBuilder stackIn_38_1 = null;
            RuntimeException stackIn_39_0 = null;
            StringBuilder stackIn_39_1 = null;
            String stackIn_39_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_33_0 = null;
            StringBuilder stackOut_33_1 = null;
            RuntimeException stackOut_35_0 = null;
            StringBuilder stackOut_35_1 = null;
            String stackOut_35_2 = null;
            RuntimeException stackOut_34_0 = null;
            StringBuilder stackOut_34_1 = null;
            String stackOut_34_2 = null;
            RuntimeException stackOut_36_0 = null;
            StringBuilder stackOut_36_1 = null;
            RuntimeException stackOut_38_0 = null;
            StringBuilder stackOut_38_1 = null;
            String stackOut_38_2 = null;
            RuntimeException stackOut_37_0 = null;
            StringBuilder stackOut_37_1 = null;
            String stackOut_37_2 = null;
            var14 = Bounce.field_N;
            try {
              L0: {
                var18 = (Object) (Object) new hh();
                ((hh) var18).field_j = param0.d((byte) -109);
                ((hh) var18).field_g = param0.j(-3);
                ((hh) var18).field_n = new mk[((hh) var18).field_j];
                ((hh) var18).field_o = new int[((hh) var18).field_j];
                ((hh) var18).field_i = new int[((hh) var18).field_j];
                ((hh) var18).field_l = new int[((hh) var18).field_j];
                ((hh) var18).field_m = new byte[((hh) var18).field_j][][];
                ((hh) var18).field_s = new mk[((hh) var18).field_j];
                var5 = 0;
                L1: while (true) {
                  if (~((hh) var18).field_j >= ~var5) {
                    ob.field_c.a(1, (ai) var18);
                    break L0;
                  } else {
                    try {
                      L2: {
                        L3: {
                          L4: {
                            L5: {
                              var6_int = param0.d((byte) -77);
                              if (var6_int == 0) {
                                break L5;
                              } else {
                                if (var6_int == 1) {
                                  break L5;
                                } else {
                                  if (2 == var6_int) {
                                    break L5;
                                  } else {
                                    L6: {
                                      if (var6_int == 3) {
                                        break L6;
                                      } else {
                                        if (var6_int != 4) {
                                          break L4;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                    var7 = param0.b(true);
                                    var8 = param0.b(true);
                                    var9 = param0.d((byte) -82);
                                    var10 = new String[var9];
                                    var11_int = 0;
                                    L7: while (true) {
                                      if (~var9 >= ~var11_int) {
                                        L8: {
                                          var22 = new byte[var9][];
                                          var21 = var22;
                                          var20 = var21;
                                          var19 = var20;
                                          var11 = var19;
                                          if (var6_int != 3) {
                                            break L8;
                                          } else {
                                            var12_int = 0;
                                            L9: while (true) {
                                              if (~var9 >= ~var12_int) {
                                                break L8;
                                              } else {
                                                var13 = param0.j(-3);
                                                var11[var12_int] = new byte[var13];
                                                param0.a((byte) 124, var13, var22[var12_int], 0);
                                                var12_int++;
                                                continue L9;
                                              }
                                            }
                                          }
                                        }
                                        ((hh) var18).field_o[var5] = var6_int;
                                        var12 = new Class[var9];
                                        var17 = 0;
                                        var13 = var17;
                                        L10: while (true) {
                                          if (~var17 <= ~var9) {
                                            int discarded$5 = -1;
                                            ((hh) var18).field_s[var5] = param3.a(var8, pf.a(var7), 8532, var12);
                                            ((hh) var18).field_m[var5] = var22;
                                            break L3;
                                          } else {
                                            int discarded$6 = -1;
                                            var12[var17] = pf.a(var10[var17]);
                                            var17++;
                                            continue L10;
                                          }
                                        }
                                      } else {
                                        var10[var11_int] = param0.b(true);
                                        var11_int++;
                                        continue L7;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            L11: {
                              String dupTemp$7 = param0.b(true);
                              var16 = dupTemp$7;
                              var7 = dupTemp$7;
                              String dupTemp$8 = param0.b(true);
                              var15 = dupTemp$8;
                              var8 = dupTemp$8;
                              var9 = 0;
                              if (var6_int == 1) {
                                var9 = param0.j(-3);
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                            ((hh) var18).field_o[var5] = var6_int;
                            ((hh) var18).field_l[var5] = var9;
                            int discarded$9 = -1;
                            ((hh) var18).field_n[var5] = param3.a(var15, pf.a(var16), (byte) 48);
                            break L4;
                          }
                          break L3;
                        }
                        break L2;
                      }
                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L12: {
                        var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                        ((hh) var18).field_i[var5] = -1;
                        break L12;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter3) {
                      decompiledCaughtException = decompiledCaughtParameter3;
                      L15: {
                        var6_ref3 = (Exception) (Object) decompiledCaughtException;
                        ((hh) var18).field_i[var5] = -4;
                        break L15;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      L16: {
                        var6_ref4 = decompiledCaughtException;
                        ((hh) var18).field_i[var5] = -5;
                        break L16;
                      }
                    }
                    var5++;
                    continue L1;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L17: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_33_0 = (RuntimeException) var4;
                stackOut_33_1 = new StringBuilder().append("bj.GA(");
                stackIn_35_0 = stackOut_33_0;
                stackIn_35_1 = stackOut_33_1;
                stackIn_34_0 = stackOut_33_0;
                stackIn_34_1 = stackOut_33_1;
                if (param0 == null) {
                  stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
                  stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
                  stackOut_35_2 = "null";
                  stackIn_36_0 = stackOut_35_0;
                  stackIn_36_1 = stackOut_35_1;
                  stackIn_36_2 = stackOut_35_2;
                  break L17;
                } else {
                  stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
                  stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
                  stackOut_34_2 = "{...}";
                  stackIn_36_0 = stackOut_34_0;
                  stackIn_36_1 = stackOut_34_1;
                  stackIn_36_2 = stackOut_34_2;
                  break L17;
                }
              }
              L18: {
                stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
                stackOut_36_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(44).append(-125).append(44).append(param2).append(44);
                stackIn_38_0 = stackOut_36_0;
                stackIn_38_1 = stackOut_36_1;
                stackIn_37_0 = stackOut_36_0;
                stackIn_37_1 = stackOut_36_1;
                if (param3 == null) {
                  stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
                  stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
                  stackOut_38_2 = "null";
                  stackIn_39_0 = stackOut_38_0;
                  stackIn_39_1 = stackOut_38_1;
                  stackIn_39_2 = stackOut_38_2;
                  break L18;
                } else {
                  stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
                  stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
                  stackOut_37_2 = "{...}";
                  stackIn_39_0 = stackOut_37_0;
                  stackIn_39_1 = stackOut_37_1;
                  stackIn_39_2 = stackOut_37_2;
                  break L18;
                }
              }
              throw ii.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, int param2, lk param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
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
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        try {
          L0: {
            if (param0 == -1) {
              L1: {
                L2: {
                  L3: {
                    L4: {
                      if (!(((bj) this).field_x instanceof wd)) {
                        break L4;
                      } else {
                        if (!((wd) (Object) ((bj) this).field_x).field_y) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (((bj) this).field_u != 1) {
                      break L3;
                    } else {
                      L5: {
                        var5_int = -param1 + (-((bj) this).field_B + uc.field_C);
                        var6 = ll.field_y + -((bj) this).field_H - param2;
                        if (((bj) this).field_r != var5_int) {
                          break L5;
                        } else {
                          if (var6 != ((bj) this).field_i) {
                            break L5;
                          } else {
                            break L2;
                          }
                        }
                      }
                      ((bj) this).field_r = var5_int;
                      ((bj) this).field_i = var6;
                      if (!(((bj) this).field_n instanceof ni)) {
                        break L2;
                      } else {
                        ((ni) (Object) ((bj) this).field_n).a(param2, (byte) -98, param1, (bj) this);
                        break L2;
                      }
                    }
                  }
                  if (((bj) this).field_F) {
                    L6: {
                      if (((bj) this).field_r == ((bj) this).field_G) {
                        break L6;
                      } else {
                        L7: {
                          var5_int = -((bj) this).field_r + ((bj) this).field_G;
                          stackOut_14_0 = this;
                          stackOut_14_1 = ((bj) this).field_r;
                          stackIn_16_0 = stackOut_14_0;
                          stackIn_16_1 = stackOut_14_1;
                          stackIn_15_0 = stackOut_14_0;
                          stackIn_15_1 = stackOut_14_1;
                          if (Math.abs(var5_int) <= 2) {
                            stackOut_16_0 = this;
                            stackOut_16_1 = stackIn_16_1;
                            stackIn_18_0 = stackOut_16_0;
                            stackIn_18_1 = stackOut_16_1;
                            stackIn_17_0 = stackOut_16_0;
                            stackIn_17_1 = stackOut_16_1;
                            if (var5_int > 0) {
                              stackOut_18_0 = this;
                              stackOut_18_1 = stackIn_18_1;
                              stackOut_18_2 = 1;
                              stackIn_19_0 = stackOut_18_0;
                              stackIn_19_1 = stackOut_18_1;
                              stackIn_19_2 = stackOut_18_2;
                              break L7;
                            } else {
                              stackOut_17_0 = this;
                              stackOut_17_1 = stackIn_17_1;
                              stackOut_17_2 = -1;
                              stackIn_19_0 = stackOut_17_0;
                              stackIn_19_1 = stackOut_17_1;
                              stackIn_19_2 = stackOut_17_2;
                              break L7;
                            }
                          } else {
                            stackOut_15_0 = this;
                            stackOut_15_1 = stackIn_15_1;
                            stackOut_15_2 = var5_int >> 1;
                            stackIn_19_0 = stackOut_15_0;
                            stackIn_19_1 = stackOut_15_1;
                            stackIn_19_2 = stackOut_15_2;
                            break L7;
                          }
                        }
                        ((bj) this).field_r = stackIn_19_1 + stackIn_19_2;
                        break L6;
                      }
                    }
                    if (((bj) this).field_C != ((bj) this).field_i) {
                      L8: {
                        var5_int = ((bj) this).field_C - ((bj) this).field_i;
                        stackOut_22_0 = this;
                        stackOut_22_1 = ((bj) this).field_i;
                        stackIn_26_0 = stackOut_22_0;
                        stackIn_26_1 = stackOut_22_1;
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        if (Math.abs(var5_int) > 2) {
                          stackOut_26_0 = this;
                          stackOut_26_1 = stackIn_26_1;
                          stackOut_26_2 = var5_int >> 1;
                          stackIn_27_0 = stackOut_26_0;
                          stackIn_27_1 = stackOut_26_1;
                          stackIn_27_2 = stackOut_26_2;
                          break L8;
                        } else {
                          stackOut_23_0 = this;
                          stackOut_23_1 = stackIn_23_1;
                          stackIn_25_0 = stackOut_23_0;
                          stackIn_25_1 = stackOut_23_1;
                          stackIn_24_0 = stackOut_23_0;
                          stackIn_24_1 = stackOut_23_1;
                          if (var5_int <= 0) {
                            stackOut_25_0 = this;
                            stackOut_25_1 = stackIn_25_1;
                            stackOut_25_2 = -1;
                            stackIn_27_0 = stackOut_25_0;
                            stackIn_27_1 = stackOut_25_1;
                            stackIn_27_2 = stackOut_25_2;
                            break L8;
                          } else {
                            stackOut_24_0 = this;
                            stackOut_24_1 = stackIn_24_1;
                            stackOut_24_2 = 1;
                            stackIn_27_0 = stackOut_24_0;
                            stackIn_27_1 = stackOut_24_1;
                            stackIn_27_2 = stackOut_24_2;
                            break L8;
                          }
                        }
                      }
                      ((bj) this).field_i = stackIn_27_1 + stackIn_27_2;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    super.a(param0, param1, param2, param3);
                    break L1;
                  }
                }
                super.a(param0, param1, param2, param3);
                break L1;
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var5;
            stackOut_30_1 = new StringBuilder().append("bj.P(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param3 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L9;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L9;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 41);
        }
    }

    final void i(int param0) {
        super.i(-41);
        ((bj) this).field_x.b(((bj) this).field_m, 80, ((bj) this).field_k, 0, 0);
        ((bj) this).field_G = ((bj) this).field_r;
        ((bj) this).field_C = ((bj) this).field_i;
        if (param0 >= -21) {
            bj.a((byte) 10, 120);
        }
    }

    final static String j() {
        if (!(null != ja.field_b)) {
            return "";
        }
        return ja.field_b;
    }

    final static void a(byte param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Bounce.field_N;
        try {
          L0: {
            L1: {
              Bounce.a(va.field_b, q.field_M, 22668, 0, w.field_d, param1, true);
              if (param0 == -125) {
                break L1;
              } else {
                field_E = null;
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              if (var2_int >= q.field_M) {
                L3: {
                  Bounce.a(mg.field_n, q.field_M + param1, 22668, param1, uc.field_A, param1 + param1, false);
                  if (param1 >= q.field_M) {
                    break L3;
                  } else {
                    q.field_M = param1;
                    break L3;
                  }
                }
                break L0;
              } else {
                w.field_f[var2_int + param1] = var2_int;
                var2_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var2, "bj.LA(" + param0 + 44 + param1 + 41);
        }
    }

    private bj(int param0, int param1, int param2, int param3, fc param4, sk param5, lk param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((bj) this).field_C = 2147483647;
        ((bj) this).field_G = 2147483647;
        try {
            ((bj) this).field_D = param8 ? true : false;
            ((bj) this).field_F = param7 ? true : false;
            ((bj) this).field_x = param6;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "bj.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 44 + (param6 != null ? "{...}" : "null") + 44 + param7 + 44 + param8 + 41);
        }
    }

    final boolean a(int param0, lk param1, int param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
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
              var8_int = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
              if (var8_int == 0) {
                break L1;
              } else {
                if (!((bj) this).field_D) {
                  break L1;
                } else {
                  stackOut_2_0 = 1;
                  stackIn_3_0 = stackOut_2_0;
                  return stackIn_3_0 != 0;
                }
              }
            }
            if (!((bj) this).c(param3, param4 ^ 28455, param6, param2, param5)) {
              stackOut_9_0 = var8_int;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            } else {
              ((bj) this).field_u = param0;
              if (param0 == 1) {
                ((bj) this).field_H = -param6 + (-((bj) this).field_i + param5);
                nd.field_A = (bj) this;
                ((bj) this).field_B = -param2 + (param3 + -((bj) this).field_r);
                stackOut_7_0 = 1;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              } else {
                return true;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var8;
            stackOut_11_1 = new StringBuilder().append("bj.IA(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_10_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = null;
    }
}
