/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sj extends ug {
    private int field_hb;
    static String field_kb;
    private rf field_ib;
    private int field_ob;
    private int field_mb;
    private me field_lb;
    static String field_pb;
    private int field_qb;
    static int[] field_rb;
    private fj field_nb;
    private int field_jb;

    boolean a(fj param0, byte param1, int param2, char param3) {
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            var5_int = 28 / ((47 - param1) / 43);
            if (!super.a(param0, (byte) 115, param2, param3)) {
              if (this.field_lb != null) {
                L1: {
                  if (param2 != 98) {
                    break L1;
                  } else {
                    discarded$4 = this.field_lb.a(param0, 418);
                    break L1;
                  }
                }
                L2: {
                  if (-100 != (param2 ^ -1)) {
                    break L2;
                  } else {
                    discarded$5 = this.field_lb.a(param0, 418);
                    break L2;
                  }
                }
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
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
          L3: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var5);
            stackOut_11_1 = new StringBuilder().append("sj.Q(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    private final void a(boolean param0, fj param1) {
        try {
            if (!(null == this.field_lb)) {
                this.field_lb.a(true);
            }
            if (!param0) {
                this.field_mb = 112;
            }
            if (param1 != null) {
                param1.a(-110, param1.field_F, 6 + this.field_ob, param1.field_z, 6);
                this.field_lb = new me(param1);
            } else {
                this.field_lb = new me();
            }
            this.b(this.field_lb, 10);
            this.field_nb = null;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "sj.HB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void m(int param0) {
        boolean discarded$2 = false;
        L0: {
          if (this.field_ib != null) {
            L1: {
              if (cl.field_S != this.field_ib) {
                this.a(-41, this.field_nb.field_z + this.field_ob + 12, this.field_nb.field_F + 12);
                this.a(true, this.field_nb);
                break L1;
              } else {
                break L1;
              }
            }
            this.field_lb.field_K = 256;
            this.field_ib = null;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 <= 53) {
          discarded$2 = this.j(-110);
          super.m(61);
          return;
        } else {
          super.m(61);
          return;
        }
    }

    sj(sh param0, fj param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_F, param1.field_z + 12 - -param2);
        try {
            this.field_hb = param4;
            this.field_ob = param2;
            this.field_qb = param3;
            this.field_jb = param3;
            this.a(true, param1);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "sj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    boolean l(int param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var3 = 0;
        var3 = Confined.field_J ? 1 : 0;
        if (null != this.field_ib) {
          if (this.field_ib != c.field_s) {
            if (this.field_ib == cl.field_S) {
              fieldTemp$2 = this.field_mb + 1;
              this.field_mb = this.field_mb + 1;
              if (this.field_qb != fieldTemp$2) {
                this.field_lb.field_K = (this.field_mb << -1238664152) / this.field_qb;
                if (param0 != -6) {
                  field_rb = (int[]) null;
                  return super.l(param0 ^ 0);
                } else {
                  return super.l(param0 ^ 0);
                }
              } else {
                this.field_lb.field_K = 256;
                this.field_ib = null;
                if (param0 != -6) {
                  field_rb = (int[]) null;
                  return super.l(param0 ^ 0);
                } else {
                  return super.l(param0 ^ 0);
                }
              }
            } else {
              if (param0 != -6) {
                field_rb = (int[]) null;
                return super.l(param0 ^ 0);
              } else {
                return super.l(param0 ^ 0);
              }
            }
          } else {
            fieldTemp$3 = this.field_mb + 1;
            this.field_mb = this.field_mb + 1;
            if (this.field_jb == fieldTemp$3) {
              this.field_ib = sc.field_a;
              this.a(this.field_nb.field_z + (this.field_ob + 12), this.field_hb, 6, this.field_nb.field_F + 12);
              this.field_lb.field_K = 0;
              this.field_mb = 0;
              if (param0 == -6) {
                return super.l(param0 ^ 0);
              } else {
                field_rb = (int[]) null;
                return super.l(param0 ^ 0);
              }
            } else {
              this.field_lb.field_K = -((this.field_mb << 1788545160) / this.field_jb) + 256;
              if (param0 == -6) {
                return super.l(param0 ^ 0);
              } else {
                field_rb = (int[]) null;
                return super.l(param0 ^ 0);
              }
            }
          }
        } else {
          if (param0 != -6) {
            field_rb = (int[]) null;
            return super.l(param0 ^ 0);
          } else {
            return super.l(param0 ^ 0);
          }
        }
    }

    public static void h(byte param0) {
        field_kb = null;
        field_pb = null;
        if (param0 <= 6) {
            sj.h((byte) -55);
            field_rb = null;
            return;
        }
        field_rb = null;
    }

    final void g(byte param0) {
        if (this.field_ib == c.field_s) {
          return;
        } else {
          this.field_ib = cl.field_S;
          this.field_mb = 0;
          this.a(true, this.field_nb);
          if (param0 > -6) {
            this.g((byte) -58);
            this.field_nb = null;
            this.field_lb.field_K = 0;
            return;
          } else {
            this.field_nb = null;
            this.field_lb.field_K = 0;
            return;
          }
        }
    }

    final boolean j(int param0) {
        if (param0 > -35) {
          field_rb = (int[]) null;
          this.m(107);
          return super.j(-97);
        } else {
          this.m(107);
          return super.j(-97);
        }
    }

    void a(fj param0, byte param1) {
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
              this.field_nb = param0;
              if (this.field_ib != sc.field_a) {
                if (this.field_ib == c.field_s) {
                  break L1;
                } else {
                  this.field_ib = c.field_s;
                  this.field_mb = 0;
                  break L1;
                }
              } else {
                this.a(12 - (-this.field_ob - this.field_nb.field_z), this.field_hb, 6, 12 + this.field_nb.field_F);
                this.field_mb = 0;
                break L1;
              }
            }
            if (param1 == -72) {
              break L0;
            } else {
              this.m(47);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("sj.HA(");
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
          throw sd.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    static {
        field_kb = "Logging in...";
        field_pb = "HARD";
    }
}
