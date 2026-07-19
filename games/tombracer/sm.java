/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sm extends nv implements ut {
    private int field_p;
    private int field_n;
    private boolean field_s;
    private jma field_q;
    private boolean field_t;
    static jea field_r;
    static String field_o;

    final void k(int param0) {
        L0: {
          if (this.field_q.f((byte) -56)) {
            this.c(false);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 5418) {
          this.b(-64, 64);
          this.field_t = this.r(param0 + -5416);
          this.field_q.a((byte) -14, this.field_t);
          return;
        } else {
          this.field_t = this.r(param0 + -5416);
          this.field_q.a((byte) -14, this.field_t);
          return;
        }
    }

    private final boolean r(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        hca var6 = null;
        hca var7 = null;
        hca var8 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        if (!this.field_s) {
          L0: {
            var8 = this.b(true).u(-98);
            stackOut_16_0 = this;
            stackIn_18_0 = stackOut_16_0;
            stackIn_17_0 = stackOut_16_0;
            if (-2 != (var8.u((byte) 127) ^ -1)) {
              stackOut_18_0 = this;
              stackOut_18_1 = 0;
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              break L0;
            } else {
              stackOut_17_0 = this;
              stackOut_17_1 = 1;
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              break L0;
            }
          }
          L1: {
            ((sm) (this)).field_n = stackIn_19_1;
            var3 = var8.d(3) - this.field_g.d(3);
            var4 = var8.e(param0 ^ 9650) + -this.field_g.e(9648);
            var5 = 262144;
            if (ua.a(var3, param0 ^ -122) > this.field_g.c(-120) / param0 + var8.c(-59) / 2 + var5) {
              break L1;
            } else {
              if (ua.a(var4, -121) > var5 + this.field_g.a((byte) 55) / 2 + var8.a((byte) 55) / 2) {
                break L1;
              } else {
                if (this.field_p <= this.field_n) {
                  if (this.field_s) {
                    var8.J(0);
                    return true;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              }
            }
          }
          this.field_n = 0;
          return false;
        } else {
          if (!this.field_t) {
            L2: {
              var7 = this.b(true).u(-98);
              var6 = var7;
              stackOut_3_0 = this;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (-2 != (var7.u((byte) 127) ^ -1)) {
                stackOut_5_0 = this;
                stackOut_5_1 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L2;
              } else {
                stackOut_4_0 = this;
                stackOut_4_1 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L2;
              }
            }
            ((sm) (this)).field_n = stackIn_6_1;
            var3 = var7.d(3) - this.field_g.d(3);
            var4 = var7.e(param0 ^ 9650) + -this.field_g.e(9648);
            var5 = 262144;
            if (ua.a(var3, param0 ^ -122) <= this.field_g.c(-120) / param0 + var7.c(-59) / 2 + var5) {
              if (ua.a(var4, -121) <= var5 + this.field_g.a((byte) 55) / 2 + var7.a((byte) 55) / 2) {
                if (this.field_p <= this.field_n) {
                  if (!this.field_s) {
                    return true;
                  } else {
                    var7.J(0);
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                this.field_n = 0;
                return false;
              }
            } else {
              this.field_n = 0;
              return false;
            }
          } else {
            return true;
          }
        }
    }

    final void a(boolean param0, fsa param1) {
        if (!param0) {
            return;
        }
        try {
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "sm.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final int j(byte param0) {
        if (param0 != -108) {
            this.field_p = 106;
            return this.field_n;
        }
        return this.field_n;
    }

    public static void l(int param0) {
        boolean discarded$0 = false;
        field_o = null;
        field_r = null;
        if (param0 != 11162931) {
            discarded$0 = sm.a(-113, -37, -83);
        }
    }

    public final int c(int param0) {
        int discarded$0 = 0;
        if (param0 != 17832) {
            discarded$0 = this.a(97, 98);
            return 7820595;
        }
        return 7820595;
    }

    public final jma k(byte param0) {
        if (param0 > -67) {
            return (jma) null;
        }
        return this.field_q;
    }

    final static boolean a(int param0, int param1, int param2) {
        boolean discarded$7 = false;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == 2) {
          if (!o.a(-1, param2, param1)) {
            if (vua.e(param1, param2, 13650)) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          discarded$7 = sm.a(52, -115, -20);
          if (o.a(-1, param2, param1)) {
            return true;
          } else {
            L0: {
              if (!vua.e(param1, param2, 13650)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    sm(la param0, boolean param1) {
        super(param0, param1);
        this.field_s = true;
        this.field_p = 1;
        try {
            this.field_q = new jma(15);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "sm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final int b(int param0) {
        int var2 = 44 / ((-46 - param0) / 45);
        return this.field_p;
    }

    final int a(int param0, int param1) {
        if (param1 >= -48) {
            return -8;
        }
        return this.field_q.a(77, param0);
    }

    final void b(int param0, int param1) {
        boolean discarded$0 = false;
        this.field_p = param1;
        if (param0 != 0) {
            discarded$0 = sm.a(8, -65, -15);
        }
    }

    final void g(int param0) {
        super.g(param0);
        this.field_q.a((byte) 48, this.h((byte) 109));
    }

    sm(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        RuntimeException runtimeException = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        this.field_s = true;
        this.field_p = 1;
        try {
          L0: {
            L1: {
              L2: {
                if (16 >= param0.field_E) {
                  break L2;
                } else {
                  this.field_p = 1;
                  if (!TombRacer.field_G) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.field_p = param1.b((byte) 44, 3);
              break L1;
            }
            L3: {
              this.field_q = new jma(15, param0, param1);
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (1 != param1.b((byte) 44, 1)) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L3;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L3;
              }
            }
            ((sm) (this)).field_s = stackIn_7_1 != 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (runtimeException);
            stackOut_9_1 = new StringBuilder().append("sm.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          L5: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ')');
        }
    }

    final int a(boolean param0) {
        int discarded$0 = 0;
        if (param0) {
            discarded$0 = this.b(82);
            return 32;
        }
        return 32;
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            this.field_q.a(this.h((byte) 111), (byte) 108, param1);
            param1.a((byte) -127, this.field_s ? 1 : 0, 1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "sm.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final int g(byte param0) {
        if (param0 != -108) {
            this.field_p = -8;
            return 11162931;
        }
        return 11162931;
    }

    static {
        field_o = "Back";
    }
}
