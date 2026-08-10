/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ie extends al {
    private int field_mb;
    private cf field_kb;
    private int field_rb;
    private int field_lb;
    static int field_nb;
    static String field_ib;
    private int field_gb;
    static long field_sb;
    static int[] field_ob;
    private lf field_pb;
    private int field_qb;
    static cj field_jb;
    private na field_hb;

    public static void l(int param0) {
        if (param0 != 7181) {
            return;
        }
        field_jb = null;
        field_ob = null;
        field_ib = null;
    }

    boolean i(int param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var3;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (this.field_pb != null) {
          if (ld.field_Rb != this.field_pb) {
            if (this.field_pb == lf.field_a) {
              fieldTemp$2 = this.field_lb + 1;
              this.field_lb = this.field_lb + 1;
              if (fieldTemp$2 != this.field_gb) {
                this.field_hb.field_E = (this.field_lb << -767149656) / this.field_gb;
                if (param0 != -27388) {
                  this.h(-5);
                  return super.i(-27388);
                } else {
                  return super.i(-27388);
                }
              } else {
                this.field_hb.field_E = 256;
                this.field_pb = null;
                if (param0 != -27388) {
                  this.h(-5);
                  return super.i(-27388);
                } else {
                  return super.i(-27388);
                }
              }
            } else {
              if (param0 != -27388) {
                this.h(-5);
                return super.i(-27388);
              } else {
                return super.i(-27388);
              }
            }
          } else {
            fieldTemp$3 = this.field_lb + 1;
            this.field_lb = this.field_lb + 1;
            if (fieldTemp$3 == this.field_qb) {
              this.field_pb = ll.field_j;
              this.a(this.field_mb, (byte) -112, this.field_rb + (12 - -this.field_kb.field_w), 12 - -this.field_kb.field_n);
              this.field_lb = 0;
              this.field_hb.field_E = 0;
              if (param0 == -27388) {
                return super.i(-27388);
              } else {
                this.h(-5);
                return super.i(-27388);
              }
            } else {
              this.field_hb.field_E = 256 + -((this.field_lb << 1296181800) / this.field_qb);
              if (param0 == -27388) {
                return super.i(-27388);
              } else {
                this.h(-5);
                return super.i(-27388);
              }
            }
          }
        } else {
          if (param0 != -27388) {
            this.h(-5);
            return super.i(-27388);
          } else {
            return super.i(-27388);
          }
        }
    }

    boolean a(int param0, char param1, cf param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (this.field_hb != null) {
                L1: {
                  if (98 != param0) {
                    break L1;
                  } else {
                    this.field_hb.a(param2, param3 + 6208);
                    break L1;
                  }
                }
                L2: {
                  if (param0 == 99) {
                    this.field_hb.a(param2, 0);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                stackIn_12_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5);

            stackIn_15_1 = new StringBuilder().append("ie.CA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    final static void a(boolean param0, boolean param1) {
        if (null == ki.field_e) {
          if (param1) {
            field_ob = (int[]) null;
            return;
          } else {
            return;
          }
        } else {
          oo.f(oo.field_f, oo.field_e, -oo.field_f + oo.field_g, oo.field_d - oo.field_e);
          ki.field_e.c(param0, -1);
          if (!param1) {
            return;
          } else {
            field_ob = (int[]) null;
            return;
          }
        }
    }

    final void j(byte param0) {
        if (param0 < -70) {
          if (ld.field_Rb == this.field_pb) {
            return;
          } else {
            this.field_pb = lf.field_a;
            this.field_lb = 0;
            this.a(this.field_kb, false);
            this.field_hb.field_E = 0;
            this.field_kb = null;
            return;
          }
        } else {
          field_ob = (int[]) null;
          if (ld.field_Rb == this.field_pb) {
            return;
          } else {
            this.field_pb = lf.field_a;
            this.field_lb = 0;
            this.a(this.field_kb, false);
            this.field_hb.field_E = 0;
            this.field_kb = null;
            return;
          }
        }
    }

    final boolean h(int param0) {
        this.h((byte) 30);
        if (param0 != -6134) {
            return false;
        }
        return super.h(-6134);
    }

    ie(vk param0, cf param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_n, 12 + (param2 - -param1.field_w));
        try {
            this.field_gb = param3;
            this.field_qb = param3;
            this.field_mb = param4;
            this.field_rb = param2;
            this.a(param1, false);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ie.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void h(byte param0) {
        if (this.field_pb != null) {
          if (this.field_pb == lf.field_a) {
            this.field_pb = null;
            this.field_hb.field_E = 256;
            super.h((byte) 63);
            if (param0 >= 29) {
              return;
            } else {
              this.h(-78);
              return;
            }
          } else {
            this.b(12 + this.field_kb.field_n, this.field_kb.field_w + (this.field_rb + 12), 78);
            this.a(this.field_kb, false);
            this.field_pb = null;
            this.field_hb.field_E = 256;
            super.h((byte) 63);
            if (param0 < 29) {
              this.h(-78);
              return;
            } else {
              return;
            }
          }
        } else {
          super.h((byte) 63);
          if (param0 >= 29) {
            return;
          } else {
            this.h(-78);
            return;
          }
        }
    }

    void a(cf param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_kb = param0;
            var3_int = -11 % ((param1 - 61) / 56);
            if (this.field_pb == ll.field_j) {
              this.a(this.field_mb, (byte) -112, 12 - -this.field_rb - -this.field_kb.field_w, this.field_kb.field_n + 12);
              this.field_lb = 0;
              return;
            } else {
              if (ld.field_Rb == this.field_pb) {
                break L0;
              } else {
                this.field_lb = 0;
                this.field_pb = ld.field_Rb;
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("ie.FA(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
    }

    private final void a(cf param0, boolean param1) {
        try {
            if (param1) {
                this.field_lb = -61;
            }
            if (null != this.field_hb) {
                this.field_hb.a(true);
            }
            if (param0 != null) {
                param0.b(6, 6 + this.field_rb, 28972, param0.field_n, param0.field_w);
                this.field_hb = new na(param0);
            } else {
                this.field_hb = new na();
            }
            this.b((byte) 95, this.field_hb);
            this.field_kb = null;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ie.BA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
    }
}
