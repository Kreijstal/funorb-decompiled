/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc extends ao {
    private vo field_G;
    vo field_B;
    static String field_C;
    static ri[] field_F;
    we field_D;
    private boolean field_H;
    static boolean field_E;
    private boolean field_A;
    static String field_J;

    mc(int param0, int param1, int param2, int param3, mh param4, pk param5, mh param6) {
        super(param0, param1, param2, param3, param4);
        we dupTemp$0 = null;
        try {
            this.field_x = new pk[3];
            dupTemp$0 = new we(param0, param1, param2, param3, param6, param5);
            this.field_D = dupTemp$0;
            this.field_x[2] = (pk) ((Object) dupTemp$0);
            this.e(false);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "mc.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, pk param2, int param3) {
        try {
            super.a(param0, 65, param2, param3);
            this.g(1);
            int var5_int = -92 % ((-25 - param1) / 45);
            this.f(1);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "mc.U(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private final void f(int param0) {
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        boolean discarded$6 = false;
        boolean discarded$7 = false;
        pk var3 = null;
        if (null == this.field_G) {
          if (this.field_B == null) {
            if (param0 != 1) {
              var3 = (pk) null;
              discarded$4 = this.a((pk) null, 'g', (byte) -4, -28);
              return;
            } else {
              return;
            }
          } else {
            this.field_D.field_y.field_v = -(int)((long)(this.field_D.field_y.field_p + -this.field_D.field_p) * (long)this.field_B.field_D >> -869429872);
            if (param0 != 1) {
              var3 = (pk) null;
              discarded$5 = this.a((pk) null, 'g', (byte) -4, -28);
              return;
            } else {
              return;
            }
          }
        } else {
          this.field_D.field_y.field_r = -(int)((long)(-this.field_D.field_q + this.field_D.field_y.field_q) * (long)this.field_G.field_G >> -22310576);
          if (this.field_B != null) {
            this.field_D.field_y.field_v = -(int)((long)(this.field_D.field_y.field_p + -this.field_D.field_p) * (long)this.field_B.field_D >> -869429872);
            if (param0 == 1) {
              return;
            } else {
              var3 = (pk) null;
              discarded$6 = this.a((pk) null, 'g', (byte) -4, -28);
              return;
            }
          } else {
            if (param0 != 1) {
              var3 = (pk) null;
              discarded$7 = this.a((pk) null, 'g', (byte) -4, -28);
              return;
            } else {
              return;
            }
          }
        }
    }

    private final boolean a(int param0, int param1) {
        boolean discarded$5 = false;
        if (param1 != 0) {
            pk var4 = (pk) null;
            discarded$5 = this.a((pk) null, '￠', (byte) -97, -36);
            if (this.field_B != null) {
                this.field_B.a(param1 ^ 0, param0 * this.field_B.field_E + this.field_B.field_D);
                return true;
            }
            return false;
        }
        if (!(this.field_B == null)) {
            this.field_B.a(param1 ^ 0, param0 * this.field_B.field_E + this.field_B.field_D);
            return true;
        }
        return false;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, pk param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_9_0 = 0;
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
            if (super.a(param0, param1, param2 ^ 0, param3, param4, param5, param6)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param2 == -1) {
                  break L1;
                } else {
                  this.field_B = (vo) null;
                  break L1;
                }
              }
              L2: {
                L3: {
                  if (!this.d(-1)) {
                    break L3;
                  } else {
                    if (!this.a(param1, 0)) {
                      break L3;
                    } else {
                      stackOut_8_0 = 1;
                      stackIn_10_0 = stackOut_8_0;
                      break L2;
                    }
                  }
                }
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L2;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var8);
            stackOut_11_1 = new StringBuilder().append("mc.RA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param5 == null) {
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
          throw qo.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    final boolean a(pk param0, char param1, byte param2, int param3) {
        RuntimeException var5 = null;
        pk var6 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param2 >= 9) {
                break L1;
              } else {
                var6 = (pk) null;
                this.a(20, 50, (pk) null, 57);
                break L1;
              }
            }
            if (super.a(param0, param1, (byte) 74, param3)) {
              this.f(1);
              stackOut_4_0 = 1;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var5);
            stackOut_6_1 = new StringBuilder().append("mc.KA(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
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
          throw qo.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final void a(int param0, boolean param1, vo param2) {
        if (param0 != 1332) {
            return;
        }
        try {
            this.field_B = param2;
            this.field_x[1] = (pk) ((Object) param2);
            this.field_H = param1 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "mc.VA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean b(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = -93 % ((30 - param0) / 59);
            stackOut_0_0 = fw.a((byte) 126, hc.class, param1);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var2);
            stackOut_2_1 = new StringBuilder().append("mc.PA(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final static ne a(byte param0, ki param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        ne stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        ne stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var4_int = param1.a(0, param3);
            var5 = -112 / ((param0 - -84) / 40);
            var6 = param1.a(var4_int, param2, (byte) 127);
            stackOut_0_0 = iw.a(var6, var4_int, param1, -21834);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var4);
            stackOut_2_1 = new StringBuilder().append("mc.TA(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_1_0;
    }

    public static void f(boolean param0) {
        field_J = null;
        if (!param0) {
            field_F = (ri[]) null;
            field_C = null;
            field_F = null;
            return;
        }
        field_C = null;
        field_F = null;
    }

    private final void g(int param0) {
        int var3 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (param0 == 1) {
          if (null != this.field_B) {
            if (this.field_D.field_y.field_p > this.field_D.field_p) {
              this.field_B.c(12, this.field_D.field_y.field_p, this.field_D.field_p);
              if (null != this.field_G) {
                if (this.field_D.field_q >= this.field_D.field_y.field_q) {
                  this.field_G.b(1, 1, 107);
                  if (var3 != 0) {
                    this.field_G.b(this.field_D.field_q, this.field_D.field_y.field_q, 8);
                    return;
                  } else {
                    return;
                  }
                } else {
                  this.field_G.b(this.field_D.field_q, this.field_D.field_y.field_q, 8);
                  return;
                }
              } else {
                return;
              }
            } else {
              this.field_B.c(101, 1, 1);
              if (var3 != 0) {
                this.field_B.c(12, this.field_D.field_y.field_p, this.field_D.field_p);
                if (null != this.field_G) {
                  if (this.field_D.field_q >= this.field_D.field_y.field_q) {
                    this.field_G.b(1, 1, 107);
                    if (var3 != 0) {
                      this.field_G.b(this.field_D.field_q, this.field_D.field_y.field_q, 8);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    this.field_G.b(this.field_D.field_q, this.field_D.field_y.field_q, 8);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                if (null != this.field_G) {
                  if (this.field_D.field_q >= this.field_D.field_y.field_q) {
                    this.field_G.b(1, 1, 107);
                    if (var3 == 0) {
                      return;
                    } else {
                      this.field_G.b(this.field_D.field_q, this.field_D.field_y.field_q, 8);
                      return;
                    }
                  } else {
                    this.field_G.b(this.field_D.field_q, this.field_D.field_y.field_q, 8);
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          } else {
            if (null != this.field_G) {
              if (this.field_D.field_q >= this.field_D.field_y.field_q) {
                this.field_G.b(1, 1, 107);
                if (var3 != 0) {
                  this.field_G.b(this.field_D.field_q, this.field_D.field_y.field_q, 8);
                  return;
                } else {
                  return;
                }
              } else {
                this.field_G.b(this.field_D.field_q, this.field_D.field_y.field_q, 8);
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final void e(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        vo stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        vo stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        vo stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        vo stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        vo stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        vo stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        vo stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        vo stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        vo stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        vo stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        int stackIn_45_2 = 0;
        vo stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        int stackIn_46_2 = 0;
        vo stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        int stackIn_47_2 = 0;
        int stackIn_47_3 = 0;
        int stackIn_52_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_58_0 = 0;
        vo stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        vo stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        vo stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        int stackIn_63_2 = 0;
        vo stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        int stackIn_66_2 = 0;
        vo stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        int stackIn_67_2 = 0;
        vo stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        int stackIn_68_2 = 0;
        int stackIn_68_3 = 0;
        int stackIn_74_0 = 0;
        int stackIn_77_0 = 0;
        vo stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        vo stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        vo stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        int stackIn_82_2 = 0;
        vo stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        int stackIn_85_2 = 0;
        vo stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        int stackIn_86_2 = 0;
        vo stackIn_87_0 = null;
        int stackIn_87_1 = 0;
        int stackIn_87_2 = 0;
        int stackIn_87_3 = 0;
        int stackIn_92_0 = 0;
        int stackIn_95_0 = 0;
        vo stackIn_98_0 = null;
        int stackIn_98_1 = 0;
        vo stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        vo stackIn_100_0 = null;
        int stackIn_100_1 = 0;
        int stackIn_100_2 = 0;
        vo stackIn_103_0 = null;
        int stackIn_103_1 = 0;
        int stackIn_103_2 = 0;
        vo stackIn_104_0 = null;
        int stackIn_104_1 = 0;
        int stackIn_104_2 = 0;
        vo stackIn_105_0 = null;
        int stackIn_105_1 = 0;
        int stackIn_105_2 = 0;
        int stackIn_105_3 = 0;
        int stackIn_112_0 = 0;
        int stackIn_115_0 = 0;
        int stackIn_118_0 = 0;
        vo stackIn_121_0 = null;
        int stackIn_121_1 = 0;
        vo stackIn_122_0 = null;
        int stackIn_122_1 = 0;
        vo stackIn_123_0 = null;
        int stackIn_123_1 = 0;
        int stackIn_123_2 = 0;
        vo stackIn_126_0 = null;
        int stackIn_126_1 = 0;
        int stackIn_126_2 = 0;
        vo stackIn_127_0 = null;
        int stackIn_127_1 = 0;
        int stackIn_127_2 = 0;
        vo stackIn_128_0 = null;
        int stackIn_128_1 = 0;
        int stackIn_128_2 = 0;
        int stackIn_128_3 = 0;
        int stackIn_134_0 = 0;
        int stackIn_137_0 = 0;
        vo stackIn_140_0 = null;
        int stackIn_140_1 = 0;
        vo stackIn_141_0 = null;
        int stackIn_141_1 = 0;
        vo stackIn_142_0 = null;
        int stackIn_142_1 = 0;
        int stackIn_142_2 = 0;
        vo stackIn_145_0 = null;
        int stackIn_145_1 = 0;
        int stackIn_145_2 = 0;
        vo stackIn_146_0 = null;
        int stackIn_146_1 = 0;
        int stackIn_146_2 = 0;
        vo stackIn_147_0 = null;
        int stackIn_147_1 = 0;
        int stackIn_147_2 = 0;
        int stackIn_147_3 = 0;
        int stackIn_152_0 = 0;
        int stackIn_155_0 = 0;
        vo stackIn_158_0 = null;
        int stackIn_158_1 = 0;
        vo stackIn_159_0 = null;
        int stackIn_159_1 = 0;
        vo stackIn_160_0 = null;
        int stackIn_160_1 = 0;
        int stackIn_160_2 = 0;
        vo stackIn_163_0 = null;
        int stackIn_163_1 = 0;
        int stackIn_163_2 = 0;
        vo stackIn_164_0 = null;
        int stackIn_164_1 = 0;
        int stackIn_164_2 = 0;
        vo stackIn_165_0 = null;
        int stackIn_165_1 = 0;
        int stackIn_165_2 = 0;
        int stackIn_165_3 = 0;
        int stackIn_172_0 = 0;
        int stackIn_175_0 = 0;
        int stackIn_178_0 = 0;
        vo stackIn_181_0 = null;
        int stackIn_181_1 = 0;
        vo stackIn_182_0 = null;
        int stackIn_182_1 = 0;
        vo stackIn_183_0 = null;
        int stackIn_183_1 = 0;
        int stackIn_183_2 = 0;
        vo stackIn_186_0 = null;
        int stackIn_186_1 = 0;
        int stackIn_186_2 = 0;
        vo stackIn_187_0 = null;
        int stackIn_187_1 = 0;
        int stackIn_187_2 = 0;
        vo stackIn_188_0 = null;
        int stackIn_188_1 = 0;
        int stackIn_188_2 = 0;
        int stackIn_188_3 = 0;
        int stackIn_194_0 = 0;
        int stackIn_197_0 = 0;
        vo stackIn_200_0 = null;
        int stackIn_200_1 = 0;
        vo stackIn_201_0 = null;
        int stackIn_201_1 = 0;
        vo stackIn_202_0 = null;
        int stackIn_202_1 = 0;
        int stackIn_202_2 = 0;
        vo stackIn_205_0 = null;
        int stackIn_205_1 = 0;
        int stackIn_205_2 = 0;
        vo stackIn_206_0 = null;
        int stackIn_206_1 = 0;
        int stackIn_206_2 = 0;
        vo stackIn_207_0 = null;
        int stackIn_207_1 = 0;
        int stackIn_207_2 = 0;
        int stackIn_207_3 = 0;
        int stackIn_212_0 = 0;
        int stackIn_215_0 = 0;
        vo stackIn_218_0 = null;
        int stackIn_218_1 = 0;
        vo stackIn_219_0 = null;
        int stackIn_219_1 = 0;
        vo stackIn_220_0 = null;
        int stackIn_220_1 = 0;
        int stackIn_220_2 = 0;
        vo stackIn_223_0 = null;
        int stackIn_223_1 = 0;
        int stackIn_223_2 = 0;
        vo stackIn_224_0 = null;
        int stackIn_224_1 = 0;
        int stackIn_224_2 = 0;
        vo stackIn_225_0 = null;
        int stackIn_225_1 = 0;
        int stackIn_225_2 = 0;
        int stackIn_225_3 = 0;
        int stackIn_231_0 = 0;
        int stackIn_234_0 = 0;
        int stackIn_237_0 = 0;
        vo stackIn_240_0 = null;
        int stackIn_240_1 = 0;
        vo stackIn_241_0 = null;
        int stackIn_241_1 = 0;
        vo stackIn_242_0 = null;
        int stackIn_242_1 = 0;
        int stackIn_242_2 = 0;
        vo stackIn_245_0 = null;
        int stackIn_245_1 = 0;
        int stackIn_245_2 = 0;
        vo stackIn_246_0 = null;
        int stackIn_246_1 = 0;
        int stackIn_246_2 = 0;
        vo stackIn_247_0 = null;
        int stackIn_247_1 = 0;
        int stackIn_247_2 = 0;
        int stackIn_247_3 = 0;
        int stackIn_253_0 = 0;
        int stackIn_256_0 = 0;
        vo stackIn_259_0 = null;
        int stackIn_259_1 = 0;
        vo stackIn_260_0 = null;
        int stackIn_260_1 = 0;
        vo stackIn_261_0 = null;
        int stackIn_261_1 = 0;
        int stackIn_261_2 = 0;
        vo stackIn_264_0 = null;
        int stackIn_264_1 = 0;
        int stackIn_264_2 = 0;
        vo stackIn_265_0 = null;
        int stackIn_265_1 = 0;
        int stackIn_265_2 = 0;
        vo stackIn_266_0 = null;
        int stackIn_266_1 = 0;
        int stackIn_266_2 = 0;
        int stackIn_266_3 = 0;
        int stackIn_271_0 = 0;
        int stackIn_274_0 = 0;
        vo stackIn_277_0 = null;
        int stackIn_277_1 = 0;
        vo stackIn_278_0 = null;
        int stackIn_278_1 = 0;
        vo stackIn_279_0 = null;
        int stackIn_279_1 = 0;
        int stackIn_279_2 = 0;
        vo stackIn_282_0 = null;
        int stackIn_282_1 = 0;
        int stackIn_282_2 = 0;
        vo stackIn_283_0 = null;
        int stackIn_283_1 = 0;
        int stackIn_283_2 = 0;
        vo stackIn_284_0 = null;
        int stackIn_284_1 = 0;
        int stackIn_284_2 = 0;
        int stackIn_284_3 = 0;
        int stackOut_270_0 = 0;
        int stackOut_269_0 = 0;
        int stackOut_273_0 = 0;
        int stackOut_272_0 = 0;
        vo stackOut_276_0 = null;
        int stackOut_276_1 = 0;
        vo stackOut_278_0 = null;
        int stackOut_278_1 = 0;
        int stackOut_278_2 = 0;
        vo stackOut_277_0 = null;
        int stackOut_277_1 = 0;
        int stackOut_277_2 = 0;
        vo stackOut_281_0 = null;
        int stackOut_281_1 = 0;
        int stackOut_281_2 = 0;
        vo stackOut_283_0 = null;
        int stackOut_283_1 = 0;
        int stackOut_283_2 = 0;
        int stackOut_283_3 = 0;
        vo stackOut_282_0 = null;
        int stackOut_282_1 = 0;
        int stackOut_282_2 = 0;
        int stackOut_282_3 = 0;
        int stackOut_252_0 = 0;
        int stackOut_251_0 = 0;
        int stackOut_255_0 = 0;
        int stackOut_254_0 = 0;
        vo stackOut_258_0 = null;
        int stackOut_258_1 = 0;
        vo stackOut_260_0 = null;
        int stackOut_260_1 = 0;
        int stackOut_260_2 = 0;
        vo stackOut_259_0 = null;
        int stackOut_259_1 = 0;
        int stackOut_259_2 = 0;
        vo stackOut_263_0 = null;
        int stackOut_263_1 = 0;
        int stackOut_263_2 = 0;
        vo stackOut_265_0 = null;
        int stackOut_265_1 = 0;
        int stackOut_265_2 = 0;
        int stackOut_265_3 = 0;
        vo stackOut_264_0 = null;
        int stackOut_264_1 = 0;
        int stackOut_264_2 = 0;
        int stackOut_264_3 = 0;
        int stackOut_229_0 = 0;
        int stackOut_233_0 = 0;
        int stackOut_232_0 = 0;
        int stackOut_236_0 = 0;
        int stackOut_235_0 = 0;
        vo stackOut_239_0 = null;
        int stackOut_239_1 = 0;
        vo stackOut_241_0 = null;
        int stackOut_241_1 = 0;
        int stackOut_241_2 = 0;
        vo stackOut_240_0 = null;
        int stackOut_240_1 = 0;
        int stackOut_240_2 = 0;
        vo stackOut_244_0 = null;
        int stackOut_244_1 = 0;
        int stackOut_244_2 = 0;
        vo stackOut_246_0 = null;
        int stackOut_246_1 = 0;
        int stackOut_246_2 = 0;
        int stackOut_246_3 = 0;
        vo stackOut_245_0 = null;
        int stackOut_245_1 = 0;
        int stackOut_245_2 = 0;
        int stackOut_245_3 = 0;
        int stackOut_211_0 = 0;
        int stackOut_210_0 = 0;
        int stackOut_214_0 = 0;
        int stackOut_213_0 = 0;
        vo stackOut_217_0 = null;
        int stackOut_217_1 = 0;
        vo stackOut_219_0 = null;
        int stackOut_219_1 = 0;
        int stackOut_219_2 = 0;
        vo stackOut_218_0 = null;
        int stackOut_218_1 = 0;
        int stackOut_218_2 = 0;
        vo stackOut_222_0 = null;
        int stackOut_222_1 = 0;
        int stackOut_222_2 = 0;
        vo stackOut_224_0 = null;
        int stackOut_224_1 = 0;
        int stackOut_224_2 = 0;
        int stackOut_224_3 = 0;
        vo stackOut_223_0 = null;
        int stackOut_223_1 = 0;
        int stackOut_223_2 = 0;
        int stackOut_223_3 = 0;
        int stackOut_193_0 = 0;
        int stackOut_192_0 = 0;
        int stackOut_196_0 = 0;
        int stackOut_195_0 = 0;
        vo stackOut_199_0 = null;
        int stackOut_199_1 = 0;
        vo stackOut_201_0 = null;
        int stackOut_201_1 = 0;
        int stackOut_201_2 = 0;
        vo stackOut_200_0 = null;
        int stackOut_200_1 = 0;
        int stackOut_200_2 = 0;
        vo stackOut_204_0 = null;
        int stackOut_204_1 = 0;
        int stackOut_204_2 = 0;
        vo stackOut_206_0 = null;
        int stackOut_206_1 = 0;
        int stackOut_206_2 = 0;
        int stackOut_206_3 = 0;
        vo stackOut_205_0 = null;
        int stackOut_205_1 = 0;
        int stackOut_205_2 = 0;
        int stackOut_205_3 = 0;
        int stackOut_170_0 = 0;
        int stackOut_174_0 = 0;
        int stackOut_173_0 = 0;
        int stackOut_177_0 = 0;
        int stackOut_176_0 = 0;
        vo stackOut_180_0 = null;
        int stackOut_180_1 = 0;
        vo stackOut_182_0 = null;
        int stackOut_182_1 = 0;
        int stackOut_182_2 = 0;
        vo stackOut_181_0 = null;
        int stackOut_181_1 = 0;
        int stackOut_181_2 = 0;
        vo stackOut_185_0 = null;
        int stackOut_185_1 = 0;
        int stackOut_185_2 = 0;
        vo stackOut_187_0 = null;
        int stackOut_187_1 = 0;
        int stackOut_187_2 = 0;
        int stackOut_187_3 = 0;
        vo stackOut_186_0 = null;
        int stackOut_186_1 = 0;
        int stackOut_186_2 = 0;
        int stackOut_186_3 = 0;
        int stackOut_151_0 = 0;
        int stackOut_150_0 = 0;
        int stackOut_154_0 = 0;
        int stackOut_153_0 = 0;
        vo stackOut_157_0 = null;
        int stackOut_157_1 = 0;
        vo stackOut_159_0 = null;
        int stackOut_159_1 = 0;
        int stackOut_159_2 = 0;
        vo stackOut_158_0 = null;
        int stackOut_158_1 = 0;
        int stackOut_158_2 = 0;
        vo stackOut_162_0 = null;
        int stackOut_162_1 = 0;
        int stackOut_162_2 = 0;
        vo stackOut_164_0 = null;
        int stackOut_164_1 = 0;
        int stackOut_164_2 = 0;
        int stackOut_164_3 = 0;
        vo stackOut_163_0 = null;
        int stackOut_163_1 = 0;
        int stackOut_163_2 = 0;
        int stackOut_163_3 = 0;
        int stackOut_133_0 = 0;
        int stackOut_132_0 = 0;
        int stackOut_136_0 = 0;
        int stackOut_135_0 = 0;
        vo stackOut_139_0 = null;
        int stackOut_139_1 = 0;
        vo stackOut_141_0 = null;
        int stackOut_141_1 = 0;
        int stackOut_141_2 = 0;
        vo stackOut_140_0 = null;
        int stackOut_140_1 = 0;
        int stackOut_140_2 = 0;
        vo stackOut_144_0 = null;
        int stackOut_144_1 = 0;
        int stackOut_144_2 = 0;
        vo stackOut_146_0 = null;
        int stackOut_146_1 = 0;
        int stackOut_146_2 = 0;
        int stackOut_146_3 = 0;
        vo stackOut_145_0 = null;
        int stackOut_145_1 = 0;
        int stackOut_145_2 = 0;
        int stackOut_145_3 = 0;
        int stackOut_110_0 = 0;
        int stackOut_114_0 = 0;
        int stackOut_113_0 = 0;
        int stackOut_117_0 = 0;
        int stackOut_116_0 = 0;
        vo stackOut_120_0 = null;
        int stackOut_120_1 = 0;
        vo stackOut_122_0 = null;
        int stackOut_122_1 = 0;
        int stackOut_122_2 = 0;
        vo stackOut_121_0 = null;
        int stackOut_121_1 = 0;
        int stackOut_121_2 = 0;
        vo stackOut_125_0 = null;
        int stackOut_125_1 = 0;
        int stackOut_125_2 = 0;
        vo stackOut_127_0 = null;
        int stackOut_127_1 = 0;
        int stackOut_127_2 = 0;
        int stackOut_127_3 = 0;
        vo stackOut_126_0 = null;
        int stackOut_126_1 = 0;
        int stackOut_126_2 = 0;
        int stackOut_126_3 = 0;
        int stackOut_91_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_93_0 = 0;
        vo stackOut_97_0 = null;
        int stackOut_97_1 = 0;
        vo stackOut_99_0 = null;
        int stackOut_99_1 = 0;
        int stackOut_99_2 = 0;
        vo stackOut_98_0 = null;
        int stackOut_98_1 = 0;
        int stackOut_98_2 = 0;
        vo stackOut_102_0 = null;
        int stackOut_102_1 = 0;
        int stackOut_102_2 = 0;
        vo stackOut_104_0 = null;
        int stackOut_104_1 = 0;
        int stackOut_104_2 = 0;
        int stackOut_104_3 = 0;
        vo stackOut_103_0 = null;
        int stackOut_103_1 = 0;
        int stackOut_103_2 = 0;
        int stackOut_103_3 = 0;
        int stackOut_73_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_75_0 = 0;
        vo stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        vo stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        int stackOut_81_2 = 0;
        vo stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        int stackOut_80_2 = 0;
        vo stackOut_84_0 = null;
        int stackOut_84_1 = 0;
        int stackOut_84_2 = 0;
        vo stackOut_86_0 = null;
        int stackOut_86_1 = 0;
        int stackOut_86_2 = 0;
        int stackOut_86_3 = 0;
        vo stackOut_85_0 = null;
        int stackOut_85_1 = 0;
        int stackOut_85_2 = 0;
        int stackOut_85_3 = 0;
        int stackOut_50_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_56_0 = 0;
        vo stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        vo stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        int stackOut_62_2 = 0;
        vo stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        int stackOut_61_2 = 0;
        vo stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        int stackOut_65_2 = 0;
        vo stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        int stackOut_67_2 = 0;
        int stackOut_67_3 = 0;
        vo stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        int stackOut_66_2 = 0;
        int stackOut_66_3 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        vo stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        vo stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int stackOut_41_2 = 0;
        vo stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        int stackOut_40_2 = 0;
        vo stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        int stackOut_44_2 = 0;
        vo stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        int stackOut_46_2 = 0;
        int stackOut_46_3 = 0;
        vo stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        int stackOut_45_2 = 0;
        int stackOut_45_3 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        vo stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        vo stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        vo stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        vo stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        vo stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        vo stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        int stackOut_21_3 = 0;
        if (!param0) {
          if (!this.field_H) {
            if (this.field_B != null) {
              var2 = this.field_B.field_q;
              if (!this.field_A) {
                if (null == this.field_G) {
                  L0: {
                    var3 = 0;
                    if (this.field_B != null) {
                      stackOut_270_0 = -this.field_B.field_q + this.field_q;
                      stackIn_271_0 = stackOut_270_0;
                      break L0;
                    } else {
                      stackOut_269_0 = this.field_q;
                      stackIn_271_0 = stackOut_269_0;
                      break L0;
                    }
                  }
                  L1: {
                    var4 = stackIn_271_0;
                    if (null == this.field_G) {
                      stackOut_273_0 = this.field_p;
                      stackIn_274_0 = stackOut_273_0;
                      break L1;
                    } else {
                      stackOut_272_0 = -this.field_G.field_p + this.field_p;
                      stackIn_274_0 = stackOut_272_0;
                      break L1;
                    }
                  }
                  L2: {
                    var5 = stackIn_274_0;
                    this.field_D.a(-123, var2, var3, var5, var4);
                    if (this.field_B != null) {
                      L3: {
                        stackOut_276_0 = this.field_B;
                        stackOut_276_1 = -119;
                        stackIn_278_0 = stackOut_276_0;
                        stackIn_278_1 = stackOut_276_1;
                        stackIn_277_0 = stackOut_276_0;
                        stackIn_277_1 = stackOut_276_1;
                        if (!this.field_H) {
                          stackOut_278_0 = (vo) ((Object) stackIn_278_0);
                          stackOut_278_1 = stackIn_278_1;
                          stackOut_278_2 = 0;
                          stackIn_279_0 = stackOut_278_0;
                          stackIn_279_1 = stackOut_278_1;
                          stackIn_279_2 = stackOut_278_2;
                          break L3;
                        } else {
                          stackOut_277_0 = (vo) ((Object) stackIn_277_0);
                          stackOut_277_1 = stackIn_277_1;
                          stackOut_277_2 = this.field_q + -this.field_B.field_q;
                          stackIn_279_0 = stackOut_277_0;
                          stackIn_279_1 = stackOut_277_1;
                          stackIn_279_2 = stackOut_277_2;
                          break L3;
                        }
                      }
                      ((vo) (Object) stackIn_279_0).a(stackIn_279_1, stackIn_279_2, this.field_D.field_v, this.field_D.field_p, this.field_B.field_q);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L4: {
                    if (this.field_G == null) {
                      break L4;
                    } else {
                      L5: {
                        stackOut_281_0 = this.field_G;
                        stackOut_281_1 = 91;
                        stackOut_281_2 = this.field_D.field_r;
                        stackIn_283_0 = stackOut_281_0;
                        stackIn_283_1 = stackOut_281_1;
                        stackIn_283_2 = stackOut_281_2;
                        stackIn_282_0 = stackOut_281_0;
                        stackIn_282_1 = stackOut_281_1;
                        stackIn_282_2 = stackOut_281_2;
                        if (this.field_A) {
                          stackOut_283_0 = (vo) ((Object) stackIn_283_0);
                          stackOut_283_1 = stackIn_283_1;
                          stackOut_283_2 = stackIn_283_2;
                          stackOut_283_3 = -this.field_G.field_p + this.field_p;
                          stackIn_284_0 = stackOut_283_0;
                          stackIn_284_1 = stackOut_283_1;
                          stackIn_284_2 = stackOut_283_2;
                          stackIn_284_3 = stackOut_283_3;
                          break L5;
                        } else {
                          stackOut_282_0 = (vo) ((Object) stackIn_282_0);
                          stackOut_282_1 = stackIn_282_1;
                          stackOut_282_2 = stackIn_282_2;
                          stackOut_282_3 = 0;
                          stackIn_284_0 = stackOut_282_0;
                          stackIn_284_1 = stackOut_282_1;
                          stackIn_284_2 = stackOut_282_2;
                          stackIn_284_3 = stackOut_282_3;
                          break L5;
                        }
                      }
                      ((vo) (Object) stackIn_284_0).a(stackIn_284_1, stackIn_284_2, stackIn_284_3, this.field_G.field_p, this.field_D.field_q);
                      break L4;
                    }
                  }
                  this.g(1);
                  return;
                } else {
                  L6: {
                    var3 = this.field_G.field_p;
                    if (this.field_B != null) {
                      stackOut_252_0 = -this.field_B.field_q + this.field_q;
                      stackIn_253_0 = stackOut_252_0;
                      break L6;
                    } else {
                      stackOut_251_0 = this.field_q;
                      stackIn_253_0 = stackOut_251_0;
                      break L6;
                    }
                  }
                  L7: {
                    var4 = stackIn_253_0;
                    if (null == this.field_G) {
                      stackOut_255_0 = this.field_p;
                      stackIn_256_0 = stackOut_255_0;
                      break L7;
                    } else {
                      stackOut_254_0 = -this.field_G.field_p + this.field_p;
                      stackIn_256_0 = stackOut_254_0;
                      break L7;
                    }
                  }
                  L8: {
                    var5 = stackIn_256_0;
                    this.field_D.a(-123, var2, var3, var5, var4);
                    if (this.field_B != null) {
                      L9: {
                        stackOut_258_0 = this.field_B;
                        stackOut_258_1 = -119;
                        stackIn_260_0 = stackOut_258_0;
                        stackIn_260_1 = stackOut_258_1;
                        stackIn_259_0 = stackOut_258_0;
                        stackIn_259_1 = stackOut_258_1;
                        if (!this.field_H) {
                          stackOut_260_0 = (vo) ((Object) stackIn_260_0);
                          stackOut_260_1 = stackIn_260_1;
                          stackOut_260_2 = 0;
                          stackIn_261_0 = stackOut_260_0;
                          stackIn_261_1 = stackOut_260_1;
                          stackIn_261_2 = stackOut_260_2;
                          break L9;
                        } else {
                          stackOut_259_0 = (vo) ((Object) stackIn_259_0);
                          stackOut_259_1 = stackIn_259_1;
                          stackOut_259_2 = this.field_q + -this.field_B.field_q;
                          stackIn_261_0 = stackOut_259_0;
                          stackIn_261_1 = stackOut_259_1;
                          stackIn_261_2 = stackOut_259_2;
                          break L9;
                        }
                      }
                      ((vo) (Object) stackIn_261_0).a(stackIn_261_1, stackIn_261_2, this.field_D.field_v, this.field_D.field_p, this.field_B.field_q);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L10: {
                    if (this.field_G == null) {
                      break L10;
                    } else {
                      L11: {
                        stackOut_263_0 = this.field_G;
                        stackOut_263_1 = 91;
                        stackOut_263_2 = this.field_D.field_r;
                        stackIn_265_0 = stackOut_263_0;
                        stackIn_265_1 = stackOut_263_1;
                        stackIn_265_2 = stackOut_263_2;
                        stackIn_264_0 = stackOut_263_0;
                        stackIn_264_1 = stackOut_263_1;
                        stackIn_264_2 = stackOut_263_2;
                        if (this.field_A) {
                          stackOut_265_0 = (vo) ((Object) stackIn_265_0);
                          stackOut_265_1 = stackIn_265_1;
                          stackOut_265_2 = stackIn_265_2;
                          stackOut_265_3 = -this.field_G.field_p + this.field_p;
                          stackIn_266_0 = stackOut_265_0;
                          stackIn_266_1 = stackOut_265_1;
                          stackIn_266_2 = stackOut_265_2;
                          stackIn_266_3 = stackOut_265_3;
                          break L11;
                        } else {
                          stackOut_264_0 = (vo) ((Object) stackIn_264_0);
                          stackOut_264_1 = stackIn_264_1;
                          stackOut_264_2 = stackIn_264_2;
                          stackOut_264_3 = 0;
                          stackIn_266_0 = stackOut_264_0;
                          stackIn_266_1 = stackOut_264_1;
                          stackIn_266_2 = stackOut_264_2;
                          stackIn_266_3 = stackOut_264_3;
                          break L11;
                        }
                      }
                      ((vo) (Object) stackIn_266_0).a(stackIn_266_1, stackIn_266_2, stackIn_266_3, this.field_G.field_p, this.field_D.field_q);
                      break L10;
                    }
                  }
                  this.g(1);
                  return;
                }
              } else {
                stackOut_229_0 = 0;
                stackIn_231_0 = stackOut_229_0;
                L12: {
                  var3 = stackIn_231_0;
                  if (this.field_B != null) {
                    stackOut_233_0 = -this.field_B.field_q + this.field_q;
                    stackIn_234_0 = stackOut_233_0;
                    break L12;
                  } else {
                    stackOut_232_0 = this.field_q;
                    stackIn_234_0 = stackOut_232_0;
                    break L12;
                  }
                }
                L13: {
                  var4 = stackIn_234_0;
                  if (null == this.field_G) {
                    stackOut_236_0 = this.field_p;
                    stackIn_237_0 = stackOut_236_0;
                    break L13;
                  } else {
                    stackOut_235_0 = -this.field_G.field_p + this.field_p;
                    stackIn_237_0 = stackOut_235_0;
                    break L13;
                  }
                }
                L14: {
                  var5 = stackIn_237_0;
                  this.field_D.a(-123, var2, var3, var5, var4);
                  if (this.field_B != null) {
                    L15: {
                      stackOut_239_0 = this.field_B;
                      stackOut_239_1 = -119;
                      stackIn_241_0 = stackOut_239_0;
                      stackIn_241_1 = stackOut_239_1;
                      stackIn_240_0 = stackOut_239_0;
                      stackIn_240_1 = stackOut_239_1;
                      if (!this.field_H) {
                        stackOut_241_0 = (vo) ((Object) stackIn_241_0);
                        stackOut_241_1 = stackIn_241_1;
                        stackOut_241_2 = 0;
                        stackIn_242_0 = stackOut_241_0;
                        stackIn_242_1 = stackOut_241_1;
                        stackIn_242_2 = stackOut_241_2;
                        break L15;
                      } else {
                        stackOut_240_0 = (vo) ((Object) stackIn_240_0);
                        stackOut_240_1 = stackIn_240_1;
                        stackOut_240_2 = this.field_q + -this.field_B.field_q;
                        stackIn_242_0 = stackOut_240_0;
                        stackIn_242_1 = stackOut_240_1;
                        stackIn_242_2 = stackOut_240_2;
                        break L15;
                      }
                    }
                    ((vo) (Object) stackIn_242_0).a(stackIn_242_1, stackIn_242_2, this.field_D.field_v, this.field_D.field_p, this.field_B.field_q);
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L16: {
                  if (this.field_G == null) {
                    break L16;
                  } else {
                    L17: {
                      stackOut_244_0 = this.field_G;
                      stackOut_244_1 = 91;
                      stackOut_244_2 = this.field_D.field_r;
                      stackIn_246_0 = stackOut_244_0;
                      stackIn_246_1 = stackOut_244_1;
                      stackIn_246_2 = stackOut_244_2;
                      stackIn_245_0 = stackOut_244_0;
                      stackIn_245_1 = stackOut_244_1;
                      stackIn_245_2 = stackOut_244_2;
                      if (this.field_A) {
                        stackOut_246_0 = (vo) ((Object) stackIn_246_0);
                        stackOut_246_1 = stackIn_246_1;
                        stackOut_246_2 = stackIn_246_2;
                        stackOut_246_3 = -this.field_G.field_p + this.field_p;
                        stackIn_247_0 = stackOut_246_0;
                        stackIn_247_1 = stackOut_246_1;
                        stackIn_247_2 = stackOut_246_2;
                        stackIn_247_3 = stackOut_246_3;
                        break L17;
                      } else {
                        stackOut_245_0 = (vo) ((Object) stackIn_245_0);
                        stackOut_245_1 = stackIn_245_1;
                        stackOut_245_2 = stackIn_245_2;
                        stackOut_245_3 = 0;
                        stackIn_247_0 = stackOut_245_0;
                        stackIn_247_1 = stackOut_245_1;
                        stackIn_247_2 = stackOut_245_2;
                        stackIn_247_3 = stackOut_245_3;
                        break L17;
                      }
                    }
                    ((vo) (Object) stackIn_247_0).a(stackIn_247_1, stackIn_247_2, stackIn_247_3, this.field_G.field_p, this.field_D.field_q);
                    break L16;
                  }
                }
                this.g(1);
                return;
              }
            } else {
              var2 = 0;
              if (!this.field_A) {
                if (null == this.field_G) {
                  L18: {
                    var3 = 0;
                    if (this.field_B != null) {
                      stackOut_211_0 = -this.field_B.field_q + this.field_q;
                      stackIn_212_0 = stackOut_211_0;
                      break L18;
                    } else {
                      stackOut_210_0 = this.field_q;
                      stackIn_212_0 = stackOut_210_0;
                      break L18;
                    }
                  }
                  L19: {
                    var4 = stackIn_212_0;
                    if (null == this.field_G) {
                      stackOut_214_0 = this.field_p;
                      stackIn_215_0 = stackOut_214_0;
                      break L19;
                    } else {
                      stackOut_213_0 = -this.field_G.field_p + this.field_p;
                      stackIn_215_0 = stackOut_213_0;
                      break L19;
                    }
                  }
                  L20: {
                    var5 = stackIn_215_0;
                    this.field_D.a(-123, var2, var3, var5, var4);
                    if (this.field_B != null) {
                      L21: {
                        stackOut_217_0 = this.field_B;
                        stackOut_217_1 = -119;
                        stackIn_219_0 = stackOut_217_0;
                        stackIn_219_1 = stackOut_217_1;
                        stackIn_218_0 = stackOut_217_0;
                        stackIn_218_1 = stackOut_217_1;
                        if (!this.field_H) {
                          stackOut_219_0 = (vo) ((Object) stackIn_219_0);
                          stackOut_219_1 = stackIn_219_1;
                          stackOut_219_2 = 0;
                          stackIn_220_0 = stackOut_219_0;
                          stackIn_220_1 = stackOut_219_1;
                          stackIn_220_2 = stackOut_219_2;
                          break L21;
                        } else {
                          stackOut_218_0 = (vo) ((Object) stackIn_218_0);
                          stackOut_218_1 = stackIn_218_1;
                          stackOut_218_2 = this.field_q + -this.field_B.field_q;
                          stackIn_220_0 = stackOut_218_0;
                          stackIn_220_1 = stackOut_218_1;
                          stackIn_220_2 = stackOut_218_2;
                          break L21;
                        }
                      }
                      ((vo) (Object) stackIn_220_0).a(stackIn_220_1, stackIn_220_2, this.field_D.field_v, this.field_D.field_p, this.field_B.field_q);
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  L22: {
                    if (this.field_G == null) {
                      break L22;
                    } else {
                      L23: {
                        stackOut_222_0 = this.field_G;
                        stackOut_222_1 = 91;
                        stackOut_222_2 = this.field_D.field_r;
                        stackIn_224_0 = stackOut_222_0;
                        stackIn_224_1 = stackOut_222_1;
                        stackIn_224_2 = stackOut_222_2;
                        stackIn_223_0 = stackOut_222_0;
                        stackIn_223_1 = stackOut_222_1;
                        stackIn_223_2 = stackOut_222_2;
                        if (this.field_A) {
                          stackOut_224_0 = (vo) ((Object) stackIn_224_0);
                          stackOut_224_1 = stackIn_224_1;
                          stackOut_224_2 = stackIn_224_2;
                          stackOut_224_3 = -this.field_G.field_p + this.field_p;
                          stackIn_225_0 = stackOut_224_0;
                          stackIn_225_1 = stackOut_224_1;
                          stackIn_225_2 = stackOut_224_2;
                          stackIn_225_3 = stackOut_224_3;
                          break L23;
                        } else {
                          stackOut_223_0 = (vo) ((Object) stackIn_223_0);
                          stackOut_223_1 = stackIn_223_1;
                          stackOut_223_2 = stackIn_223_2;
                          stackOut_223_3 = 0;
                          stackIn_225_0 = stackOut_223_0;
                          stackIn_225_1 = stackOut_223_1;
                          stackIn_225_2 = stackOut_223_2;
                          stackIn_225_3 = stackOut_223_3;
                          break L23;
                        }
                      }
                      ((vo) (Object) stackIn_225_0).a(stackIn_225_1, stackIn_225_2, stackIn_225_3, this.field_G.field_p, this.field_D.field_q);
                      break L22;
                    }
                  }
                  this.g(1);
                  return;
                } else {
                  L24: {
                    var3 = this.field_G.field_p;
                    if (this.field_B != null) {
                      stackOut_193_0 = -this.field_B.field_q + this.field_q;
                      stackIn_194_0 = stackOut_193_0;
                      break L24;
                    } else {
                      stackOut_192_0 = this.field_q;
                      stackIn_194_0 = stackOut_192_0;
                      break L24;
                    }
                  }
                  L25: {
                    var4 = stackIn_194_0;
                    if (null == this.field_G) {
                      stackOut_196_0 = this.field_p;
                      stackIn_197_0 = stackOut_196_0;
                      break L25;
                    } else {
                      stackOut_195_0 = -this.field_G.field_p + this.field_p;
                      stackIn_197_0 = stackOut_195_0;
                      break L25;
                    }
                  }
                  L26: {
                    var5 = stackIn_197_0;
                    this.field_D.a(-123, var2, var3, var5, var4);
                    if (this.field_B != null) {
                      L27: {
                        stackOut_199_0 = this.field_B;
                        stackOut_199_1 = -119;
                        stackIn_201_0 = stackOut_199_0;
                        stackIn_201_1 = stackOut_199_1;
                        stackIn_200_0 = stackOut_199_0;
                        stackIn_200_1 = stackOut_199_1;
                        if (!this.field_H) {
                          stackOut_201_0 = (vo) ((Object) stackIn_201_0);
                          stackOut_201_1 = stackIn_201_1;
                          stackOut_201_2 = 0;
                          stackIn_202_0 = stackOut_201_0;
                          stackIn_202_1 = stackOut_201_1;
                          stackIn_202_2 = stackOut_201_2;
                          break L27;
                        } else {
                          stackOut_200_0 = (vo) ((Object) stackIn_200_0);
                          stackOut_200_1 = stackIn_200_1;
                          stackOut_200_2 = this.field_q + -this.field_B.field_q;
                          stackIn_202_0 = stackOut_200_0;
                          stackIn_202_1 = stackOut_200_1;
                          stackIn_202_2 = stackOut_200_2;
                          break L27;
                        }
                      }
                      ((vo) (Object) stackIn_202_0).a(stackIn_202_1, stackIn_202_2, this.field_D.field_v, this.field_D.field_p, this.field_B.field_q);
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                  L28: {
                    if (this.field_G == null) {
                      break L28;
                    } else {
                      L29: {
                        stackOut_204_0 = this.field_G;
                        stackOut_204_1 = 91;
                        stackOut_204_2 = this.field_D.field_r;
                        stackIn_206_0 = stackOut_204_0;
                        stackIn_206_1 = stackOut_204_1;
                        stackIn_206_2 = stackOut_204_2;
                        stackIn_205_0 = stackOut_204_0;
                        stackIn_205_1 = stackOut_204_1;
                        stackIn_205_2 = stackOut_204_2;
                        if (this.field_A) {
                          stackOut_206_0 = (vo) ((Object) stackIn_206_0);
                          stackOut_206_1 = stackIn_206_1;
                          stackOut_206_2 = stackIn_206_2;
                          stackOut_206_3 = -this.field_G.field_p + this.field_p;
                          stackIn_207_0 = stackOut_206_0;
                          stackIn_207_1 = stackOut_206_1;
                          stackIn_207_2 = stackOut_206_2;
                          stackIn_207_3 = stackOut_206_3;
                          break L29;
                        } else {
                          stackOut_205_0 = (vo) ((Object) stackIn_205_0);
                          stackOut_205_1 = stackIn_205_1;
                          stackOut_205_2 = stackIn_205_2;
                          stackOut_205_3 = 0;
                          stackIn_207_0 = stackOut_205_0;
                          stackIn_207_1 = stackOut_205_1;
                          stackIn_207_2 = stackOut_205_2;
                          stackIn_207_3 = stackOut_205_3;
                          break L29;
                        }
                      }
                      ((vo) (Object) stackIn_207_0).a(stackIn_207_1, stackIn_207_2, stackIn_207_3, this.field_G.field_p, this.field_D.field_q);
                      break L28;
                    }
                  }
                  this.g(1);
                  return;
                }
              } else {
                stackOut_170_0 = 0;
                stackIn_172_0 = stackOut_170_0;
                L30: {
                  var3 = stackIn_172_0;
                  if (this.field_B != null) {
                    stackOut_174_0 = -this.field_B.field_q + this.field_q;
                    stackIn_175_0 = stackOut_174_0;
                    break L30;
                  } else {
                    stackOut_173_0 = this.field_q;
                    stackIn_175_0 = stackOut_173_0;
                    break L30;
                  }
                }
                L31: {
                  var4 = stackIn_175_0;
                  if (null == this.field_G) {
                    stackOut_177_0 = this.field_p;
                    stackIn_178_0 = stackOut_177_0;
                    break L31;
                  } else {
                    stackOut_176_0 = -this.field_G.field_p + this.field_p;
                    stackIn_178_0 = stackOut_176_0;
                    break L31;
                  }
                }
                L32: {
                  var5 = stackIn_178_0;
                  this.field_D.a(-123, var2, var3, var5, var4);
                  if (this.field_B != null) {
                    L33: {
                      stackOut_180_0 = this.field_B;
                      stackOut_180_1 = -119;
                      stackIn_182_0 = stackOut_180_0;
                      stackIn_182_1 = stackOut_180_1;
                      stackIn_181_0 = stackOut_180_0;
                      stackIn_181_1 = stackOut_180_1;
                      if (!this.field_H) {
                        stackOut_182_0 = (vo) ((Object) stackIn_182_0);
                        stackOut_182_1 = stackIn_182_1;
                        stackOut_182_2 = 0;
                        stackIn_183_0 = stackOut_182_0;
                        stackIn_183_1 = stackOut_182_1;
                        stackIn_183_2 = stackOut_182_2;
                        break L33;
                      } else {
                        stackOut_181_0 = (vo) ((Object) stackIn_181_0);
                        stackOut_181_1 = stackIn_181_1;
                        stackOut_181_2 = this.field_q + -this.field_B.field_q;
                        stackIn_183_0 = stackOut_181_0;
                        stackIn_183_1 = stackOut_181_1;
                        stackIn_183_2 = stackOut_181_2;
                        break L33;
                      }
                    }
                    ((vo) (Object) stackIn_183_0).a(stackIn_183_1, stackIn_183_2, this.field_D.field_v, this.field_D.field_p, this.field_B.field_q);
                    break L32;
                  } else {
                    break L32;
                  }
                }
                L34: {
                  if (this.field_G == null) {
                    break L34;
                  } else {
                    L35: {
                      stackOut_185_0 = this.field_G;
                      stackOut_185_1 = 91;
                      stackOut_185_2 = this.field_D.field_r;
                      stackIn_187_0 = stackOut_185_0;
                      stackIn_187_1 = stackOut_185_1;
                      stackIn_187_2 = stackOut_185_2;
                      stackIn_186_0 = stackOut_185_0;
                      stackIn_186_1 = stackOut_185_1;
                      stackIn_186_2 = stackOut_185_2;
                      if (this.field_A) {
                        stackOut_187_0 = (vo) ((Object) stackIn_187_0);
                        stackOut_187_1 = stackIn_187_1;
                        stackOut_187_2 = stackIn_187_2;
                        stackOut_187_3 = -this.field_G.field_p + this.field_p;
                        stackIn_188_0 = stackOut_187_0;
                        stackIn_188_1 = stackOut_187_1;
                        stackIn_188_2 = stackOut_187_2;
                        stackIn_188_3 = stackOut_187_3;
                        break L35;
                      } else {
                        stackOut_186_0 = (vo) ((Object) stackIn_186_0);
                        stackOut_186_1 = stackIn_186_1;
                        stackOut_186_2 = stackIn_186_2;
                        stackOut_186_3 = 0;
                        stackIn_188_0 = stackOut_186_0;
                        stackIn_188_1 = stackOut_186_1;
                        stackIn_188_2 = stackOut_186_2;
                        stackIn_188_3 = stackOut_186_3;
                        break L35;
                      }
                    }
                    ((vo) (Object) stackIn_188_0).a(stackIn_188_1, stackIn_188_2, stackIn_188_3, this.field_G.field_p, this.field_D.field_q);
                    break L34;
                  }
                }
                this.g(1);
                return;
              }
            }
          } else {
            var2 = 0;
            if (!this.field_A) {
              if (null == this.field_G) {
                L36: {
                  var3 = 0;
                  if (this.field_B != null) {
                    stackOut_151_0 = -this.field_B.field_q + this.field_q;
                    stackIn_152_0 = stackOut_151_0;
                    break L36;
                  } else {
                    stackOut_150_0 = this.field_q;
                    stackIn_152_0 = stackOut_150_0;
                    break L36;
                  }
                }
                L37: {
                  var4 = stackIn_152_0;
                  if (null == this.field_G) {
                    stackOut_154_0 = this.field_p;
                    stackIn_155_0 = stackOut_154_0;
                    break L37;
                  } else {
                    stackOut_153_0 = -this.field_G.field_p + this.field_p;
                    stackIn_155_0 = stackOut_153_0;
                    break L37;
                  }
                }
                L38: {
                  var5 = stackIn_155_0;
                  this.field_D.a(-123, var2, var3, var5, var4);
                  if (this.field_B != null) {
                    L39: {
                      stackOut_157_0 = this.field_B;
                      stackOut_157_1 = -119;
                      stackIn_159_0 = stackOut_157_0;
                      stackIn_159_1 = stackOut_157_1;
                      stackIn_158_0 = stackOut_157_0;
                      stackIn_158_1 = stackOut_157_1;
                      if (!this.field_H) {
                        stackOut_159_0 = (vo) ((Object) stackIn_159_0);
                        stackOut_159_1 = stackIn_159_1;
                        stackOut_159_2 = 0;
                        stackIn_160_0 = stackOut_159_0;
                        stackIn_160_1 = stackOut_159_1;
                        stackIn_160_2 = stackOut_159_2;
                        break L39;
                      } else {
                        stackOut_158_0 = (vo) ((Object) stackIn_158_0);
                        stackOut_158_1 = stackIn_158_1;
                        stackOut_158_2 = this.field_q + -this.field_B.field_q;
                        stackIn_160_0 = stackOut_158_0;
                        stackIn_160_1 = stackOut_158_1;
                        stackIn_160_2 = stackOut_158_2;
                        break L39;
                      }
                    }
                    ((vo) (Object) stackIn_160_0).a(stackIn_160_1, stackIn_160_2, this.field_D.field_v, this.field_D.field_p, this.field_B.field_q);
                    break L38;
                  } else {
                    break L38;
                  }
                }
                L40: {
                  if (this.field_G == null) {
                    break L40;
                  } else {
                    L41: {
                      stackOut_162_0 = this.field_G;
                      stackOut_162_1 = 91;
                      stackOut_162_2 = this.field_D.field_r;
                      stackIn_164_0 = stackOut_162_0;
                      stackIn_164_1 = stackOut_162_1;
                      stackIn_164_2 = stackOut_162_2;
                      stackIn_163_0 = stackOut_162_0;
                      stackIn_163_1 = stackOut_162_1;
                      stackIn_163_2 = stackOut_162_2;
                      if (this.field_A) {
                        stackOut_164_0 = (vo) ((Object) stackIn_164_0);
                        stackOut_164_1 = stackIn_164_1;
                        stackOut_164_2 = stackIn_164_2;
                        stackOut_164_3 = -this.field_G.field_p + this.field_p;
                        stackIn_165_0 = stackOut_164_0;
                        stackIn_165_1 = stackOut_164_1;
                        stackIn_165_2 = stackOut_164_2;
                        stackIn_165_3 = stackOut_164_3;
                        break L41;
                      } else {
                        stackOut_163_0 = (vo) ((Object) stackIn_163_0);
                        stackOut_163_1 = stackIn_163_1;
                        stackOut_163_2 = stackIn_163_2;
                        stackOut_163_3 = 0;
                        stackIn_165_0 = stackOut_163_0;
                        stackIn_165_1 = stackOut_163_1;
                        stackIn_165_2 = stackOut_163_2;
                        stackIn_165_3 = stackOut_163_3;
                        break L41;
                      }
                    }
                    ((vo) (Object) stackIn_165_0).a(stackIn_165_1, stackIn_165_2, stackIn_165_3, this.field_G.field_p, this.field_D.field_q);
                    break L40;
                  }
                }
                this.g(1);
                return;
              } else {
                L42: {
                  var3 = this.field_G.field_p;
                  if (this.field_B != null) {
                    stackOut_133_0 = -this.field_B.field_q + this.field_q;
                    stackIn_134_0 = stackOut_133_0;
                    break L42;
                  } else {
                    stackOut_132_0 = this.field_q;
                    stackIn_134_0 = stackOut_132_0;
                    break L42;
                  }
                }
                L43: {
                  var4 = stackIn_134_0;
                  if (null == this.field_G) {
                    stackOut_136_0 = this.field_p;
                    stackIn_137_0 = stackOut_136_0;
                    break L43;
                  } else {
                    stackOut_135_0 = -this.field_G.field_p + this.field_p;
                    stackIn_137_0 = stackOut_135_0;
                    break L43;
                  }
                }
                L44: {
                  var5 = stackIn_137_0;
                  this.field_D.a(-123, var2, var3, var5, var4);
                  if (this.field_B != null) {
                    L45: {
                      stackOut_139_0 = this.field_B;
                      stackOut_139_1 = -119;
                      stackIn_141_0 = stackOut_139_0;
                      stackIn_141_1 = stackOut_139_1;
                      stackIn_140_0 = stackOut_139_0;
                      stackIn_140_1 = stackOut_139_1;
                      if (!this.field_H) {
                        stackOut_141_0 = (vo) ((Object) stackIn_141_0);
                        stackOut_141_1 = stackIn_141_1;
                        stackOut_141_2 = 0;
                        stackIn_142_0 = stackOut_141_0;
                        stackIn_142_1 = stackOut_141_1;
                        stackIn_142_2 = stackOut_141_2;
                        break L45;
                      } else {
                        stackOut_140_0 = (vo) ((Object) stackIn_140_0);
                        stackOut_140_1 = stackIn_140_1;
                        stackOut_140_2 = this.field_q + -this.field_B.field_q;
                        stackIn_142_0 = stackOut_140_0;
                        stackIn_142_1 = stackOut_140_1;
                        stackIn_142_2 = stackOut_140_2;
                        break L45;
                      }
                    }
                    ((vo) (Object) stackIn_142_0).a(stackIn_142_1, stackIn_142_2, this.field_D.field_v, this.field_D.field_p, this.field_B.field_q);
                    break L44;
                  } else {
                    break L44;
                  }
                }
                L46: {
                  if (this.field_G == null) {
                    break L46;
                  } else {
                    L47: {
                      stackOut_144_0 = this.field_G;
                      stackOut_144_1 = 91;
                      stackOut_144_2 = this.field_D.field_r;
                      stackIn_146_0 = stackOut_144_0;
                      stackIn_146_1 = stackOut_144_1;
                      stackIn_146_2 = stackOut_144_2;
                      stackIn_145_0 = stackOut_144_0;
                      stackIn_145_1 = stackOut_144_1;
                      stackIn_145_2 = stackOut_144_2;
                      if (this.field_A) {
                        stackOut_146_0 = (vo) ((Object) stackIn_146_0);
                        stackOut_146_1 = stackIn_146_1;
                        stackOut_146_2 = stackIn_146_2;
                        stackOut_146_3 = -this.field_G.field_p + this.field_p;
                        stackIn_147_0 = stackOut_146_0;
                        stackIn_147_1 = stackOut_146_1;
                        stackIn_147_2 = stackOut_146_2;
                        stackIn_147_3 = stackOut_146_3;
                        break L47;
                      } else {
                        stackOut_145_0 = (vo) ((Object) stackIn_145_0);
                        stackOut_145_1 = stackIn_145_1;
                        stackOut_145_2 = stackIn_145_2;
                        stackOut_145_3 = 0;
                        stackIn_147_0 = stackOut_145_0;
                        stackIn_147_1 = stackOut_145_1;
                        stackIn_147_2 = stackOut_145_2;
                        stackIn_147_3 = stackOut_145_3;
                        break L47;
                      }
                    }
                    ((vo) (Object) stackIn_147_0).a(stackIn_147_1, stackIn_147_2, stackIn_147_3, this.field_G.field_p, this.field_D.field_q);
                    break L46;
                  }
                }
                this.g(1);
                return;
              }
            } else {
              stackOut_110_0 = 0;
              stackIn_112_0 = stackOut_110_0;
              L48: {
                var3 = stackIn_112_0;
                if (this.field_B != null) {
                  stackOut_114_0 = -this.field_B.field_q + this.field_q;
                  stackIn_115_0 = stackOut_114_0;
                  break L48;
                } else {
                  stackOut_113_0 = this.field_q;
                  stackIn_115_0 = stackOut_113_0;
                  break L48;
                }
              }
              L49: {
                var4 = stackIn_115_0;
                if (null == this.field_G) {
                  stackOut_117_0 = this.field_p;
                  stackIn_118_0 = stackOut_117_0;
                  break L49;
                } else {
                  stackOut_116_0 = -this.field_G.field_p + this.field_p;
                  stackIn_118_0 = stackOut_116_0;
                  break L49;
                }
              }
              L50: {
                var5 = stackIn_118_0;
                this.field_D.a(-123, var2, var3, var5, var4);
                if (this.field_B != null) {
                  L51: {
                    stackOut_120_0 = this.field_B;
                    stackOut_120_1 = -119;
                    stackIn_122_0 = stackOut_120_0;
                    stackIn_122_1 = stackOut_120_1;
                    stackIn_121_0 = stackOut_120_0;
                    stackIn_121_1 = stackOut_120_1;
                    if (!this.field_H) {
                      stackOut_122_0 = (vo) ((Object) stackIn_122_0);
                      stackOut_122_1 = stackIn_122_1;
                      stackOut_122_2 = 0;
                      stackIn_123_0 = stackOut_122_0;
                      stackIn_123_1 = stackOut_122_1;
                      stackIn_123_2 = stackOut_122_2;
                      break L51;
                    } else {
                      stackOut_121_0 = (vo) ((Object) stackIn_121_0);
                      stackOut_121_1 = stackIn_121_1;
                      stackOut_121_2 = this.field_q + -this.field_B.field_q;
                      stackIn_123_0 = stackOut_121_0;
                      stackIn_123_1 = stackOut_121_1;
                      stackIn_123_2 = stackOut_121_2;
                      break L51;
                    }
                  }
                  ((vo) (Object) stackIn_123_0).a(stackIn_123_1, stackIn_123_2, this.field_D.field_v, this.field_D.field_p, this.field_B.field_q);
                  break L50;
                } else {
                  break L50;
                }
              }
              L52: {
                if (this.field_G == null) {
                  break L52;
                } else {
                  L53: {
                    stackOut_125_0 = this.field_G;
                    stackOut_125_1 = 91;
                    stackOut_125_2 = this.field_D.field_r;
                    stackIn_127_0 = stackOut_125_0;
                    stackIn_127_1 = stackOut_125_1;
                    stackIn_127_2 = stackOut_125_2;
                    stackIn_126_0 = stackOut_125_0;
                    stackIn_126_1 = stackOut_125_1;
                    stackIn_126_2 = stackOut_125_2;
                    if (this.field_A) {
                      stackOut_127_0 = (vo) ((Object) stackIn_127_0);
                      stackOut_127_1 = stackIn_127_1;
                      stackOut_127_2 = stackIn_127_2;
                      stackOut_127_3 = -this.field_G.field_p + this.field_p;
                      stackIn_128_0 = stackOut_127_0;
                      stackIn_128_1 = stackOut_127_1;
                      stackIn_128_2 = stackOut_127_2;
                      stackIn_128_3 = stackOut_127_3;
                      break L53;
                    } else {
                      stackOut_126_0 = (vo) ((Object) stackIn_126_0);
                      stackOut_126_1 = stackIn_126_1;
                      stackOut_126_2 = stackIn_126_2;
                      stackOut_126_3 = 0;
                      stackIn_128_0 = stackOut_126_0;
                      stackIn_128_1 = stackOut_126_1;
                      stackIn_128_2 = stackOut_126_2;
                      stackIn_128_3 = stackOut_126_3;
                      break L53;
                    }
                  }
                  ((vo) (Object) stackIn_128_0).a(stackIn_128_1, stackIn_128_2, stackIn_128_3, this.field_G.field_p, this.field_D.field_q);
                  break L52;
                }
              }
              this.g(1);
              return;
            }
          }
        } else {
          field_J = (String) null;
          if (!this.field_H) {
            if (this.field_B != null) {
              var2 = this.field_B.field_q;
              if (!this.field_A) {
                if (null == this.field_G) {
                  L54: {
                    var3 = 0;
                    if (this.field_B != null) {
                      stackOut_91_0 = -this.field_B.field_q + this.field_q;
                      stackIn_92_0 = stackOut_91_0;
                      break L54;
                    } else {
                      stackOut_90_0 = this.field_q;
                      stackIn_92_0 = stackOut_90_0;
                      break L54;
                    }
                  }
                  L55: {
                    var4 = stackIn_92_0;
                    if (null == this.field_G) {
                      stackOut_94_0 = this.field_p;
                      stackIn_95_0 = stackOut_94_0;
                      break L55;
                    } else {
                      stackOut_93_0 = -this.field_G.field_p + this.field_p;
                      stackIn_95_0 = stackOut_93_0;
                      break L55;
                    }
                  }
                  L56: {
                    var5 = stackIn_95_0;
                    this.field_D.a(-123, var2, var3, var5, var4);
                    if (this.field_B != null) {
                      L57: {
                        stackOut_97_0 = this.field_B;
                        stackOut_97_1 = -119;
                        stackIn_99_0 = stackOut_97_0;
                        stackIn_99_1 = stackOut_97_1;
                        stackIn_98_0 = stackOut_97_0;
                        stackIn_98_1 = stackOut_97_1;
                        if (!this.field_H) {
                          stackOut_99_0 = (vo) ((Object) stackIn_99_0);
                          stackOut_99_1 = stackIn_99_1;
                          stackOut_99_2 = 0;
                          stackIn_100_0 = stackOut_99_0;
                          stackIn_100_1 = stackOut_99_1;
                          stackIn_100_2 = stackOut_99_2;
                          break L57;
                        } else {
                          stackOut_98_0 = (vo) ((Object) stackIn_98_0);
                          stackOut_98_1 = stackIn_98_1;
                          stackOut_98_2 = this.field_q + -this.field_B.field_q;
                          stackIn_100_0 = stackOut_98_0;
                          stackIn_100_1 = stackOut_98_1;
                          stackIn_100_2 = stackOut_98_2;
                          break L57;
                        }
                      }
                      ((vo) (Object) stackIn_100_0).a(stackIn_100_1, stackIn_100_2, this.field_D.field_v, this.field_D.field_p, this.field_B.field_q);
                      break L56;
                    } else {
                      break L56;
                    }
                  }
                  L58: {
                    if (this.field_G == null) {
                      break L58;
                    } else {
                      L59: {
                        stackOut_102_0 = this.field_G;
                        stackOut_102_1 = 91;
                        stackOut_102_2 = this.field_D.field_r;
                        stackIn_104_0 = stackOut_102_0;
                        stackIn_104_1 = stackOut_102_1;
                        stackIn_104_2 = stackOut_102_2;
                        stackIn_103_0 = stackOut_102_0;
                        stackIn_103_1 = stackOut_102_1;
                        stackIn_103_2 = stackOut_102_2;
                        if (this.field_A) {
                          stackOut_104_0 = (vo) ((Object) stackIn_104_0);
                          stackOut_104_1 = stackIn_104_1;
                          stackOut_104_2 = stackIn_104_2;
                          stackOut_104_3 = -this.field_G.field_p + this.field_p;
                          stackIn_105_0 = stackOut_104_0;
                          stackIn_105_1 = stackOut_104_1;
                          stackIn_105_2 = stackOut_104_2;
                          stackIn_105_3 = stackOut_104_3;
                          break L59;
                        } else {
                          stackOut_103_0 = (vo) ((Object) stackIn_103_0);
                          stackOut_103_1 = stackIn_103_1;
                          stackOut_103_2 = stackIn_103_2;
                          stackOut_103_3 = 0;
                          stackIn_105_0 = stackOut_103_0;
                          stackIn_105_1 = stackOut_103_1;
                          stackIn_105_2 = stackOut_103_2;
                          stackIn_105_3 = stackOut_103_3;
                          break L59;
                        }
                      }
                      ((vo) (Object) stackIn_105_0).a(stackIn_105_1, stackIn_105_2, stackIn_105_3, this.field_G.field_p, this.field_D.field_q);
                      break L58;
                    }
                  }
                  this.g(1);
                  return;
                } else {
                  L60: {
                    var3 = this.field_G.field_p;
                    if (this.field_B != null) {
                      stackOut_73_0 = -this.field_B.field_q + this.field_q;
                      stackIn_74_0 = stackOut_73_0;
                      break L60;
                    } else {
                      stackOut_72_0 = this.field_q;
                      stackIn_74_0 = stackOut_72_0;
                      break L60;
                    }
                  }
                  L61: {
                    var4 = stackIn_74_0;
                    if (null == this.field_G) {
                      stackOut_76_0 = this.field_p;
                      stackIn_77_0 = stackOut_76_0;
                      break L61;
                    } else {
                      stackOut_75_0 = -this.field_G.field_p + this.field_p;
                      stackIn_77_0 = stackOut_75_0;
                      break L61;
                    }
                  }
                  L62: {
                    var5 = stackIn_77_0;
                    this.field_D.a(-123, var2, var3, var5, var4);
                    if (this.field_B != null) {
                      L63: {
                        stackOut_79_0 = this.field_B;
                        stackOut_79_1 = -119;
                        stackIn_81_0 = stackOut_79_0;
                        stackIn_81_1 = stackOut_79_1;
                        stackIn_80_0 = stackOut_79_0;
                        stackIn_80_1 = stackOut_79_1;
                        if (!this.field_H) {
                          stackOut_81_0 = (vo) ((Object) stackIn_81_0);
                          stackOut_81_1 = stackIn_81_1;
                          stackOut_81_2 = 0;
                          stackIn_82_0 = stackOut_81_0;
                          stackIn_82_1 = stackOut_81_1;
                          stackIn_82_2 = stackOut_81_2;
                          break L63;
                        } else {
                          stackOut_80_0 = (vo) ((Object) stackIn_80_0);
                          stackOut_80_1 = stackIn_80_1;
                          stackOut_80_2 = this.field_q + -this.field_B.field_q;
                          stackIn_82_0 = stackOut_80_0;
                          stackIn_82_1 = stackOut_80_1;
                          stackIn_82_2 = stackOut_80_2;
                          break L63;
                        }
                      }
                      ((vo) (Object) stackIn_82_0).a(stackIn_82_1, stackIn_82_2, this.field_D.field_v, this.field_D.field_p, this.field_B.field_q);
                      break L62;
                    } else {
                      break L62;
                    }
                  }
                  L64: {
                    if (this.field_G == null) {
                      break L64;
                    } else {
                      L65: {
                        stackOut_84_0 = this.field_G;
                        stackOut_84_1 = 91;
                        stackOut_84_2 = this.field_D.field_r;
                        stackIn_86_0 = stackOut_84_0;
                        stackIn_86_1 = stackOut_84_1;
                        stackIn_86_2 = stackOut_84_2;
                        stackIn_85_0 = stackOut_84_0;
                        stackIn_85_1 = stackOut_84_1;
                        stackIn_85_2 = stackOut_84_2;
                        if (this.field_A) {
                          stackOut_86_0 = (vo) ((Object) stackIn_86_0);
                          stackOut_86_1 = stackIn_86_1;
                          stackOut_86_2 = stackIn_86_2;
                          stackOut_86_3 = -this.field_G.field_p + this.field_p;
                          stackIn_87_0 = stackOut_86_0;
                          stackIn_87_1 = stackOut_86_1;
                          stackIn_87_2 = stackOut_86_2;
                          stackIn_87_3 = stackOut_86_3;
                          break L65;
                        } else {
                          stackOut_85_0 = (vo) ((Object) stackIn_85_0);
                          stackOut_85_1 = stackIn_85_1;
                          stackOut_85_2 = stackIn_85_2;
                          stackOut_85_3 = 0;
                          stackIn_87_0 = stackOut_85_0;
                          stackIn_87_1 = stackOut_85_1;
                          stackIn_87_2 = stackOut_85_2;
                          stackIn_87_3 = stackOut_85_3;
                          break L65;
                        }
                      }
                      ((vo) (Object) stackIn_87_0).a(stackIn_87_1, stackIn_87_2, stackIn_87_3, this.field_G.field_p, this.field_D.field_q);
                      break L64;
                    }
                  }
                  this.g(1);
                  return;
                }
              } else {
                stackOut_50_0 = 0;
                stackIn_52_0 = stackOut_50_0;
                L66: {
                  var3 = stackIn_52_0;
                  if (this.field_B != null) {
                    stackOut_54_0 = -this.field_B.field_q + this.field_q;
                    stackIn_55_0 = stackOut_54_0;
                    break L66;
                  } else {
                    stackOut_53_0 = this.field_q;
                    stackIn_55_0 = stackOut_53_0;
                    break L66;
                  }
                }
                L67: {
                  var4 = stackIn_55_0;
                  if (null == this.field_G) {
                    stackOut_57_0 = this.field_p;
                    stackIn_58_0 = stackOut_57_0;
                    break L67;
                  } else {
                    stackOut_56_0 = -this.field_G.field_p + this.field_p;
                    stackIn_58_0 = stackOut_56_0;
                    break L67;
                  }
                }
                L68: {
                  var5 = stackIn_58_0;
                  this.field_D.a(-123, var2, var3, var5, var4);
                  if (this.field_B != null) {
                    L69: {
                      stackOut_60_0 = this.field_B;
                      stackOut_60_1 = -119;
                      stackIn_62_0 = stackOut_60_0;
                      stackIn_62_1 = stackOut_60_1;
                      stackIn_61_0 = stackOut_60_0;
                      stackIn_61_1 = stackOut_60_1;
                      if (!this.field_H) {
                        stackOut_62_0 = (vo) ((Object) stackIn_62_0);
                        stackOut_62_1 = stackIn_62_1;
                        stackOut_62_2 = 0;
                        stackIn_63_0 = stackOut_62_0;
                        stackIn_63_1 = stackOut_62_1;
                        stackIn_63_2 = stackOut_62_2;
                        break L69;
                      } else {
                        stackOut_61_0 = (vo) ((Object) stackIn_61_0);
                        stackOut_61_1 = stackIn_61_1;
                        stackOut_61_2 = this.field_q + -this.field_B.field_q;
                        stackIn_63_0 = stackOut_61_0;
                        stackIn_63_1 = stackOut_61_1;
                        stackIn_63_2 = stackOut_61_2;
                        break L69;
                      }
                    }
                    ((vo) (Object) stackIn_63_0).a(stackIn_63_1, stackIn_63_2, this.field_D.field_v, this.field_D.field_p, this.field_B.field_q);
                    break L68;
                  } else {
                    break L68;
                  }
                }
                L70: {
                  if (this.field_G == null) {
                    break L70;
                  } else {
                    L71: {
                      stackOut_65_0 = this.field_G;
                      stackOut_65_1 = 91;
                      stackOut_65_2 = this.field_D.field_r;
                      stackIn_67_0 = stackOut_65_0;
                      stackIn_67_1 = stackOut_65_1;
                      stackIn_67_2 = stackOut_65_2;
                      stackIn_66_0 = stackOut_65_0;
                      stackIn_66_1 = stackOut_65_1;
                      stackIn_66_2 = stackOut_65_2;
                      if (this.field_A) {
                        stackOut_67_0 = (vo) ((Object) stackIn_67_0);
                        stackOut_67_1 = stackIn_67_1;
                        stackOut_67_2 = stackIn_67_2;
                        stackOut_67_3 = -this.field_G.field_p + this.field_p;
                        stackIn_68_0 = stackOut_67_0;
                        stackIn_68_1 = stackOut_67_1;
                        stackIn_68_2 = stackOut_67_2;
                        stackIn_68_3 = stackOut_67_3;
                        break L71;
                      } else {
                        stackOut_66_0 = (vo) ((Object) stackIn_66_0);
                        stackOut_66_1 = stackIn_66_1;
                        stackOut_66_2 = stackIn_66_2;
                        stackOut_66_3 = 0;
                        stackIn_68_0 = stackOut_66_0;
                        stackIn_68_1 = stackOut_66_1;
                        stackIn_68_2 = stackOut_66_2;
                        stackIn_68_3 = stackOut_66_3;
                        break L71;
                      }
                    }
                    ((vo) (Object) stackIn_68_0).a(stackIn_68_1, stackIn_68_2, stackIn_68_3, this.field_G.field_p, this.field_D.field_q);
                    break L70;
                  }
                }
                this.g(1);
                return;
              }
            } else {
              L72: {
                L73: {
                  var2 = 0;
                  if (this.field_A) {
                    break L73;
                  } else {
                    if (null != this.field_G) {
                      stackOut_30_0 = this.field_G.field_p;
                      stackIn_31_0 = stackOut_30_0;
                      break L72;
                    } else {
                      break L73;
                    }
                  }
                }
                stackOut_29_0 = 0;
                stackIn_31_0 = stackOut_29_0;
                break L72;
              }
              L74: {
                var3 = stackIn_31_0;
                if (this.field_B != null) {
                  stackOut_33_0 = -this.field_B.field_q + this.field_q;
                  stackIn_34_0 = stackOut_33_0;
                  break L74;
                } else {
                  stackOut_32_0 = this.field_q;
                  stackIn_34_0 = stackOut_32_0;
                  break L74;
                }
              }
              L75: {
                var4 = stackIn_34_0;
                if (null == this.field_G) {
                  stackOut_36_0 = this.field_p;
                  stackIn_37_0 = stackOut_36_0;
                  break L75;
                } else {
                  stackOut_35_0 = -this.field_G.field_p + this.field_p;
                  stackIn_37_0 = stackOut_35_0;
                  break L75;
                }
              }
              L76: {
                var5 = stackIn_37_0;
                this.field_D.a(-123, var2, var3, var5, var4);
                if (this.field_B != null) {
                  L77: {
                    stackOut_39_0 = this.field_B;
                    stackOut_39_1 = -119;
                    stackIn_41_0 = stackOut_39_0;
                    stackIn_41_1 = stackOut_39_1;
                    stackIn_40_0 = stackOut_39_0;
                    stackIn_40_1 = stackOut_39_1;
                    if (!this.field_H) {
                      stackOut_41_0 = (vo) ((Object) stackIn_41_0);
                      stackOut_41_1 = stackIn_41_1;
                      stackOut_41_2 = 0;
                      stackIn_42_0 = stackOut_41_0;
                      stackIn_42_1 = stackOut_41_1;
                      stackIn_42_2 = stackOut_41_2;
                      break L77;
                    } else {
                      stackOut_40_0 = (vo) ((Object) stackIn_40_0);
                      stackOut_40_1 = stackIn_40_1;
                      stackOut_40_2 = this.field_q + -this.field_B.field_q;
                      stackIn_42_0 = stackOut_40_0;
                      stackIn_42_1 = stackOut_40_1;
                      stackIn_42_2 = stackOut_40_2;
                      break L77;
                    }
                  }
                  ((vo) (Object) stackIn_42_0).a(stackIn_42_1, stackIn_42_2, this.field_D.field_v, this.field_D.field_p, this.field_B.field_q);
                  break L76;
                } else {
                  break L76;
                }
              }
              L78: {
                if (this.field_G == null) {
                  break L78;
                } else {
                  L79: {
                    stackOut_44_0 = this.field_G;
                    stackOut_44_1 = 91;
                    stackOut_44_2 = this.field_D.field_r;
                    stackIn_46_0 = stackOut_44_0;
                    stackIn_46_1 = stackOut_44_1;
                    stackIn_46_2 = stackOut_44_2;
                    stackIn_45_0 = stackOut_44_0;
                    stackIn_45_1 = stackOut_44_1;
                    stackIn_45_2 = stackOut_44_2;
                    if (this.field_A) {
                      stackOut_46_0 = (vo) ((Object) stackIn_46_0);
                      stackOut_46_1 = stackIn_46_1;
                      stackOut_46_2 = stackIn_46_2;
                      stackOut_46_3 = -this.field_G.field_p + this.field_p;
                      stackIn_47_0 = stackOut_46_0;
                      stackIn_47_1 = stackOut_46_1;
                      stackIn_47_2 = stackOut_46_2;
                      stackIn_47_3 = stackOut_46_3;
                      break L79;
                    } else {
                      stackOut_45_0 = (vo) ((Object) stackIn_45_0);
                      stackOut_45_1 = stackIn_45_1;
                      stackOut_45_2 = stackIn_45_2;
                      stackOut_45_3 = 0;
                      stackIn_47_0 = stackOut_45_0;
                      stackIn_47_1 = stackOut_45_1;
                      stackIn_47_2 = stackOut_45_2;
                      stackIn_47_3 = stackOut_45_3;
                      break L79;
                    }
                  }
                  ((vo) (Object) stackIn_47_0).a(stackIn_47_1, stackIn_47_2, stackIn_47_3, this.field_G.field_p, this.field_D.field_q);
                  break L78;
                }
              }
              this.g(1);
              return;
            }
          } else {
            L80: {
              L81: {
                var2 = 0;
                if (this.field_A) {
                  break L81;
                } else {
                  if (null != this.field_G) {
                    stackOut_6_0 = this.field_G.field_p;
                    stackIn_7_0 = stackOut_6_0;
                    break L80;
                  } else {
                    break L81;
                  }
                }
              }
              stackOut_5_0 = 0;
              stackIn_7_0 = stackOut_5_0;
              break L80;
            }
            L82: {
              var3 = stackIn_7_0;
              if (this.field_B != null) {
                stackOut_9_0 = -this.field_B.field_q + this.field_q;
                stackIn_10_0 = stackOut_9_0;
                break L82;
              } else {
                stackOut_8_0 = this.field_q;
                stackIn_10_0 = stackOut_8_0;
                break L82;
              }
            }
            L83: {
              var4 = stackIn_10_0;
              if (null == this.field_G) {
                stackOut_12_0 = this.field_p;
                stackIn_13_0 = stackOut_12_0;
                break L83;
              } else {
                stackOut_11_0 = -this.field_G.field_p + this.field_p;
                stackIn_13_0 = stackOut_11_0;
                break L83;
              }
            }
            L84: {
              var5 = stackIn_13_0;
              this.field_D.a(-123, var2, var3, var5, var4);
              if (this.field_B != null) {
                L85: {
                  stackOut_15_0 = this.field_B;
                  stackOut_15_1 = -119;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  if (!this.field_H) {
                    stackOut_17_0 = (vo) ((Object) stackIn_17_0);
                    stackOut_17_1 = stackIn_17_1;
                    stackOut_17_2 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    stackIn_18_2 = stackOut_17_2;
                    break L85;
                  } else {
                    stackOut_16_0 = (vo) ((Object) stackIn_16_0);
                    stackOut_16_1 = stackIn_16_1;
                    stackOut_16_2 = this.field_q + -this.field_B.field_q;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    stackIn_18_2 = stackOut_16_2;
                    break L85;
                  }
                }
                ((vo) (Object) stackIn_18_0).a(stackIn_18_1, stackIn_18_2, this.field_D.field_v, this.field_D.field_p, this.field_B.field_q);
                break L84;
              } else {
                break L84;
              }
            }
            L86: {
              if (this.field_G == null) {
                break L86;
              } else {
                L87: {
                  stackOut_20_0 = this.field_G;
                  stackOut_20_1 = 91;
                  stackOut_20_2 = this.field_D.field_r;
                  stackIn_22_0 = stackOut_20_0;
                  stackIn_22_1 = stackOut_20_1;
                  stackIn_22_2 = stackOut_20_2;
                  stackIn_21_0 = stackOut_20_0;
                  stackIn_21_1 = stackOut_20_1;
                  stackIn_21_2 = stackOut_20_2;
                  if (this.field_A) {
                    stackOut_22_0 = (vo) ((Object) stackIn_22_0);
                    stackOut_22_1 = stackIn_22_1;
                    stackOut_22_2 = stackIn_22_2;
                    stackOut_22_3 = -this.field_G.field_p + this.field_p;
                    stackIn_23_0 = stackOut_22_0;
                    stackIn_23_1 = stackOut_22_1;
                    stackIn_23_2 = stackOut_22_2;
                    stackIn_23_3 = stackOut_22_3;
                    break L87;
                  } else {
                    stackOut_21_0 = (vo) ((Object) stackIn_21_0);
                    stackOut_21_1 = stackIn_21_1;
                    stackOut_21_2 = stackIn_21_2;
                    stackOut_21_3 = 0;
                    stackIn_23_0 = stackOut_21_0;
                    stackIn_23_1 = stackOut_21_1;
                    stackIn_23_2 = stackOut_21_2;
                    stackIn_23_3 = stackOut_21_3;
                    break L87;
                  }
                }
                ((vo) (Object) stackIn_23_0).a(stackIn_23_1, stackIn_23_2, stackIn_23_3, this.field_G.field_p, this.field_D.field_q);
                break L86;
              }
            }
            this.g(1);
            return;
          }
        }
    }

    static {
        field_J = "This password contains repeated characters, and would be easy to guess";
    }
}
