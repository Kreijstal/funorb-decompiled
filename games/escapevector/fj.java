/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fj extends vg {
    static String field_kb;
    private md field_cb;
    static int field_jb;
    static String field_bb;
    private int field_ib;
    private int field_gb;
    private ka field_Z;
    private int field_ab;
    static ce field_eb;
    private int field_fb;
    private int field_db;
    private hm field_hb;

    void a(hm param0, int param1) {
        boolean discarded$2 = false;
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
              this.field_hb = param0;
              if (mc.field_c != this.field_Z) {
                if (this.field_Z != t.field_a) {
                  this.field_ab = 0;
                  this.field_Z = t.field_a;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                this.a(false, this.field_ib, 12 + this.field_hb.field_g, this.field_hb.field_x + this.field_fb + 12);
                this.field_ab = 0;
                break L1;
              }
            }
            if (param1 == 30) {
              break L0;
            } else {
              discarded$2 = this.a((byte) -72);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("fj.D(");
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
          throw t.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    fj(tb param0, hm param1, int param2, int param3, int param4) {
        super(param0, param1.field_g + 12, param1.field_x + (param2 + 12));
        try {
            this.field_ib = param4;
            this.field_db = param3;
            this.field_gb = param3;
            this.field_fb = param2;
            this.b((byte) -123, param1);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "fj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(byte param0) {
        int var2 = 50 / ((param0 - 7) / 55);
        this.b(false);
        return super.a((byte) 112);
    }

    public static void n(int param0) {
        field_kb = null;
        if (param0 != -11555) {
            fj.n(-20);
            field_bb = null;
            field_eb = null;
            return;
        }
        field_bb = null;
        field_eb = null;
    }

    final void b(boolean param0) {
        if (null != this.field_Z) {
          if (this.field_Z == ff.field_b) {
            this.field_Z = null;
            this.field_cb.field_F = 256;
            super.b(param0);
            return;
          } else {
            this.b(255, this.field_hb.field_x + 12 - -this.field_fb, 12 + this.field_hb.field_g);
            this.b((byte) -121, this.field_hb);
            this.field_Z = null;
            this.field_cb.field_F = 256;
            super.b(param0);
            return;
          }
        } else {
          super.b(param0);
          return;
        }
    }

    boolean j(int param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int var3 = 0;
        var3 = EscapeVector.field_A;
        if (param0 != -13907) {
          field_eb = (ce) null;
          if (null != this.field_Z) {
            if (this.field_Z == t.field_a) {
              fieldTemp$4 = this.field_ab + 1;
              this.field_ab = this.field_ab + 1;
              if (this.field_gb != fieldTemp$4) {
                this.field_cb.field_F = -((this.field_ab << -742266840) / this.field_gb) + 256;
                return super.j(-13907);
              } else {
                this.field_Z = mc.field_c;
                this.a(false, this.field_ib, 12 - -this.field_hb.field_g, 12 - (-this.field_fb - this.field_hb.field_x));
                this.field_ab = 0;
                this.field_cb.field_F = 0;
                return super.j(-13907);
              }
            } else {
              if (ff.field_b == this.field_Z) {
                fieldTemp$5 = this.field_ab + 1;
                this.field_ab = this.field_ab + 1;
                if (fieldTemp$5 == this.field_db) {
                  this.field_Z = null;
                  this.field_cb.field_F = 256;
                  return super.j(-13907);
                } else {
                  this.field_cb.field_F = (this.field_ab << -1454105944) / this.field_db;
                  return super.j(-13907);
                }
              } else {
                return super.j(-13907);
              }
            }
          } else {
            return super.j(-13907);
          }
        } else {
          if (null != this.field_Z) {
            if (this.field_Z == t.field_a) {
              fieldTemp$6 = this.field_ab + 1;
              this.field_ab = this.field_ab + 1;
              if (this.field_gb != fieldTemp$6) {
                this.field_cb.field_F = -((this.field_ab << -742266840) / this.field_gb) + 256;
                return super.j(-13907);
              } else {
                this.field_Z = mc.field_c;
                this.a(false, this.field_ib, 12 - -this.field_hb.field_g, 12 - (-this.field_fb - this.field_hb.field_x));
                this.field_ab = 0;
                this.field_cb.field_F = 0;
                return super.j(-13907);
              }
            } else {
              if (ff.field_b == this.field_Z) {
                fieldTemp$7 = this.field_ab + 1;
                this.field_ab = this.field_ab + 1;
                if (fieldTemp$7 == this.field_db) {
                  this.field_Z = null;
                  this.field_cb.field_F = 256;
                  return super.j(-13907);
                } else {
                  this.field_cb.field_F = (this.field_ab << -1454105944) / this.field_db;
                  return super.j(-13907);
                }
              } else {
                return super.j(-13907);
              }
            }
          } else {
            return super.j(-13907);
          }
        }
    }

    private final void b(byte param0, hm param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (this.field_cb != null) {
                this.field_cb.c((byte) -62);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 != null) {
                param1.a(param1.field_g, 6 - -this.field_fb, 6, true, param1.field_x);
                this.field_cb = new md(param1);
                break L2;
              } else {
                this.field_cb = new md();
                break L2;
              }
            }
            this.b(this.field_cb, false);
            this.field_hb = null;
            if (param0 <= -72) {
              break L0;
            } else {
              this.field_gb = 65;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3);
            stackOut_9_1 = new StringBuilder().append("fj.A(").append(param0).append(',');
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
          throw t.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    boolean a(hm param0, char param1, int param2, int param3) {
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, 43)) {
              L1: {
                if (param3 > 0) {
                  break L1;
                } else {
                  this.field_Z = (ka) null;
                  break L1;
                }
              }
              if (this.field_cb != null) {
                L2: {
                  if (98 == param2) {
                    discarded$4 = this.field_cb.a(-4659, param0);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (99 == param2) {
                    discarded$5 = this.field_cb.a(-4659, param0);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                stackOut_13_0 = 0;
                stackIn_14_0 = stackOut_13_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return false;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var5);
            stackOut_15_1 = new StringBuilder().append("fj.G(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_14_0 != 0;
        }
    }

    final void m(int param0) {
        if (!(t.field_a != this.field_Z)) {
            return;
        }
        this.field_Z = ff.field_b;
        this.field_ab = 0;
        this.b((byte) -115, this.field_hb);
        int var2 = 41 / ((45 - param0) / 53);
        this.field_hb = null;
        this.field_cb.field_F = 0;
    }

    static {
        field_kb = "Next";
        field_bb = "Checking";
        field_jb = 10;
    }
}
