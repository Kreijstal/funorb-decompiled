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
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              this.e((byte) -110);
              stackIn_3_0 = 1;
              break L0;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("ai.F(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final static int a(bv param0, boolean param1) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                field_N = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = de.a(-102, param0, 4, 14, 30, 20);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("ai.C(");

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
        return stackIn_3_0;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, kb param6) {
        RuntimeException var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3, param4, 122, param6)) {
              L1: {
                if (param5 > 93) {
                  break L1;
                } else {
                  field_T = (bp) null;
                  break L1;
                }
              }
              L2: {
                L3: {
                  if (!this.a(false)) {
                    break L3;
                  } else {
                    if (!this.c(param4, 959449104)) {
                      break L3;
                    } else {
                      stackIn_9_0 = 1;
                      break L2;
                    }
                  }
                }
                stackIn_9_0 = 0;
                break L2;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var8);

            stackIn_12_1 = new StringBuilder().append("ai.RA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_9_0 != 0;
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
        this.field_K.a((byte) -123, this.field_K.field_W - -(param0 * this.field_K.field_Q));
        return true;
    }

    private final void e(byte param0) {
        if (param0 > -104) {
            this.e((byte) -37);
            if (this.field_K == null) {
                if (null != this.field_Q) {
                    this.field_S.field_E.field_B = -(int)((long)this.field_Q.field_T * (long)(-this.field_S.field_l + this.field_S.field_E.field_l) >> -1174617584);
                    return;
                }
                return;
            }
            this.field_S.field_E.field_p = -(int)((long)(-this.field_S.field_w + this.field_S.field_E.field_w) * (long)this.field_K.field_W >> 959449104);
            if (null == this.field_Q) {
                return;
            }
            this.field_S.field_E.field_B = -(int)((long)this.field_Q.field_T * (long)(-this.field_S.field_l + this.field_S.field_E.field_l) >> -1174617584);
            return;
        }
        if (this.field_K != null) {
            this.field_S.field_E.field_p = -(int)((long)(-this.field_S.field_w + this.field_S.field_E.field_w) * (long)this.field_K.field_W >> 959449104);
            if (null != this.field_Q) {
                this.field_S.field_E.field_B = -(int)((long)this.field_Q.field_T * (long)(-this.field_S.field_l + this.field_S.field_E.field_l) >> -1174617584);
                return;
            }
            return;
        }
        if (null != this.field_Q) {
            this.field_S.field_E.field_B = -(int)((long)this.field_Q.field_T * (long)(-this.field_S.field_l + this.field_S.field_E.field_l) >> -1174617584);
            return;
        }
    }

    final void d(byte param0) {
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        nv stackIn_16_0 = null;
        nv stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        nv stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        nv stackIn_22_0;
        int stackIn_22_1;
        int stackIn_22_2;
        int stackIn_22_3;
        int stackIn_27_0 = 0;
        nv stackIn_31_0 = null;
        nv stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        nv stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int stackIn_36_2 = 0;
        nv stackIn_37_0;
        int stackIn_37_1;
        int stackIn_37_2;
        int stackIn_37_3;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        nv stackIn_52_0 = null;
        nv stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        nv stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        int stackIn_57_2 = 0;
        nv stackIn_58_0;
        int stackIn_58_1;
        int stackIn_58_2;
        int stackIn_58_3;
        int stackIn_63_0 = 0;
        nv stackIn_67_0 = null;
        nv stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        nv stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        int stackIn_72_2 = 0;
        nv stackIn_73_0;
        int stackIn_73_1;
        int stackIn_73_2;
        int stackIn_73_3;
        int stackIn_79_0 = 0;
        int stackIn_83_0 = 0;
        nv stackIn_87_0 = null;
        nv stackIn_88_0 = null;
        int stackIn_88_1 = 0;
        nv stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        int stackIn_92_2 = 0;
        nv stackIn_93_0;
        int stackIn_93_1;
        int stackIn_93_2;
        int stackIn_93_3;
        int stackIn_98_0 = 0;
        nv stackIn_102_0 = null;
        nv stackIn_103_0 = null;
        int stackIn_103_1 = 0;
        nv stackIn_107_0 = null;
        int stackIn_107_1 = 0;
        int stackIn_107_2 = 0;
        nv stackIn_108_0;
        int stackIn_108_1;
        int stackIn_108_2;
        int stackIn_108_3;
        int stackIn_113_0 = 0;
        int stackIn_117_0 = 0;
        nv stackIn_121_0 = null;
        nv stackIn_122_0 = null;
        int stackIn_122_1 = 0;
        nv stackIn_126_0 = null;
        int stackIn_126_1 = 0;
        int stackIn_126_2 = 0;
        nv stackIn_127_0;
        int stackIn_127_1;
        int stackIn_127_2;
        int stackIn_127_3;
        int stackIn_132_0 = 0;
        nv stackIn_136_0 = null;
        nv stackIn_137_0 = null;
        int stackIn_137_1 = 0;
        nv stackIn_141_0 = null;
        int stackIn_141_1 = 0;
        int stackIn_141_2 = 0;
        nv stackIn_142_0;
        int stackIn_142_1;
        int stackIn_142_2;
        int stackIn_142_3;
        int stackIn_148_0 = 0;
        int stackIn_152_0 = 0;
        nv stackIn_156_0 = null;
        nv stackIn_157_0 = null;
        int stackIn_157_1 = 0;
        nv stackIn_161_0 = null;
        int stackIn_161_1 = 0;
        int stackIn_161_2 = 0;
        nv stackIn_162_0;
        int stackIn_162_1;
        int stackIn_162_2;
        int stackIn_162_3;
        int stackIn_167_0 = 0;
        nv stackIn_171_0 = null;
        nv stackIn_172_0 = null;
        int stackIn_172_1 = 0;
        nv stackIn_176_0 = null;
        int stackIn_176_1 = 0;
        int stackIn_176_2 = 0;
        nv stackIn_177_0;
        int stackIn_177_1;
        int stackIn_177_2;
        int stackIn_177_3;
        int stackIn_183_0 = 0;
        int stackIn_187_0 = 0;
        nv stackIn_191_0 = null;
        nv stackIn_192_0 = null;
        int stackIn_192_1 = 0;
        nv stackIn_196_0 = null;
        int stackIn_196_1 = 0;
        int stackIn_196_2 = 0;
        nv stackIn_197_0;
        int stackIn_197_1;
        int stackIn_197_2;
        int stackIn_197_3;
        int stackIn_202_0 = 0;
        nv stackIn_206_0 = null;
        nv stackIn_207_0 = null;
        int stackIn_207_1 = 0;
        nv stackIn_211_0 = null;
        int stackIn_211_1 = 0;
        int stackIn_211_2 = 0;
        nv stackIn_212_0;
        int stackIn_212_1;
        int stackIn_212_2;
        int stackIn_212_3;
        int stackIn_217_0 = 0;
        int stackIn_221_0 = 0;
        nv stackIn_225_0 = null;
        nv stackIn_226_0 = null;
        int stackIn_226_1 = 0;
        nv stackIn_230_0 = null;
        int stackIn_230_1 = 0;
        int stackIn_230_2 = 0;
        nv stackIn_231_0;
        int stackIn_231_1;
        int stackIn_231_2;
        int stackIn_231_3;
        int stackIn_236_0 = 0;
        nv stackIn_240_0 = null;
        nv stackIn_241_0 = null;
        int stackIn_241_1 = 0;
        nv stackIn_245_0 = null;
        int stackIn_245_1 = 0;
        int stackIn_245_2 = 0;
        nv stackIn_246_0;
        int stackIn_246_1;
        int stackIn_246_2;
        int stackIn_246_3;
        int var2;
        int var3;
        int var4;
        int var5;
        if (!this.field_O) {
          if (null != this.field_K) {
            var2 = this.field_K.field_l;
            if (!this.field_L) {
              if (this.field_Q != null) {
                L0: {
                  var3 = this.field_Q.field_w;
                  if (this.field_K != null) {
                    stackIn_217_0 = this.field_l + -this.field_K.field_l;
                    break L0;
                  } else {
                    stackIn_217_0 = this.field_l;
                    break L0;
                  }
                }
                var4 = stackIn_217_0;
                if (param0 > 84) {
                  L1: {
                    if (this.field_Q != null) {
                      stackIn_236_0 = this.field_w - this.field_Q.field_w;
                      break L1;
                    } else {
                      stackIn_236_0 = this.field_w;
                      break L1;
                    }
                  }
                  L2: {
                    var5 = stackIn_236_0;
                    this.field_S.a(var2, var4, var3, 8192, var5);
                    if (this.field_K != null) {
                      L3: {
                        stackIn_240_0 = this.field_K;

                        if (!this.field_O) {
                          stackIn_241_0 = (nv) ((Object) stackIn_240_0);
                          stackIn_241_1 = 0;
                          break L3;
                        } else {
                          stackIn_241_0 = (nv) ((Object) stackIn_240_0);
                          stackIn_241_1 = this.field_l - this.field_K.field_l;
                          break L3;
                        }
                      }
                      ((nv) (Object) stackIn_241_0).a(stackIn_241_1, this.field_K.field_l, this.field_S.field_p, 8192, this.field_S.field_w);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L4: {
                    if (null == this.field_Q) {
                      break L4;
                    } else {
                      L5: {
                        stackIn_245_0 = this.field_Q;

                        stackIn_245_1 = this.field_S.field_B;

                        stackIn_245_2 = this.field_S.field_l;

                        if (this.field_L) {
                          stackIn_246_0 = (nv) ((Object) stackIn_245_0);
                          stackIn_246_1 = stackIn_245_1;
                          stackIn_246_2 = stackIn_245_2;
                          stackIn_246_3 = this.field_w - this.field_Q.field_w;
                          break L5;
                        } else {
                          stackIn_246_0 = (nv) ((Object) stackIn_245_0);
                          stackIn_246_1 = stackIn_245_1;
                          stackIn_246_2 = stackIn_245_2;
                          stackIn_246_3 = 0;
                          break L5;
                        }
                      }
                      ((nv) (Object) stackIn_246_0).a(stackIn_246_1, stackIn_246_2, stackIn_246_3, 8192, this.field_Q.field_w);
                      break L4;
                    }
                  }
                  this.f((byte) -3);
                  return;
                } else {
                  L6: {
                    this.d((byte) -27);
                    if (this.field_Q != null) {
                      stackIn_221_0 = this.field_w - this.field_Q.field_w;
                      break L6;
                    } else {
                      stackIn_221_0 = this.field_w;
                      break L6;
                    }
                  }
                  L7: {
                    var5 = stackIn_221_0;
                    this.field_S.a(var2, var4, var3, 8192, var5);
                    if (this.field_K != null) {
                      L8: {
                        stackIn_225_0 = this.field_K;

                        if (!this.field_O) {
                          stackIn_226_0 = (nv) ((Object) stackIn_225_0);
                          stackIn_226_1 = 0;
                          break L8;
                        } else {
                          stackIn_226_0 = (nv) ((Object) stackIn_225_0);
                          stackIn_226_1 = this.field_l - this.field_K.field_l;
                          break L8;
                        }
                      }
                      ((nv) (Object) stackIn_226_0).a(stackIn_226_1, this.field_K.field_l, this.field_S.field_p, 8192, this.field_S.field_w);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L9: {
                    if (null == this.field_Q) {
                      break L9;
                    } else {
                      L10: {
                        stackIn_230_0 = this.field_Q;

                        stackIn_230_1 = this.field_S.field_B;

                        stackIn_230_2 = this.field_S.field_l;

                        if (this.field_L) {
                          stackIn_231_0 = (nv) ((Object) stackIn_230_0);
                          stackIn_231_1 = stackIn_230_1;
                          stackIn_231_2 = stackIn_230_2;
                          stackIn_231_3 = this.field_w - this.field_Q.field_w;
                          break L10;
                        } else {
                          stackIn_231_0 = (nv) ((Object) stackIn_230_0);
                          stackIn_231_1 = stackIn_230_1;
                          stackIn_231_2 = stackIn_230_2;
                          stackIn_231_3 = 0;
                          break L10;
                        }
                      }
                      ((nv) (Object) stackIn_231_0).a(stackIn_231_1, stackIn_231_2, stackIn_231_3, 8192, this.field_Q.field_w);
                      break L9;
                    }
                  }
                  this.f((byte) -3);
                  return;
                }
              } else {
                L11: {
                  var3 = 0;
                  if (this.field_K != null) {
                    stackIn_183_0 = this.field_l + -this.field_K.field_l;
                    break L11;
                  } else {
                    stackIn_183_0 = this.field_l;
                    break L11;
                  }
                }
                var4 = stackIn_183_0;
                if (param0 > 84) {
                  L12: {
                    if (this.field_Q != null) {
                      stackIn_202_0 = this.field_w - this.field_Q.field_w;
                      break L12;
                    } else {
                      stackIn_202_0 = this.field_w;
                      break L12;
                    }
                  }
                  L13: {
                    var5 = stackIn_202_0;
                    this.field_S.a(var2, var4, var3, 8192, var5);
                    if (this.field_K != null) {
                      L14: {
                        stackIn_206_0 = this.field_K;

                        if (!this.field_O) {
                          stackIn_207_0 = (nv) ((Object) stackIn_206_0);
                          stackIn_207_1 = 0;
                          break L14;
                        } else {
                          stackIn_207_0 = (nv) ((Object) stackIn_206_0);
                          stackIn_207_1 = this.field_l - this.field_K.field_l;
                          break L14;
                        }
                      }
                      ((nv) (Object) stackIn_207_0).a(stackIn_207_1, this.field_K.field_l, this.field_S.field_p, 8192, this.field_S.field_w);
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L15: {
                    if (null == this.field_Q) {
                      break L15;
                    } else {
                      L16: {
                        stackIn_211_0 = this.field_Q;

                        stackIn_211_1 = this.field_S.field_B;

                        stackIn_211_2 = this.field_S.field_l;

                        if (this.field_L) {
                          stackIn_212_0 = (nv) ((Object) stackIn_211_0);
                          stackIn_212_1 = stackIn_211_1;
                          stackIn_212_2 = stackIn_211_2;
                          stackIn_212_3 = this.field_w - this.field_Q.field_w;
                          break L16;
                        } else {
                          stackIn_212_0 = (nv) ((Object) stackIn_211_0);
                          stackIn_212_1 = stackIn_211_1;
                          stackIn_212_2 = stackIn_211_2;
                          stackIn_212_3 = 0;
                          break L16;
                        }
                      }
                      ((nv) (Object) stackIn_212_0).a(stackIn_212_1, stackIn_212_2, stackIn_212_3, 8192, this.field_Q.field_w);
                      break L15;
                    }
                  }
                  this.f((byte) -3);
                  return;
                } else {
                  L17: {
                    this.d((byte) -27);
                    if (this.field_Q != null) {
                      stackIn_187_0 = this.field_w - this.field_Q.field_w;
                      break L17;
                    } else {
                      stackIn_187_0 = this.field_w;
                      break L17;
                    }
                  }
                  L18: {
                    var5 = stackIn_187_0;
                    this.field_S.a(var2, var4, var3, 8192, var5);
                    if (this.field_K != null) {
                      L19: {
                        stackIn_191_0 = this.field_K;

                        if (!this.field_O) {
                          stackIn_192_0 = (nv) ((Object) stackIn_191_0);
                          stackIn_192_1 = 0;
                          break L19;
                        } else {
                          stackIn_192_0 = (nv) ((Object) stackIn_191_0);
                          stackIn_192_1 = this.field_l - this.field_K.field_l;
                          break L19;
                        }
                      }
                      ((nv) (Object) stackIn_192_0).a(stackIn_192_1, this.field_K.field_l, this.field_S.field_p, 8192, this.field_S.field_w);
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L20: {
                    if (null == this.field_Q) {
                      break L20;
                    } else {
                      L21: {
                        stackIn_196_0 = this.field_Q;

                        stackIn_196_1 = this.field_S.field_B;

                        stackIn_196_2 = this.field_S.field_l;

                        if (this.field_L) {
                          stackIn_197_0 = (nv) ((Object) stackIn_196_0);
                          stackIn_197_1 = stackIn_196_1;
                          stackIn_197_2 = stackIn_196_2;
                          stackIn_197_3 = this.field_w - this.field_Q.field_w;
                          break L21;
                        } else {
                          stackIn_197_0 = (nv) ((Object) stackIn_196_0);
                          stackIn_197_1 = stackIn_196_1;
                          stackIn_197_2 = stackIn_196_2;
                          stackIn_197_3 = 0;
                          break L21;
                        }
                      }
                      ((nv) (Object) stackIn_197_0).a(stackIn_197_1, stackIn_197_2, stackIn_197_3, 8192, this.field_Q.field_w);
                      break L20;
                    }
                  }
                  this.f((byte) -3);
                  return;
                }
              }
            } else {
              L22: {
                var3 = 0;
                if (this.field_K != null) {
                  stackIn_148_0 = this.field_l + -this.field_K.field_l;
                  break L22;
                } else {
                  stackIn_148_0 = this.field_l;
                  break L22;
                }
              }
              var4 = stackIn_148_0;
              if (param0 > 84) {
                L23: {
                  if (this.field_Q != null) {
                    stackIn_167_0 = this.field_w - this.field_Q.field_w;
                    break L23;
                  } else {
                    stackIn_167_0 = this.field_w;
                    break L23;
                  }
                }
                L24: {
                  var5 = stackIn_167_0;
                  this.field_S.a(var2, var4, var3, 8192, var5);
                  if (this.field_K != null) {
                    L25: {
                      stackIn_171_0 = this.field_K;

                      if (!this.field_O) {
                        stackIn_172_0 = (nv) ((Object) stackIn_171_0);
                        stackIn_172_1 = 0;
                        break L25;
                      } else {
                        stackIn_172_0 = (nv) ((Object) stackIn_171_0);
                        stackIn_172_1 = this.field_l - this.field_K.field_l;
                        break L25;
                      }
                    }
                    ((nv) (Object) stackIn_172_0).a(stackIn_172_1, this.field_K.field_l, this.field_S.field_p, 8192, this.field_S.field_w);
                    break L24;
                  } else {
                    break L24;
                  }
                }
                L26: {
                  if (null == this.field_Q) {
                    break L26;
                  } else {
                    L27: {
                      stackIn_176_0 = this.field_Q;

                      stackIn_176_1 = this.field_S.field_B;

                      stackIn_176_2 = this.field_S.field_l;

                      if (this.field_L) {
                        stackIn_177_0 = (nv) ((Object) stackIn_176_0);
                        stackIn_177_1 = stackIn_176_1;
                        stackIn_177_2 = stackIn_176_2;
                        stackIn_177_3 = this.field_w - this.field_Q.field_w;
                        break L27;
                      } else {
                        stackIn_177_0 = (nv) ((Object) stackIn_176_0);
                        stackIn_177_1 = stackIn_176_1;
                        stackIn_177_2 = stackIn_176_2;
                        stackIn_177_3 = 0;
                        break L27;
                      }
                    }
                    ((nv) (Object) stackIn_177_0).a(stackIn_177_1, stackIn_177_2, stackIn_177_3, 8192, this.field_Q.field_w);
                    break L26;
                  }
                }
                this.f((byte) -3);
                return;
              } else {
                L28: {
                  this.d((byte) -27);
                  if (this.field_Q != null) {
                    stackIn_152_0 = this.field_w - this.field_Q.field_w;
                    break L28;
                  } else {
                    stackIn_152_0 = this.field_w;
                    break L28;
                  }
                }
                L29: {
                  var5 = stackIn_152_0;
                  this.field_S.a(var2, var4, var3, 8192, var5);
                  if (this.field_K != null) {
                    L30: {
                      stackIn_156_0 = this.field_K;

                      if (!this.field_O) {
                        stackIn_157_0 = (nv) ((Object) stackIn_156_0);
                        stackIn_157_1 = 0;
                        break L30;
                      } else {
                        stackIn_157_0 = (nv) ((Object) stackIn_156_0);
                        stackIn_157_1 = this.field_l - this.field_K.field_l;
                        break L30;
                      }
                    }
                    ((nv) (Object) stackIn_157_0).a(stackIn_157_1, this.field_K.field_l, this.field_S.field_p, 8192, this.field_S.field_w);
                    break L29;
                  } else {
                    break L29;
                  }
                }
                L31: {
                  if (null == this.field_Q) {
                    break L31;
                  } else {
                    L32: {
                      stackIn_161_0 = this.field_Q;

                      stackIn_161_1 = this.field_S.field_B;

                      stackIn_161_2 = this.field_S.field_l;

                      if (this.field_L) {
                        stackIn_162_0 = (nv) ((Object) stackIn_161_0);
                        stackIn_162_1 = stackIn_161_1;
                        stackIn_162_2 = stackIn_161_2;
                        stackIn_162_3 = this.field_w - this.field_Q.field_w;
                        break L32;
                      } else {
                        stackIn_162_0 = (nv) ((Object) stackIn_161_0);
                        stackIn_162_1 = stackIn_161_1;
                        stackIn_162_2 = stackIn_161_2;
                        stackIn_162_3 = 0;
                        break L32;
                      }
                    }
                    ((nv) (Object) stackIn_162_0).a(stackIn_162_1, stackIn_162_2, stackIn_162_3, 8192, this.field_Q.field_w);
                    break L31;
                  }
                }
                this.f((byte) -3);
                return;
              }
            }
          } else {
            var2 = 0;
            if (!this.field_L) {
              if (this.field_Q != null) {
                L33: {
                  var3 = this.field_Q.field_w;
                  if (this.field_K != null) {
                    stackIn_113_0 = this.field_l + -this.field_K.field_l;
                    break L33;
                  } else {
                    stackIn_113_0 = this.field_l;
                    break L33;
                  }
                }
                var4 = stackIn_113_0;
                if (param0 > 84) {
                  L34: {
                    if (this.field_Q != null) {
                      stackIn_132_0 = this.field_w - this.field_Q.field_w;
                      break L34;
                    } else {
                      stackIn_132_0 = this.field_w;
                      break L34;
                    }
                  }
                  L35: {
                    var5 = stackIn_132_0;
                    this.field_S.a(var2, var4, var3, 8192, var5);
                    if (this.field_K != null) {
                      L36: {
                        stackIn_136_0 = this.field_K;

                        if (!this.field_O) {
                          stackIn_137_0 = (nv) ((Object) stackIn_136_0);
                          stackIn_137_1 = 0;
                          break L36;
                        } else {
                          stackIn_137_0 = (nv) ((Object) stackIn_136_0);
                          stackIn_137_1 = this.field_l - this.field_K.field_l;
                          break L36;
                        }
                      }
                      ((nv) (Object) stackIn_137_0).a(stackIn_137_1, this.field_K.field_l, this.field_S.field_p, 8192, this.field_S.field_w);
                      break L35;
                    } else {
                      break L35;
                    }
                  }
                  L37: {
                    if (null == this.field_Q) {
                      break L37;
                    } else {
                      L38: {
                        stackIn_141_0 = this.field_Q;

                        stackIn_141_1 = this.field_S.field_B;

                        stackIn_141_2 = this.field_S.field_l;

                        if (this.field_L) {
                          stackIn_142_0 = (nv) ((Object) stackIn_141_0);
                          stackIn_142_1 = stackIn_141_1;
                          stackIn_142_2 = stackIn_141_2;
                          stackIn_142_3 = this.field_w - this.field_Q.field_w;
                          break L38;
                        } else {
                          stackIn_142_0 = (nv) ((Object) stackIn_141_0);
                          stackIn_142_1 = stackIn_141_1;
                          stackIn_142_2 = stackIn_141_2;
                          stackIn_142_3 = 0;
                          break L38;
                        }
                      }
                      ((nv) (Object) stackIn_142_0).a(stackIn_142_1, stackIn_142_2, stackIn_142_3, 8192, this.field_Q.field_w);
                      break L37;
                    }
                  }
                  this.f((byte) -3);
                  return;
                } else {
                  L39: {
                    this.d((byte) -27);
                    if (this.field_Q != null) {
                      stackIn_117_0 = this.field_w - this.field_Q.field_w;
                      break L39;
                    } else {
                      stackIn_117_0 = this.field_w;
                      break L39;
                    }
                  }
                  L40: {
                    var5 = stackIn_117_0;
                    this.field_S.a(var2, var4, var3, 8192, var5);
                    if (this.field_K != null) {
                      L41: {
                        stackIn_121_0 = this.field_K;

                        if (!this.field_O) {
                          stackIn_122_0 = (nv) ((Object) stackIn_121_0);
                          stackIn_122_1 = 0;
                          break L41;
                        } else {
                          stackIn_122_0 = (nv) ((Object) stackIn_121_0);
                          stackIn_122_1 = this.field_l - this.field_K.field_l;
                          break L41;
                        }
                      }
                      ((nv) (Object) stackIn_122_0).a(stackIn_122_1, this.field_K.field_l, this.field_S.field_p, 8192, this.field_S.field_w);
                      break L40;
                    } else {
                      break L40;
                    }
                  }
                  L42: {
                    if (null == this.field_Q) {
                      break L42;
                    } else {
                      L43: {
                        stackIn_126_0 = this.field_Q;

                        stackIn_126_1 = this.field_S.field_B;

                        stackIn_126_2 = this.field_S.field_l;

                        if (this.field_L) {
                          stackIn_127_0 = (nv) ((Object) stackIn_126_0);
                          stackIn_127_1 = stackIn_126_1;
                          stackIn_127_2 = stackIn_126_2;
                          stackIn_127_3 = this.field_w - this.field_Q.field_w;
                          break L43;
                        } else {
                          stackIn_127_0 = (nv) ((Object) stackIn_126_0);
                          stackIn_127_1 = stackIn_126_1;
                          stackIn_127_2 = stackIn_126_2;
                          stackIn_127_3 = 0;
                          break L43;
                        }
                      }
                      ((nv) (Object) stackIn_127_0).a(stackIn_127_1, stackIn_127_2, stackIn_127_3, 8192, this.field_Q.field_w);
                      break L42;
                    }
                  }
                  this.f((byte) -3);
                  return;
                }
              } else {
                L44: {
                  var3 = 0;
                  if (this.field_K != null) {
                    stackIn_79_0 = this.field_l + -this.field_K.field_l;
                    break L44;
                  } else {
                    stackIn_79_0 = this.field_l;
                    break L44;
                  }
                }
                var4 = stackIn_79_0;
                if (param0 > 84) {
                  L45: {
                    if (this.field_Q != null) {
                      stackIn_98_0 = this.field_w - this.field_Q.field_w;
                      break L45;
                    } else {
                      stackIn_98_0 = this.field_w;
                      break L45;
                    }
                  }
                  L46: {
                    var5 = stackIn_98_0;
                    this.field_S.a(var2, var4, var3, 8192, var5);
                    if (this.field_K != null) {
                      L47: {
                        stackIn_102_0 = this.field_K;

                        if (!this.field_O) {
                          stackIn_103_0 = (nv) ((Object) stackIn_102_0);
                          stackIn_103_1 = 0;
                          break L47;
                        } else {
                          stackIn_103_0 = (nv) ((Object) stackIn_102_0);
                          stackIn_103_1 = this.field_l - this.field_K.field_l;
                          break L47;
                        }
                      }
                      ((nv) (Object) stackIn_103_0).a(stackIn_103_1, this.field_K.field_l, this.field_S.field_p, 8192, this.field_S.field_w);
                      break L46;
                    } else {
                      break L46;
                    }
                  }
                  L48: {
                    if (null == this.field_Q) {
                      break L48;
                    } else {
                      L49: {
                        stackIn_107_0 = this.field_Q;

                        stackIn_107_1 = this.field_S.field_B;

                        stackIn_107_2 = this.field_S.field_l;

                        if (this.field_L) {
                          stackIn_108_0 = (nv) ((Object) stackIn_107_0);
                          stackIn_108_1 = stackIn_107_1;
                          stackIn_108_2 = stackIn_107_2;
                          stackIn_108_3 = this.field_w - this.field_Q.field_w;
                          break L49;
                        } else {
                          stackIn_108_0 = (nv) ((Object) stackIn_107_0);
                          stackIn_108_1 = stackIn_107_1;
                          stackIn_108_2 = stackIn_107_2;
                          stackIn_108_3 = 0;
                          break L49;
                        }
                      }
                      ((nv) (Object) stackIn_108_0).a(stackIn_108_1, stackIn_108_2, stackIn_108_3, 8192, this.field_Q.field_w);
                      break L48;
                    }
                  }
                  this.f((byte) -3);
                  return;
                } else {
                  L50: {
                    this.d((byte) -27);
                    if (this.field_Q != null) {
                      stackIn_83_0 = this.field_w - this.field_Q.field_w;
                      break L50;
                    } else {
                      stackIn_83_0 = this.field_w;
                      break L50;
                    }
                  }
                  L51: {
                    var5 = stackIn_83_0;
                    this.field_S.a(var2, var4, var3, 8192, var5);
                    if (this.field_K != null) {
                      L52: {
                        stackIn_87_0 = this.field_K;

                        if (!this.field_O) {
                          stackIn_88_0 = (nv) ((Object) stackIn_87_0);
                          stackIn_88_1 = 0;
                          break L52;
                        } else {
                          stackIn_88_0 = (nv) ((Object) stackIn_87_0);
                          stackIn_88_1 = this.field_l - this.field_K.field_l;
                          break L52;
                        }
                      }
                      ((nv) (Object) stackIn_88_0).a(stackIn_88_1, this.field_K.field_l, this.field_S.field_p, 8192, this.field_S.field_w);
                      break L51;
                    } else {
                      break L51;
                    }
                  }
                  L53: {
                    if (null == this.field_Q) {
                      break L53;
                    } else {
                      L54: {
                        stackIn_92_0 = this.field_Q;

                        stackIn_92_1 = this.field_S.field_B;

                        stackIn_92_2 = this.field_S.field_l;

                        if (this.field_L) {
                          stackIn_93_0 = (nv) ((Object) stackIn_92_0);
                          stackIn_93_1 = stackIn_92_1;
                          stackIn_93_2 = stackIn_92_2;
                          stackIn_93_3 = this.field_w - this.field_Q.field_w;
                          break L54;
                        } else {
                          stackIn_93_0 = (nv) ((Object) stackIn_92_0);
                          stackIn_93_1 = stackIn_92_1;
                          stackIn_93_2 = stackIn_92_2;
                          stackIn_93_3 = 0;
                          break L54;
                        }
                      }
                      ((nv) (Object) stackIn_93_0).a(stackIn_93_1, stackIn_93_2, stackIn_93_3, 8192, this.field_Q.field_w);
                      break L53;
                    }
                  }
                  this.f((byte) -3);
                  return;
                }
              }
            } else {
              L55: {
                var3 = 0;
                if (this.field_K != null) {
                  stackIn_44_0 = this.field_l + -this.field_K.field_l;
                  break L55;
                } else {
                  stackIn_44_0 = this.field_l;
                  break L55;
                }
              }
              var4 = stackIn_44_0;
              if (param0 > 84) {
                L56: {
                  if (this.field_Q != null) {
                    stackIn_63_0 = this.field_w - this.field_Q.field_w;
                    break L56;
                  } else {
                    stackIn_63_0 = this.field_w;
                    break L56;
                  }
                }
                L57: {
                  var5 = stackIn_63_0;
                  this.field_S.a(var2, var4, var3, 8192, var5);
                  if (this.field_K != null) {
                    L58: {
                      stackIn_67_0 = this.field_K;

                      if (!this.field_O) {
                        stackIn_68_0 = (nv) ((Object) stackIn_67_0);
                        stackIn_68_1 = 0;
                        break L58;
                      } else {
                        stackIn_68_0 = (nv) ((Object) stackIn_67_0);
                        stackIn_68_1 = this.field_l - this.field_K.field_l;
                        break L58;
                      }
                    }
                    ((nv) (Object) stackIn_68_0).a(stackIn_68_1, this.field_K.field_l, this.field_S.field_p, 8192, this.field_S.field_w);
                    break L57;
                  } else {
                    break L57;
                  }
                }
                L59: {
                  if (null == this.field_Q) {
                    break L59;
                  } else {
                    L60: {
                      stackIn_72_0 = this.field_Q;

                      stackIn_72_1 = this.field_S.field_B;

                      stackIn_72_2 = this.field_S.field_l;

                      if (this.field_L) {
                        stackIn_73_0 = (nv) ((Object) stackIn_72_0);
                        stackIn_73_1 = stackIn_72_1;
                        stackIn_73_2 = stackIn_72_2;
                        stackIn_73_3 = this.field_w - this.field_Q.field_w;
                        break L60;
                      } else {
                        stackIn_73_0 = (nv) ((Object) stackIn_72_0);
                        stackIn_73_1 = stackIn_72_1;
                        stackIn_73_2 = stackIn_72_2;
                        stackIn_73_3 = 0;
                        break L60;
                      }
                    }
                    ((nv) (Object) stackIn_73_0).a(stackIn_73_1, stackIn_73_2, stackIn_73_3, 8192, this.field_Q.field_w);
                    break L59;
                  }
                }
                this.f((byte) -3);
                return;
              } else {
                L61: {
                  this.d((byte) -27);
                  if (this.field_Q != null) {
                    stackIn_48_0 = this.field_w - this.field_Q.field_w;
                    break L61;
                  } else {
                    stackIn_48_0 = this.field_w;
                    break L61;
                  }
                }
                L62: {
                  var5 = stackIn_48_0;
                  this.field_S.a(var2, var4, var3, 8192, var5);
                  if (this.field_K != null) {
                    L63: {
                      stackIn_52_0 = this.field_K;

                      if (!this.field_O) {
                        stackIn_53_0 = (nv) ((Object) stackIn_52_0);
                        stackIn_53_1 = 0;
                        break L63;
                      } else {
                        stackIn_53_0 = (nv) ((Object) stackIn_52_0);
                        stackIn_53_1 = this.field_l - this.field_K.field_l;
                        break L63;
                      }
                    }
                    ((nv) (Object) stackIn_53_0).a(stackIn_53_1, this.field_K.field_l, this.field_S.field_p, 8192, this.field_S.field_w);
                    break L62;
                  } else {
                    break L62;
                  }
                }
                L64: {
                  if (null == this.field_Q) {
                    break L64;
                  } else {
                    L65: {
                      stackIn_57_0 = this.field_Q;

                      stackIn_57_1 = this.field_S.field_B;

                      stackIn_57_2 = this.field_S.field_l;

                      if (this.field_L) {
                        stackIn_58_0 = (nv) ((Object) stackIn_57_0);
                        stackIn_58_1 = stackIn_57_1;
                        stackIn_58_2 = stackIn_57_2;
                        stackIn_58_3 = this.field_w - this.field_Q.field_w;
                        break L65;
                      } else {
                        stackIn_58_0 = (nv) ((Object) stackIn_57_0);
                        stackIn_58_1 = stackIn_57_1;
                        stackIn_58_2 = stackIn_57_2;
                        stackIn_58_3 = 0;
                        break L65;
                      }
                    }
                    ((nv) (Object) stackIn_58_0).a(stackIn_58_1, stackIn_58_2, stackIn_58_3, 8192, this.field_Q.field_w);
                    break L64;
                  }
                }
                this.f((byte) -3);
                return;
              }
            }
          }
        } else {
          L66: {
            L67: {
              var2 = 0;
              if (this.field_L) {
                break L67;
              } else {
                if (this.field_Q == null) {
                  break L67;
                } else {
                  stackIn_5_0 = this.field_Q.field_w;
                  break L66;
                }
              }
            }
            stackIn_5_0 = 0;
            break L66;
          }
          L68: {
            var3 = stackIn_5_0;
            if (this.field_K != null) {
              stackIn_8_0 = this.field_l + -this.field_K.field_l;
              break L68;
            } else {
              stackIn_8_0 = this.field_l;
              break L68;
            }
          }
          var4 = stackIn_8_0;
          if (param0 > 84) {
            L69: {
              if (this.field_Q != null) {
                stackIn_27_0 = this.field_w - this.field_Q.field_w;
                break L69;
              } else {
                stackIn_27_0 = this.field_w;
                break L69;
              }
            }
            L70: {
              var5 = stackIn_27_0;
              this.field_S.a(var2, var4, var3, 8192, var5);
              if (this.field_K != null) {
                L71: {
                  stackIn_31_0 = this.field_K;

                  if (!this.field_O) {
                    stackIn_32_0 = (nv) ((Object) stackIn_31_0);
                    stackIn_32_1 = 0;
                    break L71;
                  } else {
                    stackIn_32_0 = (nv) ((Object) stackIn_31_0);
                    stackIn_32_1 = this.field_l - this.field_K.field_l;
                    break L71;
                  }
                }
                ((nv) (Object) stackIn_32_0).a(stackIn_32_1, this.field_K.field_l, this.field_S.field_p, 8192, this.field_S.field_w);
                break L70;
              } else {
                break L70;
              }
            }
            L72: {
              if (null == this.field_Q) {
                break L72;
              } else {
                L73: {
                  stackIn_36_0 = this.field_Q;

                  stackIn_36_1 = this.field_S.field_B;

                  stackIn_36_2 = this.field_S.field_l;

                  if (this.field_L) {
                    stackIn_37_0 = (nv) ((Object) stackIn_36_0);
                    stackIn_37_1 = stackIn_36_1;
                    stackIn_37_2 = stackIn_36_2;
                    stackIn_37_3 = this.field_w - this.field_Q.field_w;
                    break L73;
                  } else {
                    stackIn_37_0 = (nv) ((Object) stackIn_36_0);
                    stackIn_37_1 = stackIn_36_1;
                    stackIn_37_2 = stackIn_36_2;
                    stackIn_37_3 = 0;
                    break L73;
                  }
                }
                ((nv) (Object) stackIn_37_0).a(stackIn_37_1, stackIn_37_2, stackIn_37_3, 8192, this.field_Q.field_w);
                break L72;
              }
            }
            this.f((byte) -3);
            return;
          } else {
            L74: {
              this.d((byte) -27);
              if (this.field_Q != null) {
                stackIn_12_0 = this.field_w - this.field_Q.field_w;
                break L74;
              } else {
                stackIn_12_0 = this.field_w;
                break L74;
              }
            }
            L75: {
              var5 = stackIn_12_0;
              this.field_S.a(var2, var4, var3, 8192, var5);
              if (this.field_K != null) {
                L76: {
                  stackIn_16_0 = this.field_K;

                  if (!this.field_O) {
                    stackIn_17_0 = (nv) ((Object) stackIn_16_0);
                    stackIn_17_1 = 0;
                    break L76;
                  } else {
                    stackIn_17_0 = (nv) ((Object) stackIn_16_0);
                    stackIn_17_1 = this.field_l - this.field_K.field_l;
                    break L76;
                  }
                }
                ((nv) (Object) stackIn_17_0).a(stackIn_17_1, this.field_K.field_l, this.field_S.field_p, 8192, this.field_S.field_w);
                break L75;
              } else {
                break L75;
              }
            }
            L77: {
              if (null == this.field_Q) {
                break L77;
              } else {
                L78: {
                  stackIn_21_0 = this.field_Q;

                  stackIn_21_1 = this.field_S.field_B;

                  stackIn_21_2 = this.field_S.field_l;

                  if (this.field_L) {
                    stackIn_22_0 = (nv) ((Object) stackIn_21_0);
                    stackIn_22_1 = stackIn_21_1;
                    stackIn_22_2 = stackIn_21_2;
                    stackIn_22_3 = this.field_w - this.field_Q.field_w;
                    break L78;
                  } else {
                    stackIn_22_0 = (nv) ((Object) stackIn_21_0);
                    stackIn_22_1 = stackIn_21_1;
                    stackIn_22_2 = stackIn_21_2;
                    stackIn_22_3 = 0;
                    break L78;
                  }
                }
                ((nv) (Object) stackIn_22_0).a(stackIn_22_1, stackIn_22_2, stackIn_22_3, 8192, this.field_Q.field_w);
                break L77;
              }
            }
            this.f((byte) -3);
            return;
          }
        }
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
