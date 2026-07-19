/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wl extends tj {
    static String field_J;
    static wk field_N;
    static String[] field_M;
    static je field_K;
    static int field_E;
    static at field_F;
    private int field_H;
    gk field_G;
    static String field_I;
    boolean field_L;

    final static io a(kl param0, int param1, boolean param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_2_0 = null;
        io stackIn_5_0 = null;
        io stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        io stackOut_6_0 = null;
        io stackOut_4_0 = null;
        Object stackOut_1_0 = null;
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
            var4 = param0.c(param1, (byte) 81);
            var3 = var4;
            if (var4 != null) {
              if (param2) {
                stackOut_6_0 = new io(var4);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_4_0 = (io) null;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3_ref);
            stackOut_8_1 = new StringBuilder().append("wl.FA(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (io) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    final void a(int param0, byte param1, int param2) {
        if (param1 < 95) {
          field_K = (je) null;
          this.a(te.field_l + -param0 >> 1851680193, param0, ij.field_x + -param2 >> -1201773375, 8192, param2);
          return;
        } else {
          this.a(te.field_l + -param0 >> 1851680193, param0, ij.field_x + -param2 >> -1201773375, 8192, param2);
          return;
        }
    }

    public static void f(byte param0) {
        field_I = null;
        field_M = null;
        field_N = null;
        int var1 = -89 % ((8 - param0) / 57);
        field_K = null;
        field_F = null;
        field_J = null;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (0 != this.field_H) {
          if ((this.field_H ^ -1) <= -257) {
            if (param3 != 0) {
              return;
            } else {
              this.b(this.field_B + param0, 1851680193, param1 + this.field_p);
              super.a(param0, param1, (byte) -121, param3);
              return;
            }
          } else {
            if (bo.field_b == null) {
              bo.field_b = new wk(this.field_l, this.field_w);
              vn.a(bo.field_b, 3);
              qn.b();
              this.b(0, 1851680193, 0);
              super.a(-param0 - this.field_B, -param1 - this.field_p, (byte) -106, param3);
              rf.b(-18862);
              if (param2 < -82) {
                bo.field_b.e(this.field_B + param0, this.field_p + param1, this.field_H);
                return;
              } else {
                field_J = (String) null;
                bo.field_b.e(this.field_B + param0, this.field_p + param1, this.field_H);
                return;
              }
            } else {
              if (this.field_l > bo.field_b.field_y) {
                bo.field_b = new wk(this.field_l, this.field_w);
                vn.a(bo.field_b, 3);
                qn.b();
                this.b(0, 1851680193, 0);
                super.a(-param0 - this.field_B, -param1 - this.field_p, (byte) -106, param3);
                rf.b(-18862);
                if (param2 >= -82) {
                  field_J = (String) null;
                  bo.field_b.e(this.field_B + param0, this.field_p + param1, this.field_H);
                  return;
                } else {
                  bo.field_b.e(this.field_B + param0, this.field_p + param1, this.field_H);
                  return;
                }
              } else {
                if (bo.field_b.field_v < this.field_w) {
                  bo.field_b = new wk(this.field_l, this.field_w);
                  vn.a(bo.field_b, 3);
                  qn.b();
                  this.b(0, 1851680193, 0);
                  super.a(-param0 - this.field_B, -param1 - this.field_p, (byte) -106, param3);
                  rf.b(-18862);
                  if (param2 >= -82) {
                    field_J = (String) null;
                    bo.field_b.e(this.field_B + param0, this.field_p + param1, this.field_H);
                    return;
                  } else {
                    bo.field_b.e(this.field_B + param0, this.field_p + param1, this.field_H);
                    return;
                  }
                } else {
                  vn.a(bo.field_b, 3);
                  qn.b();
                  this.b(0, 1851680193, 0);
                  super.a(-param0 - this.field_B, -param1 - this.field_p, (byte) -106, param3);
                  rf.b(-18862);
                  if (param2 < -82) {
                    bo.field_b.e(this.field_B + param0, this.field_p + param1, this.field_H);
                    return;
                  } else {
                    field_J = (String) null;
                    bo.field_b.e(this.field_B + param0, this.field_p + param1, this.field_H);
                    return;
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final static int b(int param0, int param1) {
        int var2 = 0;
        L0: {
          var2 = 0;
          if (-1 < (param0 ^ -1)) {
            param0 = param0 >>> 16;
            var2 += 16;
            break L0;
          } else {
            if (-65537 < (param0 ^ -1)) {
              break L0;
            } else {
              L1: {
                param0 = param0 >>> 16;
                var2 += 16;
                if (param0 >= 256) {
                  param0 = param0 >>> 8;
                  var2 += 8;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if ((param0 ^ -1) <= -17) {
                  param0 = param0 >>> 4;
                  var2 += 4;
                  break L2;
                } else {
                  break L2;
                }
              }
              if (param1 == -13337) {
                L3: {
                  if (param0 < 4) {
                    break L3;
                  } else {
                    param0 = param0 >>> 2;
                    var2 += 2;
                    break L3;
                  }
                }
                L4: {
                  if ((param0 ^ -1) > -2) {
                    break L4;
                  } else {
                    var2++;
                    param0 = param0 >>> 1;
                    break L4;
                  }
                }
                return var2 - -param0;
              } else {
                L5: {
                  field_K = (je) null;
                  if (param0 < 4) {
                    break L5;
                  } else {
                    param0 = param0 >>> 2;
                    var2 += 2;
                    break L5;
                  }
                }
                L6: {
                  if ((param0 ^ -1) > -2) {
                    break L6;
                  } else {
                    var2++;
                    param0 = param0 >>> 1;
                    break L6;
                  }
                }
                return var2 - -param0;
              }
            }
          }
        }
        L7: {
          if (param0 >= 256) {
            param0 = param0 >>> 8;
            var2 += 8;
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          if ((param0 ^ -1) <= -17) {
            param0 = param0 >>> 4;
            var2 += 4;
            break L8;
          } else {
            break L8;
          }
        }
        if (param1 != -13337) {
          L9: {
            field_K = (je) null;
            if (param0 < 4) {
              break L9;
            } else {
              param0 = param0 >>> 2;
              var2 += 2;
              break L9;
            }
          }
          L10: {
            if ((param0 ^ -1) > -2) {
              break L10;
            } else {
              var2++;
              param0 = param0 >>> 1;
              break L10;
            }
          }
          return var2 - -param0;
        } else {
          L11: {
            if (param0 < 4) {
              break L11;
            } else {
              param0 = param0 >>> 2;
              var2 += 2;
              break L11;
            }
          }
          L12: {
            if ((param0 ^ -1) > -2) {
              break L12;
            } else {
              var2++;
              param0 = param0 >>> 1;
              break L12;
            }
          }
          return var2 - -param0;
        }
    }

    boolean a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_10_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_41_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_9_0 = 0;
        var2 = this.g((byte) 122);
        var3 = -this.field_H + var2;
        if (0 >= var3) {
          if (param0 != -1) {
            L0: {
              field_K = (je) null;
              if (var3 < 0) {
                this.field_H = this.field_H + (var3 + -15) / 16;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              L2: {
                if (this.field_H != 0) {
                  break L2;
                } else {
                  if (-1 != (var2 ^ -1)) {
                    break L2;
                  } else {
                    if (this.field_L) {
                      break L2;
                    } else {
                      stackOut_39_0 = 1;
                      stackIn_41_0 = stackOut_39_0;
                      break L1;
                    }
                  }
                }
              }
              stackOut_40_0 = 0;
              stackIn_41_0 = stackOut_40_0;
              break L1;
            }
            return stackIn_41_0 != 0;
          } else {
            L3: {
              if (var3 < 0) {
                this.field_H = this.field_H + (var3 + -15) / 16;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              L5: {
                if (this.field_H != 0) {
                  break L5;
                } else {
                  if (-1 != (var2 ^ -1)) {
                    break L5;
                  } else {
                    if (this.field_L) {
                      break L5;
                    } else {
                      stackOut_30_0 = 1;
                      stackIn_32_0 = stackOut_30_0;
                      break L4;
                    }
                  }
                }
              }
              stackOut_31_0 = 0;
              stackIn_32_0 = stackOut_31_0;
              break L4;
            }
            return stackIn_32_0 != 0;
          }
        } else {
          this.field_H = this.field_H + (-1 + (var3 + 8)) / 8;
          if (param0 == -1) {
            L6: {
              if (var3 < 0) {
                this.field_H = this.field_H + (var3 + -15) / 16;
                break L6;
              } else {
                break L6;
              }
            }
            if (this.field_H == 0) {
              if (-1 != (var2 ^ -1)) {
                return false;
              } else {
                L7: {
                  if (this.field_L) {
                    stackOut_19_0 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    break L7;
                  } else {
                    stackOut_18_0 = 1;
                    stackIn_20_0 = stackOut_18_0;
                    break L7;
                  }
                }
                return stackIn_20_0 != 0;
              }
            } else {
              return false;
            }
          } else {
            L8: {
              field_K = (je) null;
              if (var3 < 0) {
                this.field_H = this.field_H + (var3 + -15) / 16;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              L10: {
                if (this.field_H != 0) {
                  break L10;
                } else {
                  if (-1 != (var2 ^ -1)) {
                    break L10;
                  } else {
                    if (this.field_L) {
                      break L10;
                    } else {
                      stackOut_8_0 = 1;
                      stackIn_10_0 = stackOut_8_0;
                      break L9;
                    }
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L9;
            }
            return stackIn_10_0 != 0;
          }
        }
    }

    final kb e(byte param0) {
        int discarded$2 = 0;
        kb var2 = null;
        var2 = super.e((byte) 66);
        if (var2 == null) {
          if (param0 < 24) {
            discarded$2 = this.g((byte) -91);
            return (kb) (this);
          } else {
            return (kb) (this);
          }
        } else {
          return var2;
        }
    }

    final static void a(int param0, boolean param1) {
        io discarded$3 = null;
        io discarded$4 = null;
        io discarded$5 = null;
        int var2 = 0;
        String var3 = null;
        kl var4 = null;
        int stackIn_7_0 = 0;
        String stackIn_16_0 = null;
        int stackIn_17_0 = 0;
        String stackIn_17_1 = null;
        int stackIn_18_0 = 0;
        String stackIn_18_1 = null;
        int stackIn_19_0 = 0;
        String stackIn_19_1 = null;
        int stackIn_20_0 = 0;
        String stackIn_20_1 = null;
        int stackIn_20_2 = 0;
        int stackIn_27_0 = 0;
        String stackIn_35_0 = null;
        int stackIn_36_0 = 0;
        String stackIn_36_1 = null;
        int stackIn_37_0 = 0;
        String stackIn_37_1 = null;
        int stackIn_38_0 = 0;
        String stackIn_38_1 = null;
        int stackIn_39_0 = 0;
        String stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        String stackIn_49_0 = null;
        int stackIn_50_0 = 0;
        String stackIn_50_1 = null;
        int stackIn_51_0 = 0;
        String stackIn_51_1 = null;
        int stackIn_52_0 = 0;
        String stackIn_52_1 = null;
        int stackIn_53_0 = 0;
        String stackIn_53_1 = null;
        int stackIn_53_2 = 0;
        int stackIn_62_0 = 0;
        String stackIn_70_0 = null;
        int stackIn_71_0 = 0;
        String stackIn_71_1 = null;
        int stackIn_72_0 = 0;
        String stackIn_72_1 = null;
        int stackIn_73_0 = 0;
        String stackIn_73_1 = null;
        int stackIn_74_0 = 0;
        String stackIn_74_1 = null;
        int stackIn_74_2 = 0;
        String stackIn_84_0 = null;
        int stackIn_85_0 = 0;
        String stackIn_85_1 = null;
        int stackIn_86_0 = 0;
        String stackIn_86_1 = null;
        int stackIn_87_0 = 0;
        String stackIn_87_1 = null;
        int stackIn_88_0 = 0;
        String stackIn_88_1 = null;
        int stackIn_88_2 = 0;
        int stackIn_95_0 = 0;
        String stackIn_104_0 = null;
        int stackIn_105_0 = 0;
        String stackIn_105_1 = null;
        int stackIn_106_0 = 0;
        String stackIn_106_1 = null;
        int stackIn_107_0 = 0;
        String stackIn_107_1 = null;
        int stackIn_108_0 = 0;
        String stackIn_108_1 = null;
        int stackIn_108_2 = 0;
        String stackIn_118_0 = null;
        int stackIn_119_0 = 0;
        String stackIn_119_1 = null;
        int stackIn_120_0 = 0;
        String stackIn_120_1 = null;
        int stackIn_121_0 = 0;
        String stackIn_121_1 = null;
        int stackIn_122_0 = 0;
        String stackIn_122_1 = null;
        int stackIn_122_2 = 0;
        String stackIn_134_0 = null;
        int stackIn_135_0 = 0;
        String stackIn_135_1 = null;
        int stackIn_136_0 = 0;
        String stackIn_136_1 = null;
        int stackIn_137_0 = 0;
        String stackIn_137_1 = null;
        int stackIn_138_0 = 0;
        String stackIn_138_1 = null;
        int stackIn_138_2 = 0;
        String stackIn_148_0 = null;
        int stackIn_149_0 = 0;
        String stackIn_149_1 = null;
        int stackIn_150_0 = 0;
        String stackIn_150_1 = null;
        int stackIn_151_0 = 0;
        String stackIn_151_1 = null;
        int stackIn_152_0 = 0;
        String stackIn_152_1 = null;
        int stackIn_152_2 = 0;
        String stackIn_163_0 = null;
        int stackIn_164_0 = 0;
        String stackIn_164_1 = null;
        int stackIn_165_0 = 0;
        String stackIn_165_1 = null;
        int stackIn_166_0 = 0;
        String stackIn_166_1 = null;
        int stackIn_167_0 = 0;
        String stackIn_167_1 = null;
        int stackIn_167_2 = 0;
        String stackIn_177_0 = null;
        int stackIn_178_0 = 0;
        String stackIn_178_1 = null;
        int stackIn_179_0 = 0;
        String stackIn_179_1 = null;
        int stackIn_180_0 = 0;
        String stackIn_180_1 = null;
        int stackIn_181_0 = 0;
        String stackIn_181_1 = null;
        int stackIn_181_2 = 0;
        int stackIn_186_0 = 0;
        String stackIn_195_0 = null;
        int stackIn_196_0 = 0;
        String stackIn_196_1 = null;
        int stackIn_197_0 = 0;
        String stackIn_197_1 = null;
        int stackIn_198_0 = 0;
        String stackIn_198_1 = null;
        int stackIn_199_0 = 0;
        String stackIn_199_1 = null;
        int stackIn_199_2 = 0;
        String stackIn_209_0 = null;
        int stackIn_210_0 = 0;
        String stackIn_210_1 = null;
        int stackIn_211_0 = 0;
        String stackIn_211_1 = null;
        int stackIn_212_0 = 0;
        String stackIn_212_1 = null;
        int stackIn_213_0 = 0;
        String stackIn_213_1 = null;
        int stackIn_213_2 = 0;
        int stackIn_220_0 = 0;
        String stackIn_228_0 = null;
        int stackIn_229_0 = 0;
        String stackIn_229_1 = null;
        int stackIn_230_0 = 0;
        String stackIn_230_1 = null;
        int stackIn_231_0 = 0;
        String stackIn_231_1 = null;
        int stackIn_232_0 = 0;
        String stackIn_232_1 = null;
        int stackIn_232_2 = 0;
        String stackIn_241_0 = null;
        int stackIn_242_0 = 0;
        String stackIn_242_1 = null;
        int stackIn_243_0 = 0;
        String stackIn_243_1 = null;
        int stackIn_244_0 = 0;
        String stackIn_244_1 = null;
        int stackIn_245_0 = 0;
        String stackIn_245_1 = null;
        int stackIn_245_2 = 0;
        int stackOut_218_0 = 0;
        int stackOut_219_0 = 0;
        String stackOut_240_0 = null;
        String stackOut_239_0 = null;
        int stackOut_241_0 = 0;
        String stackOut_241_1 = null;
        int stackOut_242_0 = 0;
        String stackOut_242_1 = null;
        int stackOut_243_0 = 0;
        String stackOut_243_1 = null;
        int stackOut_243_2 = 0;
        int stackOut_244_0 = 0;
        String stackOut_244_1 = null;
        int stackOut_244_2 = 0;
        String stackOut_227_0 = null;
        String stackOut_226_0 = null;
        int stackOut_228_0 = 0;
        String stackOut_228_1 = null;
        int stackOut_229_0 = 0;
        String stackOut_229_1 = null;
        int stackOut_230_0 = 0;
        String stackOut_230_1 = null;
        int stackOut_230_2 = 0;
        int stackOut_231_0 = 0;
        String stackOut_231_1 = null;
        int stackOut_231_2 = 0;
        int stackOut_185_0 = 0;
        int stackOut_184_0 = 0;
        String stackOut_208_0 = null;
        String stackOut_207_0 = null;
        int stackOut_209_0 = 0;
        String stackOut_209_1 = null;
        int stackOut_210_0 = 0;
        String stackOut_210_1 = null;
        int stackOut_211_0 = 0;
        String stackOut_211_1 = null;
        int stackOut_211_2 = 0;
        int stackOut_212_0 = 0;
        String stackOut_212_1 = null;
        int stackOut_212_2 = 0;
        String stackOut_194_0 = null;
        String stackOut_193_0 = null;
        int stackOut_195_0 = 0;
        String stackOut_195_1 = null;
        int stackOut_196_0 = 0;
        String stackOut_196_1 = null;
        int stackOut_197_0 = 0;
        String stackOut_197_1 = null;
        int stackOut_197_2 = 0;
        int stackOut_198_0 = 0;
        String stackOut_198_1 = null;
        int stackOut_198_2 = 0;
        String stackOut_176_0 = null;
        String stackOut_175_0 = null;
        int stackOut_177_0 = 0;
        String stackOut_177_1 = null;
        int stackOut_178_0 = 0;
        String stackOut_178_1 = null;
        int stackOut_179_0 = 0;
        String stackOut_179_1 = null;
        int stackOut_179_2 = 0;
        int stackOut_180_0 = 0;
        String stackOut_180_1 = null;
        int stackOut_180_2 = 0;
        String stackOut_162_0 = null;
        String stackOut_161_0 = null;
        int stackOut_163_0 = 0;
        String stackOut_163_1 = null;
        int stackOut_164_0 = 0;
        String stackOut_164_1 = null;
        int stackOut_165_0 = 0;
        String stackOut_165_1 = null;
        int stackOut_165_2 = 0;
        int stackOut_166_0 = 0;
        String stackOut_166_1 = null;
        int stackOut_166_2 = 0;
        String stackOut_147_0 = null;
        String stackOut_146_0 = null;
        int stackOut_148_0 = 0;
        String stackOut_148_1 = null;
        int stackOut_149_0 = 0;
        String stackOut_149_1 = null;
        int stackOut_150_0 = 0;
        String stackOut_150_1 = null;
        int stackOut_150_2 = 0;
        int stackOut_151_0 = 0;
        String stackOut_151_1 = null;
        int stackOut_151_2 = 0;
        String stackOut_133_0 = null;
        String stackOut_132_0 = null;
        int stackOut_134_0 = 0;
        String stackOut_134_1 = null;
        int stackOut_135_0 = 0;
        String stackOut_135_1 = null;
        int stackOut_136_0 = 0;
        String stackOut_136_1 = null;
        int stackOut_136_2 = 0;
        int stackOut_137_0 = 0;
        String stackOut_137_1 = null;
        int stackOut_137_2 = 0;
        int stackOut_93_0 = 0;
        int stackOut_94_0 = 0;
        String stackOut_117_0 = null;
        String stackOut_116_0 = null;
        int stackOut_118_0 = 0;
        String stackOut_118_1 = null;
        int stackOut_119_0 = 0;
        String stackOut_119_1 = null;
        int stackOut_120_0 = 0;
        String stackOut_120_1 = null;
        int stackOut_120_2 = 0;
        int stackOut_121_0 = 0;
        String stackOut_121_1 = null;
        int stackOut_121_2 = 0;
        String stackOut_103_0 = null;
        String stackOut_102_0 = null;
        int stackOut_104_0 = 0;
        String stackOut_104_1 = null;
        int stackOut_105_0 = 0;
        String stackOut_105_1 = null;
        int stackOut_106_0 = 0;
        String stackOut_106_1 = null;
        int stackOut_106_2 = 0;
        int stackOut_107_0 = 0;
        String stackOut_107_1 = null;
        int stackOut_107_2 = 0;
        int stackOut_60_0 = 0;
        int stackOut_61_0 = 0;
        String stackOut_83_0 = null;
        String stackOut_82_0 = null;
        int stackOut_84_0 = 0;
        String stackOut_84_1 = null;
        int stackOut_85_0 = 0;
        String stackOut_85_1 = null;
        int stackOut_86_0 = 0;
        String stackOut_86_1 = null;
        int stackOut_86_2 = 0;
        int stackOut_87_0 = 0;
        String stackOut_87_1 = null;
        int stackOut_87_2 = 0;
        String stackOut_69_0 = null;
        String stackOut_68_0 = null;
        int stackOut_70_0 = 0;
        String stackOut_70_1 = null;
        int stackOut_71_0 = 0;
        String stackOut_71_1 = null;
        int stackOut_72_0 = 0;
        String stackOut_72_1 = null;
        int stackOut_72_2 = 0;
        int stackOut_73_0 = 0;
        String stackOut_73_1 = null;
        int stackOut_73_2 = 0;
        int stackOut_25_0 = 0;
        int stackOut_26_0 = 0;
        String stackOut_48_0 = null;
        String stackOut_47_0 = null;
        int stackOut_49_0 = 0;
        String stackOut_49_1 = null;
        int stackOut_50_0 = 0;
        String stackOut_50_1 = null;
        int stackOut_51_0 = 0;
        String stackOut_51_1 = null;
        int stackOut_51_2 = 0;
        int stackOut_52_0 = 0;
        String stackOut_52_1 = null;
        int stackOut_52_2 = 0;
        String stackOut_34_0 = null;
        String stackOut_33_0 = null;
        int stackOut_35_0 = 0;
        String stackOut_35_1 = null;
        int stackOut_36_0 = 0;
        String stackOut_36_1 = null;
        int stackOut_37_0 = 0;
        String stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        int stackOut_38_0 = 0;
        String stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        String stackOut_15_0 = null;
        String stackOut_14_0 = null;
        int stackOut_16_0 = 0;
        String stackOut_16_1 = null;
        int stackOut_17_0 = 0;
        String stackOut_17_1 = null;
        int stackOut_18_0 = 0;
        String stackOut_18_1 = null;
        int stackOut_18_2 = 0;
        int stackOut_19_0 = 0;
        String stackOut_19_1 = null;
        int stackOut_19_2 = 0;
        if (fj.field_c) {
          if (hf.field_c) {
            var2 = 1;
            if (param0 >= 9) {
              L0: {
                L1: {
                  if (!param1) {
                    break L1;
                  } else {
                    if (!sq.c((byte) -103)) {
                      break L1;
                    } else {
                      if (var2 != 0) {
                        break L1;
                      } else {
                        stackOut_218_0 = 1;
                        stackIn_220_0 = stackOut_218_0;
                        break L0;
                      }
                    }
                  }
                }
                stackOut_219_0 = 0;
                stackIn_220_0 = stackOut_219_0;
                break L0;
              }
              tq.a(stackIn_220_0 != 0, false);
              if (null == rd.field_j) {
                L2: {
                  if (null != bc.field_a) {
                    bc.field_a.b(0, param1);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                fe.b(0, 0, so.field_b.field_a, so.field_b.field_g, dq.field_i, nd.field_b, 0, 0);
                if (var2 == 0) {
                  return;
                } else {
                  L3: {
                    if (!qa.field_F) {
                      stackOut_240_0 = cv.field_q;
                      stackIn_241_0 = stackOut_240_0;
                      break L3;
                    } else {
                      stackOut_239_0 = l.field_d;
                      stackIn_241_0 = stackOut_239_0;
                      break L3;
                    }
                  }
                  L4: {
                    L5: {
                      var3 = stackIn_241_0;
                      stackOut_241_0 = 0;
                      stackOut_241_1 = (String) (var3);
                      stackIn_244_0 = stackOut_241_0;
                      stackIn_244_1 = stackOut_241_1;
                      stackIn_242_0 = stackOut_241_0;
                      stackIn_242_1 = stackOut_241_1;
                      if (!param1) {
                        break L5;
                      } else {
                        stackOut_242_0 = stackIn_242_0;
                        stackOut_242_1 = (String) ((Object) stackIn_242_1);
                        stackIn_244_0 = stackOut_242_0;
                        stackIn_244_1 = stackOut_242_1;
                        stackIn_243_0 = stackOut_242_0;
                        stackIn_243_1 = stackOut_242_1;
                        if (!sq.c((byte) -103)) {
                          break L5;
                        } else {
                          stackOut_243_0 = stackIn_243_0;
                          stackOut_243_1 = (String) ((Object) stackIn_243_1);
                          stackOut_243_2 = 1;
                          stackIn_245_0 = stackOut_243_0;
                          stackIn_245_1 = stackOut_243_1;
                          stackIn_245_2 = stackOut_243_2;
                          break L4;
                        }
                      }
                    }
                    stackOut_244_0 = stackIn_244_0;
                    stackOut_244_1 = (String) ((Object) stackIn_244_1);
                    stackOut_244_2 = 0;
                    stackIn_245_0 = stackOut_244_0;
                    stackIn_245_1 = stackOut_244_1;
                    stackIn_245_2 = stackOut_244_2;
                    break L4;
                  }
                  rt.a(stackIn_245_0 != 0, stackIn_245_1, stackIn_245_2 != 0);
                  return;
                }
              } else {
                L6: {
                  rd.field_j.b(0, param1);
                  if (null != bc.field_a) {
                    bc.field_a.b(0, param1);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                fe.b(0, 0, so.field_b.field_a, so.field_b.field_g, dq.field_i, nd.field_b, 0, 0);
                if (var2 == 0) {
                  return;
                } else {
                  L7: {
                    if (!qa.field_F) {
                      stackOut_227_0 = cv.field_q;
                      stackIn_228_0 = stackOut_227_0;
                      break L7;
                    } else {
                      stackOut_226_0 = l.field_d;
                      stackIn_228_0 = stackOut_226_0;
                      break L7;
                    }
                  }
                  L8: {
                    L9: {
                      var3 = stackIn_228_0;
                      stackOut_228_0 = 0;
                      stackOut_228_1 = (String) (var3);
                      stackIn_231_0 = stackOut_228_0;
                      stackIn_231_1 = stackOut_228_1;
                      stackIn_229_0 = stackOut_228_0;
                      stackIn_229_1 = stackOut_228_1;
                      if (!param1) {
                        break L9;
                      } else {
                        stackOut_229_0 = stackIn_229_0;
                        stackOut_229_1 = (String) ((Object) stackIn_229_1);
                        stackIn_231_0 = stackOut_229_0;
                        stackIn_231_1 = stackOut_229_1;
                        stackIn_230_0 = stackOut_229_0;
                        stackIn_230_1 = stackOut_229_1;
                        if (!sq.c((byte) -103)) {
                          break L9;
                        } else {
                          stackOut_230_0 = stackIn_230_0;
                          stackOut_230_1 = (String) ((Object) stackIn_230_1);
                          stackOut_230_2 = 1;
                          stackIn_232_0 = stackOut_230_0;
                          stackIn_232_1 = stackOut_230_1;
                          stackIn_232_2 = stackOut_230_2;
                          break L8;
                        }
                      }
                    }
                    stackOut_231_0 = stackIn_231_0;
                    stackOut_231_1 = (String) ((Object) stackIn_231_1);
                    stackOut_231_2 = 0;
                    stackIn_232_0 = stackOut_231_0;
                    stackIn_232_1 = stackOut_231_1;
                    stackIn_232_2 = stackOut_231_2;
                    break L8;
                  }
                  rt.a(stackIn_232_0 != 0, stackIn_232_1, stackIn_232_2 != 0);
                  return;
                }
              }
            } else {
              var4 = (kl) null;
              discarded$3 = wl.a((kl) null, -105, true);
              if (param1) {
                if (sq.c((byte) -103)) {
                  L10: {
                    if (var2 != 0) {
                      stackOut_185_0 = 0;
                      stackIn_186_0 = stackOut_185_0;
                      break L10;
                    } else {
                      stackOut_184_0 = 1;
                      stackIn_186_0 = stackOut_184_0;
                      break L10;
                    }
                  }
                  tq.a(stackIn_186_0 != 0, false);
                  if (null == rd.field_j) {
                    L11: {
                      if (null != bc.field_a) {
                        bc.field_a.b(0, param1);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    fe.b(0, 0, so.field_b.field_a, so.field_b.field_g, dq.field_i, nd.field_b, 0, 0);
                    if (var2 != 0) {
                      L12: {
                        if (!qa.field_F) {
                          stackOut_208_0 = cv.field_q;
                          stackIn_209_0 = stackOut_208_0;
                          break L12;
                        } else {
                          stackOut_207_0 = l.field_d;
                          stackIn_209_0 = stackOut_207_0;
                          break L12;
                        }
                      }
                      L13: {
                        L14: {
                          var3 = stackIn_209_0;
                          stackOut_209_0 = 0;
                          stackOut_209_1 = (String) (var3);
                          stackIn_212_0 = stackOut_209_0;
                          stackIn_212_1 = stackOut_209_1;
                          stackIn_210_0 = stackOut_209_0;
                          stackIn_210_1 = stackOut_209_1;
                          if (!param1) {
                            break L14;
                          } else {
                            stackOut_210_0 = stackIn_210_0;
                            stackOut_210_1 = (String) ((Object) stackIn_210_1);
                            stackIn_212_0 = stackOut_210_0;
                            stackIn_212_1 = stackOut_210_1;
                            stackIn_211_0 = stackOut_210_0;
                            stackIn_211_1 = stackOut_210_1;
                            if (!sq.c((byte) -103)) {
                              break L14;
                            } else {
                              stackOut_211_0 = stackIn_211_0;
                              stackOut_211_1 = (String) ((Object) stackIn_211_1);
                              stackOut_211_2 = 1;
                              stackIn_213_0 = stackOut_211_0;
                              stackIn_213_1 = stackOut_211_1;
                              stackIn_213_2 = stackOut_211_2;
                              break L13;
                            }
                          }
                        }
                        stackOut_212_0 = stackIn_212_0;
                        stackOut_212_1 = (String) ((Object) stackIn_212_1);
                        stackOut_212_2 = 0;
                        stackIn_213_0 = stackOut_212_0;
                        stackIn_213_1 = stackOut_212_1;
                        stackIn_213_2 = stackOut_212_2;
                        break L13;
                      }
                      rt.a(stackIn_213_0 != 0, stackIn_213_1, stackIn_213_2 != 0);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    L15: {
                      rd.field_j.b(0, param1);
                      if (null != bc.field_a) {
                        bc.field_a.b(0, param1);
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    fe.b(0, 0, so.field_b.field_a, so.field_b.field_g, dq.field_i, nd.field_b, 0, 0);
                    if (var2 != 0) {
                      L16: {
                        if (!qa.field_F) {
                          stackOut_194_0 = cv.field_q;
                          stackIn_195_0 = stackOut_194_0;
                          break L16;
                        } else {
                          stackOut_193_0 = l.field_d;
                          stackIn_195_0 = stackOut_193_0;
                          break L16;
                        }
                      }
                      L17: {
                        L18: {
                          var3 = stackIn_195_0;
                          stackOut_195_0 = 0;
                          stackOut_195_1 = (String) (var3);
                          stackIn_198_0 = stackOut_195_0;
                          stackIn_198_1 = stackOut_195_1;
                          stackIn_196_0 = stackOut_195_0;
                          stackIn_196_1 = stackOut_195_1;
                          if (!param1) {
                            break L18;
                          } else {
                            stackOut_196_0 = stackIn_196_0;
                            stackOut_196_1 = (String) ((Object) stackIn_196_1);
                            stackIn_198_0 = stackOut_196_0;
                            stackIn_198_1 = stackOut_196_1;
                            stackIn_197_0 = stackOut_196_0;
                            stackIn_197_1 = stackOut_196_1;
                            if (!sq.c((byte) -103)) {
                              break L18;
                            } else {
                              stackOut_197_0 = stackIn_197_0;
                              stackOut_197_1 = (String) ((Object) stackIn_197_1);
                              stackOut_197_2 = 1;
                              stackIn_199_0 = stackOut_197_0;
                              stackIn_199_1 = stackOut_197_1;
                              stackIn_199_2 = stackOut_197_2;
                              break L17;
                            }
                          }
                        }
                        stackOut_198_0 = stackIn_198_0;
                        stackOut_198_1 = (String) ((Object) stackIn_198_1);
                        stackOut_198_2 = 0;
                        stackIn_199_0 = stackOut_198_0;
                        stackIn_199_1 = stackOut_198_1;
                        stackIn_199_2 = stackOut_198_2;
                        break L17;
                      }
                      rt.a(stackIn_199_0 != 0, stackIn_199_1, stackIn_199_2 != 0);
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  tq.a(false, false);
                  if (null == rd.field_j) {
                    L19: {
                      if (null != bc.field_a) {
                        bc.field_a.b(0, param1);
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    fe.b(0, 0, so.field_b.field_a, so.field_b.field_g, dq.field_i, nd.field_b, 0, 0);
                    if (var2 != 0) {
                      L20: {
                        if (!qa.field_F) {
                          stackOut_176_0 = cv.field_q;
                          stackIn_177_0 = stackOut_176_0;
                          break L20;
                        } else {
                          stackOut_175_0 = l.field_d;
                          stackIn_177_0 = stackOut_175_0;
                          break L20;
                        }
                      }
                      L21: {
                        L22: {
                          var3 = stackIn_177_0;
                          stackOut_177_0 = 0;
                          stackOut_177_1 = (String) (var3);
                          stackIn_180_0 = stackOut_177_0;
                          stackIn_180_1 = stackOut_177_1;
                          stackIn_178_0 = stackOut_177_0;
                          stackIn_178_1 = stackOut_177_1;
                          if (!param1) {
                            break L22;
                          } else {
                            stackOut_178_0 = stackIn_178_0;
                            stackOut_178_1 = (String) ((Object) stackIn_178_1);
                            stackIn_180_0 = stackOut_178_0;
                            stackIn_180_1 = stackOut_178_1;
                            stackIn_179_0 = stackOut_178_0;
                            stackIn_179_1 = stackOut_178_1;
                            if (!sq.c((byte) -103)) {
                              break L22;
                            } else {
                              stackOut_179_0 = stackIn_179_0;
                              stackOut_179_1 = (String) ((Object) stackIn_179_1);
                              stackOut_179_2 = 1;
                              stackIn_181_0 = stackOut_179_0;
                              stackIn_181_1 = stackOut_179_1;
                              stackIn_181_2 = stackOut_179_2;
                              break L21;
                            }
                          }
                        }
                        stackOut_180_0 = stackIn_180_0;
                        stackOut_180_1 = (String) ((Object) stackIn_180_1);
                        stackOut_180_2 = 0;
                        stackIn_181_0 = stackOut_180_0;
                        stackIn_181_1 = stackOut_180_1;
                        stackIn_181_2 = stackOut_180_2;
                        break L21;
                      }
                      rt.a(stackIn_181_0 != 0, stackIn_181_1, stackIn_181_2 != 0);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    L23: {
                      rd.field_j.b(0, param1);
                      if (null != bc.field_a) {
                        bc.field_a.b(0, param1);
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                    L24: {
                      fe.b(0, 0, so.field_b.field_a, so.field_b.field_g, dq.field_i, nd.field_b, 0, 0);
                      if (var2 == 0) {
                        break L24;
                      } else {
                        L25: {
                          if (!qa.field_F) {
                            stackOut_162_0 = cv.field_q;
                            stackIn_163_0 = stackOut_162_0;
                            break L25;
                          } else {
                            stackOut_161_0 = l.field_d;
                            stackIn_163_0 = stackOut_161_0;
                            break L25;
                          }
                        }
                        L26: {
                          L27: {
                            var3 = stackIn_163_0;
                            stackOut_163_0 = 0;
                            stackOut_163_1 = (String) (var3);
                            stackIn_166_0 = stackOut_163_0;
                            stackIn_166_1 = stackOut_163_1;
                            stackIn_164_0 = stackOut_163_0;
                            stackIn_164_1 = stackOut_163_1;
                            if (!param1) {
                              break L27;
                            } else {
                              stackOut_164_0 = stackIn_164_0;
                              stackOut_164_1 = (String) ((Object) stackIn_164_1);
                              stackIn_166_0 = stackOut_164_0;
                              stackIn_166_1 = stackOut_164_1;
                              stackIn_165_0 = stackOut_164_0;
                              stackIn_165_1 = stackOut_164_1;
                              if (!sq.c((byte) -103)) {
                                break L27;
                              } else {
                                stackOut_165_0 = stackIn_165_0;
                                stackOut_165_1 = (String) ((Object) stackIn_165_1);
                                stackOut_165_2 = 1;
                                stackIn_167_0 = stackOut_165_0;
                                stackIn_167_1 = stackOut_165_1;
                                stackIn_167_2 = stackOut_165_2;
                                break L26;
                              }
                            }
                          }
                          stackOut_166_0 = stackIn_166_0;
                          stackOut_166_1 = (String) ((Object) stackIn_166_1);
                          stackOut_166_2 = 0;
                          stackIn_167_0 = stackOut_166_0;
                          stackIn_167_1 = stackOut_166_1;
                          stackIn_167_2 = stackOut_166_2;
                          break L26;
                        }
                        rt.a(stackIn_167_0 != 0, stackIn_167_1, stackIn_167_2 != 0);
                        break L24;
                      }
                    }
                    return;
                  }
                }
              } else {
                tq.a(false, false);
                if (null == rd.field_j) {
                  L28: {
                    if (null != bc.field_a) {
                      bc.field_a.b(0, param1);
                      break L28;
                    } else {
                      break L28;
                    }
                  }
                  fe.b(0, 0, so.field_b.field_a, so.field_b.field_g, dq.field_i, nd.field_b, 0, 0);
                  if (var2 != 0) {
                    L29: {
                      if (!qa.field_F) {
                        stackOut_147_0 = cv.field_q;
                        stackIn_148_0 = stackOut_147_0;
                        break L29;
                      } else {
                        stackOut_146_0 = l.field_d;
                        stackIn_148_0 = stackOut_146_0;
                        break L29;
                      }
                    }
                    L30: {
                      L31: {
                        var3 = stackIn_148_0;
                        stackOut_148_0 = 0;
                        stackOut_148_1 = (String) (var3);
                        stackIn_151_0 = stackOut_148_0;
                        stackIn_151_1 = stackOut_148_1;
                        stackIn_149_0 = stackOut_148_0;
                        stackIn_149_1 = stackOut_148_1;
                        if (!param1) {
                          break L31;
                        } else {
                          stackOut_149_0 = stackIn_149_0;
                          stackOut_149_1 = (String) ((Object) stackIn_149_1);
                          stackIn_151_0 = stackOut_149_0;
                          stackIn_151_1 = stackOut_149_1;
                          stackIn_150_0 = stackOut_149_0;
                          stackIn_150_1 = stackOut_149_1;
                          if (!sq.c((byte) -103)) {
                            break L31;
                          } else {
                            stackOut_150_0 = stackIn_150_0;
                            stackOut_150_1 = (String) ((Object) stackIn_150_1);
                            stackOut_150_2 = 1;
                            stackIn_152_0 = stackOut_150_0;
                            stackIn_152_1 = stackOut_150_1;
                            stackIn_152_2 = stackOut_150_2;
                            break L30;
                          }
                        }
                      }
                      stackOut_151_0 = stackIn_151_0;
                      stackOut_151_1 = (String) ((Object) stackIn_151_1);
                      stackOut_151_2 = 0;
                      stackIn_152_0 = stackOut_151_0;
                      stackIn_152_1 = stackOut_151_1;
                      stackIn_152_2 = stackOut_151_2;
                      break L30;
                    }
                    rt.a(stackIn_152_0 != 0, stackIn_152_1, stackIn_152_2 != 0);
                    return;
                  } else {
                    return;
                  }
                } else {
                  L32: {
                    rd.field_j.b(0, param1);
                    if (null != bc.field_a) {
                      bc.field_a.b(0, param1);
                      break L32;
                    } else {
                      break L32;
                    }
                  }
                  L33: {
                    fe.b(0, 0, so.field_b.field_a, so.field_b.field_g, dq.field_i, nd.field_b, 0, 0);
                    if (var2 == 0) {
                      break L33;
                    } else {
                      L34: {
                        if (!qa.field_F) {
                          stackOut_133_0 = cv.field_q;
                          stackIn_134_0 = stackOut_133_0;
                          break L34;
                        } else {
                          stackOut_132_0 = l.field_d;
                          stackIn_134_0 = stackOut_132_0;
                          break L34;
                        }
                      }
                      L35: {
                        L36: {
                          var3 = stackIn_134_0;
                          stackOut_134_0 = 0;
                          stackOut_134_1 = (String) (var3);
                          stackIn_137_0 = stackOut_134_0;
                          stackIn_137_1 = stackOut_134_1;
                          stackIn_135_0 = stackOut_134_0;
                          stackIn_135_1 = stackOut_134_1;
                          if (!param1) {
                            break L36;
                          } else {
                            stackOut_135_0 = stackIn_135_0;
                            stackOut_135_1 = (String) ((Object) stackIn_135_1);
                            stackIn_137_0 = stackOut_135_0;
                            stackIn_137_1 = stackOut_135_1;
                            stackIn_136_0 = stackOut_135_0;
                            stackIn_136_1 = stackOut_135_1;
                            if (!sq.c((byte) -103)) {
                              break L36;
                            } else {
                              stackOut_136_0 = stackIn_136_0;
                              stackOut_136_1 = (String) ((Object) stackIn_136_1);
                              stackOut_136_2 = 1;
                              stackIn_138_0 = stackOut_136_0;
                              stackIn_138_1 = stackOut_136_1;
                              stackIn_138_2 = stackOut_136_2;
                              break L35;
                            }
                          }
                        }
                        stackOut_137_0 = stackIn_137_0;
                        stackOut_137_1 = (String) ((Object) stackIn_137_1);
                        stackOut_137_2 = 0;
                        stackIn_138_0 = stackOut_137_0;
                        stackIn_138_1 = stackOut_137_1;
                        stackIn_138_2 = stackOut_137_2;
                        break L35;
                      }
                      rt.a(stackIn_138_0 != 0, stackIn_138_1, stackIn_138_2 != 0);
                      break L33;
                    }
                  }
                  return;
                }
              }
            }
          } else {
            var2 = 0;
            if (param0 >= 9) {
              L37: {
                L38: {
                  if (!param1) {
                    break L38;
                  } else {
                    if (!sq.c((byte) -103)) {
                      break L38;
                    } else {
                      if (var2 != 0) {
                        break L38;
                      } else {
                        stackOut_93_0 = 1;
                        stackIn_95_0 = stackOut_93_0;
                        break L37;
                      }
                    }
                  }
                }
                stackOut_94_0 = 0;
                stackIn_95_0 = stackOut_94_0;
                break L37;
              }
              tq.a(stackIn_95_0 != 0, false);
              if (null == rd.field_j) {
                L39: {
                  if (null != bc.field_a) {
                    bc.field_a.b(0, param1);
                    break L39;
                  } else {
                    break L39;
                  }
                }
                fe.b(0, 0, so.field_b.field_a, so.field_b.field_g, dq.field_i, nd.field_b, 0, 0);
                if (var2 != 0) {
                  L40: {
                    if (!qa.field_F) {
                      stackOut_117_0 = cv.field_q;
                      stackIn_118_0 = stackOut_117_0;
                      break L40;
                    } else {
                      stackOut_116_0 = l.field_d;
                      stackIn_118_0 = stackOut_116_0;
                      break L40;
                    }
                  }
                  L41: {
                    L42: {
                      var3 = stackIn_118_0;
                      stackOut_118_0 = 0;
                      stackOut_118_1 = (String) (var3);
                      stackIn_121_0 = stackOut_118_0;
                      stackIn_121_1 = stackOut_118_1;
                      stackIn_119_0 = stackOut_118_0;
                      stackIn_119_1 = stackOut_118_1;
                      if (!param1) {
                        break L42;
                      } else {
                        stackOut_119_0 = stackIn_119_0;
                        stackOut_119_1 = (String) ((Object) stackIn_119_1);
                        stackIn_121_0 = stackOut_119_0;
                        stackIn_121_1 = stackOut_119_1;
                        stackIn_120_0 = stackOut_119_0;
                        stackIn_120_1 = stackOut_119_1;
                        if (!sq.c((byte) -103)) {
                          break L42;
                        } else {
                          stackOut_120_0 = stackIn_120_0;
                          stackOut_120_1 = (String) ((Object) stackIn_120_1);
                          stackOut_120_2 = 1;
                          stackIn_122_0 = stackOut_120_0;
                          stackIn_122_1 = stackOut_120_1;
                          stackIn_122_2 = stackOut_120_2;
                          break L41;
                        }
                      }
                    }
                    stackOut_121_0 = stackIn_121_0;
                    stackOut_121_1 = (String) ((Object) stackIn_121_1);
                    stackOut_121_2 = 0;
                    stackIn_122_0 = stackOut_121_0;
                    stackIn_122_1 = stackOut_121_1;
                    stackIn_122_2 = stackOut_121_2;
                    break L41;
                  }
                  rt.a(stackIn_122_0 != 0, stackIn_122_1, stackIn_122_2 != 0);
                  return;
                } else {
                  return;
                }
              } else {
                L43: {
                  rd.field_j.b(0, param1);
                  if (null != bc.field_a) {
                    bc.field_a.b(0, param1);
                    break L43;
                  } else {
                    break L43;
                  }
                }
                fe.b(0, 0, so.field_b.field_a, so.field_b.field_g, dq.field_i, nd.field_b, 0, 0);
                if (var2 != 0) {
                  L44: {
                    if (!qa.field_F) {
                      stackOut_103_0 = cv.field_q;
                      stackIn_104_0 = stackOut_103_0;
                      break L44;
                    } else {
                      stackOut_102_0 = l.field_d;
                      stackIn_104_0 = stackOut_102_0;
                      break L44;
                    }
                  }
                  L45: {
                    L46: {
                      var3 = stackIn_104_0;
                      stackOut_104_0 = 0;
                      stackOut_104_1 = (String) (var3);
                      stackIn_107_0 = stackOut_104_0;
                      stackIn_107_1 = stackOut_104_1;
                      stackIn_105_0 = stackOut_104_0;
                      stackIn_105_1 = stackOut_104_1;
                      if (!param1) {
                        break L46;
                      } else {
                        stackOut_105_0 = stackIn_105_0;
                        stackOut_105_1 = (String) ((Object) stackIn_105_1);
                        stackIn_107_0 = stackOut_105_0;
                        stackIn_107_1 = stackOut_105_1;
                        stackIn_106_0 = stackOut_105_0;
                        stackIn_106_1 = stackOut_105_1;
                        if (!sq.c((byte) -103)) {
                          break L46;
                        } else {
                          stackOut_106_0 = stackIn_106_0;
                          stackOut_106_1 = (String) ((Object) stackIn_106_1);
                          stackOut_106_2 = 1;
                          stackIn_108_0 = stackOut_106_0;
                          stackIn_108_1 = stackOut_106_1;
                          stackIn_108_2 = stackOut_106_2;
                          break L45;
                        }
                      }
                    }
                    stackOut_107_0 = stackIn_107_0;
                    stackOut_107_1 = (String) ((Object) stackIn_107_1);
                    stackOut_107_2 = 0;
                    stackIn_108_0 = stackOut_107_0;
                    stackIn_108_1 = stackOut_107_1;
                    stackIn_108_2 = stackOut_107_2;
                    break L45;
                  }
                  rt.a(stackIn_108_0 != 0, stackIn_108_1, stackIn_108_2 != 0);
                  return;
                } else {
                  return;
                }
              }
            } else {
              L47: {
                L48: {
                  var4 = (kl) null;
                  discarded$4 = wl.a((kl) null, -105, true);
                  if (!param1) {
                    break L48;
                  } else {
                    if (!sq.c((byte) -103)) {
                      break L48;
                    } else {
                      if (var2 != 0) {
                        break L48;
                      } else {
                        stackOut_60_0 = 1;
                        stackIn_62_0 = stackOut_60_0;
                        break L47;
                      }
                    }
                  }
                }
                stackOut_61_0 = 0;
                stackIn_62_0 = stackOut_61_0;
                break L47;
              }
              tq.a(stackIn_62_0 != 0, false);
              if (null == rd.field_j) {
                L49: {
                  if (null != bc.field_a) {
                    bc.field_a.b(0, param1);
                    break L49;
                  } else {
                    break L49;
                  }
                }
                fe.b(0, 0, so.field_b.field_a, so.field_b.field_g, dq.field_i, nd.field_b, 0, 0);
                if (var2 != 0) {
                  L50: {
                    if (!qa.field_F) {
                      stackOut_83_0 = cv.field_q;
                      stackIn_84_0 = stackOut_83_0;
                      break L50;
                    } else {
                      stackOut_82_0 = l.field_d;
                      stackIn_84_0 = stackOut_82_0;
                      break L50;
                    }
                  }
                  L51: {
                    L52: {
                      var3 = stackIn_84_0;
                      stackOut_84_0 = 0;
                      stackOut_84_1 = (String) (var3);
                      stackIn_87_0 = stackOut_84_0;
                      stackIn_87_1 = stackOut_84_1;
                      stackIn_85_0 = stackOut_84_0;
                      stackIn_85_1 = stackOut_84_1;
                      if (!param1) {
                        break L52;
                      } else {
                        stackOut_85_0 = stackIn_85_0;
                        stackOut_85_1 = (String) ((Object) stackIn_85_1);
                        stackIn_87_0 = stackOut_85_0;
                        stackIn_87_1 = stackOut_85_1;
                        stackIn_86_0 = stackOut_85_0;
                        stackIn_86_1 = stackOut_85_1;
                        if (!sq.c((byte) -103)) {
                          break L52;
                        } else {
                          stackOut_86_0 = stackIn_86_0;
                          stackOut_86_1 = (String) ((Object) stackIn_86_1);
                          stackOut_86_2 = 1;
                          stackIn_88_0 = stackOut_86_0;
                          stackIn_88_1 = stackOut_86_1;
                          stackIn_88_2 = stackOut_86_2;
                          break L51;
                        }
                      }
                    }
                    stackOut_87_0 = stackIn_87_0;
                    stackOut_87_1 = (String) ((Object) stackIn_87_1);
                    stackOut_87_2 = 0;
                    stackIn_88_0 = stackOut_87_0;
                    stackIn_88_1 = stackOut_87_1;
                    stackIn_88_2 = stackOut_87_2;
                    break L51;
                  }
                  rt.a(stackIn_88_0 != 0, stackIn_88_1, stackIn_88_2 != 0);
                  return;
                } else {
                  return;
                }
              } else {
                L53: {
                  rd.field_j.b(0, param1);
                  if (null != bc.field_a) {
                    bc.field_a.b(0, param1);
                    break L53;
                  } else {
                    break L53;
                  }
                }
                L54: {
                  fe.b(0, 0, so.field_b.field_a, so.field_b.field_g, dq.field_i, nd.field_b, 0, 0);
                  if (var2 == 0) {
                    break L54;
                  } else {
                    L55: {
                      if (!qa.field_F) {
                        stackOut_69_0 = cv.field_q;
                        stackIn_70_0 = stackOut_69_0;
                        break L55;
                      } else {
                        stackOut_68_0 = l.field_d;
                        stackIn_70_0 = stackOut_68_0;
                        break L55;
                      }
                    }
                    L56: {
                      L57: {
                        var3 = stackIn_70_0;
                        stackOut_70_0 = 0;
                        stackOut_70_1 = (String) (var3);
                        stackIn_73_0 = stackOut_70_0;
                        stackIn_73_1 = stackOut_70_1;
                        stackIn_71_0 = stackOut_70_0;
                        stackIn_71_1 = stackOut_70_1;
                        if (!param1) {
                          break L57;
                        } else {
                          stackOut_71_0 = stackIn_71_0;
                          stackOut_71_1 = (String) ((Object) stackIn_71_1);
                          stackIn_73_0 = stackOut_71_0;
                          stackIn_73_1 = stackOut_71_1;
                          stackIn_72_0 = stackOut_71_0;
                          stackIn_72_1 = stackOut_71_1;
                          if (!sq.c((byte) -103)) {
                            break L57;
                          } else {
                            stackOut_72_0 = stackIn_72_0;
                            stackOut_72_1 = (String) ((Object) stackIn_72_1);
                            stackOut_72_2 = 1;
                            stackIn_74_0 = stackOut_72_0;
                            stackIn_74_1 = stackOut_72_1;
                            stackIn_74_2 = stackOut_72_2;
                            break L56;
                          }
                        }
                      }
                      stackOut_73_0 = stackIn_73_0;
                      stackOut_73_1 = (String) ((Object) stackIn_73_1);
                      stackOut_73_2 = 0;
                      stackIn_74_0 = stackOut_73_0;
                      stackIn_74_1 = stackOut_73_1;
                      stackIn_74_2 = stackOut_73_2;
                      break L56;
                    }
                    rt.a(stackIn_74_0 != 0, stackIn_74_1, stackIn_74_2 != 0);
                    break L54;
                  }
                }
                return;
              }
            }
          }
        } else {
          var2 = 0;
          if (param0 >= 9) {
            L58: {
              L59: {
                if (!param1) {
                  break L59;
                } else {
                  if (!sq.c((byte) -103)) {
                    break L59;
                  } else {
                    if (var2 != 0) {
                      break L59;
                    } else {
                      stackOut_25_0 = 1;
                      stackIn_27_0 = stackOut_25_0;
                      break L58;
                    }
                  }
                }
              }
              stackOut_26_0 = 0;
              stackIn_27_0 = stackOut_26_0;
              break L58;
            }
            tq.a(stackIn_27_0 != 0, false);
            if (null == rd.field_j) {
              L60: {
                if (null != bc.field_a) {
                  bc.field_a.b(0, param1);
                  break L60;
                } else {
                  break L60;
                }
              }
              fe.b(0, 0, so.field_b.field_a, so.field_b.field_g, dq.field_i, nd.field_b, 0, 0);
              if (var2 != 0) {
                L61: {
                  if (!qa.field_F) {
                    stackOut_48_0 = cv.field_q;
                    stackIn_49_0 = stackOut_48_0;
                    break L61;
                  } else {
                    stackOut_47_0 = l.field_d;
                    stackIn_49_0 = stackOut_47_0;
                    break L61;
                  }
                }
                L62: {
                  L63: {
                    var3 = stackIn_49_0;
                    stackOut_49_0 = 0;
                    stackOut_49_1 = (String) (var3);
                    stackIn_52_0 = stackOut_49_0;
                    stackIn_52_1 = stackOut_49_1;
                    stackIn_50_0 = stackOut_49_0;
                    stackIn_50_1 = stackOut_49_1;
                    if (!param1) {
                      break L63;
                    } else {
                      stackOut_50_0 = stackIn_50_0;
                      stackOut_50_1 = (String) ((Object) stackIn_50_1);
                      stackIn_52_0 = stackOut_50_0;
                      stackIn_52_1 = stackOut_50_1;
                      stackIn_51_0 = stackOut_50_0;
                      stackIn_51_1 = stackOut_50_1;
                      if (!sq.c((byte) -103)) {
                        break L63;
                      } else {
                        stackOut_51_0 = stackIn_51_0;
                        stackOut_51_1 = (String) ((Object) stackIn_51_1);
                        stackOut_51_2 = 1;
                        stackIn_53_0 = stackOut_51_0;
                        stackIn_53_1 = stackOut_51_1;
                        stackIn_53_2 = stackOut_51_2;
                        break L62;
                      }
                    }
                  }
                  stackOut_52_0 = stackIn_52_0;
                  stackOut_52_1 = (String) ((Object) stackIn_52_1);
                  stackOut_52_2 = 0;
                  stackIn_53_0 = stackOut_52_0;
                  stackIn_53_1 = stackOut_52_1;
                  stackIn_53_2 = stackOut_52_2;
                  break L62;
                }
                rt.a(stackIn_53_0 != 0, stackIn_53_1, stackIn_53_2 != 0);
                return;
              } else {
                return;
              }
            } else {
              L64: {
                rd.field_j.b(0, param1);
                if (null != bc.field_a) {
                  bc.field_a.b(0, param1);
                  break L64;
                } else {
                  break L64;
                }
              }
              L65: {
                fe.b(0, 0, so.field_b.field_a, so.field_b.field_g, dq.field_i, nd.field_b, 0, 0);
                if (var2 == 0) {
                  break L65;
                } else {
                  L66: {
                    if (!qa.field_F) {
                      stackOut_34_0 = cv.field_q;
                      stackIn_35_0 = stackOut_34_0;
                      break L66;
                    } else {
                      stackOut_33_0 = l.field_d;
                      stackIn_35_0 = stackOut_33_0;
                      break L66;
                    }
                  }
                  L67: {
                    L68: {
                      var3 = stackIn_35_0;
                      stackOut_35_0 = 0;
                      stackOut_35_1 = (String) (var3);
                      stackIn_38_0 = stackOut_35_0;
                      stackIn_38_1 = stackOut_35_1;
                      stackIn_36_0 = stackOut_35_0;
                      stackIn_36_1 = stackOut_35_1;
                      if (!param1) {
                        break L68;
                      } else {
                        stackOut_36_0 = stackIn_36_0;
                        stackOut_36_1 = (String) ((Object) stackIn_36_1);
                        stackIn_38_0 = stackOut_36_0;
                        stackIn_38_1 = stackOut_36_1;
                        stackIn_37_0 = stackOut_36_0;
                        stackIn_37_1 = stackOut_36_1;
                        if (!sq.c((byte) -103)) {
                          break L68;
                        } else {
                          stackOut_37_0 = stackIn_37_0;
                          stackOut_37_1 = (String) ((Object) stackIn_37_1);
                          stackOut_37_2 = 1;
                          stackIn_39_0 = stackOut_37_0;
                          stackIn_39_1 = stackOut_37_1;
                          stackIn_39_2 = stackOut_37_2;
                          break L67;
                        }
                      }
                    }
                    stackOut_38_0 = stackIn_38_0;
                    stackOut_38_1 = (String) ((Object) stackIn_38_1);
                    stackOut_38_2 = 0;
                    stackIn_39_0 = stackOut_38_0;
                    stackIn_39_1 = stackOut_38_1;
                    stackIn_39_2 = stackOut_38_2;
                    break L67;
                  }
                  rt.a(stackIn_39_0 != 0, stackIn_39_1, stackIn_39_2 != 0);
                  break L65;
                }
              }
              return;
            }
          } else {
            L69: {
              L70: {
                var4 = (kl) null;
                discarded$5 = wl.a((kl) null, -105, true);
                if (!param1) {
                  break L70;
                } else {
                  if (!sq.c((byte) -103)) {
                    break L70;
                  } else {
                    if (var2 != 0) {
                      break L70;
                    } else {
                      stackOut_5_0 = 1;
                      stackIn_7_0 = stackOut_5_0;
                      break L69;
                    }
                  }
                }
              }
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L69;
            }
            L71: {
              tq.a(stackIn_7_0 != 0, false);
              if (null == rd.field_j) {
                break L71;
              } else {
                rd.field_j.b(0, param1);
                break L71;
              }
            }
            L72: {
              if (null != bc.field_a) {
                bc.field_a.b(0, param1);
                break L72;
              } else {
                break L72;
              }
            }
            L73: {
              fe.b(0, 0, so.field_b.field_a, so.field_b.field_g, dq.field_i, nd.field_b, 0, 0);
              if (var2 == 0) {
                break L73;
              } else {
                L74: {
                  if (!qa.field_F) {
                    stackOut_15_0 = cv.field_q;
                    stackIn_16_0 = stackOut_15_0;
                    break L74;
                  } else {
                    stackOut_14_0 = l.field_d;
                    stackIn_16_0 = stackOut_14_0;
                    break L74;
                  }
                }
                L75: {
                  L76: {
                    var3 = stackIn_16_0;
                    stackOut_16_0 = 0;
                    stackOut_16_1 = (String) (var3);
                    stackIn_19_0 = stackOut_16_0;
                    stackIn_19_1 = stackOut_16_1;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    if (!param1) {
                      break L76;
                    } else {
                      stackOut_17_0 = stackIn_17_0;
                      stackOut_17_1 = (String) ((Object) stackIn_17_1);
                      stackIn_19_0 = stackOut_17_0;
                      stackIn_19_1 = stackOut_17_1;
                      stackIn_18_0 = stackOut_17_0;
                      stackIn_18_1 = stackOut_17_1;
                      if (!sq.c((byte) -103)) {
                        break L76;
                      } else {
                        stackOut_18_0 = stackIn_18_0;
                        stackOut_18_1 = (String) ((Object) stackIn_18_1);
                        stackOut_18_2 = 1;
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_20_1 = stackOut_18_1;
                        stackIn_20_2 = stackOut_18_2;
                        break L75;
                      }
                    }
                  }
                  stackOut_19_0 = stackIn_19_0;
                  stackOut_19_1 = (String) ((Object) stackIn_19_1);
                  stackOut_19_2 = 0;
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  stackIn_20_2 = stackOut_19_2;
                  break L75;
                }
                rt.a(stackIn_20_0 != 0, stackIn_20_1, stackIn_20_2 != 0);
                break L73;
              }
            }
            return;
          }
        }
    }

    private final int g(byte param0) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 122) {
          L0: {
            this.field_H = -92;
            if (this.field_L) {
              if (this != this.field_G.a((byte) 89)) {
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                stackOut_10_0 = 256;
                stackIn_12_0 = stackOut_10_0;
                break L0;
              }
            } else {
              stackOut_8_0 = 0;
              stackIn_12_0 = stackOut_8_0;
              break L0;
            }
          }
          return stackIn_12_0;
        } else {
          L1: {
            if (this.field_L) {
              if (this != this.field_G.a((byte) 89)) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = 256;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_6_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_6_0;
        }
    }

    boolean k(int param0) {
        int var2 = 0;
        this.field_H = this.g((byte) 122);
        var2 = -85 / ((param0 - -1) / 44);
        if (this.field_H == 0) {
          if (this.field_L) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    abstract void b(int param0, int param1, int param2);

    wl(gk param0, int param1, int param2) {
        super(te.field_l - param1 >> 519638177, ij.field_x + -param2 >> 1117023425, param1, param2, (kh) null);
        try {
            this.field_G = param0;
            this.field_L = false;
            this.field_H = 0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "wl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            qc.field_h.a(param0);
            var1_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if ((var1_int ^ -1) <= -33) {
                    break L3;
                  } else {
                    jb.field_u[var1_int] = 0L;
                    var1_int++;
                    if (var2 != 0) {
                      break L2;
                    } else {
                      if (var2 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var1_int = 0;
                break L2;
              }
              L4: while (true) {
                L5: {
                  L6: {
                    if ((var1_int ^ -1) <= -33) {
                      break L6;
                    } else {
                      om.field_r[var1_int] = 0L;
                      var1_int++;
                      if (var2 != 0) {
                        break L5;
                      } else {
                        if (var2 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  kb.field_A = 0;
                  break L5;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) runtimeException), "wl.GA(" + param0 + ')');
        }
    }

    static {
        field_J = "Use this alternative as your account name";
        field_M = new String[]{"trinket_armour_camouflage", "trinket_armour_dragonscale", "trinket_armour_enchanted", "trinket_armour_padded", "trinket_armour_plate", "trinket_armour_runic", "trinket_armour_sacrificial", "trinket_magic", "trinket_melee", "trinket_ranged", "trinket_aerial_talons", "trinket_flame", "trinket_flag", "trinket_grappling_hook", "trinket_soul_stone", "trinket_waders_and_elidin_boots", "trinket_fortify", "trinket_revolt", "trinket_curse", "trinket_potion", "trinket_cyclops_eyedrops", "trinket_elven_lozenge", "trinket_ogre_charcoal", "trinket_kalphite_eggsack", "trinket_goblin_hallucinogen", "trinket_vampire_blood", "trinket_mitosis", "trinket_prayer", "trinket_prayer_kbd_restore", "trinket_raise_single_dead", "trinket_raise_area_dead", "trinket_spiritual_barrier", "trinket_landscaping_build_bridge", "trinket_landscaping_forest_haven", "trinket_landscaping_mountain_crumble", "trinket_landscaping_river_haven", "trinket_landscaping_swamp_haven", "trinket_spell_harming_magicbolt", "trinket_spell_harming_rain_of_fire", "trinket_prayer_aura", "trinket_prayer_ray", "trinket_teleport", "trinket_interface_collapse", "trinket_interface_expand", "trinket_interface_collapse_short", "trinket_interface_expand_short", "trinket_ring_of_life_reappear"};
    }
}
