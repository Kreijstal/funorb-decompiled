/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fe extends bj {
    private sk field_mb;
    private int field_cb;
    static int field_ob;
    private int field_fb;
    static mh field_gb;
    static mf field_jb;
    static String field_ib;
    private oc field_eb;
    static og field_kb;
    private int field_db;
    private int field_bb;
    static int field_pb;
    static String field_hb;
    private mi field_nb;
    private int field_lb;

    void b(byte param0, oc param1) {
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
              this.field_eb = param1;
              if (dm.field_e != this.field_nb) {
                if (this.field_nb == bh.field_qb) {
                  break L1;
                } else {
                  this.field_nb = bh.field_qb;
                  this.field_fb = 0;
                  break L1;
                }
              } else {
                this.a((byte) -116, this.field_lb, this.field_db + (12 - -this.field_eb.field_s), this.field_eb.field_t + 12);
                this.field_fb = 0;
                break L1;
              }
            }
            if (param0 > 105) {
              break L0;
            } else {
              field_hb = (String) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("fe.C(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
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
          throw qb.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final void j(int param0) {
        if (this.field_nb == null) {
            super.j(param0);
            return;
        }
        if (this.field_nb != gq.field_Xb) {
            this.a(true, this.field_db + 12 + this.field_eb.field_s, 12 + this.field_eb.field_t);
            this.a((byte) 56, this.field_eb);
        } else {
            this.field_nb = null;
            this.field_mb.field_K = 256;
            super.j(param0);
            return;
        }
        this.field_nb = null;
        this.field_mb.field_K = 256;
        super.j(param0);
    }

    boolean h(int param0) {
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        boolean discarded$7 = false;
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        int var3 = 0;
        oc var4 = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        if (param0 == 0) {
          if (this.field_nb != null) {
            if (this.field_nb == bh.field_qb) {
              fieldTemp$5 = this.field_fb + 1;
              this.field_fb = this.field_fb + 1;
              if (fieldTemp$5 == this.field_cb) {
                this.field_nb = dm.field_e;
                this.a((byte) -116, this.field_lb, this.field_eb.field_s + (this.field_db + 12), 12 + this.field_eb.field_t);
                this.field_mb.field_K = 0;
                this.field_fb = 0;
                return super.h(0);
              } else {
                this.field_mb.field_K = 256 + -((this.field_fb << 1798345640) / this.field_cb);
                return super.h(0);
              }
            } else {
              if (this.field_nb == gq.field_Xb) {
                fieldTemp$6 = this.field_fb + 1;
                this.field_fb = this.field_fb + 1;
                if (this.field_bb != fieldTemp$6) {
                  this.field_mb.field_K = (this.field_fb << 127014824) / this.field_bb;
                  return super.h(0);
                } else {
                  this.field_nb = null;
                  this.field_mb.field_K = 256;
                  return super.h(0);
                }
              } else {
                return super.h(0);
              }
            }
          } else {
            return super.h(0);
          }
        } else {
          var4 = (oc) null;
          discarded$7 = this.a(-125, (byte) 123, (oc) null, 'ﾈ');
          if (this.field_nb != null) {
            if (this.field_nb == bh.field_qb) {
              fieldTemp$8 = this.field_fb + 1;
              this.field_fb = this.field_fb + 1;
              if (fieldTemp$8 == this.field_cb) {
                this.field_nb = dm.field_e;
                this.a((byte) -116, this.field_lb, this.field_eb.field_s + (this.field_db + 12), 12 + this.field_eb.field_t);
                this.field_mb.field_K = 0;
                this.field_fb = 0;
                return super.h(0);
              } else {
                this.field_mb.field_K = 256 + -((this.field_fb << 1798345640) / this.field_cb);
                return super.h(0);
              }
            } else {
              if (this.field_nb == gq.field_Xb) {
                fieldTemp$9 = this.field_fb + 1;
                this.field_fb = this.field_fb + 1;
                if (this.field_bb != fieldTemp$9) {
                  this.field_mb.field_K = (this.field_fb << 127014824) / this.field_bb;
                  return super.h(0);
                } else {
                  this.field_nb = null;
                  this.field_mb.field_K = 256;
                  return super.h(0);
                }
              } else {
                return super.h(0);
              }
            }
          } else {
            return super.h(0);
          }
        }
    }

    private final void a(byte param0, oc param1) {
        if (null != this.field_mb) {
            this.field_mb.b((byte) 111);
        }
        if (param1 == null) {
            this.field_mb = new sk();
        } else {
            param1.a(param1.field_s, 6, this.field_db + 6, (byte) -119, param1.field_t);
            this.field_mb = new sk(param1);
        }
        this.a(this.field_mb, true);
        if (param0 != 56) {
            return;
        }
        try {
            this.field_eb = null;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "fe.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void k(int param0) {
        if (!(this.field_nb != bh.field_qb)) {
            return;
        }
        this.field_fb = 0;
        this.field_nb = gq.field_Xb;
        this.a((byte) 56, this.field_eb);
        this.field_eb = null;
        this.field_mb.field_K = 0;
        if (param0 != -13717) {
            this.field_nb = (mi) null;
        }
    }

    boolean a(int param0, byte param1, oc param2, char param3) {
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              if (null != this.field_mb) {
                L1: {
                  if (98 == param0) {
                    discarded$4 = this.field_mb.a(true, param2);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if ((param0 ^ -1) != -100) {
                    break L2;
                  } else {
                    discarded$5 = this.field_mb.a(true, param2);
                    break L2;
                  }
                }
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
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
            stackOut_12_0 = (RuntimeException) (var5);
            stackOut_12_1 = new StringBuilder().append("fe.T(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    public static void l(int param0) {
        field_ib = null;
        field_hb = null;
        field_jb = null;
        field_kb = null;
        if (param0 <= 78) {
            return;
        }
        field_gb = null;
    }

    fe(cp param0, oc param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_t, 12 - -param2 - -param1.field_s);
        try {
            this.field_lb = param4;
            this.field_db = param2;
            this.field_bb = param3;
            this.field_cb = param3;
            this.a((byte) 56, param1);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "fe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(int param0) {
        if (param0 >= -22) {
          this.field_cb = -1;
          this.j(20);
          return super.a(-119);
        } else {
          this.j(20);
          return super.a(-119);
        }
    }

    static {
        field_ib = "This game option is not available in rated games.";
        field_hb = "Private";
    }
}
