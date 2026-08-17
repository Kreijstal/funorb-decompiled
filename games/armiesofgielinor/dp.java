/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dp extends je {
    private hd field_Tb;
    private je field_Ob;
    private int field_Kb;
    static int[][] field_Vb;
    private boolean field_Nb;
    private int field_Mb;
    private int field_Jb;
    static long field_Lb;
    private boolean field_Ib;
    private long field_Wb;
    je field_Pb;
    private int field_Ub;
    private StringBuilder field_Rb;
    private wo field_Sb;
    private je field_Xb;
    private int field_Qb;

    private final int c(int param0, int param1) {
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 48) {
                break L1;
              } else {
                this.field_Qb = -37;
                break L1;
              }
            }
            var3_int = 0;
            var4 = 0;
            var5 = this.field_Rb.length();
            L2: while (true) {
              L3: {
                if (param1 <= var4) {
                  break L3;
                } else {
                  if (var5 <= var3_int) {
                    break L3;
                  } else {
                    incrementValue$1 = var3_int;
                    var3_int++;
                    var4 = var4 + this.field_Pb.field_Z.a(this.field_Rb.charAt(incrementValue$1));
                    continue L2;
                  }
                }
              }
              stackIn_8_0 = var3_int;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3), "dp.U(" + param0 + ',' + param1 + ')');
        }
        return stackIn_8_0;
    }

    final void a(boolean param0) {
        try {
            up.a(' ', 0, this.field_Rb, param0);
            this.field_Qb = 0;
            this.field_Jb = 0;
            this.field_Pb.field_X = this.field_Rb.toString();
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "dp.A(" + param0 + ')');
        }
    }

    final void a(hd param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_Tb = param0;
              if (param1 == 176) {
                break L1;
              } else {
                dp.n(63);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("dp.L(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
    }

    final static void n(int param0) {
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var5 = am.field_K;
            var1 = var5;
            var2 = param0;
            var3 = var5.length;
            L1: while (true) {
              if (var2 >= var3) {
                break L0;
              } else {
                incrementValue$16 = var2;
                var2++;
                var5[incrementValue$16] = 0;
                incrementValue$17 = var2;
                var2++;
                var5[incrementValue$17] = 0;
                incrementValue$18 = var2;
                var2++;
                var5[incrementValue$18] = 0;
                incrementValue$19 = var2;
                var2++;
                var5[incrementValue$19] = 0;
                incrementValue$20 = var2;
                var2++;
                var5[incrementValue$20] = 0;
                incrementValue$21 = var2;
                var2++;
                var5[incrementValue$21] = 0;
                incrementValue$22 = var2;
                var2++;
                var5[incrementValue$22] = 0;
                incrementValue$23 = var2;
                var2++;
                var5[incrementValue$23] = 0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1_ref), "dp.O(" + param0 + ')');
        }
    }

    public static void f(byte param0) {
        try {
            if (param0 != -123) {
                dp.f((byte) -111);
            }
            field_Vb = (int[][]) null;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "dp.R(" + param0 + ')');
        }
    }

    private dp(long param0, je param1, je param2, je param3, int param4) {
        super(param0, param1);
        Object stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        StringBuilder stackIn_3_2 = null;
        Object stackIn_4_0;
        StringBuilder stackIn_4_1;
        StringBuilder stackIn_4_2;
        int stackIn_4_3;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        this.field_Mb = -1;
        this.field_Nb = false;
        this.field_Ib = false;
        this.field_Wb = 0L;
        try {
          L0: {
            L1: {
              this.field_Ub = param4;
              this.field_Xb = new je(0L, param2);
              this.field_Pb = new je(0L, param3);
              this.field_Ob = new je(0L, param3);
              this.field_M = true;
              stackIn_3_0 = this;

              stackIn_3_1 = null;

              stackIn_3_2 = null;

              if (0 == (this.field_Ub ^ -1)) {
                stackIn_4_0 = this;
                stackIn_4_1 = null;
                stackIn_4_2 = null;
                stackIn_4_3 = 256;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = null;
                stackIn_4_2 = null;
                stackIn_4_3 = this.field_Ub;
                break L1;
              }
            }
            ((dp) (this)).field_Rb = new StringBuilder(stackIn_4_3);
            this.field_Pb.field_X = this.field_Rb.toString();
            this.field_Ob.field_X = "";
            this.field_Ob.field_I = "|";
            this.field_fb = new at();
            this.a(this.field_Xb, 48);
            this.a(this.field_Pb, 48);
            this.a(this.field_Ob, 89);
            this.field_Y = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var7);

            stackIn_9_1 = new StringBuilder().append("dp.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {
            stackIn_13_0 = (RuntimeException) ((Object) stackIn_10_0);

            stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {
            stackIn_17_0 = (RuntimeException) ((Object) stackIn_14_0);

            stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        int discarded$1 = 0;
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = this.field_Rb.length();
              if (0 > param1) {
                param1 = 0;
                break L1;
              } else {
                if (param1 <= var4_int) {
                  break L1;
                } else {
                  param1 = var4_int;
                  break L1;
                }
              }
            }
            L2: {
              if (0 > param2) {
                param2 = 0;
                break L2;
              } else {
                if (param2 > var4_int) {
                  param2 = var4_int;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (param0 == -98) {
                break L3;
              } else {
                discarded$1 = this.k(-15);
                break L3;
              }
            }
            this.field_Qb = param2;
            this.field_Jb = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) runtimeException), "dp.Q(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void l(int param0) {
        StringBuilder discarded$0 = null;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        String var4 = null;
        try {
          L0: {
            L1: {
              if (this.field_Qb == this.field_Jb) {
                break L1;
              } else {
                L2: {
                  if (this.field_Qb <= this.field_Jb) {
                    stackIn_5_0 = this.field_Qb;
                    break L2;
                  } else {
                    stackIn_5_0 = this.field_Jb;
                    break L2;
                  }
                }
                L3: {
                  var2_int = stackIn_5_0;
                  if (this.field_Jb >= this.field_Qb) {
                    stackIn_9_0 = this.field_Jb;
                    break L3;
                  } else {
                    stackIn_9_0 = this.field_Qb;
                    break L3;
                  }
                }
                var3 = stackIn_9_0;
                this.field_Jb = var2_int;
                this.field_Qb = var2_int;
                var4 = this.field_Rb.toString().substring(var3, this.field_Rb.length());
                up.a(' ', var2_int, this.field_Rb, true);
                discarded$0 = this.field_Rb.append(var4);
                this.field_Pb.field_X = this.field_Rb.toString();
                break L1;
              }
            }
            if (param0 == 32) {
              break L0;
            } else {
              field_Lb = -1L;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "dp.M(" + param0 + ')');
        }
    }

    private final void a(byte param0, String param1) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        try {
          L0: {
            L1: {
              if (0 != (this.field_Ub ^ -1)) {
                var3_int = this.field_Ub - this.field_Rb.length();
                if (0 == var3_int) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  param1 = param1.substring(0, var3_int);
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (this.field_Qb == this.field_Rb.length()) {
                discarded$0 = this.field_Rb.append(param1);
                break L2;
              } else {
                var4 = this.field_Rb.toString().substring(this.field_Qb, this.field_Rb.length());
                up.a(' ', this.field_Qb, this.field_Rb, true);
                discarded$1 = this.field_Rb.append(param1);
                discarded$2 = this.field_Rb.append(var4);
                break L2;
              }
            }
            var3_int = 109 / ((param0 - 44) / 40);
            this.field_Pb.field_X = this.field_Rb.toString();
            this.field_Qb = this.field_Rb.length();
            this.field_Jb = this.field_Qb;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("dp.P(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final String d(byte param0) {
        String var2 = null;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        String stackIn_11_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 115) {
                break L1;
              } else {
                this.p(78);
                break L1;
              }
            }
            L2: {
              var2 = this.field_Rb.toString();
              if (this.field_Qb <= this.field_Jb) {
                stackIn_6_0 = this.field_Qb;
                break L2;
              } else {
                stackIn_6_0 = this.field_Jb;
                break L2;
              }
            }
            L3: {
              var3 = stackIn_6_0;
              if (this.field_Jb >= this.field_Qb) {
                stackIn_10_0 = this.field_Jb;
                break L3;
              } else {
                stackIn_10_0 = this.field_Qb;
                break L3;
              }
            }
            var4 = stackIn_10_0;
            stackIn_11_0 = var2.substring(var3, var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2_ref), "dp.D(" + param0 + ')');
        }
        return stackIn_11_0;
    }

    final boolean a(int param0, int param1, char param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int stackIn_5_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_85_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        String var5 = null;
        try {
          L0: {
            if (param2 == 60) {
              stackIn_5_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (62 != param2) {
                L1: {
                  if (param2 < 32) {
                    break L1;
                  } else {
                    if (param2 <= 126) {
                      L2: {
                        if (this.field_Qb != this.field_Jb) {
                          this.l(32);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      L3: {
                        L4: {
                          if (-1 == this.field_Ub) {
                            break L4;
                          } else {
                            if (this.field_Rb.length() >= this.field_Ub) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L5: {
                          if (this.field_Qb != this.field_Rb.length()) {
                            var5 = this.field_Rb.toString().substring(this.field_Qb, this.field_Rb.length());
                            up.a(' ', this.field_Qb, this.field_Rb, true);
                            discarded$0 = this.field_Rb.append(param2);
                            discarded$1 = this.field_Rb.append(var5);
                            break L5;
                          } else {
                            discarded$2 = this.field_Rb.append(param2);
                            break L5;
                          }
                        }
                        this.field_Pb.field_X = this.field_Rb.toString();
                        this.field_Qb = this.field_Qb + 1;
                        this.field_Jb = this.field_Qb;
                        break L3;
                      }
                      stackIn_81_0 = 1;
                      decompiledRegionSelector0 = 13;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                L6: {
                  if (-86 != (param0 ^ -1)) {
                    if (-102 != (param0 ^ -1)) {
                      if ((param0 ^ -1) != -14) {
                        if ((param0 ^ -1) == -97) {
                          if (-1 > (this.field_Qb ^ -1)) {
                            L7: {
                              if (!br.field_f[82]) {
                                stackIn_66_0 = -1 + this.field_Qb;
                                break L7;
                              } else {
                                stackIn_66_0 = this.k(-1);
                                break L7;
                              }
                            }
                            var4_int = stackIn_66_0;
                            this.b(var4_int, false);
                            stackIn_67_0 = 1;
                            decompiledRegionSelector0 = 12;
                            break L0;
                          } else {
                            break L6;
                          }
                        } else {
                          if (-98 == (param0 ^ -1)) {
                            if (this.field_Qb >= this.field_Rb.length()) {
                              break L6;
                            } else {
                              L8: {
                                if (!br.field_f[82]) {
                                  stackIn_57_0 = this.field_Qb + 1;
                                  break L8;
                                } else {
                                  stackIn_57_0 = this.e((byte) 109);
                                  break L8;
                                }
                              }
                              var4_int = stackIn_57_0;
                              this.b(var4_int, false);
                              stackIn_58_0 = 1;
                              decompiledRegionSelector0 = 11;
                              break L0;
                            }
                          } else {
                            if ((param0 ^ -1) == -103) {
                              this.b(0, false);
                              stackIn_51_0 = 1;
                              decompiledRegionSelector0 = 10;
                              break L0;
                            } else {
                              if (-104 == (param0 ^ -1)) {
                                this.b(this.field_Rb.length(), false);
                                stackIn_49_0 = 1;
                                decompiledRegionSelector0 = 9;
                                break L0;
                              } else {
                                L9: {
                                  if (!br.field_f[82]) {
                                    break L9;
                                  } else {
                                    if (-66 == (param0 ^ -1)) {
                                      this.h((byte) 114);
                                      stackIn_47_0 = 1;
                                      decompiledRegionSelector0 = 8;
                                      break L0;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                L10: {
                                  if (!br.field_f[82]) {
                                    break L10;
                                  } else {
                                    if ((param0 ^ -1) == -67) {
                                      this.p(param1 ^ 26164);
                                      stackIn_45_0 = 1;
                                      decompiledRegionSelector0 = 7;
                                      break L0;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                if (!br.field_f[82]) {
                                  break L6;
                                } else {
                                  if ((param0 ^ -1) == -68) {
                                    this.g((byte) -77);
                                    stackIn_43_0 = 1;
                                    decompiledRegionSelector0 = 6;
                                    break L0;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        this.a(true);
                        stackIn_27_0 = 1;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      if (this.field_Jb == this.field_Qb) {
                        if (this.field_Qb >= this.field_Rb.length()) {
                          break L6;
                        } else {
                          this.field_Jb = 1 + this.field_Qb;
                          this.l(32);
                          stackIn_24_0 = 1;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      } else {
                        this.l(32);
                        stackIn_21_0 = 1;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  } else {
                    if (this.field_Qb != this.field_Jb) {
                      this.l(32);
                      stackIn_17_0 = 1;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      if ((this.field_Qb ^ -1) < -1) {
                        this.field_Jb = this.field_Qb + -1;
                        this.l(32);
                        stackIn_15_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                L11: {
                  if (param1 == -26126) {
                    break L11;
                  } else {
                    this.field_Wb = -48L;
                    break L11;
                  }
                }
                stackIn_85_0 = 0;
                decompiledRegionSelector0 = 14;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var4), "dp.K(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_17_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_21_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_24_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_27_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_43_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_45_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_47_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_49_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_51_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_58_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_67_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_81_0 != 0;
                                  } else {
                                    return stackIn_85_0 != 0;
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

    private final void g(byte param0) {
        if (!(this.field_Tb != null)) {
            return;
        }
        try {
            int var2_int = -66 / ((72 - param0) / 35);
            this.field_Sb = this.field_Tb.a(0);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "dp.N(" + param0 + ')');
        }
    }

    private final void h(byte param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            if (null == this.field_Tb) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                this.p(-87);
                if (param0 <= 90) {
                  this.field_Xb = (je) null;
                  this.l(32);
                  break L1;
                } else {
                  this.l(32);
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "dp.G(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void p(int param0) {
        try {
            java.awt.datatransfer.StringSelection var4 = null;
            if (this.field_Tb == null) {
                return;
            }
            int var2_int = -53 / ((param0 - 11) / 49);
            String var3 = this.d((byte) 115);
            if (var3.length() == 0) {
                return;
            }
            try {
                var4 = new java.awt.datatransfer.StringSelection(this.d((byte) 115));
                this.field_Tb.a((java.awt.datatransfer.Transferable) ((Object) var4), -26522);
            } catch (RuntimeException runtimeException) {
                throw ig.a((Throwable) ((Object) runtimeException), "dp.H(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final String q(int param0) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                this.field_Xb = (je) null;
                break L1;
              }
            }
            stackIn_3_0 = this.field_Rb.toString();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "dp.I(" + param0 + ')');
        }
        return stackIn_3_0;
    }

    final int o(int param0) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          L0: {
            var2_int = -34 / ((param0 - 21) / 39);
            stackIn_1_0 = this.field_Qb;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "dp.S(" + param0 + ')');
        }
        return stackIn_1_0;
    }

    final void a(String param0, byte param1) {
        StringBuilder discarded$4 = null;
        int dupTemp$5 = 0;
        int discarded$6 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_Rb.setLength(0);
              var3_int = param0.length();
              if (this.field_Ub == -1) {
                break L1;
              } else {
                if (this.field_Ub < var3_int) {
                  var3_int = this.field_Ub;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            discarded$4 = this.field_Rb.append(param0.substring(0, var3_int));
            dupTemp$5 = this.field_Rb.length();
            this.field_Jb = dupTemp$5;
            this.field_Qb = dupTemp$5;
            this.field_Pb.field_X = this.field_Rb.toString();
            if (param1 == 45) {
              break L0;
            } else {
              discarded$6 = this.e((byte) 43);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("dp.T(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        try {
            this.a(param3, -20500, param2, param0, param4);
            this.field_Pb.a(param3, -20500, param2, param1, 0);
            this.field_Ob.a(param3, -20500, param2, 0, 0);
            this.field_Kb = -4 + param3;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "dp.V(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void b(int param0, boolean param1) {
        this.field_Qb = param0;
        if (param1) {
            return;
        }
        try {
            if (!br.field_f[81]) {
                this.field_Jb = this.field_Qb;
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "dp.C(" + param0 + ',' + param1 + ')');
        }
    }

    dp(long param0, je param1, je param2, je param3) {
        this(param0, param1, param2, param3, -1);
    }

    final void c(int param0, boolean param1) {
        try {
            this.field_Jb = param0;
            this.field_Qb = param0;
            if (param1) {
                this.a(-36, 44, '');
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "dp.E(" + param0 + ',' + param1 + ')');
        }
    }

    final void m(int param0) {
        try {
            int dupTemp$0 = 0;
            Object stackIn_18_0 = null;
            Object stackIn_19_0 = null;
            int stackIn_19_1 = 0;
            int stackIn_32_0 = 0;
            Throwable decompiledCaughtException = null;
            int var2_int = 0;
            RuntimeException var2 = null;
            long var3_long = 0L;
            int var3 = 0;
            int var4_int = 0;
            Exception var4 = null;
            int var5 = 0;
            int var6 = 0;
            java.awt.datatransfer.Transferable var7 = null;
            String var8 = null;
            var6 = ArmiesOfGielinor.field_M ? 1 : 0;
            try {
              L0: {
                L1: {
                  var2_int = this.c(param0 ^ 48, sm.field_d - (this.field_V - -this.field_Pb.field_F));
                  if (-2 == (this.field_yb ^ -1)) {
                    L2: {
                      this.b(var2_int, false);
                      this.field_Ib = true;
                      var3_long = vi.b(param0 + -95);
                      stackIn_18_0 = this;

                      if (250L <= var3_long - this.field_Wb) {
                        stackIn_19_0 = this;
                        stackIn_19_1 = 0;
                        break L2;
                      } else {
                        stackIn_19_0 = this;
                        stackIn_19_1 = 1;
                        break L2;
                      }
                    }
                    L3: {
                      ((dp) (this)).field_Nb = stackIn_19_1 != 0;
                      if (!this.field_Nb) {
                        break L3;
                      } else {
                        L4: {
                          this.field_Jb = this.k(-1);
                          this.field_Qb = this.e((byte) 109);
                          if ((this.field_Qb ^ -1) >= -1) {
                            break L4;
                          } else {
                            if (this.field_Rb.charAt(this.field_Qb + -1) != 32) {
                              break L4;
                            } else {
                              this.field_Qb = this.field_Qb - 1;
                              break L4;
                            }
                          }
                        }
                        this.field_Mb = this.field_Qb;
                        break L3;
                      }
                    }
                    this.field_Wb = var3_long;
                    break L1;
                  } else {
                    L5: {
                      if ((ro.field_ub ^ -1) != -2) {
                        break L5;
                      } else {
                        if (this.field_Ib) {
                          if (!this.field_Nb) {
                            this.field_Qb = var2_int;
                            break L1;
                          } else {
                            if (var2_int >= this.field_Mb) {
                              this.field_Qb = var2_int;
                              break L1;
                            } else {
                              if (this.field_Jb >= var2_int) {
                                this.field_Qb = var2_int;
                                break L1;
                              } else {
                                var2_int = this.field_Mb;
                                this.field_Qb = var2_int;
                                break L1;
                              }
                            }
                          }
                        } else {
                          break L5;
                        }
                      }
                    }
                    this.field_Ib = false;
                    break L1;
                  }
                }
                L6: {
                  if (this.field_Y) {
                    break L6;
                  } else {
                    dupTemp$0 = this.field_Rb.length();
                    this.field_Jb = dupTemp$0;
                    this.field_Qb = dupTemp$0;
                    break L6;
                  }
                }
                L7: {
                  this.field_Ob.field_S = this.field_Pb.field_Z.a(this.field_Rb.toString().substring(param0, this.field_Qb));
                  if (this.field_Jb == this.field_Qb) {
                    this.field_Xb.a(this.field_Kb, -20500, 0, 2, this.field_Ob.field_S);
                    break L7;
                  } else {
                    L8: {
                      var3 = this.field_Pb.field_S + this.field_Pb.field_Z.a(this.field_Rb.toString().substring(0, this.field_Jb));
                      if (this.field_Ob.field_S <= var3) {
                        stackIn_32_0 = this.field_Ob.field_S;
                        break L8;
                      } else {
                        stackIn_32_0 = var3;
                        break L8;
                      }
                    }
                    var4_int = stackIn_32_0;
                    var5 = Math.abs(var3 - this.field_Ob.field_S);
                    this.field_Xb.a(this.field_Kb, param0 + -20500, var5, 2, var4_int + this.field_Pb.field_F);
                    break L7;
                  }
                }
                L9: {
                  if (this.field_Sb == null) {
                    break L9;
                  } else {
                    if (this.field_Sb.field_g != 0) {
                      var7 = (java.awt.datatransfer.Transferable) (this.field_Sb.field_f);
                      try {
                        L10: {
                          var8 = (String) (var7.getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                          this.l(32);
                          this.a((byte) 90, var8);
                          break L10;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L11: {
                          var4 = (Exception) (Object) decompiledCaughtException;
                          break L11;
                        }
                      }
                      this.field_Sb = null;
                      break L9;
                    } else {
                      return;
                    }
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2 = (RuntimeException) (Object) decompiledCaughtException;
              throw ig.a((Throwable) ((Object) var2), "dp.F(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int k(int param0) {
        int var2_int = 0;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if ((this.field_Qb ^ -1) != param0) {
              var2_int = this.field_Qb + -1;
              L1: while (true) {
                L2: {
                  if (0 >= var2_int) {
                    break L2;
                  } else {
                    if (wr.a(this.field_Rb.charAt(-1 + var2_int), (byte) 95)) {
                      break L2;
                    } else {
                      var2_int--;
                      continue L1;
                    }
                  }
                }
                stackIn_10_0 = var2_int;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = this.field_Qb;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "dp.J(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_10_0;
        }
    }

    private final int e(byte param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 109) {
                break L1;
              } else {
                this.field_Ib = false;
                break L1;
              }
            }
            var2_int = this.field_Rb.length();
            if (this.field_Qb != var2_int) {
              var3 = 1 + this.field_Qb;
              L2: while (true) {
                L3: {
                  if (var2_int <= var3) {
                    break L3;
                  } else {
                    if (wr.a(this.field_Rb.charAt(var3 + -1), (byte) 95)) {
                      break L3;
                    } else {
                      var3++;
                      continue L2;
                    }
                  }
                }
                stackIn_12_0 = var3;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_5_0 = this.field_Qb;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "dp.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_12_0;
        }
    }

    static {
        field_Vb = new int[][]{new int[]{48, 48}, new int[]{144, 0}, new int[]{0, 0}, new int[]{0, 176}, new int[]{32, 0}, new int[]{64, 64}};
    }
}
