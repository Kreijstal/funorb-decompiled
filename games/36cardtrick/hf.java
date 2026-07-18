/*
 * Decompiled by CFR-JS 0.4.0.
 */
class hf extends hl {
    private int field_F;
    private long field_M;
    static int field_I;
    private int field_N;
    private int field_L;
    private long field_O;
    private int field_K;
    static qk field_H;
    private boolean field_J;
    private boolean field_G;

    void k(int param0) {
        if (param0 != 64) {
            this.b(true);
        }
        if (!(!(((hf) this).field_k instanceof pi))) {
            ((pi) (Object) ((hf) this).field_k).a((hf) this, 12891);
        }
    }

    private final void b(boolean param0) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  var2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                  int discarded$2 = -56;
                  this.f();
                  int discarded$3 = 127;
                  this.a(var2);
                  if (!param0) {
                    break L1;
                  } else {
                    this.b(true);
                    break L1;
                  }
                }
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2_ref = (Exception) (Object) decompiledCaughtException;
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7, int param8, int[] param9) {
        RuntimeException var11 = null;
        int var11_int = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var15 = Main.field_T;
        try {
          L0: {
            var11_int = -param1;
            L1: while (true) {
              if (0 <= var11_int) {
                break L0;
              } else {
                var12 = -param8;
                L2: while (true) {
                  if (var12 >= 0) {
                    param6 = param6 + param7;
                    param5 = param5 + param0;
                    var11_int++;
                    continue L1;
                  } else {
                    L3: {
                      int incrementValue$2 = param5;
                      param5++;
                      param3 = param4[incrementValue$2] & 255;
                      if (param3 == 0) {
                        param6++;
                        break L3;
                      } else {
                        var13 = param9[param6];
                        var14 = 256 + -param3;
                        int incrementValue$3 = param6;
                        param6++;
                        param9[incrementValue$3] = bc.a(-16711936, bc.a(param2, 16711935) * param3 - -(bc.a(16711935, var13) * var14)) - -bc.a(var14 * bc.a(var13, 65280) + param3 * bc.a(param2, 65280), 16711680) >> 8;
                        break L3;
                      }
                    }
                    var12++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var11 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var11;
            stackOut_13_1 = new StringBuilder().append("hf.SA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param4 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param9 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + 125 + ')');
        }
    }

    private final void a(String param0) {
        int var3_int = 0;
        if (!(((hf) this).field_K == -1)) {
            var3_int = ((hf) this).field_K + -((hf) this).field_r.length();
            if (0 <= var3_int) {
                return;
            }
            param0 = param0.substring(0, var3_int);
        }
        if (((hf) this).field_N != ((hf) this).field_r.length()) {
            ((hf) this).field_r = ((hf) this).field_r.substring(0, ((hf) this).field_N) + param0 + ((hf) this).field_r.substring(((hf) this).field_N, ((hf) this).field_r.length());
        } else {
            ((hf) this).field_r = ((hf) this).field_r + param0;
        }
        ((hf) this).field_N = ((hf) this).field_N + param0.length();
        try {
            ((hf) this).field_F = ((hf) this).field_N;
            ((hf) this).k(64);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "hf.RA(" + (param0 != null ? "{...}" : "null") + ',' + 127 + ')');
        }
    }

    final void n(int param0) {
        ((hf) this).field_N = 0;
        int var2 = -99 / ((-22 - param0) / 40);
        ((hf) this).field_F = 0;
        ((hf) this).field_r = "";
        ((hf) this).k(64);
    }

    hf(String param0, pl param1, int param2) {
        super(param0, param1);
        ((hf) this).field_O = 0L;
        ((hf) this).field_L = -1;
        ((hf) this).field_G = false;
        try {
            ((hf) this).field_v = pj.field_a.field_r;
            ((hf) this).field_K = param2;
            ((hf) this).a(param0, -18845, true);
            ((hf) this).field_J = true;
            ((hf) this).field_M = id.a(39);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "hf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, lk param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        long var8_long = 0L;
        Object var10 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
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
        int stackOut_18_0 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_16_0 = 0;
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
            L1: {
              if (param3 < -14) {
                break L1;
              } else {
                var10 = null;
                boolean discarded$2 = ((hf) this).a('k', (byte) 63, -72, (lk) null);
                break L1;
              }
            }
            if (!super.a(param0, param1, param2, -83, param4, param5, param6)) {
              stackOut_18_0 = 0;
              stackIn_19_0 = stackOut_18_0;
              break L0;
            } else {
              if (((hf) this).field_v instanceof ne) {
                L2: {
                  var8_int = ((ne) (Object) ((hf) this).field_v).a(eg.field_b, param1, -10989, param0, (lk) this, ij.field_e);
                  stackOut_5_0 = this;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (-1 == var8_int) {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    break L2;
                  } else {
                    stackOut_6_0 = this;
                    stackOut_6_1 = var8_int;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    break L2;
                  }
                }
                L3: {
                  this.a(stackIn_8_1, 72);
                  var8_long = id.a(117);
                  stackOut_8_0 = this;
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_9_0 = stackOut_8_0;
                  if (250L <= var8_long - ((hf) this).field_O) {
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
                  ((hf) this).field_G = stackIn_11_1 != 0;
                  if (!((hf) this).field_G) {
                    break L4;
                  } else {
                    L5: {
                      int discarded$3 = -1;
                      ((hf) this).field_F = this.m();
                      ((hf) this).field_N = this.j(-98);
                      if (0 >= ((hf) this).field_N) {
                        break L5;
                      } else {
                        if (((hf) this).field_r.charAt(((hf) this).field_N - 1) != 32) {
                          break L5;
                        } else {
                          ((hf) this).field_N = ((hf) this).field_N - 1;
                          break L5;
                        }
                      }
                    }
                    ((hf) this).field_L = ((hf) this).field_N;
                    break L4;
                  }
                }
                ((hf) this).field_O = var8_long;
                stackOut_16_0 = 1;
                stackIn_17_0 = stackOut_16_0;
                return stackIn_17_0 != 0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var8;
            stackOut_20_1 = new StringBuilder().append("hf.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param4 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_19_0 != 0;
    }

    final void a(String param0, int param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                param0 = "";
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ((hf) this).field_r = param0;
              var4_int = param0.length();
              if (param1 == -18845) {
                break L2;
              } else {
                ((hf) this).field_L = -96;
                break L2;
              }
            }
            L3: {
              if (((hf) this).field_K == -1) {
                break L3;
              } else {
                if (var4_int > ((hf) this).field_K) {
                  ((hf) this).field_r = ((hf) this).field_r.substring(0, ((hf) this).field_K);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              int dupTemp$3 = ((hf) this).field_r.length();
              ((hf) this).field_F = dupTemp$3;
              ((hf) this).field_N = dupTemp$3;
              if (!param2) {
                ((hf) this).k(64);
                break L4;
              } else {
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("hf.HA(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean a(char param0, byte param1, int param2, lk param3) {
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_42_0 = 0;
        Object stackIn_45_0 = null;
        Object stackIn_46_0 = null;
        Object stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_75_0 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_50_0 = 0;
        Object stackOut_44_0 = null;
        Object stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        Object stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        int stackOut_47_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_22_0 = 0;
        Object stackOut_15_0 = null;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_74_0 = 0;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        try {
          L0: {
            ((hf) this).field_M = id.a(93);
            if (param0 == 60) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (param0 != 62) {
                L1: {
                  if (param0 < 32) {
                    break L1;
                  } else {
                    if (param0 <= 126) {
                      L2: {
                        if (~((hf) this).field_N == ~((hf) this).field_F) {
                          break L2;
                        } else {
                          int discarded$10 = -56;
                          this.f();
                          break L2;
                        }
                      }
                      L3: {
                        L4: {
                          if (-1 == ((hf) this).field_K) {
                            break L4;
                          } else {
                            if (((hf) this).field_r.length() >= ((hf) this).field_K) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L5: {
                          if (~((hf) this).field_N > ~((hf) this).field_r.length()) {
                            ((hf) this).field_r = ((hf) this).field_r.substring(0, ((hf) this).field_N) + param0 + ((hf) this).field_r.substring(((hf) this).field_N, ((hf) this).field_r.length());
                            ((hf) this).field_N = ((hf) this).field_N + 1;
                            ((hf) this).field_F = ((hf) this).field_N;
                            break L5;
                          } else {
                            ((hf) this).field_r = ((hf) this).field_r + param0;
                            int dupTemp$11 = ((hf) this).field_r.length();
                            ((hf) this).field_N = dupTemp$11;
                            ((hf) this).field_F = dupTemp$11;
                            break L5;
                          }
                        }
                        ((hf) this).k(64);
                        break L3;
                      }
                      stackOut_70_0 = 1;
                      stackIn_71_0 = stackOut_70_0;
                      return stackIn_71_0 != 0;
                    } else {
                      break L1;
                    }
                  }
                }
                L6: {
                  if (param2 == 85) {
                    if (((hf) this).field_N == ((hf) this).field_F) {
                      if (((hf) this).field_N <= 0) {
                        break L6;
                      } else {
                        ((hf) this).field_F = -1 + ((hf) this).field_N;
                        int discarded$12 = -56;
                        this.f();
                        stackOut_59_0 = 1;
                        stackIn_60_0 = stackOut_59_0;
                        return stackIn_60_0 != 0;
                      }
                    } else {
                      int discarded$13 = -56;
                      this.f();
                      stackOut_56_0 = 1;
                      stackIn_57_0 = stackOut_56_0;
                      return stackIn_57_0 != 0;
                    }
                  } else {
                    if (param2 == 101) {
                      if (((hf) this).field_F == ((hf) this).field_N) {
                        if (((hf) this).field_N >= ((hf) this).field_r.length()) {
                          break L6;
                        } else {
                          ((hf) this).field_F = 1 + ((hf) this).field_N;
                          int discarded$14 = -56;
                          this.f();
                          stackOut_53_0 = 1;
                          stackIn_54_0 = stackOut_53_0;
                          return stackIn_54_0 != 0;
                        }
                      } else {
                        int discarded$15 = -56;
                        this.f();
                        stackOut_50_0 = 1;
                        stackIn_51_0 = stackOut_50_0;
                        return stackIn_51_0 != 0;
                      }
                    } else {
                      if (param2 != 13) {
                        if (param2 != 96) {
                          if (param2 == 97) {
                            if (~((hf) this).field_N <= ~((hf) this).field_r.length()) {
                              break L6;
                            } else {
                              L7: {
                                stackOut_44_0 = this;
                                stackIn_46_0 = stackOut_44_0;
                                stackIn_45_0 = stackOut_44_0;
                                if (ge.field_c[82]) {
                                  stackOut_46_0 = this;
                                  stackOut_46_1 = this.j(-117);
                                  stackIn_47_0 = stackOut_46_0;
                                  stackIn_47_1 = stackOut_46_1;
                                  break L7;
                                } else {
                                  stackOut_45_0 = this;
                                  stackOut_45_1 = 1 + ((hf) this).field_N;
                                  stackIn_47_0 = stackOut_45_0;
                                  stackIn_47_1 = stackOut_45_1;
                                  break L7;
                                }
                              }
                              this.a(stackIn_47_1, 80);
                              stackOut_47_0 = 1;
                              stackIn_48_0 = stackOut_47_0;
                              return stackIn_48_0 != 0;
                            }
                          } else {
                            if (param2 != 102) {
                              if (param2 == 103) {
                                this.a(((hf) this).field_r.length(), 72);
                                stackOut_41_0 = 1;
                                stackIn_42_0 = stackOut_41_0;
                                return stackIn_42_0 != 0;
                              } else {
                                if (param2 == 84) {
                                  int discarded$16 = 17091;
                                  this.i();
                                  stackOut_39_0 = 1;
                                  stackIn_40_0 = stackOut_39_0;
                                  return stackIn_40_0 != 0;
                                } else {
                                  L8: {
                                    if (!ge.field_c[82]) {
                                      break L8;
                                    } else {
                                      if (param2 == 65) {
                                        int discarded$17 = 11514;
                                        this.l();
                                        stackOut_37_0 = 1;
                                        stackIn_38_0 = stackOut_37_0;
                                        return stackIn_38_0 != 0;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                  L9: {
                                    if (!ge.field_c[82]) {
                                      break L9;
                                    } else {
                                      if (param2 != 66) {
                                        break L9;
                                      } else {
                                        int discarded$18 = 1;
                                        this.a();
                                        stackOut_31_0 = 1;
                                        stackIn_32_0 = stackOut_31_0;
                                        return stackIn_32_0 != 0;
                                      }
                                    }
                                  }
                                  if (!ge.field_c[82]) {
                                    break L6;
                                  } else {
                                    if (param2 != 67) {
                                      break L6;
                                    } else {
                                      this.b(false);
                                      stackOut_35_0 = 1;
                                      stackIn_36_0 = stackOut_35_0;
                                      return stackIn_36_0 != 0;
                                    }
                                  }
                                }
                              }
                            } else {
                              this.a(0, 104);
                              stackOut_22_0 = 1;
                              stackIn_23_0 = stackOut_22_0;
                              return stackIn_23_0 != 0;
                            }
                          }
                        } else {
                          if (((hf) this).field_N <= 0) {
                            break L6;
                          } else {
                            L10: {
                              stackOut_15_0 = this;
                              stackIn_17_0 = stackOut_15_0;
                              stackIn_16_0 = stackOut_15_0;
                              if (ge.field_c[82]) {
                                int discarded$19 = -1;
                                stackOut_17_0 = this;
                                stackOut_17_1 = this.m();
                                stackIn_18_0 = stackOut_17_0;
                                stackIn_18_1 = stackOut_17_1;
                                break L10;
                              } else {
                                stackOut_16_0 = this;
                                stackOut_16_1 = -1 + ((hf) this).field_N;
                                stackIn_18_0 = stackOut_16_0;
                                stackIn_18_1 = stackOut_16_1;
                                break L10;
                              }
                            }
                            this.a(stackIn_18_1, 104);
                            stackOut_18_0 = 1;
                            stackIn_19_0 = stackOut_18_0;
                            return stackIn_19_0 != 0;
                          }
                        }
                      } else {
                        ((hf) this).n(121);
                        stackOut_11_0 = 1;
                        stackIn_12_0 = stackOut_11_0;
                        return stackIn_12_0 != 0;
                      }
                    }
                  }
                }
                L11: {
                  if (param1 < -99) {
                    break L11;
                  } else {
                    ((hf) this).field_O = 77L;
                    break L11;
                  }
                }
                stackOut_74_0 = 0;
                stackIn_75_0 = stackOut_74_0;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackOut_76_0 = (RuntimeException) var5;
            stackOut_76_1 = new StringBuilder().append("hf.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_78_0 = stackOut_76_0;
            stackIn_78_1 = stackOut_76_1;
            stackIn_77_0 = stackOut_76_0;
            stackIn_77_1 = stackOut_76_1;
            if (param3 == null) {
              stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
              stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
              stackOut_78_2 = "null";
              stackIn_79_0 = stackOut_78_0;
              stackIn_79_1 = stackOut_78_1;
              stackIn_79_2 = stackOut_78_2;
              break L12;
            } else {
              stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
              stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
              stackOut_77_2 = "{...}";
              stackIn_79_0 = stackOut_77_0;
              stackIn_79_1 = stackOut_77_1;
              stackIn_79_2 = stackOut_77_2;
              break L12;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_79_0, stackIn_79_2 + ')');
        }
        return stackIn_75_0 != 0;
    }

    private final void a(int param0, int param1) {
        ((hf) this).field_N = param0;
        if (!ge.field_c[81]) {
            ((hf) this).field_F = ((hf) this).field_N;
        }
        if (param1 <= 68) {
            this.a(-21, -53);
        }
    }

    private final void a() {
        String var2 = this.h(121);
        if (var2.length() > 0) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.h(88)), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    void a(int param0, int param1, lk param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        ne var7 = null;
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
              if (param3 == 3) {
                break L1;
              } else {
                ((hf) this).field_L = -18;
                break L1;
              }
            }
            L2: {
              super.a(param0, param1, param2, param3);
              int discarded$3 = -120;
              this.e();
              if (((hf) this).field_x == 1) {
                L3: {
                  if (((hf) this).field_v instanceof ne) {
                    var7 = (ne) (Object) ((hf) this).field_v;
                    var6 = var7.a(eg.field_b, param0, -10989, param1, (lk) this, ij.field_e);
                    if (-1 == var6) {
                      break L3;
                    } else {
                      L4: {
                        if (!((hf) this).field_G) {
                          break L4;
                        } else {
                          if (((hf) this).field_L <= var6) {
                            break L4;
                          } else {
                            if (((hf) this).field_F >= var6) {
                              break L4;
                            } else {
                              var6 = ((hf) this).field_L;
                              break L4;
                            }
                          }
                        }
                      }
                      ((hf) this).field_N = var6;
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                ((hf) this).field_M = id.a(57);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("hf.E(").append(param0).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param3 + ')');
        }
    }

    final static String a(CharSequence param0) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
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
            int discarded$2 = 0;
            stackOut_2_0 = ha.a(param0, -30773);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("hf.JA(");
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
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + 36 + ')');
        }
        return stackIn_3_0;
    }

    private final int m() {
        int var2 = 0;
        int var3 = 0;
        var3 = Main.field_T;
        if (((hf) this).field_N != 0) {
          var2 = ((hf) this).field_N + -1;
          L0: while (true) {
            L1: {
              if (0 >= var2) {
                break L1;
              } else {
                if (((hf) this).field_r.charAt(var2 - 1) == 32) {
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
          return ((hf) this).field_N;
        }
    }

    private final int j(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Main.field_T;
        if (param0 < -96) {
          var2 = ((hf) this).field_r.length();
          if (var2 == ((hf) this).field_N) {
            return ((hf) this).field_N;
          } else {
            var3 = ((hf) this).field_N + 1;
            L0: while (true) {
              L1: {
                if (var3 >= var2) {
                  break L1;
                } else {
                  if (((hf) this).field_r.charAt(var3 + -1) == 32) {
                    break L1;
                  } else {
                    var3++;
                    continue L0;
                  }
                }
              }
              return var3;
            }
          }
        } else {
          return -15;
        }
    }

    private final String h(int param0) {
        int var2 = -69 / ((param0 - 13) / 38);
        int var3 = ((hf) this).field_F >= ((hf) this).field_N ? ((hf) this).field_N : ((hf) this).field_F;
        int var4 = ((hf) this).field_F < ((hf) this).field_N ? ((hf) this).field_N : ((hf) this).field_F;
        return ((hf) this).field_r.substring(var3, var4);
    }

    final void a(int param0, int param1, int param2, int param3) {
        ne var8 = null;
        long var6 = 0L;
        if (null != ((hf) this).field_v) {
            if (!(0 != param3)) {
                ((hf) this).field_v.a(param0, (lk) this, 11447, param1, ((hf) this).field_B);
                if (!(!(((hf) this).field_v instanceof ne))) {
                    var8 = (ne) (Object) ((hf) this).field_v;
                    if (!(((hf) this).field_F == ((hf) this).field_N)) {
                        var8.a((lk) this, (byte) 67, param1, param0, ((hf) this).field_N, ((hf) this).field_F);
                    }
                    var6 = id.a(62);
                    if ((-((hf) this).field_M + var6) % 1000L < 500L) {
                        var8.a(param0, ((hf) this).field_N, param1, (byte) 55, (lk) this);
                    }
                }
            }
        }
        if (param2 != -1) {
            field_I = 9;
        }
    }

    private final void e() {
        int var8 = Main.field_T;
        if (!((hf) this).field_J) {
            ((hf) this).field_m = 0;
            ((hf) this).field_l = 0;
            return;
        }
        if (!(((hf) this).field_v instanceof ne)) {
            return;
        }
    }

    private final void i() {
        if (((hf) this).field_k instanceof pi) {
            ((pi) (Object) ((hf) this).field_k).a(-1, (hf) this);
        }
    }

    private final void f() {
        int var2 = 0;
        int var3 = 0;
        if (((hf) this).field_F != ((hf) this).field_N) {
            var2 = ((hf) this).field_F < ((hf) this).field_N ? ((hf) this).field_F : ((hf) this).field_N;
            var3 = ((hf) this).field_N > ((hf) this).field_F ? ((hf) this).field_N : ((hf) this).field_F;
            ((hf) this).field_F = var2;
            ((hf) this).field_N = var2;
            ((hf) this).field_r = ((hf) this).field_r.substring(0, var2) + ((hf) this).field_r.substring(var3, ((hf) this).field_r.length());
            ((hf) this).k(64);
        }
    }

    private final void l() {
        int discarded$0 = 1;
        this.a();
        int discarded$1 = -56;
        this.f();
    }

    public static void o() {
        field_H = null;
    }

    static {
    }
}
