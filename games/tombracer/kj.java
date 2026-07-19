/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj extends nv implements ut {
    private boolean field_s;
    private boolean field_r;
    private int field_u;
    private int field_v;
    private int field_p;
    private int field_o;
    private boolean field_t;
    private boolean field_q;
    private jma field_n;

    public final int j(byte param0) {
        if (param0 != -108) {
            return 74;
        }
        return 0;
    }

    final int a(int param0, int param1) {
        param0 = this.field_n.a(121, param0);
        if (param1 > -48) {
            return 47;
        }
        return param0;
    }

    private final boolean r(int param0) {
        int var2 = this.m((byte) 19).g(-25787);
        int var3 = ua.a(var2 - (4096 + this.field_v), -120);
        var3 = dfa.a(var3, param0, 109);
        if (!(4096 >= var3)) {
            var3 = 8192 - var3;
        }
        return this.field_u / 2 >= var3 ? true : false;
    }

    final void a(boolean param0, fsa param1) {
        try {
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "kj.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean l(int param0) {
        int var2 = this.field_g.g(-25787);
        int var3 = ua.a(var2 + -this.field_v, -113);
        var3 = dfa.a(var3, param0, param0 ^ -8300);
        if (-4097 > (var3 ^ -1)) {
            var3 = -var3 + 8192;
        }
        return this.field_o / 2 >= var3 ? true : false;
    }

    public final int g(byte param0) {
        int discarded$0 = 0;
        if (param0 != -108) {
            discarded$0 = this.g((byte) -25);
            return 7798954;
        }
        return 7798954;
    }

    final int a(boolean param0) {
        int discarded$0 = 0;
        if (param0) {
            discarded$0 = this.a(-15, 107);
            return 22;
        }
        return 22;
    }

    public final int c(int param0) {
        if (param0 != 17832) {
            return 6;
        }
        return 4456550;
    }

    public final jma k(byte param0) {
        if (param0 >= -67) {
            this.field_v = 68;
            return this.field_n;
        }
        return this.field_n;
    }

    private final boolean e(boolean param0) {
        int var2 = 0;
        hca var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var2 = this.field_p >> 1957873616;
        var2 = var2 * var2;
        var3 = this.m((byte) 19);
        if (param0) {
          L0: {
            this.field_s = false;
            var4 = this.field_g.d(3) - var3.d(3) >> -893881776;
            var5 = this.field_g.e(9648) + -var3.e(9648) >> -1477182736;
            var6 = var4 * var4 - -(var5 * var5);
            if (var6 >= var2) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            var4 = this.field_g.d(3) - var3.d(3) >> -893881776;
            var5 = this.field_g.e(9648) + -var3.e(9648) >> -1477182736;
            var6 = var4 * var4 - -(var5 * var5);
            if (var6 >= var2) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    kj(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_11_0 = null;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            L1: {
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if ((param1.b((byte) 44, 1) ^ -1) == -2) {
                stackOut_3_0 = this;
                stackOut_3_1 = 1;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 0;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((kj) (this)).field_s = stackIn_4_1 != 0;
              if (!this.field_s) {
                break L2;
              } else {
                this.field_u = oo.a(8, 8192, 0, param1.b((byte) 44, 8));
                break L2;
              }
            }
            L3: {
              stackOut_6_0 = this;
              stackIn_8_0 = stackOut_6_0;
              stackIn_7_0 = stackOut_6_0;
              if (-2 == (param1.b((byte) 44, 1) ^ -1)) {
                stackOut_8_0 = this;
                stackOut_8_1 = 1;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                break L3;
              } else {
                stackOut_7_0 = this;
                stackOut_7_1 = 0;
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                break L3;
              }
            }
            L4: {
              ((kj) (this)).field_r = stackIn_9_1 != 0;
              if (!this.field_r) {
                break L4;
              } else {
                this.field_o = oo.a(8, 8192, 0, param1.b((byte) 44, 8));
                break L4;
              }
            }
            L5: {
              stackOut_11_0 = this;
              stackIn_13_0 = stackOut_11_0;
              stackIn_12_0 = stackOut_11_0;
              if (1 != param1.b((byte) 44, 1)) {
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
            L6: {
              ((kj) (this)).field_q = stackIn_14_1 != 0;
              if (!this.field_q) {
                break L6;
              } else {
                this.field_p = param1.b((byte) 44, 10) << -997912112;
                break L6;
              }
            }
            L7: {
              stackOut_16_0 = this;
              stackIn_18_0 = stackOut_16_0;
              stackIn_17_0 = stackOut_16_0;
              if (-2 == (param1.b((byte) 44, 1) ^ -1)) {
                stackOut_18_0 = this;
                stackOut_18_1 = 1;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                break L7;
              } else {
                stackOut_17_0 = this;
                stackOut_17_1 = 0;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                break L7;
              }
            }
            ((kj) (this)).field_t = stackIn_19_1 != 0;
            this.field_n = new jma(15, param0, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var4);
            stackOut_21_1 = new StringBuilder().append("kj.<init>(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          L9: {
            stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param2 + ')');
        }
    }

    final void g(int param0) {
        super.g(param0);
        this.field_n.a((byte) 48, this.h((byte) 127));
    }

    final void k(int param0) {
        int var2 = 0;
        int var4 = 0;
        int var5 = 0;
        hca var6 = null;
        hca var7 = null;
        hca var8 = null;
        hca var9 = null;
        hca var10 = null;
        hca var11 = null;
        hca var12 = null;
        hca var13 = null;
        int stackIn_13_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_117_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_133_0 = 0;
        int stackIn_141_0 = 0;
        int stackIn_147_0 = 0;
        int stackIn_155_0 = 0;
        int stackIn_165_0 = 0;
        int stackIn_173_0 = 0;
        int stackIn_179_0 = 0;
        int stackIn_187_0 = 0;
        int stackIn_195_0 = 0;
        int stackIn_202_0 = 0;
        int stackIn_210_0 = 0;
        int stackIn_218_0 = 0;
        int stackIn_226_0 = 0;
        int stackIn_232_0 = 0;
        int stackIn_240_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_124_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_116_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_217_0 = 0;
        int stackOut_216_0 = 0;
        int stackOut_231_0 = 0;
        int stackOut_230_0 = 0;
        int stackOut_225_0 = 0;
        int stackOut_224_0 = 0;
        int stackOut_239_0 = 0;
        int stackOut_238_0 = 0;
        int stackOut_194_0 = 0;
        int stackOut_193_0 = 0;
        int stackOut_201_0 = 0;
        int stackOut_200_0 = 0;
        int stackOut_209_0 = 0;
        int stackOut_208_0 = 0;
        int stackOut_164_0 = 0;
        int stackOut_163_0 = 0;
        int stackOut_178_0 = 0;
        int stackOut_177_0 = 0;
        int stackOut_172_0 = 0;
        int stackOut_171_0 = 0;
        int stackOut_186_0 = 0;
        int stackOut_185_0 = 0;
        int stackOut_132_0 = 0;
        int stackOut_131_0 = 0;
        int stackOut_146_0 = 0;
        int stackOut_145_0 = 0;
        int stackOut_140_0 = 0;
        int stackOut_139_0 = 0;
        int stackOut_154_0 = 0;
        int stackOut_153_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_87_0 = 0;
        var2 = 1;
        if (param0 != 5418) {
          L0: {
            this.field_q = false;
            if (var2 == 0) {
              break L0;
            } else {
              if (this.field_t) {
                L1: {
                  if (!this.d(false)) {
                    stackOut_125_0 = 0;
                    stackIn_126_0 = stackOut_125_0;
                    break L1;
                  } else {
                    stackOut_124_0 = 1;
                    stackIn_126_0 = stackOut_124_0;
                    break L1;
                  }
                }
                var2 = stackIn_126_0;
                break L0;
              } else {
                L2: {
                  if (this.field_s) {
                    var10 = this.m((byte) 19);
                    var4 = var10.d(3) + -this.field_g.d(3);
                    var5 = var10.e(9648) - this.field_g.e(9648);
                    this.field_v = qva.a((byte) -94, var5, var4);
                    break L2;
                  } else {
                    if (!this.field_r) {
                      break L2;
                    } else {
                      var11 = this.m((byte) 19);
                      var4 = var11.d(3) + -this.field_g.d(3);
                      var5 = var11.e(9648) - this.field_g.e(9648);
                      this.field_v = qva.a((byte) -94, var5, var4);
                      break L2;
                    }
                  }
                }
                L3: {
                  if (var2 == 0) {
                    break L3;
                  } else {
                    if (!this.field_s) {
                      break L3;
                    } else {
                      L4: {
                        if (!this.r(8192)) {
                          stackOut_103_0 = 0;
                          stackIn_104_0 = stackOut_103_0;
                          break L4;
                        } else {
                          stackOut_102_0 = 1;
                          stackIn_104_0 = stackOut_102_0;
                          break L4;
                        }
                      }
                      var2 = stackIn_104_0;
                      break L3;
                    }
                  }
                }
                L5: {
                  if (var2 == 0) {
                    break L5;
                  } else {
                    if (this.field_r) {
                      L6: {
                        if (!this.l(8192)) {
                          stackOut_110_0 = 0;
                          stackIn_111_0 = stackOut_110_0;
                          break L6;
                        } else {
                          stackOut_109_0 = 1;
                          stackIn_111_0 = stackOut_109_0;
                          break L6;
                        }
                      }
                      var2 = stackIn_111_0;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                L7: {
                  if (var2 == 0) {
                    this.field_n.a((byte) -14, var2 != 0);
                    break L7;
                  } else {
                    if (!this.field_q) {
                      this.field_n.a((byte) -14, var2 != 0);
                      break L7;
                    } else {
                      L8: {
                        if (!this.e(false)) {
                          stackOut_116_0 = 0;
                          stackIn_117_0 = stackOut_116_0;
                          break L8;
                        } else {
                          stackOut_115_0 = 1;
                          stackIn_117_0 = stackOut_115_0;
                          break L8;
                        }
                      }
                      var2 = stackIn_117_0;
                      this.field_n.a((byte) -14, var2 != 0);
                      break L7;
                    }
                  }
                }
                return;
              }
            }
          }
          if (var2 != 0) {
            if (this.field_s) {
              L9: {
                var13 = this.m((byte) 19);
                var4 = var13.d(3) + -this.field_g.d(3);
                var5 = var13.e(9648) - this.field_g.e(9648);
                this.field_v = qva.a((byte) -94, var5, var4);
                if (var2 == 0) {
                  break L9;
                } else {
                  if (!this.field_s) {
                    break L9;
                  } else {
                    L10: {
                      if (!this.r(8192)) {
                        stackOut_217_0 = 0;
                        stackIn_218_0 = stackOut_217_0;
                        break L10;
                      } else {
                        stackOut_216_0 = 1;
                        stackIn_218_0 = stackOut_216_0;
                        break L10;
                      }
                    }
                    var2 = stackIn_218_0;
                    break L9;
                  }
                }
              }
              L11: {
                if (var2 == 0) {
                  break L11;
                } else {
                  if (this.field_r) {
                    L12: {
                      if (!this.l(8192)) {
                        stackOut_231_0 = 0;
                        stackIn_232_0 = stackOut_231_0;
                        break L12;
                      } else {
                        stackOut_230_0 = 1;
                        stackIn_232_0 = stackOut_230_0;
                        break L12;
                      }
                    }
                    var2 = stackIn_232_0;
                    break L11;
                  } else {
                    if (this.field_q) {
                      L13: {
                        if (!this.e(false)) {
                          stackOut_225_0 = 0;
                          stackIn_226_0 = stackOut_225_0;
                          break L13;
                        } else {
                          stackOut_224_0 = 1;
                          stackIn_226_0 = stackOut_224_0;
                          break L13;
                        }
                      }
                      var2 = stackIn_226_0;
                      this.field_n.a((byte) -14, var2 != 0);
                      return;
                    } else {
                      this.field_n.a((byte) -14, var2 != 0);
                      return;
                    }
                  }
                }
              }
              if (var2 != 0) {
                if (this.field_q) {
                  L14: {
                    if (!this.e(false)) {
                      stackOut_239_0 = 0;
                      stackIn_240_0 = stackOut_239_0;
                      break L14;
                    } else {
                      stackOut_238_0 = 1;
                      stackIn_240_0 = stackOut_238_0;
                      break L14;
                    }
                  }
                  var2 = stackIn_240_0;
                  this.field_n.a((byte) -14, var2 != 0);
                  return;
                } else {
                  this.field_n.a((byte) -14, var2 != 0);
                  return;
                }
              } else {
                this.field_n.a((byte) -14, var2 != 0);
                return;
              }
            } else {
              if (this.field_r) {
                L15: {
                  var12 = this.m((byte) 19);
                  var4 = var12.d(3) + -this.field_g.d(3);
                  var5 = var12.e(9648) - this.field_g.e(9648);
                  this.field_v = qva.a((byte) -94, var5, var4);
                  if (var2 == 0) {
                    break L15;
                  } else {
                    if (!this.field_s) {
                      break L15;
                    } else {
                      L16: {
                        if (!this.r(8192)) {
                          stackOut_194_0 = 0;
                          stackIn_195_0 = stackOut_194_0;
                          break L16;
                        } else {
                          stackOut_193_0 = 1;
                          stackIn_195_0 = stackOut_193_0;
                          break L16;
                        }
                      }
                      var2 = stackIn_195_0;
                      break L15;
                    }
                  }
                }
                L17: {
                  if (var2 == 0) {
                    break L17;
                  } else {
                    if (this.field_r) {
                      L18: {
                        if (!this.l(8192)) {
                          stackOut_201_0 = 0;
                          stackIn_202_0 = stackOut_201_0;
                          break L18;
                        } else {
                          stackOut_200_0 = 1;
                          stackIn_202_0 = stackOut_200_0;
                          break L18;
                        }
                      }
                      var2 = stackIn_202_0;
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                }
                if (var2 != 0) {
                  if (this.field_q) {
                    L19: {
                      if (!this.e(false)) {
                        stackOut_209_0 = 0;
                        stackIn_210_0 = stackOut_209_0;
                        break L19;
                      } else {
                        stackOut_208_0 = 1;
                        stackIn_210_0 = stackOut_208_0;
                        break L19;
                      }
                    }
                    var2 = stackIn_210_0;
                    this.field_n.a((byte) -14, var2 != 0);
                    return;
                  } else {
                    this.field_n.a((byte) -14, var2 != 0);
                    return;
                  }
                } else {
                  this.field_n.a((byte) -14, var2 != 0);
                  return;
                }
              } else {
                L20: {
                  if (var2 == 0) {
                    break L20;
                  } else {
                    if (!this.field_s) {
                      break L20;
                    } else {
                      L21: {
                        if (!this.r(8192)) {
                          stackOut_164_0 = 0;
                          stackIn_165_0 = stackOut_164_0;
                          break L21;
                        } else {
                          stackOut_163_0 = 1;
                          stackIn_165_0 = stackOut_163_0;
                          break L21;
                        }
                      }
                      var2 = stackIn_165_0;
                      break L20;
                    }
                  }
                }
                L22: {
                  if (var2 == 0) {
                    break L22;
                  } else {
                    if (this.field_r) {
                      L23: {
                        if (!this.l(8192)) {
                          stackOut_178_0 = 0;
                          stackIn_179_0 = stackOut_178_0;
                          break L23;
                        } else {
                          stackOut_177_0 = 1;
                          stackIn_179_0 = stackOut_177_0;
                          break L23;
                        }
                      }
                      var2 = stackIn_179_0;
                      break L22;
                    } else {
                      if (this.field_q) {
                        L24: {
                          if (!this.e(false)) {
                            stackOut_172_0 = 0;
                            stackIn_173_0 = stackOut_172_0;
                            break L24;
                          } else {
                            stackOut_171_0 = 1;
                            stackIn_173_0 = stackOut_171_0;
                            break L24;
                          }
                        }
                        var2 = stackIn_173_0;
                        this.field_n.a((byte) -14, var2 != 0);
                        return;
                      } else {
                        this.field_n.a((byte) -14, var2 != 0);
                        return;
                      }
                    }
                  }
                }
                if (var2 != 0) {
                  if (this.field_q) {
                    L25: {
                      if (!this.e(false)) {
                        stackOut_186_0 = 0;
                        stackIn_187_0 = stackOut_186_0;
                        break L25;
                      } else {
                        stackOut_185_0 = 1;
                        stackIn_187_0 = stackOut_185_0;
                        break L25;
                      }
                    }
                    var2 = stackIn_187_0;
                    this.field_n.a((byte) -14, var2 != 0);
                    return;
                  } else {
                    this.field_n.a((byte) -14, var2 != 0);
                    return;
                  }
                } else {
                  this.field_n.a((byte) -14, var2 != 0);
                  return;
                }
              }
            }
          } else {
            L26: {
              if (var2 == 0) {
                break L26;
              } else {
                if (!this.field_s) {
                  break L26;
                } else {
                  L27: {
                    if (!this.r(8192)) {
                      stackOut_132_0 = 0;
                      stackIn_133_0 = stackOut_132_0;
                      break L27;
                    } else {
                      stackOut_131_0 = 1;
                      stackIn_133_0 = stackOut_131_0;
                      break L27;
                    }
                  }
                  var2 = stackIn_133_0;
                  break L26;
                }
              }
            }
            L28: {
              if (var2 == 0) {
                break L28;
              } else {
                if (this.field_r) {
                  L29: {
                    if (!this.l(8192)) {
                      stackOut_146_0 = 0;
                      stackIn_147_0 = stackOut_146_0;
                      break L29;
                    } else {
                      stackOut_145_0 = 1;
                      stackIn_147_0 = stackOut_145_0;
                      break L29;
                    }
                  }
                  var2 = stackIn_147_0;
                  break L28;
                } else {
                  if (this.field_q) {
                    L30: {
                      if (!this.e(false)) {
                        stackOut_140_0 = 0;
                        stackIn_141_0 = stackOut_140_0;
                        break L30;
                      } else {
                        stackOut_139_0 = 1;
                        stackIn_141_0 = stackOut_139_0;
                        break L30;
                      }
                    }
                    var2 = stackIn_141_0;
                    this.field_n.a((byte) -14, var2 != 0);
                    return;
                  } else {
                    this.field_n.a((byte) -14, var2 != 0);
                    return;
                  }
                }
              }
            }
            if (var2 != 0) {
              if (this.field_q) {
                L31: {
                  if (!this.e(false)) {
                    stackOut_154_0 = 0;
                    stackIn_155_0 = stackOut_154_0;
                    break L31;
                  } else {
                    stackOut_153_0 = 1;
                    stackIn_155_0 = stackOut_153_0;
                    break L31;
                  }
                }
                var2 = stackIn_155_0;
                this.field_n.a((byte) -14, var2 != 0);
                return;
              } else {
                this.field_n.a((byte) -14, var2 != 0);
                return;
              }
            } else {
              this.field_n.a((byte) -14, var2 != 0);
              return;
            }
          }
        } else {
          L32: {
            if (var2 == 0) {
              break L32;
            } else {
              if (this.field_t) {
                L33: {
                  if (!this.d(false)) {
                    stackOut_33_0 = 0;
                    stackIn_34_0 = stackOut_33_0;
                    break L33;
                  } else {
                    stackOut_32_0 = 1;
                    stackIn_34_0 = stackOut_32_0;
                    break L33;
                  }
                }
                var2 = stackIn_34_0;
                break L32;
              } else {
                L34: {
                  if (this.field_s) {
                    var6 = this.m((byte) 19);
                    var4 = var6.d(3) + -this.field_g.d(3);
                    var5 = var6.e(9648) - this.field_g.e(9648);
                    this.field_v = qva.a((byte) -94, var5, var4);
                    break L34;
                  } else {
                    if (!this.field_r) {
                      break L34;
                    } else {
                      var7 = this.m((byte) 19);
                      var4 = var7.d(3) + -this.field_g.d(3);
                      var5 = var7.e(9648) - this.field_g.e(9648);
                      this.field_v = qva.a((byte) -94, var5, var4);
                      break L34;
                    }
                  }
                }
                L35: {
                  if (var2 == 0) {
                    break L35;
                  } else {
                    if (!this.field_s) {
                      break L35;
                    } else {
                      L36: {
                        if (!this.r(8192)) {
                          stackOut_12_0 = 0;
                          stackIn_13_0 = stackOut_12_0;
                          break L36;
                        } else {
                          stackOut_11_0 = 1;
                          stackIn_13_0 = stackOut_11_0;
                          break L36;
                        }
                      }
                      var2 = stackIn_13_0;
                      break L35;
                    }
                  }
                }
                L37: {
                  if (var2 == 0) {
                    break L37;
                  } else {
                    if (this.field_r) {
                      L38: {
                        if (!this.l(8192)) {
                          stackOut_19_0 = 0;
                          stackIn_20_0 = stackOut_19_0;
                          break L38;
                        } else {
                          stackOut_18_0 = 1;
                          stackIn_20_0 = stackOut_18_0;
                          break L38;
                        }
                      }
                      var2 = stackIn_20_0;
                      break L37;
                    } else {
                      break L37;
                    }
                  }
                }
                L39: {
                  if (var2 == 0) {
                    this.field_n.a((byte) -14, var2 != 0);
                    break L39;
                  } else {
                    if (!this.field_q) {
                      this.field_n.a((byte) -14, var2 != 0);
                      break L39;
                    } else {
                      L40: {
                        if (!this.e(false)) {
                          stackOut_25_0 = 0;
                          stackIn_26_0 = stackOut_25_0;
                          break L40;
                        } else {
                          stackOut_24_0 = 1;
                          stackIn_26_0 = stackOut_24_0;
                          break L40;
                        }
                      }
                      var2 = stackIn_26_0;
                      this.field_n.a((byte) -14, var2 != 0);
                      break L39;
                    }
                  }
                }
                return;
              }
            }
          }
          L41: {
            if (var2 == 0) {
              break L41;
            } else {
              if (this.field_s) {
                var9 = this.m((byte) 19);
                var4 = var9.d(3) + -this.field_g.d(3);
                var5 = var9.e(9648) - this.field_g.e(9648);
                this.field_v = qva.a((byte) -94, var5, var4);
                break L41;
              } else {
                if (!this.field_r) {
                  break L41;
                } else {
                  L42: {
                    var8 = this.m((byte) 19);
                    var4 = var8.d(3) + -this.field_g.d(3);
                    var5 = var8.e(9648) - this.field_g.e(9648);
                    this.field_v = qva.a((byte) -94, var5, var4);
                    if (!this.field_s) {
                      break L42;
                    } else {
                      L43: {
                        if (!this.r(8192)) {
                          stackOut_41_0 = 0;
                          stackIn_42_0 = stackOut_41_0;
                          break L43;
                        } else {
                          stackOut_40_0 = 1;
                          stackIn_42_0 = stackOut_40_0;
                          break L43;
                        }
                      }
                      var2 = stackIn_42_0;
                      break L42;
                    }
                  }
                  L44: {
                    if (var2 == 0) {
                      break L44;
                    } else {
                      if (this.field_r) {
                        L45: {
                          if (!this.l(8192)) {
                            stackOut_48_0 = 0;
                            stackIn_49_0 = stackOut_48_0;
                            break L45;
                          } else {
                            stackOut_47_0 = 1;
                            stackIn_49_0 = stackOut_47_0;
                            break L45;
                          }
                        }
                        var2 = stackIn_49_0;
                        break L44;
                      } else {
                        break L44;
                      }
                    }
                  }
                  L46: {
                    if (var2 == 0) {
                      this.field_n.a((byte) -14, var2 != 0);
                      break L46;
                    } else {
                      if (!this.field_q) {
                        this.field_n.a((byte) -14, var2 != 0);
                        break L46;
                      } else {
                        L47: {
                          if (!this.e(false)) {
                            stackOut_54_0 = 0;
                            stackIn_55_0 = stackOut_54_0;
                            break L47;
                          } else {
                            stackOut_53_0 = 1;
                            stackIn_55_0 = stackOut_53_0;
                            break L47;
                          }
                        }
                        var2 = stackIn_55_0;
                        this.field_n.a((byte) -14, var2 != 0);
                        break L46;
                      }
                    }
                  }
                  return;
                }
              }
            }
          }
          L48: {
            if (var2 == 0) {
              break L48;
            } else {
              if (!this.field_s) {
                break L48;
              } else {
                L49: {
                  if (!this.r(8192)) {
                    stackOut_65_0 = 0;
                    stackIn_66_0 = stackOut_65_0;
                    break L49;
                  } else {
                    stackOut_64_0 = 1;
                    stackIn_66_0 = stackOut_64_0;
                    break L49;
                  }
                }
                var2 = stackIn_66_0;
                break L48;
              }
            }
          }
          L50: {
            if (var2 == 0) {
              break L50;
            } else {
              if (this.field_r) {
                L51: {
                  if (!this.l(8192)) {
                    stackOut_80_0 = 0;
                    stackIn_81_0 = stackOut_80_0;
                    break L51;
                  } else {
                    stackOut_79_0 = 1;
                    stackIn_81_0 = stackOut_79_0;
                    break L51;
                  }
                }
                var2 = stackIn_81_0;
                break L50;
              } else {
                L52: {
                  if (!this.field_q) {
                    this.field_n.a((byte) -14, var2 != 0);
                    break L52;
                  } else {
                    L53: {
                      if (!this.e(false)) {
                        stackOut_72_0 = 0;
                        stackIn_73_0 = stackOut_72_0;
                        break L53;
                      } else {
                        stackOut_71_0 = 1;
                        stackIn_73_0 = stackOut_71_0;
                        break L53;
                      }
                    }
                    var2 = stackIn_73_0;
                    this.field_n.a((byte) -14, var2 != 0);
                    break L52;
                  }
                }
                return;
              }
            }
          }
          if (var2 != 0) {
            if (this.field_q) {
              L54: {
                if (!this.e(false)) {
                  stackOut_88_0 = 0;
                  stackIn_89_0 = stackOut_88_0;
                  break L54;
                } else {
                  stackOut_87_0 = 1;
                  stackIn_89_0 = stackOut_87_0;
                  break L54;
                }
              }
              var2 = stackIn_89_0;
              this.field_n.a((byte) -14, var2 != 0);
              return;
            } else {
              this.field_n.a((byte) -14, var2 != 0);
              return;
            }
          } else {
            this.field_n.a((byte) -14, var2 != 0);
            return;
          }
        }
    }

    public final int b(int param0) {
        int var2 = -67 / ((-46 - param0) / 45);
        return 0;
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            param1.a((byte) -126, this.field_s ? 1 : 0, 1);
            if (this.field_s) {
                param1.a((byte) -126, cn.a((byte) -120, this.field_u, 8192, 8), 8);
            }
            param1.a((byte) 5, !this.field_r ? 0 : 1, 1);
            if (this.field_r) {
                param1.a((byte) -125, cn.a((byte) 111, this.field_o, 8192, 8), 8);
            }
            param1.a((byte) -127, !this.field_q ? 0 : 1, 1);
            if (!(!this.field_q)) {
                param1.a((byte) -125, this.field_p >> 473274736, 10);
            }
            param1.a((byte) -127, this.field_t ? 1 : 0, 1);
            this.field_n.a(this.h((byte) 111), (byte) 85, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "kj.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean d(boolean param0) {
        if (param0) {
            return false;
        }
        return this.m((byte) 19).p((byte) -110);
    }

    static {
    }
}
