/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class al extends ei {
    static java.awt.Frame field_W;
    private int field_X;
    private jl field_Z;
    private int field_ab;
    private gl field_Y;
    private int field_eb;
    private int field_db;
    private rj field_fb;
    private int field_cb;
    static int[] field_bb;

    final boolean i(int param0) {
        this.j(-2065096856);
        int var2 = -40 / ((param0 - -2) / 63);
        return super.i(61);
    }

    final static ci[] a(int param0, int param1, int param2, int param3, byte param4) {
        if (param4 != -123) {
          field_bb = (int[]) null;
          return oh.a(param2, 1, 1, 3, param1, 1, 1, param0, param3);
        } else {
          return oh.a(param2, 1, 1, 3, param1, 1, 1, param0, param3);
        }
    }

    private final void b(gl param0, byte param1) {
        if (param1 != -68) {
            return;
        }
        try {
            if (this.field_Z != null) {
                this.field_Z.b((byte) 12);
            }
            if (param0 == null) {
                this.field_Z = new jl();
            } else {
                param0.a(6 - -this.field_cb, (byte) 53, param0.field_p, 6, param0.field_n);
                this.field_Z = new jl(param0);
            }
            this.b((byte) 95, this.field_Z);
            this.field_Y = null;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "al.RA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void a(gl param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              this.field_Y = param0;
              if (param1 < -21) {
                break L1;
              } else {
                field_bb = (int[]) null;
                break L1;
              }
            }
            if (qb.field_h == this.field_fb) {
              this.a(this.field_eb, this.field_Y.field_p + 12, 12 + this.field_cb + this.field_Y.field_n, (byte) -80);
              this.field_ab = 0;
              return;
            } else {
              if (this.field_fb == hl.field_b) {
                break L0;
              } else {
                this.field_ab = 0;
                this.field_fb = hl.field_b;
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("al.O(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    final void g(byte param0) {
        if (hl.field_b == this.field_fb) {
          return;
        } else {
          this.field_fb = dc.field_n;
          if (param0 != 109) {
            this.field_ab = 3;
            this.field_ab = 0;
            this.b(this.field_Y, (byte) -68);
            this.field_Y = null;
            this.field_Z.field_J = 0;
            return;
          } else {
            this.field_ab = 0;
            this.b(this.field_Y, (byte) -68);
            this.field_Y = null;
            this.field_Z.field_J = 0;
            return;
          }
        }
    }

    al(d param0, gl param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_p, param1.field_n + (param2 + 12));
        try {
            this.field_cb = param2;
            this.field_db = param3;
            this.field_X = param3;
            this.field_eb = param4;
            this.b(param1, (byte) -68);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "al.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void j(int param0) {
        if (!(null == this.field_fb)) {
            if (!(this.field_fb == dc.field_n)) {
                this.b(98, this.field_cb + 12 - -this.field_Y.field_n, 12 - -this.field_Y.field_p);
                this.b(this.field_Y, (byte) -68);
            }
            this.field_fb = null;
            this.field_Z.field_J = 256;
        }
        super.j(param0);
    }

    public static void k(int param0) {
        if (param0 > -1) {
            field_bb = (int[]) null;
            field_bb = null;
            field_W = null;
            return;
        }
        field_bb = null;
        field_W = null;
    }

    boolean f(byte param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var3 = 0;
        var3 = Terraphoenix.field_V;
        if (null != this.field_fb) {
          if (hl.field_b != this.field_fb) {
            if (dc.field_n != this.field_fb) {
              if (param0 != -121) {
                this.field_db = -55;
                return super.f((byte) -121);
              } else {
                return super.f((byte) -121);
              }
            } else {
              fieldTemp$2 = this.field_ab + 1;
              this.field_ab = this.field_ab + 1;
              if (fieldTemp$2 == this.field_db) {
                this.field_fb = null;
                this.field_Z.field_J = 256;
                if (param0 != -121) {
                  this.field_db = -55;
                  return super.f((byte) -121);
                } else {
                  return super.f((byte) -121);
                }
              } else {
                this.field_Z.field_J = (this.field_ab << 1882844776) / this.field_db;
                if (param0 != -121) {
                  this.field_db = -55;
                  return super.f((byte) -121);
                } else {
                  return super.f((byte) -121);
                }
              }
            }
          } else {
            fieldTemp$3 = this.field_ab + 1;
            this.field_ab = this.field_ab + 1;
            if (fieldTemp$3 == this.field_X) {
              this.field_fb = qb.field_h;
              this.a(this.field_eb, 12 - -this.field_Y.field_p, 12 - (-this.field_cb - this.field_Y.field_n), (byte) -80);
              this.field_Z.field_J = 0;
              this.field_ab = 0;
              if (param0 != -121) {
                this.field_db = -55;
                return super.f((byte) -121);
              } else {
                return super.f((byte) -121);
              }
            } else {
              this.field_Z.field_J = -((this.field_ab << -526742744) / this.field_X) + 256;
              if (param0 == -121) {
                return super.f((byte) -121);
              } else {
                this.field_db = -55;
                return super.f((byte) -121);
              }
            }
          }
        } else {
          if (param0 == -121) {
            return super.f((byte) -121);
          } else {
            this.field_db = -55;
            return super.f((byte) -121);
          }
        }
    }

    boolean a(char param0, gl param1, int param2, int param3) {
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2 + 0, param3)) {
              L1: {
                if (null == this.field_Z) {
                  break L1;
                } else {
                  L2: {
                    if (98 != param3) {
                      break L2;
                    } else {
                      discarded$4 = this.field_Z.a((byte) 80, param1);
                      break L2;
                    }
                  }
                  if (99 == param3) {
                    discarded$5 = this.field_Z.a((byte) 73, param1);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              if (param2 == 30) {
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                decompiledRegionSelector0 = 1;
                break L0;
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
          L3: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var5);
            stackOut_14_1 = new StringBuilder().append("al.K(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            return stackIn_13_0 != 0;
          }
        }
    }

    static {
    }
}
