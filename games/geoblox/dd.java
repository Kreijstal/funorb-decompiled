/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dd extends ee {
    private ng field_K;
    boolean field_I;
    static nc field_G;
    static int field_D;
    static rh field_J;
    private int field_H;
    static int field_C;
    static String field_F;
    static String[] field_E;

    final static boolean a(byte param0) {
        if (param0 != 47) {
            field_J = (rh) null;
            return cg.b(true);
        }
        return cg.b(true);
    }

    final void c(int param0, int param1, int param2) {
        if (param1 <= 95) {
          field_G = (nc) null;
          this.a(param0, param2, (byte) -87, -param0 + fa.field_i >> 1769189185, kb.field_b - param2 >> 1470837729);
          return;
        } else {
          this.a(param0, param2, (byte) -87, -param0 + fa.field_i >> 1769189185, kb.field_b - param2 >> 1470837729);
          return;
        }
    }

    private final int g(int param0) {
        int var2 = 80 % ((-11 - param0) / 46);
        return !this.field_I ? 0 : this.field_K.j(81) != this ? 0 : 256;
    }

    abstract void b(int param0, int param1, int param2);

    boolean f(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_10_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var2 = this.g(-75);
          var3 = -this.field_H + var2;
          if ((var3 ^ -1) < param0) {
            this.field_H = this.field_H + (var3 + 8 + -1) / 8;
            break L0;
          } else {
            break L0;
          }
        }
        if (-1 >= (var3 ^ -1)) {
          if (this.field_H == 0) {
            if (0 != var2) {
              return false;
            } else {
              L1: {
                if (this.field_I) {
                  stackOut_18_0 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  break L1;
                } else {
                  stackOut_17_0 = 1;
                  stackIn_19_0 = stackOut_17_0;
                  break L1;
                }
              }
              return stackIn_19_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          this.field_H = this.field_H + (-16 + (var3 + 1)) / 16;
          if (this.field_H == 0) {
            if (0 != var2) {
              return false;
            } else {
              L2: {
                if (this.field_I) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L2;
                }
              }
              return stackIn_10_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    dd(ng param0, int param1, int param2) {
        super(kb.field_b - param1 >> -1982522751, -param2 + fa.field_i >> 1166494081, param1, param2, (dh) null);
        try {
            this.field_K = param0;
            this.field_H = 0;
            this.field_I = false;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "dd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean a(String param0, String param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        try {
          L0: {
            if (ak.a(param0, (byte) -67)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (ra.a(18725, param0)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!em.a(param0, param2 + 25409)) {
                  if (param1.length() != 0) {
                    if (!ak.a(param0, param1, -75)) {
                      L1: {
                        if (param2 == -25321) {
                          break L1;
                        } else {
                          dd.i(31);
                          break L1;
                        }
                      }
                      if (uk.a(8, param1, param0)) {
                        stackOut_21_0 = 0;
                        stackIn_22_0 = stackOut_21_0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (wc.a(param0, param1, (byte) -107)) {
                          stackOut_25_0 = 0;
                          stackIn_26_0 = stackOut_25_0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          return true;
                        }
                      }
                    } else {
                      stackOut_15_0 = 0;
                      stackIn_16_0 = stackOut_15_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackOut_12_0 = 1;
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) (var3);
            stackOut_27_1 = new StringBuilder().append("dd.MB(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L2;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L2;
            }
          }
          L3: {
            stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L3;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_16_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_22_0 != 0;
                  } else {
                    return stackIn_26_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    boolean h(int param0) {
        this.field_H = this.g(param0 + -297);
        if (param0 == 229) {
          if (0 == this.field_H) {
            if (this.field_I) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    public static void i(int param0) {
        boolean discarded$2 = false;
        if (param0 != 256) {
          discarded$2 = dd.a((byte) -87);
          field_J = null;
          field_F = null;
          field_G = null;
          field_E = null;
          return;
        } else {
          field_J = null;
          field_F = null;
          field_G = null;
          field_E = null;
          return;
        }
    }

    final el f(byte param0) {
        el var2 = super.f((byte) -62);
        if (param0 > -60) {
            this.field_I = false;
            if (!(var2 == null)) {
                return var2;
            }
            return (el) (this);
        }
        if (!(var2 == null)) {
            return var2;
        }
        return (el) (this);
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        if (this.field_H != 0) {
          if (256 > this.field_H) {
            if (oi.field_b != null) {
              if (oi.field_b.field_r >= this.field_r) {
                if (oi.field_b.field_m >= this.field_h) {
                  var5 = 111 / ((1 - param2) / 43);
                  Geoblox.a(1, oi.field_b);
                  vb.c();
                  this.b(0, 20, 0);
                  super.a(-param0 - this.field_v, -param1 - this.field_m, (byte) 104, param3);
                  id.a(true);
                  oi.field_b.d(param0 + this.field_v, this.field_m + param1, this.field_H);
                  return;
                } else {
                  oi.field_b = new dm(this.field_r, this.field_h);
                  var5 = 111 / ((1 - param2) / 43);
                  Geoblox.a(1, oi.field_b);
                  vb.c();
                  this.b(0, 20, 0);
                  super.a(-param0 - this.field_v, -param1 - this.field_m, (byte) 104, param3);
                  id.a(true);
                  oi.field_b.d(param0 + this.field_v, this.field_m + param1, this.field_H);
                  return;
                }
              } else {
                oi.field_b = new dm(this.field_r, this.field_h);
                var5 = 111 / ((1 - param2) / 43);
                Geoblox.a(1, oi.field_b);
                vb.c();
                this.b(0, 20, 0);
                super.a(-param0 - this.field_v, -param1 - this.field_m, (byte) 104, param3);
                id.a(true);
                oi.field_b.d(param0 + this.field_v, this.field_m + param1, this.field_H);
                return;
              }
            } else {
              oi.field_b = new dm(this.field_r, this.field_h);
              var5 = 111 / ((1 - param2) / 43);
              Geoblox.a(1, oi.field_b);
              vb.c();
              this.b(0, 20, 0);
              super.a(-param0 - this.field_v, -param1 - this.field_m, (byte) 104, param3);
              id.a(true);
              oi.field_b.d(param0 + this.field_v, this.field_m + param1, this.field_H);
              return;
            }
          } else {
            if (param3 != 0) {
              return;
            } else {
              this.b(this.field_v + param0, 20, param1 + this.field_m);
              super.a(param0, param1, (byte) -52, param3);
              return;
            }
          }
        } else {
          return;
        }
    }

    static {
        field_D = 0;
        field_F = "Loading music";
    }
}
