/*
 * Decompiled by CFR-JS 0.4.0.
 */
class dh extends wp {
    private long field_L;
    private int field_I;
    static float[] field_N;
    private boolean field_G;
    private int field_E;
    private long field_J;
    private int field_F;
    static float[] field_M;
    private int field_K;
    private boolean field_O;
    static int[] field_H;

    final boolean a(pk param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        long var8_long = 0L;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -42) {
                break L1;
              } else {
                ((dh) this).field_G = true;
                break L1;
              }
            }
            if (super.a(param0, -128, param2, param3, param4, param5, param6)) {
              if (!(((dh) this).field_w instanceof de)) {
                stackOut_19_0 = 0;
                stackIn_20_0 = stackOut_19_0;
                break L0;
              } else {
                L2: {
                  var8_int = ((de) (Object) ((dh) this).field_w).a(param4, (pk) this, ko.field_p, pi.field_e, -4059, param6);
                  stackOut_5_0 = this;
                  stackOut_5_1 = 124;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  if (-1 != var8_int) {
                    stackOut_7_0 = this;
                    stackOut_7_1 = stackIn_7_1;
                    stackOut_7_2 = var8_int;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    stackIn_8_2 = stackOut_7_2;
                    break L2;
                  } else {
                    stackOut_6_0 = this;
                    stackOut_6_1 = stackIn_6_1;
                    stackOut_6_2 = 0;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    stackIn_8_2 = stackOut_6_2;
                    break L2;
                  }
                }
                L3: {
                  this.a(stackIn_8_1, stackIn_8_2);
                  var8_long = wq.a(-17);
                  stackOut_8_0 = this;
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_9_0 = stackOut_8_0;
                  if (250L <= var8_long - ((dh) this).field_L) {
                    stackOut_10_0 = this;
                    stackOut_10_1 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    break L3;
                  } else {
                    stackOut_9_0 = this;
                    stackOut_9_1 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_11_1 = stackOut_9_1;
                    break L3;
                  }
                }
                L4: {
                  ((dh) this).field_G = stackIn_11_1 != 0;
                  if (!((dh) this).field_G) {
                    break L4;
                  } else {
                    L5: {
                      ((dh) this).field_E = this.g(14236);
                      ((dh) this).field_F = this.d(true);
                      if (((dh) this).field_F <= 0) {
                        break L5;
                      } else {
                        if (((dh) this).field_m.charAt(((dh) this).field_F + -1) == 32) {
                          ((dh) this).field_F = ((dh) this).field_F - 1;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    }
                    ((dh) this).field_K = ((dh) this).field_F;
                    break L4;
                  }
                }
                ((dh) this).field_L = var8_long;
                stackOut_17_0 = 1;
                stackIn_18_0 = stackOut_17_0;
                return stackIn_18_0 != 0;
              }
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var8;
            stackOut_21_1 = new StringBuilder().append("dh.R(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_20_0 != 0;
    }

    private final void a(int param0, int param1) {
        if (param0 < 84) {
            ((dh) this).field_I = 55;
        }
        ((dh) this).field_F = param1;
        if (!(hw.field_b[81])) {
            ((dh) this).field_E = ((dh) this).field_F;
        }
    }

    final static int b(int param0, int param1, boolean param2) {
        int var3 = param0 >>> 31;
        return (var3 + param0) / param1 + -var3;
    }

    public static void j(int param0) {
        field_H = null;
        field_M = null;
        field_N = null;
        if (param0 != 82) {
            field_N = null;
        }
    }

    private final String k(int param0) {
        if (param0 > -99) {
            ((dh) this).field_G = true;
        }
        int var2 = ((dh) this).field_E < ((dh) this).field_F ? ((dh) this).field_E : ((dh) this).field_F;
        int var3 = ((dh) this).field_F > ((dh) this).field_E ? ((dh) this).field_F : ((dh) this).field_E;
        return ((dh) this).field_m.substring(var2, var3);
    }

    private final void h(int param0) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                this.h((byte) -80);
                this.a(true, var2);
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

    private final void a(boolean param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (((dh) this).field_I != -1) {
                var3_int = ((dh) this).field_I + -((dh) this).field_m.length();
                if (var3_int >= 0) {
                  return;
                } else {
                  param1 = param1.substring(0, var3_int);
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (((dh) this).field_F == ((dh) this).field_m.length()) {
                ((dh) this).field_m = ((dh) this).field_m + param1;
                break L2;
              } else {
                ((dh) this).field_m = ((dh) this).field_m.substring(0, ((dh) this).field_F) + param1 + ((dh) this).field_m.substring(((dh) this).field_F, ((dh) this).field_m.length());
                break L2;
              }
            }
            ((dh) this).field_F = ((dh) this).field_F + param1.length();
            ((dh) this).field_E = ((dh) this).field_F;
            ((dh) this).g((byte) 88);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("dh.V(").append(true).append(',');
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
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
    }

    private final int g(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (((dh) this).field_F != 0) {
          var2 = -1 + ((dh) this).field_F;
          L0: while (true) {
            L1: {
              if (var2 <= 0) {
                break L1;
              } else {
                if (((dh) this).field_m.charAt(var2 - 1) == 32) {
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
          return ((dh) this).field_F;
        }
    }

    dh(String param0, qm param1, int param2) {
        super(param0, param1);
        ((dh) this).field_L = 0L;
        ((dh) this).field_G = false;
        ((dh) this).field_K = -1;
        try {
            ((dh) this).field_I = param2;
            ((dh) this).field_w = ks.field_x.field_j;
            ((dh) this).a(true, param0, (byte) 118);
            ((dh) this).field_O = true;
            ((dh) this).field_J = wq.a(-9);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "dh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(boolean param0, String param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
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
              if (param1 != null) {
                break L1;
              } else {
                param1 = "";
                break L1;
              }
            }
            L2: {
              ((dh) this).field_m = param1;
              var4_int = param1.length();
              if (((dh) this).field_I == -1) {
                break L2;
              } else {
                if (var4_int > ((dh) this).field_I) {
                  ((dh) this).field_m = ((dh) this).field_m.substring(0, ((dh) this).field_I);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              int dupTemp$2 = ((dh) this).field_m.length();
              ((dh) this).field_E = dupTemp$2;
              ((dh) this).field_F = dupTemp$2;
              if (!param0) {
                ((dh) this).g((byte) 103);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param2 >= 3) {
                break L4;
              } else {
                field_N = null;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("dh.O(").append(param0).append(',');
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
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param2 + ')');
        }
    }

    final boolean a(pk param0, char param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        int stackIn_28_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_51_0 = 0;
        Object stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        Object stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        Object stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        int stackIn_57_2 = 0;
        int stackIn_58_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_79_0 = 0;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_83_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_59_0 = 0;
        Object stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        Object stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        int stackOut_56_2 = 0;
        Object stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        int stackOut_55_2 = 0;
        int stackOut_57_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_42_0 = 0;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        int stackOut_27_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        String stackOut_82_2 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        try {
          L0: {
            ((dh) this).field_J = wq.a(-6);
            if (param1 == 60) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (62 != param1) {
                if (param2 > 9) {
                  L1: {
                    if (32 > param1) {
                      break L1;
                    } else {
                      if (126 >= param1) {
                        L2: {
                          if (((dh) this).field_F == ((dh) this).field_E) {
                            break L2;
                          } else {
                            this.h((byte) -71);
                            break L2;
                          }
                        }
                        L3: {
                          L4: {
                            if (-1 == ((dh) this).field_I) {
                              break L4;
                            } else {
                              if (~((dh) this).field_m.length() > ~((dh) this).field_I) {
                                break L4;
                              } else {
                                break L3;
                              }
                            }
                          }
                          L5: {
                            if (~((dh) this).field_F <= ~((dh) this).field_m.length()) {
                              ((dh) this).field_m = ((dh) this).field_m + param1;
                              int dupTemp$1 = ((dh) this).field_m.length();
                              ((dh) this).field_F = dupTemp$1;
                              ((dh) this).field_E = dupTemp$1;
                              break L5;
                            } else {
                              ((dh) this).field_m = ((dh) this).field_m.substring(0, ((dh) this).field_F) + param1 + ((dh) this).field_m.substring(((dh) this).field_F, ((dh) this).field_m.length());
                              ((dh) this).field_F = ((dh) this).field_F + 1;
                              ((dh) this).field_E = ((dh) this).field_F;
                              break L5;
                            }
                          }
                          ((dh) this).g((byte) 124);
                          break L3;
                        }
                        stackOut_76_0 = 1;
                        stackIn_77_0 = stackOut_76_0;
                        return stackIn_77_0 != 0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  L6: {
                    if (param3 == 85) {
                      if (~((dh) this).field_F == ~((dh) this).field_E) {
                        if (0 >= ((dh) this).field_F) {
                          break L6;
                        } else {
                          ((dh) this).field_E = -1 + ((dh) this).field_F;
                          this.h((byte) 127);
                          stackOut_65_0 = 1;
                          stackIn_66_0 = stackOut_65_0;
                          return stackIn_66_0 != 0;
                        }
                      } else {
                        this.h((byte) 122);
                        stackOut_62_0 = 1;
                        stackIn_63_0 = stackOut_62_0;
                        return stackIn_63_0 != 0;
                      }
                    } else {
                      if (101 != param3) {
                        if (param3 == 13) {
                          ((dh) this).i(-1);
                          stackOut_59_0 = 1;
                          stackIn_60_0 = stackOut_59_0;
                          return stackIn_60_0 != 0;
                        } else {
                          if (96 == param3) {
                            if (((dh) this).field_F > 0) {
                              L7: {
                                stackOut_54_0 = this;
                                stackOut_54_1 = 127;
                                stackIn_56_0 = stackOut_54_0;
                                stackIn_56_1 = stackOut_54_1;
                                stackIn_55_0 = stackOut_54_0;
                                stackIn_55_1 = stackOut_54_1;
                                if (hw.field_b[82]) {
                                  stackOut_56_0 = this;
                                  stackOut_56_1 = stackIn_56_1;
                                  stackOut_56_2 = this.g(14236);
                                  stackIn_57_0 = stackOut_56_0;
                                  stackIn_57_1 = stackOut_56_1;
                                  stackIn_57_2 = stackOut_56_2;
                                  break L7;
                                } else {
                                  stackOut_55_0 = this;
                                  stackOut_55_1 = stackIn_55_1;
                                  stackOut_55_2 = -1 + ((dh) this).field_F;
                                  stackIn_57_0 = stackOut_55_0;
                                  stackIn_57_1 = stackOut_55_1;
                                  stackIn_57_2 = stackOut_55_2;
                                  break L7;
                                }
                              }
                              this.a(stackIn_57_1, stackIn_57_2);
                              stackOut_57_0 = 1;
                              stackIn_58_0 = stackOut_57_0;
                              return stackIn_58_0 != 0;
                            } else {
                              break L6;
                            }
                          } else {
                            if (param3 != 97) {
                              if (param3 == 102) {
                                this.a(93, 0);
                                stackOut_50_0 = 1;
                                stackIn_51_0 = stackOut_50_0;
                                return stackIn_51_0 != 0;
                              } else {
                                if (param3 == 103) {
                                  this.a(121, ((dh) this).field_m.length());
                                  stackOut_48_0 = 1;
                                  stackIn_49_0 = stackOut_48_0;
                                  return stackIn_49_0 != 0;
                                } else {
                                  if (param3 == 84) {
                                    this.e((byte) -106);
                                    stackOut_46_0 = 1;
                                    stackIn_47_0 = stackOut_46_0;
                                    return stackIn_47_0 != 0;
                                  } else {
                                    L8: {
                                      if (!hw.field_b[82]) {
                                        break L8;
                                      } else {
                                        if (param3 != 65) {
                                          break L8;
                                        } else {
                                          this.f(96);
                                          stackOut_34_0 = 1;
                                          stackIn_35_0 = stackOut_34_0;
                                          return stackIn_35_0 != 0;
                                        }
                                      }
                                    }
                                    L9: {
                                      if (!hw.field_b[82]) {
                                        break L9;
                                      } else {
                                        if (param3 == 66) {
                                          this.e(false);
                                          stackOut_44_0 = 1;
                                          stackIn_45_0 = stackOut_44_0;
                                          return stackIn_45_0 != 0;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                    if (!hw.field_b[82]) {
                                      break L6;
                                    } else {
                                      if (param3 == 67) {
                                        this.h(-1);
                                        stackOut_42_0 = 1;
                                        stackIn_43_0 = stackOut_42_0;
                                        return stackIn_43_0 != 0;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              if (((dh) this).field_F >= ((dh) this).field_m.length()) {
                                break L6;
                              } else {
                                L10: {
                                  stackOut_24_0 = this;
                                  stackOut_24_1 = 111;
                                  stackIn_26_0 = stackOut_24_0;
                                  stackIn_26_1 = stackOut_24_1;
                                  stackIn_25_0 = stackOut_24_0;
                                  stackIn_25_1 = stackOut_24_1;
                                  if (!hw.field_b[82]) {
                                    stackOut_26_0 = this;
                                    stackOut_26_1 = stackIn_26_1;
                                    stackOut_26_2 = ((dh) this).field_F - -1;
                                    stackIn_27_0 = stackOut_26_0;
                                    stackIn_27_1 = stackOut_26_1;
                                    stackIn_27_2 = stackOut_26_2;
                                    break L10;
                                  } else {
                                    stackOut_25_0 = this;
                                    stackOut_25_1 = stackIn_25_1;
                                    stackOut_25_2 = this.d(true);
                                    stackIn_27_0 = stackOut_25_0;
                                    stackIn_27_1 = stackOut_25_1;
                                    stackIn_27_2 = stackOut_25_2;
                                    break L10;
                                  }
                                }
                                this.a(stackIn_27_1, stackIn_27_2);
                                stackOut_27_0 = 1;
                                stackIn_28_0 = stackOut_27_0;
                                return stackIn_28_0 != 0;
                              }
                            }
                          }
                        }
                      } else {
                        if (~((dh) this).field_F != ~((dh) this).field_E) {
                          this.h((byte) 123);
                          stackOut_18_0 = 1;
                          stackIn_19_0 = stackOut_18_0;
                          return stackIn_19_0 != 0;
                        } else {
                          if (((dh) this).field_F < ((dh) this).field_m.length()) {
                            ((dh) this).field_E = ((dh) this).field_F - -1;
                            this.h((byte) -69);
                            stackOut_16_0 = 1;
                            stackIn_17_0 = stackOut_16_0;
                            return stackIn_17_0 != 0;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                  }
                  stackOut_78_0 = 0;
                  stackIn_79_0 = stackOut_78_0;
                  break L0;
                } else {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0 != 0;
                }
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var5 = decompiledCaughtException;
            stackOut_80_0 = (RuntimeException) var5;
            stackOut_80_1 = new StringBuilder().append("dh.KA(");
            stackIn_82_0 = stackOut_80_0;
            stackIn_82_1 = stackOut_80_1;
            stackIn_81_0 = stackOut_80_0;
            stackIn_81_1 = stackOut_80_1;
            if (param0 == null) {
              stackOut_82_0 = (RuntimeException) (Object) stackIn_82_0;
              stackOut_82_1 = (StringBuilder) (Object) stackIn_82_1;
              stackOut_82_2 = "null";
              stackIn_83_0 = stackOut_82_0;
              stackIn_83_1 = stackOut_82_1;
              stackIn_83_2 = stackOut_82_2;
              break L11;
            } else {
              stackOut_81_0 = (RuntimeException) (Object) stackIn_81_0;
              stackOut_81_1 = (StringBuilder) (Object) stackIn_81_1;
              stackOut_81_2 = "{...}";
              stackIn_83_0 = stackOut_81_0;
              stackIn_83_1 = stackOut_81_1;
              stackIn_83_2 = stackOut_81_2;
              break L11;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_83_0, stackIn_83_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_79_0 != 0;
    }

    private final void h(byte param0) {
        int var2 = 0;
        int var3 = 0;
        if (((dh) this).field_F != ((dh) this).field_E) {
            var2 = ((dh) this).field_E >= ((dh) this).field_F ? ((dh) this).field_F : ((dh) this).field_E;
            var3 = ((dh) this).field_E < ((dh) this).field_F ? ((dh) this).field_F : ((dh) this).field_E;
            ((dh) this).field_F = var2;
            ((dh) this).field_E = var2;
            ((dh) this).field_m = ((dh) this).field_m.substring(0, var2) + ((dh) this).field_m.substring(var3, ((dh) this).field_m.length());
            ((dh) this).g((byte) 81);
        }
        var2 = -67 / ((85 - param0) / 37);
    }

    private final void e(byte param0) {
        if (!(!(((dh) this).field_o instanceof pw))) {
            ((pw) (Object) ((dh) this).field_o).a((dh) this, -66);
        }
    }

    private final void f(int param0) {
        this.e(false);
        this.h((byte) 123);
    }

    private final void f(byte param0) {
        ag var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        de var9 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        if (!((dh) this).field_O) {
          ((dh) this).field_s = 0;
          ((dh) this).field_n = 0;
          return;
        } else {
          if (((dh) this).field_w instanceof de) {
            L0: {
              var9 = (de) (Object) ((dh) this).field_w;
              var3 = var9.b(-3, (pk) this);
              var4 = var3.a((byte) -15);
              if (param0 == -44) {
                break L0;
              } else {
                field_H = null;
                break L0;
              }
            }
            var5 = var9.a(param0 ^ -120, (pk) this);
            var6 = var9.a(14763) >> 1;
            if (-var6 + var5 <= var4) {
              L1: {
                var7 = ((dh) this).field_s + var3.a((byte) 113, ((dh) this).field_F);
                if (-var6 + var5 >= var7) {
                  if (var6 <= var7) {
                    break L1;
                  } else {
                    ((dh) this).field_s = -var7 - -var6 + ((dh) this).field_s;
                    break L1;
                  }
                } else {
                  ((dh) this).field_s = -var7 - (-var5 + (var6 - ((dh) this).field_s));
                  break L1;
                }
              }
              L2: {
                if (((dh) this).field_s <= 0) {
                  if (var6 + -var5 <= ((dh) this).field_s) {
                    break L2;
                  } else {
                    ((dh) this).field_s = -var5 - -var6;
                    break L2;
                  }
                } else {
                  ((dh) this).field_s = 0;
                  break L2;
                }
              }
              return;
            } else {
              ((dh) this).field_n = 0;
              ((dh) this).field_s = 0;
              return;
            }
          } else {
            return;
          }
        }
    }

    final void i(int param0) {
        ((dh) this).field_F = 0;
        ((dh) this).field_E = 0;
        ((dh) this).field_m = "";
        ((dh) this).g((byte) 104);
        if (param0 != -1) {
            ((dh) this).field_O = true;
        }
    }

    private final void e(boolean param0) {
        String var2 = this.k(-115);
        if (!(var2.length() <= 0)) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.k(-116)), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    void a(int param0, int param1, pk param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        de var6 = null;
        int var7 = 0;
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
              super.a(param0, 62, param2, param3);
              var5_int = 0;
              this.f((byte) -44);
              if (((dh) this).field_l == 1) {
                L2: {
                  if (((dh) this).field_w instanceof de) {
                    var6 = (de) (Object) ((dh) this).field_w;
                    var7 = var6.a(param0, (pk) this, ko.field_p, pi.field_e, -4059, param3);
                    if (var7 == -1) {
                      break L2;
                    } else {
                      L3: {
                        if (!((dh) this).field_G) {
                          break L3;
                        } else {
                          if (((dh) this).field_K <= var7) {
                            break L3;
                          } else {
                            if (((dh) this).field_E >= var7) {
                              break L3;
                            } else {
                              var7 = ((dh) this).field_K;
                              break L3;
                            }
                          }
                        }
                      }
                      ((dh) this).field_F = var7;
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                ((dh) this).field_J = wq.a(-93);
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
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("dh.U(").append(param0).append(',').append(-86).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        de var8 = null;
        long var6 = 0L;
        if (null != ((dh) this).field_w) {
            if (!(param3 != 0)) {
                ((dh) this).field_w.a((pk) this, param1, 5592405, ((dh) this).field_x, param0);
                if (((dh) this).field_w instanceof de) {
                    var8 = (de) (Object) ((dh) this).field_w;
                    if (((dh) this).field_F != ((dh) this).field_E) {
                        var8.a(param0, ((dh) this).field_E, 0, ((dh) this).field_F, (pk) this, param1);
                    }
                    var6 = wq.a(-6);
                    if (500L > (-((dh) this).field_J + var6) % 1000L) {
                        var8.a(1, param0, param1, ((dh) this).field_F, (pk) this);
                    }
                }
            }
        }
        if (param2 >= -35) {
            int discarded$0 = this.d(false);
        }
    }

    private final int d(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Sumoblitz.field_L ? 1 : 0;
          if (param0) {
            break L0;
          } else {
            this.f((byte) -32);
            break L0;
          }
        }
        var2 = ((dh) this).field_m.length();
        if (((dh) this).field_F != var2) {
          var3 = ((dh) this).field_F + 1;
          L1: while (true) {
            L2: {
              if (var2 <= var3) {
                break L2;
              } else {
                if (32 == ((dh) this).field_m.charAt(var3 + -1)) {
                  break L2;
                } else {
                  var3++;
                  continue L1;
                }
              }
            }
            return var3;
          }
        } else {
          return ((dh) this).field_F;
        }
    }

    void g(byte param0) {
        if (((dh) this).field_o instanceof pw) {
            ((pw) (Object) ((dh) this).field_o).a((dh) this, (byte) -128);
        }
        if (param0 <= 78) {
            dh.j(5);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var2 = 0;
        field_N = new float[16384];
        field_M = new float[16384];
        double var0 = 0.0003834951969714103;
        for (var2 = 0; var2 < 16384; var2++) {
            field_N[var2] = (float)Math.sin(var0 * (double)var2);
            field_M[var2] = (float)Math.cos((double)var2 * var0);
        }
        field_H = new int[2];
    }
}
