/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ga extends pc {
    static String[] field_Q;
    private int field_D;
    private long field_C;
    private int field_N;
    private int field_O;
    private boolean field_G;
    static db field_L;
    private int field_I;
    private boolean field_M;
    private long field_K;
    static mk field_F;
    static am field_B;
    static int[] field_J;
    static dl field_E;
    static ko field_H;

    private final void l(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 != 0) {
          L0: {
            field_L = (db) null;
            if (this.field_N == this.field_D) {
              break L0;
            } else {
              L1: {
                if (this.field_D >= this.field_N) {
                  stackOut_13_0 = this.field_N;
                  stackIn_14_0 = stackOut_13_0;
                  break L1;
                } else {
                  stackOut_12_0 = this.field_D;
                  stackIn_14_0 = stackOut_12_0;
                  break L1;
                }
              }
              L2: {
                var2 = stackIn_14_0;
                if (this.field_N > this.field_D) {
                  stackOut_16_0 = this.field_N;
                  stackIn_17_0 = stackOut_16_0;
                  break L2;
                } else {
                  stackOut_15_0 = this.field_D;
                  stackIn_17_0 = stackOut_15_0;
                  break L2;
                }
              }
              var3 = stackIn_17_0;
              this.field_D = var2;
              this.field_N = var2;
              this.field_o = this.field_o.substring(0, var2) + this.field_o.substring(var3, this.field_o.length());
              this.h(127);
              break L0;
            }
          }
          return;
        } else {
          L3: {
            if (this.field_N == this.field_D) {
              break L3;
            } else {
              L4: {
                if (this.field_D >= this.field_N) {
                  stackOut_4_0 = this.field_N;
                  stackIn_5_0 = stackOut_4_0;
                  break L4;
                } else {
                  stackOut_3_0 = this.field_D;
                  stackIn_5_0 = stackOut_3_0;
                  break L4;
                }
              }
              L5: {
                var2 = stackIn_5_0;
                if (this.field_N > this.field_D) {
                  stackOut_7_0 = this.field_N;
                  stackIn_8_0 = stackOut_7_0;
                  break L5;
                } else {
                  stackOut_6_0 = this.field_D;
                  stackIn_8_0 = stackOut_6_0;
                  break L5;
                }
              }
              var3 = stackIn_8_0;
              this.field_D = var2;
              this.field_N = var2;
              this.field_o = this.field_o.substring(0, var2) + this.field_o.substring(var3, this.field_o.length());
              this.h(127);
              break L3;
            }
          }
          return;
        }
    }

    private final int i(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = CrazyCrystals.field_B;
        if (param0 == -26622) {
          if (-1 == (this.field_N ^ -1)) {
            return this.field_N;
          } else {
            var2 = -1 + this.field_N;
            L0: while (true) {
              if (var2 > 0) {
                if (-33 != (this.field_o.charAt(-1 + var2) ^ -1)) {
                  var2--;
                  continue L0;
                } else {
                  return var2;
                }
              } else {
                return var2;
              }
            }
          }
        } else {
          this.field_O = -45;
          if (-1 == (this.field_N ^ -1)) {
            return this.field_N;
          } else {
            var2 = -1 + this.field_N;
            L1: while (true) {
              if (var2 > 0) {
                if (-33 != (this.field_o.charAt(-1 + var2) ^ -1)) {
                  var2--;
                  continue L1;
                } else {
                  return var2;
                }
              } else {
                return var2;
              }
            }
          }
        }
    }

    private final void n(int param0) {
        try {
            Exception var2 = null;
            String var2_ref = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  if (param0 >= 59) {
                    break L1;
                  } else {
                    field_F = (mk) null;
                    break L1;
                  }
                }
                var2_ref = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                this.l(0);
                this.b(var2_ref, -1);
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2 = (Exception) (Object) decompiledCaughtException;
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        long var6 = 0L;
        qm var8 = null;
        fi var9 = null;
        if (null != this.field_i) {
          if (param3 == 0) {
            this.field_i.a(param0, false, param2, (qm) (this), this.field_x);
            if (this.field_i instanceof fi) {
              L0: {
                var9 = (fi) ((Object) this.field_i);
                if (this.field_N != this.field_D) {
                  var9.a((byte) 71, (qm) (this), param2, this.field_D, this.field_N, param0);
                  break L0;
                } else {
                  break L0;
                }
              }
              var6 = lo.a((byte) -83);
              if ((-this.field_K + var6) % 1000L < 500L) {
                var9.a(this.field_N, 27310, (qm) (this), param2, param0);
                if (param1 > -12) {
                  var8 = (qm) null;
                  this.a((qm) null, 83, 43, 63);
                  return;
                } else {
                  return;
                }
              } else {
                if (param1 > -12) {
                  var8 = (qm) null;
                  this.a((qm) null, 83, 43, 63);
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (param1 > -12) {
                var8 = (qm) null;
                this.a((qm) null, 83, 43, 63);
                return;
              } else {
                return;
              }
            }
          } else {
            if (param1 > -12) {
              var8 = (qm) null;
              this.a((qm) null, 83, 43, 63);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param1 > -12) {
            var8 = (qm) null;
            this.a((qm) null, 83, 43, 63);
            return;
          } else {
            return;
          }
        }
    }

    public static void o(int param0) {
        field_L = null;
        field_F = null;
        field_E = null;
        field_H = null;
        field_Q = null;
        field_J = null;
        if (param0 != 0) {
            return;
        }
        field_B = null;
    }

    private final int j(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = CrazyCrystals.field_B;
        var2 = this.field_o.length();
        if (var2 == this.field_N) {
          return this.field_N;
        } else {
          var3 = 1 + this.field_N;
          L0: while (true) {
            if (var2 > var3) {
              if (this.field_o.charAt(var3 - 1) != 32) {
                var3++;
                continue L0;
              } else {
                if (param0 != 612) {
                  return 60;
                } else {
                  return var3;
                }
              }
            } else {
              if (param0 != 612) {
                return 60;
              } else {
                return var3;
              }
            }
          }
        }
    }

    private final void b(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
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
              if ((this.field_I ^ -1) == 0) {
                break L1;
              } else {
                var3_int = this.field_I - this.field_o.length();
                if ((var3_int ^ -1) <= -1) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  param0 = param0.substring(0, var3_int);
                  break L1;
                }
              }
            }
            L2: {
              if (param1 == -1) {
                break L2;
              } else {
                field_L = (db) null;
                break L2;
              }
            }
            L3: {
              if (this.field_N != this.field_o.length()) {
                this.field_o = this.field_o.substring(0, this.field_N) + param0 + this.field_o.substring(this.field_N, this.field_o.length());
                break L3;
              } else {
                this.field_o = this.field_o + param0;
                break L3;
              }
            }
            this.field_N = this.field_N + param0.length();
            this.field_D = this.field_N;
            this.h(127);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3);
            stackOut_12_1 = new StringBuilder().append("ga.G(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(int param0, int param1, qm param2, boolean param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        long var8_long = 0L;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
              stackOut_17_0 = 0;
              stackIn_18_0 = stackOut_17_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              if (this.field_i instanceof fi) {
                L1: {
                  var8_int = ((fi) ((Object) this.field_i)).a(qh.field_i, 58, bm.field_h, param4, param0, (qm) (this));
                  stackOut_3_0 = this;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (-1 == var8_int) {
                    stackOut_5_0 = this;
                    stackOut_5_1 = 0;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    break L1;
                  } else {
                    stackOut_4_0 = this;
                    stackOut_4_1 = var8_int;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    break L1;
                  }
                }
                L2: {
                  this.a(stackIn_6_1, true);
                  var8_long = lo.a((byte) 77);
                  stackOut_6_0 = this;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (250L <= -this.field_C + var8_long) {
                    stackOut_8_0 = this;
                    stackOut_8_1 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    break L2;
                  } else {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    break L2;
                  }
                }
                L3: {
                  ((ga) (this)).field_M = stackIn_9_1 != 0;
                  if (this.field_M) {
                    L4: {
                      this.field_D = this.i(-26622);
                      this.field_N = this.j(612);
                      if ((this.field_N ^ -1) >= -1) {
                        break L4;
                      } else {
                        if (this.field_o.charAt(this.field_N + -1) != 32) {
                          break L4;
                        } else {
                          this.field_N = this.field_N - 1;
                          break L4;
                        }
                      }
                    }
                    this.field_O = this.field_N;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                this.field_C = var8_long;
                stackOut_15_0 = 1;
                stackIn_16_0 = stackOut_15_0;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var8);
            stackOut_19_1 = new StringBuilder().append("ga.KA(").append(param0).append(',').append(param1).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_16_0 != 0;
        } else {
          return stackIn_18_0 != 0;
        }
    }

    final boolean a(int param0, int param1, qm param2, char param3) {
        int dupTemp$1 = 0;
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        Object stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_55_0 = 0;
        Object stackIn_59_0 = null;
        Object stackIn_60_0 = null;
        Object stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_76_0 = 0;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_71_0 = 0;
        Object stackOut_58_0 = null;
        Object stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        Object stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        int stackOut_61_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_37_0 = 0;
        Object stackOut_29_0 = null;
        Object stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        Object stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        try {
          L0: {
            L1: {
              this.field_K = lo.a((byte) -116);
              if (60 == param3) {
                break L1;
              } else {
                if (param3 == 62) {
                  break L1;
                } else {
                  L2: {
                    if (param3 < 32) {
                      break L2;
                    } else {
                      if (param3 <= 126) {
                        L3: {
                          if (this.field_D == this.field_N) {
                            break L3;
                          } else {
                            this.l(param1 + -19279);
                            break L3;
                          }
                        }
                        L4: {
                          if (-1 == this.field_I) {
                            break L4;
                          } else {
                            if (this.field_o.length() < this.field_I) {
                              break L4;
                            } else {
                              return true;
                            }
                          }
                        }
                        L5: {
                          if (this.field_N < this.field_o.length()) {
                            this.field_o = this.field_o.substring(0, this.field_N) + param3 + this.field_o.substring(this.field_N, this.field_o.length());
                            this.field_N = this.field_N + 1;
                            this.field_D = this.field_N;
                            break L5;
                          } else {
                            this.field_o = this.field_o + param3;
                            dupTemp$1 = this.field_o.length();
                            this.field_N = dupTemp$1;
                            this.field_D = dupTemp$1;
                            break L5;
                          }
                        }
                        this.h(127);
                        stackOut_71_0 = 1;
                        stackIn_72_0 = stackOut_71_0;
                        decompiledRegionSelector0 = 14;
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L6: {
                    if (85 != param0) {
                      if ((param0 ^ -1) != -102) {
                        if (param0 != 13) {
                          if ((param0 ^ -1) == -97) {
                            if ((this.field_N ^ -1) < -1) {
                              L7: {
                                stackOut_58_0 = this;
                                stackIn_60_0 = stackOut_58_0;
                                stackIn_59_0 = stackOut_58_0;
                                if (!cp.field_k[82]) {
                                  stackOut_60_0 = this;
                                  stackOut_60_1 = -1 + this.field_N;
                                  stackIn_61_0 = stackOut_60_0;
                                  stackIn_61_1 = stackOut_60_1;
                                  break L7;
                                } else {
                                  stackOut_59_0 = this;
                                  stackOut_59_1 = this.i(-26622);
                                  stackIn_61_0 = stackOut_59_0;
                                  stackIn_61_1 = stackOut_59_1;
                                  break L7;
                                }
                              }
                              this.a(stackIn_61_1, true);
                              stackOut_61_0 = 1;
                              stackIn_62_0 = stackOut_61_0;
                              decompiledRegionSelector0 = 13;
                              break L0;
                            } else {
                              break L6;
                            }
                          } else {
                            if (-98 != (param0 ^ -1)) {
                              if (param0 == 102) {
                                this.a(0, true);
                                stackOut_54_0 = 1;
                                stackIn_55_0 = stackOut_54_0;
                                decompiledRegionSelector0 = 12;
                                break L0;
                              } else {
                                if (103 == param0) {
                                  this.a(this.field_o.length(), true);
                                  stackOut_52_0 = 1;
                                  stackIn_53_0 = stackOut_52_0;
                                  decompiledRegionSelector0 = 11;
                                  break L0;
                                } else {
                                  if (param0 != 84) {
                                    L8: {
                                      if (!cp.field_k[82]) {
                                        break L8;
                                      } else {
                                        if ((param0 ^ -1) != -66) {
                                          break L8;
                                        } else {
                                          this.g((byte) -75);
                                          stackOut_41_0 = 1;
                                          stackIn_42_0 = stackOut_41_0;
                                          decompiledRegionSelector0 = 8;
                                          break L0;
                                        }
                                      }
                                    }
                                    L9: {
                                      if (!cp.field_k[82]) {
                                        break L9;
                                      } else {
                                        if (-67 == (param0 ^ -1)) {
                                          this.e((byte) 68);
                                          stackOut_50_0 = 1;
                                          stackIn_51_0 = stackOut_50_0;
                                          decompiledRegionSelector0 = 10;
                                          break L0;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                    if (!cp.field_k[82]) {
                                      break L6;
                                    } else {
                                      if (67 != param0) {
                                        break L6;
                                      } else {
                                        this.n(param1 ^ 19254);
                                        stackOut_48_0 = 1;
                                        stackIn_49_0 = stackOut_48_0;
                                        decompiledRegionSelector0 = 9;
                                        break L0;
                                      }
                                    }
                                  } else {
                                    this.f((byte) 23);
                                    stackOut_37_0 = 1;
                                    stackIn_38_0 = stackOut_37_0;
                                    decompiledRegionSelector0 = 7;
                                    break L0;
                                  }
                                }
                              }
                            } else {
                              if (this.field_N >= this.field_o.length()) {
                                break L6;
                              } else {
                                L10: {
                                  stackOut_29_0 = this;
                                  stackIn_31_0 = stackOut_29_0;
                                  stackIn_30_0 = stackOut_29_0;
                                  if (!cp.field_k[82]) {
                                    stackOut_31_0 = this;
                                    stackOut_31_1 = this.field_N + 1;
                                    stackIn_32_0 = stackOut_31_0;
                                    stackIn_32_1 = stackOut_31_1;
                                    break L10;
                                  } else {
                                    stackOut_30_0 = this;
                                    stackOut_30_1 = this.j(612);
                                    stackIn_32_0 = stackOut_30_0;
                                    stackIn_32_1 = stackOut_30_1;
                                    break L10;
                                  }
                                }
                                this.a(stackIn_32_1, true);
                                stackOut_32_0 = 1;
                                stackIn_33_0 = stackOut_32_0;
                                decompiledRegionSelector0 = 6;
                                break L0;
                              }
                            }
                          }
                        } else {
                          this.k(param1 + -19357);
                          stackOut_24_0 = 1;
                          stackIn_25_0 = stackOut_24_0;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        }
                      } else {
                        if (this.field_N == this.field_D) {
                          if (this.field_N >= this.field_o.length()) {
                            break L6;
                          } else {
                            this.field_D = this.field_N - -1;
                            this.l(0);
                            stackOut_21_0 = 1;
                            stackIn_22_0 = stackOut_21_0;
                            decompiledRegionSelector0 = 4;
                            break L0;
                          }
                        } else {
                          this.l(0);
                          stackOut_18_0 = 1;
                          stackIn_19_0 = stackOut_18_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      }
                    } else {
                      if (this.field_D != this.field_N) {
                        this.l(param1 + -19279);
                        stackOut_14_0 = 1;
                        stackIn_15_0 = stackOut_14_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        if (this.field_N > 0) {
                          this.field_D = this.field_N - 1;
                          this.l(param1 ^ 19279);
                          stackOut_12_0 = 1;
                          stackIn_13_0 = stackOut_12_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  L11: {
                    if (param1 == 19279) {
                      break L11;
                    } else {
                      this.field_D = 58;
                      break L11;
                    }
                  }
                  stackOut_75_0 = 0;
                  stackIn_76_0 = stackOut_75_0;
                  decompiledRegionSelector0 = 15;
                  break L0;
                }
              }
            }
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackOut_77_0 = (RuntimeException) (var5);
            stackOut_77_1 = new StringBuilder().append("ga.AA(").append(param0).append(',').append(param1).append(',');
            stackIn_79_0 = stackOut_77_0;
            stackIn_79_1 = stackOut_77_1;
            stackIn_78_0 = stackOut_77_0;
            stackIn_78_1 = stackOut_77_1;
            if (param2 == null) {
              stackOut_79_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackOut_79_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackOut_79_2 = "null";
              stackIn_80_0 = stackOut_79_0;
              stackIn_80_1 = stackOut_79_1;
              stackIn_80_2 = stackOut_79_2;
              break L12;
            } else {
              stackOut_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackOut_78_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackOut_78_2 = "{...}";
              stackIn_80_0 = stackOut_78_0;
              stackIn_80_1 = stackOut_78_1;
              stackIn_80_2 = stackOut_78_2;
              break L12;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_80_0), stackIn_80_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_22_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_25_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_33_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_38_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_42_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_49_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_51_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_53_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_55_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_62_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_72_0 != 0;
                                    } else {
                                      return stackIn_76_0 != 0;
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

    private final void f(byte param0) {
        if (!(!(this.field_l instanceof ho))) {
            ((ho) ((Object) this.field_l)).a(97, (ga) (this));
        }
        int var2 = -60 % ((param0 - 77) / 39);
    }

    void h(int param0) {
        if (param0 <= 125) {
          L0: {
            field_B = (am) null;
            if (this.field_l instanceof ho) {
              ((ho) ((Object) this.field_l)).a((ga) (this), -29513);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (this.field_l instanceof ho) {
              ((ho) ((Object) this.field_l)).a((ga) (this), -29513);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    private final String b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          if (this.field_D < this.field_N) {
            stackOut_2_0 = this.field_D;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = this.field_N;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var2 = stackIn_3_0;
          if (this.field_N <= this.field_D) {
            stackOut_5_0 = this.field_D;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = this.field_N;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        var3 = stackIn_6_0;
        if (!param0) {
          this.field_K = 92L;
          return this.field_o.substring(var2, var3);
        } else {
          return this.field_o.substring(var2, var3);
        }
    }

    private final void g(byte param0) {
        this.e((byte) 95);
        this.l(0);
        if (param0 >= -54) {
            this.field_G = true;
        }
    }

    private final void e(byte param0) {
        try {
            String var2 = null;
            if (param0 < 30) {
              return;
            } else {
              L0: {
                var2 = this.b(true);
                if (var2.length() > 0) {
                  java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.b(true))), (java.awt.datatransfer.ClipboardOwner) null);
                  break L0;
                } else {
                  break L0;
                }
              }
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    void a(qm param0, int param1, int param2, int param3) {
        fi var7 = null;
        int var6 = 0;
        try {
            super.a(param0, -121, param2, param3);
            this.m(0);
            if (!((this.field_s ^ -1) != -2)) {
                if (this.field_i instanceof fi) {
                    var7 = (fi) ((Object) this.field_i);
                    var6 = var7.a(qh.field_i, 108, bm.field_h, param2, param3, (qm) (this));
                    if (!(0 == (var6 ^ -1))) {
                        if (this.field_M) {
                            if (this.field_O > var6) {
                                if (!(var6 <= this.field_D)) {
                                    var6 = this.field_O;
                                }
                            }
                        }
                        this.field_N = var6;
                    }
                }
                this.field_K = lo.a((byte) 98);
            }
            int var5_int = 26 / ((param1 - -50) / 59);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "ga.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static int p(int param0) {
        boolean discarded$12 = false;
        boolean discarded$13 = false;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_25_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_13_0 = 0;
        var2 = CrazyCrystals.field_B;
        try {
          L0: {
            discarded$12 = qe.field_g.a(ea.field_r, false, true, cn.field_a);
            qe.field_g.b(false);
            L1: while (true) {
              if (!ge.b(-31)) {
                if (0 != (pl.field_g ^ -1)) {
                  var1_int = pl.field_g;
                  rc.a(-25537, -1);
                  stackOut_6_0 = var1_int;
                  stackIn_7_0 = stackOut_6_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  if (dj.field_t) {
                    stackOut_10_0 = 3;
                    stackIn_11_0 = stackOut_10_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    if (l.field_b != sg.field_b) {
                      if (gk.field_e.b(param0 + -75)) {
                        if (l.field_b == lc.field_c) {
                          stackOut_20_0 = 2;
                          stackIn_21_0 = stackOut_20_0;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          L2: {
                            if (param0 == -1) {
                              break L2;
                            } else {
                              field_J = (int[]) null;
                              break L2;
                            }
                          }
                          stackOut_24_0 = -1;
                          stackIn_25_0 = stackOut_24_0;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        }
                      } else {
                        stackOut_16_0 = 1;
                        stackIn_17_0 = stackOut_16_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    } else {
                      stackOut_13_0 = 1;
                      stackIn_14_0 = stackOut_13_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
              } else {
                discarded$13 = qe.field_g.a(pj.field_q, false, c.field_p);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var1), "ga.F(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_17_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_21_0;
                } else {
                  return stackIn_25_0;
                }
              }
            }
          }
        }
    }

    final void k(int param0) {
        int discarded$2 = 0;
        this.field_D = 0;
        this.field_o = "";
        this.field_N = 0;
        if (param0 > -70) {
          discarded$2 = ga.p(-5);
          this.h(126);
          return;
        } else {
          this.h(126);
          return;
        }
    }

    private final void m(int param0) {
        tb var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        fi var9 = null;
        var8 = CrazyCrystals.field_B;
        if (!this.field_G) {
          this.field_h = 0;
          this.field_k = 0;
          return;
        } else {
          if (!(this.field_i instanceof fi)) {
            return;
          } else {
            var9 = (fi) ((Object) this.field_i);
            var3 = var9.a((qm) (this), 1);
            if (param0 != 0) {
              this.field_K = -79L;
              var4 = var3.a(108);
              var5 = var9.a(106, (qm) (this));
              var6 = var9.a(40) >> 1179813889;
              if (var4 >= var5 - var6) {
                var7 = this.field_h - -var3.a(this.field_N, 1);
                if (var5 + -var6 < var7) {
                  this.field_h = this.field_h + -var7 + -var6 + var5;
                  if (-1 <= (this.field_h ^ -1)) {
                    if (this.field_h < var6 + -var5) {
                      this.field_h = -var5 + var6;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    this.field_h = 0;
                    return;
                  }
                } else {
                  if (var7 < var6) {
                    this.field_h = -var7 - -var6 + this.field_h;
                    if (-1 <= (this.field_h ^ -1)) {
                      if (this.field_h >= var6 + -var5) {
                        return;
                      } else {
                        this.field_h = -var5 + var6;
                        return;
                      }
                    } else {
                      this.field_h = 0;
                      return;
                    }
                  } else {
                    if (-1 <= (this.field_h ^ -1)) {
                      if (this.field_h >= var6 + -var5) {
                        return;
                      } else {
                        this.field_h = -var5 + var6;
                        return;
                      }
                    } else {
                      this.field_h = 0;
                      return;
                    }
                  }
                }
              } else {
                this.field_k = 0;
                this.field_h = 0;
                return;
              }
            } else {
              var4 = var3.a(108);
              var5 = var9.a(106, (qm) (this));
              var6 = var9.a(40) >> 1179813889;
              if (var4 >= var5 - var6) {
                var7 = this.field_h - -var3.a(this.field_N, 1);
                if (var5 + -var6 < var7) {
                  this.field_h = this.field_h + -var7 + -var6 + var5;
                  if (-1 <= (this.field_h ^ -1)) {
                    if (this.field_h >= var6 + -var5) {
                      return;
                    } else {
                      this.field_h = -var5 + var6;
                      return;
                    }
                  } else {
                    this.field_h = 0;
                    return;
                  }
                } else {
                  if (var7 >= var6) {
                    L0: {
                      if (-1 > (this.field_h ^ -1)) {
                        this.field_h = 0;
                        break L0;
                      } else {
                        if (this.field_h < var6 + -var5) {
                          this.field_h = -var5 + var6;
                          break L0;
                        } else {
                          break L0;
                        }
                      }
                    }
                    return;
                  } else {
                    L1: {
                      this.field_h = -var7 - -var6 + this.field_h;
                      if (-1 > (this.field_h ^ -1)) {
                        this.field_h = 0;
                        break L1;
                      } else {
                        if (this.field_h < var6 + -var5) {
                          this.field_h = -var5 + var6;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    }
                    return;
                  }
                }
              } else {
                this.field_k = 0;
                this.field_h = 0;
                return;
              }
            }
          }
        }
    }

    final void a(boolean param0, int param1, String param2) {
        int dupTemp$2 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
            if (param1 < -54) {
              L1: {
                if (param2 != null) {
                  break L1;
                } else {
                  param2 = "";
                  break L1;
                }
              }
              L2: {
                this.field_o = param2;
                var4_int = param2.length();
                if ((this.field_I ^ -1) == 0) {
                  break L2;
                } else {
                  if (this.field_I >= var4_int) {
                    break L2;
                  } else {
                    this.field_o = this.field_o.substring(0, this.field_I);
                    break L2;
                  }
                }
              }
              dupTemp$2 = this.field_o.length();
              this.field_D = dupTemp$2;
              this.field_N = dupTemp$2;
              if (param0) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                this.h(126);
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var4);
            stackOut_10_1 = new StringBuilder().append("ga.R(").append(param0).append(',').append(param1).append(',');
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
          throw dn.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, boolean param1) {
        L0: {
          this.field_N = param0;
          if (!cp.field_k[81]) {
            this.field_D = this.field_N;
            break L0;
          } else {
            break L0;
          }
        }
        if (!param1) {
          this.f((byte) -31);
          return;
        } else {
          return;
        }
    }

    ga(String param0, bi param1, int param2) {
        super(param0, param1);
        this.field_C = 0L;
        this.field_O = -1;
        this.field_M = false;
        try {
            this.field_i = pi.field_j.field_q;
            this.field_I = param2;
            this.a(true, -115, param0);
            this.field_G = true;
            this.field_K = lo.a((byte) -91);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "ga.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_Q = new String[]{"All scores", "My scores", "Best each"};
        field_F = new mk();
        field_J = new int[1024];
    }
}
