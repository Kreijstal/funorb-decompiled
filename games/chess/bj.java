/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bj extends k {
    private int field_fb;
    static rl field_cb;
    private int field_hb;
    static ci field_jb;
    private int field_qb;
    private mf field_ib;
    private ag field_lb;
    static String[] field_pb;
    private int field_nb;
    static km[] field_db;
    static ci field_ob;
    static rk[] field_bb;
    private int field_mb;
    static int field_gb;
    private lf field_kb;
    static ci field_eb;

    final void i(byte param0) {
        if (param0 >= -84) {
            field_jb = (ci) null;
            if (this.field_lb == null) {
                super.i((byte) -123);
                return;
            }
            if (this.field_lb != cf.field_Tb) {
                this.a(this.field_ib.field_y + 12, (byte) 71, this.field_ib.field_C + (12 + this.field_qb));
                this.b(this.field_ib, (byte) -94);
            } else {
                this.field_lb = null;
                this.field_kb.field_R = 256;
                super.i((byte) -123);
                return;
            }
            this.field_lb = null;
            this.field_kb.field_R = 256;
            super.i((byte) -123);
            return;
        }
        if (this.field_lb == null) {
            super.i((byte) -123);
            return;
        }
        if (this.field_lb != cf.field_Tb) {
            this.a(this.field_ib.field_y + 12, (byte) 71, this.field_ib.field_C + (12 + this.field_qb));
            this.b(this.field_ib, (byte) -94);
        } else {
            this.field_lb = null;
            this.field_kb.field_R = 256;
            super.i((byte) -123);
            return;
        }
        this.field_lb = null;
        this.field_kb.field_R = 256;
        super.i((byte) -123);
    }

    boolean g(byte param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var3;
        var3 = Chess.field_G;
        if (this.field_lb != null) {
          if (sg.field_f != this.field_lb) {
            if (cf.field_Tb != this.field_lb) {
              if (param0 >= -4) {
                field_bb = (rk[]) null;
                return super.g((byte) -52);
              } else {
                return super.g((byte) -52);
              }
            } else {
              fieldTemp$2 = this.field_fb + 1;
              this.field_fb = this.field_fb + 1;
              if (this.field_mb != fieldTemp$2) {
                this.field_kb.field_R = (this.field_fb << -1271048984) / this.field_mb;
                if (param0 >= -4) {
                  field_bb = (rk[]) null;
                  return super.g((byte) -52);
                } else {
                  return super.g((byte) -52);
                }
              } else {
                this.field_kb.field_R = 256;
                this.field_lb = null;
                if (param0 >= -4) {
                  field_bb = (rk[]) null;
                  return super.g((byte) -52);
                } else {
                  return super.g((byte) -52);
                }
              }
            }
          } else {
            fieldTemp$3 = this.field_fb + 1;
            this.field_fb = this.field_fb + 1;
            if (fieldTemp$3 != this.field_hb) {
              this.field_kb.field_R = 256 - (this.field_fb << -85817176) / this.field_hb;
              if (param0 >= -4) {
                field_bb = (rk[]) null;
                return super.g((byte) -52);
              } else {
                return super.g((byte) -52);
              }
            } else {
              this.field_lb = ga.field_b;
              this.b(this.field_nb, this.field_qb + 12 - -this.field_ib.field_C, -18807, this.field_ib.field_y + 12);
              this.field_kb.field_R = 0;
              this.field_fb = 0;
              if (param0 < -4) {
                return super.g((byte) -52);
              } else {
                field_bb = (rk[]) null;
                return super.g((byte) -52);
              }
            }
          }
        } else {
          if (param0 >= -4) {
            field_bb = (rk[]) null;
            return super.g((byte) -52);
          } else {
            return super.g((byte) -52);
          }
        }
    }

    bj(fm param0, mf param1, int param2, int param3, int param4) {
        super(param0, param1.field_y + 12, param1.field_C + (param2 + 12));
        try {
            this.field_qb = param2;
            this.field_mb = param3;
            this.field_hb = param3;
            this.field_nb = param4;
            this.b(param1, (byte) -119);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "bj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(int param0) {
        this.i((byte) -106);
        if (param0 < 46) {
            return true;
        }
        return super.a(119);
    }

    private final void b(mf param0, byte param1) {
        try {
            if (null != this.field_kb) {
                this.field_kb.c(-2193);
            }
            if (param0 != null) {
                param0.a(this.field_qb + 6, 34, param0.field_C, param0.field_y, 6);
                this.field_kb = new lf(param0);
            } else {
                this.field_kb = new lf();
            }
            this.b(this.field_kb, 95);
            if (param1 > -18) {
                this.i((byte) -62);
            }
            this.field_ib = null;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "bj.W(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void j(int param0) {
        if (param0 != 194) {
            return;
        }
        if (!(this.field_lb != sg.field_f)) {
            return;
        }
        this.field_fb = 0;
        this.field_lb = cf.field_Tb;
        this.b(this.field_ib, (byte) -27);
        this.field_kb.field_R = 0;
        this.field_ib = null;
    }

    boolean a(char param0, int param1, int param2, mf param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              if (this.field_kb != null) {
                L1: {
                  if (-99 != (param1 ^ -1)) {
                    break L1;
                  } else {
                    this.field_kb.a(param2 ^ -1, param3);
                    break L1;
                  }
                }
                L2: {
                  if ((param1 ^ -1) != -100) {
                    break L2;
                  } else {
                    this.field_kb.a(0, param3);
                    break L2;
                  }
                }
                stackIn_10_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return false;
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("bj.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    final static int c(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Chess.field_G;
        try {
          L0: {
            if (param1 == -12076) {
              var3_int = 1;
              L1: while (true) {
                if (param0 <= 1) {
                  if (1 == param0) {
                    stackIn_12_0 = var3_int * param2;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    return var3_int;
                  }
                } else {
                  L2: {
                    if ((1 & param0) == 0) {
                      break L2;
                    } else {
                      var3_int = var3_int * param2;
                      break L2;
                    }
                  }
                  param0 = param0 >> 1;
                  param2 = param2 * param2;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = -33;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var3), "bj.R(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_12_0;
        }
    }

    public static void k(int param0) {
        if (param0 <= 35) {
          return;
        } else {
          field_eb = null;
          field_cb = null;
          field_db = null;
          field_pb = null;
          field_ob = null;
          field_bb = null;
          field_jb = null;
          return;
        }
    }

    final static void a(na param0, boolean param1) {
        if (!param1) {
            return;
        }
        try {
            ef.field_n.a((o) (new tn(param0, param0)), (byte) -57);
            h.field_s.a(param0);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "bj.S(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void c(mf param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_ib = param0;
            if (param1 > 45) {
              if (this.field_lb == ga.field_b) {
                this.b(this.field_nb, this.field_ib.field_C + this.field_qb + 12, -18807, this.field_ib.field_y + 12);
                this.field_fb = 0;
                return;
              } else {
                if (this.field_lb == sg.field_f) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  this.field_lb = sg.field_f;
                  this.field_fb = 0;
                  return;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("bj.T(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L1;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L1;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_cb = new rl();
    }
}
