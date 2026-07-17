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
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 == 48) {
          var3 = 0;
          var4 = 0;
          var5 = ((dp) this).field_Rb.length();
          L0: while (true) {
            if (param1 > var4) {
              if (var5 > var3) {
                int incrementValue$2 = var3;
                var3++;
                var4 = var4 + ((dp) this).field_Pb.field_Z.a(((dp) this).field_Rb.charAt(incrementValue$2));
                continue L0;
              } else {
                return var3;
              }
            } else {
              return var3;
            }
          }
        } else {
          ((dp) this).field_Qb = -37;
          var3 = 0;
          var4 = 0;
          var5 = ((dp) this).field_Rb.length();
          L1: while (true) {
            if (param1 > var4) {
              if (var5 > var3) {
                int incrementValue$3 = var3;
                var3++;
                var4 = var4 + ((dp) this).field_Pb.field_Z.a(((dp) this).field_Rb.charAt(incrementValue$3));
                continue L1;
              } else {
                return var3;
              }
            } else {
              return var3;
            }
          }
        }
    }

    final void a(boolean param0) {
        StringBuilder discarded$0 = up.a(' ', 0, ((dp) this).field_Rb, param0);
        ((dp) this).field_Qb = 0;
        ((dp) this).field_Jb = 0;
        ((dp) this).field_Pb.field_X = ((dp) this).field_Rb.toString();
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
              ((dp) this).field_Tb = param0;
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
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("dp.L(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    final static void n(int param0) {
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
                int incrementValue$40 = var2;
                var2++;
                var5[incrementValue$40] = 0;
                int incrementValue$41 = var2;
                var2++;
                var5[incrementValue$41] = 0;
                int incrementValue$42 = var2;
                var2++;
                var5[incrementValue$42] = 0;
                int incrementValue$43 = var2;
                var2++;
                var5[incrementValue$43] = 0;
                int incrementValue$44 = var2;
                var2++;
                var5[incrementValue$44] = 0;
                int incrementValue$45 = var2;
                var2++;
                var5[incrementValue$45] = 0;
                int incrementValue$46 = var2;
                var2++;
                var5[incrementValue$46] = 0;
                int incrementValue$47 = var2;
                var2++;
                var5[incrementValue$47] = 0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1_ref, "dp.O(" + param0 + 41);
        }
    }

    public static void f(byte param0) {
        if (param0 != -123) {
            dp.f((byte) -111);
            field_Vb = null;
            return;
        }
        field_Vb = null;
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
        ((dp) this).field_Mb = -1;
        ((dp) this).field_Nb = false;
        ((dp) this).field_Ib = false;
        ((dp) this).field_Wb = 0L;
        try {
          L0: {
            L1: {
              ((dp) this).field_Ub = param4;
              ((dp) this).field_Xb = new je(0L, param2);
              ((dp) this).field_Pb = new je(0L, param3);
              ((dp) this).field_Ob = new je(0L, param3);
              ((dp) this).field_M = true;
              stackOut_1_0 = this;
              stackOut_1_1 = null;
              stackOut_1_2 = null;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_3_2 = stackOut_1_2;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              stackIn_2_2 = stackOut_1_2;
              if (((dp) this).field_Ub == -1) {
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
                stackOut_2_3 = ((dp) this).field_Ub;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_4_2 = stackOut_2_2;
                stackIn_4_3 = stackOut_2_3;
                break L1;
              }
            }
            ((dp) this).field_Rb = new StringBuilder(stackIn_4_3);
            ((dp) this).field_Pb.field_X = ((dp) this).field_Rb.toString();
            ((dp) this).field_Ob.field_X = "";
            ((dp) this).field_Ob.field_I = "|";
            ((dp) this).field_fb = new at();
            ((dp) this).a(((dp) this).field_Xb, 48);
            ((dp) this).a(((dp) this).field_Pb, 48);
            ((dp) this).a(((dp) this).field_Ob, 89);
            ((dp) this).field_Y = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var7;
            stackOut_6_1 = new StringBuilder().append("dp.<init>(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
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
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
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
          throw ig.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param4 + 41);
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = ArmiesOfGielinor.field_M ? 1 : 0;
          var4 = ((dp) this).field_Rb.length();
          if (0 > param1) {
            param1 = 0;
            break L0;
          } else {
            if (param1 <= var4) {
              break L0;
            } else {
              param1 = var4;
              if (0 > param2) {
                param2 = 0;
                if (param0 == -98) {
                  ((dp) this).field_Qb = param2;
                  ((dp) this).field_Jb = param1;
                  return;
                } else {
                  int discarded$6 = this.k(-15);
                  ((dp) this).field_Qb = param2;
                  ((dp) this).field_Jb = param1;
                  return;
                }
              } else {
                if (param2 > var4) {
                  param2 = var4;
                  if (param0 == -98) {
                    ((dp) this).field_Qb = param2;
                    ((dp) this).field_Jb = param1;
                    return;
                  } else {
                    int discarded$7 = this.k(-15);
                    ((dp) this).field_Qb = param2;
                    ((dp) this).field_Jb = param1;
                    return;
                  }
                } else {
                  if (param0 == -98) {
                    ((dp) this).field_Qb = param2;
                    ((dp) this).field_Jb = param1;
                    return;
                  } else {
                    int discarded$8 = this.k(-15);
                    ((dp) this).field_Qb = param2;
                    ((dp) this).field_Jb = param1;
                    return;
                  }
                }
              }
            }
          }
        }
        if (0 > param2) {
          param2 = 0;
          if (param0 != -98) {
            int discarded$9 = this.k(-15);
            ((dp) this).field_Qb = param2;
            ((dp) this).field_Jb = param1;
            return;
          } else {
            ((dp) this).field_Qb = param2;
            ((dp) this).field_Jb = param1;
            return;
          }
        } else {
          if (param2 > var4) {
            param2 = var4;
            if (param0 != -98) {
              int discarded$10 = this.k(-15);
              ((dp) this).field_Qb = param2;
              ((dp) this).field_Jb = param1;
              return;
            } else {
              ((dp) this).field_Qb = param2;
              ((dp) this).field_Jb = param1;
              return;
            }
          } else {
            if (param0 == -98) {
              ((dp) this).field_Qb = param2;
              ((dp) this).field_Jb = param1;
              return;
            } else {
              int discarded$11 = this.k(-15);
              ((dp) this).field_Qb = param2;
              ((dp) this).field_Jb = param1;
              return;
            }
          }
        }
    }

    private final void l(int param0) {
        int var2 = 0;
        int var3 = 0;
        String var4 = null;
        if (((dp) this).field_Qb != ((dp) this).field_Jb) {
            var2 = ((dp) this).field_Qb > ((dp) this).field_Jb ? ((dp) this).field_Jb : ((dp) this).field_Qb;
            var3 = ((dp) this).field_Jb < ((dp) this).field_Qb ? ((dp) this).field_Qb : ((dp) this).field_Jb;
            ((dp) this).field_Jb = var2;
            ((dp) this).field_Qb = var2;
            var4 = ((dp) this).field_Rb.toString().substring(var3, ((dp) this).field_Rb.length());
            StringBuilder discarded$0 = up.a(' ', var2, ((dp) this).field_Rb, true);
            StringBuilder discarded$1 = ((dp) this).field_Rb.append(var4);
            ((dp) this).field_Pb.field_X = ((dp) this).field_Rb.toString();
        }
    }

    private final void a(byte param0, String param1) {
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
              if (((dp) this).field_Ub != -1) {
                var3_int = ((dp) this).field_Ub - ((dp) this).field_Rb.length();
                if (0 == var3_int) {
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
              if (((dp) this).field_Qb == ((dp) this).field_Rb.length()) {
                StringBuilder discarded$8 = ((dp) this).field_Rb.append(param1);
                break L2;
              } else {
                var4 = ((dp) this).field_Rb.toString().substring(((dp) this).field_Qb, ((dp) this).field_Rb.length());
                StringBuilder discarded$9 = up.a(' ', ((dp) this).field_Qb, ((dp) this).field_Rb, true);
                StringBuilder discarded$10 = ((dp) this).field_Rb.append(param1);
                StringBuilder discarded$11 = ((dp) this).field_Rb.append(var4);
                break L2;
              }
            }
            var3_int = 109 / ((param0 - 44) / 40);
            ((dp) this).field_Pb.field_X = ((dp) this).field_Rb.toString();
            ((dp) this).field_Qb = ((dp) this).field_Rb.length();
            ((dp) this).field_Jb = ((dp) this).field_Qb;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("dp.P(").append(param0).append(44);
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
          throw ig.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
    }

    private final String d(byte param0) {
        String var2 = ((dp) this).field_Rb.toString();
        int var3 = ((dp) this).field_Qb > ((dp) this).field_Jb ? ((dp) this).field_Jb : ((dp) this).field_Qb;
        int var4 = ((dp) this).field_Jb < ((dp) this).field_Qb ? ((dp) this).field_Qb : ((dp) this).field_Jb;
        return var2.substring(var3, var4);
    }

    final boolean a(int param0, int param1, char param2) {
        int var4 = 0;
        String var11 = null;
        String var12 = null;
        int stackIn_41_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_120_0 = 0;
        int stackOut_119_0 = 0;
        int stackOut_118_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        if (param2 == 60) {
          return false;
        } else {
          if (62 != param2) {
            if (param2 < 32) {
              if (param0 != 85) {
                if (param0 != 101) {
                  if (param0 != 13) {
                    if (param0 == 96) {
                      if (((dp) this).field_Qb > 0) {
                        L0: {
                          if (!br.field_f[82]) {
                            stackOut_119_0 = -1 + ((dp) this).field_Qb;
                            stackIn_120_0 = stackOut_119_0;
                            break L0;
                          } else {
                            stackOut_118_0 = this.k(-1);
                            stackIn_120_0 = stackOut_118_0;
                            break L0;
                          }
                        }
                        var4 = stackIn_120_0;
                        this.b(var4, false);
                        return true;
                      } else {
                        if (param1 == -26126) {
                          return false;
                        } else {
                          ((dp) this).field_Wb = -48L;
                          return false;
                        }
                      }
                    } else {
                      L1: {
                        if (param0 == 97) {
                          if (~((dp) this).field_Qb <= ~((dp) this).field_Rb.length()) {
                            break L1;
                          } else {
                            L2: {
                              if (!br.field_f[82]) {
                                stackOut_111_0 = ((dp) this).field_Qb + 1;
                                stackIn_112_0 = stackOut_111_0;
                                break L2;
                              } else {
                                stackOut_110_0 = this.e((byte) 109);
                                stackIn_112_0 = stackOut_110_0;
                                break L2;
                              }
                            }
                            var4 = stackIn_112_0;
                            this.b(var4, false);
                            return true;
                          }
                        } else {
                          if (param0 == 102) {
                            this.b(0, false);
                            return true;
                          } else {
                            if (param0 == 103) {
                              this.b(((dp) this).field_Rb.length(), false);
                              return true;
                            } else {
                              if (!br.field_f[82]) {
                                if (!br.field_f[82]) {
                                  if (!br.field_f[82]) {
                                    break L1;
                                  } else {
                                    if (param0 == 67) {
                                      this.g((byte) -77);
                                      return true;
                                    } else {
                                      if (param1 == -26126) {
                                        return false;
                                      } else {
                                        ((dp) this).field_Wb = -48L;
                                        return false;
                                      }
                                    }
                                  }
                                } else {
                                  if (param0 == 66) {
                                    this.p(param1 ^ 26164);
                                    return true;
                                  } else {
                                    if (br.field_f[82]) {
                                      if (param0 == 67) {
                                        this.g((byte) -77);
                                        return true;
                                      } else {
                                        if (param1 == -26126) {
                                          return false;
                                        } else {
                                          ((dp) this).field_Wb = -48L;
                                          return false;
                                        }
                                      }
                                    } else {
                                      if (param1 == -26126) {
                                        return false;
                                      } else {
                                        ((dp) this).field_Wb = -48L;
                                        return false;
                                      }
                                    }
                                  }
                                }
                              } else {
                                if (param0 == 65) {
                                  this.h((byte) 114);
                                  return true;
                                } else {
                                  L3: {
                                    if (!br.field_f[82]) {
                                      break L3;
                                    } else {
                                      if (param0 == 66) {
                                        this.p(param1 ^ 26164);
                                        return true;
                                      } else {
                                        break L3;
                                      }
                                    }
                                  }
                                  L4: {
                                    if (!br.field_f[82]) {
                                      break L4;
                                    } else {
                                      if (param0 == 67) {
                                        this.g((byte) -77);
                                        return true;
                                      } else {
                                        break L4;
                                      }
                                    }
                                  }
                                  L5: {
                                    if (param1 == -26126) {
                                      break L5;
                                    } else {
                                      ((dp) this).field_Wb = -48L;
                                      break L5;
                                    }
                                  }
                                  return false;
                                }
                              }
                            }
                          }
                        }
                      }
                      if (param1 == -26126) {
                        return false;
                      } else {
                        ((dp) this).field_Wb = -48L;
                        return false;
                      }
                    }
                  } else {
                    ((dp) this).a(true);
                    return true;
                  }
                } else {
                  if (~((dp) this).field_Jb == ~((dp) this).field_Qb) {
                    if (~((dp) this).field_Qb > ~((dp) this).field_Rb.length()) {
                      ((dp) this).field_Jb = 1 + ((dp) this).field_Qb;
                      this.l(32);
                      return true;
                    } else {
                      if (param1 == -26126) {
                        return false;
                      } else {
                        ((dp) this).field_Wb = -48L;
                        return false;
                      }
                    }
                  } else {
                    this.l(32);
                    return true;
                  }
                }
              } else {
                if (((dp) this).field_Qb != ((dp) this).field_Jb) {
                  this.l(32);
                  return true;
                } else {
                  if (((dp) this).field_Qb > 0) {
                    ((dp) this).field_Jb = ((dp) this).field_Qb + -1;
                    this.l(32);
                    return true;
                  } else {
                    if (param1 == -26126) {
                      return false;
                    } else {
                      ((dp) this).field_Wb = -48L;
                      return false;
                    }
                  }
                }
              }
            } else {
              if (param2 <= 126) {
                L6: {
                  if (~((dp) this).field_Qb != ~((dp) this).field_Jb) {
                    this.l(32);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (-1 == ((dp) this).field_Ub) {
                    L8: {
                      if (~((dp) this).field_Qb != ~((dp) this).field_Rb.length()) {
                        var12 = ((dp) this).field_Rb.toString().substring(((dp) this).field_Qb, ((dp) this).field_Rb.length());
                        StringBuilder discarded$8 = up.a(' ', ((dp) this).field_Qb, ((dp) this).field_Rb, true);
                        StringBuilder discarded$9 = ((dp) this).field_Rb.append(param2);
                        StringBuilder discarded$10 = ((dp) this).field_Rb.append(var12);
                        break L8;
                      } else {
                        StringBuilder discarded$11 = ((dp) this).field_Rb.append(param2);
                        break L8;
                      }
                    }
                    ((dp) this).field_Pb.field_X = ((dp) this).field_Rb.toString();
                    ((dp) this).field_Qb = ((dp) this).field_Qb + 1;
                    ((dp) this).field_Jb = ((dp) this).field_Qb;
                    break L7;
                  } else {
                    if (((dp) this).field_Rb.length() >= ((dp) this).field_Ub) {
                      break L7;
                    } else {
                      L9: {
                        if (~((dp) this).field_Qb != ~((dp) this).field_Rb.length()) {
                          var11 = ((dp) this).field_Rb.toString().substring(((dp) this).field_Qb, ((dp) this).field_Rb.length());
                          StringBuilder discarded$12 = up.a(' ', ((dp) this).field_Qb, ((dp) this).field_Rb, true);
                          StringBuilder discarded$13 = ((dp) this).field_Rb.append(param2);
                          StringBuilder discarded$14 = ((dp) this).field_Rb.append(var11);
                          break L9;
                        } else {
                          StringBuilder discarded$15 = ((dp) this).field_Rb.append(param2);
                          break L9;
                        }
                      }
                      ((dp) this).field_Pb.field_X = ((dp) this).field_Rb.toString();
                      ((dp) this).field_Qb = ((dp) this).field_Qb + 1;
                      ((dp) this).field_Jb = ((dp) this).field_Qb;
                      return true;
                    }
                  }
                }
                return true;
              } else {
                L10: {
                  if (param0 != 85) {
                    if (param0 != 101) {
                      if (param0 != 13) {
                        if (param0 == 96) {
                          if (((dp) this).field_Qb > 0) {
                            L11: {
                              if (!br.field_f[82]) {
                                stackOut_46_0 = -1 + ((dp) this).field_Qb;
                                stackIn_47_0 = stackOut_46_0;
                                break L11;
                              } else {
                                stackOut_45_0 = this.k(-1);
                                stackIn_47_0 = stackOut_45_0;
                                break L11;
                              }
                            }
                            var4 = stackIn_47_0;
                            this.b(var4, false);
                            return true;
                          } else {
                            break L10;
                          }
                        } else {
                          if (param0 == 97) {
                            if (~((dp) this).field_Qb <= ~((dp) this).field_Rb.length()) {
                              break L10;
                            } else {
                              L12: {
                                if (!br.field_f[82]) {
                                  stackOut_40_0 = ((dp) this).field_Qb + 1;
                                  stackIn_41_0 = stackOut_40_0;
                                  break L12;
                                } else {
                                  stackOut_39_0 = this.e((byte) 109);
                                  stackIn_41_0 = stackOut_39_0;
                                  break L12;
                                }
                              }
                              var4 = stackIn_41_0;
                              this.b(var4, false);
                              return true;
                            }
                          } else {
                            if (param0 == 102) {
                              this.b(0, false);
                              return true;
                            } else {
                              if (param0 == 103) {
                                this.b(((dp) this).field_Rb.length(), false);
                                return true;
                              } else {
                                L13: {
                                  if (!br.field_f[82]) {
                                    break L13;
                                  } else {
                                    if (param0 == 65) {
                                      this.h((byte) 114);
                                      return true;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                                L14: {
                                  if (!br.field_f[82]) {
                                    break L14;
                                  } else {
                                    if (param0 == 66) {
                                      this.p(param1 ^ 26164);
                                      return true;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                                if (!br.field_f[82]) {
                                  break L10;
                                } else {
                                  if (param0 == 67) {
                                    this.g((byte) -77);
                                    return true;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        ((dp) this).a(true);
                        return true;
                      }
                    } else {
                      if (~((dp) this).field_Jb == ~((dp) this).field_Qb) {
                        if (~((dp) this).field_Qb <= ~((dp) this).field_Rb.length()) {
                          break L10;
                        } else {
                          ((dp) this).field_Jb = 1 + ((dp) this).field_Qb;
                          this.l(32);
                          return true;
                        }
                      } else {
                        this.l(32);
                        return true;
                      }
                    }
                  } else {
                    if (((dp) this).field_Qb != ((dp) this).field_Jb) {
                      this.l(32);
                      return true;
                    } else {
                      if (((dp) this).field_Qb > 0) {
                        ((dp) this).field_Jb = ((dp) this).field_Qb + -1;
                        this.l(32);
                        return true;
                      } else {
                        break L10;
                      }
                    }
                  }
                }
                L15: {
                  if (param1 == -26126) {
                    break L15;
                  } else {
                    ((dp) this).field_Wb = -48L;
                    break L15;
                  }
                }
                return false;
              }
            }
          } else {
            return false;
          }
        }
    }

    private final void g(byte param0) {
        if (!(((dp) this).field_Tb != null)) {
            return;
        }
        int var2 = -16;
        ((dp) this).field_Sb = ((dp) this).field_Tb.a(0);
    }

    private final void h(byte param0) {
        if (!(null != ((dp) this).field_Tb)) {
            return;
        }
        this.p(-87);
        this.l(32);
    }

    private final void p(int param0) {
        try {
            int var2 = 0;
            String var3 = null;
            java.awt.datatransfer.StringSelection var4 = null;
            if (((dp) this).field_Tb != null) {
              var2 = -53 / ((param0 - 11) / 49);
              var3 = this.d((byte) 115);
              if (var3.length() == 0) {
                return;
              } else {
                var4 = new java.awt.datatransfer.StringSelection(this.d((byte) 115));
                wo discarded$2 = ((dp) this).field_Tb.a((java.awt.datatransfer.Transferable) (Object) var4, -26522);
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
            ((dp) this).field_Xb = null;
            return ((dp) this).field_Rb.toString();
        }
        return ((dp) this).field_Rb.toString();
    }

    final int o(int param0) {
        int var2 = -34 / ((param0 - 21) / 39);
        return ((dp) this).field_Qb;
    }

    final void a(String param0, byte param1) {
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
              ((dp) this).field_Rb.setLength(0);
              var3_int = param0.length();
              if (((dp) this).field_Ub == -1) {
                break L1;
              } else {
                if (((dp) this).field_Ub < var3_int) {
                  var3_int = ((dp) this).field_Ub;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              StringBuilder discarded$6 = ((dp) this).field_Rb.append(param0.substring(0, var3_int));
              int dupTemp$7 = ((dp) this).field_Rb.length();
              ((dp) this).field_Jb = dupTemp$7;
              ((dp) this).field_Qb = dupTemp$7;
              ((dp) this).field_Pb.field_X = ((dp) this).field_Rb.toString();
              if (param1 == 45) {
                break L2;
              } else {
                int discarded$8 = this.e((byte) 43);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("dp.T(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        ((dp) this).a(param3, -20500, param2, param0, param4);
        ((dp) this).field_Pb.a(param3, -20500, param2, param1, 0);
        ((dp) this).field_Ob.a(param3, -20500, param2, 0, 0);
        ((dp) this).field_Kb = -4 + param3;
    }

    private final void b(int param0, boolean param1) {
        ((dp) this).field_Qb = param0;
        if (!br.field_f[81]) {
            ((dp) this).field_Jb = ((dp) this).field_Qb;
        }
    }

    dp(long param0, je param1, je param2, je param3) {
        this(param0, param1, param2, param3, -1);
    }

    final void c(int param0, boolean param1) {
        ((dp) this).field_Jb = param0;
        ((dp) this).field_Qb = param0;
        if (param1) {
            boolean discarded$0 = ((dp) this).a(-36, 44, '');
        }
    }

    final void m(int param0) {
        try {
            int var2 = 0;
            long var3_long = 0L;
            int var3 = 0;
            Exception var4 = null;
            int var4_int = 0;
            int var5 = 0;
            int var6 = 0;
            java.awt.datatransfer.Transferable var7 = null;
            String var8 = null;
            Object stackIn_15_0 = null;
            Object stackIn_16_0 = null;
            Object stackIn_17_0 = null;
            int stackIn_17_1 = 0;
            int stackIn_34_0 = 0;
            Throwable decompiledCaughtException = null;
            Object stackOut_14_0 = null;
            Object stackOut_16_0 = null;
            int stackOut_16_1 = 0;
            Object stackOut_15_0 = null;
            int stackOut_15_1 = 0;
            int stackOut_33_0 = 0;
            int stackOut_32_0 = 0;
            L0: {
              var6 = ArmiesOfGielinor.field_M ? 1 : 0;
              var2 = this.c(param0 ^ 48, sm.field_d - (((dp) this).field_V - -((dp) this).field_Pb.field_F));
              if (((dp) this).field_yb == 1) {
                L1: {
                  this.b(var2, false);
                  ((dp) this).field_Ib = true;
                  var3_long = vi.b(param0 + -95);
                  stackOut_14_0 = this;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_15_0 = stackOut_14_0;
                  if (250L <= var3_long - ((dp) this).field_Wb) {
                    stackOut_16_0 = this;
                    stackOut_16_1 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    break L1;
                  } else {
                    stackOut_15_0 = this;
                    stackOut_15_1 = 1;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    break L1;
                  }
                }
                ((dp) this).field_Nb = stackIn_17_1 != 0;
                if (!((dp) this).field_Nb) {
                  ((dp) this).field_Wb = var3_long;
                  break L0;
                } else {
                  ((dp) this).field_Jb = this.k(-1);
                  ((dp) this).field_Qb = this.e((byte) 109);
                  if (((dp) this).field_Qb <= 0) {
                    ((dp) this).field_Mb = ((dp) this).field_Qb;
                    ((dp) this).field_Wb = var3_long;
                    break L0;
                  } else {
                    if (((dp) this).field_Rb.charAt(((dp) this).field_Qb + -1) != 32) {
                      ((dp) this).field_Mb = ((dp) this).field_Qb;
                      ((dp) this).field_Wb = var3_long;
                      break L0;
                    } else {
                      ((dp) this).field_Qb = ((dp) this).field_Qb - 1;
                      ((dp) this).field_Mb = ((dp) this).field_Qb;
                      ((dp) this).field_Wb = var3_long;
                      break L0;
                    }
                  }
                }
              } else {
                if (ro.field_ub != 1) {
                  ((dp) this).field_Ib = false;
                  break L0;
                } else {
                  if (((dp) this).field_Ib) {
                    if (!((dp) this).field_Nb) {
                      ((dp) this).field_Qb = var2;
                      break L0;
                    } else {
                      if (var2 >= ((dp) this).field_Mb) {
                        ((dp) this).field_Qb = var2;
                        break L0;
                      } else {
                        if (((dp) this).field_Jb >= var2) {
                          ((dp) this).field_Qb = var2;
                          break L0;
                        } else {
                          var2 = ((dp) this).field_Mb;
                          ((dp) this).field_Qb = var2;
                          break L0;
                        }
                      }
                    }
                  } else {
                    ((dp) this).field_Ib = false;
                    break L0;
                  }
                }
              }
            }
            L2: {
              if (((dp) this).field_Y) {
                break L2;
              } else {
                int dupTemp$1 = ((dp) this).field_Rb.length();
                ((dp) this).field_Jb = dupTemp$1;
                ((dp) this).field_Qb = dupTemp$1;
                break L2;
              }
            }
            L3: {
              ((dp) this).field_Ob.field_S = ((dp) this).field_Pb.field_Z.a(((dp) this).field_Rb.toString().substring(param0, ((dp) this).field_Qb));
              if (((dp) this).field_Jb == ((dp) this).field_Qb) {
                ((dp) this).field_Xb.a(((dp) this).field_Kb, -20500, 0, 2, ((dp) this).field_Ob.field_S);
                break L3;
              } else {
                L4: {
                  var3 = ((dp) this).field_Pb.field_S + ((dp) this).field_Pb.field_Z.a(((dp) this).field_Rb.toString().substring(0, ((dp) this).field_Jb));
                  if (((dp) this).field_Ob.field_S <= var3) {
                    stackOut_33_0 = ((dp) this).field_Ob.field_S;
                    stackIn_34_0 = stackOut_33_0;
                    break L4;
                  } else {
                    stackOut_32_0 = var3;
                    stackIn_34_0 = stackOut_32_0;
                    break L4;
                  }
                }
                var4_int = stackIn_34_0;
                var5 = Math.abs(var3 - ((dp) this).field_Ob.field_S);
                ((dp) this).field_Xb.a(((dp) this).field_Kb, param0 + -20500, var5, 2, var4_int + ((dp) this).field_Pb.field_F);
                break L3;
              }
            }
            L5: {
              if (((dp) this).field_Sb == null) {
                break L5;
              } else {
                if (((dp) this).field_Sb.field_g != 0) {
                  var7 = (java.awt.datatransfer.Transferable) ((dp) this).field_Sb.field_f;
                  try {
                    L6: {
                      var8 = (String) var7.getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                      this.l(32);
                      this.a((byte) 90, var8);
                      break L6;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L7: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L7;
                    }
                  }
                  ((dp) this).field_Sb = null;
                  break L5;
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
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (~((dp) this).field_Qb != param0) {
          var2 = ((dp) this).field_Qb + -1;
          L0: while (true) {
            if (0 < var2) {
              if (!wr.a(((dp) this).field_Rb.charAt(-1 + var2), (byte) 95)) {
                var2--;
                continue L0;
              } else {
                return var2;
              }
            } else {
              return var2;
            }
          }
        } else {
          return ((dp) this).field_Qb;
        }
    }

    private final int e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 == 109) {
          var2 = ((dp) this).field_Rb.length();
          if (((dp) this).field_Qb != var2) {
            var3 = 1 + ((dp) this).field_Qb;
            L0: while (true) {
              if (var2 > var3) {
                if (!wr.a(((dp) this).field_Rb.charAt(var3 + -1), (byte) 95)) {
                  var3++;
                  continue L0;
                } else {
                  return var3;
                }
              } else {
                return var3;
              }
            }
          } else {
            return ((dp) this).field_Qb;
          }
        } else {
          ((dp) this).field_Ib = false;
          var2 = ((dp) this).field_Rb.length();
          if (((dp) this).field_Qb != var2) {
            var3 = 1 + ((dp) this).field_Qb;
            L1: while (true) {
              if (var2 > var3) {
                if (!wr.a(((dp) this).field_Rb.charAt(var3 + -1), (byte) 95)) {
                  var3++;
                  continue L1;
                } else {
                  return var3;
                }
              } else {
                return var3;
              }
            }
          } else {
            return ((dp) this).field_Qb;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Vb = new int[][]{new int[2], new int[2], new int[2], new int[2], new int[2], new int[2]};
    }
}
