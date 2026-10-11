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
        pk var3 = null;
        pk var3Lifetime1;
        pk var3Lifetime2;
        pk var3Lifetime3;
        if (null != this.field_G) {
          this.field_D.field_y.field_r = -(int)((long)(-this.field_D.field_q + this.field_D.field_y.field_q) * (long)this.field_G.field_G >> 16);
          if (this.field_B == null) {
            if (param0 == 1) {
              return;
            }
            var3 = (pk) null;
            this.a((pk) null, 'g', (byte) -4, -28);
            return;
          }
          this.field_D.field_y.field_v = -(int)((long)(this.field_D.field_y.field_p - this.field_D.field_p) * (long)this.field_B.field_D >> 16);
          if (param0 != 1) {
            var3Lifetime3 = (pk) null;
            this.a((pk) null, 'g', (byte) -4, -28);
            return;
          }
          return;
        }
        if (this.field_B != null) {
          this.field_D.field_y.field_v = -(int)((long)(this.field_D.field_y.field_p - this.field_D.field_p) * (long)this.field_B.field_D >> 16);
          if (param0 == 1) {
            return;
          }
          var3Lifetime1 = (pk) null;
          this.a((pk) null, 'g', (byte) -4, -28);
          return;
        }
        if (param0 == 1) {
          return;
        }
        var3Lifetime2 = (pk) null;
        this.a((pk) null, 'g', (byte) -4, -28);
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
        if (this.field_B != null) {
          this.field_B.a(param1 ^ 0, param0 * this.field_B.field_E + this.field_B.field_D);
          return true;
        }
        return false;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, pk param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2 ^ 0, param3, param4, param5, param6)) {
            return true;
          }
          if (param2 != -1) {
            this.field_B = (vo) null;
          }
          stackIn_10_0 = (this.d(-1)) && (this.a(param1, 0));
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_13_0 = var8;
          stackIn_13_1 = new StringBuilder().append("mc.RA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param6).append(')').toString());
        }
    }

    final boolean a(pk param0, char param1, byte param2, int param3) {
        RuntimeException var5 = null;
        pk var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 < 9) {
            var6 = (pk) null;
            this.a(20, 50, (pk) null, 57);
          }
          if (!super.a(param0, param1, (byte) 74, param3)) {
            return false;
          }
          this.f(1);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("mc.KA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
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
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -93 % ((30 - param0) / 59);
          stackIn_1_0 = fw.a((byte) 126, hc.class, param1);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("mc.PA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final static ne a(byte param0, ki param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        ne stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param1.a(0, param3);
          var5 = -112 / ((param0 + 84) / 40);
          var6 = param1.a(var4_int, param2, (byte) 127);
          stackIn_1_0 = iw.a(var6, var4_int, param1, -21834);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("mc.TA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
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
        int var3 = Sumoblitz.field_L ? 1 : 0;
        if (param0 != 1) {
          return;
        }
        if (null != this.field_B) {
          if (this.field_D.field_y.field_p <= this.field_D.field_p) {
            this.field_B.c(101, 1, 1);
            if (null == this.field_G) {
              return;
            }
            if (this.field_D.field_q < this.field_D.field_y.field_q) {
              this.field_G.b(this.field_D.field_q, this.field_D.field_y.field_q, 8);
              return;
            }
            this.field_G.b(1, 1, 107);
            return;
          }
          this.field_B.c(12, this.field_D.field_y.field_p, this.field_D.field_p);
          if (null == this.field_G) {
            return;
          }
          if (this.field_D.field_q < this.field_D.field_y.field_q) {
            this.field_G.b(this.field_D.field_q, this.field_D.field_y.field_q, 8);
            return;
          }
          this.field_G.b(1, 1, 107);
          return;
        }
        if (null == this.field_G) {
          return;
        }
        if (this.field_D.field_q < this.field_D.field_y.field_q) {
          this.field_G.b(this.field_D.field_q, this.field_D.field_y.field_q, 8);
          return;
        }
        this.field_G.b(1, 1, 107);
    }

    final void e(boolean param0) {
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        vo stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_18_2 = 0;
        vo stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        int stackIn_23_3;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        vo stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int stackIn_42_2 = 0;
        vo stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        int stackIn_46_2 = 0;
        int stackIn_47_3;
        int stackIn_52_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_58_0 = 0;
        vo stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        int stackIn_63_2 = 0;
        vo stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        int stackIn_67_2 = 0;
        int stackIn_68_3;
        int stackIn_74_0 = 0;
        int stackIn_77_0 = 0;
        vo stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        int stackIn_82_2 = 0;
        vo stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        int stackIn_86_2 = 0;
        int stackIn_87_3;
        int stackIn_92_0 = 0;
        int stackIn_95_0 = 0;
        vo stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        int stackIn_100_2 = 0;
        vo stackIn_104_0 = null;
        int stackIn_104_1 = 0;
        int stackIn_104_2 = 0;
        int stackIn_105_3;
        int stackIn_112_0 = 0;
        int stackIn_115_0 = 0;
        int stackIn_118_0 = 0;
        vo stackIn_122_0 = null;
        int stackIn_122_1 = 0;
        int stackIn_123_2 = 0;
        vo stackIn_127_0 = null;
        int stackIn_127_1 = 0;
        int stackIn_127_2 = 0;
        int stackIn_128_3;
        int stackIn_134_0 = 0;
        int stackIn_137_0 = 0;
        vo stackIn_141_0 = null;
        int stackIn_141_1 = 0;
        int stackIn_142_2 = 0;
        vo stackIn_146_0 = null;
        int stackIn_146_1 = 0;
        int stackIn_146_2 = 0;
        int stackIn_147_3;
        int stackIn_152_0 = 0;
        int stackIn_155_0 = 0;
        vo stackIn_159_0 = null;
        int stackIn_159_1 = 0;
        int stackIn_160_2 = 0;
        vo stackIn_164_0 = null;
        int stackIn_164_1 = 0;
        int stackIn_164_2 = 0;
        int stackIn_165_3;
        int stackIn_172_0 = 0;
        int stackIn_175_0 = 0;
        int stackIn_178_0 = 0;
        vo stackIn_182_0 = null;
        int stackIn_182_1 = 0;
        int stackIn_183_2 = 0;
        vo stackIn_187_0 = null;
        int stackIn_187_1 = 0;
        int stackIn_187_2 = 0;
        int stackIn_188_3;
        int stackIn_194_0 = 0;
        int stackIn_197_0 = 0;
        vo stackIn_201_0 = null;
        int stackIn_201_1 = 0;
        int stackIn_202_2 = 0;
        vo stackIn_206_0 = null;
        int stackIn_206_1 = 0;
        int stackIn_206_2 = 0;
        int stackIn_207_3;
        int stackIn_212_0 = 0;
        int stackIn_215_0 = 0;
        vo stackIn_219_0 = null;
        int stackIn_219_1 = 0;
        int stackIn_220_2 = 0;
        vo stackIn_224_0 = null;
        int stackIn_224_1 = 0;
        int stackIn_224_2 = 0;
        int stackIn_225_3;
        int stackIn_231_0 = 0;
        int stackIn_234_0 = 0;
        int stackIn_237_0 = 0;
        vo stackIn_241_0 = null;
        int stackIn_241_1 = 0;
        int stackIn_242_2 = 0;
        vo stackIn_246_0 = null;
        int stackIn_246_1 = 0;
        int stackIn_246_2 = 0;
        int stackIn_247_3;
        int stackIn_253_0 = 0;
        int stackIn_256_0 = 0;
        vo stackIn_260_0 = null;
        int stackIn_260_1 = 0;
        int stackIn_261_2 = 0;
        vo stackIn_265_0 = null;
        int stackIn_265_1 = 0;
        int stackIn_265_2 = 0;
        int stackIn_266_3;
        int stackIn_271_0 = 0;
        int stackIn_274_0 = 0;
        vo stackIn_278_0 = null;
        int stackIn_278_1 = 0;
        int stackIn_279_2 = 0;
        vo stackIn_283_0 = null;
        int stackIn_283_1 = 0;
        int stackIn_283_2 = 0;
        int stackIn_284_3;
        int var2;
        int var3;
        int var4;
        int var5;
        if (param0) {
          field_J = (String) null;
          if (this.field_H) {
            var2 = 0;
            if (!this.field_A &&
              null != this.field_G) {
              stackIn_7_0 = this.field_G.field_p;
            } else {
              stackIn_7_0 = 0;
            }
            var3 = stackIn_7_0;
            if (this.field_B != null) {
              stackIn_10_0 = -this.field_B.field_q + this.field_q;
            } else {
              stackIn_10_0 = this.field_q;
            }
            var4 = stackIn_10_0;
            if (null == this.field_G) {
              stackIn_13_0 = this.field_p;
            } else {
              stackIn_13_0 = -this.field_G.field_p + this.field_p;
            }
            var5 = stackIn_13_0;
            this.field_D.a(-123, var2, var3, var5, var4);
            if (this.field_B != null) {
              stackIn_17_0 = this.field_B;
              stackIn_17_1 = -119;
              if (!this.field_H) {
                stackIn_18_2 = 0;
              } else {
                stackIn_18_2 = this.field_q - this.field_B.field_q;
              }
              ((vo) (Object) stackIn_17_0).a(stackIn_17_1, stackIn_18_2, this.field_D.field_v, this.field_D.field_p, this.field_B.field_q);
            }
            if (this.field_G != null) {
              stackIn_22_0 = this.field_G;
              stackIn_22_1 = 91;
              stackIn_22_2 = this.field_D.field_r;
              if (this.field_A) {
                stackIn_23_3 = -this.field_G.field_p + this.field_p;
              } else {
                stackIn_23_3 = 0;
              }
              ((vo) (Object) stackIn_22_0).a(stackIn_22_1, stackIn_22_2, stackIn_23_3, this.field_G.field_p, this.field_D.field_q);
            }
          } else {
            if (this.field_B == null) {
              var2 = 0;
              if (!this.field_A &&
                null != this.field_G) {
                stackIn_31_0 = this.field_G.field_p;
              } else {
                stackIn_31_0 = 0;
              }
              var3 = stackIn_31_0;
              if (this.field_B != null) {
                stackIn_34_0 = -this.field_B.field_q + this.field_q;
              } else {
                stackIn_34_0 = this.field_q;
              }
              var4 = stackIn_34_0;
              if (null == this.field_G) {
                stackIn_37_0 = this.field_p;
              } else {
                stackIn_37_0 = -this.field_G.field_p + this.field_p;
              }
              var5 = stackIn_37_0;
              this.field_D.a(-123, var2, var3, var5, var4);
              if (this.field_B != null) {
                stackIn_41_0 = this.field_B;
                stackIn_41_1 = -119;
                if (!this.field_H) {
                  stackIn_42_2 = 0;
                } else {
                  stackIn_42_2 = this.field_q - this.field_B.field_q;
                }
                ((vo) (Object) stackIn_41_0).a(stackIn_41_1, stackIn_42_2, this.field_D.field_v, this.field_D.field_p, this.field_B.field_q);
              }
              if (this.field_G != null) {
                stackIn_46_0 = this.field_G;
                stackIn_46_1 = 91;
                stackIn_46_2 = this.field_D.field_r;
                if (this.field_A) {
                  stackIn_47_3 = -this.field_G.field_p + this.field_p;
                } else {
                  stackIn_47_3 = 0;
                }
                ((vo) (Object) stackIn_46_0).a(stackIn_46_1, stackIn_46_2, stackIn_47_3, this.field_G.field_p, this.field_D.field_q);
              }
            } else {
              var2 = this.field_B.field_q;
              if (this.field_A) {
                stackIn_52_0 = 0;
                var3 = stackIn_52_0;
                if (this.field_B != null) {
                  stackIn_55_0 = -this.field_B.field_q + this.field_q;
                } else {
                  stackIn_55_0 = this.field_q;
                }
                var4 = stackIn_55_0;
                if (null == this.field_G) {
                  stackIn_58_0 = this.field_p;
                } else {
                  stackIn_58_0 = -this.field_G.field_p + this.field_p;
                }
                var5 = stackIn_58_0;
                this.field_D.a(-123, var2, var3, var5, var4);
                if (this.field_B != null) {
                  stackIn_62_0 = this.field_B;
                  stackIn_62_1 = -119;
                  if (!this.field_H) {
                    stackIn_63_2 = 0;
                  } else {
                    stackIn_63_2 = this.field_q - this.field_B.field_q;
                  }
                  ((vo) (Object) stackIn_62_0).a(stackIn_62_1, stackIn_63_2, this.field_D.field_v, this.field_D.field_p, this.field_B.field_q);
                }
                if (this.field_G != null) {
                  stackIn_67_0 = this.field_G;
                  stackIn_67_1 = 91;
                  stackIn_67_2 = this.field_D.field_r;
                  if (this.field_A) {
                    stackIn_68_3 = -this.field_G.field_p + this.field_p;
                  } else {
                    stackIn_68_3 = 0;
                  }
                  ((vo) (Object) stackIn_67_0).a(stackIn_67_1, stackIn_67_2, stackIn_68_3, this.field_G.field_p, this.field_D.field_q);
                }
              } else {
                if (null == this.field_G) {
                  var3 = 0;
                  if (this.field_B != null) {
                    stackIn_92_0 = -this.field_B.field_q + this.field_q;
                  } else {
                    stackIn_92_0 = this.field_q;
                  }
                  var4 = stackIn_92_0;
                  if (null == this.field_G) {
                    stackIn_95_0 = this.field_p;
                  } else {
                    stackIn_95_0 = -this.field_G.field_p + this.field_p;
                  }
                  var5 = stackIn_95_0;
                  this.field_D.a(-123, var2, var3, var5, var4);
                  if (this.field_B != null) {
                    stackIn_99_0 = this.field_B;
                    stackIn_99_1 = -119;
                    if (!this.field_H) {
                      stackIn_100_2 = 0;
                    } else {
                      stackIn_100_2 = this.field_q - this.field_B.field_q;
                    }
                    ((vo) (Object) stackIn_99_0).a(stackIn_99_1, stackIn_100_2, this.field_D.field_v, this.field_D.field_p, this.field_B.field_q);
                  }
                  if (this.field_G != null) {
                    stackIn_104_0 = this.field_G;
                    stackIn_104_1 = 91;
                    stackIn_104_2 = this.field_D.field_r;
                    if (this.field_A) {
                      stackIn_105_3 = -this.field_G.field_p + this.field_p;
                    } else {
                      stackIn_105_3 = 0;
                    }
                    ((vo) (Object) stackIn_104_0).a(stackIn_104_1, stackIn_104_2, stackIn_105_3, this.field_G.field_p, this.field_D.field_q);
                  }
                } else {
                  var3 = this.field_G.field_p;
                  if (this.field_B != null) {
                    stackIn_74_0 = -this.field_B.field_q + this.field_q;
                  } else {
                    stackIn_74_0 = this.field_q;
                  }
                  var4 = stackIn_74_0;
                  if (null == this.field_G) {
                    stackIn_77_0 = this.field_p;
                  } else {
                    stackIn_77_0 = -this.field_G.field_p + this.field_p;
                  }
                  var5 = stackIn_77_0;
                  this.field_D.a(-123, var2, var3, var5, var4);
                  if (this.field_B != null) {
                    stackIn_81_0 = this.field_B;
                    stackIn_81_1 = -119;
                    if (!this.field_H) {
                      stackIn_82_2 = 0;
                    } else {
                      stackIn_82_2 = this.field_q - this.field_B.field_q;
                    }
                    ((vo) (Object) stackIn_81_0).a(stackIn_81_1, stackIn_82_2, this.field_D.field_v, this.field_D.field_p, this.field_B.field_q);
                  }
                  if (this.field_G != null) {
                    stackIn_86_0 = this.field_G;
                    stackIn_86_1 = 91;
                    stackIn_86_2 = this.field_D.field_r;
                    if (this.field_A) {
                      stackIn_87_3 = -this.field_G.field_p + this.field_p;
                    } else {
                      stackIn_87_3 = 0;
                    }
                    ((vo) (Object) stackIn_86_0).a(stackIn_86_1, stackIn_86_2, stackIn_87_3, this.field_G.field_p, this.field_D.field_q);
                  }
                }
              }
            }
          }
        } else {
          if (this.field_H) {
            var2 = 0;
            if (this.field_A) {
              stackIn_112_0 = 0;
              var3 = stackIn_112_0;
              if (this.field_B != null) {
                stackIn_115_0 = -this.field_B.field_q + this.field_q;
              } else {
                stackIn_115_0 = this.field_q;
              }
              var4 = stackIn_115_0;
              if (null == this.field_G) {
                stackIn_118_0 = this.field_p;
              } else {
                stackIn_118_0 = -this.field_G.field_p + this.field_p;
              }
              var5 = stackIn_118_0;
              this.field_D.a(-123, var2, var3, var5, var4);
              if (this.field_B != null) {
                stackIn_122_0 = this.field_B;
                stackIn_122_1 = -119;
                if (!this.field_H) {
                  stackIn_123_2 = 0;
                } else {
                  stackIn_123_2 = this.field_q - this.field_B.field_q;
                }
                ((vo) (Object) stackIn_122_0).a(stackIn_122_1, stackIn_123_2, this.field_D.field_v, this.field_D.field_p, this.field_B.field_q);
              }
              if (this.field_G != null) {
                stackIn_127_0 = this.field_G;
                stackIn_127_1 = 91;
                stackIn_127_2 = this.field_D.field_r;
                if (this.field_A) {
                  stackIn_128_3 = -this.field_G.field_p + this.field_p;
                } else {
                  stackIn_128_3 = 0;
                }
                ((vo) (Object) stackIn_127_0).a(stackIn_127_1, stackIn_127_2, stackIn_128_3, this.field_G.field_p, this.field_D.field_q);
              }
            } else {
              if (null == this.field_G) {
                var3 = 0;
                if (this.field_B != null) {
                  stackIn_152_0 = -this.field_B.field_q + this.field_q;
                } else {
                  stackIn_152_0 = this.field_q;
                }
                var4 = stackIn_152_0;
                if (null == this.field_G) {
                  stackIn_155_0 = this.field_p;
                } else {
                  stackIn_155_0 = -this.field_G.field_p + this.field_p;
                }
                var5 = stackIn_155_0;
                this.field_D.a(-123, var2, var3, var5, var4);
                if (this.field_B != null) {
                  stackIn_159_0 = this.field_B;
                  stackIn_159_1 = -119;
                  if (!this.field_H) {
                    stackIn_160_2 = 0;
                  } else {
                    stackIn_160_2 = this.field_q - this.field_B.field_q;
                  }
                  ((vo) (Object) stackIn_159_0).a(stackIn_159_1, stackIn_160_2, this.field_D.field_v, this.field_D.field_p, this.field_B.field_q);
                }
                if (this.field_G != null) {
                  stackIn_164_0 = this.field_G;
                  stackIn_164_1 = 91;
                  stackIn_164_2 = this.field_D.field_r;
                  if (this.field_A) {
                    stackIn_165_3 = -this.field_G.field_p + this.field_p;
                  } else {
                    stackIn_165_3 = 0;
                  }
                  ((vo) (Object) stackIn_164_0).a(stackIn_164_1, stackIn_164_2, stackIn_165_3, this.field_G.field_p, this.field_D.field_q);
                }
              } else {
                var3 = this.field_G.field_p;
                if (this.field_B != null) {
                  stackIn_134_0 = -this.field_B.field_q + this.field_q;
                } else {
                  stackIn_134_0 = this.field_q;
                }
                var4 = stackIn_134_0;
                if (null == this.field_G) {
                  stackIn_137_0 = this.field_p;
                } else {
                  stackIn_137_0 = -this.field_G.field_p + this.field_p;
                }
                var5 = stackIn_137_0;
                this.field_D.a(-123, var2, var3, var5, var4);
                if (this.field_B != null) {
                  stackIn_141_0 = this.field_B;
                  stackIn_141_1 = -119;
                  if (!this.field_H) {
                    stackIn_142_2 = 0;
                  } else {
                    stackIn_142_2 = this.field_q - this.field_B.field_q;
                  }
                  ((vo) (Object) stackIn_141_0).a(stackIn_141_1, stackIn_142_2, this.field_D.field_v, this.field_D.field_p, this.field_B.field_q);
                }
                if (this.field_G != null) {
                  stackIn_146_0 = this.field_G;
                  stackIn_146_1 = 91;
                  stackIn_146_2 = this.field_D.field_r;
                  if (this.field_A) {
                    stackIn_147_3 = -this.field_G.field_p + this.field_p;
                  } else {
                    stackIn_147_3 = 0;
                  }
                  ((vo) (Object) stackIn_146_0).a(stackIn_146_1, stackIn_146_2, stackIn_147_3, this.field_G.field_p, this.field_D.field_q);
                }
              }
            }
          } else {
            if (this.field_B != null) {
              var2 = this.field_B.field_q;
              if (this.field_A) {
                stackIn_231_0 = 0;
                var3 = stackIn_231_0;
                if (this.field_B != null) {
                  stackIn_234_0 = -this.field_B.field_q + this.field_q;
                } else {
                  stackIn_234_0 = this.field_q;
                }
                var4 = stackIn_234_0;
                if (null == this.field_G) {
                  stackIn_237_0 = this.field_p;
                } else {
                  stackIn_237_0 = -this.field_G.field_p + this.field_p;
                }
                var5 = stackIn_237_0;
                this.field_D.a(-123, var2, var3, var5, var4);
                if (this.field_B != null) {
                  stackIn_241_0 = this.field_B;
                  stackIn_241_1 = -119;
                  if (!this.field_H) {
                    stackIn_242_2 = 0;
                  } else {
                    stackIn_242_2 = this.field_q - this.field_B.field_q;
                  }
                  ((vo) (Object) stackIn_241_0).a(stackIn_241_1, stackIn_242_2, this.field_D.field_v, this.field_D.field_p, this.field_B.field_q);
                }
                if (this.field_G != null) {
                  stackIn_246_0 = this.field_G;
                  stackIn_246_1 = 91;
                  stackIn_246_2 = this.field_D.field_r;
                  if (this.field_A) {
                    stackIn_247_3 = -this.field_G.field_p + this.field_p;
                  } else {
                    stackIn_247_3 = 0;
                  }
                  ((vo) (Object) stackIn_246_0).a(stackIn_246_1, stackIn_246_2, stackIn_247_3, this.field_G.field_p, this.field_D.field_q);
                }
              } else {
                if (null == this.field_G) {
                  var3 = 0;
                  if (this.field_B != null) {
                    stackIn_271_0 = -this.field_B.field_q + this.field_q;
                  } else {
                    stackIn_271_0 = this.field_q;
                  }
                  var4 = stackIn_271_0;
                  if (null == this.field_G) {
                    stackIn_274_0 = this.field_p;
                  } else {
                    stackIn_274_0 = -this.field_G.field_p + this.field_p;
                  }
                  var5 = stackIn_274_0;
                  this.field_D.a(-123, var2, var3, var5, var4);
                  if (this.field_B != null) {
                    stackIn_278_0 = this.field_B;
                    stackIn_278_1 = -119;
                    if (!this.field_H) {
                      stackIn_279_2 = 0;
                    } else {
                      stackIn_279_2 = this.field_q - this.field_B.field_q;
                    }
                    ((vo) (Object) stackIn_278_0).a(stackIn_278_1, stackIn_279_2, this.field_D.field_v, this.field_D.field_p, this.field_B.field_q);
                  }
                  if (this.field_G != null) {
                    stackIn_283_0 = this.field_G;
                    stackIn_283_1 = 91;
                    stackIn_283_2 = this.field_D.field_r;
                    if (this.field_A) {
                      stackIn_284_3 = -this.field_G.field_p + this.field_p;
                    } else {
                      stackIn_284_3 = 0;
                    }
                    ((vo) (Object) stackIn_283_0).a(stackIn_283_1, stackIn_283_2, stackIn_284_3, this.field_G.field_p, this.field_D.field_q);
                  }
                  this.g(1);
                  return;
                }
                var3 = this.field_G.field_p;
                if (this.field_B != null) {
                  stackIn_253_0 = -this.field_B.field_q + this.field_q;
                } else {
                  stackIn_253_0 = this.field_q;
                }
                var4 = stackIn_253_0;
                if (null == this.field_G) {
                  stackIn_256_0 = this.field_p;
                } else {
                  stackIn_256_0 = -this.field_G.field_p + this.field_p;
                }
                var5 = stackIn_256_0;
                this.field_D.a(-123, var2, var3, var5, var4);
                if (this.field_B != null) {
                  stackIn_260_0 = this.field_B;
                  stackIn_260_1 = -119;
                  if (!this.field_H) {
                    stackIn_261_2 = 0;
                  } else {
                    stackIn_261_2 = this.field_q - this.field_B.field_q;
                  }
                  ((vo) (Object) stackIn_260_0).a(stackIn_260_1, stackIn_261_2, this.field_D.field_v, this.field_D.field_p, this.field_B.field_q);
                }
                if (this.field_G != null) {
                  stackIn_265_0 = this.field_G;
                  stackIn_265_1 = 91;
                  stackIn_265_2 = this.field_D.field_r;
                  if (this.field_A) {
                    stackIn_266_3 = -this.field_G.field_p + this.field_p;
                  } else {
                    stackIn_266_3 = 0;
                  }
                  ((vo) (Object) stackIn_265_0).a(stackIn_265_1, stackIn_265_2, stackIn_266_3, this.field_G.field_p, this.field_D.field_q);
                }
              }
              this.g(1);
              return;
            }
            var2 = 0;
            if (this.field_A) {
              stackIn_172_0 = 0;
              var3 = stackIn_172_0;
              if (this.field_B != null) {
                stackIn_175_0 = -this.field_B.field_q + this.field_q;
              } else {
                stackIn_175_0 = this.field_q;
              }
              var4 = stackIn_175_0;
              if (null == this.field_G) {
                stackIn_178_0 = this.field_p;
              } else {
                stackIn_178_0 = -this.field_G.field_p + this.field_p;
              }
              var5 = stackIn_178_0;
              this.field_D.a(-123, var2, var3, var5, var4);
              if (this.field_B != null) {
                stackIn_182_0 = this.field_B;
                stackIn_182_1 = -119;
                if (!this.field_H) {
                  stackIn_183_2 = 0;
                } else {
                  stackIn_183_2 = this.field_q - this.field_B.field_q;
                }
                ((vo) (Object) stackIn_182_0).a(stackIn_182_1, stackIn_183_2, this.field_D.field_v, this.field_D.field_p, this.field_B.field_q);
              }
              if (this.field_G != null) {
                stackIn_187_0 = this.field_G;
                stackIn_187_1 = 91;
                stackIn_187_2 = this.field_D.field_r;
                if (this.field_A) {
                  stackIn_188_3 = -this.field_G.field_p + this.field_p;
                } else {
                  stackIn_188_3 = 0;
                }
                ((vo) (Object) stackIn_187_0).a(stackIn_187_1, stackIn_187_2, stackIn_188_3, this.field_G.field_p, this.field_D.field_q);
              }
            } else {
              if (null == this.field_G) {
                var3 = 0;
                if (this.field_B != null) {
                  stackIn_212_0 = -this.field_B.field_q + this.field_q;
                } else {
                  stackIn_212_0 = this.field_q;
                }
                var4 = stackIn_212_0;
                if (null == this.field_G) {
                  stackIn_215_0 = this.field_p;
                } else {
                  stackIn_215_0 = -this.field_G.field_p + this.field_p;
                }
                var5 = stackIn_215_0;
                this.field_D.a(-123, var2, var3, var5, var4);
                if (this.field_B != null) {
                  stackIn_219_0 = this.field_B;
                  stackIn_219_1 = -119;
                  if (!this.field_H) {
                    stackIn_220_2 = 0;
                  } else {
                    stackIn_220_2 = this.field_q - this.field_B.field_q;
                  }
                  ((vo) (Object) stackIn_219_0).a(stackIn_219_1, stackIn_220_2, this.field_D.field_v, this.field_D.field_p, this.field_B.field_q);
                }
                if (this.field_G != null) {
                  stackIn_224_0 = this.field_G;
                  stackIn_224_1 = 91;
                  stackIn_224_2 = this.field_D.field_r;
                  if (this.field_A) {
                    stackIn_225_3 = -this.field_G.field_p + this.field_p;
                  } else {
                    stackIn_225_3 = 0;
                  }
                  ((vo) (Object) stackIn_224_0).a(stackIn_224_1, stackIn_224_2, stackIn_225_3, this.field_G.field_p, this.field_D.field_q);
                }
              } else {
                var3 = this.field_G.field_p;
                if (this.field_B != null) {
                  stackIn_194_0 = -this.field_B.field_q + this.field_q;
                } else {
                  stackIn_194_0 = this.field_q;
                }
                var4 = stackIn_194_0;
                if (null == this.field_G) {
                  stackIn_197_0 = this.field_p;
                } else {
                  stackIn_197_0 = -this.field_G.field_p + this.field_p;
                }
                var5 = stackIn_197_0;
                this.field_D.a(-123, var2, var3, var5, var4);
                if (this.field_B != null) {
                  stackIn_201_0 = this.field_B;
                  stackIn_201_1 = -119;
                  if (!this.field_H) {
                    stackIn_202_2 = 0;
                  } else {
                    stackIn_202_2 = this.field_q - this.field_B.field_q;
                  }
                  ((vo) (Object) stackIn_201_0).a(stackIn_201_1, stackIn_202_2, this.field_D.field_v, this.field_D.field_p, this.field_B.field_q);
                }
                if (this.field_G != null) {
                  stackIn_206_0 = this.field_G;
                  stackIn_206_1 = 91;
                  stackIn_206_2 = this.field_D.field_r;
                  if (this.field_A) {
                    stackIn_207_3 = -this.field_G.field_p + this.field_p;
                  } else {
                    stackIn_207_3 = 0;
                  }
                  ((vo) (Object) stackIn_206_0).a(stackIn_206_1, stackIn_206_2, stackIn_207_3, this.field_G.field_p, this.field_D.field_q);
                }
              }
            }
          }
        }
        this.g(1);
    }

    static {
        field_J = "This password contains repeated characters, and would be easy to guess";
    }
}
