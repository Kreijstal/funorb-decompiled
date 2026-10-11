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
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          super.a(param0, param1, param2);
          if (param0 instanceof ut) {
            this.field_o = (ut) ((Object) param0);
          }
          if (this.field_q != 3) {
            if (this.field_q == 1) {
              this.field_s = new bua(7, 8);
            }
          } else {
            this.field_s = new bua(1, 10);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("cv.E(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
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
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          super.a(param0, param1 + 0, param2);
          if (param1 != -2159) {
            this.field_s = (bua) null;
          }
          var4_int = param0.c(-22);
          var5 = param0.a((byte) 55);
          if (var4_int == 2097152 &&
            var5 == 2097152) {
            this.field_q = 0;
            return;
          }
          if (var4_int == 4194304 &&
            var5 == 4194304) {
            this.field_q = 2;
            return;
          }
          if (var4_int > var5) {
            this.field_q = 4;
          } else {
            this.field_q = 5;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("cv.C(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final int f(byte param0) {
        int var2 = 56 / ((param0 - 15) / 45);
        return -1;
    }

    final void d(int param0) {
        boolean stackIn_32_1 = false;
        boolean stackIn_54_1 = false;
        boolean stackIn_62_1 = false;
        boolean stackIn_70_1 = false;
        boolean stackIn_76_1 = false;
        boolean stackIn_81_1 = false;
        boolean stackIn_86_1 = false;
        boolean stackIn_90_1 = false;
        boolean stackIn_122_1 = false;
        boolean stackIn_136_1 = false;
        boolean stackIn_144_1 = false;
        boolean stackIn_152_1 = false;
        boolean stackIn_158_1 = false;
        boolean stackIn_163_1 = false;
        boolean stackIn_168_1 = false;
        boolean stackIn_172_1 = false;
        boolean stackIn_184_1 = false;
        boolean stackIn_189_1 = false;
        boolean stackIn_194_1 = false;
        boolean stackIn_199_1 = false;
        boolean stackIn_203_1 = false;
        boolean stackIn_209_1 = false;
        boolean stackIn_214_1 = false;
        boolean stackIn_219_1 = false;
        boolean stackIn_223_1 = false;
        boolean stackIn_236_1 = false;
        boolean stackIn_240_1 = false;
        boolean stackIn_247_1 = false;
        boolean stackIn_251_1 = false;
        boolean stackIn_255_1 = false;
        boolean stackIn_265_1 = false;
        boolean stackIn_269_1 = false;
        boolean stackIn_276_1 = false;
        boolean stackIn_280_1 = false;
        boolean stackIn_284_1 = false;
        boolean stackIn_296_1 = false;
        boolean stackIn_300_1 = false;
        boolean stackIn_304_1 = false;
        boolean stackIn_316_1 = false;
        boolean stackIn_321_1 = false;
        boolean stackIn_326_1 = false;
        boolean stackIn_331_1 = false;
        boolean stackIn_335_1 = false;
        boolean stackIn_339_1 = false;
        boolean stackIn_349_1 = false;
        boolean stackIn_353_1 = false;
        boolean stackIn_360_1 = false;
        boolean stackIn_364_1 = false;
        boolean stackIn_368_1 = false;
        int var3;
        int var4;
        w var6;
        w var7;
        int var3Lifetime1;
        int var3Lifetime2;
        var4 = TombRacer.field_G ? 1 : 0;
        if (null == this.field_s) {
          var6 = (w) (this.a(58).field_G);
          if (param0 != -1) {
            this.field_o = (ut) null;
          }
          if (var6 == null) {
            return;
          }
          var3 = this.field_o.k((byte) -97).b(4) ? 1 : 0;
          if ((this.field_n ? 1 : 0) != var3) {
            if (1 != this.field_q) {
              if (this.field_q != 3) {
                if (this.field_q == 1) {
                  if (this.field_o.k((byte) -126).b((byte) 89)) {
                    if (this.field_p == null) {
                      this.field_p = var6.a(new fm(53, this.b((byte) -102), this.c((byte) 116), this.e((byte) -89)), -58);
                    } else {
                      if (this.field_q == 1 &&
                        !this.field_o.k((byte) -87).b((byte) 72) &&
                        this.field_p != null) {
                        this.field_p.a(91, var6);
                        this.field_p = null;
                      }
                    }
                  } else {
                    if (this.field_q == 1 &&
                      !this.field_o.k((byte) -87).b((byte) 72) &&
                      this.field_p != null) {
                      this.field_p.a(91, var6);
                      this.field_p = null;
                    }
                  }
                } else {
                  if (this.field_q == 1 &&
                    !this.field_o.k((byte) -87).b((byte) 72) &&
                    this.field_p != null) {
                    this.field_p.a(91, var6);
                    this.field_p = null;
                  }
                }
                stackIn_32_1 = (var3 != 0);
                this.field_n = stackIn_32_1;
                return;
              }
              if (var3 == 0) {
                if (this.field_q == 1) {
                  if (this.field_o.k((byte) -126).b((byte) 89)) {
                    if (this.field_p == null) {
                      this.field_p = var6.a(new fm(53, this.b((byte) -102), this.c((byte) 116), this.e((byte) -89)), -58);
                    } else {
                      if (this.field_q == 1 &&
                        !this.field_o.k((byte) -87).b((byte) 72) &&
                        this.field_p != null) {
                        this.field_p.a(91, var6);
                        this.field_p = null;
                      }
                    }
                  } else {
                    if (this.field_q == 1 &&
                      !this.field_o.k((byte) -87).b((byte) 72) &&
                      this.field_p != null) {
                      this.field_p.a(91, var6);
                      this.field_p = null;
                    }
                  }
                } else {
                  if (this.field_q == 1 &&
                    !this.field_o.k((byte) -87).b((byte) 72) &&
                    this.field_p != null) {
                    this.field_p.a(91, var6);
                    this.field_p = null;
                  }
                }
                stackIn_54_1 = (var3 != 0);
                this.field_n = stackIn_54_1;
                return;
              }
              var6.a(new fm(68, this.b((byte) -107), this.c((byte) 123), this.e((byte) -111)), -58);
            } else {
              if (var3 != 0) {
                var6.a(new fm(51, this.b((byte) 90), this.c((byte) 119), this.e((byte) -106)), param0 ^ 57);
              } else {
                var6.a(new fm(52, this.b((byte) -119), this.c((byte) 112), this.e((byte) -96)), -58);
              }
            }
          }
          if (this.field_q == 1 &&
            this.field_o.k((byte) -126).b((byte) 89)) {
            if (this.field_p == null) {
              this.field_p = var6.a(new fm(53, this.b((byte) -102), this.c((byte) 116), this.e((byte) -89)), -58);
              stackIn_62_1 = (var3 != 0);
              this.field_n = stackIn_62_1;
            } else {
              if (this.field_q == 1 &&
                !this.field_o.k((byte) -87).b((byte) 72) &&
                this.field_p != null) {
                this.field_p.a(91, var6);
                this.field_p = null;
              }
              stackIn_70_1 = (var3 != 0);
              this.field_n = stackIn_70_1;
            }
            return;
          }
          if (this.field_q != 1) {
            stackIn_76_1 = (var3 != 0);
            this.field_n = stackIn_76_1;
          } else {
            if (this.field_o.k((byte) -87).b((byte) 72)) {
              stackIn_81_1 = (var3 != 0);
              this.field_n = stackIn_81_1;
            } else {
              if (this.field_p == null) {
                stackIn_86_1 = (var3 != 0);
                this.field_n = stackIn_86_1;
              } else {
                this.field_p.a(91, var6);
                this.field_p = null;
                stackIn_90_1 = (var3 != 0);
                this.field_n = stackIn_90_1;
              }
            }
          }
          return;
        }
        this.field_s.a(param0 + 1);
        var7 = (w) (this.a(58).field_G);
        if (param0 == -1) {
          if (var7 == null) {
            return;
          }
          var3Lifetime1 = this.field_o.k((byte) -97).b(4) ? 1 : 0;
          if ((this.field_n ? 1 : 0) != var3Lifetime1) {
            if (1 != this.field_q) {
              if (this.field_q != 3) {
                if (this.field_q == 1) {
                  if (this.field_o.k((byte) -126).b((byte) 89)) {
                    if (this.field_p == null) {
                      this.field_p = var7.a(new fm(53, this.b((byte) -102), this.c((byte) 116), this.e((byte) -89)), -58);
                    } else {
                      if (this.field_q == 1 &&
                        !this.field_o.k((byte) -87).b((byte) 72) &&
                        this.field_p != null) {
                        this.field_p.a(91, var7);
                        this.field_p = null;
                      }
                    }
                  } else {
                    if (this.field_q == 1 &&
                      !this.field_o.k((byte) -87).b((byte) 72) &&
                      this.field_p != null) {
                      this.field_p.a(91, var7);
                      this.field_p = null;
                    }
                  }
                } else {
                  if (this.field_q == 1 &&
                    !this.field_o.k((byte) -87).b((byte) 72) &&
                    this.field_p != null) {
                    this.field_p.a(91, var7);
                    this.field_p = null;
                  }
                }
                stackIn_122_1 = (var3Lifetime1 != 0);
                this.field_n = stackIn_122_1;
                return;
              }
              if (var3Lifetime1 == 0) {
                if (this.field_q == 1 &&
                  this.field_o.k((byte) -126).b((byte) 89) &&
                  this.field_p == null) {
                  this.field_p = var7.a(new fm(53, this.b((byte) -102), this.c((byte) 116), this.e((byte) -89)), -58);
                } else {
                  if (this.field_q == 1 &&
                    !this.field_o.k((byte) -87).b((byte) 72) &&
                    this.field_p != null) {
                    this.field_p.a(91, var7);
                    this.field_p = null;
                  }
                }
                stackIn_136_1 = (var3Lifetime1 != 0);
                this.field_n = stackIn_136_1;
                return;
              }
              var7.a(new fm(68, this.b((byte) -107), this.c((byte) 123), this.e((byte) -111)), -58);
            } else {
              if (var3Lifetime1 != 0) {
                var7.a(new fm(51, this.b((byte) 90), this.c((byte) 119), this.e((byte) -106)), param0 ^ 57);
              } else {
                var7.a(new fm(52, this.b((byte) -119), this.c((byte) 112), this.e((byte) -96)), -58);
              }
            }
          }
          if (this.field_q == 1 &&
            this.field_o.k((byte) -126).b((byte) 89)) {
            if (this.field_p == null) {
              this.field_p = var7.a(new fm(53, this.b((byte) -102), this.c((byte) 116), this.e((byte) -89)), -58);
              stackIn_144_1 = (var3Lifetime1 != 0);
              this.field_n = stackIn_144_1;
            } else {
              if (this.field_q == 1 &&
                !this.field_o.k((byte) -87).b((byte) 72) &&
                this.field_p != null) {
                this.field_p.a(91, var7);
                this.field_p = null;
              }
              stackIn_152_1 = (var3Lifetime1 != 0);
              this.field_n = stackIn_152_1;
            }
            return;
          }
          if (this.field_q != 1) {
            stackIn_158_1 = (var3Lifetime1 != 0);
            this.field_n = stackIn_158_1;
          } else {
            if (this.field_o.k((byte) -87).b((byte) 72)) {
              stackIn_163_1 = (var3Lifetime1 != 0);
              this.field_n = stackIn_163_1;
            } else {
              if (this.field_p == null) {
                stackIn_168_1 = (var3Lifetime1 != 0);
                this.field_n = stackIn_168_1;
              } else {
                this.field_p.a(91, var7);
                this.field_p = null;
                stackIn_172_1 = (var3Lifetime1 != 0);
                this.field_n = stackIn_172_1;
              }
            }
          }
          return;
        }
        this.field_o = (ut) null;
        if (var7 == null) {
          return;
        }
        var3Lifetime2 = this.field_o.k((byte) -97).b(4) ? 1 : 0;
        if ((this.field_n ? 1 : 0) == var3Lifetime2) {
          if (this.field_q == 1 &&
            this.field_o.k((byte) -126).b((byte) 89)) {
            if (this.field_p == null) {
              this.field_p = var7.a(new fm(53, this.b((byte) -102), this.c((byte) 116), this.e((byte) -89)), -58);
              stackIn_184_1 = (var3Lifetime2 != 0);
              this.field_n = stackIn_184_1;
            } else {
              if (this.field_q != 1) {
                stackIn_189_1 = (var3Lifetime2 != 0);
                this.field_n = stackIn_189_1;
              } else {
                if (this.field_o.k((byte) -87).b((byte) 72)) {
                  stackIn_194_1 = (var3Lifetime2 != 0);
                  this.field_n = stackIn_194_1;
                } else {
                  if (this.field_p == null) {
                    stackIn_203_1 = (var3Lifetime2 != 0);
                    this.field_n = stackIn_203_1;
                  } else {
                    this.field_p.a(91, var7);
                    this.field_p = null;
                    stackIn_199_1 = (var3Lifetime2 != 0);
                    this.field_n = stackIn_199_1;
                  }
                }
              }
            }
            return;
          }
          if (this.field_q != 1) {
            stackIn_209_1 = (var3Lifetime2 != 0);
            this.field_n = stackIn_209_1;
          } else {
            if (this.field_o.k((byte) -87).b((byte) 72)) {
              stackIn_214_1 = (var3Lifetime2 != 0);
              this.field_n = stackIn_214_1;
            } else {
              if (this.field_p == null) {
                stackIn_219_1 = (var3Lifetime2 != 0);
                this.field_n = stackIn_219_1;
              } else {
                this.field_p.a(91, var7);
                this.field_p = null;
                stackIn_223_1 = (var3Lifetime2 != 0);
                this.field_n = stackIn_223_1;
              }
            }
          }
          return;
        }
        if (1 == this.field_q) {
          if (var3Lifetime2 != 0) {
            var7.a(new fm(51, this.b((byte) 90), this.c((byte) 119), this.e((byte) -106)), param0 ^ 57);
            if (this.field_q == 1 &&
              this.field_o.k((byte) -126).b((byte) 89)) {
              if (this.field_p == null) {
                this.field_p = var7.a(new fm(53, this.b((byte) -102), this.c((byte) 116), this.e((byte) -89)), -58);
                stackIn_280_1 = true;
                this.field_n = stackIn_280_1;
                return;
              }
              if (this.field_q == 1 &&
                !this.field_o.k((byte) -87).b((byte) 72) &&
                this.field_p != null) {
                this.field_p.a(91, var7);
                this.field_p = null;
                stackIn_265_1 = true;
                this.field_n = stackIn_265_1;
                return;
              }
              stackIn_269_1 = true;
              this.field_n = stackIn_269_1;
              return;
            }
            if (this.field_q == 1 &&
              !this.field_o.k((byte) -87).b((byte) 72) &&
              this.field_p != null) {
              this.field_p.a(91, var7);
              this.field_p = null;
              stackIn_276_1 = true;
              this.field_n = stackIn_276_1;
              return;
            }
            stackIn_284_1 = true;
            this.field_n = stackIn_284_1;
            return;
          }
          var7.a(new fm(52, this.b((byte) -119), this.c((byte) 112), this.e((byte) -96)), -58);
          if (this.field_q == 1 &&
            this.field_o.k((byte) -126).b((byte) 89)) {
            if (this.field_p == null) {
              this.field_p = var7.a(new fm(53, this.b((byte) -102), this.c((byte) 116), this.e((byte) -89)), -58);
              stackIn_251_1 = false;
              this.field_n = stackIn_251_1;
              return;
            }
            if (this.field_q == 1 &&
              !this.field_o.k((byte) -87).b((byte) 72) &&
              this.field_p != null) {
              this.field_p.a(91, var7);
              this.field_p = null;
              stackIn_236_1 = false;
              this.field_n = stackIn_236_1;
              return;
            }
            stackIn_240_1 = false;
            this.field_n = stackIn_240_1;
            return;
          }
          if (this.field_q == 1 &&
            !this.field_o.k((byte) -87).b((byte) 72) &&
            this.field_p != null) {
            this.field_p.a(91, var7);
            this.field_p = null;
            stackIn_247_1 = false;
            this.field_n = stackIn_247_1;
            return;
          }
          stackIn_255_1 = false;
          this.field_n = stackIn_255_1;
          return;
        }
        if (this.field_q != 3) {
          if (this.field_q == 1 &&
            this.field_o.k((byte) -126).b((byte) 89) &&
            this.field_p == null) {
            this.field_p = var7.a(new fm(53, this.b((byte) -102), this.c((byte) 116), this.e((byte) -89)), -58);
            stackIn_300_1 = (var3Lifetime2 != 0);
            this.field_n = stackIn_300_1;
            return;
          }
          if (this.field_q == 1 &&
            !this.field_o.k((byte) -87).b((byte) 72) &&
            this.field_p != null) {
            this.field_p.a(91, var7);
            this.field_p = null;
            stackIn_296_1 = (var3Lifetime2 != 0);
            this.field_n = stackIn_296_1;
            return;
          }
          stackIn_304_1 = (var3Lifetime2 != 0);
          this.field_n = stackIn_304_1;
          return;
        }
        if (var3Lifetime2 != 0) {
          var7.a(new fm(68, this.b((byte) -107), this.c((byte) 123), this.e((byte) -111)), -58);
          if (this.field_q == 1 &&
            this.field_o.k((byte) -126).b((byte) 89)) {
            if (this.field_p == null) {
              this.field_p = var7.a(new fm(53, this.b((byte) -102), this.c((byte) 116), this.e((byte) -89)), -58);
              stackIn_364_1 = true;
              this.field_n = stackIn_364_1;
              return;
            }
            if (this.field_q == 1 &&
              !this.field_o.k((byte) -87).b((byte) 72) &&
              this.field_p != null) {
              this.field_p.a(91, var7);
              this.field_p = null;
              stackIn_349_1 = true;
              this.field_n = stackIn_349_1;
              return;
            }
            stackIn_353_1 = true;
            this.field_n = stackIn_353_1;
            return;
          }
          if (this.field_q == 1 &&
            !this.field_o.k((byte) -87).b((byte) 72) &&
            this.field_p != null) {
            this.field_p.a(91, var7);
            this.field_p = null;
            stackIn_360_1 = true;
            this.field_n = stackIn_360_1;
            return;
          }
          stackIn_368_1 = true;
          this.field_n = stackIn_368_1;
          return;
        }
        if (this.field_q == 1 &&
          this.field_o.k((byte) -126).b((byte) 89)) {
          if (this.field_p == null) {
            this.field_p = var7.a(new fm(53, this.b((byte) -102), this.c((byte) 116), this.e((byte) -89)), -58);
            stackIn_339_1 = false;
            this.field_n = stackIn_339_1;
          } else {
            if (this.field_q == 1 &&
              !this.field_o.k((byte) -87).b((byte) 72) &&
              this.field_p != null) {
              this.field_p.a(91, var7);
              this.field_p = null;
            }
            stackIn_316_1 = false;
            this.field_n = stackIn_316_1;
          }
          return;
        }
        if (this.field_q != 1) {
          stackIn_321_1 = false;
          this.field_n = stackIn_321_1;
        } else {
          if (this.field_o.k((byte) -87).b((byte) 72)) {
            stackIn_326_1 = false;
            this.field_n = stackIn_326_1;
          } else {
            if (this.field_p == null) {
              stackIn_331_1 = false;
              this.field_n = stackIn_331_1;
            } else {
              this.field_p.a(91, var7);
              this.field_p = null;
              stackIn_335_1 = false;
              this.field_n = stackIn_335_1;
            }
          }
        }
        return;
    }

    cv(int param0, la param1, kh param2) {
        super(param0, param1, param2);
        this.field_n = false;
    }

    final int m(byte param0) {
        if (param0 > -63) {
          return 69;
        }
        if (this.field_q == 0) {
          return 0;
        }
        if (this.field_q == 2) {
          return 0;
        }
        if (this.field_q == 4) {
          return 0;
        }
        if (this.field_q != 5) {
          return -1;
        }
        return 0;
    }

    final static void o(byte param0) {
        wp.a(-1);
        rda.d((byte) -128);
        fj.field_c = null;
        int var1 = 43 / ((param0 + 55) / 48);
        f.b(-68);
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        int stackIn_6_0 = 0;
        ka[] stackIn_14_0 = null;
        int stackIn_15_1 = 0;
        ka[] stackIn_17_0 = null;
        int stackIn_18_1 = 0;
        ka[] stackIn_23_0 = null;
        int stackIn_24_1 = 0;
        ka[] stackIn_26_0 = null;
        int stackIn_27_1 = 0;
        ka[] stackIn_30_0 = null;
        int stackIn_31_1 = 0;
        ka[] stackIn_33_0 = null;
        int stackIn_34_1 = 0;
        ka[] stackIn_49_0 = null;
        int stackIn_50_1 = 0;
        ka[] stackIn_54_0 = null;
        int stackIn_55_1 = 0;
        ka[] stackIn_58_0 = null;
        int stackIn_59_1 = 0;
        ka[] stackIn_63_0 = null;
        int stackIn_64_1 = 0;
        ka[] stackIn_68_0 = null;
        int stackIn_69_1 = 0;
        ka[] stackIn_72_0 = null;
        int stackIn_73_1 = 0;
        ka stackIn_77_0 = null;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        String stackIn_95_2 = null;
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
        int var14Lifetime1;
        int var14Lifetime2;
        var15 = TombRacer.field_G ? 1 : 0;
        try {
          var6_int = -67 % ((param4 + 38) / 47);
          var7 = 0;
          var8 = 0;
          var9 = 0;
          if (null != this.field_o) {
            stackIn_6_0 = (!this.field_o.k((byte) -125).a(true)) ? 0 : 1;
            var9 = stackIn_6_0;
            if (this.field_o.k((byte) -109).b((byte) 96)) {
              var7 = 1;
            } else {
              if (this.field_o.b(-96) > this.field_o.j((byte) -108) &&
                this.field_o.j((byte) -108) != 0) {
                var8 = 1;
              }
            }
          }
          var10 = 0;
          var11 = null;
          stackIn_14_0 = df.field_J;
          if (var9 != 0) {
            stackIn_15_1 = 100;
          } else {
            stackIn_15_1 = 67;
          }
          var12 = stackIn_14_0[stackIn_15_1];
          stackIn_17_0 = df.field_J;
          if (var9 != 0) {
            stackIn_18_1 = 99;
          } else {
            stackIn_18_1 = 66;
          }
          var13 = stackIn_17_0[stackIn_18_1];
          if (var7 == 0) {
            if (var8 != 0) {
              stackIn_30_0 = df.field_J;
              if (var9 != 0) {
                stackIn_31_1 = 102;
              } else {
                stackIn_31_1 = 95;
              }
              var12 = stackIn_30_0[stackIn_31_1];
              stackIn_33_0 = df.field_J;
              if (var9 == 0) {
                stackIn_34_1 = 94;
              } else {
                stackIn_34_1 = 101;
              }
              var13 = stackIn_33_0[stackIn_34_1];
            } else {
              stackIn_23_0 = df.field_J;
              if (var9 != 0) {
                stackIn_24_1 = 103;
              } else {
                stackIn_24_1 = 68;
              }
              var13 = stackIn_23_0[stackIn_24_1];
              stackIn_26_0 = df.field_J;
              if (var9 != 0) {
                stackIn_27_1 = 104;
              } else {
                stackIn_27_1 = 69;
              }
              var12 = stackIn_26_0[stackIn_27_1];
            }
          }
          var14 = this.field_q;
          if (var14 == 0) {
            if (var7 == 0) {
              if (var8 == 0) {
                stackIn_58_0 = df.field_J;
                if (var9 == 0) {
                  stackIn_59_1 = 21;
                } else {
                  stackIn_59_1 = 96;
                }
                var11 = stackIn_58_0[stackIn_59_1];
              } else {
                stackIn_54_0 = df.field_J;
                if (var9 == 0) {
                  stackIn_55_1 = 93;
                } else {
                  stackIn_55_1 = 97;
                }
                var11 = stackIn_54_0[stackIn_55_1];
              }
            } else {
              stackIn_49_0 = df.field_J;
              if (var9 != 0) {
                stackIn_50_1 = 98;
              } else {
                stackIn_50_1 = 22;
              }
              var11 = stackIn_49_0[stackIn_50_1];
            }
          } else {
            if (var14 != 2) {
              if (var14 != 1) {
                if (var14 != 3) {
                  if (4 == var14) {
                    jc.a(2097152, 0, (byte) 88, param2, this.field_h.c(-20), 1024, param3, var13, 0, var12, param1);
                    return;
                  }
                  if (var14 == 5) {
                    gba.a(2, param2, 2097152, var12, -512, var13, param1, 512, 512, this.field_h.a((byte) 55), param3);
                    return;
                  }
                } else {
                  var11 = df.field_J[9];
                  var10 = -2048;
                  if (var7 != 0) {
                    var11 = this.field_s.b((byte) 74);
                    this.field_s.a(3, false, (byte) -101, 6);
                  }
                }
              } else {
                if (var7 != 0) {
                  stackIn_77_0 = df.field_J[25];
                } else {
                  stackIn_77_0 = df.field_J[24];
                }
                var11 = stackIn_77_0;
              }
            } else {
              if (var7 == 0) {
                if (var8 != 0) {
                  stackIn_72_0 = df.field_J;
                  if (var9 != 0) {
                    stackIn_73_1 = 107;
                  } else {
                    stackIn_73_1 = 105;
                  }
                  var11 = stackIn_72_0[stackIn_73_1];
                } else {
                  stackIn_68_0 = df.field_J;
                  if (var9 != 0) {
                    stackIn_69_1 = 106;
                  } else {
                    stackIn_69_1 = 45;
                  }
                  var11 = stackIn_68_0[stackIn_69_1];
                }
              } else {
                stackIn_63_0 = df.field_J;
                if (var9 != 0) {
                  stackIn_64_1 = 108;
                } else {
                  stackIn_64_1 = 46;
                }
                var11 = stackIn_63_0[stackIn_64_1];
              }
            }
          }
          if (var11 != null) {
            var14Lifetime1 = dfa.a(var10 + (2048 - this.field_h.g(-25787)) >> 2, 2048, -38);
            gqa.a(var14Lifetime1, -83584144, param1, param2, (ka) (var11), param3);
          }
          if (this.field_q == 1) {
            if (var7 == 0) {
              return;
            }
            var16 = this.field_s.b((byte) 74);
            this.field_s.a(3, false, (byte) 79, 7);
            var14Lifetime2 = dfa.a(-this.field_h.g(-25787) + var10 + 2048 >> 2, 2048, -69);
            gqa.a(var14Lifetime2, -83584144, param1, param2 + 65536, var16, param3 + 2228224);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_94_0 = var6;
          stackIn_94_1 = new StringBuilder().append("cv.D(");
          if (param0 == null) {
            stackIn_95_2 = "null";
          } else {
            stackIn_95_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_94_0), ((StringBuilder) (Object) stackIn_94_1).append(stackIn_95_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final int k(byte param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        if (param0 != -99) {
          return 44;
        }
        if (this.field_h.j(-1)) {
          return 2;
        }
        int var2 = this.field_q;
        if (var2 == 0) {
          return 5;
        }
        if (2 == var2) {
          return 5;
        }
        if (4 == var2) {
          return 5;
        }
        if (5 == var2) {
          return 5;
        }
        if (var2 == 1) {
          return 7;
        }
        if (var2 != 3) {
          return 5;
        }
        return 7;
    }

    static {
        field_m = new Hashtable();
        field_r = "Waiting for graphics";
    }
}
