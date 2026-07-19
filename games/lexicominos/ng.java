/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng {
    kd field_b;
    private kd field_a;

    final static void a(int param0, le param1, byte param2, le param3) {
        try {
            int var4_int = 88 % ((35 - param2) / 55);
            nb.field_x = param0;
            fb.field_m = param1;
            pb.field_i = param3;
            Lexicominos.a(lf.field_f / 2, 67, lf.field_a / 2);
            vc.a(-5094, param1.field_t, param1.field_t + param1.field_G, param3.field_t, param3.field_G + param3.field_t);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "ng.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final kd a(byte param0) {
        kd var2 = null;
        int var3 = 0;
        var3 = -7 / ((param0 - 3) / 33);
        var2 = this.field_b.field_f;
        if (var2 == this.field_b) {
          return null;
        } else {
          var2.b((byte) -120);
          return var2;
        }
    }

    private final void a(kd param0, ng param1, byte param2) {
        kd var4 = null;
        RuntimeException var4_ref = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
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
              if (param2 == -9) {
                break L1;
              } else {
                this.g(-7);
                break L1;
              }
            }
            var4 = this.field_b.field_c;
            this.field_b.field_c = param0.field_c;
            param0.field_c.field_f = this.field_b;
            if (param0 != this.field_b) {
              param0.field_c = param1.field_b.field_c;
              param0.field_c.field_f = param0;
              param1.field_b.field_c = var4;
              var4.field_f = param1.field_b;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var4_ref);
            stackOut_6_1 = new StringBuilder().append("ng.I(");
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
          L3: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ')');
        }
    }

    final static int a(byte param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        le var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var3_int = 1;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (1 >= param1) {
                      break L4;
                    } else {
                      var7 = param1 & 1;
                      var6 = 0;
                      if (var4 != 0) {
                        if (var6 == var7) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        L5: {
                          if (var6 != var7) {
                            var3_int = var3_int * param2;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        param2 = param2 * param2;
                        param1 = param1 >> 1;
                        if (var4 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (param0 == -11) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                var5 = (le) null;
                ng.a(56, (le) null, (byte) 99, (le) null);
                break L2;
              }
              if (param1 != 1) {
                stackOut_15_0 = var3_int;
                stackIn_16_0 = stackOut_15_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackOut_13_0 = var3_int * param2;
                stackIn_14_0 = stackOut_13_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var3), "ng.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_14_0;
        } else {
          return stackIn_16_0;
        }
    }

    final kd d(int param0) {
        kd var2 = null;
        var2 = this.field_a;
        if (var2 == this.field_b) {
          this.field_a = null;
          return null;
        } else {
          if (param0 != 0) {
            return (kd) null;
          } else {
            this.field_a = var2.field_c;
            return var2;
          }
        }
    }

    final void a(ng param0, int param1) {
        try {
            int var3_int = -10 / ((-70 - param1) / 50);
            this.a(this.field_b.field_f, param0, (byte) -9);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "ng.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void g(int param0) {
        kd var2 = null;
        int var3 = 0;
        ng var4 = null;
        var3 = Lexicominos.field_L ? 1 : 0;
        L0: while (true) {
          var2 = this.field_b.field_f;
          if (this.field_b == var2) {
            this.field_a = null;
            if (param0 <= -74) {
              return;
            } else {
              var4 = (ng) null;
              this.a((ng) null, 9);
              return;
            }
          } else {
            var2.b((byte) -117);
            if (var3 != 0) {
              if (param0 <= -74) {
                return;
              } else {
                var4 = (ng) null;
                this.a((ng) null, 9);
                return;
              }
            } else {
              if (var3 == 0) {
                continue L0;
              } else {
                this.field_a = null;
                if (param0 <= -74) {
                  return;
                } else {
                  var4 = (ng) null;
                  this.a((ng) null, 9);
                  return;
                }
              }
            }
          }
        }
    }

    final kd a(int param0) {
        kd discarded$2 = null;
        kd var2 = null;
        if (param0 == 31334) {
          var2 = this.field_b.field_c;
          if (var2 == this.field_b) {
            return null;
          } else {
            var2.b((byte) -126);
            return var2;
          }
        } else {
          discarded$2 = this.f(-3);
          var2 = this.field_b.field_c;
          if (var2 == this.field_b) {
            return null;
          } else {
            var2.b((byte) -126);
            return var2;
          }
        }
    }

    final void b(int param0, kd param1) {
        if (!(param1.field_c == null)) {
            param1.b((byte) -117);
        }
        if (param0 < 98) {
            return;
        }
        try {
            param1.field_c = this.field_b.field_c;
            param1.field_f = this.field_b;
            param1.field_c.field_f = param1;
            param1.field_f.field_c = param1;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "ng.O(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, kd param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (null != param1.field_c) {
                param1.b((byte) -128);
                break L1;
              } else {
                break L1;
              }
            }
            param1.field_f = this.field_b.field_f;
            param1.field_c = this.field_b;
            param1.field_c.field_f = param1;
            param1.field_f.field_c = param1;
            if (param0 <= -56) {
              break L0;
            } else {
              this.field_b = (kd) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var3);
            stackOut_6_1 = new StringBuilder().append("ng.H(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
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
          throw ld.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final kd c(int param0) {
        kd var2 = null;
        var2 = this.field_b.field_c;
        if (param0 == 2) {
          if (this.field_b == var2) {
            this.field_a = null;
            return null;
          } else {
            this.field_a = var2.field_c;
            return var2;
          }
        } else {
          this.field_a = (kd) null;
          if (this.field_b == var2) {
            this.field_a = null;
            return null;
          } else {
            this.field_a = var2.field_c;
            return var2;
          }
        }
    }

    final kd f(int param0) {
        kd var2 = null;
        if (param0 == 2) {
          var2 = this.field_a;
          if (this.field_b == var2) {
            this.field_a = null;
            return null;
          } else {
            this.field_a = var2.field_f;
            return var2;
          }
        } else {
          this.field_a = (kd) null;
          var2 = this.field_a;
          if (this.field_b == var2) {
            this.field_a = null;
            return null;
          } else {
            this.field_a = var2.field_f;
            return var2;
          }
        }
    }

    final boolean e(int param0) {
        int var2 = 113 / ((31 - param0) / 57);
        return this.field_b.field_f == this.field_b ? true : false;
    }

    final kd a(boolean param0) {
        kd var2 = null;
        var2 = this.field_b.field_f;
        if (param0) {
          if (this.field_b == var2) {
            this.field_a = null;
            return null;
          } else {
            this.field_a = var2.field_f;
            return var2;
          }
        } else {
          this.field_a = (kd) null;
          if (this.field_b == var2) {
            this.field_a = null;
            return null;
          } else {
            this.field_a = var2.field_f;
            return var2;
          }
        }
    }

    final int b(int param0) {
        int var2 = 0;
        kd var3 = null;
        int var4 = 0;
        var4 = Lexicominos.field_L ? 1 : 0;
        var2 = 0;
        var3 = this.field_b.field_f;
        if (param0 == 2) {
          L0: while (true) {
            L1: {
              if (var3 == this.field_b) {
                break L1;
              } else {
                var3 = var3.field_f;
                var2++;
                if (var4 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            return var2;
          }
        } else {
          return 80;
        }
    }

    public ng() {
        this.field_b = new kd();
        this.field_b.field_c = this.field_b;
        this.field_b.field_f = this.field_b;
    }

    static {
    }
}
