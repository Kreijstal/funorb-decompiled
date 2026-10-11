/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ai extends hs {
    private boolean field_L;
    private nv field_Q;
    static String field_U;
    qm field_S;
    static bp field_T;
    static String field_J;
    static at field_P;
    static String field_V;
    static String field_R;
    private boolean field_O;
    static int field_M;
    static String field_N;
    nv field_K;

    final boolean a(kb param0, int param1, char param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!super.a(param0, param1, param2, param3)) {
            return false;
          }
          this.e((byte) -110);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("ai.F(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static int a(bv param0, boolean param1) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            field_N = (String) null;
          }
          stackIn_3_0 = de.a(-102, param0, 4, 14, 30, 20);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ai.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, kb param6) {
        RuntimeException var8 = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3, param4, 122, param6)) {
            return true;
          }
          if (param5 <= 93) {
            field_T = (bp) null;
          }
          stackIn_9_0 = (this.a(false)) && (this.c(param4, 959449104));
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_12_0 = var8;
          stackIn_12_1 = new StringBuilder().append("ai.RA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void a(byte param0, boolean param1, nv param2) {
        try {
          this.field_O = param1 ? true : false;
          this.field_K = param2;
          this.field_C[1] = (kb) ((Object) param2);
          if (param0 <= 92) {
            field_R = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "ai.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, kb param3) {
        super.a(param0 + 0, param1, param2, param3);
        this.f((byte) -3);
        if (param0 != 32722) {
          return;
        }
        try {
          this.e((byte) -116);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "ai.P(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void f(byte param0) {
        int var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 != -3) {
          return;
        }
        if (this.field_K != null) {
          if (this.field_S.field_E.field_w <= this.field_S.field_w) {
            this.field_K.b(1, -13127, 1);
            if (this.field_Q == null) {
              return;
            }
            if (this.field_S.field_l < this.field_S.field_E.field_l) {
              this.field_Q.a(this.field_S.field_E.field_l, (byte) 124, this.field_S.field_l);
              return;
            }
            this.field_Q.a(1, (byte) 124, 1);
            return;
          }
          this.field_K.b(this.field_S.field_w, -13127, this.field_S.field_E.field_w);
          if (this.field_Q == null) {
            return;
          }
          if (this.field_S.field_l < this.field_S.field_E.field_l) {
            this.field_Q.a(this.field_S.field_E.field_l, (byte) 124, this.field_S.field_l);
            return;
          }
          this.field_Q.a(1, (byte) 124, 1);
          return;
        }
        if (this.field_Q != null) {
          if (this.field_S.field_l < this.field_S.field_E.field_l) {
            this.field_Q.a(this.field_S.field_E.field_l, (byte) 124, this.field_S.field_l);
            return;
          }
          this.field_Q.a(1, (byte) 124, 1);
          return;
        }
    }

    ai(int param0, int param1, int param2, int param3, kh param4, kb param5, kh param6) {
        super(param0, param1, param2, param3, param4);
        qm dupTemp$0 = null;
        try {
          this.field_C = new kb[3];
          dupTemp$0 = new qm(param0, param1, param2, param3, param6, param5);
          this.field_S = dupTemp$0;
          this.field_C[2] = (kb) ((Object) dupTemp$0);
          this.d((byte) 120);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "ai.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean c(int param0, int param1) {
        if (param1 != 959449104) {
          return false;
        }
        if (null == this.field_K) {
          return false;
        }
        this.field_K.a((byte) -123, this.field_K.field_W + param0 * this.field_K.field_Q);
        return true;
    }

    private final void e(byte param0) {
        if (param0 > -104) {
          this.e((byte) -37);
          if (this.field_K == null) {
            if (null != this.field_Q) {
              this.field_S.field_E.field_B = -(int)((long)this.field_Q.field_T * (long)(-this.field_S.field_l + this.field_S.field_E.field_l) >> 16);
              return;
            }
            return;
          }
          this.field_S.field_E.field_p = -(int)((long)(-this.field_S.field_w + this.field_S.field_E.field_w) * (long)this.field_K.field_W >> 16);
          if (null == this.field_Q) {
            return;
          }
          this.field_S.field_E.field_B = -(int)((long)this.field_Q.field_T * (long)(-this.field_S.field_l + this.field_S.field_E.field_l) >> 16);
          return;
        }
        if (this.field_K != null) {
          this.field_S.field_E.field_p = -(int)((long)(-this.field_S.field_w + this.field_S.field_E.field_w) * (long)this.field_K.field_W >> 16);
          if (null != this.field_Q) {
            this.field_S.field_E.field_B = -(int)((long)this.field_Q.field_T * (long)(-this.field_S.field_l + this.field_S.field_E.field_l) >> 16);
            return;
          }
          return;
        }
        if (null != this.field_Q) {
          this.field_S.field_E.field_B = -(int)((long)this.field_Q.field_T * (long)(-this.field_S.field_l + this.field_S.field_E.field_l) >> 16);
          return;
        }
    }

    final void d(byte param0) {
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        nv stackIn_16_0 = null;
        int stackIn_17_1 = 0;
        nv stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        int stackIn_22_3;
        int stackIn_27_0 = 0;
        nv stackIn_31_0 = null;
        int stackIn_32_1 = 0;
        nv stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int stackIn_36_2 = 0;
        int stackIn_37_3;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        nv stackIn_52_0 = null;
        int stackIn_53_1 = 0;
        nv stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        int stackIn_57_2 = 0;
        int stackIn_58_3;
        int stackIn_63_0 = 0;
        nv stackIn_67_0 = null;
        int stackIn_68_1 = 0;
        nv stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        int stackIn_72_2 = 0;
        int stackIn_73_3;
        int stackIn_79_0 = 0;
        int stackIn_83_0 = 0;
        nv stackIn_87_0 = null;
        int stackIn_88_1 = 0;
        nv stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        int stackIn_92_2 = 0;
        int stackIn_93_3;
        int stackIn_98_0 = 0;
        nv stackIn_102_0 = null;
        int stackIn_103_1 = 0;
        nv stackIn_107_0 = null;
        int stackIn_107_1 = 0;
        int stackIn_107_2 = 0;
        int stackIn_108_3;
        int stackIn_113_0 = 0;
        int stackIn_117_0 = 0;
        nv stackIn_121_0 = null;
        int stackIn_122_1 = 0;
        nv stackIn_126_0 = null;
        int stackIn_126_1 = 0;
        int stackIn_126_2 = 0;
        int stackIn_127_3;
        int stackIn_132_0 = 0;
        nv stackIn_136_0 = null;
        int stackIn_137_1 = 0;
        nv stackIn_141_0 = null;
        int stackIn_141_1 = 0;
        int stackIn_141_2 = 0;
        int stackIn_142_3;
        int stackIn_148_0 = 0;
        int stackIn_152_0 = 0;
        nv stackIn_156_0 = null;
        int stackIn_157_1 = 0;
        nv stackIn_161_0 = null;
        int stackIn_161_1 = 0;
        int stackIn_161_2 = 0;
        int stackIn_162_3;
        int stackIn_167_0 = 0;
        nv stackIn_171_0 = null;
        int stackIn_172_1 = 0;
        nv stackIn_176_0 = null;
        int stackIn_176_1 = 0;
        int stackIn_176_2 = 0;
        int stackIn_177_3;
        int stackIn_183_0 = 0;
        int stackIn_187_0 = 0;
        nv stackIn_191_0 = null;
        int stackIn_192_1 = 0;
        nv stackIn_196_0 = null;
        int stackIn_196_1 = 0;
        int stackIn_196_2 = 0;
        int stackIn_197_3;
        int stackIn_202_0 = 0;
        nv stackIn_206_0 = null;
        int stackIn_207_1 = 0;
        nv stackIn_211_0 = null;
        int stackIn_211_1 = 0;
        int stackIn_211_2 = 0;
        int stackIn_212_3;
        int stackIn_217_0 = 0;
        int stackIn_221_0 = 0;
        nv stackIn_225_0 = null;
        int stackIn_226_1 = 0;
        nv stackIn_230_0 = null;
        int stackIn_230_1 = 0;
        int stackIn_230_2 = 0;
        int stackIn_231_3;
        int stackIn_236_0 = 0;
        nv stackIn_240_0 = null;
        int stackIn_241_1 = 0;
        nv stackIn_245_0 = null;
        int stackIn_245_1 = 0;
        int stackIn_245_2 = 0;
        int stackIn_246_3;
        int var2;
        int var3;
        int var4;
        int var5;
        if (this.field_O) {
          var2 = 0;
          if (!this.field_L &&
            this.field_Q != null) {
            stackIn_5_0 = this.field_Q.field_w;
          } else {
            stackIn_5_0 = 0;
          }
          var3 = stackIn_5_0;
          if (this.field_K != null) {
            stackIn_8_0 = this.field_l - this.field_K.field_l;
          } else {
            stackIn_8_0 = this.field_l;
          }
          var4 = stackIn_8_0;
          if (param0 > 84) {
            if (this.field_Q != null) {
              stackIn_27_0 = this.field_w - this.field_Q.field_w;
            } else {
              stackIn_27_0 = this.field_w;
            }
            var5 = stackIn_27_0;
            this.field_S.a(var2, var4, var3, 8192, var5);
            if (this.field_K != null) {
              stackIn_31_0 = this.field_K;
              if (!this.field_O) {
                stackIn_32_1 = 0;
              } else {
                stackIn_32_1 = this.field_l - this.field_K.field_l;
              }
              ((nv) (Object) stackIn_31_0).a(stackIn_32_1, this.field_K.field_l, this.field_S.field_p, 8192, this.field_S.field_w);
            }
            if (null != this.field_Q) {
              stackIn_36_0 = this.field_Q;
              stackIn_36_1 = this.field_S.field_B;
              stackIn_36_2 = this.field_S.field_l;
              if (this.field_L) {
                stackIn_37_3 = this.field_w - this.field_Q.field_w;
              } else {
                stackIn_37_3 = 0;
              }
              ((nv) (Object) stackIn_36_0).a(stackIn_36_1, stackIn_36_2, stackIn_37_3, 8192, this.field_Q.field_w);
            }
          } else {
            this.d((byte) -27);
            if (this.field_Q != null) {
              stackIn_12_0 = this.field_w - this.field_Q.field_w;
            } else {
              stackIn_12_0 = this.field_w;
            }
            var5 = stackIn_12_0;
            this.field_S.a(var2, var4, var3, 8192, var5);
            if (this.field_K != null) {
              stackIn_16_0 = this.field_K;
              if (!this.field_O) {
                stackIn_17_1 = 0;
              } else {
                stackIn_17_1 = this.field_l - this.field_K.field_l;
              }
              ((nv) (Object) stackIn_16_0).a(stackIn_17_1, this.field_K.field_l, this.field_S.field_p, 8192, this.field_S.field_w);
            }
            if (null != this.field_Q) {
              stackIn_21_0 = this.field_Q;
              stackIn_21_1 = this.field_S.field_B;
              stackIn_21_2 = this.field_S.field_l;
              if (this.field_L) {
                stackIn_22_3 = this.field_w - this.field_Q.field_w;
              } else {
                stackIn_22_3 = 0;
              }
              ((nv) (Object) stackIn_21_0).a(stackIn_21_1, stackIn_21_2, stackIn_22_3, 8192, this.field_Q.field_w);
            }
          }
        } else {
          if (null != this.field_K) {
            var2 = this.field_K.field_l;
            if (this.field_L) {
              var3 = 0;
              if (this.field_K != null) {
                stackIn_148_0 = this.field_l - this.field_K.field_l;
              } else {
                stackIn_148_0 = this.field_l;
              }
              var4 = stackIn_148_0;
              if (param0 > 84) {
                if (this.field_Q != null) {
                  stackIn_167_0 = this.field_w - this.field_Q.field_w;
                } else {
                  stackIn_167_0 = this.field_w;
                }
                var5 = stackIn_167_0;
                this.field_S.a(var2, var4, var3, 8192, var5);
                if (this.field_K != null) {
                  stackIn_171_0 = this.field_K;
                  if (!this.field_O) {
                    stackIn_172_1 = 0;
                  } else {
                    stackIn_172_1 = this.field_l - this.field_K.field_l;
                  }
                  ((nv) (Object) stackIn_171_0).a(stackIn_172_1, this.field_K.field_l, this.field_S.field_p, 8192, this.field_S.field_w);
                }
                if (null != this.field_Q) {
                  stackIn_176_0 = this.field_Q;
                  stackIn_176_1 = this.field_S.field_B;
                  stackIn_176_2 = this.field_S.field_l;
                  if (this.field_L) {
                    stackIn_177_3 = this.field_w - this.field_Q.field_w;
                  } else {
                    stackIn_177_3 = 0;
                  }
                  ((nv) (Object) stackIn_176_0).a(stackIn_176_1, stackIn_176_2, stackIn_177_3, 8192, this.field_Q.field_w);
                }
              } else {
                this.d((byte) -27);
                if (this.field_Q != null) {
                  stackIn_152_0 = this.field_w - this.field_Q.field_w;
                } else {
                  stackIn_152_0 = this.field_w;
                }
                var5 = stackIn_152_0;
                this.field_S.a(var2, var4, var3, 8192, var5);
                if (this.field_K != null) {
                  stackIn_156_0 = this.field_K;
                  if (!this.field_O) {
                    stackIn_157_1 = 0;
                  } else {
                    stackIn_157_1 = this.field_l - this.field_K.field_l;
                  }
                  ((nv) (Object) stackIn_156_0).a(stackIn_157_1, this.field_K.field_l, this.field_S.field_p, 8192, this.field_S.field_w);
                }
                if (null != this.field_Q) {
                  stackIn_161_0 = this.field_Q;
                  stackIn_161_1 = this.field_S.field_B;
                  stackIn_161_2 = this.field_S.field_l;
                  if (this.field_L) {
                    stackIn_162_3 = this.field_w - this.field_Q.field_w;
                  } else {
                    stackIn_162_3 = 0;
                  }
                  ((nv) (Object) stackIn_161_0).a(stackIn_161_1, stackIn_161_2, stackIn_162_3, 8192, this.field_Q.field_w);
                }
              }
            } else {
              if (this.field_Q != null) {
                var3 = this.field_Q.field_w;
                if (this.field_K != null) {
                  stackIn_217_0 = this.field_l - this.field_K.field_l;
                } else {
                  stackIn_217_0 = this.field_l;
                }
                var4 = stackIn_217_0;
                if (param0 > 84) {
                  if (this.field_Q != null) {
                    stackIn_236_0 = this.field_w - this.field_Q.field_w;
                  } else {
                    stackIn_236_0 = this.field_w;
                  }
                  var5 = stackIn_236_0;
                  this.field_S.a(var2, var4, var3, 8192, var5);
                  if (this.field_K != null) {
                    stackIn_240_0 = this.field_K;
                    if (!this.field_O) {
                      stackIn_241_1 = 0;
                    } else {
                      stackIn_241_1 = this.field_l - this.field_K.field_l;
                    }
                    ((nv) (Object) stackIn_240_0).a(stackIn_241_1, this.field_K.field_l, this.field_S.field_p, 8192, this.field_S.field_w);
                  }
                  if (null != this.field_Q) {
                    stackIn_245_0 = this.field_Q;
                    stackIn_245_1 = this.field_S.field_B;
                    stackIn_245_2 = this.field_S.field_l;
                    if (this.field_L) {
                      stackIn_246_3 = this.field_w - this.field_Q.field_w;
                    } else {
                      stackIn_246_3 = 0;
                    }
                    ((nv) (Object) stackIn_245_0).a(stackIn_245_1, stackIn_245_2, stackIn_246_3, 8192, this.field_Q.field_w);
                  }
                  this.f((byte) -3);
                  return;
                }
                this.d((byte) -27);
                if (this.field_Q != null) {
                  stackIn_221_0 = this.field_w - this.field_Q.field_w;
                } else {
                  stackIn_221_0 = this.field_w;
                }
                var5 = stackIn_221_0;
                this.field_S.a(var2, var4, var3, 8192, var5);
                if (this.field_K != null) {
                  stackIn_225_0 = this.field_K;
                  if (!this.field_O) {
                    stackIn_226_1 = 0;
                  } else {
                    stackIn_226_1 = this.field_l - this.field_K.field_l;
                  }
                  ((nv) (Object) stackIn_225_0).a(stackIn_226_1, this.field_K.field_l, this.field_S.field_p, 8192, this.field_S.field_w);
                }
                if (null != this.field_Q) {
                  stackIn_230_0 = this.field_Q;
                  stackIn_230_1 = this.field_S.field_B;
                  stackIn_230_2 = this.field_S.field_l;
                  if (this.field_L) {
                    stackIn_231_3 = this.field_w - this.field_Q.field_w;
                  } else {
                    stackIn_231_3 = 0;
                  }
                  ((nv) (Object) stackIn_230_0).a(stackIn_230_1, stackIn_230_2, stackIn_231_3, 8192, this.field_Q.field_w);
                }
                this.f((byte) -3);
                return;
              }
              var3 = 0;
              if (this.field_K != null) {
                stackIn_183_0 = this.field_l - this.field_K.field_l;
              } else {
                stackIn_183_0 = this.field_l;
              }
              var4 = stackIn_183_0;
              if (param0 > 84) {
                if (this.field_Q != null) {
                  stackIn_202_0 = this.field_w - this.field_Q.field_w;
                } else {
                  stackIn_202_0 = this.field_w;
                }
                var5 = stackIn_202_0;
                this.field_S.a(var2, var4, var3, 8192, var5);
                if (this.field_K != null) {
                  stackIn_206_0 = this.field_K;
                  if (!this.field_O) {
                    stackIn_207_1 = 0;
                  } else {
                    stackIn_207_1 = this.field_l - this.field_K.field_l;
                  }
                  ((nv) (Object) stackIn_206_0).a(stackIn_207_1, this.field_K.field_l, this.field_S.field_p, 8192, this.field_S.field_w);
                }
                if (null != this.field_Q) {
                  stackIn_211_0 = this.field_Q;
                  stackIn_211_1 = this.field_S.field_B;
                  stackIn_211_2 = this.field_S.field_l;
                  if (this.field_L) {
                    stackIn_212_3 = this.field_w - this.field_Q.field_w;
                  } else {
                    stackIn_212_3 = 0;
                  }
                  ((nv) (Object) stackIn_211_0).a(stackIn_211_1, stackIn_211_2, stackIn_212_3, 8192, this.field_Q.field_w);
                }
              } else {
                this.d((byte) -27);
                if (this.field_Q != null) {
                  stackIn_187_0 = this.field_w - this.field_Q.field_w;
                } else {
                  stackIn_187_0 = this.field_w;
                }
                var5 = stackIn_187_0;
                this.field_S.a(var2, var4, var3, 8192, var5);
                if (this.field_K != null) {
                  stackIn_191_0 = this.field_K;
                  if (!this.field_O) {
                    stackIn_192_1 = 0;
                  } else {
                    stackIn_192_1 = this.field_l - this.field_K.field_l;
                  }
                  ((nv) (Object) stackIn_191_0).a(stackIn_192_1, this.field_K.field_l, this.field_S.field_p, 8192, this.field_S.field_w);
                }
                if (null != this.field_Q) {
                  stackIn_196_0 = this.field_Q;
                  stackIn_196_1 = this.field_S.field_B;
                  stackIn_196_2 = this.field_S.field_l;
                  if (this.field_L) {
                    stackIn_197_3 = this.field_w - this.field_Q.field_w;
                  } else {
                    stackIn_197_3 = 0;
                  }
                  ((nv) (Object) stackIn_196_0).a(stackIn_196_1, stackIn_196_2, stackIn_197_3, 8192, this.field_Q.field_w);
                }
              }
            }
            this.f((byte) -3);
            return;
          }
          var2 = 0;
          if (this.field_L) {
            var3 = 0;
            if (this.field_K != null) {
              stackIn_44_0 = this.field_l - this.field_K.field_l;
            } else {
              stackIn_44_0 = this.field_l;
            }
            var4 = stackIn_44_0;
            if (param0 > 84) {
              if (this.field_Q != null) {
                stackIn_63_0 = this.field_w - this.field_Q.field_w;
              } else {
                stackIn_63_0 = this.field_w;
              }
              var5 = stackIn_63_0;
              this.field_S.a(var2, var4, var3, 8192, var5);
              if (this.field_K != null) {
                stackIn_67_0 = this.field_K;
                if (!this.field_O) {
                  stackIn_68_1 = 0;
                } else {
                  stackIn_68_1 = this.field_l - this.field_K.field_l;
                }
                ((nv) (Object) stackIn_67_0).a(stackIn_68_1, this.field_K.field_l, this.field_S.field_p, 8192, this.field_S.field_w);
              }
              if (null != this.field_Q) {
                stackIn_72_0 = this.field_Q;
                stackIn_72_1 = this.field_S.field_B;
                stackIn_72_2 = this.field_S.field_l;
                if (this.field_L) {
                  stackIn_73_3 = this.field_w - this.field_Q.field_w;
                } else {
                  stackIn_73_3 = 0;
                }
                ((nv) (Object) stackIn_72_0).a(stackIn_72_1, stackIn_72_2, stackIn_73_3, 8192, this.field_Q.field_w);
              }
            } else {
              this.d((byte) -27);
              if (this.field_Q != null) {
                stackIn_48_0 = this.field_w - this.field_Q.field_w;
              } else {
                stackIn_48_0 = this.field_w;
              }
              var5 = stackIn_48_0;
              this.field_S.a(var2, var4, var3, 8192, var5);
              if (this.field_K != null) {
                stackIn_52_0 = this.field_K;
                if (!this.field_O) {
                  stackIn_53_1 = 0;
                } else {
                  stackIn_53_1 = this.field_l - this.field_K.field_l;
                }
                ((nv) (Object) stackIn_52_0).a(stackIn_53_1, this.field_K.field_l, this.field_S.field_p, 8192, this.field_S.field_w);
              }
              if (null != this.field_Q) {
                stackIn_57_0 = this.field_Q;
                stackIn_57_1 = this.field_S.field_B;
                stackIn_57_2 = this.field_S.field_l;
                if (this.field_L) {
                  stackIn_58_3 = this.field_w - this.field_Q.field_w;
                } else {
                  stackIn_58_3 = 0;
                }
                ((nv) (Object) stackIn_57_0).a(stackIn_57_1, stackIn_57_2, stackIn_58_3, 8192, this.field_Q.field_w);
              }
            }
          } else {
            if (this.field_Q != null) {
              var3 = this.field_Q.field_w;
              if (this.field_K != null) {
                stackIn_113_0 = this.field_l - this.field_K.field_l;
              } else {
                stackIn_113_0 = this.field_l;
              }
              var4 = stackIn_113_0;
              if (param0 > 84) {
                if (this.field_Q != null) {
                  stackIn_132_0 = this.field_w - this.field_Q.field_w;
                } else {
                  stackIn_132_0 = this.field_w;
                }
                var5 = stackIn_132_0;
                this.field_S.a(var2, var4, var3, 8192, var5);
                if (this.field_K != null) {
                  stackIn_136_0 = this.field_K;
                  if (!this.field_O) {
                    stackIn_137_1 = 0;
                  } else {
                    stackIn_137_1 = this.field_l - this.field_K.field_l;
                  }
                  ((nv) (Object) stackIn_136_0).a(stackIn_137_1, this.field_K.field_l, this.field_S.field_p, 8192, this.field_S.field_w);
                }
                if (null != this.field_Q) {
                  stackIn_141_0 = this.field_Q;
                  stackIn_141_1 = this.field_S.field_B;
                  stackIn_141_2 = this.field_S.field_l;
                  if (this.field_L) {
                    stackIn_142_3 = this.field_w - this.field_Q.field_w;
                  } else {
                    stackIn_142_3 = 0;
                  }
                  ((nv) (Object) stackIn_141_0).a(stackIn_141_1, stackIn_141_2, stackIn_142_3, 8192, this.field_Q.field_w);
                }
              } else {
                this.d((byte) -27);
                if (this.field_Q != null) {
                  stackIn_117_0 = this.field_w - this.field_Q.field_w;
                } else {
                  stackIn_117_0 = this.field_w;
                }
                var5 = stackIn_117_0;
                this.field_S.a(var2, var4, var3, 8192, var5);
                if (this.field_K != null) {
                  stackIn_121_0 = this.field_K;
                  if (!this.field_O) {
                    stackIn_122_1 = 0;
                  } else {
                    stackIn_122_1 = this.field_l - this.field_K.field_l;
                  }
                  ((nv) (Object) stackIn_121_0).a(stackIn_122_1, this.field_K.field_l, this.field_S.field_p, 8192, this.field_S.field_w);
                }
                if (null != this.field_Q) {
                  stackIn_126_0 = this.field_Q;
                  stackIn_126_1 = this.field_S.field_B;
                  stackIn_126_2 = this.field_S.field_l;
                  if (this.field_L) {
                    stackIn_127_3 = this.field_w - this.field_Q.field_w;
                  } else {
                    stackIn_127_3 = 0;
                  }
                  ((nv) (Object) stackIn_126_0).a(stackIn_126_1, stackIn_126_2, stackIn_127_3, 8192, this.field_Q.field_w);
                }
              }
            } else {
              var3 = 0;
              if (this.field_K != null) {
                stackIn_79_0 = this.field_l - this.field_K.field_l;
              } else {
                stackIn_79_0 = this.field_l;
              }
              var4 = stackIn_79_0;
              if (param0 > 84) {
                if (this.field_Q != null) {
                  stackIn_98_0 = this.field_w - this.field_Q.field_w;
                } else {
                  stackIn_98_0 = this.field_w;
                }
                var5 = stackIn_98_0;
                this.field_S.a(var2, var4, var3, 8192, var5);
                if (this.field_K != null) {
                  stackIn_102_0 = this.field_K;
                  if (!this.field_O) {
                    stackIn_103_1 = 0;
                  } else {
                    stackIn_103_1 = this.field_l - this.field_K.field_l;
                  }
                  ((nv) (Object) stackIn_102_0).a(stackIn_103_1, this.field_K.field_l, this.field_S.field_p, 8192, this.field_S.field_w);
                }
                if (null != this.field_Q) {
                  stackIn_107_0 = this.field_Q;
                  stackIn_107_1 = this.field_S.field_B;
                  stackIn_107_2 = this.field_S.field_l;
                  if (this.field_L) {
                    stackIn_108_3 = this.field_w - this.field_Q.field_w;
                  } else {
                    stackIn_108_3 = 0;
                  }
                  ((nv) (Object) stackIn_107_0).a(stackIn_107_1, stackIn_107_2, stackIn_108_3, 8192, this.field_Q.field_w);
                }
              } else {
                this.d((byte) -27);
                if (this.field_Q != null) {
                  stackIn_83_0 = this.field_w - this.field_Q.field_w;
                } else {
                  stackIn_83_0 = this.field_w;
                }
                var5 = stackIn_83_0;
                this.field_S.a(var2, var4, var3, 8192, var5);
                if (this.field_K != null) {
                  stackIn_87_0 = this.field_K;
                  if (!this.field_O) {
                    stackIn_88_1 = 0;
                  } else {
                    stackIn_88_1 = this.field_l - this.field_K.field_l;
                  }
                  ((nv) (Object) stackIn_87_0).a(stackIn_88_1, this.field_K.field_l, this.field_S.field_p, 8192, this.field_S.field_w);
                }
                if (null != this.field_Q) {
                  stackIn_92_0 = this.field_Q;
                  stackIn_92_1 = this.field_S.field_B;
                  stackIn_92_2 = this.field_S.field_l;
                  if (this.field_L) {
                    stackIn_93_3 = this.field_w - this.field_Q.field_w;
                  } else {
                    stackIn_93_3 = 0;
                  }
                  ((nv) (Object) stackIn_92_0).a(stackIn_92_1, stackIn_92_2, stackIn_93_3, 8192, this.field_Q.field_w);
                }
              }
            }
          }
        }
        this.f((byte) -3);
    }

    public static void b(boolean param0) {
        field_U = null;
        field_P = null;
        field_T = null;
        field_N = null;
        field_R = null;
        if (param0) {
          return;
        }
        field_J = null;
        field_V = null;
    }

    static {
        field_U = "Pause Menu";
        field_J = "Camouflaged armour helps to protect against damage from flying units.";
        field_R = "Hide private chat and appear offline to friends";
        field_V = "Campaigns";
        field_N = "Select a unit to use this item on.";
        field_M = 1;
        field_P = new at();
    }
}
