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
        pk var3;
        if (null == this.field_G) {
          if (this.field_B == null) {
            if (param0 != 1) {
              var3 = (pk) null;
              this.a((pk) null, 'g', (byte) -4, -28);
              return;
            } else {
              return;
            }
          } else {
            this.field_D.field_y.field_v = -(int)((long)(this.field_D.field_y.field_p + -this.field_D.field_p) * (long)this.field_B.field_D >> -869429872);
            if (param0 != 1) {
              var3 = (pk) null;
              this.a((pk) null, 'g', (byte) -4, -28);
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
              this.a((pk) null, 'g', (byte) -4, -28);
              return;
            }
          } else {
            if (param0 != 1) {
              var3 = (pk) null;
              this.a((pk) null, 'g', (byte) -4, -28);
              return;
            } else {
              return;
            }
          }
        }
    }

    private final boolean a(int param0, int param1) {
        if (param1 != 0) {
            pk var4 = (pk) null;
            this.a((pk) null, '￠', (byte) -97, -36);
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
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2 ^ 0, param3, param4, param5, param6)) {
              stackIn_3_0 = 1;
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
                      stackIn_10_0 = 1;
                      break L2;
                    }
                  }
                }
                stackIn_10_0 = 0;
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
            stackIn_13_0 = (RuntimeException) (var8);

            stackIn_13_1 = new StringBuilder().append("mc.RA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
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
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              stackIn_5_0 = 1;
              break L0;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("mc.KA(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
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
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = -93 % ((30 - param0) / 59);
            stackIn_1_0 = fw.a((byte) 126, hc.class, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2);

            stackIn_4_1 = new StringBuilder().append("mc.PA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
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
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = param1.a(0, param3);
            var5 = -112 / ((param0 - -84) / 40);
            var6 = param1.a(var4_int, param2, (byte) 127);
            stackIn_1_0 = iw.a(var6, var4_int, param1, -21834);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4);

            stackIn_4_1 = new StringBuilder().append("mc.TA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ')');
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
        int var3;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (param0 == 1) {
          if (null == this.field_B) {
            if (null != this.field_G) {
              if (this.field_D.field_q >= this.field_D.field_y.field_q) {
                this.field_G.b(1, 1, 107);
                return;
              } else {
                this.field_G.b(this.field_D.field_q, this.field_D.field_y.field_q, 8);
                return;
              }
            } else {
              return;
            }
          } else {
            if (this.field_D.field_y.field_p > this.field_D.field_p) {
              this.field_B.c(12, this.field_D.field_y.field_p, this.field_D.field_p);
              if (null != this.field_G) {
                if (this.field_D.field_q >= this.field_D.field_y.field_q) {
                  this.field_G.b(1, 1, 107);
                  return;
                } else {
                  this.field_G.b(this.field_D.field_q, this.field_D.field_y.field_q, 8);
                  return;
                }
              } else {
                return;
              }
            } else {
              this.field_B.c(101, 1, 1);
              if (null != this.field_G) {
                if (this.field_D.field_q >= this.field_D.field_y.field_q) {
                  this.field_G.b(1, 1, 107);
                  return;
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
          return;
        }
    }

    final void e(boolean param0) {
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        vo stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        vo stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        vo stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        vo stackIn_23_0;
        int stackIn_23_1;
        int stackIn_23_2;
        int stackIn_23_3;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        vo stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        vo stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        vo stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        int stackIn_46_2 = 0;
        vo stackIn_47_0;
        int stackIn_47_1;
        int stackIn_47_2;
        int stackIn_47_3;
        int stackIn_52_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_58_0 = 0;
        vo stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        vo stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        int stackIn_63_2 = 0;
        vo stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        int stackIn_67_2 = 0;
        vo stackIn_68_0;
        int stackIn_68_1;
        int stackIn_68_2;
        int stackIn_68_3;
        int stackIn_74_0 = 0;
        int stackIn_77_0 = 0;
        vo stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        vo stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        int stackIn_82_2 = 0;
        vo stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        int stackIn_86_2 = 0;
        vo stackIn_87_0;
        int stackIn_87_1;
        int stackIn_87_2;
        int stackIn_87_3;
        int stackIn_92_0 = 0;
        int stackIn_95_0 = 0;
        vo stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        vo stackIn_100_0 = null;
        int stackIn_100_1 = 0;
        int stackIn_100_2 = 0;
        vo stackIn_104_0 = null;
        int stackIn_104_1 = 0;
        int stackIn_104_2 = 0;
        vo stackIn_105_0;
        int stackIn_105_1;
        int stackIn_105_2;
        int stackIn_105_3;
        int stackIn_112_0 = 0;
        int stackIn_115_0 = 0;
        int stackIn_118_0 = 0;
        vo stackIn_122_0 = null;
        int stackIn_122_1 = 0;
        vo stackIn_123_0 = null;
        int stackIn_123_1 = 0;
        int stackIn_123_2 = 0;
        vo stackIn_127_0 = null;
        int stackIn_127_1 = 0;
        int stackIn_127_2 = 0;
        vo stackIn_128_0;
        int stackIn_128_1;
        int stackIn_128_2;
        int stackIn_128_3;
        int stackIn_134_0 = 0;
        int stackIn_137_0 = 0;
        vo stackIn_141_0 = null;
        int stackIn_141_1 = 0;
        vo stackIn_142_0 = null;
        int stackIn_142_1 = 0;
        int stackIn_142_2 = 0;
        vo stackIn_146_0 = null;
        int stackIn_146_1 = 0;
        int stackIn_146_2 = 0;
        vo stackIn_147_0;
        int stackIn_147_1;
        int stackIn_147_2;
        int stackIn_147_3;
        int stackIn_152_0 = 0;
        int stackIn_155_0 = 0;
        vo stackIn_159_0 = null;
        int stackIn_159_1 = 0;
        vo stackIn_160_0 = null;
        int stackIn_160_1 = 0;
        int stackIn_160_2 = 0;
        vo stackIn_164_0 = null;
        int stackIn_164_1 = 0;
        int stackIn_164_2 = 0;
        vo stackIn_165_0;
        int stackIn_165_1;
        int stackIn_165_2;
        int stackIn_165_3;
        int stackIn_172_0 = 0;
        int stackIn_175_0 = 0;
        int stackIn_178_0 = 0;
        vo stackIn_182_0 = null;
        int stackIn_182_1 = 0;
        vo stackIn_183_0 = null;
        int stackIn_183_1 = 0;
        int stackIn_183_2 = 0;
        vo stackIn_187_0 = null;
        int stackIn_187_1 = 0;
        int stackIn_187_2 = 0;
        vo stackIn_188_0;
        int stackIn_188_1;
        int stackIn_188_2;
        int stackIn_188_3;
        int stackIn_194_0 = 0;
        int stackIn_197_0 = 0;
        vo stackIn_201_0 = null;
        int stackIn_201_1 = 0;
        vo stackIn_202_0 = null;
        int stackIn_202_1 = 0;
        int stackIn_202_2 = 0;
        vo stackIn_206_0 = null;
        int stackIn_206_1 = 0;
        int stackIn_206_2 = 0;
        vo stackIn_207_0;
        int stackIn_207_1;
        int stackIn_207_2;
        int stackIn_207_3;
        int stackIn_212_0 = 0;
        int stackIn_215_0 = 0;
        vo stackIn_219_0 = null;
        int stackIn_219_1 = 0;
        vo stackIn_220_0 = null;
        int stackIn_220_1 = 0;
        int stackIn_220_2 = 0;
        vo stackIn_224_0 = null;
        int stackIn_224_1 = 0;
        int stackIn_224_2 = 0;
        vo stackIn_225_0;
        int stackIn_225_1;
        int stackIn_225_2;
        int stackIn_225_3;
        int stackIn_231_0 = 0;
        int stackIn_234_0 = 0;
        int stackIn_237_0 = 0;
        vo stackIn_241_0 = null;
        int stackIn_241_1 = 0;
        vo stackIn_242_0 = null;
        int stackIn_242_1 = 0;
        int stackIn_242_2 = 0;
        vo stackIn_246_0 = null;
        int stackIn_246_1 = 0;
        int stackIn_246_2 = 0;
        vo stackIn_247_0;
        int stackIn_247_1;
        int stackIn_247_2;
        int stackIn_247_3;
        int stackIn_253_0 = 0;
        int stackIn_256_0 = 0;
        vo stackIn_260_0 = null;
        int stackIn_260_1 = 0;
        vo stackIn_261_0 = null;
        int stackIn_261_1 = 0;
        int stackIn_261_2 = 0;
        vo stackIn_265_0 = null;
        int stackIn_265_1 = 0;
        int stackIn_265_2 = 0;
        vo stackIn_266_0;
        int stackIn_266_1;
        int stackIn_266_2;
        int stackIn_266_3;
        int stackIn_271_0 = 0;
        int stackIn_274_0 = 0;
        vo stackIn_278_0 = null;
        int stackIn_278_1 = 0;
        vo stackIn_279_0 = null;
        int stackIn_279_1 = 0;
        int stackIn_279_2 = 0;
        vo stackIn_283_0 = null;
        int stackIn_283_1 = 0;
        int stackIn_283_2 = 0;
        vo stackIn_284_0;
        int stackIn_284_1;
        int stackIn_284_2;
        int stackIn_284_3;
        int var2;
        int var3;
        int var4;
        int var5;
        if (!param0) {
          if (!this.field_H) {
            if (this.field_B != null) {
              var2 = this.field_B.field_q;
              if (!this.field_A) {
                if (null == this.field_G) {
                  L0: {
                    var3 = 0;
                    if (this.field_B != null) {
                      stackIn_271_0 = -this.field_B.field_q + this.field_q;
                      break L0;
                    } else {
                      stackIn_271_0 = this.field_q;
                      break L0;
                    }
                  }
                  L1: {
                    var4 = stackIn_271_0;
                    if (null == this.field_G) {
                      stackIn_274_0 = this.field_p;
                      break L1;
                    } else {
                      stackIn_274_0 = -this.field_G.field_p + this.field_p;
                      break L1;
                    }
                  }
                  L2: {
                    var5 = stackIn_274_0;
                    this.field_D.a(-123, var2, var3, var5, var4);
                    if (this.field_B != null) {
                      L3: {
                        stackIn_278_0 = this.field_B;

                        stackIn_278_1 = -119;

                        if (!this.field_H) {
                          stackIn_279_0 = (vo) ((Object) stackIn_278_0);
                          stackIn_279_1 = stackIn_278_1;
                          stackIn_279_2 = 0;
                          break L3;
                        } else {
                          stackIn_279_0 = (vo) ((Object) stackIn_278_0);
                          stackIn_279_1 = stackIn_278_1;
                          stackIn_279_2 = this.field_q + -this.field_B.field_q;
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
                        stackIn_283_0 = this.field_G;

                        stackIn_283_1 = 91;

                        stackIn_283_2 = this.field_D.field_r;

                        if (this.field_A) {
                          stackIn_284_0 = (vo) ((Object) stackIn_283_0);
                          stackIn_284_1 = stackIn_283_1;
                          stackIn_284_2 = stackIn_283_2;
                          stackIn_284_3 = -this.field_G.field_p + this.field_p;
                          break L5;
                        } else {
                          stackIn_284_0 = (vo) ((Object) stackIn_283_0);
                          stackIn_284_1 = stackIn_283_1;
                          stackIn_284_2 = stackIn_283_2;
                          stackIn_284_3 = 0;
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
                      stackIn_253_0 = -this.field_B.field_q + this.field_q;
                      break L6;
                    } else {
                      stackIn_253_0 = this.field_q;
                      break L6;
                    }
                  }
                  L7: {
                    var4 = stackIn_253_0;
                    if (null == this.field_G) {
                      stackIn_256_0 = this.field_p;
                      break L7;
                    } else {
                      stackIn_256_0 = -this.field_G.field_p + this.field_p;
                      break L7;
                    }
                  }
                  L8: {
                    var5 = stackIn_256_0;
                    this.field_D.a(-123, var2, var3, var5, var4);
                    if (this.field_B != null) {
                      L9: {
                        stackIn_260_0 = this.field_B;

                        stackIn_260_1 = -119;

                        if (!this.field_H) {
                          stackIn_261_0 = (vo) ((Object) stackIn_260_0);
                          stackIn_261_1 = stackIn_260_1;
                          stackIn_261_2 = 0;
                          break L9;
                        } else {
                          stackIn_261_0 = (vo) ((Object) stackIn_260_0);
                          stackIn_261_1 = stackIn_260_1;
                          stackIn_261_2 = this.field_q + -this.field_B.field_q;
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
                        stackIn_265_0 = this.field_G;

                        stackIn_265_1 = 91;

                        stackIn_265_2 = this.field_D.field_r;

                        if (this.field_A) {
                          stackIn_266_0 = (vo) ((Object) stackIn_265_0);
                          stackIn_266_1 = stackIn_265_1;
                          stackIn_266_2 = stackIn_265_2;
                          stackIn_266_3 = -this.field_G.field_p + this.field_p;
                          break L11;
                        } else {
                          stackIn_266_0 = (vo) ((Object) stackIn_265_0);
                          stackIn_266_1 = stackIn_265_1;
                          stackIn_266_2 = stackIn_265_2;
                          stackIn_266_3 = 0;
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
                stackIn_231_0 = 0;
                L12: {
                  var3 = stackIn_231_0;
                  if (this.field_B != null) {
                    stackIn_234_0 = -this.field_B.field_q + this.field_q;
                    break L12;
                  } else {
                    stackIn_234_0 = this.field_q;
                    break L12;
                  }
                }
                L13: {
                  var4 = stackIn_234_0;
                  if (null == this.field_G) {
                    stackIn_237_0 = this.field_p;
                    break L13;
                  } else {
                    stackIn_237_0 = -this.field_G.field_p + this.field_p;
                    break L13;
                  }
                }
                L14: {
                  var5 = stackIn_237_0;
                  this.field_D.a(-123, var2, var3, var5, var4);
                  if (this.field_B != null) {
                    L15: {
                      stackIn_241_0 = this.field_B;

                      stackIn_241_1 = -119;

                      if (!this.field_H) {
                        stackIn_242_0 = (vo) ((Object) stackIn_241_0);
                        stackIn_242_1 = stackIn_241_1;
                        stackIn_242_2 = 0;
                        break L15;
                      } else {
                        stackIn_242_0 = (vo) ((Object) stackIn_241_0);
                        stackIn_242_1 = stackIn_241_1;
                        stackIn_242_2 = this.field_q + -this.field_B.field_q;
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
                      stackIn_246_0 = this.field_G;

                      stackIn_246_1 = 91;

                      stackIn_246_2 = this.field_D.field_r;

                      if (this.field_A) {
                        stackIn_247_0 = (vo) ((Object) stackIn_246_0);
                        stackIn_247_1 = stackIn_246_1;
                        stackIn_247_2 = stackIn_246_2;
                        stackIn_247_3 = -this.field_G.field_p + this.field_p;
                        break L17;
                      } else {
                        stackIn_247_0 = (vo) ((Object) stackIn_246_0);
                        stackIn_247_1 = stackIn_246_1;
                        stackIn_247_2 = stackIn_246_2;
                        stackIn_247_3 = 0;
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
                      stackIn_212_0 = -this.field_B.field_q + this.field_q;
                      break L18;
                    } else {
                      stackIn_212_0 = this.field_q;
                      break L18;
                    }
                  }
                  L19: {
                    var4 = stackIn_212_0;
                    if (null == this.field_G) {
                      stackIn_215_0 = this.field_p;
                      break L19;
                    } else {
                      stackIn_215_0 = -this.field_G.field_p + this.field_p;
                      break L19;
                    }
                  }
                  L20: {
                    var5 = stackIn_215_0;
                    this.field_D.a(-123, var2, var3, var5, var4);
                    if (this.field_B != null) {
                      L21: {
                        stackIn_219_0 = this.field_B;

                        stackIn_219_1 = -119;

                        if (!this.field_H) {
                          stackIn_220_0 = (vo) ((Object) stackIn_219_0);
                          stackIn_220_1 = stackIn_219_1;
                          stackIn_220_2 = 0;
                          break L21;
                        } else {
                          stackIn_220_0 = (vo) ((Object) stackIn_219_0);
                          stackIn_220_1 = stackIn_219_1;
                          stackIn_220_2 = this.field_q + -this.field_B.field_q;
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
                        stackIn_224_0 = this.field_G;

                        stackIn_224_1 = 91;

                        stackIn_224_2 = this.field_D.field_r;

                        if (this.field_A) {
                          stackIn_225_0 = (vo) ((Object) stackIn_224_0);
                          stackIn_225_1 = stackIn_224_1;
                          stackIn_225_2 = stackIn_224_2;
                          stackIn_225_3 = -this.field_G.field_p + this.field_p;
                          break L23;
                        } else {
                          stackIn_225_0 = (vo) ((Object) stackIn_224_0);
                          stackIn_225_1 = stackIn_224_1;
                          stackIn_225_2 = stackIn_224_2;
                          stackIn_225_3 = 0;
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
                      stackIn_194_0 = -this.field_B.field_q + this.field_q;
                      break L24;
                    } else {
                      stackIn_194_0 = this.field_q;
                      break L24;
                    }
                  }
                  L25: {
                    var4 = stackIn_194_0;
                    if (null == this.field_G) {
                      stackIn_197_0 = this.field_p;
                      break L25;
                    } else {
                      stackIn_197_0 = -this.field_G.field_p + this.field_p;
                      break L25;
                    }
                  }
                  L26: {
                    var5 = stackIn_197_0;
                    this.field_D.a(-123, var2, var3, var5, var4);
                    if (this.field_B != null) {
                      L27: {
                        stackIn_201_0 = this.field_B;

                        stackIn_201_1 = -119;

                        if (!this.field_H) {
                          stackIn_202_0 = (vo) ((Object) stackIn_201_0);
                          stackIn_202_1 = stackIn_201_1;
                          stackIn_202_2 = 0;
                          break L27;
                        } else {
                          stackIn_202_0 = (vo) ((Object) stackIn_201_0);
                          stackIn_202_1 = stackIn_201_1;
                          stackIn_202_2 = this.field_q + -this.field_B.field_q;
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
                        stackIn_206_0 = this.field_G;

                        stackIn_206_1 = 91;

                        stackIn_206_2 = this.field_D.field_r;

                        if (this.field_A) {
                          stackIn_207_0 = (vo) ((Object) stackIn_206_0);
                          stackIn_207_1 = stackIn_206_1;
                          stackIn_207_2 = stackIn_206_2;
                          stackIn_207_3 = -this.field_G.field_p + this.field_p;
                          break L29;
                        } else {
                          stackIn_207_0 = (vo) ((Object) stackIn_206_0);
                          stackIn_207_1 = stackIn_206_1;
                          stackIn_207_2 = stackIn_206_2;
                          stackIn_207_3 = 0;
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
                stackIn_172_0 = 0;
                L30: {
                  var3 = stackIn_172_0;
                  if (this.field_B != null) {
                    stackIn_175_0 = -this.field_B.field_q + this.field_q;
                    break L30;
                  } else {
                    stackIn_175_0 = this.field_q;
                    break L30;
                  }
                }
                L31: {
                  var4 = stackIn_175_0;
                  if (null == this.field_G) {
                    stackIn_178_0 = this.field_p;
                    break L31;
                  } else {
                    stackIn_178_0 = -this.field_G.field_p + this.field_p;
                    break L31;
                  }
                }
                L32: {
                  var5 = stackIn_178_0;
                  this.field_D.a(-123, var2, var3, var5, var4);
                  if (this.field_B != null) {
                    L33: {
                      stackIn_182_0 = this.field_B;

                      stackIn_182_1 = -119;

                      if (!this.field_H) {
                        stackIn_183_0 = (vo) ((Object) stackIn_182_0);
                        stackIn_183_1 = stackIn_182_1;
                        stackIn_183_2 = 0;
                        break L33;
                      } else {
                        stackIn_183_0 = (vo) ((Object) stackIn_182_0);
                        stackIn_183_1 = stackIn_182_1;
                        stackIn_183_2 = this.field_q + -this.field_B.field_q;
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
                      stackIn_187_0 = this.field_G;

                      stackIn_187_1 = 91;

                      stackIn_187_2 = this.field_D.field_r;

                      if (this.field_A) {
                        stackIn_188_0 = (vo) ((Object) stackIn_187_0);
                        stackIn_188_1 = stackIn_187_1;
                        stackIn_188_2 = stackIn_187_2;
                        stackIn_188_3 = -this.field_G.field_p + this.field_p;
                        break L35;
                      } else {
                        stackIn_188_0 = (vo) ((Object) stackIn_187_0);
                        stackIn_188_1 = stackIn_187_1;
                        stackIn_188_2 = stackIn_187_2;
                        stackIn_188_3 = 0;
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
                    stackIn_152_0 = -this.field_B.field_q + this.field_q;
                    break L36;
                  } else {
                    stackIn_152_0 = this.field_q;
                    break L36;
                  }
                }
                L37: {
                  var4 = stackIn_152_0;
                  if (null == this.field_G) {
                    stackIn_155_0 = this.field_p;
                    break L37;
                  } else {
                    stackIn_155_0 = -this.field_G.field_p + this.field_p;
                    break L37;
                  }
                }
                L38: {
                  var5 = stackIn_155_0;
                  this.field_D.a(-123, var2, var3, var5, var4);
                  if (this.field_B != null) {
                    L39: {
                      stackIn_159_0 = this.field_B;

                      stackIn_159_1 = -119;

                      if (!this.field_H) {
                        stackIn_160_0 = (vo) ((Object) stackIn_159_0);
                        stackIn_160_1 = stackIn_159_1;
                        stackIn_160_2 = 0;
                        break L39;
                      } else {
                        stackIn_160_0 = (vo) ((Object) stackIn_159_0);
                        stackIn_160_1 = stackIn_159_1;
                        stackIn_160_2 = this.field_q + -this.field_B.field_q;
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
                      stackIn_164_0 = this.field_G;

                      stackIn_164_1 = 91;

                      stackIn_164_2 = this.field_D.field_r;

                      if (this.field_A) {
                        stackIn_165_0 = (vo) ((Object) stackIn_164_0);
                        stackIn_165_1 = stackIn_164_1;
                        stackIn_165_2 = stackIn_164_2;
                        stackIn_165_3 = -this.field_G.field_p + this.field_p;
                        break L41;
                      } else {
                        stackIn_165_0 = (vo) ((Object) stackIn_164_0);
                        stackIn_165_1 = stackIn_164_1;
                        stackIn_165_2 = stackIn_164_2;
                        stackIn_165_3 = 0;
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
                    stackIn_134_0 = -this.field_B.field_q + this.field_q;
                    break L42;
                  } else {
                    stackIn_134_0 = this.field_q;
                    break L42;
                  }
                }
                L43: {
                  var4 = stackIn_134_0;
                  if (null == this.field_G) {
                    stackIn_137_0 = this.field_p;
                    break L43;
                  } else {
                    stackIn_137_0 = -this.field_G.field_p + this.field_p;
                    break L43;
                  }
                }
                L44: {
                  var5 = stackIn_137_0;
                  this.field_D.a(-123, var2, var3, var5, var4);
                  if (this.field_B != null) {
                    L45: {
                      stackIn_141_0 = this.field_B;

                      stackIn_141_1 = -119;

                      if (!this.field_H) {
                        stackIn_142_0 = (vo) ((Object) stackIn_141_0);
                        stackIn_142_1 = stackIn_141_1;
                        stackIn_142_2 = 0;
                        break L45;
                      } else {
                        stackIn_142_0 = (vo) ((Object) stackIn_141_0);
                        stackIn_142_1 = stackIn_141_1;
                        stackIn_142_2 = this.field_q + -this.field_B.field_q;
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
                      stackIn_146_0 = this.field_G;

                      stackIn_146_1 = 91;

                      stackIn_146_2 = this.field_D.field_r;

                      if (this.field_A) {
                        stackIn_147_0 = (vo) ((Object) stackIn_146_0);
                        stackIn_147_1 = stackIn_146_1;
                        stackIn_147_2 = stackIn_146_2;
                        stackIn_147_3 = -this.field_G.field_p + this.field_p;
                        break L47;
                      } else {
                        stackIn_147_0 = (vo) ((Object) stackIn_146_0);
                        stackIn_147_1 = stackIn_146_1;
                        stackIn_147_2 = stackIn_146_2;
                        stackIn_147_3 = 0;
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
              stackIn_112_0 = 0;
              L48: {
                var3 = stackIn_112_0;
                if (this.field_B != null) {
                  stackIn_115_0 = -this.field_B.field_q + this.field_q;
                  break L48;
                } else {
                  stackIn_115_0 = this.field_q;
                  break L48;
                }
              }
              L49: {
                var4 = stackIn_115_0;
                if (null == this.field_G) {
                  stackIn_118_0 = this.field_p;
                  break L49;
                } else {
                  stackIn_118_0 = -this.field_G.field_p + this.field_p;
                  break L49;
                }
              }
              L50: {
                var5 = stackIn_118_0;
                this.field_D.a(-123, var2, var3, var5, var4);
                if (this.field_B != null) {
                  L51: {
                    stackIn_122_0 = this.field_B;

                    stackIn_122_1 = -119;

                    if (!this.field_H) {
                      stackIn_123_0 = (vo) ((Object) stackIn_122_0);
                      stackIn_123_1 = stackIn_122_1;
                      stackIn_123_2 = 0;
                      break L51;
                    } else {
                      stackIn_123_0 = (vo) ((Object) stackIn_122_0);
                      stackIn_123_1 = stackIn_122_1;
                      stackIn_123_2 = this.field_q + -this.field_B.field_q;
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
                    stackIn_127_0 = this.field_G;

                    stackIn_127_1 = 91;

                    stackIn_127_2 = this.field_D.field_r;

                    if (this.field_A) {
                      stackIn_128_0 = (vo) ((Object) stackIn_127_0);
                      stackIn_128_1 = stackIn_127_1;
                      stackIn_128_2 = stackIn_127_2;
                      stackIn_128_3 = -this.field_G.field_p + this.field_p;
                      break L53;
                    } else {
                      stackIn_128_0 = (vo) ((Object) stackIn_127_0);
                      stackIn_128_1 = stackIn_127_1;
                      stackIn_128_2 = stackIn_127_2;
                      stackIn_128_3 = 0;
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
                      stackIn_92_0 = -this.field_B.field_q + this.field_q;
                      break L54;
                    } else {
                      stackIn_92_0 = this.field_q;
                      break L54;
                    }
                  }
                  L55: {
                    var4 = stackIn_92_0;
                    if (null == this.field_G) {
                      stackIn_95_0 = this.field_p;
                      break L55;
                    } else {
                      stackIn_95_0 = -this.field_G.field_p + this.field_p;
                      break L55;
                    }
                  }
                  L56: {
                    var5 = stackIn_95_0;
                    this.field_D.a(-123, var2, var3, var5, var4);
                    if (this.field_B != null) {
                      L57: {
                        stackIn_99_0 = this.field_B;

                        stackIn_99_1 = -119;

                        if (!this.field_H) {
                          stackIn_100_0 = (vo) ((Object) stackIn_99_0);
                          stackIn_100_1 = stackIn_99_1;
                          stackIn_100_2 = 0;
                          break L57;
                        } else {
                          stackIn_100_0 = (vo) ((Object) stackIn_99_0);
                          stackIn_100_1 = stackIn_99_1;
                          stackIn_100_2 = this.field_q + -this.field_B.field_q;
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
                        stackIn_104_0 = this.field_G;

                        stackIn_104_1 = 91;

                        stackIn_104_2 = this.field_D.field_r;

                        if (this.field_A) {
                          stackIn_105_0 = (vo) ((Object) stackIn_104_0);
                          stackIn_105_1 = stackIn_104_1;
                          stackIn_105_2 = stackIn_104_2;
                          stackIn_105_3 = -this.field_G.field_p + this.field_p;
                          break L59;
                        } else {
                          stackIn_105_0 = (vo) ((Object) stackIn_104_0);
                          stackIn_105_1 = stackIn_104_1;
                          stackIn_105_2 = stackIn_104_2;
                          stackIn_105_3 = 0;
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
                      stackIn_74_0 = -this.field_B.field_q + this.field_q;
                      break L60;
                    } else {
                      stackIn_74_0 = this.field_q;
                      break L60;
                    }
                  }
                  L61: {
                    var4 = stackIn_74_0;
                    if (null == this.field_G) {
                      stackIn_77_0 = this.field_p;
                      break L61;
                    } else {
                      stackIn_77_0 = -this.field_G.field_p + this.field_p;
                      break L61;
                    }
                  }
                  L62: {
                    var5 = stackIn_77_0;
                    this.field_D.a(-123, var2, var3, var5, var4);
                    if (this.field_B != null) {
                      L63: {
                        stackIn_81_0 = this.field_B;

                        stackIn_81_1 = -119;

                        if (!this.field_H) {
                          stackIn_82_0 = (vo) ((Object) stackIn_81_0);
                          stackIn_82_1 = stackIn_81_1;
                          stackIn_82_2 = 0;
                          break L63;
                        } else {
                          stackIn_82_0 = (vo) ((Object) stackIn_81_0);
                          stackIn_82_1 = stackIn_81_1;
                          stackIn_82_2 = this.field_q + -this.field_B.field_q;
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
                        stackIn_86_0 = this.field_G;

                        stackIn_86_1 = 91;

                        stackIn_86_2 = this.field_D.field_r;

                        if (this.field_A) {
                          stackIn_87_0 = (vo) ((Object) stackIn_86_0);
                          stackIn_87_1 = stackIn_86_1;
                          stackIn_87_2 = stackIn_86_2;
                          stackIn_87_3 = -this.field_G.field_p + this.field_p;
                          break L65;
                        } else {
                          stackIn_87_0 = (vo) ((Object) stackIn_86_0);
                          stackIn_87_1 = stackIn_86_1;
                          stackIn_87_2 = stackIn_86_2;
                          stackIn_87_3 = 0;
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
                stackIn_52_0 = 0;
                L66: {
                  var3 = stackIn_52_0;
                  if (this.field_B != null) {
                    stackIn_55_0 = -this.field_B.field_q + this.field_q;
                    break L66;
                  } else {
                    stackIn_55_0 = this.field_q;
                    break L66;
                  }
                }
                L67: {
                  var4 = stackIn_55_0;
                  if (null == this.field_G) {
                    stackIn_58_0 = this.field_p;
                    break L67;
                  } else {
                    stackIn_58_0 = -this.field_G.field_p + this.field_p;
                    break L67;
                  }
                }
                L68: {
                  var5 = stackIn_58_0;
                  this.field_D.a(-123, var2, var3, var5, var4);
                  if (this.field_B != null) {
                    L69: {
                      stackIn_62_0 = this.field_B;

                      stackIn_62_1 = -119;

                      if (!this.field_H) {
                        stackIn_63_0 = (vo) ((Object) stackIn_62_0);
                        stackIn_63_1 = stackIn_62_1;
                        stackIn_63_2 = 0;
                        break L69;
                      } else {
                        stackIn_63_0 = (vo) ((Object) stackIn_62_0);
                        stackIn_63_1 = stackIn_62_1;
                        stackIn_63_2 = this.field_q + -this.field_B.field_q;
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
                      stackIn_67_0 = this.field_G;

                      stackIn_67_1 = 91;

                      stackIn_67_2 = this.field_D.field_r;

                      if (this.field_A) {
                        stackIn_68_0 = (vo) ((Object) stackIn_67_0);
                        stackIn_68_1 = stackIn_67_1;
                        stackIn_68_2 = stackIn_67_2;
                        stackIn_68_3 = -this.field_G.field_p + this.field_p;
                        break L71;
                      } else {
                        stackIn_68_0 = (vo) ((Object) stackIn_67_0);
                        stackIn_68_1 = stackIn_67_1;
                        stackIn_68_2 = stackIn_67_2;
                        stackIn_68_3 = 0;
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
                      stackIn_31_0 = this.field_G.field_p;
                      break L72;
                    } else {
                      break L73;
                    }
                  }
                }
                stackIn_31_0 = 0;
                break L72;
              }
              L74: {
                var3 = stackIn_31_0;
                if (this.field_B != null) {
                  stackIn_34_0 = -this.field_B.field_q + this.field_q;
                  break L74;
                } else {
                  stackIn_34_0 = this.field_q;
                  break L74;
                }
              }
              L75: {
                var4 = stackIn_34_0;
                if (null == this.field_G) {
                  stackIn_37_0 = this.field_p;
                  break L75;
                } else {
                  stackIn_37_0 = -this.field_G.field_p + this.field_p;
                  break L75;
                }
              }
              L76: {
                var5 = stackIn_37_0;
                this.field_D.a(-123, var2, var3, var5, var4);
                if (this.field_B != null) {
                  L77: {
                    stackIn_41_0 = this.field_B;

                    stackIn_41_1 = -119;

                    if (!this.field_H) {
                      stackIn_42_0 = (vo) ((Object) stackIn_41_0);
                      stackIn_42_1 = stackIn_41_1;
                      stackIn_42_2 = 0;
                      break L77;
                    } else {
                      stackIn_42_0 = (vo) ((Object) stackIn_41_0);
                      stackIn_42_1 = stackIn_41_1;
                      stackIn_42_2 = this.field_q + -this.field_B.field_q;
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
                    stackIn_46_0 = this.field_G;

                    stackIn_46_1 = 91;

                    stackIn_46_2 = this.field_D.field_r;

                    if (this.field_A) {
                      stackIn_47_0 = (vo) ((Object) stackIn_46_0);
                      stackIn_47_1 = stackIn_46_1;
                      stackIn_47_2 = stackIn_46_2;
                      stackIn_47_3 = -this.field_G.field_p + this.field_p;
                      break L79;
                    } else {
                      stackIn_47_0 = (vo) ((Object) stackIn_46_0);
                      stackIn_47_1 = stackIn_46_1;
                      stackIn_47_2 = stackIn_46_2;
                      stackIn_47_3 = 0;
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
                    stackIn_7_0 = this.field_G.field_p;
                    break L80;
                  } else {
                    break L81;
                  }
                }
              }
              stackIn_7_0 = 0;
              break L80;
            }
            L82: {
              var3 = stackIn_7_0;
              if (this.field_B != null) {
                stackIn_10_0 = -this.field_B.field_q + this.field_q;
                break L82;
              } else {
                stackIn_10_0 = this.field_q;
                break L82;
              }
            }
            L83: {
              var4 = stackIn_10_0;
              if (null == this.field_G) {
                stackIn_13_0 = this.field_p;
                break L83;
              } else {
                stackIn_13_0 = -this.field_G.field_p + this.field_p;
                break L83;
              }
            }
            L84: {
              var5 = stackIn_13_0;
              this.field_D.a(-123, var2, var3, var5, var4);
              if (this.field_B != null) {
                L85: {
                  stackIn_17_0 = this.field_B;

                  stackIn_17_1 = -119;

                  if (!this.field_H) {
                    stackIn_18_0 = (vo) ((Object) stackIn_17_0);
                    stackIn_18_1 = stackIn_17_1;
                    stackIn_18_2 = 0;
                    break L85;
                  } else {
                    stackIn_18_0 = (vo) ((Object) stackIn_17_0);
                    stackIn_18_1 = stackIn_17_1;
                    stackIn_18_2 = this.field_q + -this.field_B.field_q;
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
                  stackIn_22_0 = this.field_G;

                  stackIn_22_1 = 91;

                  stackIn_22_2 = this.field_D.field_r;

                  if (this.field_A) {
                    stackIn_23_0 = (vo) ((Object) stackIn_22_0);
                    stackIn_23_1 = stackIn_22_1;
                    stackIn_23_2 = stackIn_22_2;
                    stackIn_23_3 = -this.field_G.field_p + this.field_p;
                    break L87;
                  } else {
                    stackIn_23_0 = (vo) ((Object) stackIn_22_0);
                    stackIn_23_1 = stackIn_22_1;
                    stackIn_23_2 = stackIn_22_2;
                    stackIn_23_3 = 0;
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
