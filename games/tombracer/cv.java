/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class cv extends dg {
    private fla field_p;
    private bua field_s;
    private boolean field_n;
    private int field_q;
    private ut field_o;
    static Hashtable field_m;
    static String field_r;

    final void b(int param0, byte param1) {
        if (param1 != -112) {
            this.d(-35);
            this.field_q = param0;
            return;
        }
        this.field_q = param0;
    }

    final void a(int param0, la param1, kh param2) {
        try {
            super.a(124, param1, param2);
            this.field_q = param2.b((byte) 44, 4);
            if (param0 < 119) {
                this.d(72);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "cv.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(gr param0, gma param1, byte param2) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2);
              if (param0 instanceof ut) {
                this.field_o = (ut) ((Object) param0);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (-4 != (this.field_q ^ -1)) {
                if (-2 == (this.field_q ^ -1)) {
                  this.field_s = new bua(7, 8);
                  break L2;
                } else {
                  break L2;
                }
              } else {
                this.field_s = new bua(1, 10);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("cv.E(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ',' + param2 + ')');
        }
    }

    cv(int param0) {
        super(param0);
        this.field_n = false;
    }

    final void a(byte param0, kh param1) {
        try {
            super.a((byte) 59, param1);
            param1.a((byte) 59, this.field_q, 4);
            int var3_int = 26 % ((-8 - param0) / 40);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "cv.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void n(byte param0) {
        field_r = null;
        if (param0 <= 81) {
            return;
        }
        field_m = null;
    }

    final void a(gma param0, int param1, gr param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              super.a(param0, param1 + 0, param2);
              if (param1 == -2159) {
                break L1;
              } else {
                this.field_s = (bua) null;
                break L1;
              }
            }
            L2: {
              L3: {
                var4_int = param0.c(-22);
                var5 = param0.a((byte) 55);
                if (-2097153 != (var4_int ^ -1)) {
                  break L3;
                } else {
                  if (var5 != 2097152) {
                    break L3;
                  } else {
                    this.field_q = 0;
                    break L2;
                  }
                }
              }
              L4: {
                if (-4194305 != (var4_int ^ -1)) {
                  break L4;
                } else {
                  if (-4194305 == (var5 ^ -1)) {
                    this.field_q = 2;
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              if (var4_int > var5) {
                this.field_q = 4;
                break L2;
              } else {
                this.field_q = 5;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4);

            stackIn_16_1 = new StringBuilder().append("cv.C(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ')');
        }
    }

    final int f(byte param0) {
        int var2 = 56 / ((param0 - 15) / 45);
        return -1;
    }

    final void d(int param0) {
        Object stackIn_31_0 = null;
        Object stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        Object stackIn_53_0 = null;
        Object stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        Object stackIn_61_0 = null;
        Object stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        Object stackIn_69_0 = null;
        Object stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        Object stackIn_75_0 = null;
        Object stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        Object stackIn_80_0 = null;
        Object stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        Object stackIn_85_0 = null;
        Object stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        Object stackIn_89_0 = null;
        Object stackIn_90_0 = null;
        int stackIn_90_1 = 0;
        Object stackIn_121_0 = null;
        Object stackIn_122_0 = null;
        int stackIn_122_1 = 0;
        Object stackIn_135_0 = null;
        Object stackIn_136_0 = null;
        int stackIn_136_1 = 0;
        Object stackIn_143_0 = null;
        Object stackIn_144_0 = null;
        int stackIn_144_1 = 0;
        Object stackIn_151_0 = null;
        Object stackIn_152_0 = null;
        int stackIn_152_1 = 0;
        Object stackIn_157_0 = null;
        Object stackIn_158_0 = null;
        int stackIn_158_1 = 0;
        Object stackIn_162_0 = null;
        Object stackIn_163_0 = null;
        int stackIn_163_1 = 0;
        Object stackIn_167_0 = null;
        Object stackIn_168_0 = null;
        int stackIn_168_1 = 0;
        Object stackIn_171_0 = null;
        Object stackIn_172_0 = null;
        int stackIn_172_1 = 0;
        Object stackIn_183_0 = null;
        Object stackIn_184_0 = null;
        int stackIn_184_1 = 0;
        Object stackIn_188_0 = null;
        Object stackIn_189_0 = null;
        int stackIn_189_1 = 0;
        Object stackIn_193_0 = null;
        Object stackIn_194_0 = null;
        int stackIn_194_1 = 0;
        Object stackIn_198_0 = null;
        Object stackIn_199_0 = null;
        int stackIn_199_1 = 0;
        Object stackIn_202_0 = null;
        Object stackIn_203_0 = null;
        int stackIn_203_1 = 0;
        Object stackIn_208_0 = null;
        Object stackIn_209_0 = null;
        int stackIn_209_1 = 0;
        Object stackIn_213_0 = null;
        Object stackIn_214_0 = null;
        int stackIn_214_1 = 0;
        Object stackIn_218_0 = null;
        Object stackIn_219_0 = null;
        int stackIn_219_1 = 0;
        Object stackIn_222_0 = null;
        Object stackIn_223_0 = null;
        int stackIn_223_1 = 0;
        Object stackIn_235_0 = null;
        Object stackIn_236_0 = null;
        int stackIn_236_1 = 0;
        Object stackIn_239_0 = null;
        Object stackIn_240_0 = null;
        int stackIn_240_1 = 0;
        Object stackIn_246_0 = null;
        Object stackIn_247_0 = null;
        int stackIn_247_1 = 0;
        Object stackIn_250_0 = null;
        Object stackIn_251_0 = null;
        int stackIn_251_1 = 0;
        Object stackIn_254_0 = null;
        Object stackIn_255_0 = null;
        int stackIn_255_1 = 0;
        Object stackIn_264_0 = null;
        Object stackIn_265_0 = null;
        int stackIn_265_1 = 0;
        Object stackIn_268_0 = null;
        Object stackIn_269_0 = null;
        int stackIn_269_1 = 0;
        Object stackIn_275_0 = null;
        Object stackIn_276_0 = null;
        int stackIn_276_1 = 0;
        Object stackIn_279_0 = null;
        Object stackIn_280_0 = null;
        int stackIn_280_1 = 0;
        Object stackIn_283_0 = null;
        Object stackIn_284_0 = null;
        int stackIn_284_1 = 0;
        Object stackIn_295_0 = null;
        Object stackIn_296_0 = null;
        int stackIn_296_1 = 0;
        Object stackIn_299_0 = null;
        Object stackIn_300_0 = null;
        int stackIn_300_1 = 0;
        Object stackIn_303_0 = null;
        Object stackIn_304_0 = null;
        int stackIn_304_1 = 0;
        Object stackIn_315_0 = null;
        Object stackIn_316_0 = null;
        int stackIn_316_1 = 0;
        Object stackIn_320_0 = null;
        Object stackIn_321_0 = null;
        int stackIn_321_1 = 0;
        Object stackIn_325_0 = null;
        Object stackIn_326_0 = null;
        int stackIn_326_1 = 0;
        Object stackIn_330_0 = null;
        Object stackIn_331_0 = null;
        int stackIn_331_1 = 0;
        Object stackIn_334_0 = null;
        Object stackIn_335_0 = null;
        int stackIn_335_1 = 0;
        Object stackIn_338_0 = null;
        Object stackIn_339_0 = null;
        int stackIn_339_1 = 0;
        Object stackIn_348_0 = null;
        Object stackIn_349_0 = null;
        int stackIn_349_1 = 0;
        Object stackIn_352_0 = null;
        Object stackIn_353_0 = null;
        int stackIn_353_1 = 0;
        Object stackIn_359_0 = null;
        Object stackIn_360_0 = null;
        int stackIn_360_1 = 0;
        Object stackIn_363_0 = null;
        Object stackIn_364_0 = null;
        int stackIn_364_1 = 0;
        Object stackIn_367_0 = null;
        Object stackIn_368_0 = null;
        int stackIn_368_1 = 0;
        int var3;
        int var4;
        w var6;
        w var7;
        var4 = TombRacer.field_G ? 1 : 0;
        if (null != this.field_s) {
          this.field_s.a(param0 + 1);
          var7 = (w) ((Object) this.a(58).field_G);
          if (param0 != -1) {
            this.field_o = (ut) null;
            if (var7 == null) {
              return;
            } else {
              var3 = this.field_o.k((byte) -97).b(4) ? 1 : 0;
              if ((this.field_n ? 1 : 0) != var3) {
                if (1 != this.field_q) {
                  if (this.field_q == 3) {
                    if (var3 != 0) {
                      L0: {
                        var7.a(new fm(68, this.b((byte) -107), this.c((byte) 123), this.e((byte) -111)), -58);
                        if ((this.field_q ^ -1) != -2) {
                          break L0;
                        } else {
                          if (!this.field_o.k((byte) -126).b((byte) 89)) {
                            break L0;
                          } else {
                            if (this.field_p == null) {
                              L1: {
                                this.field_p = var7.a(new fm(53, this.b((byte) -102), this.c((byte) 116), this.e((byte) -89)), -58);
                                stackIn_363_0 = this;

                                if (var3 == 0) {
                                  stackIn_364_0 = this;
                                  stackIn_364_1 = 0;
                                  break L1;
                                } else {
                                  stackIn_364_0 = this;
                                  stackIn_364_1 = 1;
                                  break L1;
                                }
                              }
                              ((cv) (this)).field_n = stackIn_364_1 != 0;
                              return;
                            } else {
                              L2: {
                                if (this.field_q != 1) {
                                  break L2;
                                } else {
                                  if (this.field_o.k((byte) -87).b((byte) 72)) {
                                    break L2;
                                  } else {
                                    if (this.field_p == null) {
                                      break L2;
                                    } else {
                                      L3: {
                                        this.field_p.a(91, var7);
                                        this.field_p = null;
                                        stackIn_348_0 = this;

                                        if (var3 == 0) {
                                          stackIn_349_0 = this;
                                          stackIn_349_1 = 0;
                                          break L3;
                                        } else {
                                          stackIn_349_0 = this;
                                          stackIn_349_1 = 1;
                                          break L3;
                                        }
                                      }
                                      ((cv) (this)).field_n = stackIn_349_1 != 0;
                                      return;
                                    }
                                  }
                                }
                              }
                              L4: {
                                stackIn_352_0 = this;

                                if (var3 == 0) {
                                  stackIn_353_0 = this;
                                  stackIn_353_1 = 0;
                                  break L4;
                                } else {
                                  stackIn_353_0 = this;
                                  stackIn_353_1 = 1;
                                  break L4;
                                }
                              }
                              ((cv) (this)).field_n = stackIn_353_1 != 0;
                              return;
                            }
                          }
                        }
                      }
                      L5: {
                        if (this.field_q != 1) {
                          break L5;
                        } else {
                          if (this.field_o.k((byte) -87).b((byte) 72)) {
                            break L5;
                          } else {
                            if (this.field_p == null) {
                              break L5;
                            } else {
                              L6: {
                                this.field_p.a(91, var7);
                                this.field_p = null;
                                stackIn_359_0 = this;

                                if (var3 == 0) {
                                  stackIn_360_0 = this;
                                  stackIn_360_1 = 0;
                                  break L6;
                                } else {
                                  stackIn_360_0 = this;
                                  stackIn_360_1 = 1;
                                  break L6;
                                }
                              }
                              ((cv) (this)).field_n = stackIn_360_1 != 0;
                              return;
                            }
                          }
                        }
                      }
                      L7: {
                        stackIn_367_0 = this;

                        if (var3 == 0) {
                          stackIn_368_0 = this;
                          stackIn_368_1 = 0;
                          break L7;
                        } else {
                          stackIn_368_0 = this;
                          stackIn_368_1 = 1;
                          break L7;
                        }
                      }
                      ((cv) (this)).field_n = stackIn_368_1 != 0;
                      return;
                    } else {
                      L8: {
                        if ((this.field_q ^ -1) != -2) {
                          break L8;
                        } else {
                          if (!this.field_o.k((byte) -126).b((byte) 89)) {
                            break L8;
                          } else {
                            if (this.field_p == null) {
                              L9: {
                                this.field_p = var7.a(new fm(53, this.b((byte) -102), this.c((byte) 116), this.e((byte) -89)), -58);
                                stackIn_338_0 = this;

                                if (var3 == 0) {
                                  stackIn_339_0 = this;
                                  stackIn_339_1 = 0;
                                  break L9;
                                } else {
                                  stackIn_339_0 = this;
                                  stackIn_339_1 = 1;
                                  break L9;
                                }
                              }
                              ((cv) (this)).field_n = stackIn_339_1 != 0;
                              return;
                            } else {
                              L10: {
                                if (this.field_q != 1) {
                                  break L10;
                                } else {
                                  if (this.field_o.k((byte) -87).b((byte) 72)) {
                                    break L10;
                                  } else {
                                    if (this.field_p == null) {
                                      break L10;
                                    } else {
                                      this.field_p.a(91, var7);
                                      this.field_p = null;
                                      break L10;
                                    }
                                  }
                                }
                              }
                              L11: {
                                stackIn_315_0 = this;

                                if (var3 == 0) {
                                  stackIn_316_0 = this;
                                  stackIn_316_1 = 0;
                                  break L11;
                                } else {
                                  stackIn_316_0 = this;
                                  stackIn_316_1 = 1;
                                  break L11;
                                }
                              }
                              ((cv) (this)).field_n = stackIn_316_1 != 0;
                              return;
                            }
                          }
                        }
                      }
                      if (this.field_q == 1) {
                        if (!this.field_o.k((byte) -87).b((byte) 72)) {
                          if (this.field_p != null) {
                            L12: {
                              this.field_p.a(91, var7);
                              this.field_p = null;
                              stackIn_334_0 = this;

                              if (var3 == 0) {
                                stackIn_335_0 = this;
                                stackIn_335_1 = 0;
                                break L12;
                              } else {
                                stackIn_335_0 = this;
                                stackIn_335_1 = 1;
                                break L12;
                              }
                            }
                            ((cv) (this)).field_n = stackIn_335_1 != 0;
                            return;
                          } else {
                            L13: {
                              stackIn_330_0 = this;

                              if (var3 == 0) {
                                stackIn_331_0 = this;
                                stackIn_331_1 = 0;
                                break L13;
                              } else {
                                stackIn_331_0 = this;
                                stackIn_331_1 = 1;
                                break L13;
                              }
                            }
                            ((cv) (this)).field_n = stackIn_331_1 != 0;
                            return;
                          }
                        } else {
                          L14: {
                            stackIn_325_0 = this;

                            if (var3 == 0) {
                              stackIn_326_0 = this;
                              stackIn_326_1 = 0;
                              break L14;
                            } else {
                              stackIn_326_0 = this;
                              stackIn_326_1 = 1;
                              break L14;
                            }
                          }
                          ((cv) (this)).field_n = stackIn_326_1 != 0;
                          return;
                        }
                      } else {
                        L15: {
                          stackIn_320_0 = this;

                          if (var3 == 0) {
                            stackIn_321_0 = this;
                            stackIn_321_1 = 0;
                            break L15;
                          } else {
                            stackIn_321_0 = this;
                            stackIn_321_1 = 1;
                            break L15;
                          }
                        }
                        ((cv) (this)).field_n = stackIn_321_1 != 0;
                        return;
                      }
                    }
                  } else {
                    L16: {
                      if ((this.field_q ^ -1) != -2) {
                        break L16;
                      } else {
                        if (!this.field_o.k((byte) -126).b((byte) 89)) {
                          break L16;
                        } else {
                          if (this.field_p == null) {
                            L17: {
                              this.field_p = var7.a(new fm(53, this.b((byte) -102), this.c((byte) 116), this.e((byte) -89)), -58);
                              stackIn_299_0 = this;

                              if (var3 == 0) {
                                stackIn_300_0 = this;
                                stackIn_300_1 = 0;
                                break L17;
                              } else {
                                stackIn_300_0 = this;
                                stackIn_300_1 = 1;
                                break L17;
                              }
                            }
                            ((cv) (this)).field_n = stackIn_300_1 != 0;
                            return;
                          } else {
                            break L16;
                          }
                        }
                      }
                    }
                    L18: {
                      if (this.field_q != 1) {
                        break L18;
                      } else {
                        if (this.field_o.k((byte) -87).b((byte) 72)) {
                          break L18;
                        } else {
                          if (this.field_p == null) {
                            break L18;
                          } else {
                            L19: {
                              this.field_p.a(91, var7);
                              this.field_p = null;
                              stackIn_295_0 = this;

                              if (var3 == 0) {
                                stackIn_296_0 = this;
                                stackIn_296_1 = 0;
                                break L19;
                              } else {
                                stackIn_296_0 = this;
                                stackIn_296_1 = 1;
                                break L19;
                              }
                            }
                            ((cv) (this)).field_n = stackIn_296_1 != 0;
                            return;
                          }
                        }
                      }
                    }
                    L20: {
                      stackIn_303_0 = this;

                      if (var3 == 0) {
                        stackIn_304_0 = this;
                        stackIn_304_1 = 0;
                        break L20;
                      } else {
                        stackIn_304_0 = this;
                        stackIn_304_1 = 1;
                        break L20;
                      }
                    }
                    ((cv) (this)).field_n = stackIn_304_1 != 0;
                    return;
                  }
                } else {
                  if (var3 != 0) {
                    L21: {
                      var7.a(new fm(51, this.b((byte) 90), this.c((byte) 119), this.e((byte) -106)), param0 ^ 57);
                      if ((this.field_q ^ -1) != -2) {
                        break L21;
                      } else {
                        if (!this.field_o.k((byte) -126).b((byte) 89)) {
                          break L21;
                        } else {
                          if (this.field_p == null) {
                            L22: {
                              this.field_p = var7.a(new fm(53, this.b((byte) -102), this.c((byte) 116), this.e((byte) -89)), -58);
                              stackIn_279_0 = this;

                              if (var3 == 0) {
                                stackIn_280_0 = this;
                                stackIn_280_1 = 0;
                                break L22;
                              } else {
                                stackIn_280_0 = this;
                                stackIn_280_1 = 1;
                                break L22;
                              }
                            }
                            ((cv) (this)).field_n = stackIn_280_1 != 0;
                            return;
                          } else {
                            L23: {
                              if (this.field_q != 1) {
                                break L23;
                              } else {
                                if (this.field_o.k((byte) -87).b((byte) 72)) {
                                  break L23;
                                } else {
                                  if (this.field_p == null) {
                                    break L23;
                                  } else {
                                    L24: {
                                      this.field_p.a(91, var7);
                                      this.field_p = null;
                                      stackIn_264_0 = this;

                                      if (var3 == 0) {
                                        stackIn_265_0 = this;
                                        stackIn_265_1 = 0;
                                        break L24;
                                      } else {
                                        stackIn_265_0 = this;
                                        stackIn_265_1 = 1;
                                        break L24;
                                      }
                                    }
                                    ((cv) (this)).field_n = stackIn_265_1 != 0;
                                    return;
                                  }
                                }
                              }
                            }
                            L25: {
                              stackIn_268_0 = this;

                              if (var3 == 0) {
                                stackIn_269_0 = this;
                                stackIn_269_1 = 0;
                                break L25;
                              } else {
                                stackIn_269_0 = this;
                                stackIn_269_1 = 1;
                                break L25;
                              }
                            }
                            ((cv) (this)).field_n = stackIn_269_1 != 0;
                            return;
                          }
                        }
                      }
                    }
                    L26: {
                      if (this.field_q != 1) {
                        break L26;
                      } else {
                        if (this.field_o.k((byte) -87).b((byte) 72)) {
                          break L26;
                        } else {
                          if (this.field_p == null) {
                            break L26;
                          } else {
                            L27: {
                              this.field_p.a(91, var7);
                              this.field_p = null;
                              stackIn_275_0 = this;

                              if (var3 == 0) {
                                stackIn_276_0 = this;
                                stackIn_276_1 = 0;
                                break L27;
                              } else {
                                stackIn_276_0 = this;
                                stackIn_276_1 = 1;
                                break L27;
                              }
                            }
                            ((cv) (this)).field_n = stackIn_276_1 != 0;
                            return;
                          }
                        }
                      }
                    }
                    L28: {
                      stackIn_283_0 = this;

                      if (var3 == 0) {
                        stackIn_284_0 = this;
                        stackIn_284_1 = 0;
                        break L28;
                      } else {
                        stackIn_284_0 = this;
                        stackIn_284_1 = 1;
                        break L28;
                      }
                    }
                    ((cv) (this)).field_n = stackIn_284_1 != 0;
                    return;
                  } else {
                    L29: {
                      var7.a(new fm(52, this.b((byte) -119), this.c((byte) 112), this.e((byte) -96)), -58);
                      if ((this.field_q ^ -1) != -2) {
                        break L29;
                      } else {
                        if (!this.field_o.k((byte) -126).b((byte) 89)) {
                          break L29;
                        } else {
                          if (this.field_p == null) {
                            L30: {
                              this.field_p = var7.a(new fm(53, this.b((byte) -102), this.c((byte) 116), this.e((byte) -89)), -58);
                              stackIn_250_0 = this;

                              if (var3 == 0) {
                                stackIn_251_0 = this;
                                stackIn_251_1 = 0;
                                break L30;
                              } else {
                                stackIn_251_0 = this;
                                stackIn_251_1 = 1;
                                break L30;
                              }
                            }
                            ((cv) (this)).field_n = stackIn_251_1 != 0;
                            return;
                          } else {
                            L31: {
                              if (this.field_q != 1) {
                                break L31;
                              } else {
                                if (this.field_o.k((byte) -87).b((byte) 72)) {
                                  break L31;
                                } else {
                                  if (this.field_p == null) {
                                    break L31;
                                  } else {
                                    L32: {
                                      this.field_p.a(91, var7);
                                      this.field_p = null;
                                      stackIn_235_0 = this;

                                      if (var3 == 0) {
                                        stackIn_236_0 = this;
                                        stackIn_236_1 = 0;
                                        break L32;
                                      } else {
                                        stackIn_236_0 = this;
                                        stackIn_236_1 = 1;
                                        break L32;
                                      }
                                    }
                                    ((cv) (this)).field_n = stackIn_236_1 != 0;
                                    return;
                                  }
                                }
                              }
                            }
                            L33: {
                              stackIn_239_0 = this;

                              if (var3 == 0) {
                                stackIn_240_0 = this;
                                stackIn_240_1 = 0;
                                break L33;
                              } else {
                                stackIn_240_0 = this;
                                stackIn_240_1 = 1;
                                break L33;
                              }
                            }
                            ((cv) (this)).field_n = stackIn_240_1 != 0;
                            return;
                          }
                        }
                      }
                    }
                    L34: {
                      if (this.field_q != 1) {
                        break L34;
                      } else {
                        if (this.field_o.k((byte) -87).b((byte) 72)) {
                          break L34;
                        } else {
                          if (this.field_p == null) {
                            break L34;
                          } else {
                            L35: {
                              this.field_p.a(91, var7);
                              this.field_p = null;
                              stackIn_246_0 = this;

                              if (var3 == 0) {
                                stackIn_247_0 = this;
                                stackIn_247_1 = 0;
                                break L35;
                              } else {
                                stackIn_247_0 = this;
                                stackIn_247_1 = 1;
                                break L35;
                              }
                            }
                            ((cv) (this)).field_n = stackIn_247_1 != 0;
                            return;
                          }
                        }
                      }
                    }
                    L36: {
                      stackIn_254_0 = this;

                      if (var3 == 0) {
                        stackIn_255_0 = this;
                        stackIn_255_1 = 0;
                        break L36;
                      } else {
                        stackIn_255_0 = this;
                        stackIn_255_1 = 1;
                        break L36;
                      }
                    }
                    ((cv) (this)).field_n = stackIn_255_1 != 0;
                    return;
                  }
                }
              } else {
                L37: {
                  if ((this.field_q ^ -1) != -2) {
                    break L37;
                  } else {
                    if (!this.field_o.k((byte) -126).b((byte) 89)) {
                      break L37;
                    } else {
                      if (this.field_p != null) {
                        if (this.field_q == 1) {
                          if (!this.field_o.k((byte) -87).b((byte) 72)) {
                            if (this.field_p == null) {
                              L38: {
                                stackIn_202_0 = this;

                                if (var3 == 0) {
                                  stackIn_203_0 = this;
                                  stackIn_203_1 = 0;
                                  break L38;
                                } else {
                                  stackIn_203_0 = this;
                                  stackIn_203_1 = 1;
                                  break L38;
                                }
                              }
                              ((cv) (this)).field_n = stackIn_203_1 != 0;
                              return;
                            } else {
                              L39: {
                                this.field_p.a(91, var7);
                                this.field_p = null;
                                stackIn_198_0 = this;

                                if (var3 == 0) {
                                  stackIn_199_0 = this;
                                  stackIn_199_1 = 0;
                                  break L39;
                                } else {
                                  stackIn_199_0 = this;
                                  stackIn_199_1 = 1;
                                  break L39;
                                }
                              }
                              ((cv) (this)).field_n = stackIn_199_1 != 0;
                              return;
                            }
                          } else {
                            L40: {
                              stackIn_193_0 = this;

                              if (var3 == 0) {
                                stackIn_194_0 = this;
                                stackIn_194_1 = 0;
                                break L40;
                              } else {
                                stackIn_194_0 = this;
                                stackIn_194_1 = 1;
                                break L40;
                              }
                            }
                            ((cv) (this)).field_n = stackIn_194_1 != 0;
                            return;
                          }
                        } else {
                          L41: {
                            stackIn_188_0 = this;

                            if (var3 == 0) {
                              stackIn_189_0 = this;
                              stackIn_189_1 = 0;
                              break L41;
                            } else {
                              stackIn_189_0 = this;
                              stackIn_189_1 = 1;
                              break L41;
                            }
                          }
                          ((cv) (this)).field_n = stackIn_189_1 != 0;
                          return;
                        }
                      } else {
                        L42: {
                          this.field_p = var7.a(new fm(53, this.b((byte) -102), this.c((byte) 116), this.e((byte) -89)), -58);
                          stackIn_183_0 = this;

                          if (var3 == 0) {
                            stackIn_184_0 = this;
                            stackIn_184_1 = 0;
                            break L42;
                          } else {
                            stackIn_184_0 = this;
                            stackIn_184_1 = 1;
                            break L42;
                          }
                        }
                        ((cv) (this)).field_n = stackIn_184_1 != 0;
                        return;
                      }
                    }
                  }
                }
                if (this.field_q == 1) {
                  if (!this.field_o.k((byte) -87).b((byte) 72)) {
                    if (this.field_p != null) {
                      L43: {
                        this.field_p.a(91, var7);
                        this.field_p = null;
                        stackIn_222_0 = this;

                        if (var3 == 0) {
                          stackIn_223_0 = this;
                          stackIn_223_1 = 0;
                          break L43;
                        } else {
                          stackIn_223_0 = this;
                          stackIn_223_1 = 1;
                          break L43;
                        }
                      }
                      ((cv) (this)).field_n = stackIn_223_1 != 0;
                      return;
                    } else {
                      L44: {
                        stackIn_218_0 = this;

                        if (var3 == 0) {
                          stackIn_219_0 = this;
                          stackIn_219_1 = 0;
                          break L44;
                        } else {
                          stackIn_219_0 = this;
                          stackIn_219_1 = 1;
                          break L44;
                        }
                      }
                      ((cv) (this)).field_n = stackIn_219_1 != 0;
                      return;
                    }
                  } else {
                    L45: {
                      stackIn_213_0 = this;

                      if (var3 == 0) {
                        stackIn_214_0 = this;
                        stackIn_214_1 = 0;
                        break L45;
                      } else {
                        stackIn_214_0 = this;
                        stackIn_214_1 = 1;
                        break L45;
                      }
                    }
                    ((cv) (this)).field_n = stackIn_214_1 != 0;
                    return;
                  }
                } else {
                  L46: {
                    stackIn_208_0 = this;

                    if (var3 == 0) {
                      stackIn_209_0 = this;
                      stackIn_209_1 = 0;
                      break L46;
                    } else {
                      stackIn_209_0 = this;
                      stackIn_209_1 = 1;
                      break L46;
                    }
                  }
                  ((cv) (this)).field_n = stackIn_209_1 != 0;
                  return;
                }
              }
            }
          } else {
            if (var7 == null) {
              return;
            } else {
              L47: {
                var3 = this.field_o.k((byte) -97).b(4) ? 1 : 0;
                if ((this.field_n ? 1 : 0) == var3) {
                  break L47;
                } else {
                  if (1 != this.field_q) {
                    if (this.field_q == 3) {
                      if (var3 != 0) {
                        var7.a(new fm(68, this.b((byte) -107), this.c((byte) 123), this.e((byte) -111)), -58);
                        break L47;
                      } else {
                        L48: {
                          L49: {
                            if ((this.field_q ^ -1) != -2) {
                              break L49;
                            } else {
                              if (!this.field_o.k((byte) -126).b((byte) 89)) {
                                break L49;
                              } else {
                                if (this.field_p == null) {
                                  this.field_p = var7.a(new fm(53, this.b((byte) -102), this.c((byte) 116), this.e((byte) -89)), -58);
                                  break L48;
                                } else {
                                  break L49;
                                }
                              }
                            }
                          }
                          if (this.field_q != 1) {
                            break L48;
                          } else {
                            if (this.field_o.k((byte) -87).b((byte) 72)) {
                              break L48;
                            } else {
                              if (this.field_p == null) {
                                break L48;
                              } else {
                                this.field_p.a(91, var7);
                                this.field_p = null;
                                break L48;
                              }
                            }
                          }
                        }
                        L50: {
                          stackIn_135_0 = this;

                          if (var3 == 0) {
                            stackIn_136_0 = this;
                            stackIn_136_1 = 0;
                            break L50;
                          } else {
                            stackIn_136_0 = this;
                            stackIn_136_1 = 1;
                            break L50;
                          }
                        }
                        ((cv) (this)).field_n = stackIn_136_1 != 0;
                        return;
                      }
                    } else {
                      L51: {
                        if ((this.field_q ^ -1) == -2) {
                          if (this.field_o.k((byte) -126).b((byte) 89)) {
                            if (this.field_p == null) {
                              this.field_p = var7.a(new fm(53, this.b((byte) -102), this.c((byte) 116), this.e((byte) -89)), -58);
                              break L51;
                            } else {
                              if (this.field_q != 1) {
                                break L51;
                              } else {
                                if (this.field_o.k((byte) -87).b((byte) 72)) {
                                  break L51;
                                } else {
                                  if (this.field_p == null) {
                                    break L51;
                                  } else {
                                    this.field_p.a(91, var7);
                                    this.field_p = null;
                                    break L51;
                                  }
                                }
                              }
                            }
                          } else {
                            if (this.field_q != 1) {
                              break L51;
                            } else {
                              if (this.field_o.k((byte) -87).b((byte) 72)) {
                                break L51;
                              } else {
                                if (this.field_p == null) {
                                  break L51;
                                } else {
                                  this.field_p.a(91, var7);
                                  this.field_p = null;
                                  break L51;
                                }
                              }
                            }
                          }
                        } else {
                          if (this.field_q != 1) {
                            break L51;
                          } else {
                            if (this.field_o.k((byte) -87).b((byte) 72)) {
                              break L51;
                            } else {
                              if (this.field_p == null) {
                                break L51;
                              } else {
                                this.field_p.a(91, var7);
                                this.field_p = null;
                                break L51;
                              }
                            }
                          }
                        }
                      }
                      L52: {
                        stackIn_121_0 = this;

                        if (var3 == 0) {
                          stackIn_122_0 = this;
                          stackIn_122_1 = 0;
                          break L52;
                        } else {
                          stackIn_122_0 = this;
                          stackIn_122_1 = 1;
                          break L52;
                        }
                      }
                      ((cv) (this)).field_n = stackIn_122_1 != 0;
                      return;
                    }
                  } else {
                    if (var3 != 0) {
                      var7.a(new fm(51, this.b((byte) 90), this.c((byte) 119), this.e((byte) -106)), param0 ^ 57);
                      break L47;
                    } else {
                      var7.a(new fm(52, this.b((byte) -119), this.c((byte) 112), this.e((byte) -96)), -58);
                      break L47;
                    }
                  }
                }
              }
              L53: {
                if ((this.field_q ^ -1) != -2) {
                  break L53;
                } else {
                  if (!this.field_o.k((byte) -126).b((byte) 89)) {
                    break L53;
                  } else {
                    if (this.field_p != null) {
                      L54: {
                        if (this.field_q != 1) {
                          break L54;
                        } else {
                          if (this.field_o.k((byte) -87).b((byte) 72)) {
                            break L54;
                          } else {
                            if (this.field_p == null) {
                              break L54;
                            } else {
                              this.field_p.a(91, var7);
                              this.field_p = null;
                              break L54;
                            }
                          }
                        }
                      }
                      L55: {
                        stackIn_151_0 = this;

                        if (var3 == 0) {
                          stackIn_152_0 = this;
                          stackIn_152_1 = 0;
                          break L55;
                        } else {
                          stackIn_152_0 = this;
                          stackIn_152_1 = 1;
                          break L55;
                        }
                      }
                      ((cv) (this)).field_n = stackIn_152_1 != 0;
                      return;
                    } else {
                      L56: {
                        this.field_p = var7.a(new fm(53, this.b((byte) -102), this.c((byte) 116), this.e((byte) -89)), -58);
                        stackIn_143_0 = this;

                        if (var3 == 0) {
                          stackIn_144_0 = this;
                          stackIn_144_1 = 0;
                          break L56;
                        } else {
                          stackIn_144_0 = this;
                          stackIn_144_1 = 1;
                          break L56;
                        }
                      }
                      ((cv) (this)).field_n = stackIn_144_1 != 0;
                      return;
                    }
                  }
                }
              }
              if (this.field_q == 1) {
                if (!this.field_o.k((byte) -87).b((byte) 72)) {
                  if (this.field_p != null) {
                    L57: {
                      this.field_p.a(91, var7);
                      this.field_p = null;
                      stackIn_171_0 = this;

                      if (var3 == 0) {
                        stackIn_172_0 = this;
                        stackIn_172_1 = 0;
                        break L57;
                      } else {
                        stackIn_172_0 = this;
                        stackIn_172_1 = 1;
                        break L57;
                      }
                    }
                    ((cv) (this)).field_n = stackIn_172_1 != 0;
                    return;
                  } else {
                    L58: {
                      stackIn_167_0 = this;

                      if (var3 == 0) {
                        stackIn_168_0 = this;
                        stackIn_168_1 = 0;
                        break L58;
                      } else {
                        stackIn_168_0 = this;
                        stackIn_168_1 = 1;
                        break L58;
                      }
                    }
                    ((cv) (this)).field_n = stackIn_168_1 != 0;
                    return;
                  }
                } else {
                  L59: {
                    stackIn_162_0 = this;

                    if (var3 == 0) {
                      stackIn_163_0 = this;
                      stackIn_163_1 = 0;
                      break L59;
                    } else {
                      stackIn_163_0 = this;
                      stackIn_163_1 = 1;
                      break L59;
                    }
                  }
                  ((cv) (this)).field_n = stackIn_163_1 != 0;
                  return;
                }
              } else {
                L60: {
                  stackIn_157_0 = this;

                  if (var3 == 0) {
                    stackIn_158_0 = this;
                    stackIn_158_1 = 0;
                    break L60;
                  } else {
                    stackIn_158_0 = this;
                    stackIn_158_1 = 1;
                    break L60;
                  }
                }
                ((cv) (this)).field_n = stackIn_158_1 != 0;
                return;
              }
            }
          }
        } else {
          L61: {
            var6 = (w) ((Object) this.a(58).field_G);
            if (param0 == -1) {
              break L61;
            } else {
              this.field_o = (ut) null;
              break L61;
            }
          }
          if (var6 == null) {
            return;
          } else {
            L62: {
              var3 = this.field_o.k((byte) -97).b(4) ? 1 : 0;
              if ((this.field_n ? 1 : 0) == var3) {
                break L62;
              } else {
                if (1 != this.field_q) {
                  if (this.field_q == 3) {
                    if (var3 != 0) {
                      var6.a(new fm(68, this.b((byte) -107), this.c((byte) 123), this.e((byte) -111)), -58);
                      break L62;
                    } else {
                      L63: {
                        if ((this.field_q ^ -1) == -2) {
                          if (this.field_o.k((byte) -126).b((byte) 89)) {
                            if (this.field_p == null) {
                              this.field_p = var6.a(new fm(53, this.b((byte) -102), this.c((byte) 116), this.e((byte) -89)), -58);
                              break L63;
                            } else {
                              if (this.field_q != 1) {
                                break L63;
                              } else {
                                if (this.field_o.k((byte) -87).b((byte) 72)) {
                                  break L63;
                                } else {
                                  if (this.field_p == null) {
                                    break L63;
                                  } else {
                                    this.field_p.a(91, var6);
                                    this.field_p = null;
                                    break L63;
                                  }
                                }
                              }
                            }
                          } else {
                            if (this.field_q != 1) {
                              break L63;
                            } else {
                              if (this.field_o.k((byte) -87).b((byte) 72)) {
                                break L63;
                              } else {
                                if (this.field_p == null) {
                                  break L63;
                                } else {
                                  this.field_p.a(91, var6);
                                  this.field_p = null;
                                  break L63;
                                }
                              }
                            }
                          }
                        } else {
                          if (this.field_q != 1) {
                            break L63;
                          } else {
                            if (this.field_o.k((byte) -87).b((byte) 72)) {
                              break L63;
                            } else {
                              if (this.field_p == null) {
                                break L63;
                              } else {
                                this.field_p.a(91, var6);
                                this.field_p = null;
                                break L63;
                              }
                            }
                          }
                        }
                      }
                      L64: {
                        stackIn_53_0 = this;

                        if (var3 == 0) {
                          stackIn_54_0 = this;
                          stackIn_54_1 = 0;
                          break L64;
                        } else {
                          stackIn_54_0 = this;
                          stackIn_54_1 = 1;
                          break L64;
                        }
                      }
                      ((cv) (this)).field_n = stackIn_54_1 != 0;
                      return;
                    }
                  } else {
                    L65: {
                      if ((this.field_q ^ -1) == -2) {
                        if (this.field_o.k((byte) -126).b((byte) 89)) {
                          if (this.field_p == null) {
                            this.field_p = var6.a(new fm(53, this.b((byte) -102), this.c((byte) 116), this.e((byte) -89)), -58);
                            break L65;
                          } else {
                            if (this.field_q != 1) {
                              break L65;
                            } else {
                              if (this.field_o.k((byte) -87).b((byte) 72)) {
                                break L65;
                              } else {
                                if (this.field_p == null) {
                                  break L65;
                                } else {
                                  this.field_p.a(91, var6);
                                  this.field_p = null;
                                  break L65;
                                }
                              }
                            }
                          }
                        } else {
                          if (this.field_q != 1) {
                            break L65;
                          } else {
                            if (this.field_o.k((byte) -87).b((byte) 72)) {
                              break L65;
                            } else {
                              if (this.field_p == null) {
                                break L65;
                              } else {
                                this.field_p.a(91, var6);
                                this.field_p = null;
                                break L65;
                              }
                            }
                          }
                        }
                      } else {
                        if (this.field_q != 1) {
                          break L65;
                        } else {
                          if (this.field_o.k((byte) -87).b((byte) 72)) {
                            break L65;
                          } else {
                            if (this.field_p == null) {
                              break L65;
                            } else {
                              this.field_p.a(91, var6);
                              this.field_p = null;
                              break L65;
                            }
                          }
                        }
                      }
                    }
                    L66: {
                      stackIn_31_0 = this;

                      if (var3 == 0) {
                        stackIn_32_0 = this;
                        stackIn_32_1 = 0;
                        break L66;
                      } else {
                        stackIn_32_0 = this;
                        stackIn_32_1 = 1;
                        break L66;
                      }
                    }
                    ((cv) (this)).field_n = stackIn_32_1 != 0;
                    return;
                  }
                } else {
                  if (var3 != 0) {
                    var6.a(new fm(51, this.b((byte) 90), this.c((byte) 119), this.e((byte) -106)), param0 ^ 57);
                    break L62;
                  } else {
                    var6.a(new fm(52, this.b((byte) -119), this.c((byte) 112), this.e((byte) -96)), -58);
                    break L62;
                  }
                }
              }
            }
            L67: {
              if ((this.field_q ^ -1) != -2) {
                break L67;
              } else {
                if (!this.field_o.k((byte) -126).b((byte) 89)) {
                  break L67;
                } else {
                  if (this.field_p != null) {
                    L68: {
                      if (this.field_q != 1) {
                        break L68;
                      } else {
                        if (this.field_o.k((byte) -87).b((byte) 72)) {
                          break L68;
                        } else {
                          if (this.field_p == null) {
                            break L68;
                          } else {
                            this.field_p.a(91, var6);
                            this.field_p = null;
                            break L68;
                          }
                        }
                      }
                    }
                    L69: {
                      stackIn_69_0 = this;

                      if (var3 == 0) {
                        stackIn_70_0 = this;
                        stackIn_70_1 = 0;
                        break L69;
                      } else {
                        stackIn_70_0 = this;
                        stackIn_70_1 = 1;
                        break L69;
                      }
                    }
                    ((cv) (this)).field_n = stackIn_70_1 != 0;
                    return;
                  } else {
                    L70: {
                      this.field_p = var6.a(new fm(53, this.b((byte) -102), this.c((byte) 116), this.e((byte) -89)), -58);
                      stackIn_61_0 = this;

                      if (var3 == 0) {
                        stackIn_62_0 = this;
                        stackIn_62_1 = 0;
                        break L70;
                      } else {
                        stackIn_62_0 = this;
                        stackIn_62_1 = 1;
                        break L70;
                      }
                    }
                    ((cv) (this)).field_n = stackIn_62_1 != 0;
                    return;
                  }
                }
              }
            }
            if (this.field_q == 1) {
              if (!this.field_o.k((byte) -87).b((byte) 72)) {
                if (this.field_p != null) {
                  L71: {
                    this.field_p.a(91, var6);
                    this.field_p = null;
                    stackIn_89_0 = this;

                    if (var3 == 0) {
                      stackIn_90_0 = this;
                      stackIn_90_1 = 0;
                      break L71;
                    } else {
                      stackIn_90_0 = this;
                      stackIn_90_1 = 1;
                      break L71;
                    }
                  }
                  ((cv) (this)).field_n = stackIn_90_1 != 0;
                  return;
                } else {
                  L72: {
                    stackIn_85_0 = this;

                    if (var3 == 0) {
                      stackIn_86_0 = this;
                      stackIn_86_1 = 0;
                      break L72;
                    } else {
                      stackIn_86_0 = this;
                      stackIn_86_1 = 1;
                      break L72;
                    }
                  }
                  ((cv) (this)).field_n = stackIn_86_1 != 0;
                  return;
                }
              } else {
                L73: {
                  stackIn_80_0 = this;

                  if (var3 == 0) {
                    stackIn_81_0 = this;
                    stackIn_81_1 = 0;
                    break L73;
                  } else {
                    stackIn_81_0 = this;
                    stackIn_81_1 = 1;
                    break L73;
                  }
                }
                ((cv) (this)).field_n = stackIn_81_1 != 0;
                return;
              }
            } else {
              L74: {
                stackIn_75_0 = this;

                if (var3 == 0) {
                  stackIn_76_0 = this;
                  stackIn_76_1 = 0;
                  break L74;
                } else {
                  stackIn_76_0 = this;
                  stackIn_76_1 = 1;
                  break L74;
                }
              }
              ((cv) (this)).field_n = stackIn_76_1 != 0;
              return;
            }
          }
        }
    }

    cv(int param0, la param1, kh param2) {
        super(param0, param1, param2);
        this.field_n = false;
    }

    final int m(byte param0) {
        if (param0 <= -63) {
          if (-1 != (this.field_q ^ -1)) {
            if (-3 != (this.field_q ^ -1)) {
              if (this.field_q != 4) {
                if (-6 == (this.field_q ^ -1)) {
                  return 0;
                } else {
                  return -1;
                }
              } else {
                return 0;
              }
            } else {
              return 0;
            }
          } else {
            return 0;
          }
        } else {
          return 69;
        }
    }

    final static void o(byte param0) {
        wp.a(-1);
        rda.d((byte) -128);
        fj.field_c = null;
        int var1 = 43 / ((param0 - -55) / 48);
        f.b(-68);
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        int stackIn_6_0 = 0;
        ka[] stackIn_14_0 = null;
        ka[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        ka[] stackIn_17_0 = null;
        ka[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        ka[] stackIn_23_0 = null;
        ka[] stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        ka[] stackIn_26_0 = null;
        ka[] stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        ka[] stackIn_30_0 = null;
        ka[] stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        ka[] stackIn_33_0 = null;
        ka[] stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        ka[] stackIn_49_0 = null;
        ka[] stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        ka[] stackIn_54_0 = null;
        ka[] stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        ka[] stackIn_58_0 = null;
        ka[] stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        ka[] stackIn_63_0 = null;
        ka[] stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        ka[] stackIn_68_0 = null;
        ka[] stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        ka[] stackIn_72_0 = null;
        ka[] stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        ka stackIn_77_0 = null;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        String stackIn_95_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        ka var12 = null;
        ka var13 = null;
        int var14 = 0;
        int var15 = 0;
        ka var16 = null;
        var15 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = -67 % ((param4 - -38) / 47);
              var7 = 0;
              var8 = 0;
              var9 = 0;
              if (null != this.field_o) {
                L2: {
                  if (!this.field_o.k((byte) -125).a(true)) {
                    stackIn_6_0 = 0;
                    break L2;
                  } else {
                    stackIn_6_0 = 1;
                    break L2;
                  }
                }
                var9 = stackIn_6_0;
                if (this.field_o.k((byte) -109).b((byte) 96)) {
                  var7 = 1;
                  break L1;
                } else {
                  if (this.field_o.b(-96) <= this.field_o.j((byte) -108)) {
                    break L1;
                  } else {
                    if (-1 != (this.field_o.j((byte) -108) ^ -1)) {
                      var8 = 1;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            L3: {
              var10 = 0;
              var11 = null;
              stackIn_14_0 = df.field_J;

              if (var9 != 0) {
                stackIn_15_0 = (ka[]) ((Object) stackIn_14_0);
                stackIn_15_1 = 100;
                break L3;
              } else {
                stackIn_15_0 = (ka[]) ((Object) stackIn_14_0);
                stackIn_15_1 = 67;
                break L3;
              }
            }
            L4: {
              var12 = stackIn_15_0[stackIn_15_1];
              stackIn_17_0 = df.field_J;

              if (var9 != 0) {
                stackIn_18_0 = (ka[]) ((Object) stackIn_17_0);
                stackIn_18_1 = 99;
                break L4;
              } else {
                stackIn_18_0 = (ka[]) ((Object) stackIn_17_0);
                stackIn_18_1 = 66;
                break L4;
              }
            }
            L5: {
              var13 = stackIn_18_0[stackIn_18_1];
              if (var7 == 0) {
                if (var8 != 0) {
                  L6: {
                    stackIn_30_0 = df.field_J;

                    if (var9 != 0) {
                      stackIn_31_0 = (ka[]) ((Object) stackIn_30_0);
                      stackIn_31_1 = 102;
                      break L6;
                    } else {
                      stackIn_31_0 = (ka[]) ((Object) stackIn_30_0);
                      stackIn_31_1 = 95;
                      break L6;
                    }
                  }
                  L7: {
                    var12 = stackIn_31_0[stackIn_31_1];
                    stackIn_33_0 = df.field_J;

                    if (var9 == 0) {
                      stackIn_34_0 = (ka[]) ((Object) stackIn_33_0);
                      stackIn_34_1 = 94;
                      break L7;
                    } else {
                      stackIn_34_0 = (ka[]) ((Object) stackIn_33_0);
                      stackIn_34_1 = 101;
                      break L7;
                    }
                  }
                  var13 = stackIn_34_0[stackIn_34_1];
                  break L5;
                } else {
                  L8: {
                    stackIn_23_0 = df.field_J;

                    if (var9 != 0) {
                      stackIn_24_0 = (ka[]) ((Object) stackIn_23_0);
                      stackIn_24_1 = 103;
                      break L8;
                    } else {
                      stackIn_24_0 = (ka[]) ((Object) stackIn_23_0);
                      stackIn_24_1 = 68;
                      break L8;
                    }
                  }
                  L9: {
                    var13 = stackIn_24_0[stackIn_24_1];
                    stackIn_26_0 = df.field_J;

                    if (var9 != 0) {
                      stackIn_27_0 = (ka[]) ((Object) stackIn_26_0);
                      stackIn_27_1 = 104;
                      break L9;
                    } else {
                      stackIn_27_0 = (ka[]) ((Object) stackIn_26_0);
                      stackIn_27_1 = 69;
                      break L9;
                    }
                  }
                  var12 = stackIn_27_0[stackIn_27_1];
                  break L5;
                }
              } else {
                break L5;
              }
            }
            L10: {
              var14 = this.field_q;
              if (var14 == 0) {
                if (var7 == 0) {
                  if (var8 == 0) {
                    L11: {
                      stackIn_58_0 = df.field_J;

                      if (var9 == 0) {
                        stackIn_59_0 = (ka[]) ((Object) stackIn_58_0);
                        stackIn_59_1 = 21;
                        break L11;
                      } else {
                        stackIn_59_0 = (ka[]) ((Object) stackIn_58_0);
                        stackIn_59_1 = 96;
                        break L11;
                      }
                    }
                    var11 = stackIn_59_0[stackIn_59_1];
                    break L10;
                  } else {
                    L12: {
                      stackIn_54_0 = df.field_J;

                      if (var9 == 0) {
                        stackIn_55_0 = (ka[]) ((Object) stackIn_54_0);
                        stackIn_55_1 = 93;
                        break L12;
                      } else {
                        stackIn_55_0 = (ka[]) ((Object) stackIn_54_0);
                        stackIn_55_1 = 97;
                        break L12;
                      }
                    }
                    var11 = stackIn_55_0[stackIn_55_1];
                    break L10;
                  }
                } else {
                  L13: {
                    stackIn_49_0 = df.field_J;

                    if (var9 != 0) {
                      stackIn_50_0 = (ka[]) ((Object) stackIn_49_0);
                      stackIn_50_1 = 98;
                      break L13;
                    } else {
                      stackIn_50_0 = (ka[]) ((Object) stackIn_49_0);
                      stackIn_50_1 = 22;
                      break L13;
                    }
                  }
                  var11 = stackIn_50_0[stackIn_50_1];
                  break L10;
                }
              } else {
                if (var14 != 2) {
                  if (-2 != (var14 ^ -1)) {
                    if (var14 != 3) {
                      if (4 != var14) {
                        if (var14 == 5) {
                          gba.a(2, param2, 2097152, var12, -512, var13, param1, 512, 512, this.field_h.a((byte) 55), param3);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L10;
                        }
                      } else {
                        jc.a(2097152, 0, (byte) 88, param2, this.field_h.c(-20), 1024, param3, var13, 0, var12, param1);
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    } else {
                      var11 = df.field_J[9];
                      var10 = -2048;
                      if (var7 != 0) {
                        var11 = this.field_s.b((byte) 74);
                        this.field_s.a(3, false, (byte) -101, 6);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                  } else {
                    L14: {
                      if (var7 != 0) {
                        stackIn_77_0 = df.field_J[25];
                        break L14;
                      } else {
                        stackIn_77_0 = df.field_J[24];
                        break L14;
                      }
                    }
                    var11 = stackIn_77_0;
                    break L10;
                  }
                } else {
                  if (var7 == 0) {
                    if (var8 != 0) {
                      L15: {
                        stackIn_72_0 = df.field_J;

                        if (var9 != 0) {
                          stackIn_73_0 = (ka[]) ((Object) stackIn_72_0);
                          stackIn_73_1 = 107;
                          break L15;
                        } else {
                          stackIn_73_0 = (ka[]) ((Object) stackIn_72_0);
                          stackIn_73_1 = 105;
                          break L15;
                        }
                      }
                      var11 = stackIn_73_0[stackIn_73_1];
                      break L10;
                    } else {
                      L16: {
                        stackIn_68_0 = df.field_J;

                        if (var9 != 0) {
                          stackIn_69_0 = (ka[]) ((Object) stackIn_68_0);
                          stackIn_69_1 = 106;
                          break L16;
                        } else {
                          stackIn_69_0 = (ka[]) ((Object) stackIn_68_0);
                          stackIn_69_1 = 45;
                          break L16;
                        }
                      }
                      var11 = stackIn_69_0[stackIn_69_1];
                      break L10;
                    }
                  } else {
                    L17: {
                      stackIn_63_0 = df.field_J;

                      if (var9 != 0) {
                        stackIn_64_0 = (ka[]) ((Object) stackIn_63_0);
                        stackIn_64_1 = 108;
                        break L17;
                      } else {
                        stackIn_64_0 = (ka[]) ((Object) stackIn_63_0);
                        stackIn_64_1 = 46;
                        break L17;
                      }
                    }
                    var11 = stackIn_64_0[stackIn_64_1];
                    break L10;
                  }
                }
              }
            }
            L18: {
              if (var11 == null) {
                break L18;
              } else {
                var14 = dfa.a(var10 + (2048 - this.field_h.g(-25787)) >> 11187202, 2048, -38);
                gqa.a(var14, -83584144, param1, param2, (ka) (var11), param3);
                break L18;
              }
            }
            L19: {
              L20: {
                if ((this.field_q ^ -1) != -2) {
                  break L20;
                } else {
                  if (var7 != 0) {
                    var16 = this.field_s.b((byte) 74);
                    this.field_s.a(3, false, (byte) 79, 7);
                    var14 = dfa.a(-this.field_h.g(-25787) + var10 + 2048 >> 2040878914, 2048, -69);
                    gqa.a(var14, -83584144, param1, param2 + 65536, var16, param3 + 2228224);
                    break L20;
                  } else {
                    break L19;
                  }
                }
              }
              break L19;
            }
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var6 = decompiledCaughtException;
            stackIn_94_0 = (RuntimeException) (var6);

            stackIn_94_1 = new StringBuilder().append("cv.D(");

            if (param0 == null) {
              stackIn_95_0 = (RuntimeException) ((Object) stackIn_94_0);
              stackIn_95_1 = (StringBuilder) ((Object) stackIn_94_1);
              stackIn_95_2 = "null";
              break L21;
            } else {
              stackIn_95_0 = (RuntimeException) ((Object) stackIn_94_0);
              stackIn_95_1 = (StringBuilder) ((Object) stackIn_94_1);
              stackIn_95_2 = "{...}";
              break L21;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_95_0), stackIn_95_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final int k(byte param0) {
        int var2;
        int var3;
        var3 = TombRacer.field_G ? 1 : 0;
        if (param0 == -99) {
          if (!this.field_h.j(-1)) {
            var2 = this.field_q;
            if (var2 != 0) {
              if (2 != var2) {
                if (4 != var2) {
                  if (5 != var2) {
                    if (-2 != (var2 ^ -1)) {
                      if (var2 == 3) {
                        return 7;
                      } else {
                        return 5;
                      }
                    } else {
                      return 7;
                    }
                  } else {
                    return 5;
                  }
                } else {
                  return 5;
                }
              } else {
                return 5;
              }
            } else {
              return 5;
            }
          } else {
            return 2;
          }
        } else {
          return 44;
        }
    }

    static {
        field_m = new Hashtable();
        field_r = "Waiting for graphics";
    }
}
