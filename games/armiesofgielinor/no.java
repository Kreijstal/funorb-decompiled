/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class no extends en {
    static au field_K;
    static int[] field_U;
    static je field_M;
    static wk field_P;
    static int field_J;
    private fn field_Q;
    static int field_S;
    private fn field_O;
    static je field_T;
    private boolean field_R;
    private fn field_L;
    static String field_N;

    final int l(int param0) {
        int var2 = 0;
        NumberFormatException var3 = null;
        int stackIn_2_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_1_0 = 0;
        var2 = 47 % ((param0 - -30) / 36);
        try {
          L0: {
            stackOut_1_0 = Integer.parseInt(this.field_L.field_v);
            stackIn_2_0 = stackOut_1_0;
            break L0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
        return stackIn_2_0;
    }

    final boolean k(int param0) {
        if (null != this.field_L.field_v) {
          if (0 != this.field_L.field_v.length()) {
            L0: {
              if (null == this.field_Q.field_v) {
                break L0;
              } else {
                if (this.field_Q.field_v.length() == 0) {
                  break L0;
                } else {
                  if (param0 == -22339) {
                    L1: {
                      if (null == this.field_O.field_v) {
                        break L1;
                      } else {
                        if (this.field_O.field_v.length() == 0) {
                          break L1;
                        } else {
                          return false;
                        }
                      }
                    }
                    return true;
                  } else {
                    return false;
                  }
                }
              }
            }
            return true;
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    private final void a(String param0, kb param1, int param2, int param3, int param4) {
        try {
            gl.field_e.c(param0, param4 - (-param1.field_B - (param1.field_l >> 1645072737)), param1.field_p + (param2 - 5), param3, -1);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "no.N(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    no(kh param0, boolean param1, int param2, int param3, int param4, int param5) {
        this(param0, param1);
        try {
            this.a(param2, param4, param3, 8192, param5);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "no.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(bv param0, uo param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
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
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var4_int = param2 + param0.a(false);
            L1: while (true) {
              L2: {
                L3: {
                  if (param0.a(false) >= var4_int) {
                    break L3;
                  } else {
                    var5 = mt.a(param0, true);
                    var6 = param0.a(false);
                    var7 = ej.a(param0, true);
                    var8 = param0.a(false) + -var6;
                    kq.a(var6, param3 + 489, var8, var7, param0);
                    param1.a(var7, param0, var5, (byte) 37);
                    ao.a(var6, 4, var8, param0, var7);
                    if (var9 != 0) {
                      break L2;
                    } else {
                      if (var9 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param3 == -24721) {
                  break L2;
                } else {
                  field_M = (je) null;
                  return;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var4);
            stackOut_9_1 = new StringBuilder().append("no.K(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          L5: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(byte param0, sb param1) {
        boolean discarded$0 = false;
        try {
            super.a((byte) -108, param1);
            this.field_L.field_x = (qo) ((Object) param1);
            this.field_Q.field_x = (qo) ((Object) param1);
            if (param0 > -21) {
                discarded$0 = this.k(-25);
            }
            this.field_O.field_x = (qo) ((Object) param1);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "no.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int m(int param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        if (param0 == -26458) {
          try {
            L0: {
              stackOut_2_0 = Integer.parseInt(this.field_Q.field_v) + -1;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            }
          } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (NumberFormatException) (Object) decompiledCaughtException;
            return -1;
          }
          return stackIn_3_0;
        } else {
          return -46;
        }
    }

    public static void c(boolean param0) {
        field_N = null;
        field_U = null;
        field_P = null;
        field_T = null;
        field_M = null;
        field_K = null;
        if (param0) {
            field_U = (int[]) null;
        }
    }

    final String h(int param0) {
        String var2 = null;
        String stackIn_7_0 = null;
        String stackOut_6_0 = null;
        String stackOut_5_0 = null;
        var2 = this.field_Q.h(param0 ^ 0);
        if (var2 == null) {
          if (this.field_t) {
            L0: {
              if (this.field_s != null) {
                stackOut_6_0 = this.field_s;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_5_0 = this.field_v;
                stackIn_7_0 = stackOut_5_0;
                break L0;
              }
            }
            return stackIn_7_0;
          } else {
            if (param0 == 21384) {
              return null;
            } else {
              field_K = (au) null;
              return null;
            }
          }
        } else {
          return var2;
        }
    }

    final static void b(boolean param0) {
        tf.a((byte) -99, ag.d((byte) -111));
        if (param0) {
            field_N = (String) null;
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        super.a(param0, param1, (byte) -84, param3);
        if (0 == param3) {
          if (param2 >= -82) {
            return;
          } else {
            param0 = param0 + this.field_B;
            param1 = param1 + this.field_p;
            this.a(mi.field_z, this.field_L, param1, 16777215, param0);
            this.a(eb.field_e, this.field_Q, param1, 16777215, param0);
            this.a(iu.field_l, this.field_O, param1, 16777215, param0);
            return;
          }
        } else {
          return;
        }
    }

    final static String a(char param0, boolean param1, int param2) {
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        var6 = new char[param2];
        var3 = var6;
        if (!param1) {
          return (String) null;
        } else {
          var4 = 0;
          L0: while (true) {
            L1: {
              if (param2 <= var4) {
                break L1;
              } else {
                var6[var4] = param0;
                var4++;
                if (var5 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            return new String(var6);
          }
        }
    }

    private no(kh param0, boolean param1) {
        super(0, 0, 0, 0, (kh) null);
        RuntimeException runtimeException = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              this.field_L = (fn) ((Object) new ma("", (qo) null, 2));
              this.field_Q = (fn) ((Object) new ma("", (qo) null, 2));
              this.field_O = (fn) ((Object) new ma("", (qo) null, 4));
              this.field_O.field_k = param0;
              this.field_Q.field_k = param0;
              this.field_L.field_k = param0;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param1) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              L3: {
                ((no) (this)).field_R = stackIn_4_1 != 0;
                if (this.field_R) {
                  break L3;
                } else {
                  this.a((byte) 10, (kb) (this.field_L));
                  this.a((byte) 10, (kb) (this.field_Q));
                  if (!ArmiesOfGielinor.field_M) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              this.a((byte) 10, (kb) (this.field_Q));
              this.a((byte) 10, (kb) (this.field_L));
              break L2;
            }
            this.a((byte) 10, (kb) (this.field_O));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (runtimeException);
            stackOut_9_1 = new StringBuilder().append("no.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        super.a(param0, param1, param2, 8192, param4);
        var6 = param1 + -130 >> -614069727;
        if (!this.field_R) {
          this.field_L.a(var6, 25, 0, 8192, param4);
          this.field_Q.a(45 + var6, 25, 0, 8192, param4);
          if (ArmiesOfGielinor.field_M) {
            this.field_Q.a(var6, 25, 0, 8192, param4);
            this.field_L.a(var6 + 45, 25, 0, 8192, param4);
            this.field_O.a(90 + var6, 40, 0, param3, param4);
            return;
          } else {
            this.field_O.a(90 + var6, 40, 0, param3, param4);
            return;
          }
        } else {
          this.field_Q.a(var6, 25, 0, 8192, param4);
          this.field_L.a(var6 + 45, 25, 0, 8192, param4);
          this.field_O.a(90 + var6, 40, 0, param3, param4);
          return;
        }
    }

    final int a(byte param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        if (param0 == -77) {
          try {
            L0: {
              stackOut_2_0 = Integer.parseInt(this.field_O.field_v);
              stackIn_3_0 = stackOut_2_0;
              break L0;
            }
          } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (NumberFormatException) (Object) decompiledCaughtException;
            return -1;
          }
          return stackIn_3_0;
        } else {
          return -48;
        }
    }

    static {
        field_P = new wk(0, 0);
    }
}
