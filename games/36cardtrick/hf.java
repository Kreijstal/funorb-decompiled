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
        if (!(!(this.field_k instanceof pi))) {
            ((pi) ((Object) this.field_k)).a((hf) (this), 12891);
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
                  var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                  this.f((byte) -56);
                  this.a(var2, (byte) 127);
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

    final static void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7, int param8, int[] param9, int param10) {
        String discarded$3 = null;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        RuntimeException var11 = null;
        int var11_int = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        CharSequence var16 = null;
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
                L2: {
                  if (param10 >= 124) {
                    break L2;
                  } else {
                    var16 = (CharSequence) null;
                    discarded$3 = hf.a((CharSequence) null, (byte) 65);
                    break L2;
                  }
                }
                break L0;
              } else {
                var12 = -param8;
                L3: while (true) {
                  if (-1 >= (var12 ^ -1)) {
                    param6 = param6 + param7;
                    param5 = param5 + param0;
                    var11_int++;
                    continue L1;
                  } else {
                    L4: {
                      incrementValue$4 = param5;
                      param5++;
                      param3 = param4[incrementValue$4] & 255;
                      if (param3 == 0) {
                        param6++;
                        break L4;
                      } else {
                        var13 = param9[param6];
                        var14 = 256 + -param3;
                        incrementValue$5 = param6;
                        param6++;
                        param9[incrementValue$5] = bc.a(-16711936, bc.a(param2, 16711935) * param3 - -(bc.a(16711935, var13) * var14)) - -bc.a(var14 * bc.a(var13, 65280) + param3 * bc.a(param2, 65280), 16711680) >> -1261866520;
                        break L4;
                      }
                    }
                    var12++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var11 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var11);
            stackOut_13_1 = new StringBuilder().append("hf.SA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param4 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param9 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param10 + ')');
        }
    }

    private final void a(String param0, byte param1) {
        int var3_int = 0;
        if (!(this.field_K == -1)) {
            var3_int = this.field_K + -this.field_r.length();
            if (0 <= var3_int) {
                return;
            }
            param0 = param0.substring(0, var3_int);
        }
        if (this.field_N != this.field_r.length()) {
            this.field_r = this.field_r.substring(0, this.field_N) + param0 + this.field_r.substring(this.field_N, this.field_r.length());
        } else {
            this.field_r = this.field_r + param0;
        }
        this.field_N = this.field_N + param0.length();
        if (param1 != 127) {
            return;
        }
        try {
            this.field_F = this.field_N;
            this.k(param1 ^ 63);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "hf.RA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void n(int param0) {
        this.field_N = 0;
        int var2 = -99 / ((-22 - param0) / 40);
        this.field_F = 0;
        this.field_r = "";
        this.k(64);
    }

    hf(String param0, pl param1, int param2) {
        super(param0, param1);
        this.field_O = 0L;
        this.field_L = -1;
        this.field_G = false;
        try {
            this.field_v = pj.field_a.field_r;
            this.field_K = param2;
            this.a(param0, -18845, true);
            this.field_J = true;
            this.field_M = id.a(39);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "hf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, lk param4, int param5, int param6) {
        boolean discarded$1 = false;
        RuntimeException var8 = null;
        int var8_int = 0;
        long var8_long = 0L;
        lk var10 = null;
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
        int decompiledRegionSelector0 = 0;
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
                var10 = (lk) null;
                discarded$1 = this.a('k', (byte) 63, -72, (lk) null);
                break L1;
              }
            }
            if (!super.a(param0, param1, param2, -83, param4, param5, param6)) {
              stackOut_18_0 = 0;
              stackIn_19_0 = stackOut_18_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              if (this.field_v instanceof ne) {
                L2: {
                  var8_int = ((ne) ((Object) this.field_v)).a(eg.field_b, param1, -10989, param0, (lk) (this), ij.field_e);
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
                  if (250L <= var8_long - this.field_O) {
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
                  ((hf) (this)).field_G = stackIn_11_1 != 0;
                  if (!this.field_G) {
                    break L4;
                  } else {
                    L5: {
                      this.field_F = this.m(-1);
                      this.field_N = this.j(-98);
                      if (0 >= this.field_N) {
                        break L5;
                      } else {
                        if (this.field_r.charAt(this.field_N - 1) != 32) {
                          break L5;
                        } else {
                          this.field_N = this.field_N - 1;
                          break L5;
                        }
                      }
                    }
                    this.field_L = this.field_N;
                    break L4;
                  }
                }
                this.field_O = var8_long;
                stackOut_16_0 = 1;
                stackIn_17_0 = stackOut_16_0;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var8);
            stackOut_20_1 = new StringBuilder().append("hf.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param4 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_17_0 != 0;
        } else {
          return stackIn_19_0 != 0;
        }
    }

    final void a(String param0, int param1, boolean param2) {
        int dupTemp$3 = 0;
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
              this.field_r = param0;
              var4_int = param0.length();
              if (param1 == -18845) {
                break L2;
              } else {
                this.field_L = -96;
                break L2;
              }
            }
            L3: {
              if ((this.field_K ^ -1) == 0) {
                break L3;
              } else {
                if (var4_int > this.field_K) {
                  this.field_r = this.field_r.substring(0, this.field_K);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              dupTemp$3 = this.field_r.length();
              this.field_F = dupTemp$3;
              this.field_N = dupTemp$3;
              if (!param2) {
                this.k(64);
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
            stackOut_13_0 = (RuntimeException) (var4);
            stackOut_13_1 = new StringBuilder().append("hf.HA(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean a(char param0, byte param1, int param2, lk param3) {
        int dupTemp$1 = 0;
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
        int decompiledRegionSelector0 = 0;
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
            this.field_M = id.a(93);
            if (param0 == 60) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 != 62) {
                L1: {
                  if (param0 < 32) {
                    break L1;
                  } else {
                    if (param0 <= 126) {
                      L2: {
                        if (this.field_N == this.field_F) {
                          break L2;
                        } else {
                          this.f((byte) -56);
                          break L2;
                        }
                      }
                      L3: {
                        L4: {
                          if (-1 == this.field_K) {
                            break L4;
                          } else {
                            if (this.field_r.length() >= this.field_K) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L5: {
                          if (this.field_N < this.field_r.length()) {
                            this.field_r = this.field_r.substring(0, this.field_N) + param0 + this.field_r.substring(this.field_N, this.field_r.length());
                            this.field_N = this.field_N + 1;
                            this.field_F = this.field_N;
                            break L5;
                          } else {
                            this.field_r = this.field_r + param0;
                            dupTemp$1 = this.field_r.length();
                            this.field_N = dupTemp$1;
                            this.field_F = dupTemp$1;
                            break L5;
                          }
                        }
                        this.k(64);
                        break L3;
                      }
                      stackOut_70_0 = 1;
                      stackIn_71_0 = stackOut_70_0;
                      decompiledRegionSelector0 = 14;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                L6: {
                  if (-86 == (param2 ^ -1)) {
                    if (this.field_N == this.field_F) {
                      if (-1 <= (this.field_N ^ -1)) {
                        break L6;
                      } else {
                        this.field_F = -1 + this.field_N;
                        this.f((byte) -56);
                        stackOut_59_0 = 1;
                        stackIn_60_0 = stackOut_59_0;
                        decompiledRegionSelector0 = 13;
                        break L0;
                      }
                    } else {
                      this.f((byte) -56);
                      stackOut_56_0 = 1;
                      stackIn_57_0 = stackOut_56_0;
                      decompiledRegionSelector0 = 12;
                      break L0;
                    }
                  } else {
                    if (param2 == 101) {
                      if (this.field_F == this.field_N) {
                        if (this.field_N >= this.field_r.length()) {
                          break L6;
                        } else {
                          this.field_F = 1 + this.field_N;
                          this.f((byte) -56);
                          stackOut_53_0 = 1;
                          stackIn_54_0 = stackOut_53_0;
                          decompiledRegionSelector0 = 11;
                          break L0;
                        }
                      } else {
                        this.f((byte) -56);
                        stackOut_50_0 = 1;
                        stackIn_51_0 = stackOut_50_0;
                        decompiledRegionSelector0 = 10;
                        break L0;
                      }
                    } else {
                      if ((param2 ^ -1) != -14) {
                        if (-97 != (param2 ^ -1)) {
                          if (-98 == (param2 ^ -1)) {
                            if (this.field_N >= this.field_r.length()) {
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
                                  stackOut_45_1 = 1 + this.field_N;
                                  stackIn_47_0 = stackOut_45_0;
                                  stackIn_47_1 = stackOut_45_1;
                                  break L7;
                                }
                              }
                              this.a(stackIn_47_1, 80);
                              stackOut_47_0 = 1;
                              stackIn_48_0 = stackOut_47_0;
                              decompiledRegionSelector0 = 9;
                              break L0;
                            }
                          } else {
                            if (param2 != 102) {
                              if (-104 == (param2 ^ -1)) {
                                this.a(this.field_r.length(), 72);
                                stackOut_41_0 = 1;
                                stackIn_42_0 = stackOut_41_0;
                                decompiledRegionSelector0 = 8;
                                break L0;
                              } else {
                                if ((param2 ^ -1) == -85) {
                                  this.i(17091);
                                  stackOut_39_0 = 1;
                                  stackIn_40_0 = stackOut_39_0;
                                  decompiledRegionSelector0 = 7;
                                  break L0;
                                } else {
                                  L8: {
                                    if (!ge.field_c[82]) {
                                      break L8;
                                    } else {
                                      if (-66 == (param2 ^ -1)) {
                                        this.l(11514);
                                        stackOut_37_0 = 1;
                                        stackIn_38_0 = stackOut_37_0;
                                        decompiledRegionSelector0 = 6;
                                        break L0;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                  L9: {
                                    if (!ge.field_c[82]) {
                                      break L9;
                                    } else {
                                      if ((param2 ^ -1) != -67) {
                                        break L9;
                                      } else {
                                        this.a(true);
                                        stackOut_31_0 = 1;
                                        stackIn_32_0 = stackOut_31_0;
                                        decompiledRegionSelector0 = 4;
                                        break L0;
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
                                      decompiledRegionSelector0 = 5;
                                      break L0;
                                    }
                                  }
                                }
                              }
                            } else {
                              this.a(0, 104);
                              stackOut_22_0 = 1;
                              stackIn_23_0 = stackOut_22_0;
                              decompiledRegionSelector0 = 3;
                              break L0;
                            }
                          }
                        } else {
                          if (-1 <= (this.field_N ^ -1)) {
                            break L6;
                          } else {
                            L10: {
                              stackOut_15_0 = this;
                              stackIn_17_0 = stackOut_15_0;
                              stackIn_16_0 = stackOut_15_0;
                              if (ge.field_c[82]) {
                                stackOut_17_0 = this;
                                stackOut_17_1 = this.m(-1);
                                stackIn_18_0 = stackOut_17_0;
                                stackIn_18_1 = stackOut_17_1;
                                break L10;
                              } else {
                                stackOut_16_0 = this;
                                stackOut_16_1 = -1 + this.field_N;
                                stackIn_18_0 = stackOut_16_0;
                                stackIn_18_1 = stackOut_16_1;
                                break L10;
                              }
                            }
                            this.a(stackIn_18_1, 104);
                            stackOut_18_0 = 1;
                            stackIn_19_0 = stackOut_18_0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          }
                        }
                      } else {
                        this.n(121);
                        stackOut_11_0 = 1;
                        stackIn_12_0 = stackOut_11_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                }
                L11: {
                  if (param1 < -99) {
                    break L11;
                  } else {
                    this.field_O = 77L;
                    break L11;
                  }
                }
                stackOut_74_0 = 0;
                stackIn_75_0 = stackOut_74_0;
                decompiledRegionSelector0 = 15;
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
            stackOut_76_0 = (RuntimeException) (var5);
            stackOut_76_1 = new StringBuilder().append("hf.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_78_0 = stackOut_76_0;
            stackIn_78_1 = stackOut_76_1;
            stackIn_77_0 = stackOut_76_0;
            stackIn_77_1 = stackOut_76_1;
            if (param3 == null) {
              stackOut_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackOut_78_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackOut_78_2 = "null";
              stackIn_79_0 = stackOut_78_0;
              stackIn_79_1 = stackOut_78_1;
              stackIn_79_2 = stackOut_78_2;
              break L12;
            } else {
              stackOut_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackOut_77_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackOut_77_2 = "{...}";
              stackIn_79_0 = stackOut_77_0;
              stackIn_79_1 = stackOut_77_1;
              stackIn_79_2 = stackOut_77_2;
              break L12;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_79_0), stackIn_79_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_19_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_23_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_32_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_36_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_38_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_40_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_42_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_48_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_51_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_54_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_57_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_60_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_71_0 != 0;
                                    } else {
                                      return stackIn_75_0 != 0;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final void a(int param0, int param1) {
        this.field_N = param0;
        if (!ge.field_c[81]) {
            this.field_F = this.field_N;
        }
        if (param1 <= 68) {
            this.a(-21, -53);
        }
    }

    private final void a(boolean param0) {
        String var2 = this.h(121);
        if (!param0) {
            this.a(93, -60, 36, -119);
        }
        if (var2.length() > 0) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.h(88))), (java.awt.datatransfer.ClipboardOwner) null);
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
                this.field_L = -18;
                break L1;
              }
            }
            L2: {
              super.a(param0, param1, param2, param3 + 0);
              this.e((byte) -120);
              if ((this.field_x ^ -1) == -2) {
                L3: {
                  if (this.field_v instanceof ne) {
                    var7 = (ne) ((Object) this.field_v);
                    var6 = var7.a(eg.field_b, param0, -10989, param1, (lk) (this), ij.field_e);
                    if (-1 == var6) {
                      break L3;
                    } else {
                      L4: {
                        if (!this.field_G) {
                          break L4;
                        } else {
                          if (this.field_L <= var6) {
                            break L4;
                          } else {
                            if (this.field_F >= var6) {
                              break L4;
                            } else {
                              var6 = this.field_L;
                              break L4;
                            }
                          }
                        }
                      }
                      this.field_N = var6;
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                this.field_M = id.a(57);
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
            stackOut_14_0 = (RuntimeException) (var5);
            stackOut_14_1 = new StringBuilder().append("hf.E(").append(param0).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param3 + ')');
        }
    }

    final static String a(CharSequence param0, byte param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 == 36) {
              stackOut_3_0 = ha.a(param0, param1 ^ -30737, false);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (String) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("hf.JA(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final int m(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = Main.field_T;
        if (-1 != (this.field_N ^ -1)) {
          var2 = this.field_N + param0;
          L0: while (true) {
            L1: {
              if (0 >= var2) {
                break L1;
              } else {
                if (this.field_r.charAt(var2 - 1) == 32) {
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
          return this.field_N;
        }
    }

    private final int j(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Main.field_T;
        if (param0 < -96) {
          var2 = this.field_r.length();
          if (var2 == this.field_N) {
            return this.field_N;
          } else {
            var3 = this.field_N + 1;
            L0: while (true) {
              L1: {
                if (var3 >= var2) {
                  break L1;
                } else {
                  if (this.field_r.charAt(var3 + -1) == 32) {
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
        int var3 = this.field_F >= this.field_N ? this.field_N : this.field_F;
        int var4 = this.field_F < this.field_N ? this.field_N : this.field_F;
        return this.field_r.substring(var3, var4);
    }

    final void a(int param0, int param1, int param2, int param3) {
        ne var8 = null;
        long var6 = 0L;
        if (null != this.field_v) {
            if (!(0 != param3)) {
                this.field_v.a(param0, (lk) (this), 11447, param1, this.field_B);
                if (!(!(this.field_v instanceof ne))) {
                    var8 = (ne) ((Object) this.field_v);
                    if (!(this.field_F == this.field_N)) {
                        var8.a((lk) (this), (byte) 67, param1, param0, this.field_N, this.field_F);
                    }
                    var6 = id.a(62);
                    if (((-this.field_M + var6) % 1000L ^ -1L) > -501L) {
                        var8.a(param0, this.field_N, param1, (byte) 55, (lk) (this));
                    }
                }
            }
        }
        if (param2 != -1) {
            field_I = 9;
        }
    }

    private final void e(byte param0) {
        mj var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ne var9 = null;
        var8 = Main.field_T;
        if (this.field_J) {
          if (!(this.field_v instanceof ne)) {
            return;
          } else {
            if (param0 <= -74) {
              var9 = (ne) ((Object) this.field_v);
              var3 = var9.a((byte) -96, (lk) (this));
              var4 = var3.b((byte) -5);
              var5 = var9.a((lk) (this), 0);
              var6 = var9.a(-1) >> -573259903;
              if (var5 - var6 <= var4) {
                L0: {
                  var7 = this.field_l + var3.a(true, this.field_N);
                  if (var7 > var5 + -var6) {
                    this.field_l = -var7 + (-var6 + var5) + this.field_l;
                    break L0;
                  } else {
                    if (var7 >= var6) {
                      break L0;
                    } else {
                      this.field_l = var6 + -var7 + this.field_l;
                      break L0;
                    }
                  }
                }
                L1: {
                  if (-1 <= (this.field_l ^ -1)) {
                    if (-var5 - -var6 <= this.field_l) {
                      break L1;
                    } else {
                      this.field_l = var6 + -var5;
                      break L1;
                    }
                  } else {
                    this.field_l = 0;
                    break L1;
                  }
                }
                return;
              } else {
                this.field_l = 0;
                this.field_m = 0;
                return;
              }
            } else {
              return;
            }
          }
        } else {
          this.field_m = 0;
          this.field_l = 0;
          return;
        }
    }

    private final void i(int param0) {
        if (param0 != 17091) {
            return;
        }
        if (this.field_k instanceof pi) {
            ((pi) ((Object) this.field_k)).a(-1, (hf) (this));
        }
    }

    private final void f(byte param0) {
        int var2 = 0;
        int var3 = 0;
        if (param0 != -56) {
            this.field_O = 28L;
        }
        if (this.field_F != this.field_N) {
            var2 = this.field_F < this.field_N ? this.field_F : this.field_N;
            var3 = this.field_N > this.field_F ? this.field_N : this.field_F;
            this.field_F = var2;
            this.field_N = var2;
            this.field_r = this.field_r.substring(0, var2) + this.field_r.substring(var3, this.field_r.length());
            this.k(param0 ^ -120);
        }
    }

    private final void l(int param0) {
        if (param0 != 11514) {
            return;
        }
        this.a(true);
        this.f((byte) -56);
    }

    public static void o(int param0) {
        String discarded$0 = null;
        field_H = null;
        if (param0 != -31141) {
            CharSequence var2 = (CharSequence) null;
            discarded$0 = hf.a((CharSequence) null, (byte) 102);
        }
    }

    static {
    }
}
