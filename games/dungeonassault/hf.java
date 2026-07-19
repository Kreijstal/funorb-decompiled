/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hf extends sj {
    static nh field_pb;
    private int field_jb;
    private lm field_xb;
    private int field_lb;
    static String field_ub;
    static md field_ob;
    static int field_sb;
    private int field_qb;
    private int field_tb;
    private sd field_rb;
    private fb field_kb;
    static ad field_wb;
    static ed field_nb;
    static eh field_ib;
    static cn field_Ab;
    private int field_vb;
    static int[] field_yb;
    static String field_zb;
    static pp field_mb;

    private final void b(lm param0, byte param1) {
        try {
            if (this.field_rb != null) {
                this.field_rb.a(false);
            }
            int var3_int = -47 / ((param1 - 32) / 42);
            if (param0 != null) {
                param0.b(0, param0.field_x, this.field_tb + 6, 6, param0.field_s);
                this.field_rb = new sd(param0);
            } else {
                this.field_rb = new sd();
            }
            this.b((byte) -57, (lm) (this.field_rb));
            this.field_xb = null;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "hf.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    hf(ji param0, lm param1, int param2, int param3, int param4) {
        super(param0, 12 - -param1.field_x, param1.field_s + (param2 + 12));
        try {
            this.field_qb = param3;
            this.field_jb = param3;
            this.field_tb = param2;
            this.field_vb = param4;
            this.b(param1, (byte) 98);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "hf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void i(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (null != in.field_C) {
          var1 = in.field_C;
          synchronized (var1) {
            L0: {
              in.field_C = null;
              break L0;
            }
          }
          L1: {
            if (param0 <= -5) {
              break L1;
            } else {
              field_ib = (eh) null;
              break L1;
            }
          }
          return;
        } else {
          L2: {
            if (param0 <= -5) {
              break L2;
            } else {
              field_ib = (eh) null;
              break L2;
            }
          }
          return;
        }
    }

    final boolean i(int param0) {
        this.h((byte) 99);
        if (param0 != 462) {
            return true;
        }
        return super.i(param0 ^ 0);
    }

    boolean a(lm param0, char param1, int param2, byte param3) {
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (param3 >= 55) {
                break L1;
              } else {
                this.field_rb = (sd) null;
                break L1;
              }
            }
            if (!super.a(param0, param1, param2, (byte) 124)) {
              L2: {
                if (this.field_rb == null) {
                  break L2;
                } else {
                  L3: {
                    if (98 != param2) {
                      break L3;
                    } else {
                      discarded$4 = this.field_rb.a(34, param0);
                      break L3;
                    }
                  }
                  if ((param2 ^ -1) == -100) {
                    discarded$5 = this.field_rb.a(34, param0);
                    break L2;
                  } else {
                    return false;
                  }
                }
              }
              stackOut_11_0 = 0;
              stackIn_12_0 = stackOut_11_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var5);
            stackOut_13_1 = new StringBuilder().append("hf.W(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    final void h(byte param0) {
        int var2 = -105 % ((22 - param0) / 35);
        if (!(this.field_kb == null)) {
            if (!(this.field_kb == lp.field_o)) {
                this.b(-30, this.field_xb.field_s + (12 - -this.field_tb), this.field_xb.field_x + 12);
                this.b(this.field_xb, (byte) -74);
            }
            this.field_rb.field_H = 256;
            this.field_kb = null;
        }
        super.h((byte) -89);
    }

    final void k(int param0) {
        if (!(hi.field_b != this.field_kb)) {
            return;
        }
        this.field_lb = 0;
        this.field_kb = lp.field_o;
        this.b(this.field_xb, (byte) 100);
        this.field_rb.field_H = param0;
        this.field_xb = null;
    }

    void b(int param0, lm param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              this.field_xb = param1;
              if (ec.field_i == this.field_kb) {
                this.b(12 - -this.field_xb.field_x, this.field_vb, this.field_xb.field_s + this.field_tb + 12, 22284);
                this.field_lb = 0;
                break L1;
              } else {
                if (hi.field_b != this.field_kb) {
                  this.field_kb = hi.field_b;
                  this.field_lb = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            if (param0 == 1) {
              break L0;
            } else {
              this.field_xb = (lm) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("hf.L(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    public static void m(int param0) {
        field_pb = null;
        field_Ab = null;
        field_zb = null;
        field_wb = null;
        field_mb = null;
        field_yb = null;
        field_nb = null;
        field_ub = null;
        field_ob = null;
        field_ib = null;
        if (param0 != 0) {
            field_Ab = (cn) null;
        }
    }

    boolean f(byte param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var3 = 0;
        var3 = DungeonAssault.field_K;
        if (this.field_kb != null) {
          if (this.field_kb == hi.field_b) {
            fieldTemp$2 = this.field_lb + 1;
            this.field_lb = this.field_lb + 1;
            if (fieldTemp$2 != this.field_jb) {
              this.field_rb.field_H = 256 + -((this.field_lb << 1377236968) / this.field_jb);
              if (param0 != -90) {
                return false;
              } else {
                return super.f((byte) -90);
              }
            } else {
              this.field_kb = ec.field_i;
              this.b(12 - -this.field_xb.field_x, this.field_vb, this.field_tb + 12 - -this.field_xb.field_s, param0 ^ -22358);
              this.field_lb = 0;
              this.field_rb.field_H = 0;
              if (param0 != -90) {
                return false;
              } else {
                return super.f((byte) -90);
              }
            }
          } else {
            if (lp.field_o == this.field_kb) {
              fieldTemp$3 = this.field_lb + 1;
              this.field_lb = this.field_lb + 1;
              if (fieldTemp$3 == this.field_qb) {
                this.field_kb = null;
                this.field_rb.field_H = 256;
                if (param0 != -90) {
                  return false;
                } else {
                  return super.f((byte) -90);
                }
              } else {
                this.field_rb.field_H = (this.field_lb << 203271624) / this.field_qb;
                if (param0 != -90) {
                  return false;
                } else {
                  return super.f((byte) -90);
                }
              }
            } else {
              if (param0 != -90) {
                return false;
              } else {
                return super.f((byte) -90);
              }
            }
          }
        } else {
          if (param0 != -90) {
            return false;
          } else {
            return super.f((byte) -90);
          }
        }
    }

    static {
        field_ub = "Username: ";
        field_ob = new md();
        field_zb = "Names should contain a maximum of 12 characters";
        field_yb = new int[16384];
        field_wb = new ad(13, 0, 1, 0);
    }
}
