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
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_14_0 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 == 48) {
          var3 = 0;
          var4 = 0;
          var5 = this.field_Rb.length();
          L0: while (true) {
            L1: {
              L2: {
                if (param1 <= var4) {
                  break L2;
                } else {
                  stackOut_4_0 = var5;
                  stackIn_8_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (var6 != 0) {
                    break L1;
                  } else {
                    if (stackIn_5_0 <= var3) {
                      break L2;
                    } else {
                      incrementValue$4 = var3;
                      var3++;
                      var4 = var4 + this.field_Pb.field_Z.a(this.field_Rb.charAt(incrementValue$4));
                      continue L0;
                    }
                  }
                }
              }
              stackOut_7_0 = var3;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            }
            return stackIn_8_0;
          }
        } else {
          this.field_Qb = -37;
          var3 = 0;
          var4 = 0;
          var5 = this.field_Rb.length();
          L3: while (true) {
            L4: {
              L5: {
                if (param1 <= var4) {
                  break L5;
                } else {
                  stackOut_11_0 = var5;
                  stackIn_15_0 = stackOut_11_0;
                  stackIn_12_0 = stackOut_11_0;
                  if (var6 != 0) {
                    break L4;
                  } else {
                    if (stackIn_12_0 <= var3) {
                      break L5;
                    } else {
                      incrementValue$5 = var3;
                      var3++;
                      var4 = var4 + this.field_Pb.field_Z.a(this.field_Rb.charAt(incrementValue$5));
                      continue L3;
                    }
                  }
                }
              }
              stackOut_14_0 = var3;
              stackIn_15_0 = stackOut_14_0;
              break L4;
            }
            return stackIn_15_0;
          }
        }
    }

    final void a(boolean param0) {
        StringBuilder discarded$0 = up.a(' ', 0, this.field_Rb, param0);
        this.field_Qb = 0;
        this.field_Jb = 0;
        this.field_Pb.field_X = this.field_Rb.toString();
    }

    final void a(hd param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
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
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("dp.L(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final static void n(int param0) {
        int incrementValue$40 = 0;
        int incrementValue$41 = 0;
        int incrementValue$42 = 0;
        int incrementValue$43 = 0;
        int incrementValue$44 = 0;
        int incrementValue$45 = 0;
        int incrementValue$46 = 0;
        int incrementValue$47 = 0;
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
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
                incrementValue$40 = var2;
                var2++;
                var5[incrementValue$40] = 0;
                incrementValue$41 = var2;
                var2++;
                var5[incrementValue$41] = 0;
                incrementValue$42 = var2;
                var2++;
                var5[incrementValue$42] = 0;
                incrementValue$43 = var2;
                var2++;
                var5[incrementValue$43] = 0;
                incrementValue$44 = var2;
                var2++;
                var5[incrementValue$44] = 0;
                incrementValue$45 = var2;
                var2++;
                var5[incrementValue$45] = 0;
                incrementValue$46 = var2;
                var2++;
                var5[incrementValue$46] = 0;
                incrementValue$47 = var2;
                var2++;
                var5[incrementValue$47] = 0;
                if (var4 == 0) {
                  continue L1;
                } else {
                  return;
                }
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
        if (param0 != -123) {
            dp.f((byte) -111);
            field_Vb = (int[][]) null;
            return;
        }
        field_Vb = (int[][]) null;
    }

    private dp(long param0, je param1, je param2, je param3, int param4) {
        super(param0, param1);
        RuntimeException var7 = null;
        Object stackIn_2_0 = null;
        StringBuilder stackIn_2_1 = null;
        StringBuilder stackIn_2_2 = null;
        Object stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        StringBuilder stackIn_3_2 = null;
        Object stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        StringBuilder stackIn_4_2 = null;
        int stackIn_4_3 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
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
        Object stackOut_1_0 = null;
        StringBuilder stackOut_1_1 = null;
        StringBuilder stackOut_1_2 = null;
        Object stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        StringBuilder stackOut_3_2 = null;
        int stackOut_3_3 = 0;
        Object stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        StringBuilder stackOut_2_2 = null;
        int stackOut_2_3 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
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
              stackOut_1_0 = this;
              stackOut_1_1 = null;
              stackOut_1_2 = null;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_3_2 = stackOut_1_2;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              stackIn_2_2 = stackOut_1_2;
              if (0 == (this.field_Ub ^ -1)) {
                stackOut_3_0 = this;
                stackOut_3_1 = null;
                stackOut_3_2 = null;
                stackOut_3_3 = 256;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                stackIn_4_3 = stackOut_3_3;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = null;
                stackOut_2_2 = null;
                stackOut_2_3 = this.field_Ub;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_4_2 = stackOut_2_2;
                stackIn_4_3 = stackOut_2_3;
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
            stackOut_6_0 = (RuntimeException) (var7);
            stackOut_6_1 = new StringBuilder().append("dp.<init>(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        int discarded$2 = 0;
        int discarded$3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          L1: {
            var5 = ArmiesOfGielinor.field_M ? 1 : 0;
            var4 = this.field_Rb.length();
            if (0 > param1) {
              break L1;
            } else {
              if (param1 <= var4) {
                break L0;
              } else {
                param1 = var4;
                if (var5 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          param1 = 0;
          break L0;
        }
        L2: {
          L3: {
            if (0 > param2) {
              break L3;
            } else {
              if (param2 > var4) {
                param2 = var4;
                if (var5 == 0) {
                  break L2;
                } else {
                  break L3;
                }
              } else {
                if (param0 == -98) {
                  this.field_Qb = param2;
                  this.field_Jb = param1;
                  return;
                } else {
                  discarded$2 = this.k(-15);
                  this.field_Qb = param2;
                  this.field_Jb = param1;
                  return;
                }
              }
            }
          }
          param2 = 0;
          break L2;
        }
        if (param0 != -98) {
          discarded$3 = this.k(-15);
          this.field_Qb = param2;
          this.field_Jb = param1;
          return;
        } else {
          this.field_Qb = param2;
          this.field_Jb = param1;
          return;
        }
    }

    private final void l(int param0) {
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        int var2 = 0;
        int var3 = 0;
        String var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (this.field_Qb == this.field_Jb) {
            break L0;
          } else {
            L1: {
              if (this.field_Qb <= this.field_Jb) {
                stackOut_3_0 = this.field_Qb;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = this.field_Jb;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var2 = stackIn_4_0;
              if (this.field_Jb >= this.field_Qb) {
                stackOut_6_0 = this.field_Jb;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = this.field_Qb;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            var3 = stackIn_7_0;
            this.field_Jb = var2;
            this.field_Qb = var2;
            var4 = this.field_Rb.toString().substring(var3, this.field_Rb.length());
            discarded$4 = up.a(' ', var2, this.field_Rb, true);
            discarded$5 = this.field_Rb.append(var4);
            this.field_Pb.field_X = this.field_Rb.toString();
            break L0;
          }
        }
        if (param0 != 32) {
          field_Lb = -1L;
          return;
        } else {
          return;
        }
    }

    private final void a(byte param0, String param1) {
        StringBuilder discarded$14 = null;
        StringBuilder discarded$15 = null;
        StringBuilder discarded$16 = null;
        StringBuilder discarded$17 = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
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
              L3: {
                if (this.field_Qb == this.field_Rb.length()) {
                  break L3;
                } else {
                  var4 = this.field_Rb.toString().substring(this.field_Qb, this.field_Rb.length());
                  discarded$14 = up.a(' ', this.field_Qb, this.field_Rb, true);
                  discarded$15 = this.field_Rb.append(param1);
                  discarded$16 = this.field_Rb.append(var4);
                  if (!ArmiesOfGielinor.field_M) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              discarded$17 = this.field_Rb.append(param1);
              break L2;
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
          L4: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3);
            stackOut_11_1 = new StringBuilder().append("dp.P(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final String d(byte param0) {
        String var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 != 115) {
          L0: {
            this.p(78);
            var2 = this.field_Rb.toString();
            if (this.field_Qb <= this.field_Jb) {
              stackOut_10_0 = this.field_Qb;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              stackOut_9_0 = this.field_Jb;
              stackIn_11_0 = stackOut_9_0;
              break L0;
            }
          }
          L1: {
            var3 = stackIn_11_0;
            if (this.field_Jb >= this.field_Qb) {
              stackOut_13_0 = this.field_Jb;
              stackIn_14_0 = stackOut_13_0;
              break L1;
            } else {
              stackOut_12_0 = this.field_Qb;
              stackIn_14_0 = stackOut_12_0;
              break L1;
            }
          }
          var4 = stackIn_14_0;
          return var2.substring(var3, var4);
        } else {
          L2: {
            var2 = this.field_Rb.toString();
            if (this.field_Qb <= this.field_Jb) {
              stackOut_3_0 = this.field_Qb;
              stackIn_4_0 = stackOut_3_0;
              break L2;
            } else {
              stackOut_2_0 = this.field_Jb;
              stackIn_4_0 = stackOut_2_0;
              break L2;
            }
          }
          L3: {
            var3 = stackIn_4_0;
            if (this.field_Jb >= this.field_Qb) {
              stackOut_6_0 = this.field_Jb;
              stackIn_7_0 = stackOut_6_0;
              break L3;
            } else {
              stackOut_5_0 = this.field_Qb;
              stackIn_7_0 = stackOut_5_0;
              break L3;
            }
          }
          var4 = stackIn_7_0;
          return var2.substring(var3, var4);
        }
    }

    final boolean a(int param0, int param1, char param2) {
        StringBuilder discarded$14 = null;
        StringBuilder discarded$15 = null;
        StringBuilder discarded$16 = null;
        StringBuilder discarded$17 = null;
        StringBuilder discarded$18 = null;
        StringBuilder discarded$19 = null;
        StringBuilder discarded$20 = null;
        StringBuilder discarded$21 = null;
        StringBuilder discarded$22 = null;
        StringBuilder discarded$23 = null;
        StringBuilder discarded$24 = null;
        StringBuilder discarded$25 = null;
        StringBuilder discarded$26 = null;
        StringBuilder discarded$27 = null;
        int var4 = 0;
        String var11 = null;
        String var12 = null;
        String var13 = null;
        String var14 = null;
        int stackIn_51_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_129_0 = 0;
        int stackIn_137_0 = 0;
        int stackOut_136_0 = 0;
        int stackOut_135_0 = 0;
        int stackOut_128_0 = 0;
        int stackOut_127_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        if (param2 != 60) {
          if (62 != param2) {
            if (param2 < 32) {
              L0: {
                if (-86 != (param0 ^ -1)) {
                  if (-102 != (param0 ^ -1)) {
                    if ((param0 ^ -1) != -14) {
                      if ((param0 ^ -1) == -97) {
                        if (-1 > (this.field_Qb ^ -1)) {
                          L1: {
                            if (!br.field_f[82]) {
                              stackOut_136_0 = -1 + this.field_Qb;
                              stackIn_137_0 = stackOut_136_0;
                              break L1;
                            } else {
                              stackOut_135_0 = this.k(-1);
                              stackIn_137_0 = stackOut_135_0;
                              break L1;
                            }
                          }
                          var4 = stackIn_137_0;
                          this.b(var4, false);
                          return true;
                        } else {
                          if (param1 == -26126) {
                            return false;
                          } else {
                            this.field_Wb = -48L;
                            return false;
                          }
                        }
                      } else {
                        if (-98 == (param0 ^ -1)) {
                          if (this.field_Qb >= this.field_Rb.length()) {
                            break L0;
                          } else {
                            L2: {
                              if (!br.field_f[82]) {
                                stackOut_128_0 = this.field_Qb + 1;
                                stackIn_129_0 = stackOut_128_0;
                                break L2;
                              } else {
                                stackOut_127_0 = this.e((byte) 109);
                                stackIn_129_0 = stackOut_127_0;
                                break L2;
                              }
                            }
                            var4 = stackIn_129_0;
                            this.b(var4, false);
                            return true;
                          }
                        } else {
                          if ((param0 ^ -1) != -103) {
                            if (-104 != (param0 ^ -1)) {
                              if (!br.field_f[82]) {
                                if (!br.field_f[82]) {
                                  if (!br.field_f[82]) {
                                    break L0;
                                  } else {
                                    if ((param0 ^ -1) != -68) {
                                      if (param1 == -26126) {
                                        return false;
                                      } else {
                                        this.field_Wb = -48L;
                                        return false;
                                      }
                                    } else {
                                      this.g((byte) -77);
                                      return true;
                                    }
                                  }
                                } else {
                                  if ((param0 ^ -1) != -67) {
                                    L3: {
                                      if (!br.field_f[82]) {
                                        break L3;
                                      } else {
                                        if ((param0 ^ -1) == -68) {
                                          this.g((byte) -77);
                                          return true;
                                        } else {
                                          break L3;
                                        }
                                      }
                                    }
                                    if (param1 != -26126) {
                                      this.field_Wb = -48L;
                                      return false;
                                    } else {
                                      return false;
                                    }
                                  } else {
                                    this.p(param1 ^ 26164);
                                    return true;
                                  }
                                }
                              } else {
                                if (-66 != (param0 ^ -1)) {
                                  L4: {
                                    if (!br.field_f[82]) {
                                      break L4;
                                    } else {
                                      if ((param0 ^ -1) != -67) {
                                        break L4;
                                      } else {
                                        this.p(param1 ^ 26164);
                                        return true;
                                      }
                                    }
                                  }
                                  if (br.field_f[82]) {
                                    if ((param0 ^ -1) == -68) {
                                      this.g((byte) -77);
                                      return true;
                                    } else {
                                      L5: {
                                        if (param1 == -26126) {
                                          break L5;
                                        } else {
                                          this.field_Wb = -48L;
                                          break L5;
                                        }
                                      }
                                      return false;
                                    }
                                  } else {
                                    L6: {
                                      if (param1 == -26126) {
                                        break L6;
                                      } else {
                                        this.field_Wb = -48L;
                                        break L6;
                                      }
                                    }
                                    return false;
                                  }
                                } else {
                                  this.h((byte) 114);
                                  return true;
                                }
                              }
                            } else {
                              this.b(this.field_Rb.length(), false);
                              return true;
                            }
                          } else {
                            this.b(0, false);
                            return true;
                          }
                        }
                      }
                    } else {
                      this.a(true);
                      return true;
                    }
                  } else {
                    if (this.field_Jb == this.field_Qb) {
                      if (this.field_Qb >= this.field_Rb.length()) {
                        if (param1 == -26126) {
                          return false;
                        } else {
                          this.field_Wb = -48L;
                          return false;
                        }
                      } else {
                        this.field_Jb = 1 + this.field_Qb;
                        this.l(32);
                        return true;
                      }
                    } else {
                      this.l(32);
                      return true;
                    }
                  }
                } else {
                  if (this.field_Qb == this.field_Jb) {
                    if ((this.field_Qb ^ -1) < -1) {
                      this.field_Jb = this.field_Qb + -1;
                      this.l(32);
                      return true;
                    } else {
                      break L0;
                    }
                  } else {
                    this.l(32);
                    return true;
                  }
                }
              }
              if (param1 == -26126) {
                return false;
              } else {
                this.field_Wb = -48L;
                return false;
              }
            } else {
              if (param2 <= 126) {
                L7: {
                  if (this.field_Qb != this.field_Jb) {
                    this.l(32);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (-1 == this.field_Ub) {
                    L9: {
                      if (this.field_Qb != this.field_Rb.length()) {
                        var14 = this.field_Rb.toString().substring(this.field_Qb, this.field_Rb.length());
                        discarded$14 = up.a(' ', this.field_Qb, this.field_Rb, true);
                        discarded$15 = this.field_Rb.append(param2);
                        discarded$16 = this.field_Rb.append(var14);
                        break L9;
                      } else {
                        discarded$17 = this.field_Rb.append(param2);
                        if (!ArmiesOfGielinor.field_M) {
                          break L9;
                        } else {
                          var13 = this.field_Rb.toString().substring(this.field_Qb, this.field_Rb.length());
                          discarded$18 = up.a(' ', this.field_Qb, this.field_Rb, true);
                          discarded$19 = this.field_Rb.append(param2);
                          discarded$20 = this.field_Rb.append(var13);
                          this.field_Pb.field_X = this.field_Rb.toString();
                          this.field_Qb = this.field_Qb + 1;
                          this.field_Jb = this.field_Qb;
                          return true;
                        }
                      }
                    }
                    this.field_Pb.field_X = this.field_Rb.toString();
                    this.field_Qb = this.field_Qb + 1;
                    this.field_Jb = this.field_Qb;
                    break L8;
                  } else {
                    if (this.field_Rb.length() >= this.field_Ub) {
                      break L8;
                    } else {
                      L10: {
                        if (this.field_Qb != this.field_Rb.length()) {
                          var12 = this.field_Rb.toString().substring(this.field_Qb, this.field_Rb.length());
                          discarded$21 = up.a(' ', this.field_Qb, this.field_Rb, true);
                          discarded$22 = this.field_Rb.append(param2);
                          discarded$23 = this.field_Rb.append(var12);
                          break L10;
                        } else {
                          discarded$24 = this.field_Rb.append(param2);
                          if (!ArmiesOfGielinor.field_M) {
                            break L10;
                          } else {
                            var11 = this.field_Rb.toString().substring(this.field_Qb, this.field_Rb.length());
                            discarded$25 = up.a(' ', this.field_Qb, this.field_Rb, true);
                            discarded$26 = this.field_Rb.append(param2);
                            discarded$27 = this.field_Rb.append(var11);
                            this.field_Pb.field_X = this.field_Rb.toString();
                            this.field_Qb = this.field_Qb + 1;
                            this.field_Jb = this.field_Qb;
                            return true;
                          }
                        }
                      }
                      this.field_Pb.field_X = this.field_Rb.toString();
                      this.field_Qb = this.field_Qb + 1;
                      this.field_Jb = this.field_Qb;
                      return true;
                    }
                  }
                }
                return true;
              } else {
                L11: {
                  if (-86 != (param0 ^ -1)) {
                    if (-102 != (param0 ^ -1)) {
                      if ((param0 ^ -1) != -14) {
                        if ((param0 ^ -1) == -97) {
                          if (-1 > (this.field_Qb ^ -1)) {
                            L12: {
                              if (!br.field_f[82]) {
                                stackOut_60_0 = -1 + this.field_Qb;
                                stackIn_61_0 = stackOut_60_0;
                                break L12;
                              } else {
                                stackOut_59_0 = this.k(-1);
                                stackIn_61_0 = stackOut_59_0;
                                break L12;
                              }
                            }
                            var4 = stackIn_61_0;
                            this.b(var4, false);
                            return true;
                          } else {
                            break L11;
                          }
                        } else {
                          if (-98 == (param0 ^ -1)) {
                            if (this.field_Qb >= this.field_Rb.length()) {
                              L13: {
                                if (param1 == -26126) {
                                  break L13;
                                } else {
                                  this.field_Wb = -48L;
                                  break L13;
                                }
                              }
                              return false;
                            } else {
                              L14: {
                                if (!br.field_f[82]) {
                                  stackOut_50_0 = this.field_Qb + 1;
                                  stackIn_51_0 = stackOut_50_0;
                                  break L14;
                                } else {
                                  stackOut_49_0 = this.e((byte) 109);
                                  stackIn_51_0 = stackOut_49_0;
                                  break L14;
                                }
                              }
                              var4 = stackIn_51_0;
                              this.b(var4, false);
                              return true;
                            }
                          } else {
                            if ((param0 ^ -1) != -103) {
                              if (-104 != (param0 ^ -1)) {
                                L15: {
                                  if (!br.field_f[82]) {
                                    break L15;
                                  } else {
                                    if (-66 != (param0 ^ -1)) {
                                      break L15;
                                    } else {
                                      this.h((byte) 114);
                                      return true;
                                    }
                                  }
                                }
                                L16: {
                                  if (!br.field_f[82]) {
                                    break L16;
                                  } else {
                                    if ((param0 ^ -1) != -67) {
                                      break L16;
                                    } else {
                                      this.p(param1 ^ 26164);
                                      return true;
                                    }
                                  }
                                }
                                if (br.field_f[82]) {
                                  if ((param0 ^ -1) == -68) {
                                    this.g((byte) -77);
                                    return true;
                                  } else {
                                    break L11;
                                  }
                                } else {
                                  L17: {
                                    if (param1 == -26126) {
                                      break L17;
                                    } else {
                                      this.field_Wb = -48L;
                                      break L17;
                                    }
                                  }
                                  return false;
                                }
                              } else {
                                this.b(this.field_Rb.length(), false);
                                return true;
                              }
                            } else {
                              this.b(0, false);
                              return true;
                            }
                          }
                        }
                      } else {
                        this.a(true);
                        return true;
                      }
                    } else {
                      if (this.field_Jb == this.field_Qb) {
                        if (this.field_Qb < this.field_Rb.length()) {
                          this.field_Jb = 1 + this.field_Qb;
                          this.l(32);
                          return true;
                        } else {
                          L18: {
                            if (param1 == -26126) {
                              break L18;
                            } else {
                              this.field_Wb = -48L;
                              break L18;
                            }
                          }
                          return false;
                        }
                      } else {
                        this.l(32);
                        return true;
                      }
                    }
                  } else {
                    if (this.field_Qb == this.field_Jb) {
                      if ((this.field_Qb ^ -1) < -1) {
                        this.field_Jb = this.field_Qb + -1;
                        this.l(32);
                        return true;
                      } else {
                        break L11;
                      }
                    } else {
                      this.l(32);
                      return true;
                    }
                  }
                }
                L19: {
                  if (param1 == -26126) {
                    break L19;
                  } else {
                    this.field_Wb = -48L;
                    break L19;
                  }
                }
                return false;
              }
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    private final void g(byte param0) {
        if (!(this.field_Tb != null)) {
            return;
        }
        int var2 = -66 / ((72 - param0) / 35);
        this.field_Sb = this.field_Tb.a(0);
    }

    private final void h(byte param0) {
        if (null == this.field_Tb) {
          return;
        } else {
          this.p(-87);
          if (param0 <= 90) {
            this.field_Xb = (je) null;
            this.l(32);
            return;
          } else {
            this.l(32);
            return;
          }
        }
    }

    private final void p(int param0) {
        try {
            wo discarded$2 = null;
            int var2 = 0;
            String var3 = null;
            java.awt.datatransfer.StringSelection var4 = null;
            if (this.field_Tb != null) {
              var2 = -53 / ((param0 - 11) / 49);
              var3 = this.d((byte) 115);
              if (var3.length() == 0) {
                return;
              } else {
                var4 = new java.awt.datatransfer.StringSelection(this.d((byte) 115));
                discarded$2 = this.field_Tb.a((java.awt.datatransfer.Transferable) ((Object) var4), -26522);
                return;
              }
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final String q(int param0) {
        if (param0 != 0) {
            this.field_Xb = (je) null;
            return this.field_Rb.toString();
        }
        return this.field_Rb.toString();
    }

    final int o(int param0) {
        int var2 = -34 / ((param0 - 21) / 39);
        return this.field_Qb;
    }

    final void a(String param0, byte param1) {
        StringBuilder discarded$6 = null;
        int dupTemp$7 = 0;
        int discarded$8 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
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
            L2: {
              discarded$6 = this.field_Rb.append(param0.substring(0, var3_int));
              dupTemp$7 = this.field_Rb.length();
              this.field_Jb = dupTemp$7;
              this.field_Qb = dupTemp$7;
              this.field_Pb.field_X = this.field_Rb.toString();
              if (param1 == 45) {
                break L2;
              } else {
                discarded$8 = this.e((byte) 43);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("dp.T(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        this.a(param3, -20500, param2, param0, param4);
        this.field_Pb.a(param3, -20500, param2, param1, 0);
        this.field_Ob.a(param3, -20500, param2, 0, 0);
        this.field_Kb = -4 + param3;
    }

    private final void b(int param0, boolean param1) {
        this.field_Qb = param0;
        if (param1) {
            return;
        }
        if (!br.field_f[81]) {
            this.field_Jb = this.field_Qb;
        }
    }

    dp(long param0, je param1, je param2, je param3) {
        this(param0, param1, param2, param3, -1);
    }

    final void c(int param0, boolean param1) {
        boolean discarded$0 = false;
        this.field_Jb = param0;
        this.field_Qb = param0;
        if (param1) {
            discarded$0 = this.a(-36, 44, '');
        }
    }

    final void m(int param0) {
        try {
            int dupTemp$1 = 0;
            int var2 = 0;
            long var3_long = 0L;
            int var3 = 0;
            Exception var4 = null;
            int var4_int = 0;
            int var5 = 0;
            int var6 = 0;
            java.awt.datatransfer.Transferable var7 = null;
            String var8 = null;
            Object stackIn_12_0 = null;
            Object stackIn_13_0 = null;
            Object stackIn_14_0 = null;
            int stackIn_14_1 = 0;
            int stackIn_31_0 = 0;
            Throwable decompiledCaughtException = null;
            Object stackOut_11_0 = null;
            Object stackOut_13_0 = null;
            int stackOut_13_1 = 0;
            Object stackOut_12_0 = null;
            int stackOut_12_1 = 0;
            int stackOut_30_0 = 0;
            int stackOut_29_0 = 0;
            L0: {
              L1: {
                var6 = ArmiesOfGielinor.field_M ? 1 : 0;
                var2 = this.c(param0 ^ 48, sm.field_d - (this.field_V - -this.field_Pb.field_F));
                if (-2 == (this.field_yb ^ -1)) {
                  break L1;
                } else {
                  L2: {
                    L3: {
                      if ((ro.field_ub ^ -1) != -2) {
                        break L3;
                      } else {
                        if (this.field_Ib) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    this.field_Ib = false;
                    if (var6 == 0) {
                      break L0;
                    } else {
                      break L2;
                    }
                  }
                  L4: {
                    if (!this.field_Nb) {
                      break L4;
                    } else {
                      if (var2 >= this.field_Mb) {
                        break L4;
                      } else {
                        if (this.field_Jb >= var2) {
                          break L4;
                        } else {
                          var2 = this.field_Mb;
                          break L4;
                        }
                      }
                    }
                  }
                  this.field_Qb = var2;
                  if (var6 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              L5: {
                this.b(var2, false);
                this.field_Ib = true;
                var3_long = vi.b(param0 + -95);
                stackOut_11_0 = this;
                stackIn_13_0 = stackOut_11_0;
                stackIn_12_0 = stackOut_11_0;
                if (250L <= var3_long - this.field_Wb) {
                  stackOut_13_0 = this;
                  stackOut_13_1 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  break L5;
                } else {
                  stackOut_12_0 = this;
                  stackOut_12_1 = 1;
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  break L5;
                }
              }
              ((dp) (this)).field_Nb = stackIn_14_1 != 0;
              if (!this.field_Nb) {
                this.field_Wb = var3_long;
                break L0;
              } else {
                this.field_Jb = this.k(-1);
                this.field_Qb = this.e((byte) 109);
                if ((this.field_Qb ^ -1) >= -1) {
                  this.field_Mb = this.field_Qb;
                  this.field_Wb = var3_long;
                  break L0;
                } else {
                  if (this.field_Rb.charAt(this.field_Qb + -1) != 32) {
                    this.field_Mb = this.field_Qb;
                    this.field_Wb = var3_long;
                    break L0;
                  } else {
                    this.field_Qb = this.field_Qb - 1;
                    this.field_Mb = this.field_Qb;
                    this.field_Wb = var3_long;
                    break L0;
                  }
                }
              }
            }
            L6: {
              if (this.field_Y) {
                break L6;
              } else {
                dupTemp$1 = this.field_Rb.length();
                this.field_Jb = dupTemp$1;
                this.field_Qb = dupTemp$1;
                break L6;
              }
            }
            L7: {
              L8: {
                this.field_Ob.field_S = this.field_Pb.field_Z.a(this.field_Rb.toString().substring(param0, this.field_Qb));
                if (this.field_Jb == this.field_Qb) {
                  break L8;
                } else {
                  L9: {
                    var3 = this.field_Pb.field_S + this.field_Pb.field_Z.a(this.field_Rb.toString().substring(0, this.field_Jb));
                    if (this.field_Ob.field_S <= var3) {
                      stackOut_30_0 = this.field_Ob.field_S;
                      stackIn_31_0 = stackOut_30_0;
                      break L9;
                    } else {
                      stackOut_29_0 = var3;
                      stackIn_31_0 = stackOut_29_0;
                      break L9;
                    }
                  }
                  var4_int = stackIn_31_0;
                  var5 = Math.abs(var3 - this.field_Ob.field_S);
                  this.field_Xb.a(this.field_Kb, param0 + -20500, var5, 2, var4_int + this.field_Pb.field_F);
                  if (var6 == 0) {
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
              this.field_Xb.a(this.field_Kb, -20500, 0, 2, this.field_Ob.field_S);
              break L7;
            }
            L10: {
              if (this.field_Sb == null) {
                break L10;
              } else {
                if (this.field_Sb.field_g != 0) {
                  var7 = (java.awt.datatransfer.Transferable) (this.field_Sb.field_f);
                  try {
                    L11: {
                      var8 = (String) (var7.getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                      this.l(32);
                      this.a((byte) 90, var8);
                      break L11;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L12: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L12;
                    }
                  }
                  this.field_Sb = null;
                  break L10;
                } else {
                  return;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int k(int param0) {
        int var2 = 0;
        int var3 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_7_0 = false;
        boolean stackOut_5_0 = false;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if ((this.field_Qb ^ -1) != param0) {
          var2 = this.field_Qb + -1;
          L0: while (true) {
            if (0 < var2) {
              stackOut_5_0 = wr.a(this.field_Rb.charAt(-1 + var2), (byte) 95);
              stackIn_7_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (var3 == 0) {
                if (!stackIn_7_0) {
                  var2--;
                  continue L0;
                } else {
                  return var2;
                }
              } else {
                return stackIn_6_0 ? 1 : 0;
              }
            } else {
              return var2;
            }
          }
        } else {
          return this.field_Qb;
        }
    }

    private final int e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        boolean stackIn_8_0 = false;
        boolean stackIn_9_0 = false;
        boolean stackIn_20_0 = false;
        boolean stackIn_21_0 = false;
        boolean stackOut_19_0 = false;
        boolean stackOut_7_0 = false;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 == 109) {
          var2 = this.field_Rb.length();
          if (this.field_Qb != var2) {
            var3 = 1 + this.field_Qb;
            L0: while (true) {
              if (var2 > var3) {
                stackOut_19_0 = wr.a(this.field_Rb.charAt(var3 + -1), (byte) 95);
                stackIn_21_0 = stackOut_19_0;
                stackIn_20_0 = stackOut_19_0;
                if (var4 == 0) {
                  if (!stackIn_21_0) {
                    var3++;
                    continue L0;
                  } else {
                    return var3;
                  }
                } else {
                  return stackIn_20_0 ? 1 : 0;
                }
              } else {
                return var3;
              }
            }
          } else {
            return this.field_Qb;
          }
        } else {
          this.field_Ib = false;
          var2 = this.field_Rb.length();
          if (this.field_Qb != var2) {
            var3 = 1 + this.field_Qb;
            L1: while (true) {
              if (var2 > var3) {
                stackOut_7_0 = wr.a(this.field_Rb.charAt(var3 + -1), (byte) 95);
                stackIn_9_0 = stackOut_7_0;
                stackIn_8_0 = stackOut_7_0;
                if (var4 == 0) {
                  if (!stackIn_9_0) {
                    var3++;
                    continue L1;
                  } else {
                    return var3;
                  }
                } else {
                  return stackIn_8_0 ? 1 : 0;
                }
              } else {
                return var3;
              }
            }
          } else {
            return this.field_Qb;
          }
        }
    }

    static {
        field_Vb = new int[][]{new int[]{48, 48}, new int[]{144, 0}, new int[]{0, 0}, new int[]{0, 176}, new int[]{32, 0}, new int[]{64, 64}};
    }
}
