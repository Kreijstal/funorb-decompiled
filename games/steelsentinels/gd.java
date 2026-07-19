/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gd extends ac {
    private ja field_xb;
    static fh field_kb;
    static String field_ob;
    private int field_rb;
    private int field_yb;
    static gh field_jb;
    static boolean field_ub;
    private ui field_nb;
    private int field_tb;
    private int field_vb;
    private int field_ib;
    static al field_qb;
    static gh field_sb;
    private lh field_pb;
    static int field_lb;
    static gh field_wb;
    static int field_mb;

    final static gh l(byte param0) {
        int var1 = 116 / ((param0 - -52) / 48);
        return vi.field_W.field_Wb;
    }

    boolean i(int param0) {
        int fieldTemp$38 = 0;
        int fieldTemp$39 = 0;
        int var3 = 0;
        L0: {
          var3 = SteelSentinels.field_G;
          if (param0 == -8350) {
            break L0;
          } else {
            field_ub = false;
            break L0;
          }
        }
        L1: {
          if (this.field_xb == null) {
            break L1;
          } else {
            if (this.field_xb != mj.field_Yb) {
              if (ob.field_t == this.field_xb) {
                fieldTemp$38 = this.field_vb + 1;
                this.field_vb = this.field_vb + 1;
                if (fieldTemp$38 == this.field_tb) {
                  this.field_nb.field_R = 256;
                  this.field_xb = null;
                  break L1;
                } else {
                  this.field_nb.field_R = (this.field_vb << -587425592) / this.field_tb;
                  break L1;
                }
              } else {
                break L1;
              }
            } else {
              fieldTemp$39 = this.field_vb + 1;
              this.field_vb = this.field_vb + 1;
              if (fieldTemp$39 != this.field_yb) {
                this.field_nb.field_R = -((this.field_vb << -1952145848) / this.field_yb) + 256;
                break L1;
              } else {
                this.field_xb = gi.field_q;
                this.a((byte) 103, 12 - (-this.field_rb - this.field_pb.field_E), this.field_pb.field_x + 12, this.field_ib);
                this.field_vb = 0;
                this.field_nb.field_R = 0;
                break L1;
              }
            }
          }
        }
        return super.i(-8350);
    }

    void c(lh param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
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
            if (param1 == -22908735) {
              L1: {
                this.field_pb = param0;
                if (gi.field_q == this.field_xb) {
                  this.a((byte) 103, this.field_pb.field_E + this.field_rb + 12, this.field_pb.field_x + 12, this.field_ib);
                  this.field_vb = 0;
                  break L1;
                } else {
                  if (mj.field_Yb == this.field_xb) {
                    break L1;
                  } else {
                    this.field_vb = 0;
                    this.field_xb = mj.field_Yb;
                    break L1;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("gd.NB(");
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
          throw ci.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void l(int param0) {
        gh discarded$0 = null;
        field_wb = null;
        if (param0 != -12930) {
            discarded$0 = gd.l((byte) 66);
        }
        field_ob = null;
        field_jb = null;
        field_qb = null;
        field_kb = null;
        field_sb = null;
    }

    final void j(byte param0) {
        if (this.field_xb == mj.field_Yb) {
            return;
        }
        this.field_vb = 0;
        this.field_xb = ob.field_t;
        this.c(-12243, this.field_pb);
        if (param0 < 6) {
            lh var3 = (lh) null;
            this.c(90, (lh) null);
        }
        this.field_nb.field_R = 0;
        this.field_pb = null;
    }

    final static int[] b(int param0, int param1, byte param2) {
        int var10 = 0;
        int var11 = 0;
        int var12 = SteelSentinels.field_G;
        int[] var13 = new int[256];
        int[] var3 = var13;
        int var4 = param0 >> 1763651056 & 255;
        int var5 = 255 & param0 >> 1479116424;
        int var6 = param0 & 255;
        int var7 = (param1 & 16749042) >> -133711184;
        if (param2 != -104) {
            field_ub = true;
        }
        int var8 = param1 >> 1407517416 & 255;
        int var9 = 255 & param1;
        for (var10 = 0; var10 < 256; var10++) {
            var11 = -var10 + 256;
            var13[var10] = (var10 * var6 >> -1333820088) + ((var9 * var11 >> -831977784) + ((var5 * var10 >> 1039446600) - -(var11 * var8 >> 725949320) << -1149393688) + ((var10 * var4 >> -84786232) + (var11 * var7 >> 753417128) << -1727847536));
        }
        return var3;
    }

    private final void c(int param0, lh param1) {
        try {
            if (!(this.field_nb == null)) {
                this.field_nb.b(4);
            }
            if (param0 != -12243) {
                this.field_rb = -45;
            }
            if (param1 == null) {
                this.field_nb = new ui();
            } else {
                param1.a(6, (byte) -86, 6 - -this.field_rb, param1.field_x, param1.field_E);
                this.field_nb = new ui(param1);
            }
            this.a(this.field_nb, -88);
            this.field_pb = null;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "gd.QB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean j(int param0) {
        this.i((byte) -79);
        if (param0 > -50) {
            return false;
        }
        return super.j(-56);
    }

    gd(ka param0, lh param1, int param2, int param3, int param4) {
        super(param0, 12 - -param1.field_x, param2 + (12 - -param1.field_E));
        try {
            this.field_rb = param2;
            this.field_ib = param4;
            this.field_tb = param3;
            this.field_yb = param3;
            this.c(-12243, param1);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "gd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    boolean a(int param0, int param1, char param2, lh param3) {
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        RuntimeException var5 = null;
        lh var6 = null;
        int stackIn_2_0 = 0;
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
            if (!super.a(param0 ^ 0, param1, param2, param3)) {
              L1: {
                if (this.field_nb != null) {
                  L2: {
                    if (param1 != 98) {
                      break L2;
                    } else {
                      discarded$4 = this.field_nb.a(1, param3);
                      break L2;
                    }
                  }
                  if ((param1 ^ -1) == -100) {
                    discarded$5 = this.field_nb.a(1, param3);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              L3: {
                if (param0 == 30373) {
                  break L3;
                } else {
                  var6 = (lh) null;
                  this.c((lh) null, -80);
                  break L3;
                }
              }
              stackOut_12_0 = 0;
              stackIn_13_0 = stackOut_12_0;
              decompiledRegionSelector0 = 1;
              break L0;
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
            stackOut_14_0 = (RuntimeException) (var5);
            stackOut_14_1 = new StringBuilder().append("gd.R(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_13_0 != 0;
        }
    }

    final void i(byte param0) {
        if (this.field_xb != null) {
            if (!(this.field_xb == ob.field_t)) {
                this.a((byte) -114, 12 - -this.field_pb.field_x, this.field_rb + (12 + this.field_pb.field_E));
                this.c(-12243, this.field_pb);
            }
            this.field_nb.field_R = 256;
            this.field_xb = null;
        }
        int var2 = 29 / ((55 - param0) / 39);
        super.i((byte) 101);
    }

    static {
        field_ob = "Report <%0> for abuse";
    }
}
